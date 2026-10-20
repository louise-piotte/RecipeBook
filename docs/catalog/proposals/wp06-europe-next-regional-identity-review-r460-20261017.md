# WP06 Europe — Krokos Kozanis PDO saffron identity review (R460)

- **Reviewed:** 2026-10-17.
- **Status:** Accepted and integrated as an identity-only reference; the broader Europe checklist remains open.
- **Checklist:** The WP06 Europe regional sweep remains open for Western, Southern, Northern, Central, and Eastern Europe in the [global plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L9285). This review covers one Greek regional spice identity and does not complete regional coverage.
- **Scope:** The protected Greek saffron product **Krokos Kozanis PDO**, grown and processed in the Kozani region. Keep it distinct from the existing generic `saffron / safran` row and other saffron origins.
- **Source IDs:** `WP06-EUROPE-KROKOS-KOZANIS-R460-20261017-S01` through `S06`, now registered on `ingredient-ref-krokos-kozanis-pdo`; audit label `WP06-EUROPE-KROKOS-KOZANIS-R460-20261017-R01`.

## Recommendation

**Add one identity-only `BAKING_AND_SPICE` reference** for **`safran Krokos Kozanis AOP / Krokos Kozanis PDO saffron`**, if accepted. The European Commission identifies Krokos Kozanis as a PDO and describes Greek saffron production as coming exclusively from Kozani. It covers saffron made from *Crocus sativus* stigmas that are hand harvested, dried, checked, and packed under the regional process. The PDO therefore has a clear regional product identity beyond the already active generic saffron reference. [S01–S03]

Use the exact regional name with localized AOP/PDO wording. Retain **`Krokos Kozani Saffron`** as the sole English alias because a Canadian retailer uses that exact product title and its description names Krokos Kozanis. Do not add broad `Greek saffron` / `safran de Grèce`, bare `Krokos`, or generic saffron aliases. The title `Krokos Kozani Saffron` is local product wording; it is not used here as proof that the cited SKU itself carries PDO certification. [S02, S04–S06]

### Proposed catalog row

| Field | Value |
|---|---|
| id | `ingredient-ref-krokos-kozanis-pdo` |
| nameFr | `safran Krokos Kozanis AOP` |
| nameEn | `Krokos Kozanis PDO saffron` |
| aliasesFr / aliasesEn | empty / `Krokos Kozani Saffron` |
| defaultDensity | `null` |
| unitMappings | empty |
| category | `BAKING_AND_SPICE` |

The French form follows the European Commission's current French name `Krokos Kozanis AOP`, the Canadian French campaign phrase `safran Krokos Kozanis AOP`, and OQLF's existing generic preferred term `safran`. It is a localized display proposal, not a claim that OQLF has ruled on this regional name. The English alias reflects one Canadian product-title spelling variant; do not expand it to `Greek saffron`, `Greek red saffron`, or a generic `saffron threads` alias. [S02, S04, S06; reused OQLF source below]

## Product and naming boundaries

- **Protected identity:** The Commission says PDO status requires production, processing, and preparation in the designated region. Its profile places current Greek saffron production exclusively in Kozani. The cooperative's product page identifies `Krokos Kozanis` as its PDO name and describes the cooperative's role in collection and packaging. [S01, S03]
- **Generic saffron:** Keep existing `ingredient-ref-saffron` / `safran / saffron` unchanged. It remains the general *Crocus sativus* spice identity. The regional row is an additional origin-specific choice, not a replacement for the generic ingredient or a claim that all saffron is from Kozani. The existing WP05 review already establishes OQLF's generic bilingual terminology and keeps Spanish package wording from becoming a saffron alias. [reused WP05-SAFFRON-20261013-S01–S02]
- **Other origins and product names:** Do not add Iranian, Spanish, Kashmiri, or other origin labels, or other European saffron PDO names, as aliases to this row. The existing data has no identity allocation for those products; they remain outside this review.
- **Regional French:** The Commission's French page uses `Krokos Kozanis AOP` and describes it as `safran de Grèce`. A Canadian French campaign uses `safran Krokos Kozanis AOP`. Keep the regional qualifier in the display and leave generic `safran de Grèce` unassigned because it can describe Greek-origin saffron more broadly than this protected product. [S02, S06]
- **Retail spelling:** Select Bakery's Toronto page titles the item `Krokos Kozani Saffron 1gr`; its body calls Greek saffron `Krokos Kozanis`. This supports the narrow exact alias but does not show the package certification mark. KirIan's Ontario importer page separately says Krokos Kozanis is produced under PDO, but its retail listing is titled `Greek Red Saffron Filaments – Organic`. Neither page establishes a Québec-preferred product name or current inventory. [S04–S05]

## Live ownership and archive audit

Read-only workspace snapshot taken on 2026-10-17 before R461 was integrated:

| Surface | Snapshot | Finding |
|---|---:|---|
| Active ingredient references | 1,744 | No Krokos Kozanis reference or alias and no `ingredient-ref-krokos-kozanis-pdo` owner. Existing `ingredient-ref-saffron` is generic `saffron / safran` with empty aliases. |
| Ingredient forms | 141 | No saffron, Krokos, Kozani, or Kozanis form label, match term, or proposed-ID owner. |
| Legacy import candidates | 56 | No regional saffron candidate or proposed-ID owner. |
| Research ledger | 2,103 records; 9,575 source entries; 8,122 distinct source IDs; 6,835 distinct source URLs | No Krokos/Kozani identity, proposed reference ID, R460 source prefix, or new-source-URL collision. The existing generic saffron record has the reused OQLF and Super C sources noted above. |
| Numeric and rule data | 2 form-conversion ledger records; 0 global substitutions; 0 contextual substitutions; 1 package yield | No saffron-specific conversion, package yield, substitution, density, or unit mapping. The package-yield record belongs to another ingredient. |
| Proposal and batch archive | Current catalog archive | Exact searches found no Krokos Kozanis / Kozani saffron proposal, integration, or allocation. The target file path, proposed ID, source prefix, and S01–S06 URLs were clear before authoring. |

The audit covered bilingual active reference names and aliases, form labels and match terms, all legacy candidate text, ledger records and source IDs/URLs, WP06 Europe proposals and batches, and the current Europe checklist. It also checked nearby generic saffron ownership and the separate prior Chios mastic identity. At proposal time, R460's source IDs were unallocated. Root registered S01–S06 on the accepted identity record. Existing OQLF and Super C evidence is reused by its current source IDs; no duplicate ledger entry was added. Europe-wide coverage remains open. [R01]

## Phrase-first picker projection

Projection follows the accent-, punctuation-, and case-folding phrase-first matching in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It uses the proposed names and one exact English retailer-title alias, without forms.

| Query | Current result | With proposed row |
|---|---|---|
| `Krokos Kozanis AOP`; `Krokos Kozanis PDO` | No result | `ingredient-ref-krokos-kozanis-pdo` only |
| `Krokos Kozani Saffron` | No result | `ingredient-ref-krokos-kozanis-pdo` only |
| `Krokos Kozani`; `Krokos` | No result | `ingredient-ref-krokos-kozanis-pdo` only through contained-name matching |
| `saffron`; `safran` | `ingredient-ref-saffron` only | Generic saffron plus the Krokos Kozanis row |
| `Greek saffron`; `safran de Grèce` | No result | No result; these broader phrases are not aliases |
| `saffron powder`; `powdered saffron`; `filaments de safran` | No result | No result; no forms are proposed |

The broad `saffron` and `safran` searches gain a second, explicitly regional result alongside the existing generic row. This is a choice between the general spice and the protected Kozani product, not a singleton assignment. The exact Canadian product title and official PDO wording resolve to the regional row. No regional form is being used to claim that generic saffron powder or filaments must come from Kozani.

## Complete bundled recipe scan

All **114 manifest-listed recipe JSON files** and **1,123 structured ingredient rows** were parsed as UTF-8. The scan covered complete decoded recipe documents and each ingredient row, including original text, ingredient name, reference ID, and form ID. It checked `Krokos Kozanis`, `Krokos Kozani`, `Kozani saffron`, `Greek saffron`, `Greek red saffron`, `safran Krokos Kozanis`, `saffron`, `safran`, *Crocus sativus*, and the proposed reference ID.

The scan found **zero matching recipe files, zero matching ingredient rows, and zero linked recipe IDs**. The generic saffron ingredient has no bundled demand either. The manifest-order corpus contains **753,988 bytes** and has fingerprint `94505e664f049b1bdaee06ea27db86d3d9f817df11c8ac7f73a5b5dc29e5828b`. The fingerprint hashes each manifest-relative path, a NUL byte, the lowercase SHA-256 hex digest of that recipe file, and a newline, then hashes the concatenated bytes. [R01]

## Forms, measurements, conversions, and substitutions

- **Forms:** The Commission describes dried stigmas/filaments and also says the PDO product may be sold as powder. The producer cooperative's current product index separately lists filament and powder saffron. These are supported retail presentations, but no forms are proposed in this bounded identity review: the generic saffron row currently has no forms, and adding only Krokos forms would make broad searches such as `saffron powder` resolve solely to this PDO product. Revisit forms if generic saffron form coverage can be represented without that misleading singleton. Do not infer a form conversion between powder and filaments. [S01–S03]
- **Measurements and density:** The Commission lists typical PDO sales packages of 1, 2, 4, or 28 g, and powder packages from 0.25 to 1 g. The Canadian pages list SKU package amounts, including a nominal 1 g title. These are commercial package sizes, not recipe amounts or portions. Store no reusable measurement, active density, or unit mapping. [S01–S05]
- **Conversions and yields:** The sources provide no kitchen conversion between a volume of filaments/powder and mass, no region-specific density, and no usable-to-purchased yield. Package sizes and harvest/production facts are not conversion or yield data. Add none.
- **Recipe links:** The full bundled scan found no matching recipe line. Add no recipe links.
- **Substitutions:** No focused substitution research was performed for Krokos Kozanis. Add no global or contextual rule and do not infer replacement equivalence from the generic saffron identity.

## Evidence limits and source register

The Commission and cooperative material establish the protected regional product. The Canadian sources establish current-facing naming and retailer presence, but stock and Québec availability are limited: the directly checked Select Bakery and KirIan pages reported out of stock, and no Québec retailer with confirmed in-stock product was found. A Canadian French campaign dated 2026-10-05 uses `safran Krokos Kozanis AOP`, but that promotional copy is not an OQLF terminology ruling or retail-stock confirmation. Direct retrieval of the producer-cooperative `safran.gr` page was blocked with HTTP 403; its indexed content was reviewed, and the identity is independently confirmed by the European Commission. Pages were checked on 2026-10-17 unless a source date is stated below.

| Source ID | Source and locator | Use and limit |
|---|---|---|
| `WP06-EUROPE-KROKOS-KOZANIS-R460-20261017-S01` | European Commission, [Krokos Kozanis PDO](https://agriculture.ec.europa.eu/farming/geographical-indications-and-quality-schemes/geographical-indications-food-and-drink/krokos-kozanis-pdo_en), production, packaging, uses, and legal-specification links. | Primary EU source for PDO status, Kozani scope, saffron identity, dried presentation, powder presentation, package sizes, and general culinary use. Package figures are not cooking measures. The profile has no visible revision date. |
| `WP06-EUROPE-KROKOS-KOZANIS-R460-20261017-S02` | European Commission, [Krokos Kozanis AOP](https://agriculture.ec.europa.eu/farming/geographical-indications-and-quality-schemes/geographical-indications-food-and-drink/krokos-kozanis-pdo_fr), French localized product profile. | Official French page uses `Krokos Kozanis AOP` and describes it as `safran de Grèce`; supports the AOP display and regional context, not a Québec-specific preferred full name. |
| `WP06-EUROPE-KROKOS-KOZANIS-R460-20261017-S03` | Kozani Saffron Producers Cooperative, [The Cooperative](https://safran.gr/the-cooperative/), official name, collection/packing role, and PDO registration. | Producer source identifies Krokos Kozanis as the PDO name and the cooperative's role. Direct page retrieval returned HTTP 403; the indexed page content was reviewed. EU source S01 independently confirms the product boundary. |
| `WP06-EUROPE-KROKOS-KOZANIS-R460-20261017-S04` | Select Bakery, Toronto, [Krokos Kozani Saffron 1gr](https://www.selectbakery.ca/shop/spices-sauces/krokos-kozani-saffron-1gr/), product title and description. | Canadian product-title wording and filament presentation; the page says it ships across Canada but displayed `Out of stock` at review time. The page body names Krokos Kozanis but does not show or attest the specific SKU's PDO mark. Package details remain SKU-specific. |
| `WP06-EUROPE-KROKOS-KOZANIS-R460-20261017-S05` | KirIan Greek Imports, Ontario, [Greek Red Saffron Filaments — Organic](https://kiriangoods.com/product/greek-red-saffron-filaments-organic/), product description and retailer location. | Canadian importer page says Krokos Kozanis is produced under PDO and names a 1 g filament product; it displayed `Out of stock` at review time. It is not a Québec retailer or proof of current inventory, and the SKU page does not reproduce a package label. |
| `WP06-EUROPE-KROKOS-KOZANIS-R460-20261017-S06` | CNW, Premium European Products Program, [Un ingrédient traditionnel, une cuisine moderne : découvrez le safran Krokos Kozanis AOP cet automne](https://www.newswire.ca/fr/news-releases/un-ingredient-traditionnel-une-cuisine-moderne-decouvrez-le-safran-krokos-kozanis-aop-cet-automne-836928326.html), published 2026-10-05. | Current Canada-facing French campaign uses the proposed regional phrase and promotes Kozani saffron to Canadian cooks. It is promotional content, not OQLF guidance or retailer inventory; direct fetch returned a cache miss, and indexed page content was reviewed. |
| Reused `WP05-SAFFRON-20261013-S01` | OQLF, [GDT — safran](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095427/safran), existing source on `ingredient-ref-saffron`. | Supports the generic preferred French term `safran` and English equivalent `saffron`. It does not establish the Krokos Kozanis regional name. Do not duplicate this source in the ledger. |
| Reused `WP05-SAFFRON-20261013-S02` | Super C, [Filaments de safran espagnol](https://www.superc.ca/allees/garde-manger/fines-herbes-epices-et-sauces/epices/filaments-de-safran-espagnol/p/059749961349), existing source on `ingredient-ref-saffron`. | Keeps the previously documented Québec generic saffron / Spanish SKU boundary intact. Its package is not evidence for a Krokos Kozanis measure or alias. |
| `WP06-EUROPE-KROKOS-KOZANIS-R460-20261017-R01` | Read-only audit of the Europe checklist, active references/forms, legacy candidates, research ledger, picker, proposal/integration archive, manifest, and all bundled recipes. | Records counts, candidate and source-ID ownership, picker projection, and the complete recipe scan. Repository evidence only. |

## Disposition

**Accepted and integrated:** added the identity-only `ingredient-ref-krokos-kozanis-pdo` row using `safran Krokos Kozanis AOP / Krokos Kozanis PDO saffron` and only the English market-title alias `Krokos Kozani Saffron`. Preserved the generic `saffron / safran` reference; added no forms, measures, density, unit mappings, conversions, yields, recipe links, or substitutions. The source-backed filament and powder presentations remain unmodeled here because attaching them only to this origin-specific row would make broad form queries misleading. The Europe-wide regional checklist remains open.

Root rechecked current ownership, source-ID/URL allocation, picker results, and the 114-file / 1,123-row recipe corpus after R461. Static package normalization, generated-index freshness, ledger-schema validation, source ownership, UTF-8/no-BOM, and scoped whitespace checks passed. No app or Android tests were run for this database-JSON addition under `AGENTS.md`.

Post-integration snapshot: 1,746 references / 141 forms; 2,105 ledger records / 9,584 source entries / 8,131 distinct source IDs / 6,844 distinct source URLs; 114 recipes / 1,123 ingredient rows. See [R460 integration README](../batches/wp06-europe-krokos-kozanis-pdo-identity-integration-r460-20261017/README.md).
