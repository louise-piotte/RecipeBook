# WP06 Europe — Prosciutto di Parma PDO identity review (R466)

- **Reviewed:** 2026-10-17.
- **Status:** Accepted and integrated as an identity-only active reference. WP06 Europe remains open.
- **Checklist:** The regional sweep remains open for Western, Southern, Northern, Central, and
  Eastern Europe in the [global plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L9312).
  This review covers one protected Italian product and does not complete the sweep.
- **Scope:** The protected regional product **Prosciutto di Parma**, kept distinct from generic
  prosciutto, generic ham, Prosciutto di San Daniele, Spanish jamón, and other cured pork products.
- **Allocated source IDs:** `WP06-EUROPE-PROSCIUTTO-DI-PARMA-R466-20261017-S01` through `S06`,
  registered on the new ingredient-reference ledger record. Existing OQLF and EU specification
  sources are reused from the generic prosciutto record. Repository audit label
  `WP06-EUROPE-PROSCIUTTO-DI-PARMA-R466-20261017-R01` remains proposal-local.

## Accepted decision

**Add one identity-only `PROTEIN` reference** for **Prosciutto di Parma**. The European Commission
identifies Prosciutto di Parma as a PDO product whose production area is limited to the Province of
Parma. Its current English and French profiles describe it as a raw, aged ham; the 2025 approved
specification keeps the registered product name geographically qualified. The eligible pig-rearing
area is broader than the production area, so this review does not claim that the pigs themselves
must originate in Parma. [S01–S02; reused `WP04-CURED-PORK-20261010-S07`]

Use **`Prosciutto di Parma` in both display fields**. This is the registered name and the exact
product phrase on current Canadian English and French retailer pages, including a Montréal
butcher's listing. Add only the French search alias `jambon de Parme AOP`, which the Commission's
French profile uses for this protected product. Leave English aliases empty: Canadian product pages
use the Italian name, and the Consortium notes a specific Canadian naming context for “Parma Ham.”
[S02–S06; reused `WP04-CURED-PORK-20261010-S06`]

The Consortium reports 75,019 Parma hams exported to Canada in 2025 and lists importers in Laval
and Montréal. A current Montréal butcher page lists a sliced product with price and an Add to Cart
control. These support a real Canadian and Québec market boundary. The Montréal listing does not
display PDO evidence for that SKU, and the Canadian Costco page makes delivery dependent on postal
code; neither page proves stock at every Québec location. [S03–S06]

### Integrated catalog row

| Field | Value |
|---|---|
| id | `ingredient-ref-prosciutto-di-parma-pdo` |
| nameFr | `Prosciutto di Parma` |
| nameEn | `Prosciutto di Parma` |
| aliasesFr | [`jambon de Parme AOP`] |
| aliasesEn | empty |
| defaultDensity | `null` |
| unitMappings | empty |
| category | `PROTEIN` |

Do not append `AOP`, `PDO`, or `DOP` to the display names. They identify the designation's status,
while the registered product name and Canadian product titles use `Prosciutto di Parma`. The French
alias preserves the official Commission's qualified French wording and is not a claim that it is a
Québec-preferred OQLF term.

## Product and naming boundaries

- **Protected product:** The Commission describes the PDO as raw, aged Italian ham, with production
  restricted to the Province of Parma. Its 2025 specification allows whole, boneless, portioned, or
  sliced marketing formats and sets product requirements. These standards identify the product;
  they are not recipe measures or catalog forms. [S01; reused `WP04-CURED-PORK-20261010-S07`]
- **Generic prosciutto:** Keep `ingredient-ref-prosciutto` (`prosciutto / prosciutto`) as the broad
  identity. Its existing English alias `prosciutto ham` stays there. The existing WP04 review
  explicitly kept Prosciutto di Parma outside that alias set; its OQLF definition supports generic
  prosciutto as Italian raw ham salted dry, while the Commission specification identifies the
  protected regional product. Reuse those existing sources rather than duplicating their ledger
  entries. [reused `WP04-CURED-PORK-20261010-S06–S07`]
- **French wording:** The Canadian French Costco title uses `Prosciutto Di Parma DOP`; the
  Commission's French profile uses `jambon de Parme AOP` as a descriptive qualified term. Keep the
  registered Italian product name as `nameFr`, with the Commission phrase as one explicit alias.
  OQLF's generic entry is `prosciutto`; it does not make `jambon de Parme` an OQLF ruling.
  [S02, S05; reused `WP04-CURED-PORK-20261010-S06`]
- **Canadian English wording:** The current Costco Canada title is `Prosciutto Di Parma DOP 16
  Months`; the Montréal butcher's title is `Sliced Italian Prosciutto di Parma 100g Portion`.
  Keep the registered Italian name in `nameEn`. Do not add `Parma ham`: the Consortium describes a
  Canadian trademark and CETA naming context, and no checked Québec retail title needs that alias.
  [S03–S04, S06]
- **Other products:** Keep Prosciutto di San Daniele, generic ham / jambon, jamón Serrano, jamón
  Ibérico, pancetta, guanciale, bacon, and other regional hams outside this reference and its alias
  set. The Consortium's export/importer page and retailer listings are market evidence, not a
  reason to merge differently named cured products. [S03–S06]

## Live ownership and allocation audit

Read-only shared-repository snapshot checked on 2026-10-17 before authoring:

| Surface | Current count | Finding |
|---|---:|---|
| Active ingredient references | 1,747 | At the pre-R464 integration snapshot, `ingredient-ref-prosciutto` was the generic owner; `ingredient-ref-ham` was separate. No active `Prosciutto di Parma`, `jambon de Parme AOP`, or proposed-ID owner existed. The similar string `Parmesan` was not a word-phrase owner for `Parma`. |
| Ingredient forms | 141 | No Parma/prosciutto-specific form, label, match term, or proposed-ID owner. The generic prosciutto reference has no attached form. |
| Legacy import candidates | 56 | No exact Parma identity, French alias, or proposed-ID owner. |
| Research ledger | 2,106 records; 9,591 source entries; 8,138 distinct source IDs; 6,851 distinct source URLs | Pre-R464 integration snapshot. No proposed record, R466 prefix, or exact source-URL collision existed. The generic prosciutto record already used OQLF `WP04-CURED-PORK-20261010-S06` and the 2025 EU specification `WP04-CURED-PORK-20261010-S07`; both sources were reused without duplicate entries. |
| Numeric and rule data | 30 unit definitions; 8 conversions; 0 global substitutions; 0 contextual substitutions; 1 package yield | No Prosciutto di Parma density, unit mapping, conversion, yield, or substitution exists. The generic prosciutto ledger record leaves measurement and substitution research open. |
| Europe and related review archive | Current proposal and integration archive | The WP06 Europe sweep remains open. R460 integrated Krokos Kozanis saffron and R464 integrated Guérande fleur de sel. R462 is an integrated WP02 spelt-groats alias. The WP04 cured-pork proposals mention Prosciutto di Parma only as a protected name kept outside generic prosciutto; those boundary notes did not allocate this regional identity. |
| Integrated allocation | Checked after root integration | `ingredient-ref-prosciutto-di-parma-pdo` and S01–S06 are registered; their six URLs were unique in the pre-integration ledger snapshot. The OQLF and EU specification sources were reused without duplicate entries. |

The archive review included recent Europe proposals and integration records, the completed cheese,
tomato, piquillo, grissino, and turrón reviews/holds, the R460 saffron integration, R462's current
integration README, and the R464 proposal. The [R462 README](../batches/wp02-a7-spelt-groats-alias-integration-r462-20261017/README.md)
reports the same pre-R464 catalog and ledger snapshot. R464 was then a proposal-only review with no
shared allocation; its later root integration is recorded in the [R464 batch README](../batches/wp06-europe-guerande-fleur-de-sel-identity-integration-r464-20261017/README.md).
[R01]

## Phrase-first picker projection

The picker normalizes case, accents, and punctuation; returns every reference whose name, alias, or
attached form contains the complete query as a word phrase; and falls back to substring matching
only if there is no complete phrase. The static projection below applies that behavior from
[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)
to the live reference/form terms and the integrated names and French alias. It is not live UI QA.

| Query | Current result | With integrated row |
|---|---|---|
| `prosciutto` | `ingredient-ref-prosciutto` | Generic prosciutto plus `ingredient-ref-prosciutto-di-parma-pdo` |
| `Prosciutto di Parma` | No result | Parma PDO row only |
| `jambon` | `ingredient-ref-ham` | Generic ham plus Parma PDO row |
| `jambon de Parme` | No result | Parma PDO row only, through `jambon de Parme AOP` |
| `Parma` | No result | Parma PDO row only |
| `Parma ham` | No result | No result; no English alias is added |
| `prosciutto ham` | `ingredient-ref-prosciutto` | Same generic prosciutto row |
| `ham` | Generic ham plus generic prosciutto | Same two rows |

The broad `prosciutto` query intentionally changes from one result to two and retains the generic
owner. The French `jambon` query also exposes the generic and qualified choices together. The
candidate adds no form term that could make a broad form query select Parma alone. The deliberately
unassigned `Parma ham` phrase avoids applying an ambiguous Canadian market label as a PDO alias.

## Complete bundled recipe scan

All **114 manifest-listed recipe JSON files** and **1,123 structured ingredient rows** were parsed
as UTF-8. The scan covered complete decoded documents, ingredient text and names, linked reference
and form IDs, and the proposed reference ID. It checked `Prosciutto di Parma`, the PDO/AOP/DOP
spellings, `jambon de Parme`, `Parma ham`, `prosciutto`, and the proposed ID. It found **zero exact
regional-name hits, zero prosciutto ingredient rows, and zero links to the proposed ID or generic
prosciutto row**.

The raw substring `Parma` occurs within `Parmesan` in three unrelated recipe rows. Those lines are
all named Parmesan and link to `ingredient-ref-parmesan-cheese`; they do not contain the word
`Parma` as a complete term. The one bundled ham row is `1 cup diced ham` in Quiche au jambon et
champignons, linked to `ingredient-ref-ham`. Neither observation is Prosciutto di Parma demand.
Do not relink recipes. [R01]

The manifest-order corpus contains **753,988 bytes** and has fingerprint
`94505e664f049b1bdaee06ea27db86d3d9f817df11c8ac7f73a5b5dc29e5828b`. The fingerprint hashes each
manifest-relative path, a NUL byte, the lowercase SHA-256 hex digest of that recipe file, and a
newline, then hashes the concatenated bytes. [R01]

## Forms, measures, conversions, yields, and substitutions

- **Forms:** Add none. Whole, boneless, portioned, and sliced marketing formats are documented by
  the Commission and retailers, but sliced and whole are package/presentation formats also used for
  other prosciutto products. Attaching these forms only to this regional row could make broad
  prosciutto form searches point to Parma alone. The generic prosciutto row has no forms. [S01,
  S04–S06]
- **Measurements and density:** Add none. The Commission specification contains whole-ham product
  requirements; Boucherie Capitol lists a 100 g sliced portion and Costco lists a 7 kg whole SKU.
  These are product-standard or retailer-specific package facts, not reusable cooking measures or
  mass-volume evidence. Add no density or unit mapping. [S01, S04–S06]
- **Conversions and yields:** Add none. No source supplies a reusable scoop, slice-count, or
  volume-to-mass conversion, or a usable-to-purchased yield. Do not convert the 100 g listing or
  7 kg package into recipe portions. [S01, S04–S06]
- **Recipe links:** Add none; no bundled row asks for prosciutto or Prosciutto di Parma.
- **Substitutions:** Add no global or contextual rule. The existing generic prosciutto ledger
  record has not researched substitution behavior, and the sources checked here do not establish a
  ratio or interchangeability across recipes. Keep the product distinction without asserting a
  universal substitute. [reused `WP04-CURED-PORK-20261010-S06–S07`]

## Evidence limits and source access

- The Commission's current bilingual PDO profiles establish the registered name, protected status,
  Parma production boundary, French descriptive wording, and general product identity. Its profile
  is a summary; the linked legal specification remains the controlling source for formal product
  requirements. [S01–S02]
- The existing 2025 Official Journal amendment is reused from the generic prosciutto ledger record
  as `WP04-CURED-PORK-20261010-S07`; do not create a duplicate source entry. The current EUR-Lex
  page returned its anti-bot response during this review. The Commission profiles were directly
  accessible, and the earlier WP04 review documented the Official Journal specification. [reused
  `WP04-CURED-PORK-20261010-S07`]
- The Consortium is the official body responsible for the origin designation, not a producer or
  retailer. Its 2025 Canada export figure and distributor directory establish an active Canadian
  channel but do not establish local stock or certify any individual retailer SKU. It also
  describes the Canadian “Parma Ham” trademark context; the English alias remains empty. [S03]
- Boucherie Capitol's Montréal page was accessible at review time and displayed a price, an Add to
  Cart control, its Montréal address, and the title `Sliced Italian Prosciutto di Parma 100g
  Portion`. It does not display PDO evidence for that individual item. Page controls and prices can
  change. [S04]
- Costco Canada's French and English pages show the same 7 kg, online-only Gualerzi item as DOP
  certified and use `Prosciutto Di Parma` in both languages. Delivery depends on postal code; this
  page supports bilingual Canadian wording and a current listed SKU, not assured delivery to every
  Québec address. Package weight is not a recipe measure. [S05–S06]
- OQLF's existing 2014 `prosciutto` entry gives the generic French preferred term and English
  equivalents. It does not establish a Parma-specific term; it is reused from the current generic
  prosciutto ledger record as `WP04-CURED-PORK-20261010-S06`. [reused
  `WP04-CURED-PORK-20261010-S06`]

Pages were checked on 2026-10-17 unless an earlier source date is stated. The repository audit
records the pre-integration ownership snapshot; root integration added the reference and ledger
sources and updated the checklist, workflow, and batch record.

## Sources

| ID | Source | Use and limit |
|---|---|---|
| `WP06-EUROPE-PROSCIUTTO-DI-PARMA-R466-20261017-S01` | European Commission, [Prosciutto di Parma PDO](https://agriculture.ec.europa.eu/farming/geographical-indications-and-quality-schemes/geographical-indications-food-and-drink/prosciutto-di-parma-pdo_en). | Current official English profile for PDO status, registered name, Province of Parma production boundary, product identity, and marketing formats. The legal specification controls formal limits. |
| `WP06-EUROPE-PROSCIUTTO-DI-PARMA-R466-20261017-S02` | European Commission, [Prosciutto di Parma AOP](https://agriculture.ec.europa.eu/farming/geographical-indications-and-quality-schemes/geographical-indications-food-and-drink/prosciutto-di-parma-pdo_fr). | Current official French profile; uses `jambon de Parme AOP` descriptively and supports the French alias. It does not establish a Québec OQLF preference. |
| `WP06-EUROPE-PROSCIUTTO-DI-PARMA-R466-20261017-S03` | Consorzio del Prosciutto di Parma, [North America — importers and distributors](https://www.prosciuttodiparma.com/en/export-north-america/). | Official designation body's current Canada export report and importer/distributor listing, including Laval and Montréal. Its market and trademark statements are not consumer inventory or independent retailer certification. |
| `WP06-EUROPE-PROSCIUTTO-DI-PARMA-R466-20261017-S04` | Boucherie Capitol, Montréal, [Sliced Italian Prosciutto di Parma 100g Portion](https://www.boucheriecapitol.com/product-page/italian-prosciutto-18-month-100g-portion). | Current local French-Canadian market evidence for the exact Italian product phrase, a price, cart control, and Montreal address. The page does not verify PDO status for that SKU; 100 g is package/portion labeling, not a reusable recipe measure. |
| `WP06-EUROPE-PROSCIUTTO-DI-PARMA-R466-20261017-S05` | Costco Canada, [Prosciutto Di Parma DOP 16 Mois, 7 kg](https://www.costco.ca/p/-/prosciutto-di-parma-dop-16-mois-7-kg/4000361272?langId=-25). | Current French-language Canadian title and Costco's DOP claim for the Gualerzi SKU. It is online only and shipping must be checked by postal code; 7 kg is a SKU package size. |
| `WP06-EUROPE-PROSCIUTTO-DI-PARMA-R466-20261017-S06` | Costco Canada, [Prosciutto Di Parma DOP 16 Months, 7 kg](https://www.costco.ca/p/-/prosciutto-di-parma-dop-16-months-7-kg/4000361272). | Current English-language Canadian title and DOP claim for the same SKU. It is online only and shipping must be checked by postal code; 7 kg is a SKU package size. |
| Reused `WP04-CURED-PORK-20261010-S06` | OQLF, [prosciutto (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2498694/prosciutto), updated 2014. | Existing source for the generic Québec French term and English `prosciutto / prosciutto ham`; not a regional Parma term. Keep its ID and URL on the current generic prosciutto record. |
| Reused `WP04-CURED-PORK-20261010-S07` | European Commission, [approved specification amendment for Prosciutto di Parma PDO](https://eur-lex.europa.eu/eli/C/2025/4525/oj/eng/pdf), 2025. | Existing official legal source for the protected regional product and specification. Keep its ID and URL on the existing generic prosciutto record; do not duplicate it. |
| `WP06-EUROPE-PROSCIUTTO-DI-PARMA-R466-20261017-R01` | Read-only audit of the [Europe checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L9312), live references/forms/legacy/ledger/rules, picker, proposal and batch archive, manifest, and all bundled recipes. | Repository-only evidence for ownership, source-ID/URL allocation, picker projection, recipe demand, and limits on forms, measures, conversions, yields, and substitutions. Audit label only; it is not a ledger source. |

## Integration disposition

Accepted and integrated as `ingredient-ref-prosciutto-di-parma-pdo` with one French alias. The current snapshot is 1,749 references / 141 forms; 2,108 ledger records / 9,601 source entries / 8,148 distinct source IDs / 6,861 distinct source URLs; and 114 recipes / 1,123 ingredient rows. Package normalization, generated-index freshness, ledger/source ownership, picker projection, recipe corpus, encoding, and local-document checks passed. No software tests were run because this change only adds database JSON data under `AGENTS.md`.
