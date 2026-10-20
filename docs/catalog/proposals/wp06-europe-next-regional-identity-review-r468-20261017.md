# WP06 Europe — Aceto Balsamico di Modena PGI identity review (R468)

- **Reviewed:** 2026-10-17.
- **Status:** Reviewed and integrated as one identity-only reference with six source records. No forms, measurements, conversions, recipe links, yields, or substitutions were added.
- **Snapshot:** The ownership table and picker/corpus audit describe the pre-integration workspace read on 2026-10-17.
- **Scope:** One protected Italian condiment identity: **Aceto Balsamico di Modena PGI**. This is the still-unallocated PGI identity, separate from the existing generic balsamic vinegar and Traditional Balsamic Vinegar of Modena PDO.
- **Proposed reference ID:** `ingredient-ref-balsamic-vinegar-of-modena-pgi`.
- **Proposed source-ID prefix:** `WP06-EUROPE-MODENA-PGI-BALSAMIC-R468-20261017`, with `S01`–`S06`. The reference ID, source prefix and IDs, six new source URLs, and target path were checked for collisions.

## Recommendation

**Add** one identity-only `SAUCE_AND_CONDIMENT` reference for **`Vinaigre balsamique de Modène IGP / Balsamic Vinegar of Modena PGI`**. The current EU single document registers `Aceto Balsamico di Modena` as a PGI, identifies it as vinegar, and sets its protected production area across the provinces of Modena and Reggio Emilia. The product is therefore narrower than generic balsamic vinegar and distinct from the Modena Traditional PDO already recorded by R420. [S01; existing R420 source S04]

The proposed French display matches the current Mayrand Québec listing, which showed the Valli 2 L item in stock at its Anjou, Laval, Brossard, and Saint-Jérôme stores when accessed. The English display matches a current Walmart Canada listing. These retail pages support market wording and a point-in-time Canadian listing; the EU specification establishes the protected identity. [S05–S06]

The bundled recipes contain no balsamic or Modena demand. The open Europe coverage item still includes regional products beyond the completed R460 saffron, R464 Guérande salt, and R466 Parma ham reviews. This candidate is distinct from the held R453 grissino stirato and R457 Turrón de Jijona reviews and from the earlier cheese, tomato, and piquillo work. R420 expressly left Modena PGI unallocated while integrating only the Traditional Modena PDO. [Plan; R420, R453, R457, R460, R464, R466]

### Proposed catalog row

Add only:

```json
{
  "id": "ingredient-ref-balsamic-vinegar-of-modena-pgi",
  "nameFr": "Vinaigre balsamique de Modène IGP",
  "nameEn": "Balsamic Vinegar of Modena PGI",
  "aliasesFr": [],
  "aliasesEn": ["Aceto Balsamico di Modena IGP"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-17T00:00:00Z",
  "category": "SAUCE_AND_CONDIMENT"
}
```

The French display reproduces Mayrand's Québec-facing item title. The English display follows the Canadian Walmart title and the Consortium's English product wording. The registered Italian name is `Aceto Balsamico di Modena`; the PGI/IGP wording identifies its protected status in the matching language. The Italian alias makes the protected name searchable. These bilingual display strings are catalogue terms drawn from current market wording; they are not instructions for how a protected package label must be laid out. [S01–S06]

Do not add bare `balsamic`, `balsamic vinegar`, `vinaigre balsamique`, `Modena balsamic vinegar`, `vinaigre balsamique de Modène`, glaze, reduction, or cream aliases. The display names already make the broad balsamic phrases find this row, and qualifiers keep its identity visible. Do not add `Riserva` or `Invecchiato` as separate identities or ingredient forms; these are regulated ageing descriptors within the same PGI. [S01–S04]

## Product and naming boundaries

The European Commission's 2025 single document gives the registered name as `Aceto Balsamico di Modena`, marks it PGI rather than PDO, and describes a vinegar produced within the administrative areas of Modena and Reggio Emilia. It requires the raw-material blending, preparation, maturation, and any ageing to take place within that area. It also distinguishes standard, aged, and `Riserva` labelling. [S01]

Keep adjacent products separate:

- **`ingredient-ref-balsamic-vinegar` / `balsamic vinegar / vinaigre balsamique`:** retain this broad active owner. Its accepted ledger decision keeps protected and regional subtypes outside the unqualified identity. Reuse the existing OQLF and CFIA vinegar terminology sources; do not add duplicate ledger sources. [Existing generic record]
- **Traditional Balsamic Vinegar of Modena PDO:** retain the R420 row and its exact Italian PDO alias. The R420 source from European Commission Implementing Regulation (EU) 2023/512 records the distinction between Modena PGI and Traditional Modena PDO, which use different raw materials and methods. Reuse source ID `WP06-EUROPE-MODENA-BALSAMIC-R420-20261017-S04`; do not duplicate it. [R420]
- **Traditional Balsamic Vinegar of Reggio Emilia PDO:** this remains a separate protected identity. The Ministry index reviewed for R420 lists it apart from both Modena products. Do not make this Modena PGI row represent Reggio Emilia. [R420]
- **Glazes, reductions, creams, white or flavoured balsamic condiments, and prepared products containing balsamic vinegar:** keep these prepared-product identities outside the vinegar row. Mayrand lists glaze, cream, and white condiment items separately from its Modena IGP vinegar item. [S05]

The current WP06 Europe plan item remains open at [the Europe coverage checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L9312). R420 is an accepted boundary and PDO identity, not an allocation of this PGI. [R420 integration]

## Live ownership and archive audit

Read-only workspace snapshot checked on 2026-10-17:

| Surface | Snapshot | Finding |
|---|---:|---|
| Active ingredient references | 1,749 | The two related rows are the generic `ingredient-ref-balsamic-vinegar` and R420's `ingredient-ref-traditional-balsamic-vinegar-of-modena`. No exact owner exists for the proposed PGI ID, localized qualified names, or Italian PGI term. The R420 PDO row does not use the PGI name as an alias. |
| Ingredient forms | 141 | No balsamic-, Modena-, PGI-, or proposed-ID form label or match term was found. |
| Legacy import candidates | 56 | No candidate for the PGI name or proposed reference ID was found. The generic balsamic identity is already active. |
| Research ledger | 2,108 records; 9,601 source entries; 8,148 distinct source IDs; 6,861 distinct source URLs; 8 unit conversions | No PGI-specific record or R468 source-prefix allocation exists. All six proposed source IDs and exact URLs are free. The existing generic and R420 records provide separate, reusable terminology and PGI/PDO-boundary sources. |
| Active substitutions and package yields | 0 global rules; 0 contextual rules; 1 package yield | No candidate-specific rules, yield, or conversion exists; the single yield is unrelated. |
| Proposal and batch archive | 2,813 Markdown files | R420 says the PGI remains unallocated. Exact proposed-ID, R468-prefix, six URL, and target-path scans found no allocation collision. R453 and R457 are separate picker-based holds; R460, R464, and R466 are completed identities for other products. |

The audited live inputs include the [active references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), [global substitutions](../../../app/src/main/assets/seed/bundled-library/substitution-rules.v1.json), [contextual substitutions](../../../app/src/main/assets/seed/bundled-library/contextual-substitution-rules.v1.json), and [package yields](../../../app/src/main/assets/seed/bundled-library/package-yields.v1.json). The generic record's accepted decision keeps protected/regional subtypes outside its unqualified row. The R420 integration README explicitly leaves Modena PGI unallocated. The proposed row, source IDs, URLs, and path are not present in these live inputs or the review archive.

## Phrase-first picker projection

The projection follows accent-, punctuation-, and case-folded phrase-first search in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It includes the proposed bilingual names and one Italian alias above. A query matches complete normalized word phrases within names and aliases before the fallback partial match.

| Query | Current result | With proposed row |
|---|---|---|
| `Vinaigre balsamique de Modène IGP`; `Balsamic Vinegar of Modena PGI`; `Aceto Balsamico di Modena IGP`; `Aceto Balsamico di Modena` | No PGI result | Proposed PGI row only |
| `balsamic vinegar`; `vinaigre balsamique`; `balsamic` | Generic balsamic row + Traditional Modena PDO row | Generic row + Traditional Modena PDO row + Modena PGI row |
| `aceto balsamico` | Traditional Modena PDO row | Traditional Modena PDO row + Modena PGI row |
| `balsamic vinegar of Modena` | Traditional Modena PDO row | Traditional Modena PDO row + Modena PGI row |
| `vinaigre balsamique de Modène` | No result | Modena PGI row only |
| `Traditional balsamic vinegar of Modena DOP`; `vinaigre balsamique traditionnel de Modène AOP` | Traditional Modena PDO row only | Traditional Modena PDO row only |
| `Modena`; `Modène` | Traditional Modena PDO row | Traditional Modena PDO row + Modena PGI row |

Generic searches intentionally expand to three visible choices, preserving the broad owner alongside both qualified Modena products. The exact protected PGI name resolves only to the proposed row. The English regional query `balsamic vinegar of Modena` returns both Modena products, whose display names show the PGI/PDO distinction. The shorter French query `vinaigre balsamique de Modène` is currently unassigned because the PDO display includes `traditionnel`; with the proposed PGI row it resolves to the new row alone. No alias makes the PGI row appear to own generic vinegar or a prepared glaze.

## Complete bundled recipe scan

All **114 manifest-listed recipe JSON files** and **1,123 structured ingredient rows** were parsed as UTF-8 in manifest order. Each complete decoded recipe and each ingredient row was checked for generic balsamic wording, the official Italian designation and its variants, the proposed bilingual titles and ID, Modena, and PGI/IGP terms. The scan found **zero matching recipe files, zero matching ingredient rows, and zero recipe links**. No bundled amount, form, or recipe-specific substitution supports this candidate.

The manifest-order recipe corpus contains **753,988 bytes** and has fingerprint `94505e664f049b1bdaee06ea27db86d3d9f817df11c8ac7f73a5b5dc29e5828b`. The fingerprint hashes each manifest-relative path, a NUL byte, the lowercase SHA-256 digest of that recipe file, and a newline, then hashes the concatenated bytes.

## Forms, measurements, and substitutions

The current specification lists minimum analytical density thresholds that differ by ageing designation: 1.06 at 20 °C for the matured product, 1.15 for aged, and 1.25 for `Riserva`. Those are regulatory minimums, not measured representative ingredient densities. Do not set `defaultDensity` from any of them or add a numeric observation or unit mapping. The specification's allowed direct-consumption container capacities and Mayrand's 2 L Valli package are product packaging, not recipe measures, conversion factors, or reusable package yields. [S01–S02, S05]

If integrated, keep forms empty, `defaultDensity` null, and `unitMappings` empty. Add no measurement observation, package-yield rule, conversion, or recipe link. No recipe-context or tested substitution was established here; add no global or contextual substitution and retain `substitutionResearchState: not_yet_researched`. Do not infer interchangeability with generic balsamic vinegar, Traditional Modena PDO, Reggio Emilia PDO, or glaze. [S01–S06; existing R420 boundary source]

## Source register

Sources were accessed on 2026-10-17. The six new source IDs and exact URLs were checked against the live ledger; the existing R420 and generic-vinegar sources remain under their current IDs.

| Source ID | Source and locator | Use and limit |
|---|---|---|
| `WP06-EUROPE-MODENA-PGI-BALSAMIC-R468-20261017-S01` | European Commission, Official Journal, [2025 amendment and single document for Aceto Balsamico di Modena](https://eur-lex.europa.eu/legal-content/EN/ALL/?uri=CELEX%3A52025XC04115), single document sections 1–4, accessed 2026-10-17. | Primary current specification for the registered Italian name, PGI status, vinegar identity, Modena/Reggio Emilia production area, ageing labels, permitted packaging, and analytical thresholds. Official regulatory amounts are not kitchen measures or representative density data. |
| `WP06-EUROPE-MODENA-PGI-BALSAMIC-R468-20261017-S02` | Consorzio Tutela Aceto Balsamico di Modena, [English organoleptic characteristics](https://www.consorziobalsamico.it/balsamic-vinegar-of-modena/organoleptic-characteristics/?lang=en), accessed 2026-10-17. | Designation body's English product wording and ageing categories. Supports `Balsamic Vinegar of Modena` and the PGI-associated Italian name; it does not establish household measures. |
| `WP06-EUROPE-MODENA-PGI-BALSAMIC-R468-20261017-S03` | Consorzio Tutela Aceto Balsamico di Modena, [French product page](https://www.consorziobalsamico.it/vinaigre-balsamique-de-modene/?lang=fr), accessed 2026-10-17. | Designation body's French term `Vinaigre Balsamique de Modène` and IGP status. The consortium is the designation body's source, not an independent Québec terminology authority. |
| `WP06-EUROPE-MODENA-PGI-BALSAMIC-R468-20261017-S04` | Consorzio Tutela Aceto Balsamico di Modena, [English labelling guidelines](https://www.consorziobalsamico.it/wp-content/uploads/2024/06/Linee-guida-etichettatura-ABM-IGP-maggio-2024-EN.pdf), designation section, May 2024, accessed 2026-10-17. | Clarifies that the registered name is in Italian and English translations are permitted. These guidelines govern protected-label presentation; catalogue display names are taken from localized market wording and should not be read as a legal label template. |
| `WP06-EUROPE-MODENA-PGI-BALSAMIC-R468-20261017-S05` | Mayrand, [French Valli product page — Vinaigre balsamique de Modène IGP, item 10290](https://mayrand.ca/fr/nos-produits/epicerie/huile-et-vinaigre/vinaigre-balsamique/vinaigre-balsamique-de-modene-igp-10290), accessed 2026-10-17. | Exact Québec-facing French title and point-in-time store stock status at Anjou, Laval, Brossard, and Saint-Jérôme. The 2 L and 2 × 2 L figures are this SKU's package sizes. The retailer page is not an independent certification audit, and store inventory can change. |
| `WP06-EUROPE-MODENA-PGI-BALSAMIC-R468-20261017-S06` | Walmart Canada, [English Unico product page — Balsamic Vinegar of Modena PGI, 500 ml](https://www.walmart.ca/en/ip/Unico-Balsamic-Vinegar-of-Modena-PGI/10284578), accessed 2026-10-17. | Exact Canadian English retail title and a current online listing. The page's selected fulfillment location is Mississauga, not Québec, and supplier-facing product details do not independently certify this SKU. The 500 ml is package size only. |
| Existing source `WP06-EUROPE-MODENA-BALSAMIC-R420-20261017-S04` | European Commission, [Implementing Regulation (EU) 2023/512](https://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX%3A32023R0512), recital 14; already recorded in the ledger. | Establishes the distinction between Modena PGI and Traditional Modena PDO by their different raw materials and production methods. Reuse the existing source ID and URL; do not create a duplicate source entry. |
| Existing source `WP05-VINEGAR-INT-20261012-S06` | Office québécois de la langue française, [Grand dictionnaire terminologique — vinaigre balsamique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26522907/vinaigre-balsamique); already recorded in the generic ledger record. | Supports the generic Québec French/English pair `vinaigre balsamique / balsamic vinegar`. Reuse for the broad-owner boundary only; it does not name the Modena PGI. |

## Disposition

Added one identity-only `SAUCE_AND_CONDIMENT` row for **`Vinaigre balsamique de Modène IGP / Balsamic Vinegar of Modena PGI`**, with `Aceto Balsamico di Modena IGP` as its only alias. Preserved the existing generic balsamic owner and Traditional Modena PDO; kept Reggio Emilia PDO and prepared balsamic products separate. Broad English and French balsamic-vinegar queries now return three qualified choices, while the exact PGI name resolves to the new row. No forms, measures, density, conversions, yields, recipe links, or substitutions were added. The Europe-wide regional coverage item remains open. See the integration record at `../batches/wp06-europe-modena-pgi-balsamic-integration-r468-20261017/README.md`.

No software tests, build, emulator run, or deployment were performed because this update adds database JSON data and documentation under `AGENTS.md`.
