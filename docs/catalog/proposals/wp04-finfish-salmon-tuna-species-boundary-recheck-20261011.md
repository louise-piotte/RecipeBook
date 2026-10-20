# WP04 Section P — salmon and tuna species-boundary recheck

- **Packet type:** identity-boundary recheck; coordinator integration recorded the reviewed holds in the shared research ledger.
- **Review date:** 2026-10-11.
- **Disposition:** hold new species-specific salmon and tuna references. Keep the existing recipe-facing `salmon fillets` and generic `tuna` references at their current scope; neither bundled line identifies a species. No new reference, recipe link, form, measurement, conversion, yield, or substitution is proposed.
- **Coordinator integration:** added unresolved candidate records for salmon and tuna species scope. Active references, forms, recipe links, and numeric data remain unchanged.
- **New source IDs:** `WP04-SALMON-TUNA-BOUNDARY-20261011-S01` through `S08`. The prefix and candidate record IDs were absent from the current ledger, active references, and prior proposal files.

## Scope and prior decisions

This packet follows the Section P finfish coordinator and gap reviews. The 2026-10-10 packets already held the unqualified sole/flounder/turbot and bass/bream/snapper/grouper/tilapia/carp market terms; their other proposed species rows have since been integrated. This recheck does not reopen those decisions. The same packets explicitly kept the existing salmon-fillets and tuna product references broad because their recipe lines select no species. This pass checks that boundary against the current Canadian fish-labelling list and Québec terminology, and confirms the present recipe demand.

The active salmon reference denotes the recipe-facing fillet ingredient. The active tuna reference denotes generic tuna. Neither reference claims a biological taxon. Species-specific public names and accepted Canadian fish-label names cannot be used to infer the taxon in a recipe that does not state one.

## Refreshed inventory and audit

Counts and hashes are from the pre-integration snapshot reviewed on 2026-10-11. The recipe corpus digest walks `manifest.v1.json` in its stored `recipeFiles` order and hashes each relative path, a NUL byte, the exact recipe-file bytes, and a NUL byte.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| Active `ingredient-references.v1.json` | 1,020 references | `11ddc15c7f6711b4b4219f917c1b3cb242d059bb3d2d89c8e5e940126518367e` |
| Active `ingredient-forms.v1.json` | 69 forms | `fc11b4c3217faccdda71a97a25a3f842f6f638d229fd78aa62b9875ba9fa20e1` |
| `legacy-import-identities.v1.json` | 75 candidates | `e4d72caab8c2dd6cced0015a07bd99dde535463e30f44ca48653c7bd38366de0` |
| `research-ledger.v1.json` | 1,303 records; 4,213 source entries / 3,453 distinct source IDs | `6bc0ae3e9e4f6dfae0eb6c31d2ce8d4a3a9e47db1fe2a4cdcb6d61c7ebb08627` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files / 1,123 ingredient rows | `b4bd736f4b3f6d4fd6528f76419c632c8afec4e9d32a288f668212de5214ab6d` |

The live catalog contains the following two recipe-facing rows. Both are `PROTEIN` references with no aliases, density, or unit mappings. No salmon- or tuna-specific ingredient form is active. The salmon ledger row remains `unreviewed` with no sources or decisions. The tuna ledger row remains `unreviewed`; it has one existing, source-specific measurement observation from Anova, but no species evidence. The source observation is preserved as such and is not changed by this review.

```json
{
  "id": "ingredient-ref-salmon-fillets-without-skin",
  "nameFr": "filet de saumon",
  "nameEn": "salmon fillets",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-03-23T00:00:00Z",
  "category": "PROTEIN"
}
```

```json
{
  "id": "ingredient-ref-tuna",
  "nameFr": "thon",
  "nameEn": "tuna",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-03-23T00:00:00Z",
  "category": "PROTEIN"
}
```

## Current recipe demand

All 114 manifest-listed recipes and 1,123 ingredient rows were scanned for ingredient name, original text, reference/form IDs, localized preparation/notes, and species terms. There are no bundled recipe mentions of `Atlantic salmon`, `coho`, `sockeye`, `pink salmon`, `chum`, `chinook`, `Salmo salar`, `Oncorhynchus`, `bluefin`, `yellowfin`, `bigeye`, `albacore`, `Thunnus`, or any other species-qualified salmon/tuna wording.

| Recipe / row | Exact ingredient line | Current link and demand limit |
|---|---|---|
| 077 / 10 | `675 g salmon fillets without skin, cut into cubes` | Linked to `ingredient-ref-salmon-fillets-without-skin`. It names the fish product and skinless cut only; no species, source-market label, or biological form is specified. |
| 111 / 1 | `1 tuna steak` | Linked to `ingredient-ref-tuna`. It specifies one steak but no tuna species, weight, trim, or edible-portion basis. |
| 093 / 4 | `Cooked meat or seafood, to taste` | Unlinked optional remainder. It does not select finfish, salmon, tuna, a taxon, or a measurable amount. |
| 093 / 6; 095 / 5 | `fish sauce` | Both link to `ingredient-ref-fish-sauce` (`SAUCE_AND_CONDIMENT`); these are condiment lines, not fish identity demand. |

The current bundle therefore supports the two existing broad recipe-facing references and no species-specific addition. Recipe 111's single-tuna-steak count remains a count. The existing Anova entry (`WP04-TUNA-COUNT-20261010-S01`) records a different recipe's source-reported steak range and thickness; it does not name a species and must not be read as the weight or species of recipe 111's steak.

## Species-boundary findings

### Salmon fillets

The current CFIA Fish List maps different salmon names to multiple taxa. For example, it lists Atlantic salmon as *Salmo salar*, and separate pink, chum/keta, coho, sockeye, and chinook/quinnat salmon entries under *Oncorhynchus* species. Its two *S. salar* common-name rows pair “Atlantic Salmon” with French “Saumon” and “Salmon” with “Saumon Atlantique”; the list is a Canadian product-labelling reference, not a recipe-species inference rule. CFIA also says “Pacific salmon” is not an acceptable replacement for a species-specific common name because the Pacific species have different market values.

OQLF's species entries reinforce that the Québec-facing names are taxon-specific: `saumon de l’Atlantique` / `Atlantic salmon` identifies *S. salar*; `saumon coho` / `coho salmon` identifies *O. kisutch*; and `saumon rouge` / `sockeye salmon` identifies *O. nerka*. These authoritative names do not establish that the bundled phrase `salmon fillets` means any one species. Keep the existing identity and recipe link; add no species aliases or species-specific row.

Keep the existing rainbow-trout identity separate. The earlier OQLF/DFO review identifies it as *O. mykiss* and treats `saumon arc-en-ciel` as a narrow sea-run naming context, not a synonym for generic salmon or every rainbow trout (`WP04-FINFISH-FOLLOWUP-20261009-S01`–`S03`). That boundary does not select a species for recipe 077.

### Tuna steak

The CFIA Fish List assigns English `Tuna` and French `Thon` to multiple taxa, including *Thunnus albacares*, *T. atlanticus*, *T. maccoyii*, *T. obesus*, *T. orientalis*, *T. thynnus*, and *T. tonggol*. The entries also show species-specific English/French names alongside the broader fish-list common-name terms. OQLF's entry for `thon rouge` identifies bluefin tuna, *T. thynnus*, and says the unqualified term `thon` was not retained for Québec fish-product marketing to avoid species confusion. This supports keeping the bundled `tuna steak` at its stated general scope; it does not justify assigning it to bluefin or another named tuna.

Neither the existing Anova count-weight observation nor the bundle supplies the exact species. Preserve that observation on the generic tuna ledger row as a source-specific measure only; do not create a tuna-species reference, species-specific alias, or conversion from the observed range.

### Labeling-versus-culinary limit

CFIA's Fish List and common-name guidance connect acceptable Canadian fish-label names with particular species and a taxonomic identifier. They guide product labeling. They do not determine what an unqualified cookbook phrase means, prove recipe equivalence among taxa, or authorize the app to auto-link a broad phrase to one taxon. OQLF supplies preferred Québec fish-product terminology and exact taxon pairings, but those entries likewise do not identify the species in either bundled recipe.

## Proposed ledger JSON for the held species splits

These are proposal-local `candidate` records documenting the evidence-backed hold. They are not appended to the shared ledger by this packet. No new ingredient-reference JSON is proposed; the two active reference objects above remain the full recipe-facing scope.

```json
{
  "recordId": "candidate-wp04-salmon-species-scope",
  "recordType": "candidate",
  "identityState": "needs_clarification",
  "measurementState": "not_yet_researched",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP04-SALMON-TUNA-BOUNDARY-20261011-S01",
      "url": "https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names",
      "title": "CFIA, Guidance on determining the common names for fish sold or processed in Canada",
      "accessedOn": "2026-10-11",
      "locator": "Section 4, CFIA Fish List",
      "supports": "The Fish List supplies English/French fish common names and taxonomic serial numbers for species-specific Canadian labeling; it is not a recipe-species inference rule.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SALMON-TUNA-BOUNDARY-20261011-S02",
      "url": "https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp",
      "title": "CFIA Fish List, salmon query",
      "accessedOn": "2026-10-11",
      "locator": "Rows for Salmo salar and Oncorhynchus gorbuscha, O. keta, O. kisutch, O. nerka, and O. tshawytscha",
      "supports": "Lists separate species-linked common names for Atlantic, pink, keta/chum, coho, sockeye, and chinook/quinnat salmon; the fish-list entries do not identify the taxon in recipe 077.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SALMON-TUNA-BOUNDARY-20261011-S03",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198857/saumon-de-latlantique",
      "title": "OQLF GDT, saumon de l’Atlantique",
      "accessedOn": "2026-10-11",
      "locator": "Preferred Québec fish-product term, English translation, and Latin name",
      "supports": "Pairs saumon de l’Atlantique with Atlantic salmon and Salmo salar; the name is species-specific and does not identify the bundle’s unqualified salmon fillets.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SALMON-TUNA-BOUNDARY-20261011-S04",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198950/saumon-coho",
      "title": "OQLF GDT, saumon coho",
      "accessedOn": "2026-10-11",
      "locator": "Preferred Québec fish-product term, English translation, and Latin name",
      "supports": "Pairs saumon coho with coho salmon and Oncorhynchus kisutch as a separate species-specific fish identity.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SALMON-TUNA-BOUNDARY-20261011-S05",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198946/saumon-rouge",
      "title": "OQLF GDT, saumon rouge",
      "accessedOn": "2026-10-11",
      "locator": "Preferred Québec fish-product terms, English translations, and Latin name",
      "supports": "Pairs saumon rouge / saumon sockeye with sockeye salmon and Oncorhynchus nerka; the bundle does not name this species.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SALMON-TUNA-BOUNDARY-20261011-S06",
      "url": "https://inspection.canada.ca/en/food-labels/labelling/industry/fish",
      "title": "CFIA, Labelling requirements for fish and fish products",
      "accessedOn": "2026-10-11",
      "locator": "CFIA Fish List and Labelling of Pacific salmon sections",
      "supports": "States that Pacific salmon is not an acceptable common name replacing a species name because its species have different market values; labeling guidance only.",
      "sourceKind": "other"
    }
  ],
  "decisions": [
    {
      "outcome": "unresolved",
      "reason": "Do not add a species-specific salmon reference or map the existing salmon-fillets row to Salmo salar or an Oncorhynchus species. Recipe 077 row 10 says only salmon fillets without skin; the named Canadian/Québec terms distinguish multiple salmon species and no source or label in the bundled recipe selects one. Keep the existing broad product reference without species aliases, forms, or recipe changes.",
      "sourceIds": [
        "WP04-SALMON-TUNA-BOUNDARY-20261011-S01",
        "WP04-SALMON-TUNA-BOUNDARY-20261011-S02",
        "WP04-SALMON-TUNA-BOUNDARY-20261011-S03",
        "WP04-SALMON-TUNA-BOUNDARY-20261011-S04",
        "WP04-SALMON-TUNA-BOUNDARY-20261011-S05",
        "WP04-SALMON-TUNA-BOUNDARY-20261011-S06"
      ]
    }
  ]
}
```

```json
{
  "recordId": "candidate-wp04-tuna-species-scope",
  "recordType": "candidate",
  "identityState": "needs_clarification",
  "measurementState": "not_yet_researched",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP04-SALMON-TUNA-BOUNDARY-20261011-S01",
      "url": "https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names",
      "title": "CFIA, Guidance on determining the common names for fish sold or processed in Canada",
      "accessedOn": "2026-10-11",
      "locator": "Section 4, CFIA Fish List",
      "supports": "The Fish List supplies English/French fish common names and taxonomic serial numbers for species-specific Canadian labeling; it is not a recipe-species inference rule.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SALMON-TUNA-BOUNDARY-20261011-S07",
      "url": "https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp",
      "title": "CFIA Fish List, tuna query",
      "accessedOn": "2026-10-11",
      "locator": "Rows for Thunnus albacares, T. atlanticus, T. maccoyii, T. obesus, T. orientalis, T. thynnus, and T. tonggol",
      "supports": "Lists `Tuna` / `Thon` for multiple Thunnus species, alongside species-specific names. It does not identify the species in recipe 111.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SALMON-TUNA-BOUNDARY-20261011-S08",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198944/thon-rouge",
      "title": "OQLF GDT, thon rouge",
      "accessedOn": "2026-10-11",
      "locator": "Preferred Québec fish-product term, English translation, Latin name, and note on unqualified thon",
      "supports": "Pairs thon rouge with bluefin tuna and Thunnus thynnus; says bare thon was not retained for Québec fish-product marketing to avoid species confusion.",
      "sourceKind": "regional_authority"
    }
  ],
  "decisions": [
    {
      "outcome": "unresolved",
      "reason": "Do not add a tuna-species reference or map the existing generic tuna row to a Thunnus species. Recipe 111 row 1 says only `1 tuna steak`; the CFIA Fish List assigns Tuna/Thon to multiple species and the recipe gives no species label. Preserve the existing Anova one-steak interval solely as its recorded source observation; it does not identify a species or establish the bundled recipe’s steak mass. Keep the current generic reference, measurement observation, and recipe link unchanged.",
      "sourceIds": [
        "WP04-SALMON-TUNA-BOUNDARY-20261011-S01",
        "WP04-SALMON-TUNA-BOUNDARY-20261011-S07",
        "WP04-SALMON-TUNA-BOUNDARY-20261011-S08"
      ]
    }
  ]
}
```

## Source register

All sources below were accessed 2026-10-11. CFIA Fish List names are Canadian product-labelling evidence, not recipe equivalence or culinary substitutability evidence. Its query data page reports a 2023-09-18 modified date.

| Source ID | Source | Evidence and limit |
|---|---|---|
| `WP04-SALMON-TUNA-BOUNDARY-20261011-S01` | CFIA, [Guidance on determining the common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) | Explains that the Fish List connects Canadian labeling common names to species and taxonomic serial numbers. Labeling scope only. |
| `WP04-SALMON-TUNA-BOUNDARY-20261011-S02` | CFIA Fish List, [salmon query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) | Lists *Salmo salar* and multiple *Oncorhynchus* taxa with their accepted common names. The exact line `salmon fillets` does not say which taxon or cite a product label. |
| `WP04-SALMON-TUNA-BOUNDARY-20261011-S03` | OQLF GDT, [saumon de l’Atlantique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198857/saumon-de-latlantique) | Preferred Québec English/French/species pair: Atlantic salmon / saumon de l’Atlantique / *Salmo salar*. |
| `WP04-SALMON-TUNA-BOUNDARY-20261011-S04` | OQLF GDT, [saumon coho](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198950/saumon-coho) | Species-specific coho salmon / saumon coho / *Oncorhynchus kisutch*. |
| `WP04-SALMON-TUNA-BOUNDARY-20261011-S05` | OQLF GDT, [saumon rouge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198946/saumon-rouge) | Species-specific sockeye salmon / saumon rouge / *Oncorhynchus nerka*. |
| `WP04-SALMON-TUNA-BOUNDARY-20261011-S06` | CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish) | Says `Pacific salmon` is not an acceptable common-name substitute for species-specific names because of different market values; Canadian labeling guidance only. |
| `WP04-SALMON-TUNA-BOUNDARY-20261011-S07` | CFIA Fish List, [tuna query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) | Shows `Tuna` / `Thon` terms attached to multiple taxa and distinguishes species-specific labels. No recipe equivalence is implied. |
| `WP04-SALMON-TUNA-BOUNDARY-20261011-S08` | OQLF GDT, [thon rouge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198944/thon-rouge) | Pairs bluefin tuna / thon rouge / *Thunnus thynnus* and notes the broad term `thon` was not retained for Québec fish-product marketing. |

Previously registered source reused without a new ID: Anova Culinary, [Sous Vide Tuna](https://recipes.anovaculinary.com/recipe/sous-vide-tuna), recorded as `WP04-TUNA-COUNT-20261010-S01` in the existing tuna ledger record. It reports two steaks with a per-steak 10–12 oz / 280–320 g range and thickness; it does not state species, and it is not the bundled recipe.

## Integration note

No reference or recipe update follows from this pass. Keep the Section P generic salmon/tuna rows at their current scope, keep species-specific taxonomy outside aliases, and reconsider only if a future bundled line or identified product explicitly names a species. The already-reviewed sole/flounder/turbot, bass/bream, snapper/grouper, tilapia, and carp boundaries remain closed under the earlier WP04 packets.


## Coordinator integration

Added `candidate-wp04-salmon-species-scope` and `candidate-wp04-tuna-species-scope` as unresolved ledger records. No species-specific active references or aliases were added. Existing salmon and tuna recipe links remain broad, and the source-specific Anova observation on the generic tuna record remains unchanged. The Fish List source locators now refer to the current results endpoint with separate Salmon and Tuna search terms.
