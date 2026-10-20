# WP04 Section P — canned tuna product-boundary review (R168)

- **Review / source-access date:** 2026-10-16.
- **Recommendation:** Integrate identity-only `canned tuna / thon en conserve` as `ingredient-ref-canned-tuna`, category `PROTEIN`, with no aliases or forms.
- **Scope:** The commercially named canned-tuna product group. This is a prepared-product identity, not a tuna species, a form on the raw `tuna / thon` row, a legal common-name authorization, or a specific product's cut, species, packing medium, seasoning, or drained state.
- **Status:** Proposal-only. No shared catalog JSON, ledger, legacy identities, recipe, plan, roadmap, batch README, generated file, or code was changed. No tests or builds were run.
- **Proposal-local source IDs:** `WP04-SECTIONP-CANNED-TUNA-R168-20261016-S01` through `S06`; audit ID `WP04-SECTIONP-CANNED-TUNA-R168-20261016-R01`. These remain unallocated pending review.

## Why this is a distinct open gap

The [Section P preservation checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L5905) leaves canned fish product states open. The [broad preserved-fish review](wp04-section-p-preserved-fish-product-state-boundary-review-20261012.md) correctly says not to place `canned tuna / thon en conserve` on raw `tuna / thon` as an alias or form. It did not allocate a separate canned-tuna product identity. The [tuna-steak boundary review](wp04-tuna-steak-recipe-boundary-review-20261011.md) likewise keeps canned tuna distinct from the bundled raw/unspecified tuna steak. Neither review tests a separate product-group row against the current picker.

The archive contains no focused canned-tuna identity decision, hold, or row. The R165 kippered-sardine, R166 Matjes, and R167 smoked-mackerel decisions concern different products and remain unchanged. This proposal retains the previous no-alias/no-form decision and evaluates one separate product identity using current Québec market naming and Canadian manufacturer evidence.

The product group is commercially concrete in Québec and Canada. MAPAQ's 2025 large-store retail report lists `Thon en conserve` as a distinct sales category with reported sales of 78 587 791 $. Clover Leaf's current English and French manufacturer catalogs list canned tuna under **Tuna / Thon** and separate products by species, cut, and medium. Current Québec Metro listings likewise show several labeled canned-tuna products. The evidence supports a market-product identity, while the live species and package differences rule out assigning it to one tuna species or inventing shared numeric behavior. [S01–S06; reused sources below]

## Product, species, and state boundary

The proposed row is an ingredient-search identity for the product category marketed as canned tuna. It keeps canned products distinct from the existing raw/unspecified tuna identity and the named tuna species. It does not claim that every can has the same fish species, colour class, cut, packing medium, seasoning, or drained amount.

The current Clover Leaf catalogs show albacore, yellowfin, and skipjack lines; solid/whole, chunk, and flaked products; and water, broth/oil, and olive-oil presentations. Its French catalog also includes one tuna pouch. Exclude the pouch because it is not canned. Do not make `white tuna / thon blanc` a general alias: OQLF says `thon blanc` may label canned products made from albacore (*Thunnus alalunga*), and the Québec public-health page distinguishes that class from canned `thon pâle` products. Do not map `light tuna / thon pâle` to a single species from retail wording. [S01–S02; reused `WP04-SECTIONP-ALBACORE-TUNA-R112-20261014-S03` and `WP04-MUSKELLUNGE-IDENTITY-20261012-S05`]

The internal catalog row is not a replacement for the species/common-name declarations required on commercial fish labels. CFIA guidance ties acceptable fish common names to species-specific Fish List entries. The proposed display is a user-facing product-group identity, and it must not be read as approval to label a single-species package only `canned tuna`. [Reused `WP04-SALMON-TUNA-BOUNDARY-20261011-S01`]

Keep product variants such as whole/chunk/flaked, white/light, skipjack/yellowfin/albacore, in water, in oil, in broth and oil, no-drain, reduced-sodium, and seasoned products on their own package or product records when a recipe asks for one. Do not attach a global `canned` form to the species rows or this row. Exclude tuna salad, ready meals, and pouches from this identity.

## Exact-key and source-ownership audit

The live read-only snapshot contains **1,543 ingredient references**, **119 forms**, **61 legacy candidates**, and **1,887 ledger records** with **8,066 source entries / 6,902 distinct source IDs / 5,698 distinct URLs**. The manifest lists **114 recipe files and 1,123 ingredient rows**.

Normalized ownership checks mirrored `normalizeIngredientSearchKey` in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase with `Locale.ROOT`, NFKD fold, fold `œ` / `æ` / `ß` and `&`, remove combining marks, convert other punctuation runs to spaces, then collapse whitespace. Checks covered reference IDs and bilingual names/aliases, form IDs/labels/match terms, legacy candidate IDs and bilingual text, every ledger record string, and the proposal/archive source IDs and URLs.

| Candidate phrase or key | Current exact owner | Disposition |
|---|---|---|
| `canned tuna`; `canned light tuna`; `tinned tuna`; `tuna in a can`; `canned tuna in water`; `canned tuna in oil`; `thon en conserve`; `thon en boîte`; `thon en canne`; `thon pâle en conserve`; `thon blanc en conserve` | No exact active reference, form, legacy candidate, or ledger text owns these product phrases. | The canned-tuna product key is unallocated. Do not add the variant/medium phrases as aliases.
| `ingredient-ref-canned-tuna`; `candidate-canned-tuna` | No exact active reference, form, legacy candidate ID, or ledger record ID. | New reference ID remains proposal-local. No legacy ID or candidate is proposed.
| `067800000401`; `061362433011`; `059749933957` | No exact active reference, form, legacy candidate, or ledger owner. | These are seller item identifiers for the cited examples, not ingredient identities.
| `ingredient-ref-tuna` | Active generic `tuna / thon`, `PROTEIN`, with no aliases, forms, density, or unit mappings. Recipe `111#1` links `1 tuna steak` to this row. | Keep the generic identity and recipe link unchanged; do not add canned terms to it.
| `ingredient-ref-albacore-tuna`; `ingredient-ref-katsuwonus-pelamis`; `ingredient-ref-yellowfin-tuna`; the Atlantic, Pacific, and Southern bluefin tuna rows; `ingredient-ref-euthynnus-lineatus` | Active species-scoped references with qualified bilingual names; none has an attached form, density, or unit mapping. | Keep all species rows unchanged. Do not infer one of these taxa for the product group.
| `WP04-SECTIONP-CANNED-TUNA-R168-20261016-S01`–`S06`; audit `…-R01` | No exact source-ID collision in the active ledger or inspected proposal/batch archive. | New source labels are proposal-local and unallocated.

The new product-reference ID, new source IDs, and URLs in S01–S06 have no exact owner in the live catalog/ledger or inspected archive. Reused evidence is explicitly identified with its existing source ID below. In particular, the Clover Leaf canned-skipjack detail page remains owned by `WP04-SECTIONP-EUTHYNNUS-LINEATUS-PAIR-20261014-R2-S07`; OQLF's `germon` page remains owned by `WP04-SECTIONP-ALBACORE-TUNA-R112-20261014-S03`; and the Ocean's French portfolio remains cited under the prior proposal-only `WP04-PFSTATE-20261012-S04`. No source URL or source ID is newly allocated for those reused pages.

## Picker projection

The projection follows phrase-first search over reference bilingual names, aliases, and attached forms in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The proposed row has only the two display names `canned tuna / thon en conserve`, empty aliases, and no form.

| Query | Current result | With proposed row | Consequence |
|---|---|---|---|
| `canned tuna` | No result | Canned tuna / thon en conserve | Exact English product query becomes searchable.
| `thon en conserve` | No result | Canned tuna / thon en conserve | Exact Québec French product query becomes searchable.
| `tuna` | Eight rows: generic tuna, albacore, Atlantic bluefin, Pacific bluefin, Southern bluefin, yellowfin, skipjack, and black skipjack tuna | Those eight plus canned tuna | Still a multiple-choice query; the product does not take over the generic or species matches.
| `thon` | The same eight generic/species rows | Those eight plus canned tuna | Still a multiple-choice query; raw/species and canned-product identities remain visible.
| `canned`; `en conserve` | Eight existing references each | Same results plus canned tuna | Both broad preservation queries remain multi-result.
| `light tuna`; `white tuna`; `thon pâle`; `thon blanc` | No exact phrase result | No exact phrase result | Do not imply all canned tuna uses one colour class or species name.
| `canned tuna in water`; `tuna in olive oil`; `thon pâle entier dans l’huile` | No exact result | No exact result | No packing-medium, cut, or no-drain alias/form is added.

No form hint is produced for the proposed identity. Exact searches for the canned product become available without routing canned wording through a species row or assigning a single taxon to multi-species market products.

## Manifest recipe demand

The manifest-ordered read-only audit parsed all **114 recipe files** and all **1,123 structured ingredient rows**, then scanned every decoded JSON string and each row value. Terms included `canned tuna`, canned/tinned/light/albacore/skipjack variants, `tuna in water/oil`, `canned fish`, `thon en conserve`, `thon en boîte`, `thon pâle en conserve`, `thon blanc en conserve`, and broad `tuna / thon`. There were **zero canned-tuna matches**, no matching product-state ingredient rows, and no recipe link or method that requests canned tuna. The only broad tuna/thon ingredient row is `111#1`, `1 tuna steak`, linked to `ingredient-ref-tuna`; it does not name a can or preserved product. [R01]

## Forms, numeric data, conversions, and substitutions

- **Forms and mappings:** The 119 active forms contain no tuna or canned-tuna form, and no form is attached to any active tuna identity. The generic tuna reference and tuna species rows have `defaultDensity: null` and `unitMappings: []`. Add no form to any raw species or to the proposed product identity.
- **Package and serving quantities:** MAPAQ's sales values support a Québec product category only; they are not kitchen measures. The reviewed Metro pages list a 99 g Unico item, a 142 g Clover Leaf yellowfin item, and an 85 g Selection item. These are package-specific net amounts, not drained weights, servings, piece weights, density observations, or reusable package conversions. Clover Leaf's skipjack page gives a label nutrition basis of **one-half can drained (55 g)**; that is a single manufacturer's nutrition serving, not a default recipe quantity or a generic can yield. [S04–S06; reused `WP04-SECTIONP-EUTHYNNUS-LINEATUS-PAIR-20261014-R2-S07`]
- **Existing tuna measurements:** The generic `ingredient-ref-tuna` ledger has one external raw-steak observation (`WP04-TUNA-COUNT-20261010-S01`): two steaks are described as about 280–320 g each. This is a source-specific steak interval and cannot be transferred to canned tuna. Other tuna ledger portions are scoped to their recorded species/food state. Add no measurement, density, unit mapping, drained yield, or package conversion.
- **Conversions and yields:** No tuna-related unit conversion exists. The reviewed sources do not establish a common can size, drained mass, packing-liquid uptake, draining yield, or cooked yield across products. Add none.
- **Substitutions:** The global and contextual substitution-rule files contain zero tuna rules. The recipe corpus supplies no dish/method scope. No source supports a directed replacement between canned and raw tuna, tuna species, other canned fish, seasoned tuna, tuna salad, or a pouch product. Add no rule, warning, amount, or recipe-line substitution link.

## Proposed delta

Add one identity-only `PROTEIN` reference:

```json
{
  "id": "ingredient-ref-canned-tuna",
  "nameFr": "thon en conserve",
  "nameEn": "canned tuna",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z",
  "category": "PROTEIN"
}
```

If accepted, add one verified ledger record for `ingredient-ref-canned-tuna` with measurement state `researched_no_supported_value`, substitution state `researched_no_supported_substitute`, the new S01–S06 sources, and the reused species/naming sources where needed. Keep the record limited to the canned-tuna market group. Add no form, alias, species assignment, legacy identity, recipe link, conversion, serving measure, drained yield, or substitution. Keep all new source IDs proposal-local until integration.

## Source register

New sources were accessed on 2026-10-16. New IDs are proposal-local. Reused sources keep their existing owner and are not reallocated.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-CANNED-TUNA-R168-20261016-S01** | Clover Leaf, [Tuna product catalog](https://www.cloverleaf.ca/en/product/tuna/). | Current Canadian manufacturer's English catalog groups 11 tuna products and labels the family as canned tuna. It distinguishes albacore, yellowfin, and skipjack; whole/chunk/flaked; water and broth/oil. One listed item is a pouch and is outside this proposal. Manufacturer catalog, not a universal formulation or measure.
| **WP04-SECTIONP-CANNED-TUNA-R168-20261016-S02** | Clover Leaf, [Thon product catalog](https://www.cloverleaf.ca/fr/produit/thon/). | Current Canadian French catalog lists 11 products under `Thon`, including thon blanc/germon, thon pâle/listao, yellowfin, whole/chunk/flaked, water and broth/oil variants. One item is a pouch and is excluded. Supports French market wording and product diversity, not a common species or packing rule.
| **WP04-SECTIONP-CANNED-TUNA-R168-20261016-S03** | MAPAQ, [Ventes au détail de produits alimentaires dans les grands magasins au Québec en 2025](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/industrie-bioalimentaire/statistiques/RA_ventes-detail-produits-alimentaires_MAPAQ.pdf). | The live PDF's printed page 14 (PDF page index 13) lists `Thon en conserve` as a separate Québec grocery category with 78 587 791 $ in reported 2025 sales. This supports a distinct market category, not product formula, serving size, or taxon.
| **WP04-SECTIONP-CANNED-TUNA-R168-20261016-S04** | Metro, [Unico thon pâle entier](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/poissons-et-fruits-de-mer/thon-pale-entier/p/067800000401), item `067800000401`. | Québec retailer listing shows a 99 g canned product and declares skipjack tuna with oil and salt. Seller/item-specific wording and net package quantity only; it does not support a universal species, medium, or conversion.
| **WP04-SECTIONP-CANNED-TUNA-R168-20261016-S05** | Metro, [Clover Leaf thon pâle à nageoires jaunes en morceaux dans l'eau](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/poissons-et-fruits-de-mer/thon-pale-a-nageoires-jaunes-en-morceaux-dans-l-eau/p/061362433011), item `061362433011`. | Québec retailer listing shows a 142 g yellowfin-chunk product with water and salt. SKU-specific package size, cut, and fish declaration; do not generalize to canned tuna as a whole.
| **WP04-SECTIONP-CANNED-TUNA-R168-20261016-S06** | Metro, [Selection thon pâle entier dans l'huile d'olive](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/poissons-et-fruits-de-mer/thon-pale-entier-dans-l-huile-d-olive/p/059749933957), item `059749933957`. | Québec retailer listing shows an 85 g whole-light-tuna product in olive oil. The package amount and medium are product-specific; the page is not a general availability statement or a conversion source.
| **Reused `WP04-PFSTATE-20261012-S04`** | Ocean's, [Produits](https://oceans.ca/fr/produits/). | Previously reviewed current French-Canadian catalog separates pale/white, whole/flaked, water/oil, and no-drain product lines. Reused for product-variant scope; no new source URL owner is created.
| **Reused `WP04-SECTIONP-EUTHYNNUS-LINEATUS-PAIR-20261014-R2-S07`** | Clover Leaf, [Thon pâle émietté, Listao dans l'eau](https://www.cloverleaf.ca/fr/produits/thon-pale-emiette-clover-leaf-listao-dans-leau/). | Existing source on the skipjack species record identifies *Katsuwonus pelamis* and gives the product's half-can drained 55 g nutrition basis. Reused only for the product-specific numeric limit.
| **Reused `WP04-MUSKELLUNGE-IDENTITY-20261012-S05`** | Gouvernement du Québec, [Recommandations — consommation de poisson et santé](https://www.quebec.ca/sante/alimentation/saines-habitudes-alimentaires/consommation-de-poisson-et-sante/recommandations). | Existing source; current page distinguishes canned `thon blanc (germon)` from canned `thon pâle` classes. Reused for naming/process boundaries only, not serving or safety advice in the catalog.
| **Reused `WP04-SECTIONP-ALBACORE-TUNA-R112-20261014-S03`** | OQLF, [germon (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198922/germon). | Existing source on the albacore record; limits canned `thon blanc` wording to products made from *Thunnus alalunga*. Do not add `thon blanc` as a broad alias.
| **Reused `WP04-SALMON-TUNA-BOUNDARY-20261011-S01`** | CFIA, [Guidance on determining the common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names). | Existing source on tuna-scope ledger records; Canadian species common-name and Fish List guidance. The proposed app-level product identity is not a fish-labeling authorization.
| **WP04-SECTIONP-CANNED-TUNA-R168-20261016-R01** | [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L5905), recent R165–R167 proposals, prior preserved-fish and tuna reviews, active [references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy identities](../legacy-import-identities.v1.json), [ledger](../research-ledger.v1.json), substitution and unit-conversion data, [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), every manifest-listed recipe file, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Read-only exact-key and source-ID/URL ownership, picker projection, recipe corpus, form/numeric/substitution, and archive audit at the snapshot counts above.

## Final disposition

**Integrate** `ingredient-ref-canned-tuna` as the identity-only market product group `canned tuna / thon en conserve`. Keep it separate from raw/unspecified tuna and all tuna species; do not map species, cut, medium, seasoning, package size, drained state, or readiness to this row. Add no aliases, forms, measures, conversions, yields, recipe links, or substitutions. The source-backed product category creates an exact picker choice while broad `tuna / thon` searches remain multiple-choice.
