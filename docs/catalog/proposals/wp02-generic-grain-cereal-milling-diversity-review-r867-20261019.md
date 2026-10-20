# WP02 A7 generic grain/cereal milling diversity review — R867 (2026-10-19)

## Review record

- **Status:** Accepted and integrated as `ingredient-ref-sorghum-bran`; see the [R867 integration README](../batches/wp02-a7-sorghum-bran-identity-integration-r867-20261019/README.md).
- **Selected gap:** Generic edible sorghum bran, proposed as `sorghum bran / son de sorgho`.
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference. Keep its French display provisional pending independent Québec terminology review. Do not add forms, measurements, conversions, yields, recipe links, or substitutions.
- **Distinct scope:** This is a sorghum milling fraction, distinct from the R864 barley-meal review and the R861 potato-flakes identity. It is also distinct from active sorghum grain, flour, grits, semolina, starch, and puffed sorghum identities.
- **Preservation:** Preserve all current generic and branded rows and every source-scoped measurement or claim. No existing identity is deleted, merged, renamed, or given new evidence by this proposal.

## Plan anchor and recent work

- The open WP02 Section A7 parent asks for continued review of other grain meals and milling products, including the unresolved wheat-meal candidate ([plan, line 2289](../../RecipeBook-global-ingredient-catalog-plan.txt#L2289)). Sorghum bran is a grain milling fraction and fits this unfinished A7 coverage.
- The broader B2/B3 alternative flour and starch review remains open ([plan, line 16056](../../RecipeBook-global-ingredient-catalog-plan.txt#L16084)). It is not selected here because the proposed identity is a cereal bran fraction rather than a flour or starch.
- R864 kept the existing barley-meal candidate unresolved because the sources did not settle a consumer milling boundary and Québec French name. This proposal does not reopen or alter that decision ([R864 proposal](wp02-generic-grain-meal-diversity-review-r864-20261019.md)).
- R861 reviewed potato flakes as a distinct dehydrated potato ingredient, classified as `VEGETABLE_AND_AROMATIC`; this R867 candidate is a different grain-derived ingredient type ([R861 proposal](wp02-generic-flour-starch-diversity-review-r861-20261019.md)).

## Generic identity and bilingual boundary

The proposed identity is the edible bran fraction obtained from milling or decorticating sorghum grain. Food-processing sources show that bran is a distinct sorghum fraction and that sorghum bran has been used as a food ingredient. They do not establish one universal bran grade: the FAO processing account distinguishes fine bran from a coarser fraction mixed with germ and broken grain, and the 2024 steamed-bread study tested a particular fine black and tannin (sumac) sorghum bran sample.

FAO AGROVOC uses the French term `son de sorgho` as a source product of sorghum grain. The Canadian Food Inspection Agency says the grain source must be named when bran is from a grain other than wheat, supporting the source-qualified English display `sorghum bran`. OQLF defines the milling term `son`, but its record does not approve the full compound `son de sorgho`; the French display is therefore a supported working translation, not an OQLF-preferred Québec term.

Do not encode a specific cultivar, colour, tannin level, particle size, milling process, or anatomical fraction in this generic identity. Keep animal-feed materials, sorghum mill-feed, bran-enriched wholemeal flour, bran extracts, and branded product formulations outside the proposed scope.

## Evidence and source limits

| Source ID | Source and evidence | Limits |
| --- | --- | --- |
| `WP02-A7-SORGHUM-BRAN-R867-20261019-S01` | FAO AGROVOC, [sorghum grain concept](https://agrovoc.fao.org/browse/agrovoc/fr/page/c_7249), accessed 2026-10-19. The French concept identifies *Sorghum bicolor* grain and lists `son de sorgho` as one of its source products. | International agricultural vocabulary, not a Québec product label or a definition of edible bran grade. The exact French compound is attested, but it is not an OQLF ruling. |
| `WP02-A7-SORGHUM-BRAN-R867-20261019-S02` | FAO, [*Le sorgho et les mils dans la nutrition humaine*](https://www.fao.org/4/t0818f/T0818F07.htm), “Stockage et transformation, Composition chimique et valeur nutritive,” accessed 2026-10-19. Its processing discussion describes sorghum decortication and removal of bran; it says some processing separates fine bran, mainly pericarp, from a mixture of germ, broken grain, and coarse bran. | Milling examples and fraction composition are process- and source-specific; they do not define a universal commercial grade or a household amount. Nutrient-table values are not measures or general product specifications. |
| `WP02-A7-SORGHUM-BRAN-R867-20261019-S03` | Zhang and Awika, [“Effect of sorghum bran addition on antioxidant activities, sensory properties, and in vitro starch digestibility of Chinese southern-style steamed bread”](https://pubmed.ncbi.nlm.nih.gov/39092915/), *Journal of the Science of Food and Agriculture* 104(15), 9652–9659 (2024), DOI 10.1002/jsfa.13790; accessed 2026-10-19. The primary study used fine black, tannin-rich (sumac) sorghum bran in Chinese southern-style steamed bread. | Establishes food use in this study context, not a Québec retail product, a universal formulation, or a transferable performance claim. The study’s inclusion range, recipe results, and sensory or nutritional findings remain specific to its sample and formula; none is a kitchen measure or substitution ratio. |
| **Reused source** `WP03-BARLEY-BRAN-20261013-R56-S03` | Canadian Food Inspection Agency, [Labelling and composition requirements for grain and bakery products](https://inspection.canada.ca/en/food-labels/labelling/industry/grain-and-bakery-products), “Common name — Bran.” The page says unqualified bran is understood as wheat bran and the grain must be named for bran from another grain. | General common-name rule; it supports source qualification but does not directly attest sorghum bran or provide a French display. Reuse the existing source ID; do not create or alter an evidence entry for the current barley-bran row. |
| **Reused source** `WP03-BARLEY-BRAN-QC-R89-20261013-S01` | Office québécois de la langue française, [GDT: `son`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432756/son), “Alimentation > céréale traitée.” It defines `son` as the peripheral cereal part separated from flour during milling. | Supports the French base term only. It does not define `son de sorgho` as a Québec-preferred compound or establish sorghum-bran food use. Reuse the existing source ID; do not alter its current ledger entry. |

### Encountered manufacturer source, excluded from generic evidence

Nu Life Market’s [custom sorghum milling page](https://nulifemarket.com/milling-processing-scaling/) lists a sorghum-bran format within that supplier’s custom ingredient offer and says its ingredients are made to order. Those statements apply to that manufacturer’s offer only. They are not used to establish a generic process, market-wide availability, a French name, or any measurement. No brand, product-line, flavour, SKU, or retailer-variant roster was researched or expanded.

## Exact proposed data

The accepted active reference row is:

```json
{
  "id": "ingredient-ref-sorghum-bran",
  "nameFr": "son de sorgho",
  "nameEn": "sorghum bran",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

The shared ledger now has an `ingredient_reference` record with `recordId: ingredient-ref-sorghum-bran`, `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. It includes sources S01–S03 and reuses the existing CFIA and OQLF source IDs without changing their source records. S01–S03 were proposal-local before coordinator acceptance and are now registered on this ledger record. No measurement observations, substitution findings, or rejected-candidate rows were added.

The proposed row is identity-only. Do not add aliases such as bare `bran`, `son`, `sorghum mill-feed`, `sorghum meal`, or `sorghum flour`; do not assign a density or unit mapping; and do not infer a generic measure, nutrient specification, food-safety claim, milling yield, recipe use, or replacement ratio.

## Search, ownership, and demand checks

- **Active references:** The current ingredient-reference file has 1,897 rows. No active reference ID, display name, or alias matches `sorghum bran`, `son de sorgho`, `sorghum-bran`, or `ingredient-ref-sorghum-bran`; the proposed row would use the existing `GRAIN_AND_CEREAL` category. Existing sorghum identities are grain sorghum, puffed sorghum, sorghum flour, sorghum grits, sorghum semolina, and sorghum starch. Existing generic cereal-bran rows include barley, corn, oat, rice, rye, and wheat bran. All remain unchanged.
- **Forms, ledger, and legacy identities:** The current forms file (201 forms), research ledger (2,305 records), and legacy-import file (56 candidates) contain no exact candidate name, French compound, proposed reference ID, or candidate ID. New proposal-local source IDs S01–S03 do not occur in the current shared ledger. The CFIA and OQLF source IDs shown as reused are already registered on the barley-bran row; their source IDs and source evidence are preserved.
- **Rules:** Neither global nor contextual substitution-rule files contain the proposed names or ID. No conversion or substitution behavior is proposed.
- **Proposal and plan ownership:** Exact-name and proposed-ID searches found no earlier sorghum-bran proposal or active A7/B2 child assignment. The R861–R863 generic-scope checkpoint says product, product-line, flavour-family, and retailer-variant roster expansion is out of scope across ingredient types because commercial product counts are not ingredient diversity. The open generic A7 and B2/B3 parents remain broad identity-review tasks; no brand-only child was found under either parent.
- **Brand/product scope:** Any future child task limited to counting or cataloguing brands, product lines, flavour families, SKUs, or retailer variants is out of scope for this generic-diversity queue because it adds commercial products rather than ingredient identities. Preserve existing branded references and keep every product-specific measurement or performance statement attached to its named product. The manufacturer page above was excluded from generic claims.
- **Source ownership:** Proposal-local IDs S01–S03 are not present in the ledger. The AGROVOC URL is already registered under existing source ID `WP03-SORGHUM-GRAINS-20261012-S02` on the grain-sorghum row; this review cites the same concept’s `son de sorgho` source-product relation separately, without modifying that row. The exact FAO processing-page and 2024-paper URLs have no current ledger entry. The CFIA and OQLF citations reuse existing IDs as-is. No existing source record is reassigned.
- **Recipe corpus:** Parsed all 114 manifest-listed bundled recipe files and 1,123 ingredient rows. No occurrence of the proposed English/French display, hyphenated form, or proposed ID was found. No recipe link is proposed.

## Unresolved risks and limits

1. `son de sorgho` is supported by FAO AGROVOC and the general Québec milling term `son`, but no current Québec bilingual retail label or OQLF entry for the full compound was found. Keep the French display provisional until independent Québec review.
2. “Bran” composition depends on grain variety and milling/decortication process. The available sources do not define one generic particle size or exact anatomical composition. Retain the broad source-qualified identity and do not encode a grade or process.
3. Direct human-food evidence reviewed here includes one steamed-bread study using a particular fine black and tannin (sumac) sample. It does not establish local availability, broad consumer use, or transferable product performance.
4. The corpus has no matching recipe demand. This does not negate the food-ingredient identity, but leaves recipe-specific amount and form questions unanswered.

No software tests, build, emulator run, or deployment were performed because the accepted change only adds database JSON data under `AGENTS.md`.
