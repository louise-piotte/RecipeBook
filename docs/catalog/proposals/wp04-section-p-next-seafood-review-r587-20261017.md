# WP04 Section P R587 — Hilsa regional-fish identity review

- **Review and source-access date:** 2026-10-17.
- **Open work item:** The current Section P work-log item says to continue the fish-powder, fish-ball, surimi, and regional-seafood review ([plan line 14953](../../RecipeBook-global-ingredient-catalog-plan.txt#L14981)). Its still-open parents include the regional-fish list at [plan lines 6417–6418](../../RecipeBook-global-ingredient-catalog-plan.txt#L6426) and the fish-powder/fish-ball/surimi list at [plan line 7822](../../RecipeBook-global-ingredient-catalog-plan.txt#L7840).
- **Candidate:** Hilsa, *Tenualosa ilisha*, a named South Asian regional food fish.
- **Recommendation:** Add one identity-only `PROTEIN` reference, `ingredient-ref-hilsa`, displayed as **Hilsa / poisson hilsa**. Use English aliases **Hilsa fish**, **Hilsha**, and **Ilish**, plus French alias **alose hilsa**. The exact `Ilish` alias resolves to Hilsa and suppresses the current false substring hit on `kilishi`.
- **Scope:** The species name selected by the Canadian Fish List and identified by a current Montréal seller. Do not apply the row to other shad, herring, sardine, or hilsa-named taxa, or to roe, dried fish, and preserved preparations.
- **Mutation scope:** Integrated. The coordinator added the identity-only reference and accepted evidence record, updated the fish checklist and work log, roadmap, and integration README, and corrected this proposal's picker recommendation. No forms, legacy identities, recipes, measures, conversions, yields, or substitutions were added. No app tests, build, emulator, or deployment were run because this change only adds database JSON data and its tracking documentation.
- **Proposal-local source IDs:** `WP04-SECTIONP-HILSA-R587-20261017-S01` and `S02`; read-only audit label `WP04-SECTIONP-HILSA-R587-20261017-R01`. The existing CFIA Fish List overview source is reused under its current ledger owner as described below.

## Why this is a distinct open gap

The active Section P parents still include regional fish and other named seafood. This proposal selects one species-defined regional fish, rather than reopening a prepared product family or another fish-powder boundary. The recent [R523 fish-floss review](wp04-section-p-fish-floss-product-boundary-review-r523-20261017.md), [R530 kamaboko review](wp04-section-p-kamaboko-boundary-review-r530-20261017.md), [R514 canned-sardines-in-tomato-sauce review](wp04-section-p-next-seafood-review-r514-20261017.md), [R517 Dungeness-cluster review](wp04-section-p-next-seafood-review-r517-20261017.md), and [R584 Zander review](wp04-section-p-next-gap-review-r584-20261017.md) cover other products or taxa and do not allocate Hilsa.

The archive has one incidental earlier occurrence of “hilsa” in a WP06 South Asian cuisine review. That note says a source article’s kasundi/hilsa context was not promoted; it does not identify Hilsa, review its Canadian or Québec naming, or allocate a catalog row. No focused Hilsa proposal, hold, integration, active reference, form, legacy identity, or ledger record was found.

The CFIA Fish List maps TSN 551297 and *Tenualosa ilisha* to **Hilsa / Alose hilsa**. The current Montréal seller Belaamie independently lists a Hilsa product, gives the same scientific name, and supplies the local French wording **Poisson Hilsa**. Together these sources support a narrow species identity and bilingual picker wording. The listing’s package and handling details remain specific to that seller’s item. [S01, S02]

## Integrated identity-only row

```json
{
  "id": "ingredient-ref-hilsa",
  "nameEn": "Hilsa",
  "nameFr": "poisson hilsa",
  "aliasesEn": ["Hilsa fish", "Hilsha", "Ilish"],
  "aliasesFr": ["alose hilsa"],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "PROTEIN"
}
```

The row is scoped to *T. ilisha*, not a generic herring/shad group. Include `Ilish` because the Montréal product page explicitly identifies Hilsa as Ilish. Keep `shad`, `herring`, `hareng`, `sardine`, generic `alose`, generic `poisson`, and any Hilsa-roe term out of aliases. Do not add a form or attach this identity to an existing species or market-group row.

## Naming and product boundary

CFIA lists *Tenualosa ilisha* as **Hilsa / Alose hilsa** (TSN 551297). The CFIA Fish List is the Canadian source for accepted common fish names and their corresponding scientific taxa; its general overview source ID is already owned in the ledger as `WP04-FINFISH-GAPS-20261010-S11`, so reuse that ID for the list’s general purpose rather than registering the same overview URL again. The candidate-specific Hilsa query is a separate source and receives S01. [S01; reused `WP04-FINFISH-GAPS-20261010-S11`]

Belaamie’s current Montréal product page is titled **Hilsha 500g Box**. It identifies the scientific name as *Tenualosa ilisha*, gives **Hilsa (Ilish)** as the English name, and records **Poisson Hilsa** as the French name. Its page also says the fish is gutted and scaled, lists Bangladesh and Myanmar origin options, and provides instructions not to refreeze after thawing and to cook thoroughly. [S02]

No dedicated OQLF GDT entry for Hilsa, Ilish, or `alose hilsa` was located in this review. The Quebec-facing retail wording `poisson hilsa` is the proposed French display because it is explicitly printed as the product’s French name by the Montréal seller. `Alose hilsa` is retained as a narrow French search alias because CFIA assigns that accepted fish-label name to this species; it is not represented as an OQLF recommendation. Do not shorten it to `alose`, which is also part of the existing American shad display `alose savoureuse`.

The seller’s page has inconsistent product-state wording (`Hilsha Ice Block`, “Fresh Hilsa Fish,” and a do-not-refreeze-after-thaw instruction). Do not use it to assign a universal fresh, frozen, thawed, ready-to-eat, or cooked state. Likewise, its origin options do not establish a single origin for every Hilsa product. Keep those details on the specific seller listing. [S02]

## Current catalog ownership and picker projection

The read-only snapshot contains **1,808 active references**, **154 forms**, **56 legacy candidates**, and **2,178 research-ledger records**. Exact normalized checks found no owner for `Hilsa`, `Hilsha`, `Ilish`, `Hilsa fish`, `poisson hilsa`, `alose hilsa`, *Tenualosa ilisha*, or `ingredient-ref-hilsa` among active reference names and aliases, form labels and match terms, legacy candidates, or ledger record IDs. The sole exact archive occurrence is the unallocated WP06 source-context note described above.

Relevant active neighbors remain separate: `ingredient-ref-american-shad` (American shad / alose savoureuse), Atlantic herring, Pacific herring, Atlantic capelin, European pilchard, and the integrated masago product. The broad common-name resemblance does not establish culinary equivalence or a shared form. The existing Bonga dried-fish-powder identity and generic fish balls also remain untouched.

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) prefers complete normalized word phrases, then falls back to substrings. The projection below was calculated over current reference names, aliases, and form terms, with the proposed row above:

| Query | Current result | With proposal | Effect |
|---|---|---|---|
| `hilsa`, `Hilsha`, `Hilsa fish`, `poisson hilsa`, `alose hilsa` | No result | Hilsa | Qualified product-name paths resolve to the new row. |
| `alose` | American shad | American shad; Hilsa | Remains a multi-result French query. |
| `fish` | 13 references | 14 references | Remains a broad multi-result query. |
| `poisson` | 12 references | 13 references | Remains a broad multi-result query. |
| `shad` | American shad | American shad | No shad alias is added to Hilsa. |
| `herring`, `hareng` | Five herring identities/products | Unchanged | Hilsa is not indexed as herring. |
| `ilish` | `ingredient-ref-kilishi` via substring fallback | Hilsa | The exact `Ilish` phrase match suppresses the `kilishi` substring fallback, correcting the false positive. |

The unqualified `fish` and `poisson` searches gain one result but remain broad. The species-specific English and French paths stay qualified. Adding the source-attested `Ilish` phrase fixes the existing `kilishi` substring false positive because complete phrase matches are returned before fallback substring results.

## Bundled recipe demand

Every manifest-listed bundled recipe JSON file and every structured ingredient row was scanned, including the full decoded file text. The search covered `Hilsa`, `Hilsha`, `Ilish`, `Hilsa fish`, `poisson hilsa`, `alose hilsa`, *Tenualosa ilisha*, `rohu`, and relevant exact species-name variants.

- **114 manifest-listed recipe files** and **1,123 ingredient rows** scanned.
- **753,988 exact recipe-file bytes** scanned.
- **Zero matching recipe files, ingredient rows, or linked rows.**
- Corpus fingerprint: **`847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`**, SHA-256 over each manifest-relative recipe path encoded as UTF-8, a NUL byte, exact recipe-file bytes, and a NUL byte, in manifest order.

The empty scan records no current bundled recipe demand. There is no recipe role, method, amount, cut, or state to support a recipe link, form, measurement, or replacement rule.

## Forms, measurements, and substitutions

The Montréal seller’s **500 g** net amount is package mass for that item; the page also offers a 300 g size. Neither is a household measure, individual-fish count, general serving, density, or transferable package conversion. The seller’s “gutted and scaled” statement and conflicting fresh/thaw wording do not support a reusable cut or storage form. Add no form, density, unit mapping, measure, package yield, edible yield, conversion, or cooking-loss observation. [S02]

No reviewed source or bundled recipe tests a replacement between Hilsa and American shad, herring, sardine, capelin, salmon, or another fish. Taxonomic proximity, region, or similar fish-paste use would not establish an equivalent recipe outcome. Add no global form conversion, contextual substitution, warning, or recipe-line substitution.

## Source ownership and audit

The proposal-local prefix `WP04-SECTIONP-HILSA-R587-20261017-` and proposed reference ID `ingredient-ref-hilsa` were absent from the live ledger and proposal/batch archive at review time. Neither exact source URL below was previously registered. Reuse the already-owned Fish List overview ID `WP04-FINFISH-GAPS-20261010-S11` only for the general Canadian name-list scope; it belongs to the same Fish List overview URL and does not replace the new species-specific result source S01.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-HILSA-R587-20261017-S01** | Canadian Food Inspection Agency, [CFIA Fish List results for Hilsa](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Hilsa), accessed 2026-10-17. | Lists TSN 551297, *Tenualosa ilisha*, and the names **Hilsa / Alose hilsa**. This is Canadian fish-label naming and taxon evidence, not a Québec retail-availability or recipe-equivalence source. The general Fish List overview is reused under `WP04-FINFISH-GAPS-20261010-S11`. |
| **WP04-SECTIONP-HILSA-R587-20261017-S02** | Belaamie, [Hilsha Ice Block / Hilsha 500g Box](https://belaamie.com/product/hilsha/), accessed 2026-10-17; product details, origin and handling sections. | Montréal seller listing with local pickup, the scientific name *Tenualosa ilisha*, English **Hilsa (Ilish)**, French **Poisson Hilsa**, and a 500 g net quantity. Product-state wording is inconsistent, the origin field offers Bangladesh and Myanmar, and the package amount is SKU-specific; do not generalize those claims. |

**R01 read-only audit:** Re-read `AGENTS.md`, the active roadmap, the open plan parents, the live references/forms/legacy identities/research ledger, the five recent proposals listed above, the proposal archive for exact Hilsa ownership, `IngredientSearch.kt`, the bundled manifest, and every manifest-listed recipe file. No shared catalog or planning files were edited.

## Integrated disposition

Integrated identity-only **Hilsa / poisson hilsa** as `ingredient-ref-hilsa`, scoped to *Tenualosa ilisha*, with aliases **Hilsa fish**, **Hilsha**, **Ilish**, and **alose hilsa**. The exact `Ilish` alias corrects the existing `kilishi` substring false positive. Forms, measures, recipes, conversions, yields, and substitutions remain empty. This advances one species-qualified regional-fish gap while leaving the broader Section P parents open.
