# WP02 Section A7 R881: generic proso millet bran identity review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** This review produced only this proposal; it makes no shared catalog, ledger, plan, roadmap, workflow, batch, recipe, or code changes.
- **Open-plan anchor:** The A7 parent remains open for other grain meals and milling products, including the wheat-meal candidate ([plan, Section A7](../../RecipeBook-global-ingredient-catalog-plan.txt#L2289)).
- **Scope:** Review a generic proso-millet milling fraction missing from the active catalog. This is ingredient-diversity work, not a commercial product roster.
- **Recommendation:** Add identity-only generic `proso millet bran / son de millet commun` as a distinct edible cereal milling fraction. Keep the French compound provisional pending independent Québec terminology review.
- **Research boundary:** Use generic crop terminology, Canadian naming guidance, and primary human-food studies. Keep each study's sample, milling fraction, formula, amounts, and measured outcomes within that study.

## Recommendation

Add a species-qualified proso millet bran identity. OQLF maps *proso millet* and *common millet* to *Panicum miliaceum*, while two primary food studies describe proso millet bran as a distinct milling by-product and use it in gluten-free bread research. CFIA's naming guidance supports stating the source grain when naming non-wheat bran. Together these sources support the generic ingredient identity, without transferring any product- or study-specific quantity or performance claim.

Keep the crop and its milling fractions separate: `ingredient-ref-common-millet` remains the grain identity, `ingredient-ref-proso-millet-flour` remains flour, and the proposed row represents bran. Do not add the broad `millet bran` as an alias: the identity is specifically *Panicum miliaceum*, and the picker can surface this species-qualified row for a broad phrase while its display clarifies the grain. Add only the crosswalked English alias `common millet bran` to support the alternate crop name; the alias is compositional, derived from OQLF's crop crosswalk and CFIA's source-grain naming rule, rather than an exact phrase quoted from either source.

Use `son de millet commun` as a provisional French display derived from OQLF's preferred crop name `millet commun` and its base term `son`. OQLF does not attest this exact compound as a Québec-preferred food term, and its older `son` entry discusses milling by-products and animal-feed use. The human-food use here is established by the primary food studies, not by that terminology record. Keep the compound visibly provisional until it receives independent Québec review.

Add no forms, density, unit mappings, measurements, conversions, package yields, recipe links, or substitutions. Leave measurement and substitution research as `not_yet_researched`. Do not use the papers' particle sizes, percentages, flour-replacement amounts, nutrient values, storage findings, or bread outcomes as generic ingredient data.

## Evidence and naming boundary

| Claim | Generic evidence reviewed | Limit |
|---|---|---|
| Proso millet and common millet identify the same crop | OQLF's GDT entry maps the French preferred term `millet commun` to English `common millet` and `proso millet`, and to Latin *Panicum miliaceum*. | Crop-name crosswalk only; it does not define bran or attest the compound `son de millet commun`. The source was last updated in 2010. |
| Bran from a non-wheat grain is named with the source grain | CFIA says unqualified `bran` is understood as wheat bran and directs that the grain name be stated for bran from another source, giving `oat bran` as an example. | Canadian common-name guidance supports explicit English grain qualification. It does not specifically name millet bran, establish French terminology, or establish human-food use. |
| Proso millet bran is a distinct edible milling fraction | A 2020 primary study describes bran generated as a by-product of proso millet decortication and investigates its use as a gluten-free bread ingredient. A 2023 primary study independently studies proso millet bran in gluten-free pan bread. | The papers establish a human-food ingredient and food use. Their particular bran fractions, samples, processes, formulas, quantities, composition, and outcomes remain study-specific. |
| `son` can be used as a French base term | OQLF defines `son` as a peripheral cereal portion separated during milling. | The entry dates to 1982, does not attest `son de millet commun`, and discusses other milling by-products and animal-feed use. It cannot decide Québec retail preference or human-food identity. |

The papers concern proso/common millet (*Panicum miliaceum*), not all millet species. Do not broaden the entry to bran from pearl, finger, foxtail, kodo, or other millet crops. The 2020 paper's `<500 µm` fraction, nutrient profile, storage observations, micronization parameters, and 10% bread formula are not reusable ingredient measurements. The 2023 paper's coarse, medium, and superfine particle sizes, soaking and enzyme treatment, 10% rice-flour replacement, and reported bread results are likewise source- and formula-specific.

## Prior review and queue reconciliation

The current A7 parent asks for review of other grain meals and milling products. The [generic scope review](../batches/generic-ingredient-scope-review-20261019/README.md) says coverage should focus on ingredient diversity across ingredient types, preserve existing commercial entries, and stop brand-, product-line-, flavour-, and retailer-variant-only roster work. This review follows that scope and leaves the A7 parent open for other generic gaps.

Any further research devoted to Anson Mills' named `Colonial-Style Toasted Stone Cut Wheat Meal` product is **out of scope** for this pass because an additional commercial-product count does not add ingredient diversity. Preserve the historical R605 record, its product-scoped evidence, and all existing catalog rows; do not delete or merge branded identities and do not transfer that product's claims to generic wheat meal. R875 already retains the separate generic wheat-meal hold. This proposal selects the proso millet bran gap instead.

The [R867 sorghum-bran proposal](wp02-generic-grain-cereal-milling-diversity-review-r867-20261019.md) and [R872 triticale-bran proposal](wp02-generic-triticale-bran-identity-review-r872-20261019.md) provide recent generic milling-fraction precedents. Their provisional French compounds do not attest this proso compound; the terminology limit is assessed independently here.

## Live ownership and data audit

Read-only snapshot of the live package and ledger on 2026-10-19:

| Store | Snapshot | Finding |
|---|---:|---|
| Ingredient references | 1,909 rows | No active ID or exact full-term owner exists for `proso millet bran`, `common millet bran`, `son de millet commun`, or `son de proso`. `ingredient-ref-common-millet` owns `common millet / millet commun`, including the English alias `proso millet`; `ingredient-ref-proso-millet-flour` owns proso millet flour separately. The target identity and its proposed aliases are distinct from those owners. |
| Grain-bran references | Current rows read | Generic rows exist for wheat, barley, corn, oat, rice, rye, sorghum, and triticale bran. The proso-millet bran fraction is absent. Existing branded cereal and bran-containing product references remain untouched. |
| Ingredient forms | 201 rows | The common-millet grain has a `dry` form. No proso-millet-bran identity or matching bran form exists. No form is proposed. |
| Research ledger | 2,315 records; 8 unit conversions | No record exists for `ingredient-ref-proso-millet-bran`, and no exact target phrase is owned. Reuse the existing OQLF crop, OQLF `son`, and CFIA bran source records; add two proposal-local research sources only if this recommendation is later integrated. No measurement, conversion, yield, recipe link, or substitution is proposed. |
| Legacy import identities | Current file read | No exact target identity or phrase was found. No duplicate or merge is proposed. |
| Recipe package | 114 manifest-listed files; 1,123 ingredient rows | No target phrase or proposed target ID appears in recipe text or ingredient rows. No bundled recipe demand supports a recipe link or reclassification. |

No existing branded entry, product-specific evidence, or recipe row is changed or generalized by this proposal.

## Picker projection

The static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete word phrases are matched first across reference and form terms, then substring matching is used only if there is no complete phrase match. The projection includes the one proposed English alias and French display.

| Query | Current result | With proposal | Interpretation |
|---|---|---|---|
| `proso millet` | Common millet grain; proso millet flour | Adds proso millet bran | Broad crop query returns its distinct grain, flour, and bran identities. |
| `proso millet bran` | No result | Proposed bran row | Exact species-qualified milling identity. |
| `common millet bran` | No result | Proposed bran row | Uses the proposed English crosswalk alias. |
| `millet bran` | No result | Proposed bran row | Phrase is present within the species-qualified display; this is search projection, not a broad alias. The result display retains `proso`. |
| `millet commun` | Common millet grain; proso millet flour | Adds proposed bran row | French crop phrase overlaps the grain, flour, and proposed bran identity. |
| `son de millet commun`; `son de millet` | No result | Proposed bran row | French display and its complete-phrase search result; terminology remains provisional. |
| `common millet` | Common millet grain | Adds proposed bran row | The proposed `common millet bran` alias contains the crop phrase; the result label distinguishes the bran fraction. |

The picker has expected overlaps for broad crop queries. Do not add `millet bran` as a stored alias or reassign the existing grain/flour rows.

## Proposed data delta for later integration

If accepted, add one reference row only:

```json
{
  "id": "ingredient-ref-proso-millet-bran",
  "nameEn": "proso millet bran",
  "nameFr": "son de millet commun",
  "aliasesEn": ["common millet bran"],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

The associated ledger record should be identity-only (`identityState: verified`, `measurementState: not_yet_researched`, `substitutionResearchState: not_yet_researched`), with an accepted identity decision and no substitution findings. No form or numerical data accompanies the identity. This proposal does not add that row or ledger record.

## Decision for integration

1. Add the generic species-qualified identity `proso millet bran / son de millet commun` as an identity-only `GRAIN_AND_CEREAL` reference, with English alias `common millet bran`; retain the provisional French terminology status.
2. Keep common-millet grain, proso-millet flour, millet species, and bran from other grains as separate identities. Do not add the broad `millet bran` alias.
3. Add no forms, measurements, density, unit mappings, conversions, yields, recipe links, or substitutions. Keep measurements and substitution research not yet researched; study-specific values and claims stay within their cited papers.
4. Mark further Anson Mills named-product research out of scope because commercial-product counts do not add ingredient diversity. Preserve the R605 history, existing branded rows, and product-specific evidence.
5. Keep the A7 parent open for other generic grain-meal and milling gaps. Obtain independent Québec French terminology review before treating `son de millet commun` as settled.

## Proposal-local and reused sources

The proposal-local source IDs below are not added to the shared ledger. Existing ledger source IDs are reused rather than duplicated.

| Source ID | Source and finding | Evidence limit |
|---|---|---|
| **R881-S01, proposal-local** | Čukelj Mustač et al., [Storage stability, micronisation, and application of nutrient-dense fraction of proso millet bran in gluten-free bread](https://www.sciencedirect.com/science/article/abs/pii/S0733521019306162), *Journal of Cereal Science* 91 (2020), article 102864; DOI [10.1016/j.jcs.2019.102864](https://doi.org/10.1016/j.jcs.2019.102864). | Primary food study describing bran from proso millet decortication and gluten-free bread use. Its separated `<500 µm` fraction, composition, storage duration, micronization, and 10% bread formula/results remain study-specific. |
| **R881-S02, proposal-local** | Novotni et al., [Influence of Particle Size and Xylanase Pretreatment of Proso Millet Bran on Physical, Sensory and Nutritive Features of Gluten-Free Bread](https://www.ftb.com.hr/archives/1796-influence-of-particle-size-and-xylanase-pretreatment-of-proso-millet-bran-on-physical-sensory-and-nutritive-features-of-gluten-free-bread), *Food Technology & Biotechnology* 61(1), 73–84 (2023); DOI [10.17113/ftb.61.01.23.7776](https://doi.org/10.17113/ftb.61.01.23.7776). | Independent primary food study. Its bran particle sizes, soak/enzyme process, 10% rice-flour replacement, measured composition, and bread outcomes are not general-purpose measures or performance guarantees. |
| **Reused: `WP03-S180`** | OQLF, [`millet commun` (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506451/millet-commun), last updated 2010. | Supports the crop mapping `millet commun` ↔ `common millet` / `proso millet` ↔ *Panicum miliaceum*. It does not define bran or establish the French bran compound. |
| **Reused: `WP03-BARLEY-BRAN-QC-R89-20261013-S01`** | OQLF, [`son` (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432756/son), last updated 1982; alimentation / céréale traitée entry. | Defines the French base term in a cereal-milling context. Its broader note discusses milling by-products and feed; it does not attest `son de millet commun` or human-food use. |
| **Reused: `WP03-BARLEY-BRAN-20261013-R56-S03`** | CFIA, [Labelling and composition requirements for grain and bakery products](https://inspection.canada.ca/en/food-labels/labelling/industry/grain-and-bakery-products), accessed 2026-10-19, Common name — Bran. | Says the grain name must be stated for non-wheat bran. The example is oat bran; this supports explicit English naming but does not attest a millet-specific legal term or French wording. |

No software tests, build, emulator run, or deployment checks were run; this is a proposal document only.
