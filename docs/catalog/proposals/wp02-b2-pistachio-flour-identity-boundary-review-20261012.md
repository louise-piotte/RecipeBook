# WP02 B2 — Pistachio flour identity and product-boundary review

- **Reviewed:** 2026-10-12.
- **Status:** Proposal only. No canonical reference, ledger, plan, roadmap, recipe, generated file, or test was changed.
- **Scope:** One previously unreviewed B2 nut-flour candidate: pistachio flour. This review does not reopen existing almond, hazelnut, chestnut, peanut, pistachio paste, pistachio butter, or whole-pistachio decisions.
- **Recommendation:** Accept one identity-only flour reference, with the scope and exclusions below.
- **Proposed ID:** `ingredient-ref-pistachio-flour` (unreserved; absent from active references, forms, legacy candidates, and ledger record IDs).
- **Proposal-local source prefix:** `WP02-B2-PISTACHIO-FLOUR-IDENTITY-20261012` (no prefix collision found in the current ledger, proposal, or batch archive).

## Recommendation

Accept **`pistachio flour / farine de pistache`** as one `FLOUR_AND_STARCH` identity for finely milled pistachio kernels. Canadian baking-supply evidence names and sells a product as pistachio flour; the current Canadian Food Inspection Agency (CFIA) French import classification separately names the category `farine, semoule et poudre de pistache`. The Office québécois de la langue française (OQLF) confirms `pistache` as the Québec term for *Pistacia vera*. Together these support a distinct flour identity and the fr-CA display `farine de pistache`. The OQLF entry is for the nut, not a flour product, and no standalone Québec retail package with a French pistachio-flour label was found. [S01–S03, S07]

Limit this identity to pistachio kernels milled as flour. Do not include an explicitly **defatted** pistachio press-cake flour: a current French maker describes that product as roasted pistachios pressed to extract oil, then ground. Keep it as a separate, held product candidate pending Canadian/Québec product scope and naming review. This source demonstrates that the qualifier marks a meaningful process boundary; it does not establish that all unqualified flour products share a universal specification. [S04–S05]

Add no aliases. In particular, do not map `ground pistachios`, `pistachio meal`, `pistachio powder`, or `poudre de pistache` to this identity. `Ground pistachios` is the wording of an existing whole-pistachio recipe line; CFIA's grouped customs class for flour, meal, and powder is not a synonym ruling. Keep pistachio paste and pistachio butter on their current separate rows. [S02–S03, S06]

| Candidate wording or behavior | Disposition | Boundary |
|---|---|---|
| `pistachio flour` | **Accept as English display** for one identity-only flour reference. | A current Canada-facing specialty supplier sells a 100% pistachio product under this name. The proposal does not claim a universal roasting, grind, or fat specification. [S03] |
| `farine de pistache` | **Accept as fr-CA display**, with the evidence limit recorded. | CFIA uses the exact singular construction in its French import class and OQLF supports `pistache` as the Québec name for the nut. This is not an OQLF flour entry or a Québec retail package attestation. [S01–S02] |
| `defatted pistachio flour` / `farine déshuilée de pistache` | **Hold as a separate future candidate.** | Oil extraction changes the product; do not alias it to the proposed whole-kernel flour. Require a Canadian/Québec product review before assigning a separate row or French display. [S05] |
| `pistachio meal`, `pistachio powder`, `poudre de pistache`, `pistaches moulues`, `ground pistachios` | **Do not add as aliases.** | Sources use overlapping flour/meal/powder wording, while the recipe corpus specifically uses ground whole pistachios. Exact wording alone does not establish equivalent product scope or picker ownership. [S02–S03, S06] |
| `pistachio paste`, `pâte de pistache`, `pistachio butter`, `beurre de pistache` | **Keep on existing identities.** | The active catalog already treats paste, butter, and whole pistachios as separate products. [S03] |
| Density, household measure, forms, conversions, or substitutions | **No additions.** | Available numbers are product-specific advice or an unverified conversion estimate; none supports a reusable catalog value. [S04–S06] |

## Workspace and candidate audit

The B2 plan names alternative nut and pulse flours and records prior decisions for almond, hazelnut, coconut, chestnut, peanut, chickpea, lentil, pea, soy, and lupin. Its surrounding work also covers sesame, sunflower, pumpkin-seed, flax, and multiple regional pulse flours. The repository search found no prior focused pistachio-flour proposal, batch, ledger candidate, or canonical identity. The existing WP03 whole-tree-nut review mentions pistachios as whole nuts and treats their recipe-specific ground/chopped states as line-level wording; it does not review a flour product. This proposal is only the pistachio-flour identity boundary.

Read-only snapshot of the shared workspace on 2026-10-12:

| Surface | Count | SHA-256 |
|---|---:|---|
| Active ingredient references | 1,288 | `d20bc95f97b8d78ee6709655f3321ff000925c135862fd15cbc52e7d85e473ad` |
| Ingredient forms | 98 | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import candidates | 64 | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research-ledger records | 1,596 | `91c80a5c5fc283dbdea2b1e6bda350f0eb1caf08ca8e4a596bd0a99cd5e9ceb1` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

Accent-, case-, and punctuation-normalized exact-name checks found no owner for `pistachio flour`, `farine de pistache`, `pistachio meal`, `pistachio powder`, `poudre de pistache`, or the explicitly defatted flour phrases in active reference names/aliases, form labels/match terms, or legacy candidates. The same candidate phrases and source-ID prefix were absent from the current ledger, proposals, and batch archives before this proposal was written.

Current nearby owners are:

| Active ID | Current wording | Result |
|---|---|---|
| `ingredient-ref-pistachios` | `pistachios / pistaches`; French alias `miettes de pistaches salées ou non salées` | Keep whole nuts and their recipe-specific preparation wording here. |
| `ingredient-form-pistachios-chopped` | `chopped pistachios / pistaches hachées`, under `ingredient-ref-pistachios` | Keep chopped nuts as a form of whole pistachios. |
| `ingredient-ref-pistachio-paste` | `pistachio paste / pâte de pistache` | Preserve as a separate paste product. |
| `ingredient-ref-pistachio-butter` | `pistachio butter / beurre de pistache` | Preserve as a separate butter product. |

No exact English or French alias is proposed; the displays themselves provide the precise flour queries. Adding an alias for the shorter singular `pistachio` or `pistache` would broaden product search unnecessarily. The source and catalog evidence does not justify `ground pistachios` as a flour alias.

## Search behavior and collisions

This is a code-path analysis of `IngredientReferenceSearchIndex` in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`, not a live UI test. The index returns complete word-phrase matches first and uses substring fallback only if no complete phrase matches.

| Query | Current result behavior | If the proposed row is added |
|---|---|---|
| `pistachio flour` | No match. | Exact match to `ingredient-ref-pistachio-flour`. |
| `farine de pistache` | No match. | Exact match to the proposed row. |
| `pistachios` / `pistaches` | Whole pistachios row; the French plural also finds the chopped-pistachio form. | Same whole-food ownership; the proposed singular flour display does not contain the plural query. |
| `pistachio` / `pistache` | Existing paste and butter displays already contain the complete singular phrase, so phrase matching returns those product rows before substring fallback to the whole-nut row. | The flour row joins the related-product results. The whole-nut row remains available under its plural display query; it was already omitted for the singular query before this proposal. |
| `ground pistachios` / `pistaches moulues` | No exact active owner. | Still no match; do not make these misleading flour aliases. The recipe phrase refers to ground whole nuts. |
| `pistachio meal`, `pistachio powder`, `poudre de pistache` | No exact owner. | No result until evidence justifies separate aliases or identities. |

The current broad singular-query results already contain two related products. Adding a flour reference expands those results to three; it does not take the current plural whole-pistachio query away from the whole-nut reference. This limited search behavior does not justify assigning whole-nut preparation terms to flour.

## Recipe demand and numeric limits

The ordered manifest scan covered **114 recipe files and 1,123 ingredient rows**. Its ordered, NUL-separated file-byte fingerprint is `d9e2607a7922c510f9a586a851cc5bc6792180b08fab5b55654f7e575535761d`. It found **zero** occurrences of the flour candidate phrases in recipe text or ingredient rows and zero flour ingredient lines.

There are six pistachio-related ingredient lines across three recipes, all owned by existing products: recipe 017 has `130 g pistachios, finely ground`; recipe 056 has two pistachio-paste lines and a chopped-pistachio garnish; recipe 081 has two whole-pistachio volume lines. The 017 line supports recipe demand for whole pistachios ground during preparation, not for a retail flour identity. Do not relink it. Recipe 081's cup measures apply to whole pistachios, not flour.

- The Canadian product listing offers package sizes of 100 g, 400 g, and 900 g. Package weights do not establish a cup measure or density. [S03]
- A Canadian maker's currently out-of-stock whole-organic-pistachio-flour page advises replacing up to 30% of wheat flour in recipes. A French maker advises 10–20% of wheat flour for its explicitly defatted product. These are product-specific formulation suggestions for different products, not a universal substitution rule. [S04–S05]
- A conversion website lists **105 g per US cup** for “pistachio flour,” but does not identify a product grade or reproducible packing method. Treat it only as a secondary estimate, not a catalog measure or density. [S06]

Keep `defaultDensity: null`, `unitMappings: []`, and forms, conversions, yields, recipe links, and substitutions empty. The evidence does not establish a generic density, a universal household measure, or equivalence to almond flour, wheat flour, whole pistachios, pistachio meal, or pistachio powder.

## Exact future integration delta

If accepted, add only an identity-only row with:

```json
{
  "id": "ingredient-ref-pistachio-flour",
  "nameEn": "pistachio flour",
  "nameFr": "farine de pistache",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "FLOUR_AND_STARCH"
}
```

Add the proposal sources to a ledger record for that ID, preserving the accepted scope and the stated research limits; regenerate the bundled ingredient search index from canonical references. Do not create a form or recipe link, alter whole-pistachio/paste/butter records, or add numerical or substitution data. No integration or tests are part of this proposal-only change.

## Sources

Sources were accessed online on **2026-10-12**. Source IDs are proposal-local and were checked against the current research ledger before use.

| ID | Source and evidence | Limits |
|---|---|---|
| **WP02-B2-PISTACHIO-FLOUR-IDENTITY-20261012-S01** | Office québécois de la langue française, [pistache (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297124/pistache). Preferred French term `pistache`; English terms `pistachio nut` and `pistachio`; Latin name *Pistacia vera*. | Updated 1990 and scoped to the nut, not a flour product or flour display. |
| **WP02-B2-PISTACHIO-FLOUR-IDENTITY-20261012-S02** | Canadian Food Inspection Agency, [Regulatory requirements and licence conditions for importing pistachio products (French)](https://inspection.canada.ca/fr/importation-aliments-vegetaux-ou-animaux/importation-daliments/exigences-propres-certaines-denrees/exigences-reglementaires-conditions-licence-limportation-produits-pistaches), dated 2025-12-02. The French import class includes `Farine, semoule et poudre de pistache`; paste/butter/spread appear in a separate class. | Regulatory import classification, not a retail-name standard, product-process definition, or synonym ruling among flour, meal, and powder. |
| **WP02-B2-PISTACHIO-FLOUR-IDENTITY-20261012-S03** | Gusta Supplies / Verdoro, [Bronte D.O.P. Sicilian Pistachio Flour](https://supplies.gusta.ca/products/bronte-pistachio-flour-verdoro). The Canada-facing Markham, Ontario specialty supplier lists 100 g, 400 g, and 900 g sizes, describes a 100% Bronte pistachio product, lists `Pistachios` as the ingredient, and showed one unit in stock with further preorder available. | Direct page retrieval returned a cache miss; the source search index returned the page's current product text. Product-specific flour evidence; it does not define universal roasting, grind, fat, or household-measure specifications. |
| **WP02-B2-PISTACHIO-FLOUR-IDENTITY-20261012-S04** | Nomz, [Organic Pistachio Flour](https://nomz.com/products/organic-pistachio-flour). Canadian storefront priced in CAD; the maker describes this product as made with whole organic pistachios and recommends replacing up to 30% of wheat flour. | The product page showed out of stock when accessed. Whole-nut composition and replacement advice are specific to the maker's product; no package mass or cup measure is provided on the page. |
| **WP02-B2-PISTACHIO-FLOUR-IDENTITY-20261012-S05** | La Maison de la Pistache, [Farine déshuilée de pistache](https://www.pistaches.com/product-category/cuisine/farines/). Describes roasted pistachios pressed to extract oil, with the remaining material milled into flour; advises using its product at 10–20% alongside wheat flour. | French-market product evidence, not Canadian/Québec availability or a generic substitution recommendation. Supports holding this process-qualified product apart. |
| **WP02-B2-PISTACHIO-FLOUR-IDENTITY-20261012-S06** | TwoCups, [Pistachio flour grams-per-cup conversion](https://twocups.com/ingredients/pistachio-flour). Lists 105 g per US customary cup and notes that packing method affects conversion. | Secondary calculator; no source product, sample method, grind, or fat status is identified. Not accepted as a catalog value. |
| **WP02-B2-PISTACHIO-FLOUR-IDENTITY-20261012-S07** | Walmart Canada French-market [bulk pistachio flour listing](https://www.walmart.ca/fr/ip/Farine-de-Pistache-en-Vrac-Service-Alimentaire-25-lbs-11-33-kgs/2SOHYDDHXXTJ). The listing uses `farine de pistache` and a 25 lb / 11.33 kg bulk name. | Third-party Marketplace listing with zero reviews and no visible ingredient/process panel; its seller is not treated as a Québec terminology authority or relied on to establish flour composition. |

## What remains open

- Review any future Canadian/Québec standalone package that uses a French flour name; the proposed `farine de pistache` is supported by OQLF's base term and CFIA's French commodity class, not by a Québec flour-specific label.
- Keep explicitly defatted pistachio flour outside this identity until a separate Canadian/Québec product review decides whether it merits a distinct reference and display.
- Revisit aliases only if Canadian/Québec product sources establish stable use. Until then, keep `pistachio meal`, `pistachio powder`, `poudre de pistache`, and `ground pistachios` out of the new row.
- Revisit numeric data only with a product and method-specific household measure source. No recipe demand or transferable density is established here.
