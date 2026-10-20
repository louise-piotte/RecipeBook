# WP04 Section P — unqualified eel identity and search boundary review

- **Packet type:** identity and search-boundary review; the recommendation is integrated as an unresolved ledger candidate. No active catalog, recipe, search, or code behavior changed.
- **Review date:** 2026-10-11.
- **Decision:** keep unqualified **eel / anguille** unresolved as a global ingredient identity. Retain the existing species-scoped `American eel / anguille` reference unchanged. Record the generic query collision: searching `eel` currently returns that species row because `eel` is a complete word in its English display name, not because it has a generic alias.
- **Scope:** current naming and product evidence for unqualified eel. This does not reopen the verified American eel identity, the salmon/tuna packet, or the earlier bonito/katsuobushi decision.

## Current catalog, ledger, search, and prior-review audit

The live worktree snapshot contains **1,026 ingredient references**, **70 forms**, **1,313 research-ledger records**, and **75 legacy-import candidates**. The bundled manifest lists **114 recipes** containing **1,123 ingredient rows**.

The only active eel-named reference is:

| Field | Live value |
|---|---|
| ID | `ingredient-ref-american-eel` |
| English / French display | `American eel` / `anguille` |
| Aliases | none in either language |
| Forms | none |
| Category | `PROTEIN` |
| Ledger state | `verified` species-scoped identity; measurements and substitutions remain `not_yet_researched` |

There is no active generic `eel` reference, no eel form, no `ingredient-ref-eel` or `ingredient-ref-unqualified-eel` ledger key, and no eel wording in the legacy-import candidates. Exact normalized search phrases have these live owners:

| Query | Live reference results |
|---|---|
| `eel` | `ingredient-ref-american-eel` — `American eel / anguille` |
| `eels` | none |
| `anguille` | `ingredient-ref-american-eel` — `American eel / anguille` |
| `anguilles` | none |
| `unagi`, `anago`, `conger` | none |

The active row has no `eel` alias. The picker result follows the phrase-search behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): the query `eel` matches the full word in `American eel`. That result is therefore a species row selected by a broad word query; it does not establish that generic eel and American eel are equivalent.

This keeps the prior review boundary intact. The [2026-10-09 seafood coordinator review](wp04-seafood-coordinator-review-20261009.md) advanced American eel / `anguille` as an identity for *Anguilla rostrata* and explicitly withheld a bare global `eel` alias because other eel products and taxa exist. The [2026-10-09 finfish follow-up](wp04-finfish-species-followup-20261009.md) lists American eel among already represented species. This packet does not alter that accepted identity; it rechecks the unqualified term against current Canadian naming and product evidence and records its present picker consequence.

## Canadian and Québec naming and product evidence

The current CFIA Fish List assigns the exact common names **Eel / Anguille** to more than one species: *Anguilla dieffenbachii*, *A. japonica*, and *A. rostrata*. It also lists *A. rostrata* under **American eel / Anguille américaine**, and gives *A. australis* the more qualified **Short-finned Eel / Anguille d’Australie** names. Separately, it lists *Conger* spp. as **Conger Eel** (with **Conger / Congre** as another entry). Thus the English word “eel” appears in approved names spanning multiple taxa, and the exact bilingual pair `Eel / Anguille` is not unique to the active American eel species [S01].

The CFIA guidance says its Fish List supplies common names for labeling fish sold or processed in Canada and directs commercial users to the names listed for each species [S02]. That is authoritative Canadian labeling evidence. It does not prescribe recipe search aliases or turn the label word `eel` into one culinary identity.

The OQLF food-fish entry for `anguille` maps the normalized Québec term to **American eel**, *Anguilla rostrata*, and marks `anguille américaine` as France/Europe wording [existing ledger source `WP04-SEA-GAP-20261009-S03`, reopened 2026-10-11]. This supports the existing Québec-facing display for the species. It does not establish that every product or imported food called “eel” is American eel.

Québec product listings confirm actual but differently scoped uses of the name. Les Saveurs du Bas-Saint-Laurent describes the Rivière-Ouelle producer Les Trésors du fleuve as eel fishers and lists locally caught eel products including smoked eel, eel preserves (`merrine d’anguille`), and eel sausage [S03]. Frandon’s current French product list uses `anguille unagi tranchée fumée`; its English page calls the item `smoked sliced unagi eel` [S04]. Neither listing supplies a scientific name, so neither identifies those products as *A. rostrata* or establishes that smoked/unagi is a form of the active row.

A Canadian seafood seller likewise lists frozen roasted **Unagi** and separate frozen **Anago Conger** fillets. Its product descriptions call unagi freshwater eel and anago saltwater eel [S05–S06]. These first-party commercial descriptions show distinct market product names and presentation, but provide no binomial and are not taxonomic authority. They support keeping the terms as product cues for future recipe-led review rather than adding them as aliases now.

## Exact bundled-recipe demand

I scanned all **114 manifest-listed recipe files**, all **1,123 ingredient rows**, and all recipe JSON string fields using complete normalized word-phrase matching. Terms included `eel`, `eels`, `American eel`, `European eel`, `Japanese eel`, `freshwater eel`, `saltwater eel`, `smoked eel`, `anguille`, `anguilles`, `anguille d’Amérique`, `anguille fumée`, `unagi`, `anago`, and `conger`.

- Direct ingredient-line matches: **0**.
- Any recipe-field matches: **0**.
- No eel-specific recipe link, amount, preparation state, or substitution target is present.

The current bundled corpus therefore supplies no reason to add an unqualified eel identity, alias, or product form.

## Recommendation and boundary

Keep `ingredient-ref-american-eel` as the only eel-related active reference. Do not add a generic `eel / anguille` row, do not add bare `eel` or `anguilles` aliases, and do not map `unagi`, `anago`, `conger`, or smoked eel to American eel. Preserve the existing French display `anguille`, whose Québec terminology source is species-specific.

Record the current `eel` picker result as a search-boundary concern for future UI/search review. This proposal does not recommend changing the search implementation or suppressing the word from the species name. A future generic seafood recipe should be reviewed against its recipe wording and product context; a species-qualified or named retail product should retain that qualifier. CFIA label names, OQLF terminology, Québec fish-product listings, and culinary product descriptions answer different questions and should not be treated as interchangeable naming standards.

No density, measure, form, conversion, recipe link, yield, or substitution is proposed. Measurements and culinary replacement were not researched because there is no selected generic identity or recipe demand.

## Exact held candidate ledger JSON

This is a proposal-only unresolved candidate record. It is not present in the shared ledger and does not add an active ingredient reference.

```json
{
  "recordId": "candidate-unqualified-eel-identity-boundary",
  "recordType": "candidate",
  "identityState": "needs_clarification",
  "measurementState": "not_yet_researched",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP04-EEL-GENERIC-20261011-S01",
      "url": "https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=eel",
      "title": "Canadian Food Inspection Agency, CFIA Fish List search results for eel",
      "accessedOn": "2026-10-11",
      "locator": "Rows for Anguilla australis, A. dieffenbachii, A. japonica, A. rostrata, and Conger spp.; English and French common-name columns.",
      "supports": "Lists Eel / Anguille for A. dieffenbachii, A. japonica, and A. rostrata; separately lists American eel / Anguille américaine for A. rostrata, a more qualified Short-finned Eel / Anguille d’Australie for A. australis, and Conger Eel for Conger spp. This is Canadian fish-label naming evidence, not a recipe synonym or culinary-equivalence rule.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-EEL-GENERIC-20261011-S02",
      "url": "https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names",
      "title": "Canadian Food Inspection Agency, Guidance on determining the common names for fish sold or processed in Canada",
      "accessedOn": "2026-10-11",
      "locator": "Purpose and Fish List common-name instructions.",
      "supports": "Describes the Fish List as the source of English and French common names used to label commercial fish in Canada. It governs labeling naming scope; it does not prescribe recipe search aliases or establish a single culinary identity for every use of the word eel.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SEA-GAP-20261009-S03",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199945/anguille",
      "title": "Office québécois de la langue française, anguille (GDT)",
      "accessedOn": "2026-10-09",
      "locator": "Existing source reused from the verified American eel ledger record; preferred term and English/Latin equivalences. Reopened 2026-10-11.",
      "supports": "Normalizes Québec food-fish anguille to American eel, Anguilla rostrata, and labels anguille américaine as France/Europe wording. Supports the current species-scoped row, not generic eel across taxa or imported products.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-EEL-GENERIC-20261011-S03",
      "url": "https://saveursbsl.com/membre/les-tresors-du-fleuve/",
      "title": "Les Saveurs du Bas-Saint-Laurent, Les Trésors du fleuve",
      "accessedOn": "2026-10-11",
      "locator": "Producer description and listed products for the Rivière-Ouelle fishers and transformers.",
      "supports": "Documents Québec eel fishing and products described as smoked eel, merrine d’anguille, and eel sausage. The profile does not identify a scientific species and does not establish that any processed product is a form of the active American eel reference.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-EEL-GENERIC-20261011-S04",
      "url": "https://frandon.ca/produits/",
      "title": "Frandon Seafoods, Produits",
      "accessedOn": "2026-10-11",
      "locator": "Specialty smoked-products list; French entry ANGUILLE UNAGI TRANCHÉE FUMÉE and English entry SMOKED SLICED UNAGI EEL.",
      "supports": "Confirms current French/English product wording for smoked sliced unagi eel in a Québec-facing list. It supplies no binomial and does not establish an alias or form relation to American eel.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-EEL-GENERIC-20261011-S05",
      "url": "https://shop.dailyseafood.ca/products/60ecbcb8230b9f003248b21b",
      "title": "Daily Seafood, Eel - Unagi Premium Roasted (200 gm)",
      "accessedOn": "2026-10-11",
      "locator": "Product name and seller description of unagi, frozen roasted product, and kabayaki preparation.",
      "supports": "A Canadian seller markets a frozen roasted eel product as unagi and describes the term as Japanese for freshwater eel. The listing gives no scientific species and is product-market evidence only.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-EEL-GENERIC-20261011-S06",
      "url": "https://shop.dailyseafood.ca/products/60f42322bed6b7002d92caf8/eel-anago-conger-premium-japanese-fillets-250-gm",
      "title": "Daily Seafood, Eel - Anago Conger Premium Japanese Fillets (250 gm)",
      "accessedOn": "2026-10-11",
      "locator": "Product name, origin, frozen fillet presentation, and seller description distinguishing anago from freshwater unagi.",
      "supports": "A Canadian seller lists a separate Japanese-origin frozen anago/conger eel product and describes it as saltwater eel. The listing gives no binomial; it does not authorize anago or conger as a synonym for American eel.",
      "sourceKind": "other"
    }
  ],
  "decisions": [
    {
      "outcome": "unresolved",
      "reason": "Keep unqualified eel / anguille unresolved as a global identity. CFIA applies Eel / Anguille to multiple Anguilla species and separately lists Conger Eel; OQLF’s Québec food-fish entry scopes anguille to American eel. Québec and Canadian product listings show local smoked eel and distinct unagi/anago products but provide no species-level link for those products. No eel term appears in the bundled recipe corpus. Retain ingredient-ref-american-eel unchanged; add no generic reference, alias, form, measurement, recipe link, conversion, yield, or substitution. The current query eel result is the species row’s own display-name match, not a generic identity.",
      "sourceIds": [
        "WP04-EEL-GENERIC-20261011-S01",
        "WP04-EEL-GENERIC-20261011-S02",
        "WP04-SEA-GAP-20261009-S03",
        "WP04-EEL-GENERIC-20261011-S03",
        "WP04-EEL-GENERIC-20261011-S04",
        "WP04-EEL-GENERIC-20261011-S05",
        "WP04-EEL-GENERIC-20261011-S06"
      ]
    }
  ]
}
```

The new `WP04-EEL-GENERIC-20261011-S01`–`S06` source IDs and `candidate-unqualified-eel-identity-boundary` key were checked against the live ledger before use. The OQLF source ID is intentionally reused from the accepted American eel record.

## Source register

| ID | Source | Use and limit |
|---|---|---|
| **WP04-EEL-GENERIC-20261011-S01** | CFIA, [Fish List search results for eel](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=eel) | Taxon-to-common-name evidence for the listed species. The CFIA list is Canadian labeling nomenclature, not a culinary synonym system. |
| **WP04-EEL-GENERIC-20261011-S02** | CFIA, [Guidance on determining the common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) | Explains that listed English/French names are used for Canadian commercial fish labeling; does not define recipe aliases. |
| **WP04-SEA-GAP-20261009-S03** (existing) | OQLF, [anguille (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199945/anguille) | Reused from the existing American eel ledger record; Québec food-fish term and species mapping, not a generic eel taxonomy. |
| **WP04-EEL-GENERIC-20261011-S03** | Les Saveurs du Bas-Saint-Laurent, [Les Trésors du fleuve](https://saveursbsl.com/membre/les-tresors-du-fleuve/) | Québec producer/fishery and local product wording; no scientific species. |
| **WP04-EEL-GENERIC-20261011-S04** | Frandon Seafoods, [Produits](https://frandon.ca/produits/) | Québec-facing French/English smoked-unagi product wording; no scientific species. |
| **WP04-EEL-GENERIC-20261011-S05** | Daily Seafood, [Eel - Unagi Premium Roasted](https://shop.dailyseafood.ca/products/60ecbcb8230b9f003248b21b) | Canadian seller’s product listing and seller explanation of unagi; no binomial. |
| **WP04-EEL-GENERIC-20261011-S06** | Daily Seafood, [Eel - Anago Conger Premium Japanese Fillets](https://shop.dailyseafood.ca/products/60f42322bed6b7002d92caf8/eel-anago-conger-premium-japanese-fillets-250-gm) | Canadian seller’s separate anago/conger listing; product description, not taxonomy. |

## Coordinator integration

Integrated the exact held candidate record as `candidate-unqualified-eel-identity-boundary` with
`identityState: needs_clarification`. The seven source entries include six new source IDs and reuse
the existing OQLF `WP04-SEA-GAP-20261009-S03` entry. No active reference, alias, recipe link, form,
or search behavior changed. The current `eel` query still matches the display name `American eel`.
The matching Section P checklist, workflow status, and roadmap now record this hold. Package and
ledger validation passed; no tests were run because this change only adds database JSON data under
`AGENTS.md`. See the batch README for counts and fingerprints.
