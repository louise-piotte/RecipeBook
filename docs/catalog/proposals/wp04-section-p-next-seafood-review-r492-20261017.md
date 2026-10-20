# WP04 Section P R492 — smoked Arctic char identity review (2026-10-17)

- **Checklist:** The Section P preserved-fish parent remains open for smoked, salt-cured, dried, canned, oil-packed, water-packed, and fermented fish/seafood ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L7323)). Broader finfish identity coverage also remains open.
- **Candidate:** Smoked Arctic char / omble chevalier fumé as a named, species-specific finished-food market product.
- **Recommendation:** Add identity-only ingredient-ref-smoked-arctic-char as **smoked Arctic char / omble chevalier fumé** in PROTEIN, with empty aliases, no form, null density, and no unit mappings. Keep hot/cold smoke method, cut, ingredients, readiness, package details, and recipe quantities product-specific.
- **Status:** Proposal-only. No shared catalog JSON, ledger, generated output, roadmap, plan, workflow, manifest, or other proposal file was changed. This review proposes one recipe-scoped portion observation and one evidence-only no-substitute finding; it adds no active conversion, form, reusable measure, yield, recipe link, or substitution rule.
- **Proposal-local source IDs:** New external-source IDs WP04-SECTIONP-SMOKED-ARCTIC-CHAR-R492-20261017-S01 through S04, plus repository audit label WP04-SECTIONP-SMOKED-ARCTIC-CHAR-R492-20261017-R01. These R492 IDs remain unallocated. Reuse the existing Fumoir St-Antoine ID WP04-SECTIONP-SMOKED-EEL-R187-20261016-S04 for its already-owned URL.

## Why this is a distinct open gap

The active species identity is ingredient-ref-arctic-char, displayed as Arctic char / omble chevalier. The current finished-product identity ingredient-ref-smoked-trout covers the broader market wording smoked trout / truite fumée. R158 kept that row separate from raw trout species and did not assign every smoked-trout product a single fish species. R492 does not change either identity or add Arctic-char terms to the smoked-trout row.

Current Québec sources name smoked omble chevalier as a distinct product. Fumoir Monsieur Émile calls its product omble chevalier fumé and describes the fish as smoked at high temperature. Fumoir St-Antoine’s current menu lists truite fumée and omble chevalier fumé as separate items. Boucanerie Chelsea lists omble chevalier fumé à froid. Canadian supplier Salties lists Smoked Arctic Char, gives omble chevalier fumé in French, and identifies the species as *Salvelinus alpinus*. These sources support a named species-specific product group while showing that smoke temperature and presentation vary by product. The canonical names deliberately omit a smoke method, cut, brand, or supplier.

The separate product group keeps exact searches useful without redefining generic smoked trout. Do not add aliases for smoked trout, truite fumée, trout, truite, char, or omble. The French display is current Québec commercial wording; it is not presented as a standardized OQLF term for the finished smoked product.

## Proposed reference

Add one identity-only reference with the following fields:

| Field | Proposed value |
|---|---|
| ID | ingredient-ref-smoked-arctic-char |
| Category | PROTEIN |
| English display | smoked Arctic char |
| French display | omble chevalier fumé |
| English aliases | none |
| French aliases | none |
| Density | null |
| Unit mappings | none |

Do not attach a smoked form to raw Arctic char. The proposed row identifies the named finished product; the sources include hot- and cold-smoked examples and do not support one universal form specification. Do not add forms for fillet, sliced, hot-smoked, cold-smoked, ready-to-eat, or marinated products.

## Ownership, archive, and source audit

The current snapshot contains **1,769 active references**, **143 forms**, **56 legacy candidates**, and **2,127 research-ledger records** with **9,725 source entries**, **8,241 distinct source IDs**, and **6,954 distinct source URLs**.

| Surface | Current owner or evidence | R492 handling |
|---|---|---|
| Proposed identity | No active reference, form, legacy candidate, or ledger record owns ingredient-ref-smoked-arctic-char, smoked Arctic char, or omble chevalier fumé. | Propose one finished-product identity; do not create a legacy candidate. |
| Raw species | ingredient-ref-arctic-char owns Arctic char / omble chevalier and the English spelling alias Arctic charr. Its identity ledger record cites OQLF and DFO evidence for Salvelinus alpinus. | Keep the raw species unchanged. The new display is a prepared product name, not an alias or form of the raw row. Reuse existing species sources WP04-SEA-GAP-20261009-S01 and S02 if needed; do not duplicate their URLs. |
| Generic smoked trout | ingredient-ref-smoked-trout owns smoked trout / truite fumée without aliases. The R158 review treats it as a broader finished-food market group and records product-specific variation in fish, cut, and smoke method. | Keep the broad row and R158 decision unchanged. Do not add char names to its aliases. |
| Nearby smoked seafood | Separate active rows include smoked cod, smoked eel, smoked Greenland halibut, smoked haddock, smoked herring products, smoked lake whitefish, smoked mackerel, smoked salmon, smoked mussels, and smoked trout. | Preserve all species and product boundaries. Add no generic smoked-fish alias. |
| Other exact owners | Exact normalized scans of reference names/aliases, form labels/match terms, all 56 legacy candidates, and ledger record/source text found no owner for the proposed ID or full bilingual phrase. The shorter terms Arctic char and omble chevalier are intentionally owned by the raw species row. | Keep the exact product phrase distinct while preserving the expected raw-species results for shorter searches. |
| Prior proposal and batch archive | No focused smoked-Arctic-char or omble-chevalier-fumé identity decision, hold, or integration was found. The R488–R490 integration added canned cod liver, a separate fish-organ product; R483’s generic fish-burger hold is also unrelated and remains unchanged. R158 smoked trout is a neighboring product group, not an allocation of this species-specific name. | Treat R492 as a new, narrow product boundary review; leave earlier decisions intact. |
| Proposed source IDs | The R492 source-ID prefix and proposal path were unallocated at review time. | Keep new IDs S01–S04 and audit ID R01 proposal-local until integration. Reuse the existing St-Antoine source ID rather than allocating a duplicate. |
| Exact source URLs | The five R492 product-evidence URL entries are four new external URLs (S01–S04) plus the reused Fumoir St-Antoine menu URL. Each of the four new URLs has zero exact URL owners in the live ledger. The St-Antoine URL is already registered as WP04-SECTIONP-SMOKED-EEL-R187-20261016-S04. The OQLF and DFO species URLs are separate reused sources owned by WP04-SEA-GAP-20261009-S01 and S02. | Reuse existing IDs for the same URLs and extend the St-Antoine locator to the smoked-trout and smoked-omble entries; do not register duplicate URL entries. |

## Phrase-first picker projection

Projection follows normalized phrase-first matching and substring fallback in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It uses the current references, aliases, and forms plus only the proposed bilingual displays.

| Query | Current result | With proposed row |
|---|---|---|
| smoked Arctic char; omble chevalier fumé | None | ingredient-ref-smoked-arctic-char only |
| Arctic char; omble chevalier | ingredient-ref-arctic-char | Raw Arctic char plus smoked Arctic char |
| smoked trout; truite fumée | ingredient-ref-smoked-trout | Unchanged; the generic smoked-trout row remains the only result |
| trout; truite | 7 and 6 current results | Unchanged; the new display adds neither word |
| char | Arctic char and char siu sauce | Those two plus smoked Arctic char |
| smoked; fumé | 18 and 9 current results | 19 and 10; both remain broad multi-result searches |

The exact smoked-char phrases select the proposed product identity alone. Searching the shorter species name shows both raw and smoked options by their distinct labels. No alias would make a generic fish or trout query resolve to this product.

## Manifest recipe-demand audit

The manifest lists **114 recipe files and 1,123 structured ingredient rows**, totaling **753,988 bytes**. A manifest-ordered scan parsed every file and row and checked full recipe text for smoked Arctic char, smoked char, omble chevalier fumé, omble chevalier fumee, omble fumé, char fumé, Arctic char, omble chevalier, smoked trout, and truite fumée. It found **zero matching recipe files and zero matching ingredient rows**. The corpus fingerprint is 847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e.

There is no bundled recipe request, product state, amount, or method to link to this identity. The MAPAQ recipe source below demonstrates external Québec culinary use and supplies one recipe-scoped 100 g observation; it does not create bundled demand or a recipe link in this catalog. Do not migrate that amount into a bundled recipe or reuse it as a serving measure or conversion.

## Forms, numbers, conversions, and substitutions

- **Identity boundary:** Keep this species-specific product separate from raw Arctic char and generic smoked trout. Do not add other char or trout species as aliases.
- **Forms and methods:** Add no form. The reviewed Québec pages include hot- and cold-smoked products, and sellers differ in marinade, wood, cut, and presentation. Treat each detail as source-specific.
- **Measurements:** Preserve MAPAQ’s `100 g` line as one `portion_weight` observation tied only to its named six-portion recipe. The recipe does not allocate the amount per finished serving. Record `measurementState: researched_no_supported_value` for reusable values; add no unit mapping, density, package yield, conversion, or edible/cooked yield. The source’s approximate 3 oz wording is reported text, not a conversion.
- **Substitutions:** Record `substitutionResearchState: researched_no_supported_substitute` for the reviewed raw-Arctic-char and smoked-trout alternatives. MAPAQ uses raw Arctic-char flesh and smoked Arctic char as separate ingredients in different recipe roles; none of the reviewed product listings gives a transferable interchange amount or method. Add no global or contextual rule.
- **Ledger if accepted:** Add one ingredient-reference record for ingredient-ref-smoked-arctic-char with one recipe-scoped portion observation and one evidence-only substitution finding, as specified below. Add no form, reusable measure, yield, conversion, or recipe-line record.

### Proposed ledger evidence fields

Merge these fields into the new ingredient-reference record if the identity is accepted. The portion observation retains the source amount without creating a unit mapping; the substitution finding records the evidence boundary without proposing replacements.

```json
{
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "measurementObservations": [
    {
      "observationId": "smoked-arctic-char-mapaq-savarin-portion-r492-20261017",
      "relationship": "portion_weight",
      "value": 100,
      "valueUnit": "g",
      "sourceQuantity": { "amount": 100, "unit": "g" },
      "observedMassG": 100,
      "foodDescription": "Omble chevalier fumé in MAPAQ's Savarin d’omble chevalier, sauce à l’omble fumé recipe.",
      "foodState": "Named as smoked Arctic char; no further processing state is specified.",
      "measurementMethod": "The published ingredient list gives 100 g (approximately 3 oz); no weighing method is described.",
      "quantityBasis": "Recipe-wide ingredient amount in a recipe yielding six portions; the source does not give an amount per finished serving. Source-specific only, not a serving measure, reusable catalog value, or conversion.",
      "evidenceKind": "published_portion",
      "sourceIds": ["WP04-SECTIONP-SMOKED-ARCTIC-CHAR-R492-20261017-S04"]
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "smoked-arctic-char-no-supported-raw-char-or-smoked-trout-interchange-r492-20261017",
      "researchState": "researched_no_supported_substitute",
      "context": "Reviewed evidence for interchange between smoked Arctic char, the active raw Arctic-char identity, and the broader smoked-trout product group.",
      "basis": "MAPAQ's recipe lists raw Arctic-char flesh and smoked Arctic char as separate ingredients in different recipe roles; it gives no interchange instruction. The reviewed Québec smoked-char, smoked-trout, and Canadian smoked-char product listings identify distinct products but supply no transferable replacement amount or method.",
      "limitations": [
        "This finding covers the sources reviewed and does not claim that a dish-specific replacement could never be developed.",
        "Do not treat MAPAQ's 100 g recipe amount as a replacement ratio or a per-serving quantity.",
        "No global or contextual substitution rule or recipe-line substitution link is supported."
      ],
      "replacements": [],
      "sourceIds": [
        "WP04-SECTIONP-SMOKED-ARCTIC-CHAR-R492-20261017-S01",
        "WP04-SECTIONP-SMOKED-EEL-R187-20261016-S04",
        "WP04-SECTIONP-SMOKED-ARCTIC-CHAR-R492-20261017-S02",
        "WP04-SECTIONP-SMOKED-ARCTIC-CHAR-R492-20261017-S03",
        "WP04-SECTIONP-SMOKED-ARCTIC-CHAR-R492-20261017-S04",
        "WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S03",
        "WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S04"
      ]
    }
  ]
}
```

## Sources and limits

Sources were checked on 2026-10-17. Product pages support only the specific products and names they show; smoke method, fish origin, ingredients, and availability do not generalize across the proposed identity.

| Source ID | Source and evidence | Limit |
|---|---|---|
| WP04-SECTIONP-SMOKED-ARCTIC-CHAR-R492-20261017-S01 | Fumoir Monsieur Émile, Québec producer, [Produits](https://fumoir-monsieur-emile.com/produits/). The page names “Omble chevalier fumé,” describes its own product as hot-smoked, and identifies its char source as a Gaspésie aquaculture company. | One Québec maker’s product and processing description; does not establish a universal method, formula, ready-to-eat status, or package measure. |
| Reuse WP04-SECTIONP-SMOKED-EEL-R187-20261016-S04 | Fumoir St-Antoine, [Notre poissonnerie](https://www.fumoirstantoine.com/notre-poissonnerie), current fishmonger menu. It lists truite fumée separately from omble chevalier fumé. | Menu contents may change. The separate entries support product naming, not independent species identification or a universal cut or quantity. Reuse the existing URL owner. |
| WP04-SECTIONP-SMOKED-ARCTIC-CHAR-R492-20261017-S02 | Boucanerie Chelsea Smokehouse, [Product listing](https://www.boucaneriechelsea.com/product-listing), current product listing. It names “Omble chevalier fumé à froid” separately from smoked trout, rainbow trout, and other smoked fish products. | Seller-specific item names and method; not a standard for all smoked char. |
| WP04-SECTIONP-SMOKED-ARCTIC-CHAR-R492-20261017-S03 | Salties, Canadian supplier, [Smoked Arctic Char, Whole Filets](https://www.salties.ca/products/smoked-arctic-char-whole-filets). The current product page gives English “Smoked Arctic Char,” French “Omble chevalier fumé,” and Latin Salvelinus alpinus. | Canadian supplier page for its own product, sourced from Iceland; its smoke method, ready-to-enjoy language, and supplier details are not general catalog forms or Québec-origin claims. |
| WP04-SECTIONP-SMOKED-ARCTIC-CHAR-R492-20261017-S04 | MAPAQ, [Savarin d’omble chevalier, sauce à l’omble fumé](https://media.mapaq.gouv.qc.ca/pechesicimangesici/documents/Recettes_Omble_Chevalier_web.pdf), Québec seafood recipe publication prepared with ITHQ. The ingredient list specifies 100 g (approximately 3 oz) omble chevalier fumé in a recipe yielding six portions. | One external recipe; retain 100 g only as a recipe-scoped portion observation. The amount is not allocated per finished serving and does not support a reusable measure, conversion, or bundled recipe link. |
| Reuse WP04-SEA-GAP-20261009-S01 and S02 | OQLF, [omble chevalier](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198861/omble-chevalier), and Fisheries and Oceans Canada, [Arctic char profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/arctic-char-omble-chev-fra.html). Existing ledger sources establish the bilingual species name and Salvelinus alpinus. | Species evidence only; these sources do not define a smoked product or form. Reuse the existing source IDs and URL records. |
| WP04-SECTIONP-SMOKED-ARCTIC-CHAR-R492-20261017-R01 | Read-only audit of the [Section P plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L7323), live references/forms/legacy candidates/ledger, focused proposals and batches, IngredientSearch.kt, exact URL/source ownership, and all manifest-listed recipes. | Repository snapshot of ownership, picker projection, and corpus results; no external product claim. |

## Disposition

Recommend an identity-only **smoked Arctic char / omble chevalier fumé** reference with no aliases or forms. Keep the active raw Arctic-char and generic smoked-trout rows unchanged. The current Québec and Canadian evidence supports the named species-specific market product, while the proposed phrase-first behavior preserves the distinction between raw Arctic char, generic smoked trout, and smoked Arctic char. Preserve MAPAQ’s 100 g amount only as a recipe-scoped `portion_weight` observation; no reusable measure, conversion, form, recipe link, or yield is supported. Record the reviewed raw-char/smoked-trout comparison as `researched_no_supported_substitute` without adding a rule or replacement link.

No shared catalog, ledger, generated file, roadmap, plan, manifest, workflow, or other proposal file was changed by this review. No tests were run for this proposal-only documentation change.
