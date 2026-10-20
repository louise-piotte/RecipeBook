# WP02 B2 R284 — Chickpea flour measurement and substitution review — 2026-10-16

## Review record

- **Reviewed and sources accessed:** 2026-10-16.
- **Status:** Integrated. See [R284 integration README](../batches/wp02-b2-chickpea-flour-measurement-substitution-integration-r284-20261016/README.md).
- **Scope:** Finish the unresearched measurement and substitution fields for the existing `ingredient-ref-chickpea-flour` row. This is distinct from R281's whole-barley-flour measurement and substitution review and does not reopen the generic chickpea flour identity.
- **Checklist anchor:** [WP02 Section B, alternative flours and starches](../../RecipeBook-global-ingredient-catalog-plan.txt#L2331), specifically the open chickpea/besan-flour portion. The broad B2/B3 item at plan line 13946 remains open.
- **Source IDs:** `WP02-B2-CHICKPEA-FLOUR-R284-20261016-S01` through `S06` were allocated to the existing chickpea-flour ledger record during integration. Existing source IDs cited below remain with their original records.

## Recommendation

**Keep the current generic bilingual identity, record only product-scoped label servings, and add no reusable measure or substitution rule.** The integrated ledger retains `identityState: verified`, sets `measurementState: researched_no_supported_value`, and sets `substitutionResearchState: researched_no_supported_substitute` for a reusable cross-recipe rule. It preserves the two manufacturer-label servings below as separate `portion_weight` observations tied to their own products. No `defaultDensity`, `unitMappings`, derived 1-cup measure, or conversion was added.

Keep the active row as `chickpea flour / farine de pois chiche`, with the existing French alias `farine de pois chiches`, `category: FLOUR_AND_STARCH`, no English aliases, and no forms. Keep Desi chickpea flour and roasted Bengal gram flour / chana sattu as separate identities. Add no alias for `besan` or `gram flour`; their product and regional scopes remain unresolved. Add no form, yield, recipe link, same-ingredient form conversion, global substitution, contextual substitution, or line-level substitution.

## Current catalog, prior work, and phrase ownership

The live `ingredient-ref-chickpea-flour` row is bilingual and source-reviewed. Its ledger states remain `measurementState: not_yet_researched` and `substitutionResearchState: not_yet_researched`; it has no measurement observations. There is no attached form and neither active substitution-rules file has a rule involving this identity.

The existing WP02 identity review keeps generic chickpea flour distinct from whole chickpeas, Desi chickpea flour, and roasted Bengal gram flour / chana sattu. It also leaves bare `besan` and `gram flour` out of the generic row because usage depends on product and preparation. R284 follows those decisions. The current product evidence below is enough to preserve package servings, but not to define the density or replacement behavior of every flour captured by the generic name. Reuse the identity sources `WP02-S25`, `WP02-S26`, `WP02-S29`, and OQLF source `WP02-B2-DESI-CHICKPEA-FLOUR-20261012-S03` for the name boundary; do not duplicate those source records or use them for measurement claims.

### Picker projection

The current [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) folds case and accents and matches complete word phrases before partial substrings. The following projection was checked against the live references and forms:

| Query | Current picker result | R284 interpretation |
|---|---|---|
| `chickpea flour` | 3 rows: generic chickpea flour, Desi chickpea flour, and chana sattu | A useful broad query; retain the three identities. |
| `farine de pois chiche` | 1 row: generic chickpea flour | Singular French wording continues to reach the generic row. |
| `farine de pois chiches` | 3 rows: generic, Desi, and chana sattu | The plural family phrase also occurs within the two qualified rows. |
| `Desi chickpea flour` | 1 row: Desi chickpea flour | The type-qualified query remains specific. |
| `roasted chickpea flour` | 1 row: chana sattu | Retain the source-qualified roasted product owner. |
| `besan` | 0 rows | No active owner or alias is proposed. |
| `gram flour` | 1 row: chana sattu | This is the actual current picker result: the phrase is contained in chana sattu's alias `roasted Bengal gram flour`. This search consequence is not a deliberate bare `gram flour` alias or a decision that all gram flour means sattu. Leave shared aliases and search code untouched in this proposal. |

The generic row has no form terms, so no form hint or added result is involved. The picker result for `gram flour` should be recorded accurately alongside the prior documentary decision not to assign that broad phrase as an alias; a separate search-boundary review can address substring behavior if the project chooses to do so.

## Bundled recipe demand

Scanned the current manifest-listed corpus: **114 recipe files and 1,123 structured ingredient rows**. Searching the ingredient row text fields and reference links for chickpea flour, the existing French phrases, besan, gram flour, chana sattu, and roasted chickpea flour found **zero matching rows** and **zero direct links** to `ingredient-ref-chickpea-flour`. The current bundled corpus therefore provides no recipe-specific measure, target flour, or dish context for a substitution. No recipe link or recipe edit is proposed.

## Measurement and conversion evidence

- The Québec Food Directory's current Cuisine Soleil listing is the 700 g `Organic Chickpea Flour` product (GTIN 851424000455). Its product Nutrition Facts state **1/4 cup (30 g)**. The directory page was last updated 2026-07-24. Aliments du Québec separately names Cuisine Soleil's product **Farine de Pois Chiche Biologique**, lists 700 g, and confirms local retail channels [S01–S02]. This is one Québec product-label serving, not a standard density or a generic flour mapping.
- Bob's Red Mill's current manufacturer page calls its own product `Chickpea Flour`, says it is stone-ground from whole garbanzo beans, and prints **1/4 cup (30g)** [S03]. Its page does not state a cup volume or filling method; this is a second product-specific label serving, not a Canadian naming standard or evidence that every chickpea flour has the same mass per cup.
- Health Canada's Canadian Nutrient File food code 4886 is explicitly **Chickpea flour (besan) / Pois chiches, farine (Besan)**. It lists 100 ml = 38.9 g, 125 ml = 48.6 g, and 250 ml = 97.2 g, with a stated page modification date of 2019-03-01 [S04]. This is a database food-code serving set for the separately named besan entry, not a current package label for the broad active row. Since bare `besan` remains unassigned, these figures must not be applied to generic `ingredient-ref-chickpea-flour`.
- The two package declarations each say 30 g per 1/4 cup. If four such servings are arithmetically combined, they imply 120 g per cup; this is not printed as a 1-cup serving by either source. The CNF's distinct besan code reports 97.2 g per 250 ml. The product, name, and measurement bases are not matched well enough to reconcile these values into a general conversion.

Record the Cuisine Soleil and Bob's values only as distinct `manufacturer_label` `portion_weight` observations, with product-specific descriptions and a note that the source's cup convention and fill method are unstated. Keep `defaultDensity: null`, `unitMappings: []`, and no derived mass-volume conversion. Retaining observed label facts does not make them interchangeable measures for the full generic row.

## Substitution evidence and form boundary

- Bob's Red Mill says users may replace **up to 25% of the flour in baking** with its own garbanzo bean flour [S03]. It does not specify the target flour type, recipe category, method, or formula basis. Preserve this as manufacturer guidance for that SKU only; do not turn it into a global rule or a general contextual rule for the catalog identity.
- Mohammed, Ahmed, and Senge tested 10%, 20%, and 30% wheat-flour replacement by laboratory-ground Kabuli chickpea flour in bread. In that formula, chickpea flour increased water absorption; the 20% and 30% dough surfaces were classified as sticky, while the 10% loaf was similar to the control [S05]. This supports no cross-dish exchange ratio, hydration correction, or general confidence rating.
- Felisiak et al. tested 25%, 50%, 75%, and 100% replacement of wheat flour by a specified Kabuli chickpea flour in one shortbread-cookie formula [S06]. Their panel reported sensory changes at higher shares, while the tested cookies retained good quality through 75% and sufficient quality at 100%. These results apply to the tested flour and shortbread recipe; they do not establish an exchange rule for breads, sauces, or other baking.

The manufacturer statement and two studies provide bounded examples, not one stable substitution that meets the project's contextual-rule requirements. Do not add a rule from chickpea flour to wheat flour or another ingredient. No same-ingredient form conversion applies: these sources describe milling product identities rather than a cooking or preservation state. Revisit contextual replacement only with a named source recipe, explicit recipient flour, dish role, and method, consistent with [Requirements FR-5 and §6.5](../../../Requirements.md).

## Source register

New sources were accessed on **2026-10-16**. The six source IDs below are now entries on the existing shared chickpea-flour ledger record. The ScienceDirect page returned HTTP 403 and the MDPI page returned HTTP 429 in the browser session; the publisher-indexed result/abstract and article metadata were reviewed, and the access limit is retained here rather than implying a full-text review.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP02-B2-CHICKPEA-FLOUR-R284-20261016-S01` | Québec Food Directory, [Organic Chickpea Flour](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8223780), GTIN 851424000455, Nutrition Facts and product metadata. | Cuisine Soleil product name, 700 g package, ingredients, **1/4 cup (30 g)** serving, and last-updated date. Product-specific label data only. |
| `WP02-B2-CHICKPEA-FLOUR-R284-20261016-S02` | Aliments du Québec, [Farine de Pois Chiche Biologique](https://alimentsduquebec.com/aliments-dici/produits-cerealiers/farine-de-pois-chiche-biologique), product name, format, and retail channels. | Current Québec French product wording and 700 g format. No measurement or substitution data. |
| `WP02-B2-CHICKPEA-FLOUR-R284-20261016-S03` | Bob's Red Mill, [Chickpea Flour](https://www.bobsredmill.com/product/garbanzo-bean-flour), product description, Nutrition Facts, and use text. | Its own stone-ground whole-garbanzo product; **1/4 cup (30g)**; “up to 25%” baking guidance. Product-specific manufacturer claims, not a generic conversion or rule. The page's “gram flour” naming is not used as a global alias. |
| `WP02-B2-CHICKPEA-FLOUR-R284-20261016-S04` | Health Canada, [Canadian Nutrient File: Chickpea flour (besan), food code 4886](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4886), available serving sizes; page modified 2019-03-01. | Reports 100 ml = 38.9 g, 125 ml = 48.6 g, and 250 ml = 97.2 g for this named food code. Not assigned to the generic row and not a current retail package measure. |
| `WP02-B2-CHICKPEA-FLOUR-R284-20261016-S05` | Mohammed, Ahmed & Senge, [“Dough rheology and bread quality of wheat–chickpea flour blends”](https://www.sciencedirect.com/science/article/pii/S0926669011003815), *Industrial Crops and Products* 36(1), 2012, 196–202, DOI 10.1016/j.indcrop.2011.09.006; publisher abstract. | Tests 10%, 20%, and 30% wheat replacement in bread and reports altered absorption, stickiness at 20–30%, and a control-like loaf at 10%. Formula-specific. Direct page access returned 403; no full-text methods review is claimed. |
| `WP02-B2-CHICKPEA-FLOUR-R284-20261016-S06` | Felisiak et al., [“Effect of Chickpea (*Cicer arietinum* L.) Flour Incorporation on Quality, Antioxidant Properties, and Bioactive Compounds of Shortbread Cookies”](https://www.mdpi.com/2304-8158/13/15/2356), *Foods* 13(15), 2356 (2024), DOI 10.3390/foods13152356; publisher-indexed article and search result. | Reviews 25–100% replacement in one named shortbread formulation and its sensory/quality outcomes. Formula-specific. Direct page access returned 429; no full-text review is claimed. |
| Reused `WP02-S25`, `WP02-S26`, `WP02-S29` | Existing ledger sources on `ingredient-ref-chickpea-flour`: Cuisine Soleil French product list and bilingual portfolio; Health Canada exact French ingredient wording. | Reused only for the already accepted generic bilingual identity and French spelling; none supports the new measurement or substitution observations. |
| Reused `WP02-B2-DESI-CHICKPEA-FLOUR-20261012-S03` | OQLF, [“pois chiche” (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296897/pois-chiche), updated 2026. | Supports the Québec French base term `pois chiche`, English `chickpea` / `garbanzo`, and the species/type boundary; does not establish a full flour-product name or any numeric behavior. |

## Verification record

Re-read the current `AGENTS.md`, `Requirements.md`, WP02 checklist, roadmap, R281–R283 integration note, and the chickpea-flour identity / roasted-gram proposal archive. Rechecked live reference, form, substitution-rule, and ledger state; source-ID and exact-URL ownership; current phrase-search behavior; and the 114-file / 1,123-row bundled corpus. Refreshed the online product, food-composition, terminology, and research sources listed above. This proposal records the R284 research; shared ledger and checklist integration is documented in the linked README. No software tests, build, or emulator checks were run.
