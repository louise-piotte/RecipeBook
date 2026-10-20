# WP03 Section F — Grape-Nuts cereal candidate review

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** The hold was accepted and reconciled on 2026-10-12; see the [integration record](../batches/wp03-grape-nuts-picker-boundary-hold-integration-20261012/README.md). Active catalog allocation remains held.
- **Open checklist:** the current Section F list still has the “grits, polenta, pearled hominy, pozole corn, dried sweet corn, and remaining puffed-grain candidates” item open at [plan line 2011](../../RecipeBook-global-ingredient-catalog-plan.txt#L2104), and the regional cereal-mix/preprocessed-grain item open at [line 2080](../../RecipeBook-global-ingredient-catalog-plan.txt#L2173), repeated in later continuations such as [line 9016](../../RecipeBook-global-ingredient-catalog-plan.txt#L9297). Red River and Sunny Boy now have separate completed identity decisions. This review covers only the original Post Grape-Nuts ready-to-eat cereal as a named processed-cereal candidate.
- **Candidate freshness:** repository-wide case-insensitive search found no prior Grape-Nuts review, batch, plan/roadmap decision, exact reference/form/legacy owner, or research-ledger record. The specific candidate has no reserved ID. Grape-Nuts Flakes is a separate product and is excluded.

## Recommendation

**Hold `Grape-Nuts cereal / céréales Grape-Nuts` out of the active catalog.** Canadian and Québec sources attest the named cereal and French-language wording, but the current Post Consumer Brands Canada brand directory does not list it, the manufacturer’s current product page is explicitly for a U.S. audience, and the bundled recipes have no demand. More importantly, the live picker matches complete word phrases anywhere within a name or alias. An active `Grape-Nuts` identity would therefore appear for broad `grape` and `nuts` queries even though the cereal contains neither grapes nor nuts. The existing picker cannot keep the branded phrase searchable while excluding those broad queries.

This is an unallocated Section F processed-cereal candidate, not a recommendation to create a generic cereal, grape, or nut identity. The evidence supports the product boundary and a possible provisional French display; it does not establish present Québec retail availability or enough library demand to justify the predictable picker overlap.

If a later recipe or import requires it and picker behavior can avoid the broad-term false positives, the narrowly scoped possible identity would be:

| Field | Possible future value |
|---|---|
| ID | `ingredient-ref-grape-nuts-cereal` (unallocated; do not reserve from this proposal) |
| English display | `Grape-Nuts cereal` |
| French display | `céréales Grape-Nuts` (provisional Canadian/Québec usage, not an OQLF-preferred compound) |
| Aliases | None proposed |
| Category | `GRAIN_AND_CEREAL` |
| Active forms, measurements, mappings, yields, recipe links, substitutions | None |

Do not add `Post Grape-Nuts`, `Grape-Nuts Flakes`, `grape nuts`, `Grape-Nuts cereal flakes`, or any bare `grape`, `nuts`, or `cereal` alias. The possible row describes the Original wheat-and-barley nugget cereal only.

## Product and terminology boundary

Post’s current Original product page calls the item **Grape-Nuts Cereal** and describes baked whole-grain wheat and barley cereal pieces. Its listed base ingredients are whole-grain wheat flour, malted barley flour, salt, and dried yeast, with vitamins and minerals declared separately. The brand name does not describe grapes or nuts as ingredients; Post’s brand-history page says the cereal contains neither. The separate Grape-Nuts Flakes product is not an alias or form of the Original cereal. The older Québec food-education source also lists Grape-Nuts and Grape-Nuts Flakes separately, describing the former with whole wheat and barley and the latter with wheat and barley flakes.

Canadian and French-language evidence includes Health Canada’s French 2008 food table entry `Grape-Nuts, Post`, a Québec Santécom guide that uses `Grape-nuts (blé entier et orge)`, a Québec French recipe page using `céréales Grape-Nuts`, and a Canadian manufacturer ingredient declaration indexed as `Céréales grape-nuts`. The Santécom guide’s author/date were not established in this review, and the current Canadian Post brand directory omits Grape-Nuts. These sources support preserving the brand name in French contexts; they do not show that the product is currently sold by Québec grocery retailers or establish a terminology-authority ruling.

Keep the candidate distinct from:

- grapes, grape juice, grape-seed oil, and verjuice;
- generic nuts, pine nuts, pili nuts, macadamia nuts, and makhana seeds;
- `Grape-Nuts Flakes`, which the manufacturer lists as a separate product;
- bran flakes, shredded wheat, generic wheat/barley flakes, granola, muesli, and other ready-to-eat cereals;
- the active Red River and Sunny Boy branded cereal identities.

## Live snapshot and exact ownership audit

Read-only snapshot of the current working tree on 2026-10-12. Hashes are SHA-256 of the exact file bytes.

| File or corpus | Current count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,277 references; 123 in `GRAIN_AND_CEREAL` | `35f1b3b98527b87d15648c9722af9a968e4b160e2b19714d8de66612bbd8d076` |
| `ingredient-forms.v1.json` | 94 forms | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `manifest.v1.json` | 114 manifest-listed recipe files | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `docs/catalog/legacy-import-identities.v1.json` | 65 legacy candidates | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| `docs/catalog/research-ledger.v1.json` | 1,585 records; 5,630 source entries / 4,661 distinct source IDs; 8 unit conversions | `d75f02fafc1cfd015d10148a9e15c5862b438d190e4c3e8fa0cbc41313ceec97` |
| Bundled recipe corpus | 114 files / 1,123 ingredient rows | `42e3a13c9b9a1630c85296b4dd65b57b7b849bb07171a02d238d3524944ae70a`* |

*The corpus digest is a deterministic audit fingerprint: for each manifest-ordered recipe, concatenate the UTF-8 relative path, a NUL byte, and its raw file bytes, then SHA-256 the concatenation. It is not a package-format hash.

The exact normalized-key audit covered every active reference display and alias, every form label and match term, all 65 legacy candidates, and every string in the research ledger. It found no exact owner for `Grape-Nuts`, `Grape Nuts`, `Grapenuts`, `Post Grape-Nuts`, `Grape-Nuts cereal`, `Grape-Nuts Flakes`, `céréales Grape-Nuts`, `Grape-Nuts Original`, or the proposed ID. A global search of proposal, batch, plan, and roadmap text likewise found no prior Grape-Nuts decision. New source IDs `WP03-GRAPENUTS-20261012-S01` through `S09` were absent from the ledger when checked; they are local to this proposal and have not been registered.

Adjacent active owners remain unchanged:

| Active reference | Current boundary |
|---|---|
| `ingredient-ref-grapes` — `grapes / raisin` | Edible fruit, not a brand token or cereal. |
| `ingredient-ref-grape-juice` — `grape juice / jus de raisin` | Juice product; includes source-specific concentrate/reconstituted aliases. |
| `ingredient-ref-grapeseed-oil` — `grapeseed oil / huile de pépins de raisin` | Oil; includes the English alias `grape seed oil`. |
| `ingredient-ref-verjuice` — `verjuice / verjus` | Sour grape juice alias; not Grape-Nuts. |
| `ingredient-ref-nuts` — `nuts / noix` | Broad edible-nut identity; must not own the cereal’s trademark. |
| `ingredient-ref-bran-flakes-cereal`, `ingredient-ref-shredded-wheat-cereal`, `ingredient-ref-rice-cereal` | Existing, separately scoped ready-to-eat cereal identities. |
| `ingredient-ref-red-river-cereal`, `ingredient-ref-sunny-boy-cereal` | Existing branded hot-cereal identities; neither is a synonym for this product. |

No active reference or form, legacy identity, or ledger record owns the exact candidate name. No canonical catalog, form, legacy, or ledger file was changed for this audit.

## Actual picker behavior

The ingredient picker in [`RecipeEditorScreen.kt`](../../../app/src/main/java/app/recipebook/ui/recipes/RecipeEditorScreen.kt) uses `IngredientReferenceSearchIndex` from [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Search normalizes accents, punctuation, and case, checks attached-form exact phrases first, then returns complete word-phrase matches across reference names, aliases, and form terms. A complete phrase can occur anywhere within a longer term; substring matching is the fallback. The results below are a static evaluation of that live source implementation and current JSON snapshot, not emulator/UI QA.

| Current picker query | Current results | If the proposed Original identity were added |
|---|---|---|
| `Grape-Nuts` / `Grape Nuts` | 0 | The candidate would appear. |
| `grapenuts` | 0 | Still 0; this spelling is not proposed. |
| `Grape-Nuts cereal` | 0 | The candidate would appear. |
| `céréales Grape-Nuts` | 0 | The candidate would appear under the possible French display. |
| `Grape-Nuts Flakes` | 0 | Still 0; Flakes remains outside the Original identity. |
| `grape` | 3: `grape juice`, `grapeseed oil`, `verjuice` | 4, adding Grape-Nuts cereal through the `Grape-Nuts` display phrase. |
| `nuts` | 5: `macadamia nuts`, `makhana seeds`, `nuts`, `pili nuts`, `pine nuts` | 6, adding Grape-Nuts cereal even though it contains no nuts. |
| `cereal` | 10: bran flakes cereal; cream of barley cereal; cream of rice hot cereal; cream of wheat hot cereal; creamy buckwheat hot cereal; malt flour (via `malted cereal flour`); crispy rice cereal; shredded wheat cereal; Red River cereal; Sunny Boy cereal | 11, adding Grape-Nuts cereal, which would be expected for this generic category query. |
| `céréales` | 5: bran flakes cereal; creamy buckwheat hot cereal; crispy rice cereal; Red River cereal; Sunny Boy cereal | 6, adding the possible French display. |

The `grape` and `nuts` collisions are the decisive picker issue. Under current phrase-first matching there is no way to make the branded product resolvable by its own name while preventing it from appearing for those broad one-word queries. Adding an alias would not solve that behavior and could create additional broad hits.

## Full recipe demand

Every current manifest-listed bundled recipe file was parsed; complete serialized recipe text and each ingredient row were searched. Candidate spellings included `Grape-Nuts`, `Grape Nuts`, `Grapenuts`, `Post Grape-Nuts`, `Grape-Nuts cereal`, `Grape-Nuts Flakes`, `céréales Grape-Nuts`, `Grape-Nuts Original`, `Grape Nuts Original`, singular `Grape-nut`, and `grape nut`, after the picker’s punctuation, accent, and case normalization.

| Scope | Result |
|---|---:|
| Bundled recipe files | 0 matches / 114 files |
| Bundled ingredient rows | 0 matches / 1,123 rows |
| Supported recipe links | 0 |

As a supplementary historical check, the exported RecipeKeeper recipe directory was also scanned: 0 candidate matches across 114 JSON files / 1,103 ingredient lines. That archive is not the current bundled library and does not change the bundle result.

## Forms, measurement, and substitutions

- **Forms:** add none. Grape-Nuts Original is sold as a ready-to-eat processed cereal, not a raw grain form. The sources do not justify a reusable dry/cooked form or grain-to-cereal conversion.
- **Manufacturer serving:** the current U.S.-audience product page reports 1/2 cup (58 g). This is product-label portion information, and the page does not specify a metric cup conversion. Do not convert it into an app cup mapping, density, or generic cereal measure.
- **Canadian historical portion:** Health Canada’s French 2008 common-food table lists `Grape-Nuts, Post` at 125 mL / 58 g. This is a dated product-specific table value, not a current package declaration. Keep it as evidence only; do not activate density, `unitMappings`, or an app `cup` measure from it.
- **Québec recipe quantity:** a Pages Jaunes French recipe page calls for 120 g (1 cup) of `céréales Grape-Nuts` in a quick bread. Its cup standard and source package are unstated, and the live page could not be fetched at review. This is one recipe-specific observation, not a transferable measure, density, conversion, cooking yield, or serving.
- **Canadian label:** an indexed 2025 Central Smith Creamery ingredient declaration uses `Céréales grape-nuts` as an ice-cream inclusion with the same listed wheat flour, malted barley flour, salt, and dried yeast. The PDF URL returned 404 when opened, so this is corroborative indexed text only and does not prove current cereal retail availability.
- **Substitutions:** no source establishes a quantity-qualified substitute. Do not substitute bran flakes, shredded wheat, Red River, Sunny Boy, generic granola, or Grape-Nuts Flakes by name or quantity. The manufacturer’s general serving suggestions are not a substitution rule.
- **Recipe demand:** with no bundled recipe line, add no recipe link, conversion, yield, or substitution rule.

## Source register

Sources were accessed on 2026-10-12. Proposal-local source IDs are not shared-ledger allocations.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| `WP03-GRAPENUTS-20261012-S01` | Post Consumer Brands, [Grape-Nuts Original product page](https://www.grapenuts.com/product/the-original/), product title, ingredient list, serving, and footer. | Current manufacturer identity for Original cereal, wheat/barley composition, 1/2 cup (58 g) serving, and U.S.-audience limitation. Does not establish current Canadian or Québec sales. |
| `WP03-GRAPENUTS-20261012-S02` | Post Consumer Brands, [Grape-Nuts brand page](https://www.postconsumerbrands.com/brands/grape-nuts/). | Manufacturer lists Grape-Nuts cereal and Grape-Nuts Flakes separately. Supports the exclusion of Flakes from the Original identity; not a Canadian product directory. |
| `WP03-GRAPENUTS-20261012-S03` | Health Canada, [Valeur nutritive de quelques aliments usuels 2008, tableau 2](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/saine-alimentation/donnees-nutritionnelles/tableau-2-pains-cereales-autres-produits-cerealiers-valeur-nutritive-quelques-aliments-usuels-2008.html), row `Grape-Nuts, Post`. | Official Canadian French table places the named product among breads/cereals and gives 125 mL / 58 g. It is a 2008 common-food data point, not a current package or recommended serving. |
| `WP03-GRAPENUTS-20261012-S04` | Santécom, [Guide de l’intervenant](https://www.santecom.qc.ca/Bibliothequevirtuelle/santecom/35567000025947.pdf), p. 17, “Les céréales riches en fibres.” | Search-indexed French text distinguishes `Grape-nuts (blé entier et orge)` from `Grape-nuts Flakes (flocons de blé entier et d’orge)`. The scan is historical/undated in the accessible record; author and exact publication date were not established, and the PDF returned a fetch error during this review. Use as Québec lexical/history evidence, not a current terminology ruling. |
| `WP03-GRAPENUTS-20261012-S05` | Post Consumer Brands Canada, [Brands](https://www.postconsumerbrands.ca/category/brands/), current page. | The current Canadian corporate brand directory lists brands such as Shredded Wheat and Shreddies but not Grape-Nuts. This is a negative directory observation, not conclusive proof that no Canadian retailer imports the U.S. product. |
| `WP03-GRAPENUTS-20261012-S06` | Pages Jaunes Canada, [2 recettes de pain faciles et rapides](https://www.pagesjaunes.ca/trucs/2-recettes-de-pain-faciles-et-rapides/), `Pain rapide aux noix`. | Search-indexed Québec French recipe text uses `céréales Grape-Nuts` and gives 120 g (1 cup). The direct page returned a cache miss; publication date, cup convention, and exact package are not established. Recipe-specific quantity only. |
| `WP03-GRAPENUTS-20261012-S07` | Central Smith Creamery, [finished-product ingredients and nutrition PDF](https://www.centralsmith.ca/wp-content/uploads/2025/05/CS-Finished-Product-Ingredients-website-2025.pdf), indexed `Crème glacée aux Grape-Nuts` entry. | Search-indexed 2025 Canadian French declaration uses `Céréales grape-nuts` and lists wheat flour, malted barley flour, salt, and dried yeast. The URL returned 404 during review; it is corroborative indexed text only. |
| `WP03-GRAPENUTS-20261012-S08` | Canadian Intellectual Property Office, [GRAPE=NUTS & DESIGN, application 0990294](https://ised-isde.canada.ca/cipo/trademark-search/990294?wbdisable=true), current record. | Confirms an active Canadian trademark registration for cooked/prepared cereal food for human consumption and names Post Foods, LLC as current owner. Trademark status does not establish current Canadian distribution or a generic ingredient class. |
| `WP03-GRAPENUTS-20261012-S09` | Grape-Nuts, [Our Story](https://www.grapenuts.com/our-story/), manufacturer brand-history page. | Post’s brand page explicitly says the cereal contains neither grapes nor nuts and gives the product-name origin explanations. The page is U.S.-audience brand material; it supports name disambiguation, not Canadian availability. |

## Precise disposition and possible future delta

For this proposal-only review, make **no shared-data change**: no active reference, no alias, no legacy entry, no ledger candidate/record, no source registration, no form, no measurement, no recipe link, no conversion, no yield, and no substitution rule. No plan or roadmap edit is part of this proposal.

If later evidence and picker behavior justify promotion, limit the canonical delta to one identity-only `GRAIN_AND_CEREAL` reference with the fields in the recommendation table and a separately reviewed ledger identity/source record. Keep aliases, forms, density, unit mappings, recipe links, and substitutions empty. Do not copy any brand serving or recipe amount into a reusable measure. Reconsider only after a current Québec/Canadian product source or an actual imported recipe establishes operational need, and after the picker can prevent the brand token `Grape-Nuts` from surfacing as an ingredient for generic `grape` and `nuts` queries.

This review records one source-backed candidate under the still-open Section F regional cereal-mix/preprocessed-grain checklist. It does not close that checklist or reopen the completed Red River/Sunny Boy identities.
