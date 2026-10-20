# WP03 Section K — ivy-gourd leaves and shoots review (R979)

- **Reviewed:** 2026-10-19
- **Disposition:** Recommend one identity-only reference for the regional leafy-green use of *Coccinia grandis*.
- **Scope:** Generic culinary plant-part diversity. This packet records the proposal-stage review; the root accepted and integrated the identity in the [R978–R980 integration README](../batches/wp02-wp03-wp05-r978-r980-generic-gap-integration-20261019/README.md).
- **Plan anchors:** Section K's broader leafy-green and shoot sweep remains open ([catalog plan, lines 6556–6560](../../RecipeBook-global-ingredient-catalog-plan.txt#L6556)). Section L's R885 ivy-gourd fruit decision explicitly leaves leaves and shoots separate ([catalog plan, line 6850](../../RecipeBook-global-ingredient-catalog-plan.txt#L6850)).

## Recommendation

Add `ingredient-ref-ivy-gourd-leaves-and-shoots` for the leaves and tender shoots of correctly identified *Coccinia grandis* (L.) Voigt, a regional leafy vegetable distinct from its young green fruit. JIRCAS documents edible young shoots. PROSEA independently says that young shoots and leaves are eaten as vegetables and describes fried, blanched, and boiled uses with rice, noodles, or soup. These sources support the plant-part identity; they do not establish a Québec market name, general measure, or recipe conversion. [S01–S02]

Use the English display `ivy gourd leaves and shoots (Coccinia grandis)`. Use the provisional descriptive French display `feuilles et pousses de courge lierre (Coccinia grandis)`: Health Canada lists `courge lierre` with *C. grandis*, but its table identifies fruit as the part and is not a Québec culinary terminology source. Do not represent the compound French display as OQLF-standardized or current Québec market wording. [S03]

Keep both displays part-qualified and leave alias arrays empty. Do not alias unqualified `ivy gourd` or `courge lierre`, which already occur in the fruit display; do not add JIRCAS's Thai local names, `petite courge`, or botanical-name variants as English/French aliases. The source pages support a specific regional food identity, not a multilingual synonym roster.

Keep this identity limited to the leafy vegetable parts described by the food-use sources. Do not include fruit, roots, flowers, medicinal preparations, or other *Coccinia* species. Do not import the crop's source-specific nutrition values, postharvest notes, or fruit observations into the leafy-part record. Kew treats *C. grandis* as an accepted species; the existing fruit record's Kew source remains owned there. [S04]

## Proposed minimal reference state

```json
{
  "id": "ingredient-ref-ivy-gourd-leaves-and-shoots",
  "nameFr": "feuilles et pousses de courge lierre (Coccinia grandis)",
  "nameEn": "ivy gourd leaves and shoots (Coccinia grandis)",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

Do not add a form, measurement observation, density, unit mapping, conversion, package yield, recipe link, or active substitution. The reviewed food-use sources give culinary descriptions, not household or recipe amounts. PROSEA's composition figures and fresh-shoot postharvest statement remain source-specific and are not ingredient measurements. No substitution evidence was reviewed; keep `substitutionResearchState: not_yet_researched` and add no rule.

If accepted, create one ingredient-reference ledger record with `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`; attach only proposal-local sources S01–S04 and add no measurement observations. The existing R885 source IDs remain on `ingredient-ref-ivy-gourd`; this proposal assigns new, unused source IDs for its distinct plant-part record while citing the same four public pages for separately scoped shoot/leaf, French-name, and taxonomy evidence.

## Ownership and identity boundary

The pre-integration package snapshot had 1,995 references, 205 forms, and 55 legacy candidates; the research ledger had 2,400 records and 11,268 source entries. Exact and accent-folded scans across active reference IDs, displays and aliases; form IDs, labels and match terms; legacy candidate content; and ledger records found no owner for the proposed ID or the part-qualified names `ivy gourd leaves and shoots`, `ivy gourd leaves`, `ivy gourd shoots`, `feuilles et pousses de courge lierre`, or the botanical part phrases.

There is one current *Coccinia grandis* reference and ledger record: `ingredient-ref-ivy-gourd`, displayed as `ivy gourd fruit (Coccinia grandis) / fruit de courge lierre (Coccinia grandis)`. It is scoped to young green fruit. The R885 ledger record owns the existing JIRCAS, PROSEA, Kew, and Health Canada source IDs and already notes tender shoots as a separate vegetable; its accepted decision explicitly excludes leaves and shoots from the fruit identity. Preserve that row, its evidence, and all fruit-specific boundaries unchanged. No form or legacy candidate owns the proposed leafy part. The new R979 source-ID prefix was absent from the ledger and proposal archive at review time.

| Existing row or evidence | Treatment |
|---|---|
| `ingredient-ref-ivy-gourd` — young green fruit of *C. grandis* | Preserve the identity, source IDs, and fruit-specific evidence. Do not move observations or source ownership to the new leafy-part record. |
| `ingredient-ref-cucurbita-moschata-leaves` — musk pumpkin leaves | Keep separate: it is a different genus and a leaf-only identity. |
| `ingredient-ref-ugu-leaves` — Ugu leaves of *Telfairia occidentalis*; `ingredient-ref-chayote-shoots` — *Sechium edule* | Preserve their taxon and part boundaries. Do not use broad `pumpkin`, `gourd`, `leaves`, or `shoots` wording as aliases for ivy gourd. |
| Existing generic crop and plant-part references | Leave unchanged. The proposal's English and French displays remain part-qualified; alias arrays stay empty. Broad `ivy gourd` and `courge lierre` searches may show both the current fruit row and this proposed leafy-part row, with their parts visible. |

No brand-, product-line-, flavour-family-, cultivar-roster-, SKU-, or retailer-variant research was pursued. If such a roster-only task appears in the queue, mark it out of scope because commercial-product counts do not add ingredient diversity, then stop that line. Preserve existing branded rows and product-scoped evidence; nothing is transferred by this proposal.

## Bundled recipe demand

All 114 manifest-listed recipe files and 1,123 structured ingredient rows were scanned for `ivy gourd`, `ivy gourd leaves`, `ivy gourd shoots`, `courge lierre`, `courge de lierre`, *Coccinia grandis*, *C. indica*, *C. cordifolia*, and the reviewed Thai names `phak tamlueng` / `phak khaep`. The scan found zero matching recipe files and zero matching ingredient rows. The manifest-ordered recipe corpus digest was `9527e9e177132e6385e7d3756b5cc996bb1f12b8938d2863d66afdd54782b486`. No recipe amount, line link, or relink is proposed; the regional food-use sources establish culinary identity, not bundled demand.

## Sources

Online sources were accessed 2026-10-19. IDs below are unique to this proposal and are not in the shared ledger. Where a public page is also cited by the existing fruit record, the R885 source IDs and ownership remain unchanged.

| ID | Source | Support and limits |
|---|---|---|
| `WP03-K-IVY-GOURD-GREENS-R979-20261019-S01` | Japan International Research Center for Agricultural Sciences (JIRCAS), [*Coccinia grandis* (L.) Voigt](https://www.jircas.go.jp/en/database/thaivege/032) | Identifies *C. grandis*, `ivy gourd`, and the Thai name `phak tamlueng`; says the plant is grown for edible young shoots and describes blanched, soup, noodle, and fried uses. Young green fruits are discussed separately. The page does not establish a Québec term or reusable amount. |
| `WP03-K-IVY-GOURD-GREENS-R979-20261019-S02` | PROSEA, [*Coccinia grandis* (L.) Voigt, Plant Resources of South-East Asia No. 8: Vegetables](https://prosea.prota4u.org/view.aspx?id=2162), Boonkerd, Na Songkhla, and Thephuttee (1993) | Names `ivy gourd` and says young shoots and leaves are eaten fried, blanched, or boiled as a vegetable for rice, noodles, and soups. Its local-market and regional-use statements are not Québec market evidence. Leaf-composition figures, fruit-composition figures, yield, and rapid wilting are not transferred into measurements or preparation rules. |
| `WP03-K-IVY-GOURD-GREENS-R979-20261019-S03` | Health Canada, Natural Health Products Ingredients Database, [French Antioxidants monograph](https://webprod.hc-sc.gc.ca/nhpid-bdipsn/dbImages/mono_antioxydants_francais.pdf), p. 15 | Pairs `courge lierre` with *C. grandis*. The source row identifies fruit and fresh/dry preparations, so it supports only the provisional French plant-name component; it does not attest a culinary leaf/shoot label, Québec usage, or a leafy-part preparation. |
| `WP03-K-IVY-GOURD-GREENS-R979-20261019-S04` | Royal Botanic Gardens, Kew, [Plants of the World Online: *Coccinia grandis* (L.) Voigt](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:291972-1/general-information) | Treats *C. grandis* as an accepted species, records `ivy gourd`, and notes food use. It supports taxonomy and the botanical boundary, not a particular edible part or Québec display. |

## Disposition

Recommend one identity-only `VEGETABLE_AND_AROMATIC` reference for `ivy gourd leaves and shoots / feuilles et pousses de courge lierre (Coccinia grandis)`, with empty alias arrays. Keep the French wording provisional, preserve the current young-fruit row and its source ownership, and add no forms, measurements, recipe links, conversions, yields, or active substitutions. Section K's broader leafy-green, shoot, and independent Québec terminology review remains open.
