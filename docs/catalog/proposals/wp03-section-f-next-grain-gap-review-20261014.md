# WP03 Section F — Biowig organic millet cream review (2026-10-14)

**Status:** Integrated on 2026-10-14 as `ingredient-ref-biowig-millet-cream`, with one accepted
research-ledger record. Section F remains open.

## Review record

- **Reviewed:** 2026-10-14.
- **Status:** Identity-only integration completed; no forms or reusable numeric behavior were added.
- **Section F context:** The live checklist keeps “regionally significant cereal mixes and preprocessed grains” open at [the Section F entry](../../RecipeBook-global-ingredient-catalog-plan.txt#L2906). The current catalog includes generic and species-qualified millet, millet flour and flakes, puffed millet, and several other hot-cereal identities, but no Biowig millet product.
- **Candidate:** Moulin Abénakis's named **Biowig millet cream** product, which has a Québec manufacturer listing, a Québec food-directory listing, and bilingual Québec retail listings.
- **Recommendation:** Add one brand-specific, identity-only `GRAIN_AND_CEREAL` reference for the product as sold. Do not create a general “millet cream” identity or treat this five-ingredient cereal blend as plain millet.

## Product boundary

Moulin Abénakis calls the product **Crème Biowig au millet biologique** and gives preparation directions for whisking it into hot liquid until thickened. Aliments du Québec lists **Crème de céréales biowig au millet biologique** under cereals and granola. Québec retailer ingredient declarations list organic millet, flaxseed, sesame, sunflower seed, and brown almonds [S01–S04]. These sources support one named, multi-ingredient cereal product, not a pure millet grain or a universal milling class.

Keep this reference scoped to the Biowig product with the reviewed name and blend. The sources do not identify the millet species, milling grade, particle size, or whether the ingredients are whole, cracked, or ground. Do not infer those details from *crème* or from the cooking directions. Do not decompose the product into five recipe-line ingredients, merge it with plain millet meal/flour, or use its name as an alias for another millet cereal. The OQLF entry supports *millet / mil / petit mil* as broad cereal terms and says *millet* can group multiple species; it does not define this composite product or its commercial name [S05].

This is distinct from the unresolved generic millet-meal / *gruau de millet* question: that review concerns an unbranded, single-grain meal and does not allocate that term. This proposal does not reopen it. It also does not generalize the Biowig identity to other millet hot cereals or other Biowig grain products.

## Proposed canonical reference

```json
{
  "id": "ingredient-ref-biowig-millet-cream",
  "nameEn": "Biowig Organic Millet Cream",
  "nameFr": "crème Biowig au millet biologique",
  "aliasesEn": ["Biowig cream (millet) organic"],
  "aliasesFr": ["crème de céréales Biowig au millet biologique"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-14T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

The English display follows a Québec retailer's current English product title; the French display follows the Québec maker's product name. The two aliases are product-title variants attested by Québec listings: the English variant is a retailer wording, and the longer French variant is the Aliments du Québec directory title [S01–S04, S06]. These are product labels, not OQLF-approved terms. Keep bare `millet`, `millet cream`, `cream of millet`, `crème de millet`, millet meal, and the names of other millet products off the alias arrays. In particular, `cream of millet` may refer to a separate single-grain product and must not resolve to this seed-and-nut blend.

## Catalog, legacy, ledger, and picker audit

At review time the live package had 1,431 active references and 105 forms; the legacy file listed 63 candidates and the research ledger had 1,771 records. Searches used the current `normalizeIngredientSearchKey` and phrase-first matching rules in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), including attached form terms.

Normalized exact-key searches found no owner for the proposed ID, either display, or either proposed alias in active reference names/aliases, form labels/match terms, legacy candidates, or ledger text. No prior proposal, batch, live-plan entry, or roadmap entry mentions Biowig or these exact product names. The current adjacent millet, cereal-cream, and millet-meal records remain separate; none owns a Biowig phrase. No active WP03 agent was reviewing this product when checked.

| Picker query | Current results | With proposal | Effect |
| --- | ---: | ---: | --- |
| `Biowig` | 0 | 1 | Returns the proposed product alone. |
| `Biowig Organic Millet Cream` | 0 | 1 | Exact English display. |
| `Biowig cream (millet) organic` | 0 | 1 | Source-attested English title variant. |
| `crème Biowig au millet biologique` | 0 | 1 | Exact French display. |
| `crème de céréales Biowig au millet biologique` | 0 | 1 | Québec directory title. |
| `millet cream` | 0 | 1 | Phrase matches the proposed English display. |
| `cream of millet` | 0 | 0 | Remains separate from this product. |
| `millet` | 19 | 20 | One more result within an already broad set of millet identities and forms. |
| `cream` | 12 | 13 | Adds a branded grain product to an already broad query. |
| `crème` | 16 | 17 | Adds a branded grain product to an already broad query. |
| `céréales` | 10 | 11 | Adds the product through its directory-title alias. |

The broad `cream` / `crème` and `millet` queries stay multi-result. The brand-qualified query is unique. No generic alias is proposed to make this product stand in for the broad query.

## Bundled recipe demand

The manifest lists 114 recipe files with 1,123 structured ingredient rows. A whole-file and ingredient-row scan for `Biowig`, `Abénakis` / `Abenakis`, both display names, both aliases, the product's English/French cream wording, and the 13-digit UPC `0674860222091` found **zero recipe-file matches and zero ingredient-row matches**. Horizon Nature's September 2019 English catalogue labels that UPC as the 350 g organic Biowig millet cream [S07]. The same scan found no standalone `millet` text in the bundled recipe corpus. No recipe link, relink, or recipe substitution is proposed. The maker's cooking instructions establish product use, but they are not bundled recipe demand.

## Forms, measures, and substitutions

- **Forms:** Add no `IngredientForm`. The product is identified by its marketed blend; the sources do not define a process or particle-size boundary from which a generic dry/cooked form should be inferred.
- **Package and measures:** Québec listings give a 350 g package format [S01, S03–S04]. Package mass is not a household measure. The manufacturer's preparation method uses 1 cup of liquid and 3–4 tablespoons of product, simmered for 2–3 minutes and rested for 1–2 minutes [S02]. Keep those as this product's source-specific instructions only; they do not give product mass, density, a reusable cup-to-mass conversion, or a general serving measure.
- **Catalog numeric fields:** Keep `defaultDensity` null and `unitMappings` empty. Add no conversion, cooking yield, or package yield.
- **Substitutions:** The reviewed sources provide no validated replacement quantity or recipe role. Add no global or contextual substitution rule and no recipe-line substitution link. Shared millet content is not evidence that the blend can replace plain millet, millet meal, or another cereal cream.

## Source register

Sources were checked online on 2026-10-14. Pages without a publication date are marked undated; current page presence does not guarantee stock at a specific store.

| Source ID | Source | Evidence and limits |
| --- | --- | --- |
| `WP03-BIOWIG-20261014-S01` | Aliments du Québec, [Crème de céréales biowig au millet biologique](https://alimentsduquebec.com/aliments-dici/produits-cerealiers/creme-de-cereales-biowig-au-millet-biologique), undated product-directory entry. | Gives the exact Québec French directory title, identifies Moulin Abénakis, places the product in cereals and granola, and lists a 350 g format and Québec retail channels. It is not a package ingredient statement or guarantee of local inventory. |
| `WP03-BIOWIG-20261014-S02` | Moulin Abénakis, [Crème Biowig au millet biologique](https://moulinabenakis.com/products/creme-biowig-millet-bio), undated manufacturer page. | Supports the French product name, product-specific hot-liquid method, uses in sweet and savoury foods, and the 350 g format. It does not give the ingredient list, millet species, grind, or particle size. |
| `WP03-BIOWIG-20261014-S03` | La Boîte à Grains, [Biowig Organic Millet Cream](https://laboiteagrains.com/en/products/biowig-organic-millet-cream), undated English Québec retailer listing. | Supports the proposed English display, 350 g format, maker, breakfast use, and an ingredient declaration listing organic millet, linseed, sesame seeds, sunflower seeds, and brown almonds. Retailer wording is not a manufacturer-published English label. |
| `WP03-BIOWIG-20261014-S04` | La Moisson, [Crème Biowig Millet Biologique](https://lamoisson.com/collections/abenakis-gourmet/products/creme-biowig-millet-biologique-biowig-millet-organic-cream), undated Québec retailer listing. | Corroborates the French market name, 350 g package, and the same five organic ingredients. Its product copy is retailer-supplied and does not replace a package-panel check. |
| `WP03-BIOWIG-20261014-S05` | Office québécois de la langue française, [millet (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet), last updated 2010. | Gives *millet*, *mil*, and *petit mil* as French terms and notes that *millet* can be generic across species. It does not name the Biowig product or define cereal creams. |
| `WP03-BIOWIG-20261014-S06` | Monde Naturel, [Crème biowig (millet) bio 350 g / Biowig cream (millet) organic 350 g](https://shop.mondenaturel.ca/products/creme-biowing-millet-bio-350g), product listing. | Supports the proposed English alias and repeats the five listed ingredients. The search index last crawled this page in 2025; use its wording only as an attested product-title variant, not as evidence of current inventory. |
| `WP03-BIOWIG-20261014-S07` | Horizon Nature, [English product catalogue](https://horizonnature.ca/wp-content/uploads/2019/12/catalog-hn-en.pdf), September 2019. | Page 18 identifies “ABK Org. Biowig cream (millet) 6x350g” and UPC `0674860222091`. This historic distributor catalogue corroborates the product wording and barcode only; its 2019 prices and stock information are not current. |

## Review disposition

**Integrated `ingredient-ref-biowig-millet-cream` as one identity-only `GRAIN_AND_CEREAL` reference.** The reference is limited to the named, millet-forward seed-and-nut cereal blend. Keep only the source-attested product-title variants searchable; do not assign the product's blend to plain millet or to any generic millet-meal/hot-cereal class. No forms, reusable measures, density, mappings, conversions, yields, recipe links, or substitutions were added.

## Static checks

- Re-read `AGENTS.md`, relevant `Requirements.md` localization/reference-list requirements, the current Section F plan and roadmap entries, recent Section F proposals, and active reference/form/legacy/ledger data.
- Confirmed the proposed ID, displays, aliases, and source-ID prefix have no exact active owner or source-record collision; confirmed the exact product is absent from the proposal/batch archive, plan, and roadmap.
- Reproduced the phrase-first picker projection from the current search normalizer and audited broad-query result counts above.
- Scanned all 114 manifest-listed recipe files and 1,123 ingredient rows for the product names, aliases, brand, and UPC `0674860222091`; found no matches.
- Added the identity row and one accepted ledger record with seven unique source IDs; updated the Section F checklist, roadmap, and integration README; refreshed the generated ingredient catalog.
- Seed-package and reference normalization, ledger-schema validation, generated-index freshness, picker projection, source ownership, encoding, local links, and scoped whitespace checks passed after integration. No app, Gradle, instrumentation, or emulator tests were run because this change only adds database JSON data and its generated catalog index.
