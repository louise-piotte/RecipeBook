# WP02 B2 follow-up proposal — cashew flour measurements and substitution limits

- **Reviewed:** 2026-10-12.
- **Status:** Proposal only. No catalog JSON, ledger, manifest, generated catalog, plan, roadmap, batch report, or existing proposal was changed.
- **Scope:** Follow-up to the accepted identity `ingredient-ref-cashew-flour`. The identity review and integration are already complete; its ledger still marks measurement and substitution research as unstarted. This packet addresses those two open fields only.
- **Source-ID prefix:** `WP02-B2-CASHEW-FLOUR-20261012`; S01–S04 already belong to the identity record. S05–S06 are new proposals and were absent from the current ledger and proposal archive when checked.

## Recommendation

Keep the current reference row exactly as it is: `cashew flour / farine de noix de cajou`, category `FLOUR_AND_STARCH`, empty aliases, `defaultDensity: null`, and `unitMappings: []`. The existing Québec wording is supported by the OQLF and Télé-Québec; a French Canadian-distribution listing also uses *farine de noix de cajou*. This measurement review provides no reason to change the label or add aliases.

Complete measurement research with two **source-specific bulk-density observations** from a 2019 study: the raw-kernel control flour is reported at 0.40 g/mL loose and 0.65 g/mL packed, each as a triplicate mean with a reported standard deviation of 0.01. Store these only in the research ledger. Their difference reflects the study's loose-versus-packed procedure; it is not a grams-per-cup mapping. Do not select either value as a default or convert it into a kitchen measure.

**Moisture detail excluded:** Table 1 labels sample C at 2.68±0.08% moisture, while nearby prose assigns 2.68% to roasted sample R3. Because the article is inconsistent on this detail, the candidate observations record only the clearly identified Table 5 density rows and omit moisture from `foodState`.

Complete substitution research with **no general catalog-level substitution rule**. A 2020 bread study tested wheat/undefatted-cashew-flour and wheat/defatted-cashew-flour blends. Its favorable sensory result for one 10% undefatted formulation is specific to that study's bread formula and evaluation; it does not establish a transferable replacement for other recipes, roles, or flour identities. The study treats hydraulically defatted flour as a separate material, so its 20% result does not broaden this catalog identity. Keep the research outcome, but do not create a global or contextual runtime rule.

## Exact candidate fields

No ingredient reference, alias, form, unit mapping, recipe link, or runtime substitution-rule field is proposed. Keep the reference values unchanged:

| Field | Retained value |
|---|---|
| `id` | `ingredient-ref-cashew-flour` |
| `nameEn` / `nameFr` | `cashew flour` / `farine de noix de cajou` |
| `category` | `FLOUR_AND_STARCH` |
| `aliasesEn` / `aliasesFr` | `[]` / `[]` |
| `defaultDensity` / `unitMappings` | `null` / `[]` |

Append the following source entries, observations, finding, and decision to the existing `ingredient-ref-cashew-flour` ledger record. Retain its identity state and S01–S04 sources. Set the two research-state fields as shown. The existing identity decision remains a record of the earlier identity-only review; append this follow-up decision so the ledger makes the new research outcome explicit.

```json
{
  "measurementState": "researched_supported",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP02-B2-CASHEW-FLOUR-20261012-S05",
      "url": "https://iseki-food-ejournal.com/article/49/pdf",
      "title": "Makinde and Hannah (2019), The Impact of Processing Methods on Chemical Composition, Mineral Bioavailability and Functional Properties of Nigerian-Grown Cashew Flour",
      "accessedOn": "2026-10-12",
      "locator": "Materials and Methods section 2.2 (flour preparation) and section 2.3, subsection Determination of functional properties; Results, Table 5 (printed pages 2 and 9; PDF pages 2 and 9).",
      "supports": "Describes the raw-kernel control and flour preparation, identifies loose and packed density measurements, and reports the control (C) at 0.40 plus/minus 0.01 g/mL loose and 0.65 plus/minus 0.01 g/mL packed. These are triplicate study means with standard deviation, not household measures or a default density.",
      "sourceKind": "direct_measurement"
    },
    {
      "sourceId": "WP02-B2-CASHEW-FLOUR-20261012-S06",
      "url": "https://journalejnfs.com/index.php/EJNFS/article/view/519",
      "title": "Emelike, Barber, and Deebom (2020), Nutrient Composition and Sensory Properties of Wheat Bread Substituted with Defatted and Undefatted Cashew Kernel Flours",
      "accessedOn": "2026-10-12",
      "locator": "Formulations and sensory outcome in the article abstract; full article linked from the journal page.",
      "supports": "Reports wheat/undefatted-cashew and wheat/defatted-cashew bread blends at 90:10, 80:20, and 70:30, with 100 percent wheat control. The study reports that its 10 percent undefatted and 20 percent defatted samples compared favorably with the control for specified sensory attributes. This is formula-specific experimental evidence, not a source-neutral replacement rule.",
      "sourceKind": "direct_measurement"
    }
  ],
  "measurementObservations": [
    {
      "observationId": "cashew-flour-makinde-2019-control-loose-bulk-density",
      "relationship": "bulk_density",
      "value": 0.4,
      "valueUnit": "g/mL",
      "foodDescription": "Cashew-kernel flour raw-control sample C from the study.",
      "foodState": "Raw-kernel control, not soaked, autoclaved, roasted, or germinated (sample C as described in the study).",
      "measurementMethod": "Loose bulk density measured using the method attributed to Ikpeme et al. (2010); this article does not reproduce the detailed filling or packing protocol. Triplicate determinations.",
      "quantityBasis": "Source-reported triplicate mean; the paper reports plus/minus 0.01 standard deviation. Study-specific bulk density, not a household scoop or cup mapping and not a default.",
      "evidenceKind": "measured",
      "sourceIds": ["WP02-B2-CASHEW-FLOUR-20261012-S05"]
    },
    {
      "observationId": "cashew-flour-makinde-2019-control-packed-bulk-density",
      "relationship": "bulk_density",
      "value": 0.65,
      "valueUnit": "g/mL",
      "foodDescription": "Cashew-kernel flour raw-control sample C from the study.",
      "foodState": "Raw-kernel control, not soaked, autoclaved, roasted, or germinated (sample C as described in the study).",
      "measurementMethod": "Packed bulk density measured using the method attributed to Ikpeme et al. (2010); this article does not reproduce the detailed filling or packing protocol. Triplicate determinations.",
      "quantityBasis": "Source-reported triplicate mean; the paper reports plus/minus 0.01 standard deviation. Study-specific bulk density, not a household scoop or cup mapping and not a default.",
      "evidenceKind": "measured",
      "sourceIds": ["WP02-B2-CASHEW-FLOUR-20261012-S05"]
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "cashew-flour-no-general-substitution-20261012",
      "researchState": "researched_no_supported_substitute",
      "context": "No general, source-neutral substitution rule involving cashew flour. The reviewed positive evidence is limited to specific wheat-bread blend formulas.",
      "basis": "Emelike et al. tested wheat/undefatted-cashew and wheat/defatted-cashew blends at 90:10, 80:20, and 70:30, and reported specified favorable sensory comparisons for the 10 percent undefatted and 20 percent defatted samples. Those experimental outcomes do not establish a transferable ratio or baking function across recipes and product preparations.",
      "limitations": [
        "Do not encode the 10 percent undefatted or 20 percent defatted bread blends as a global or contextual rule.",
        "Do not transfer the defatted-flour result to the active unqualified cashew-flour identity.",
        "Do not infer a substitute for cashew flour in cakes, cookies, or other recipe roles, or a general replacement for wheat, almond, or another flour.",
        "No cashew-flour recipe demand or linked recipe line appears in the current bundled package."
      ],
      "replacements": [],
      "sourceIds": ["WP02-B2-CASHEW-FLOUR-20261012-S06"]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Record the raw-control loose and packed bulk-density means as study-specific observations, while keeping defaultDensity null and unitMappings empty because the study does not provide a household conversion and packing changes the result. Mark general substitution research complete with no reusable rule; preserve the bread-trial results as formula-bounded evidence only.",
      "sourceIds": [
        "WP02-B2-CASHEW-FLOUR-20261012-S05",
        "WP02-B2-CASHEW-FLOUR-20261012-S06"
      ]
    }
  ]
}
```

## Key ownership and scope checks

Read-only snapshot of the active package and ledger on 2026-10-12:

| Surface | State | SHA-256 |
|---|---:|---|
| Ingredient references | 1,297 rows | `963c463748970e5c1d9031d11c5d614e7def608ff25f157f2ac7df21acd9ef4a` |
| Ingredient forms | 98 rows | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import identities | 64 rows | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research ledger | 1,605 records | `402f1746165778202dd6d7486793b839060fb93672825707f8afda4a0891c9fe` |
| Manifest | 114 recipes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

Exact normalized-key ownership was checked in references, forms, legacy candidates, and ledger sources/decisions. `cashew flour` and `farine de noix de cajou` belong only to `ingredient-ref-cashew-flour`; `cashews` and `noix de cajou` belong to `ingredient-ref-cashews`; `cashew butter` and `beurre de noix de cajou` belong to the separate butter row. The candidate phrases `cashew meal`, `cashew powder`, `cashew nut flour`, `ground cashews`, `farine de cajou`, `poudre de cajou`, `farine d’anacarde`, and `farine de noix d’acajou` have no exact owner in those four surfaces. Keep them unassigned: this packet does not establish alias scope.

The plan records the identity-only cashew-flour integration under WP02 B2 at lines 10119–10128 and explicitly leaves measurement and substitution research open. The accepted identity proposal likewise excludes both topics. This follow-up therefore does not reopen the identity decision or duplicate an existing measurement/substitution proposal.

## Recipe and package snapshot

The scan followed all 114 paths listed in `manifest.v1.json`: 1,123 ingredient rows. It searched each complete recipe file and each ingredient row for cashew, `noix de cajou`, `farine de cajou`, anacard, and ground-cashew terms, and searched recipe files and rows for links to `ingredient-ref-cashew-flour`, `ingredient-ref-cashews`, or `ingredient-ref-cashew-butter`.

**Result: zero matching files, zero matching ingredient rows, and zero linked files or rows.** The manifest-ordered recipe-corpus fingerprint is `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`, calculated by hashing each relative recipe path, a NUL byte, file bytes, and another NUL byte in manifest order. The bundle therefore provides no cashew-flour recipe demand, measure, or recipe-specific substitution context.

## Static validation plan for any later integration

1. Append S05–S06 only after confirming their source IDs, both observation IDs, and the finding ID remain unique. Keep S01–S04 and the verified identity state.
2. Validate the research ledger against `docs/catalog/research-ledger.schema.json`; confirm every cited `sourceId` resolves and the observation fields validate as `bulk_density` with positive numeric values and `g/mL` units.
3. Re-run normalized exact-key ownership checks across references, forms, legacy identities, and ledger; verify no alias, form, recipe link, conversion, yield, or substitution rule was introduced.
4. Re-run the manifest package and generated-catalog static validators after data integration. Confirm the default density remains null and unit mappings remain empty.
5. No unit or Android instrumentation tests are needed for this proposed ledger/database-JSON-only data change under `AGENTS.md`; no emulator check is needed.

## Source register

All sources below were accessed on 2026-10-12. S01–S04 are already in the identity ledger record and are repeated here only for the terminology and product-boundary snapshot. Only S05–S06 are new proposed ledger sources.

| ID | Source and supported evidence | Limits |
|---|---|---|
| **WP02-B2-CASHEW-FLOUR-20261012-S01** | Office québécois de la langue française, [*noix de cajou* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869307/noix-de-cajou). Supports the existing Québec French wording for the edible nut. | The entry does not define flour terminology or a measure. |
| **WP02-B2-CASHEW-FLOUR-20261012-S02** | Télé-Québec, [*Faire sa farine maison en 1 minute*](https://cuisinez.telequebec.tv/articles/103/faire-sa-farine-maison-en-1-minute), section *Farine de noix de cajou*. Attests the current French flour wording and describes milling raw cashew halves. | Grinder time is not a mass/volume measure, density, yield, or substitution test. |
| **WP02-B2-CASHEW-FLOUR-20261012-S03** | Hearthy Foods, [*Cashew Flour*](https://www.hearthyfoods.com/en-ca/products/cashew-flour). Attests the English product wording and raw-cashew ingredient statement. | Product-specific label and package sizes do not establish a standard flour process or kitchen conversion. |
| **WP02-B2-CASHEW-FLOUR-20261012-S04** | Fun Foods Canada, [French Canadian-distribution listing](https://funfoods.ca/fr/collections/grocery-and-food-items-pantry-essentials-snacks-beverages-canadian-distribution), titled *Farine de noix de cajou biologique crue*. | Retailer wording is not a Québec terminology ruling, density, or household measure. |
| **WP02-B2-CASHEW-FLOUR-20261012-S05** | Makinde and Hannah, [*The Impact of Processing Methods on Chemical Composition, Mineral Bioavailability and Functional Properties of Nigerian-Grown Cashew Flour*](https://iseki-food-ejournal.com/article/49/pdf), *International Journal of Food Studies* 8 (2019), 1–13. Materials and Methods describe raw control preparation and the loose/packed density method; Table 5 reports control C density values. | One study sample and a laboratory bulk-density procedure. The article refers to the procedure but does not reproduce its detailed packing steps; values cannot become a household measure or default. |
| **WP02-B2-CASHEW-FLOUR-20261012-S06** | Emelike, Barber, and Deebom, [*Nutrient Composition and Sensory Properties of Wheat Bread Substituted with Defatted and Undefatted Cashew Kernel Flours*](https://journalejnfs.com/index.php/EJNFS/article/view/519), *European Journal of Nutrition & Food Safety* 12(12) (2020), 28–39. Abstract reports the blend ratios and sensory comparison for 10% undefatted and 20% defatted samples. | Experimental bread and sensory results are formula-specific; they do not authorize broad substitution guidance or merging defatted flour into the active identity. |
