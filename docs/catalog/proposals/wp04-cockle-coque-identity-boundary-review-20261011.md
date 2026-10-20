# WP04 Section P — cockle/coque identity boundary review

- **Packet type:** terminology and identity-boundary review; coordinator integration recorded the unresolved candidate in the research ledger.
- **Review date:** 2026-10-11.
- **Scope:** the unreviewed checklist term `cockle / coque`; current Canadian labeling names, Québec terminology, Canadian/Québec product listings, active search ownership, and bundled recipe demand.
- **Disposition:** hold the unqualified culinary identity `cockle / coque`. Keep a candidate ledger record for the boundary. A future species-qualified `Clinocardium ciliatum` entry may be supportable, but current product listings and recipe lines do not select that species.

## Recommendation

Do not add an active reference for bare **cockle / coque**. OQLF's food-mollusc entry uses the preferred Québec term **coque**, pairs it with English **cockle**, and links it to *Clinocardium ciliatum*, a species it describes as having commercial potential in Québec. The current CFIA Fish List, however, also assigns French **Coque** to *Clinocardium nuttallii*; its English name is **Cockle**, while *C. ciliatum* is listed as **Hairy Cockle**. The exact French label therefore does not resolve one taxon across the current Canadian fish list.

Québec and Canadian product pages use plural **coques** or **palourdes coques** but do not identify a scientific species. They confirm culinary-market usage, not the taxon behind any particular unqualified recipe or product. The 114 bundled recipes contain no cockle/coque request. Hold the generic entry until a recipe or target product identifies the intended species or supplies a species-qualified market name.

The boundary is specific: do not merge this candidate with the existing generic clam hold or with *Mya arenaria* / **mye commune**. OQLF's `mye` entry concerns *Mya arenaria* and says broad alternatives including `coque` are not retained for that commercial species; the separate OQLF `coque` entry concerns *Clinocardium ciliatum*. If a concrete target later calls for the latter, review a species-qualified **coque d'Islande / Iceland cockle** identity, keeping unqualified `cockle` out of its aliases unless the target context supports that scope.

No active reference JSON is proposed. The exact candidate ledger JSON for the hold appears below. No forms, recipe links, measurements, conversions, yields, or substitutions are proposed.

## Naming, product, and labeling evidence

| Evidence | Finding | Limit |
|---|---|---|
| [OQLF, `coque` (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198883/coque) | In the food-mollusc domain, the preferred Québec term is `coque`; English is `cockle`; the linked Latin name is *Clinocardium ciliatum*. OQLF calls it a fishery species with commercial potential in Québec. | A species-specific terminology record; it does not prove every Canadian retail or culinary use of `cockle/coque` names this species. OQLF records `mye` as used in some contexts but says that term was not retained by the fisheries-products terminology committee. |
| [CFIA Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) | The current list returns TSN 80867, *Clinocardium ciliatum* — **Hairy Cockle / Coque**, and TSN 80873, *Clinocardium nuttallii* — **Cockle / Coque**, both in Cardiidae. | CFIA describes the Fish List as acceptable common names for Canadian fish labeling. It is labeling/name evidence, not a recipe synonym policy. The same French common name on two species prevents using bare `coque` as an unambiguous species assignment. See [CFIA Fish List guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names). |
| [Fisheries and Oceans Canada, 2010 Gulf Region mollusc survey](https://waves-vagues.dfo-mpo.gc.ca/Library/340859.pdf) | The report separately records family-level “Cockle unspecified / Bucarde (coque) non spécifié” and *Clinocardium ciliatum* as “Iceland cockle / Coque d'Islande.” | Historical fisheries-survey nomenclature supports both a broad family grouping and a species-qualified Québec/French name; it is not current retail labeling evidence. |
| [Clearwater, `Coques`](https://www.clearwater.ca/fr/seafood-industry/clams/coques/) | A Canadian seafood company markets **Coques** under **Palourdes**, describing a North Atlantic catch from its Canada-based fishing vessel and a blanched, individually quick-frozen product. | The page does not give a binomial or species-qualified name. Do not infer *C. ciliatum* from the region or product category. |
| [ProFishionals, Montreal `Palourdes coques`](https://www.profishionals.ca/fr/clams) | A Montréal seafood supplier lists **Palourdes coques** in a French clam-product category. | Retail terminology supports local commercial use, but the listing gives no binomial or species-specific product label. |

CFIA's list is for Canadian fish-product naming and labeling. OQLF establishes Québec terminology for a defined species. A retail category or recipe name is culinary/product evidence; without a binomial or species-qualified name, it cannot choose between the species sharing CFIA's French name.

## Live catalog and search audit

The current package contains 1,023 active ingredient references and 69 forms. No active reference or form contains `cockle`, `cockles`, `coque`, `coques`, `Clinocardium`, or the tested species names. The current ingredient search normalizes accents and punctuation, prefers complete word phrases, and uses substring matching only if no complete phrase matches. Under that search behavior, the exact queries **cockle**, **cockles**, **coque**, **coques**, **coque d'Islande**, and **clam** return no active reference. No existing form or active search owner claims these keys.

The research ledger already has the held candidate `ingredient-ref-clam`, based on species-specific Québec clam terminology and Canadian bivalve diversity. That hold concerns broad clam/palourde naming and *Mya arenaria* / *Venus mercenaria* scope; it does not review the distinct OQLF `coque` entry for *Clinocardium ciliatum*. Keep both candidate boundaries distinct. No `ingredient-ref-cockle` record or `WP04-COCKLE-COQUE-20261011` source IDs currently exist.

## Exact bundled-recipe demand

I scanned the manifest-listed 114 recipe files and all 1,123 ingredient rows, checking source text and normalized ingredient names. **Exact cockle/coque demand: 0 recipe rows.** There are no matches for `cockle`, `cockles`, `coque`, `coques`, `Clinocardium`, `C. ciliatum`, or `C. nuttallii`.

The broader marine/shellfish matches are:

| Recipe | Ingredient line | What it establishes |
|---|---|---|
| 019, row 8 | `1 lb jumbo lump crab meat` | Species-unspecified crab-meat product, linked to the existing crab reference and jumbo-lump form; no cockle demand. |
| 023, row 1 | `140 g sliced calamari` | Calamari request linked to the existing calamari reference; no cockle demand. |
| 093, row 4 | `Cooked meat or seafood, to taste` | Generic optional ingredient without a species selection; does not establish cockle demand. |
| 093, row 6 | `2 tbsp fish sauce` | Condiment demand, not mollusc demand. |
| 095, row 5 | `1 tbsp fish sauce` | Condiment demand, not mollusc demand. |

The crab and calamari rows are already represented by other catalog identities. The generic seafood option supplies no basis to create a cockle link.

## Proposed research-ledger candidate

```json
{
  "recordId": "ingredient-ref-cockle",
  "recordType": "candidate",
  "identityState": "needs_clarification",
  "measurementState": "not_yet_researched",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP04-COCKLE-COQUE-20261011-S01",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198883/coque",
      "title": "Office québécois de la langue française, coque (Grand dictionnaire terminologique)",
      "accessedOn": "2026-10-11",
      "locator": "Food-mollusc domain; preferred term, English equivalent, Latin name, and commercial-potential note.",
      "supports": "Pairs the preferred Québec term coque and English cockle with Clinocardium ciliatum and notes commercial potential in Québec. The entry supports that species-specific usage, not a universal mapping of unqualified Canadian retail coques to this species.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-COCKLE-COQUE-20261011-S02",
      "url": "https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp",
      "title": "Canadian Food Inspection Agency, CFIA Fish List search results",
      "accessedOn": "2026-10-11",
      "locator": "Current list rows for TSN 80867 Clinocardium ciliatum and TSN 80873 Clinocardium nuttallii.",
      "supports": "Lists Hairy Cockle / Coque for Clinocardium ciliatum and Cockle / Coque for Clinocardium nuttallii. CFIA's labeling list supports accepted Canadian species names and demonstrates that French Coque is shared across two species.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-COCKLE-COQUE-20261011-S03",
      "url": "https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names",
      "title": "Canadian Food Inspection Agency, Guidance on determining common names for fish sold or processed in Canada",
      "accessedOn": "2026-10-11",
      "locator": "Sections 1 and 4; CFIA Fish List purpose and scope.",
      "supports": "Explains that the CFIA Fish List collects French and English common names for labeling fish species sold or processed in Canada and links names to scientific taxa. This is labeling guidance, not a culinary alias rule.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-COCKLE-COQUE-20261011-S04",
      "url": "https://waves-vagues.dfo-mpo.gc.ca/Library/340859.pdf",
      "title": "Fisheries and Oceans Canada, 2010 Gulf Region mollusc survey",
      "accessedOn": "2026-10-11",
      "locator": "Annex III, invertebrate name table: Cardiidae family and Clinocardium ciliatum entries.",
      "supports": "Separates Cockle unspecified / Bucarde (coque) non spécifié at family level from Iceland cockle / Coque d'Islande for Clinocardium ciliatum. Historical survey nomenclature only.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-COCKLE-COQUE-20261011-S05",
      "url": "https://www.clearwater.ca/fr/seafood-industry/clams/coques/",
      "title": "Clearwater, Coques",
      "accessedOn": "2026-10-11",
      "locator": "French product page; product category, North Atlantic sourcing, Canadian vessel, and product state.",
      "supports": "Shows a Canadian seafood company selling a frozen culinary product under the unqualified plural coques name. The page gives no scientific species identification.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP04-COCKLE-COQUE-20261011-S06",
      "url": "https://www.profishionals.ca/fr/clams",
      "title": "ProFishionals, Palourdes",
      "accessedOn": "2026-10-11",
      "locator": "French product category listing Palourdes coques; Montréal supplier address.",
      "supports": "Shows a Montréal seafood supplier using palourdes coques as a market listing. No species or scientific name is provided.",
      "sourceKind": "other"
    }
  ],
  "decisions": [
    {
      "outcome": "unresolved",
      "reason": "Hold the unqualified cockle/coque ingredient identity. OQLF's species-specific food entry supports coque/cockle for Clinocardium ciliatum, but the current CFIA Fish List also assigns French Coque to Clinocardium nuttallii. Current Canadian and Montréal product pages use unqualified coques without identifying a species, and the bundled recipes contain no cockle/coque ingredient line. Do not add an active reference or generic aliases from this evidence. Reopen with a species-qualified recipe or target-product label; a future Clinocardium ciliatum row should be reviewed as coque d'Islande / Iceland cockle, with bare cockle/coque alias scope decided separately. Keep this candidate distinct from ingredient-ref-clam and its Mya arenaria / Venus mercenaria terminology boundary.",
      "sourceIds": [
        "WP04-COCKLE-COQUE-20261011-S01",
        "WP04-COCKLE-COQUE-20261011-S02",
        "WP04-COCKLE-COQUE-20261011-S03",
        "WP04-COCKLE-COQUE-20261011-S04",
        "WP04-COCKLE-COQUE-20261011-S05",
        "WP04-COCKLE-COQUE-20261011-S06"
      ]
    }
  ]
}
```

## Coordinator follow-up

1. Retain the generic `cockle / coque` candidate as unresolved; do not add an active reference, alias, form, or recipe link.
2. Keep this candidate separate from the generic clam hold. A future species-qualified request for *Clinocardium ciliatum* can be reviewed under **coque d'Islande / Iceland cockle**; a generic product listing or the single term `coque` is not enough to link it to that taxon.
3. Keep Section P open for this candidate. No testing is applicable to this proposal-only review.


## Coordinator integration

Added `ingredient-ref-cockle` as an unresolved research-ledger candidate only. No active reference, alias, form, recipe link, measurement, conversion, yield, or substitution was added. Keep it separate from the existing clam hold. Reopen only when a recipe or target product identifies a species-qualified cockle.
