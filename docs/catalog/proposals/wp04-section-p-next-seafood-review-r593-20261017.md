# WP04 Section P R593 — Tambaqui regional-fish identity review

- **Review and source-access date:** 2026-10-17.
- **Open work item:** The regional-fish parent remains unchecked at [plan lines 6417–6418](../../RecipeBook-global-ingredient-catalog-plan.txt#L6426), and the broader Section P seafood work log remains open at [plan line 14953](../../RecipeBook-global-ingredient-catalog-plan.txt#L14981).
- **Recent integration state:** The roadmap records R587 Hilsa at [line 1370](../../../roadmap.md#L1370) and R590 Arapaima at [line 1373](../../../roadmap.md#L1373); the plan records the R590 integration at [lines 20551–20553](../../RecipeBook-global-ingredient-catalog-plan.txt#L20579). Both are distinct species and the regional-fish parent remains open.
- **Candidate:** Tambaqui, *Colossoma macropomum*, a named Amazonian freshwater food fish.
- **Recommendation:** Add one identity-only `PROTEIN` reference, `ingredient-ref-tambaqui`, with English and French display **tambaqui / tambaqui** and no aliases. Keep the identity scoped to *C. macropomum*.
- **Boundary:** Do not add `pacu`, `blackfin pacu`, or `cachama` as aliases. TERMIUM records `blackfin pacu` and `cachama` for this taxon, but the former would make the broader `pacu` query return Tambaqui as a singleton; those names are not needed for the species-qualified row. Do not add a generic product form, fishery status, or sourcing claim.
- **Mutation status:** Integrated as an identity-only active reference and verified ledger record; see the [integration README](../batches/wp04-section-p-arapaima-identity-integration-r593-20261017/README.md).
- **Proposal-local source IDs:** `WP04-SECTIONP-TAMBAQUI-R593-20261017-S01` through `S04`; read-only audit label `WP04-SECTIONP-TAMBAQUI-R593-20261017-R01`.

## Why this is a distinct open gap

R587 added Hilsa, *Tenualosa ilisha*, and R590 added Arapaima, *Arapaima gigas*. Tambaqui is a different species, with its own bilingual terminology entry and a current regional food recipe. It was not named or allocated in those reviews. A targeted case-insensitive search of the plan, current proposals and batches, active references and forms, legacy identities, research ledger, and bundled recipes found no earlier focused Tambaqui review, hold, or allocation.

The [WP06 South American cuisine sweep](wp06-south-american-cuisine-gap-sweep-20261009.md) does not mention Tambaqui. Its Paiche follow-up, now resolved by R590, concerns *Arapaima gigas* and does not cover this species. R593 advances one separate regional fish while leaving both integrated identities and the wider Section P checklist open.

## Species and bilingual name evidence

TERMIUM Plus maps English **tambaqui** and French **tambaqui** to *Colossoma macropomum*. It marks French `tambaqui` as a correct masculine noun. The same record lists English `blackfin pacu` and `cachama`; those are not proposed as aliases because the simple picker would then make `pacu` return this one species even though that word is used more broadly. No dedicated OQLF GDT entry was found in this review, so the French display relies on the federal terminology record and is not represented as an OQLF-preferred term. [S01]

The Amapá State Institute for Scientific and Technological Research’s 2025 fish guide independently labels Tambaqui as *C. macropomum* and presents it in a regional food recipe, `Tambaqui Assado na Brasa (ou no Forno)`. The recipe uses one whole, cleaned fish of approximately 2 kg and gives grill/oven instructions. This is direct evidence of regional culinary use and species identity, not evidence of Canadian food retail or a reusable catalog portion. [S02]

The Brazilian Ministry of Environment and Climate Change’s 2026-08-19 notice identifies Tambaqui as *C. macropomum* and clarifies the Vulnerable listing for wild populations. Retain it as historical listing clarification. A newer Ministry of Fisheries and Aquaculture release, published 2026-10-15, states that federal fishing remains permitted under current management rules, including the October–February defeso; it says there are no restrictions on tambaqui produced in aquaculture licensed by the competent environmental authority, and that the national recovery plan is still being developed. Use this newer release for current Brazilian fishery-status wording as of this review date. Neither notice establishes compliance for a particular catch or product, or Canadian sourcing status. [S03] [S04]

The proposed identity is:

```json
{
  "id": "ingredient-ref-tambaqui",
  "nameEn": "tambaqui",
  "nameFr": "tambaqui",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "PROTEIN"
}
```

No CFIA fish-label approval is claimed. A targeted Canadian search returned an aquarium retailer listing `Black Pacu` as a live-aquarium animal; that is not human-food market evidence and does not support adding `black pacu` or other pet-market labels to this row. The proposal makes no claim of routine Canadian or Québec availability.

## Current ownership and picker projection

The current read-only snapshot contains **1,811 active references**, **154 forms**, **56 legacy import identities**, and **2,181 research-ledger records**. Exact case-insensitive checks found no owner for `ingredient-ref-tambaqui`, `candidate-tambaqui`, *Colossoma macropomum*, `tambaqui`, `pacu`, `blackfin pacu`, or `cachama` among active reference names/aliases, form labels/match terms, legacy identities, or ledger record IDs and terms. No source ID with the prefix `WP04-SECTIONP-TAMBAQUI-R593-20261017-` exists in the ledger. R593 itself was not previously allocated.

The exact S01–S04 URLs below have no current ledger owner. All four source IDs are new proposal-local identifiers; no existing source ID is reused.

The picker projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it searches normalized English/French names, aliases, and attached form terms, preferring whole-word phrase matches before substring fallback. No forms or aliases are proposed.

| Query | Current result | With proposal | Effect |
|---|---|---|---|
| `tambaqui` | No result | Tambaqui | Adds the exact English and French species name. |
| *Colossoma macropomum* | No result | No result | Latin binomial is not stored as a user-facing alias. |
| `pacu`, `blackfin pacu`, `cachama` | No result | No result | Avoids widening the species row to terms that can imply broader market groups. |
| `fish`, `poisson` | 14 and 13 references | Unchanged | The row does not add generic fish-language terms. |
| `fish powder`, `fish balls` | Bonga dried fish powder; generic fish balls | Unchanged | The source fish remains separate from prepared fish products. |
| `surimi` | No result | No result | The distinct surimi gap remains open. |

Although TERMIUM lists `blackfin pacu` and `cachama` under this species, the proposed displays keep the picker at the narrower term `tambaqui`. In particular, adding `blackfin pacu` would also match a bare `pacu` query in the current phrase-first picker. Neither broad alias is needed to resolve the verified species name.

## Bundled recipe demand

All **114 manifest-listed bundled recipes**, their **1,123 structured ingredient rows**, and **753,988 exact recipe-file bytes** were scanned. The scan covered `tambaqui`, *Colossoma macropomum*, `pacu`, `blackfin pacu`, `cachama`, and spacing/case variants. It found **zero matching recipe files and zero matching ingredient rows**. Corpus fingerprint: **`847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`**, SHA-256 over each manifest-relative recipe path, NUL separator, exact recipe bytes, and NUL separator in manifest order.

The regional guide supplies food-use context outside this bundle. The empty bundle scan supplies no in-app recipe amount, role, or method for linking Tambaqui.

## Forms, measurements, and substitutions

The Amapá guide’s single recipe specifies one whole, cleaned Tambaqui at approximately **2 kg**, with grilling for **40–50 minutes** or oven cooking at **200 °C for 40 minutes**. These are recipe-specific instructions for that source, not a standard serving, whole-fish purchase size, cleaned yield, or conversion rule. Add no form, density, unit mapping, household measure, package yield, or edible-yield observation. [S02]

No reviewed source or bundled recipe establishes a substitution between Tambaqui and Arapaima, pacu species, catfish, generic white fish, or another regional fish. The Amapá recipe does not propose alternatives. Add no conversion, contextual substitution, warning rule, or recipe-line link.

As of 2026-10-17, the MPA’s 2026-10-15 release is the current reviewed source for Brazilian fishing rules and licensed-aquaculture status: fishing remains permitted under current management rules, including October–February defeso, and the national recovery plan remains in development. The MMA’s 2026-08-19 release is retained as historical clarification of the Vulnerable listing for wild populations, not as the current operational-status statement. These sources apply to Brazil and do not establish any particular product’s compliance. The catalog reference is only an identity label; it does not encode an origin, harvest method, source, or compliance status. [S03] [S04]

## Source register and ownership

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-TAMBAQUI-R593-20261017-S01** | Translation Bureau, [TERMIUM Plus: TAMBAQUI](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=enr&lang=eng&srchtxt=TAMBAQUI), record dated 2016-03-09; database page modified 2026-09-02. | Maps English `tambaqui` and French `tambaqui` to *Colossoma macropomum* and marks French as a correct masculine noun. The English record also lists `blackfin pacu` and `cachama`; those aliases are not used. Terminology evidence, not proof of Canadian food sales. |
| **WP04-SECTIONP-TAMBAQUI-R593-20261017-S02** | Amapá State Institute for Scientific and Technological Research (IEPA), [Guia do pescado do Amapá — feiras de Macapá](https://www.iepa.ap.gov.br/noticias/2025/pescado/guia-do-pescado-do-amapa-feiras-de-macapa-iepa_web.pdf), Tambaqui entry and recipe, p. 45; 2025 guide. | Identifies Tambaqui as *C. macropomum* and documents a regional grilled/oven food recipe. The one-fish approximate weight and cooking instructions belong to that recipe and do not define generic forms, yields, or measures. |
| **WP04-SECTIONP-TAMBAQUI-R593-20261017-S03** | Brazil Ministry of Environment and Climate Change, [MMA clarification on Tambaqui’s Vulnerable classification](https://www.gov.br/mma/pt-br/noticias-defeso-eleitoral/mma-esclarece-classificacao-do-tambaqui-como-especie-vulneravel-a-extincao), published 2026-08-19. **Historical listing clarification.** | Identifies the species and reports Brazil’s Vulnerable listing for wild populations. Retained as historical context for the listing; use newer S04 for current operational fishery-status wording. This is not Canadian food-label guidance or a source-specific product certificate. |
| **WP04-SECTIONP-TAMBAQUI-R593-20261017-S04** | Brazil Ministry of Fisheries and Aquaculture, [Pesca do tambaqui segue permitida pelo Governo Federal](https://www.gov.br/mpa/pt-br/assuntos/noticias/pesca-do-tambaqui-segue-permitida-pelo-governo-federal), published 2026-10-15. | States that federal fishing remains permitted under current management rules, including October–February defeso; no restrictions apply to tambaqui produced in aquaculture licensed by the competent environmental authority; and the national recovery plan remains in development. Current Brazilian status context as of this review, not Canadian sourcing guidance or a product-specific compliance certificate. |

**R01 read-only audit:** Re-read `AGENTS.md`, the open regional-fish and broader Section P work-log anchors, roadmap entries and integrations for R587/R590, current catalog proposals/batches, active references/forms/legacy identities/research ledger, `IngredientSearch.kt`, the bundled manifest, and all manifest-listed recipe files. Exact reference, form, legacy, ledger-name/ID, proposal-local source-ID/URL (including the S04 MPA release), proposal-archive, picker, and recipe-corpus checks were performed. S01–S04 and their exact URLs have no current ledger owner, and the R593 source-ID prefix had no prior allocation. No shared data or planning files were edited. No tests, build, emulator run, or deployment were performed for this proposal-only review.

## Proposed disposition

Recommend identity-only **tambaqui / tambaqui** as `ingredient-ref-tambaqui`, scoped to *Colossoma macropomum*, with no aliases, forms, measures, densities, unit mappings, recipe links, conversions, yields, or substitutions. Keep the Vulnerable listing as historical context from S03; for current Brazilian fishery status as of 2026-10-17, use MPA source S04: fishing remains permitted under current management rules, including October–February defeso, licensed aquaculture has no restrictions under the cited guidance, and the national recovery plan remains in development. The row does not represent a Canadian food product or sourcing approval. This advances one distinct regional-fish name while leaving R587, R590, and the broader Section P seafood work unchanged.
