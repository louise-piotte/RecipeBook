# WP04 Section P — Yellowfin tuna identity review

- **Review date:** 2026-10-14
- **Status:** Integrated by root on 2026-10-14 as an identity-only reference; a later R112 batch added the paired `thon albacore` search alias so the ambiguous short query returns both tuna species. See the [yellowfin batch README](../batches/wp04-section-p-yellowfin-tuna-identity-integration-20261014/README.md).
- **Scope:** Yellowfin tuna, *Thunnus albacares* (CFIA TSN 172423).
- **Recommendation:** Add one identity-only `PROTEIN` reference as **yellowfin tuna / thon à nageoires jaunes**, with no aliases, forms, measures, recipe links, conversions, yields, or substitutions.
- **Recipe boundary:** The bundled `1 tuna steak` remains linked to the existing generic tuna row because it does not name a species.

## Selection and ownership

The Section P finfish gap includes tuna and regional fish. The earlier generic salmon/tuna review preserved the recipe-facing `tuna / thon` identity and recorded an unresolved candidate for unqualified tuna recipes. It mentioned yellowfin among the tuna taxa but did not decide a species-scoped reference, its Québec display, or its picker projection. This review addresses that separate named-species gap; it does not assign the generic recipe line to yellowfin. See [the active Section P plan’s tuna review](../../RecipeBook-global-ingredient-catalog-plan.txt#L4658) and [the generic salmon/tuna scope review](wp04-finfish-salmon-tuna-species-boundary-recheck-20261011.md).

The current reference catalog contains the generic `ingredient-ref-tuna` (`tuna / thon`) with empty alias lists. There is no yellowfin reference or tuna-specific form. Exact ownership scans of active references, forms, legacy-import candidates, and ledger identities found no owner for `Yellowfin tuna`, `thon à nageoires jaunes`, *Thunnus albacares*, or `ingredient-ref-yellowfin-tuna`. The broader ledger record `candidate-wp04-tuna-species-scope` remains limited to unqualified recipe wording. A dedicated yellowfin proposal, integration, or candidate record was not found. The source-ID prefix `WP04-SECTIONP-YELLOWFIN-TUNA-R102-20261014` was unallocated at review time.

## Taxon and Canadian/Québec wording

CFIA’s Fish List query, modified **2023-09-18**, assigns TSN 172423 to *Thunnus albacares*. It lists the English names `Yellowfin Tuna` and `Yellowfin`, and also has the row `Tuna / Albacore` for this taxon. The same Fish List separately assigns `Albacore / Germon` and `Albacore Tuna / Thon` to *T. alalunga*. Do not use bare `albacore` or `albacore tuna` as an alias for yellowfin.

The Government of Québec’s fish-identity table, updated **2026-06-08**, pairs *T. albacares* with **thon albacore / Yellowfin tuna**. The Canada Gazette’s **2017-05-03** corrective notice confirms **thon à nageoires jaunes** as the French counterpart of **yellowfin tuna**, correcting a prior inversion with `thon obèse`. These official Canadian/Québec sources support both French phrases, but `albacore` is also attached to the distinct *T. alalunga* identity. Use the taxon-distinguishing display **thon à nageoires jaunes** and omit `thon albacore` from picker terms so an unqualified `albacore` query cannot select yellowfin alone.

## Product evidence, states, and measures

The current Montréal-based, Canada-wide food-service supplier Aliments Pearlmark lists *T. albacares* and sells yellowfin steaks, loins, saku blocks, cubes, and minced product. Its listed origins, cuts, pack sizes, and weights describe the supplier’s own products. A current Metro.ca listing also calls a frozen darne `thon albacore` and identifies *T. albacares*; this corroborates Québec retail wording and a frozen SKU, not a reusable catalog form or household measure.

The Québec government table cited here is being used only for its species/name crosswalk. This review does not infer raw-consumption safety or copy its food-safety categorization into recipe behavior. The commercial pages do not provide a universal preparation state or default quantity. Keep all forms, densities, unit mappings, measures, and cooking yields empty.

## Picker projection

The audit follows `IngredientReferenceSearchIndex`: normalized complete word phrases match first across display names, aliases, and form terms; substring fallback applies only when there are no complete phrase matches. The projection uses the proposed displays with both alias arrays empty.

| Search query | Current result | With proposed row | Boundary |
|---|---|---|---|
| `yellowfin tuna` | None | yellowfin tuna / thon à nageoires jaunes | Qualified English query selects the species identity. |
| `yellowfin` | None | yellowfin tuna / thon à nageoires jaunes | The species name is present in the display. |
| `thon à nageoires jaunes` | None | yellowfin tuna / thon à nageoires jaunes | Qualified Québec French query selects the same identity. |
| `tuna` / `thon` | Generic tuna / thon | Generic tuna / thon; yellowfin tuna / thon à nageoires jaunes | Broad queries remain multi-result and preserve generic tuna. |
| `albacore` / `albacore tuna` | None | None | Excluded to avoid mapping names shared across *T. albacares* and *T. alalunga*. |
| `thon albacore` | None | None | The Québec government’s term is documented as source evidence, not a picker alias, because the current search would also match the shorter ambiguous `albacore` query. |

The proposed display does not collide with the recent bluefin, chum-salmon, or shad identities. It does add a second result to generic tuna searches, which is appropriate for an explicitly species-qualified row. Keep the generic recipe linked to the existing broad identity.

## Bundled recipe demand and substitution

The complete manifest-listed corpus scan covered **114 recipe files, 1,123 ingredient rows, and 753,928 recipe-file bytes**. It found zero full-file hits and zero ingredient-row hits for `yellowfin`, `yellowfin tuna`, `thon à nageoires jaunes`, `thon albacore`, *Thunnus albacares*, and `albacore tuna`.

The only tuna ingredient line is recipe 111, line 1: `1 tuna steak`, linked to `ingredient-ref-tuna` with quantity `1` and unit `count`. It names no species, so it does not support a yellowfin recipe link or transfer of the generic tuna row’s source-specific steak observation. The Health Canada CNF has a Food Guide portion entry for fresh raw yellowfin, but that population serving value is not a recipe amount or a default measure for this row. No reviewed source establishes a role- and method-scoped substitution between yellowfin and generic tuna or another species. Add no recipe link, active measure, conversion, yield, or substitution rule.

## Proposed canonical reference

```json
{
  "id": "ingredient-ref-yellowfin-tuna",
  "nameEn": "yellowfin tuna",
  "nameFr": "thon \u00e0 nageoires jaunes",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-14T00:00:00Z",
  "category": "PROTEIN"
}
```

Do not add `albacore`, `albacore tuna`, `ahi`, `thon albacore`, `yellowfin tuna steak`, or the scientific name as aliases. The broad phrase `tuna / thon` is already represented by the existing generic row; the species-qualified names above are enough for an identity-only addition.

## Sources

Online sources were accessed **2026-10-14**. Source IDs below were proposal-local at review time; accepted source records are now in the shared ledger.

| Source ID | Source and date | Use and limit |
|---|---|---|
| `WP04-SECTIONP-YELLOWFIN-TUNA-R102-20261014-S01` | CFIA, [Fish List tuna query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=tuna), modified 2023-09-18. | Associates TSN 172423 with *T. albacares* and lists Yellowfin; also exposes the cross-species `Albacore` boundary. Canadian fish-name source, not culinary or recipe-equivalence evidence. |
| `WP04-SECTIONP-YELLOWFIN-TUNA-R102-20261014-S02` | Gouvernement du Québec, [Risques associés à la consommation de poisson et exigences](https://www.quebec.ca/sante/alimentation/salubrite-aliments-prevention-risques/etablissements-alimentaires/precautions-aliments-dangereux/poisson), updated 2026-06-08. | Species/name table pairs *T. albacares* with `Thon albacore / Yellowfin tuna`. This review uses the page for nomenclature only, not raw-fish safety behavior. |
| `WP04-SECTIONP-YELLOWFIN-TUNA-R102-20261014-S03` | Canada Gazette, [Corrective Regulations (Fisheries and Oceans)](https://gazette.gc.ca/rp-pr/p2/2017/2017-05-03/html/sor-dors58-fra.html), published 2017-05-03. | Confirms `thon à nageoires jaunes` as the French term corresponding to `yellowfin tuna`, and distinguishes it from `thon obèse`. Regulatory terminology evidence. |
| `WP04-SECTIONP-YELLOWFIN-TUNA-R102-20261014-S04` | Aliments Pearlmark, [Thon — *Thunnus albacares*](https://www.pearlmarkfoods.com/fr/nos-produits/thon), accessed 2026-10-14; page footer ©2026. | Canadian supplier serving Québec names the species and lists yellowfin steaks, loins, saku, cubes, and minced product. Seller-specific cuts and package quantities are not general forms or measures. |
| `WP04-SECTIONP-YELLOWFIN-TUNA-R102-20261014-S05` | Metro.ca, [Darne de thon albacore surgelée](https://api.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/emballes-et-en-vrac/darne-de-thon-albacore-surgelee/p/225452), accessed 2026-10-14; page surfaced in current search results. | Québec retailer item identifies `Thunnus albacares`, describes a frozen darne, and shows the French product wording `thon albacore`. One SKU only; no reusable state, measure, or cooking guidance. |
| `WP04-SECTIONP-YELLOWFIN-TUNA-R102-20261014-S06` | Health Canada, [CNF serving portion 3085: fresh raw yellowfin tuna](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3085), record page modified 2019-03-01. | Lists a 90 g Food Guide portion and a 100 g edible portion for this CNF entry. These remain source-specific observations, not a recipe-linked measure or default. |

## Root integration (2026-10-14)

Accepted the identity-only reference `ingredient-ref-yellowfin-tuna` with no aliases. The ledger records
the Canadian and Québec species/name evidence and one CNF 90 g Food Guide portion as a source-specific
observation; that portion is not an active measure. The browser could not retrieve the Metro API page
listed as S05 during integration, so the accepted identity decision relies on CFIA, Québec, the Canada
Gazette, and Pearlmark; the retailer page remains limited corroboration in this proposal. Recipe 111
remains on generic tuna. No forms, recipe links, conversions, yields, or substitutions were added.

The generated catalog index now contains 1,444 references. Bundled package normalization and
validation, reference normalization, ledger validation, and generated-index freshness checks passed.
No app or Gradle tests were run because this change only adds database JSON data and its generated
index under `AGENTS.md`.
