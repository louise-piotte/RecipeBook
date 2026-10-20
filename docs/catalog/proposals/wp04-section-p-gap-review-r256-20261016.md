# WP04 Section P — smoked sardine fillets product-boundary review (R256)

- **Review / source-access date:** 2026-10-16.
- **Candidate:** Marketed smoked sardine fillets, including Brunswick Golden Smoked and other separately named Canadian products.
- **Recommendation:** Add identity-only `smoked sardine fillets / filets de sardines fumés` as `ingredient-ref-smoked-sardine-fillets`, category `PROTEIN`. Retain only the product-specific search aliases `golden smoked sardine fillets` and `filets de sardines fumés dorés`.
- **Scope:** A species-neutral finished-food market group for shelf-stable, smoked fish fillets sold under sardine wording. It does not identify a fish taxon, standardize a smoking process, or cover all smoked sardines. Non-fillet-labelled, oil-packed products and the unresolved Brunswick Kippered product remain outside this row.
- **Status:** Integrated on 2026-10-16. The identity and source-specific observations are in the shared seed package and ledger; the generated catalog index is current. No app tests or emulator checks were run because this adds database JSON data and its generated index under `AGENTS.md`.
- **Proposal-local source IDs:** `WP04-SECTIONP-SMOKED-SARDINE-FILLETS-R256-20261016-S01` through `S08`; audit ID `WP04-SECTIONP-SMOKED-SARDINE-FILLETS-R256-20261016-R01`. They are now allocated in the integrated record.

## Why this is an open boundary

The [Section P sardine checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L5810) added species-qualified European pilchard and Pacific sardine references while leaving unqualified and prepared sardine products unresolved. Section P separately calls for review of smoked, salted, dried, canned, oil-packed, water-packed, and fermented fish/seafood products ([preservation checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L12150)). R170 subsequently added the broader finished-food group `canned sardines / sardines en conserve`, but expressly left product-specific smoke, cut, packing, and drained state attached to the product that documents them ([R170 proposal](wp04-section-p-canned-sardine-product-boundary-review-r170-20261016.md)).

R165 held one different Brunswick product, `Kippered Sardine Fillets / Filets de sardines kipper`, because the maker provides no species or smoking process and a retailer feed conflicts on fish identity ([R165 review](wp04-section-p-next-seafood-review-r165-20261016.md)). R165 did not decide the separately marketed Golden Smoked product or the wider smoked-fillet product group reviewed here. This proposal does not reopen that hold.

## Candidate name and product scope

Proposed display names:

- **EN:** `smoked sardine fillets`
- **fr-CA:** `filets de sardines fumés`
- **EN alias:** `golden smoked sardine fillets`
- **fr-CA alias:** `filets de sardines fumés dorés`

The display wording is directly supported by current bilingual Quebec retailer wording and by separate Canadian products from Brunswick and Wild Canadian Seafood. Brunswick's product page calls its item **Sardine Fillets Seafood Snacks Golden Smoked** and says that it is smoked over a natural wood fire. Metro Québec uses **Golden Smoked Sardine Fillets / Filets de sardines fumés dorés** for the matching UPC. A separate Wild Canadian Seafood product is sold as **Smoked Canadian Sardines / Sardines Canadiennes fumées** and lists smoked sardine fillets in its ingredients. Bar Harbor's Canadian distributor catalogue also lists **Skinless, Boneless Smoked Sardine Fillets / Filets de sardines sans peau, sans arêtes fumées**. These sources support a market product group rather than a single Brunswick-only identity. [S01–S06]

Keep the scope at the named prepared-food level. The cited products vary in skin/bone presentation, ingredient declarations, and package size. Brunswick describes wood-fire smoking; Wild Canadian Seafood lists natural hardwood smoke; these supplier statements do not establish a universal process definition for every product sold under the group. Record product-specific observations only. Do not infer one taxon, a standardized smoke method, a common packing medium, or a shared recipe behavior. [S01–S06]

This is separate from the broader `canned sardines / sardines en conserve` row: the new row gives users an exact search result for the separately marketed smoked-fillet product, and it is not a smoke form attached to the raw species rows or a redefinition of all canned sardines. Keep the generic canned row unchanged.

## Species, terminology, and adjacent products

No species should be assigned. OQLF's Québec `sardine` entry identifies *Sardina pilchardus*, while Brunswick's FAQ says North Atlantic herring (*Clupea harengus*) is used in Brunswick canned products. The latter is manufacturer-level context, not SKU-specific taxonomic identification, and the market wording on a package does not resolve that discrepancy. CFIA's Fish List and common-name guidance associate species common names with taxa; this app catalog proposal is not a Canadian legal-label determination. Reuse the existing OQLF and CFIA source records identified below; do not add `herring`, `hareng`, a scientific name, or any species alias to the proposed row. [Reused `WP04-SECTIONP-CANNED-SARDINES-R170-20261016-S01`; reused `WP04-SARDINE-FISH-BOUNDARY-20261011-S01`, `S02`, `S07`, and `S09`]

Do not broaden the row to non-fillet-labelled smoked sardines. Nice Cans currently sells a French-labeled product **Sardines fumées à l'huile d'olive biologique et au sel de mer** whose ingredient list says `sardines`, without specifying a fillet cut. That source demonstrates that broad `smoked sardines / sardines fumées` wording can include an oil-packed product with no stated fillet presentation. Accordingly, those broad phrases are not aliases. The current picker also has a separate Brunswick Kippered Sardine hold: its page lists natural smoke flavouring, but does not establish that the product is smoked by a process or settle its species. Keep `kipper`, `kippered`, and smoke-flavour wording off this identity. [S07; reused `WP04-SECTIONP-KIPPER-R154-20261015-S04`]

Exclude raw/fresh sardines, European pilchard, Pacific sardine, herring species, herring kippers, smoked whole fish, oil-packed smoked sardines not marketed as fillets, sardine paste/spread, fish oil, and composite dishes. Do not add aliases for `smoked sardines`, `sardines fumées`, `sardine`, `sardines en conserve`, `canned sardines`, `herring`, or `hareng`; the broader canned-sardine row and qualified fish rows retain their existing names and scopes.

## Exact-key and source-ownership audit

At review time the read-only snapshot contained **1,648 ingredient references**, **125 forms**, **61 legacy candidates**, and **1,996 research-ledger records** (8,722 source entries / 7,391 distinct source IDs / 6,160 distinct URLs). The manifest lists **114 recipes and 1,123 ingredient rows**.

Exact normalized-name checks followed [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) and covered active reference names/aliases, form labels/match terms, legacy names/aliases/IDs, relevant ledger identity IDs, and the proposal/batch archive. There is no exact owner for the proposed display names, the two proposed aliases, `smoked sardine fillets`, `filets de sardines fumés`, or `ingredient-ref-smoked-sardine-fillets`. No relevant form or legacy identity exists. The source-ID prefix and new product-page URLs below are also absent from the current ledger. The only nearby prior mention is R165's explicit exclusion of smoked sardines from its substitution comparison; it did not allocate this product identity.

| Existing identity / candidate | Current owner and boundary | Disposition |
|---|---|---|
| `ingredient-ref-canned-sardines` — canned sardines / sardines en conserve | Active species-neutral canned-market group, no aliases or forms. | Keep unchanged. The proposed row is a narrower smoked-fillet product group, not a form or alias on this broad row. |
| `ingredient-ref-european-pilchard`; `ingredient-ref-pacific-sardine` | Active species rows with qualified bilingual displays. | Keep the proposed market product separate; infer no species. |
| `ingredient-ref-atlantic-herring`; `ingredient-ref-pacific-herring`; active smoked-herring and herring-in-sauce products | Existing herring identities and prepared-food groups. | Add no `herring`/`hareng` alias and do not cross-map the sardine-market wording. |
| Brunswick Kippered sardine product, R165 | Proposal-only hold; species and smoking process remain unresolved. | Leave held and outside the proposed smoke-fillets identity. |
| `WP04-SECTIONP-SMOKED-SARDINE-FILLETS-R256-20261016-S01`–`S08`, audit `…-R01` | No exact source-ID collision in the current ledger or inspected archive. | Keep proposal-local until integration. |

The Brunswick, Metro, ACEMA, La Moisson, Nice Cans, and Canadian distributor URLs in S01–S08 had no exact URL owner at review time. The OQLF, CFIA, and Brunswick FAQ source IDs already existed in the shared ledger and were reused there. The Brunswick Kippered product ID came from the R154 proposal-only source register and was registered here to preserve the specific comparison source.

## Picker projection

The projection follows the current phrase-first picker over bilingual names, aliases, and attached forms. The integrated row has the two display names and two narrowly scoped aliases listed above; it has no forms. Search normalization removes accents but preserves spelling and grammatical endings, so the masculine `fumés` in `filets de sardines fumés` does not match the feminine `fumées` in the broader Nice Cans wording `sardines fumées`.

| Query | Current results | With proposed row | Projection note |
|---|---|---|---|
| `smoked sardine fillets`; `filets de sardines fumés` | None | Proposed row only | Exact English and fr-CA product queries. |
| `golden smoked sardine fillets`; `filets de sardines fumés dorés` | None | Proposed row only | Exact manufacturer/Québec retailer product wording, retained as scoped aliases. |
| `sardine` | European pilchard; Pacific sardine | Those two plus proposed row | The English display includes singular `sardine`; broad singular search gains a third result. |
| `sardines` | Canned sardines; European pilchard; Pacific sardine | Those three plus proposed row | The French display includes plural `sardines`; broad search remains multi-result. |
| `smoked sardines`; `sardines fumées` | None | Proposed row only for `sardines fumées` | The proposed French display `filets de sardines fumés` contains the complete word phrase `sardines fumées`, so phrase-first search would return the fillet-only row for the broader query. The Nice Cans product shows that broader wording can describe a product without a stated fillet cut. This makes the proposed bilingual row unsafe to integrate as named. |
| `canned sardines`; `sardines en conserve` | Canned sardines only | Unchanged | The proposed row has no canned/conserve alias. |
| `Atlantic herring`; `hareng de l’Atlantique`; `sardine européenne`; `sardine du Pacifique` | Their current qualified identities | Unchanged | Species and herring searches remain on current owners. |

No form hint is introduced. In particular, the row does not create a generic `smoked`, `filleted`, `canned`, or drained form under a species or under the canned-sardines group.

## Bundled-recipe demand

The manifest-ordered audit parsed all **114 recipe files** and **1,123 ingredient rows**. A case-insensitive scan for `sardine`, `sardines`, `pilchard`, `herring`, `hareng`, the proposed English/French names, and the Brunswick golden-smoked phrases found **no matching recipe files or ingredient rows**. The bundled library has no direct recipe demand, amount, method, or link supporting this identity. The manufacturer has product recipes, but those are external product-specific material and do not supply bundled-library demand or reusable measurements. [R01]

## Forms, measurements, and substitutions

- **Forms:** Add none. The proposal is itself a narrowly scoped finished-food identity; no reusable form for the raw species or generic canned-sardines row is established.
- **Measurements:** Set `defaultDensity` to `null` and `unitMappings` to `[]`. Brunswick gives a nutrition basis of one drained can (80 g); Metro lists a 92 g package for the same UPC; Wild Canadian Seafood lists a separate 180 g product. Keep these as product- and source-specific observations only. Do not infer a common can size, drained yield, household measure, density, count mapping, conversion, or edible yield. The retailer ingredient panel also differs from Brunswick's manufacturer panel, so record no universal composition claim. [S01–S05]
- **Substitutions:** Add no global or contextual rule, replacement amount, warning, or recipe-line link. The bundled corpus has no recipe context, and the sources establish product names and package details rather than cooking equivalence. Do not assume equivalence with canned sardines, whole smoked sardines, any sardine species, Atlantic herring, or Kippered sardines.

## Hypothetical reference delta

```json
{
  "id": "ingredient-ref-smoked-sardine-fillets",
  "nameEn": "smoked sardine fillets",
  "nameFr": "filets de sardines fumés",
  "aliasesEn": ["golden smoked sardine fillets"],
  "aliasesFr": ["filets de sardines fumés dorés"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z",
  "category": "PROTEIN"
}
```

The integrated ledger row uses `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. S01–S08 are allocated to this record; reused source IDs retain their existing ownership, while the R154 Brunswick Kippered source ID is registered here for the first time from its earlier proposal-only source entry. Add no form, legacy mapping, active measure, conversion, yield, recipe link, species assignment, or substitution.

## Source register

New sources were accessed on 2026-10-16. S01–S08 are registered in the new ledger row; R01 remains a proposal-local audit record. Existing OQLF, CFIA, and Brunswick FAQ source IDs are reused with their original URLs.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-SMOKED-SARDINE-FILLETS-R256-20261016-S01** | Brunswick Canada, [Sardine Fillets Seafood Snacks Golden Smoked](https://brunswickcanada.ca/products/sardine-fillets-seafood-snacks-golden-smoked/). | Manufacturer calls the item golden smoked sardine fillets, says it is smoked over a natural wood fire, lists naturally smoked sardine fillets and water, and gives one drained can (80 g) as its nutrition basis. No scientific species is given. |
| **WP04-SECTIONP-SMOKED-SARDINE-FILLETS-R256-20261016-S02** | Brunswick Canada, [Filets de sardines bouchées de la mer Brunswick fumés dorés](https://brunswickcanada.ca/fr/products/filets-de-sardines-bouchees-de-la-mer-brunswick-fumes-dores/). | Current French manufacturer wording and smoking/80 g nutrition statements. Supports the fr-CA market phrase; no taxon or reusable can conversion is assigned. |
| **WP04-SECTIONP-SMOKED-SARDINE-FILLETS-R256-20261016-S03** | Metro Québec (English), [Golden Smoked Sardine Fillets](https://www.metro.ca/en/online-grocery/aisles/pantry/canned-jarred/fish-seafood/golden-smoked-sardine-fillets/p/066613185084), product `066613185084`. | Current indexed product page gives the bilingual market item and 92 g package size. It lists salt and sodium phosphate in addition to fish and water; this retailer panel differs from the manufacturer page and is not treated as a universal formula. Direct retrieval returned 403 during this review. |
| **WP04-SECTIONP-SMOKED-SARDINE-FILLETS-R256-20261016-S04** | Metro Québec (French), [Filets de sardines fumés dorés](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/poissons-et-fruits-de-mer/filets-de-sardines-fumes-dores/p/066613185084), same product number. | Current indexed French listing gives the exact alias, 92 g package size, and a retailer ingredient panel. Direct retrieval returned 403 during this review; the indexed listing is SKU-specific, not a general measure or formula. |
| **WP04-SECTIONP-SMOKED-SARDINE-FILLETS-R256-20261016-S05** | ACEMA, Longueuil, [Sardines canadiennes fumées — Wild Canadian Seafood](https://www.acema.ca/fr/produits/pm-4197). | Current supplier page names smoked Canadian sardines and lists smoked sardine fillets, salt, and natural hardwood smoke; it reports a 180 g format and UPC `626111200117`. This is another branded product and source-specific package/formula evidence, not a universal measurement or species claim. |
| **WP04-SECTIONP-SMOKED-SARDINE-FILLETS-R256-20261016-S06** | La Moisson, [Prêt-à-manger product collection](https://lamoisson.com/collections/pret-a-manger-prepared-foods). | Current Québec retailer listing offers `Sardines Canadiennes fumées` from Wild Canadian Seafood Co. Supports Québec market availability and wording at review time, not continuing stock or species identity. |
| **WP04-SECTIONP-SMOKED-SARDINE-FILLETS-R256-20261016-S07** | Nice Cans, [Sardines fumées à l'huile d'olive biologique et au sel de mer](https://justnicecans.com/fr/products/smoked-sardines-in-organic-olive-oil-and-sea-salt). | Current Québec-facing French product listing gives smoked sardines packed in olive oil and an ingredient list without a fillet-cut description. Used to bound the candidate and omit generic `sardines fumées` from aliases; it does not establish this product as whole fish. |
| **WP04-SECTIONP-SMOKED-SARDINE-FILLETS-R256-20261016-S08** | Husky Foods, [Bar Harbor 2024 product catalogue](https://huskyfoods.com/wp-content/uploads/2025/02/Husky-Food-Catalogue-2024.pdf). | Canadian distributor catalogue lists `Skinless, Boneless Smoked Sardine Fillets` and `Filets de sardines sans peau, sans arêtes fumées` as a Bar Harbor product. Supports an independent bilingual product label, not current stock, species, or common package behavior. |
| **Reused `WP04-SECTIONP-CANNED-SARDINES-R170-20261016-S01`** | Brunswick Canada, [Frequently Asked Questions](https://brunswickcanada.ca/faq/). | Manufacturer FAQ says North Atlantic herring (*Clupea harengus*) is used in Brunswick canned products. This is brand-level context only and does not assign this product to a species. |
| **Reused `WP04-SARDINE-FISH-BOUNDARY-20261011-S01`** | OQLF, [sardine (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198919/sardine). | The entry pairs `sardine` with *Sardina pilchardus*. Reuse only to preserve the species/product distinction; it does not define this finished-food group. |
| **Reused `WP04-SARDINE-FISH-BOUNDARY-20261011-S02` and `…-S07`** | CFIA, [Fish List](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) and [common-name guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names). | CFIA guidance associates accepted fish common names with species and directs users to the Fish List. Reuse for taxonomy/label-boundary context only. |
| **Reused `WP04-SARDINE-FISH-BOUNDARY-20261011-S09`** | CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish). | Reuse to state that this catalog display is not legal-label authorization. |
| **Reused `WP04-SECTIONP-KIPPER-R154-20261015-S04`** | Brunswick Canada, [Sardine Fillets Seafood Snacks — Kippered](https://brunswickcanada.ca/products/sardine-fillets-seafood-snacks-kippered/). | The separate Kippered page lists natural smoke flavouring but no scientific species or verified smoking process. This existing R154 source supports leaving the R165 hold outside the proposed natural-smoked-fillet row. |
| **WP04-SECTIONP-SMOKED-SARDINE-FILLETS-R256-20261016-R01** | [Section P plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L5810), [R165 review](wp04-section-p-next-seafood-review-r165-20261016.md), [R170 proposal](wp04-section-p-canned-sardine-product-boundary-review-r170-20261016.md), current [references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy identities](../legacy-import-identities.v1.json), [ledger](../research-ledger.v1.json), [substitution files](../../../app/src/main/assets/seed/bundled-library/substitution-rules.v1.json), [contextual substitution file](../../../app/src/main/assets/seed/bundled-library/contextual-substitution-rules.v1.json), [package yields](../../../app/src/main/assets/seed/bundled-library/package-yields.v1.json), [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), all manifest recipes, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Read-only identity/source ownership, picker, corpus, form, measurement, substitution, and package-yield audit at the snapshot counts above. |

## Unresolved follow-up

The Brunswick manufacturer and Metro Québec retailer ingredient panels differ, and the same UPC has a retailer-listed 92 g package while the manufacturer reports an 80 g drained nutrition basis. If this row is integrated, retain each statement only with its source and verify a current package before recording a shared ingredient list or any package/drained relationship. Do not assign a species based on Brunswick's general FAQ or on the word `sardine` in market names. Revisit the broad `smoked sardines / sardines fumées` query only if a separately scoped non-fillet product group or a recipe request supplies a clear need. The current manifest contains no matching recipe demand.

## Root integration review

A focused static projection verified the French boundary. Accent normalization preserves the final `e`, so `filets de sardines fumés` does not contain the same normalized word phrase as `sardines fumées`. The exact qualified English and French product queries return the new row; the broader `smoked sardines` and `sardines fumées` queries remain unassigned. Broad `sardine` and `sardines` queries remain multi-result and include the new row alongside the existing species and canned-product choices.

The row and source-specific package observations were integrated; the generated catalog index was refreshed. The [R256 integration README](../batches/wp04-section-p-smoked-sardine-fillets-integration-r256-20261016/README.md) records current counts and static checks.

## Final disposition

**Add** `ingredient-ref-smoked-sardine-fillets` as the identity-only finished-food group `smoked sardine fillets / filets de sardines fumés`, with only the golden-smoked, fillet-qualified bilingual aliases. Keep species, universal smoke process, shared ingredients, package/drained relationships, forms, conversions, yields, recipes, and substitutions unspecified. Preserve the existing canned-sardine and fish-species identities and the R165 Kippered hold.
