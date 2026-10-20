# WP04 Section P R438 — breaded butterfly shrimp product identity review

- **Review and source-access date:** 2026-10-17.
- **Checklist:** WP04 Section P, “Shrimp/prawn by meaningful preparation; crab and crayfish” ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6717)).
- **Scope:** Review the distinct Canadian market product named as breaded butterfly shrimp, including its Québec French labels, live ownership, picker effects, and every manifest-listed recipe. This does not reopen shrimp species, generic fresh or cooked shrimp, canned cocktail shrimp, dried shrimp, shrimp balls, crab products, fish sticks, or tempura fish.
- **Recommendation:** Add one identity-only `PROTEIN` reference, **breaded butterfly shrimp / crevettes en papillon panées**, with only the exact current product-name variants listed below. Keep shrimp species, coating recipe, freezing/cooking state, and package details SKU-specific. Add no form, measure, density, mapping, recipe link, yield, conversion, or substitution.
- **Proposal-only status:** This review creates only this proposal file. It does not edit shared catalog JSON, the ledger, plan, roadmap, generated index, recipes, or application files. No tests, build, emulator, or deployment was run.
- **Proposal-local source IDs:** `WP04-SECTIONP-BREADED-BUTTERFLY-SHRIMP-R438-20261017-S01` through `S09`, plus audit label `WP04-SECTIONP-BREADED-BUTTERFLY-SHRIMP-R438-20261017-R01`. These IDs are not ledger allocations.

## Recommendation and exact proposed delta

The OQLF GDT pairs its seafood term **crevette en papillon** with English **butterfly shrimp**. The entry does not define a breading or frozen state. Current Canadian product evidence supplies those additional details: High Liner describes shrimp butterflied and coated in crispy breading, while BlueWater sells butterfly shrimp breaded with panko. Metro’s current bilingual High Liner listing uses `Frozen Breaded Butterfly Shrimp` / `Crevettes en papillon panées et surgelées`; a separate BlueWater listing uses `Crevettes en papillon panées surgelées`. These sources support a narrowly named prepared-product identity, without assigning a shrimp species or treating either brand’s formula as universal. [S01, S03–S08]

Proposed reference only:

```json
{
  "id": "ingredient-ref-breaded-butterfly-shrimp",
  "nameEn": "breaded butterfly shrimp",
  "nameFr": "crevettes en papillon panées",
  "aliasesEn": ["frozen breaded butterfly shrimp"],
  "aliasesFr": [
    "crevettes en papillon panées et surgelées",
    "crevettes en papillon panées surgelées",
    "crevettes papillon"
  ],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-17T00:00:00Z",
  "category": "PROTEIN"
}
```

The French display extends the OQLF term with `panées`, as attested by current Québec product wording; it is not represented as a full OQLF-preferred phrase. `crevettes papillon` is retained only because High Liner uses it as its French product name and describes the shrimp as breaded. Do not add the broader aliases `breaded shrimp`, `crevettes panées`, `shrimp`, `prawn`, or `crevette`: they do not distinguish this item from other shrimp products and species. Do not add singular `crevette en papillon` as an alias; the OQLF entry supplies a general cut/name pair but does not establish that a singular unqualified query should select a breaded product.

Do not include `coconut butterfly shrimp`, popcorn shrimp, tempura shrimp, shrimp balls, or generic cooked shrimp as aliases. Metro lists coconut butterfly shrimp and breaded popcorn shrimp as separate products from the regular breaded butterfly SKU. `coconut butterfly shrimp` remains unresolved; the broader `butterfly shrimp` query will return only this proposed breaded item unless a coconut identity is reviewed separately. This proposal covers the specifically named breaded butterfly product, not every breaded shrimp SKU. [S09]

## Current ownership and snapshot audit

The live snapshot read for this review contains **1,731 ingredient references, 141 forms, 56 legacy candidates, and 2,090 research-ledger records** (9,483 source entries and 8,035 distinct source IDs). The current manifest lists **114 recipe files**; parsing those files found **1,123 ingredient rows**.

Normalized display, alias, form-term, ID, ledger-record, and source-ID checks found no owner for `breaded butterfly shrimp`, `frozen breaded butterfly shrimp`, `butterfly shrimp`, `crevettes en papillon panées`, `crevettes papillon`, or the proposed reference ID. No `ingredient-form-breaded-butterfly-shrimp-*`, `candidate-breaded-butterfly-shrimp`, R438 source-ID prefix, or the two product numbers `061763002274` and `062218139392` is allocated in the live reference, form, legacy, or research-ledger data. A focused proposal/batch-archive search found no earlier review of this product phrase.

| Current owner or prior review | Current boundary | Proposed handling |
|---|---|---|
| `ingredient-ref-canned-cocktail-shrimp` | A named canned shrimp product. | Keep its can-specific identity and query terms unchanged. |
| `ingredient-ref-dried-shrimp` | Dried shrimp. | No dried, rehydrated, or powder relationship is proposed. |
| `ingredient-ref-northern-shrimp` | Species/market-qualified Northern shrimp. | Do not assign a species to the proposed product. |
| `ingredient-ref-shrimp-balls` (R148) | A formed shrimp-containing product. | Keep separate from butterfly-cut shrimp pieces. |
| `ingredient-ref-saeu-jeot`, `ingredient-ref-kapi-shrimp-paste`, `ingredient-ref-bagoong-alamang`, `ingredient-ref-belacan`, and `ingredient-ref-terasi` | Fermented shrimp or shrimp-paste products; none has a butterfly-shrimp form. | Keep these condiment identities unchanged. No forms are attached to the live shrimp/crevette-named references above. |
| Generic frozen cooked shrimp hold (R229) | Held because a frozen-only name would also capture unqualified `cooked shrimp` / `crevettes cuites` queries. | This proposal adds no cooked or plain-shrimp alias and does not change that hold. |
| Fish sticks (R221), frozen tempura fish (R224), crab cake (R432), and crab claws (R435) | Other prepared-fish or crab products. | No shared identity, alias, form, recipe demand, or substitution is proposed. |

The CFIA Fish List returns multiple species under the generic English and French common names `Shrimp` / `Crevette`. The retailer and manufacturer pages reviewed here do not identify a species for their breaded butterfly products. Keep the proposal species-neutral; do not attach a binomial or species-qualified alias. [S02–S08]

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it uses complete normalized phrase matching first, then substring fallback across reference names and aliases. It was replayed over the current names and aliases with the proposed display and aliases above.

| Query | Current result | With proposed row |
|---|---|---|
| `breaded butterfly shrimp`; `frozen breaded butterfly shrimp`; `butterfly shrimp` | None | `ingredient-ref-breaded-butterfly-shrimp` only |
| `crevettes en papillon panées`; `crevettes en papillon panées et surgelées`; `crevettes en papillon panées surgelées`; `crevettes papillon` | None | `ingredient-ref-breaded-butterfly-shrimp` only |
| `shrimp` | Five results: canned cocktail shrimp, dried shrimp, Northern shrimp, saeu-jeot, and shrimp balls. | The same five plus breaded butterfly shrimp (six total). |
| `crevette` | Dried shrimp and Northern shrimp. | Unchanged; the plural French display does not map singular `crevette`. |
| `crevettes` | Nine results: bagoong alamang, belacan, canned cocktail shrimp, dried shrimp, Kapi paste, Northern shrimp, saeu-jeot, shrimp balls, and terasi. | The same nine plus breaded butterfly shrimp (ten total). |
| `papillon` | Moth beans only. | Moth beans and breaded butterfly shrimp. The broad token therefore becomes a two-result query. |
| `coconut butterfly shrimp` | None. | Still none; the separately listed coconut product is outside this identity. |
| `breaded shrimp`; `crevettes panées`; `crevette en papillon`; `prawn`; `frozen shrimp` | No result. | Still no result; these broader or unsupported phrases are not aliases. |
| `shrimp balls`; `cooked shrimp`; `frozen cooked shrimp`; `crevettes cuites`; `crab cake`; `fish sticks` | Existing owners or held/no-result boundaries. | Unchanged. |

The narrow bilingual product queries become selectable. The broad `papillon` query gains a second, unrelated-looking result alongside moth beans; each result remains explicitly named. Do not hide that projection effect or add broader shrimp aliases to compensate for French singular/plural differences.

## Manifest recipe-demand scan

All **114 manifest-listed recipe files and 1,123 ingredient rows** were parsed. The full recipe JSON text and ingredient rows were searched for `shrimp`, `shrimps`, `prawn`, `prawns`, `crevette`, `crevettes`, `butterfly shrimp`, `breaded butterfly shrimp`, `breaded shrimp`, `shrimp balls`, `crevettes en papillon`, `crevettes papillon`, and `crevettes panées`. The scan found **zero text-file matches and zero ingredient-row matches** for every term. There is no bundled recipe request to link, relink, or use as support for a product-specific amount or substitution.

The High Liner manufacturer page gives a product-specific nutrition serving of about four shrimp (84 g) for its 330 g product. That is not a general count-to-mass conversion. The retailer packages are 330 g for High Liner and 261 g for BlueWater; those are SKU amounts, not reusable recipe measures. No density, unit mapping, typical portion, package yield, edible yield, or cooking yield is supported. [S03–S08]

## Forms, measures, and substitutions

- **Forms:** Add none. Current product examples are sold frozen and breaded, but the proposed reference itself names the prepared product. The pages do not establish reusable frozen, cooked, panko, or readiness forms across brands and recipes.
- **Measures and density:** Keep `defaultDensity` null and `unitMappings` empty. The different 330 g and 261 g packages, brand-specific ingredient panels, and one 4-shrimp/84 g nutrition serving do not support a common measure or density.
- **Substitutions:** Add no global or contextual rule. These product pages provide names, SKU ingredients, and cooking directions, not a quantity- and method-tested equivalence with raw shrimp, cooked shrimp, popcorn shrimp, tempura shrimp, shrimp balls, fish sticks, or another seafood.
- **Recipe links:** Add none; the bundled corpus has no matching row.
- **Ledger if accepted:** Use one `ingredient_reference` record with `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: not_yet_researched`. Product package facts remain in source notes only; no package-yield, form, conversion, substitution, or recipe-line record is proposed.

## Sources and limits

The web sources below were checked on 2026-10-17. Retail pages and manufacturer pages support their own labels and SKU claims; they do not establish one universal ingredient formula, species, measure, availability, or recipe interchangeability.

| Source ID | Source | Evidence and limit |
|---|---|---|
| **WP04-SECTIONP-BREADED-BUTTERFLY-SHRIMP-R438-20261017-S01** | Office québécois de la langue française, [crevette en papillon (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497145/crevette-en-papillon), last updated 1984. | Gives preferred Québec French `crevette en papillon` and English `butterfly shrimp` in the seafood domain. It supplies no product definition, breading, frozen state, or recipe equivalence. |
| **WP04-SECTIONP-BREADED-BUTTERFLY-SHRIMP-R438-20261017-S02** | Canadian Food Inspection Agency, [Fish List lookup for `shrimp`](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=shrimp), plus [CFIA Fish List guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names). | The lookup returns multiple taxa with `Shrimp` / `Crevette` common-name entries; CFIA explains that listed common names are tied to species for Canadian fish labelling. Supports not assigning a species to these unqualified product labels. The list page says it was modified 2023-09-18; it is a name/species source, not a breaded-product standard. |
| **WP04-SECTIONP-BREADED-BUTTERFLY-SHRIMP-R438-20261017-S03** | High Liner, [Butterfly Shrimp](https://www.highliner.com/products/family-favourites/family-favourites-butterfly-shrimp). | Current manufacturer page calls the product Butterfly Shrimp, describes shrimp butterflied and coated in crispy breading, lists 330 g, and gives the product-specific 4 shrimp/84 g nutrition serving. This is one brand’s product and panel, not a standard conversion. |
| **WP04-SECTIONP-BREADED-BUTTERFLY-SHRIMP-R438-20261017-S04** | High Liner, [Crevettes Papillon](https://www.highliner.com/fr/products/family-favourites/family-favourites-butterfly-shrimp). | French manufacturer page uses `Crevettes Papillon`, describes a crispy breading, and lists 330 g. Supports the source-specific alternate French product name; not an OQLF ruling or independent second formulation. |
| **WP04-SECTIONP-BREADED-BUTTERFLY-SHRIMP-R438-20261017-S05** | Metro, [Frozen Breaded Butterfly Shrimp, High Liner, product 061763002274](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/frozen-fish-seafood/seasoned-breaded/frozen-breaded-butterfly-shrimp/p/061763002274). | Current English Québec retailer listing uses the exact proposed frozen-product alias and lists a 330 g package with shrimp, water, crumbs, flour, oil, starch, salt, and seasonings. Its package and formula are SKU-specific. |
| **WP04-SECTIONP-BREADED-BUTTERFLY-SHRIMP-R438-20261017-S06** | Metro, [Crevettes en papillon panées et surgelées, High Liner, product 061763002274](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/assaisonnes-et-panes/crevettes-en-papillon-panees-et-surgelees/p/061763002274). | French page for the same 330 g SKU as S05; supplies the exact French frozen alias and ingredient label. It is the same item, not an independent second product/formulation. Retail availability and listing details can vary by store and date. |
| **WP04-SECTIONP-BREADED-BUTTERFLY-SHRIMP-R438-20261017-S07** | BlueWater Seafoods, [Butterfly Shrimp](https://www.bluewater.ca/en/products/butterfly-shrimp/) and [Crevettes en Papillon](https://www.bluewater.ca/fr/produits/crevettes-en-papillon/). | Manufacturer pages describe whole shrimp breaded with crunchy panko; the French product uses `Crevettes en Papillon`. The 261 g pack and panko coating are BlueWater product facts. They do not generalize to High Liner’s ingredient formula or establish species. |
| **WP04-SECTIONP-BREADED-BUTTERFLY-SHRIMP-R438-20261017-S08** | Super C Québec, [Crevettes en papillon panées surgelées, BlueWater, product 062218139392](https://www.superc.ca/allees/produits-surgeles/poissons-et-fruits-de-mer/crevettes-et-fruits-de-mer/crevettes-en-papillon-panees-surgelees/p/062218139392). | Current Québec retailer listing uses the proposed French frozen alias and identifies a 261 g BlueWater product with its own ingredient declaration. The selected store reported out of stock at access; this does not prove general availability. |
| **WP04-SECTIONP-BREADED-BUTTERFLY-SHRIMP-R438-20261017-S09** | Metro, current [English seafood listings](https://www.metro.ca/en/online-grocery/themed-baskets/mmmazing/seafood) and [French seasoned-and-breaded seafood listings](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/assaisonnes-et-panes). | The listings show the regular breaded butterfly item separately from coconut butterfly shrimp and breaded popcorn shrimp. They establish distinct current market labels, not a shared formula or substitution. The proposed identity does not cover the coconut variant; broad `butterfly shrimp` still selects the proposed regular product unless that variant is reviewed separately. |
| **WP04-SECTIONP-BREADED-BUTTERFLY-SHRIMP-R438-20261017-R01** | Read-only audit of the [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt), live references/forms/legacy candidates/research ledger, prior Section P proposals and batches, [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), and manifest-listed recipe corpus. | Confirms the current file counts and ownership, source-ID/ID/URL checks, the picker projection, prior product boundaries, and zero matching demand. This repository audit does not extend the claims of the cited external sources. |

**Integration source reuse:** Proposal-local S02 combines the CFIA Fish List lookup and common-names guidance. The ledger reuses their existing entries `WP04-SECTIONP-NORTHERN-SHRIMP-20261013-R74-S03` and `WP04-ABALONE-20261011-S03`; no duplicate CFIA source URL or new R438-S02 ledger source was added.

## Disposition and unresolved needs

**Recommend adding identity-only `breaded butterfly shrimp / crevettes en papillon panées`** with the exact delta above. Current OQLF naming and independent High Liner and BlueWater product lines support a recognizable breaded butterfly-shrimp product identity, while the French product names are attested by Québec-facing retailer and manufacturer pages. The sources do not identify a shrimp species or justify reusable numeric behavior.

Keep plain cooked shrimp, shrimp species, raw shrimp, frozen-cooked shrimp, coconut or popcorn variants, tempura, and shrimp balls separately scoped. Revisit singular French matching, flavor variants, recipe demand, numeric evidence, and any substitution only if a concrete recipe or current product source requires them. No shared catalog or ledger update is made by this proposal.
