# WP02 B2 round sixty-four — carob pod powder and flour-name boundary

- **Reviewed:** 2026-10-13.
- **Status:** Integrated as an identity-only reference. The shared English phrase `carob flour` remains unallocated because the current bundled-reference validator rejects duplicate alias ownership. The distinct French alias `farine de caroube` is assigned to locust bean gum. See [`wp02-b2-carob-pod-powder-identity-integration-20261013`](../batches/wp02-b2-carob-pod-powder-identity-integration-20261013/README.md).
- **Scope:** One distinct B2 alternative-flour candidate: food-grade carob pod powder, sometimes sold as carob flour. This does not reopen the existing locust-bean-gum identity or the separate gum, syrup, and whole-fruit products.
- **Archive check:** Earlier WP02 material mentions carob powder/flour only to distinguish those products from locust bean gum. No prior focused WP02 flour/starch proposal allocates a carob-powder identity. The separate pecan, Brazil-nut, and other flour reviews do not cover carob.
- **Proposed source-ID prefix:** `WP02-B2-CAROB-POD-POWDER-20261013-R64`; absent from the current ledger and proposal archive at review time.

## Recommendation

**Add an identity-only carob powder / `poudre de caroube` reference for the dry human-food product made from carob pods. Preserve the overlapping English phrase `carob flour` on both the powder and the existing locust-bean-gum identity so that the current picker shows both source-supported meanings. Add French `farine de caroube` only to the gum identity, where TERMIUM assigns it.**

TERMIUM pairs English `carob powder` with French `poudre de caroube` in its chocolate/confectionery and baking domains. A Canadian French-language retail page lists `poudre de caroube rôtie biologique` and describes it as dried, roasted carob pods. A Canadian storefront also lists human-food `carob flour` products made from carob pods. These sources establish a distinct pod-derived culinary powder; they do not establish one roasting level or a reusable kitchen conversion. [S01–S04]

The English and French phrase `carob flour` is polysemous in the reviewed sources. The Canadian storefront uses English `carob flour` for pod products, while TERMIUM lists `carob flour` and `farine de caroube` as synonyms of locust bean gum. TERMIUM identifies that white, odorless thickening flour by its seed-gum polysaccharides. Keep the pod powder distinct from the existing `locust bean gum / gomme de caroube` reference, and let the ambiguous English query return both identities. Do not put `farine de caroube` on the pod-powder row. [S01, S03–S05]

| Candidate field or phrase | Recommendation | Boundary |
|---|---|---|
| New identity | Add `ingredient-ref-carob-powder`, English display `carob powder`, French display `poudre de caroube`. | Scope it to the dry human-food powder made from carob pods. This English/French pair is directly paired by TERMIUM, and the French product wording also appears on a Canadian retailer page. [S01, S02] |
| Category | `CHOCOLATE_AND_CANDY`. | TERMIUM places the powder in chocolate/confectionery and baking; its use as a cocoa alternative aligns with the existing cocoa-powder category. The B2 review concerns the adjacent flour wording and identity boundary. [S01, current catalog] |
| English `carob flour` | Add as an English alias to the new pod-powder row **and** to the existing `ingredient-ref-locust-bean-gum`. | Canadian retail use supports the pod-powder result; TERMIUM supports the gum result. The shared alias makes the ambiguity visible as two picker choices instead of silently choosing one. [S01, S03] |
| French `farine de caroube` | Add only as an alias to `ingredient-ref-locust-bean-gum`. | TERMIUM lists it as a synonym of the gum. Keep the pod-powder row on the paired French display `poudre de caroube`. [S01] |
| Aliases for the new powder | `aliasesEn: ["carob flour"]`; `aliasesFr: []`. | Do not add generic `carob`, seed/gum wording, `carob bean gum`, `farine de caroube`, or unsupported translated variants. `carob powder` and `poudre de caroube` are canonical displays. |
| Active numeric fields | `defaultDensity: null`; `unitMappings: []`. | Retail package sizes and serving-panel amounts are product-specific. No reusable powder measure or density is proposed. |
| Forms, conversions, package yields, recipe links, substitutions | None. | Roasted and unroasted products exist, but the recipe bundle does not request a roast-specific row or conversion. Cocoa-like use alone is not a substitution ratio. |

## Product boundary and naming

OQLF defines `caroube` as the fruit of *Ceratonia siliqua* and describes pods containing sweet pulp and seeds. TERMIUM separately pairs `carob powder / poudre de caroube` as a baking and confectionery ingredient. Its separate locust-gum record identifies `carob flour` and `farine de caroube` as gum synonyms. This supports preserving the two distinct ingredient identities. Although the initial recommendation was to route the shared English wording to both, integration found that the catalog validator requires globally unique aliases, so the phrase remains unallocated. [S01, S02, S05]

The primary processing study purchased whole carob pods, removed the seeds from the kibbled pulp, and ground the pulp into powder; it also compared unroasted and roasted powder. That study supports the pod/pulp versus seed-gum boundary and confirms roast-dependent sensory differences. Its specific milling and roasting protocols are not a universal package specification. Do not infer that every Canadian package has the same seed-separation or roasting process. [S05]

The proposed French display is the exact TERMIUM pairing `poudre de caroube`, corroborated by a Canadian French retail product listing. Do not call it an OQLF product term: OQLF supports the base word `caroube`, while TERMIUM supplies the powder pair. `Poudre de caroube rôtie biologique` is an exact product listing for one roasted SKU, not a reason to make the generic display roast-qualified. [S01, S02, S04]

## Search ownership and projection

The pre-integration exact-key scan across active reference displays and aliases, form labels and match terms, and legacy import identities found no exact owner for `carob powder`, `poudre de caroube`, `carob flour`, or `farine de caroube`. The related terms `carob bean gum`, `carob gum`, and `gomme de caroube` are owned by `ingredient-ref-locust-bean-gum`. There is no carob-powder candidate record in the research ledger. At review time, the existing locust-gum ledger record and its source evidence were separate from this powder candidate. [current references, forms, legacy identities, and ledger]

Current picker matching prefers complete normalized word phrases and falls back to substring matching. With the proposed powder display and aliases, the projection is:

| Query | Projected result |
|---|---|
| `carob powder`; `poudre de caroube` | New carob-powder row only. |
| `carob flour` | New carob-powder row and existing locust-bean-gum row. |
| `farine de caroube` | Existing locust-bean-gum row only. |
| `carob bean gum`; `carob gum`; `gomme de caroube` | Existing locust-bean-gum row only. |
| Broad `carob`; `caroube` | Carob powder and locust bean gum. |

The sources show intentional polysemy. The proposal recommended a shared English alias to expose both results, but the current catalog validator rejects duplicate ownership. Integration leaves `carob flour` unallocated rather than mapping its two documented meanings to only one row.

## Recipe demand and supported behavior

All **114 manifest-listed recipe files and 1,123 ingredient rows** were scanned for `carob`, `caroube`, `carob flour`, `carob powder`, `poudre de caroube`, and `farine de caroube`. The scan found **zero full-recipe hits and zero ingredient-row hits**. No bundled recipe requests carob powder or carob flour, and no recipe line should be linked or changed for this identity review. [current recipe manifest and corpus]

No reusable household measure, density, unit mapping, or package yield is supported. A product's serving panel or net package quantity must remain specific to that SKU. The primary study's roasting results do not support a recipe conversion. Although TERMIUM describes the powder as a natural cocoa alternative, the source gives no transferable quantity or recipe-level replacement rule; add no global or contextual substitution. [S01, S04, S05]

## Current-state snapshot

Pre-integration read-only snapshot from the shared worktree on 2026-10-13:

| Surface | Count |
|---|---:|
| Active ingredient references | 1,388 |
| Ingredient forms | 100 |
| Legacy import identities | 63 |
| Research-ledger records | 1,721 |
| Research-ledger source entries | 6,767 |
| Manifest-listed recipes / ingredient rows | 114 / 1,123 |

The archive search found the 2026-10-09 WP02 hydrocolloid coordinator note distinguishing carob gum from carob powder/flour, but no focused carob-powder identity decision. That contextual mention does not allocate the powder row or resolve the shared `carob flour` search key. [proposal archive]

## Integration data and verification

The identity-only powder row uses `carob powder / poudre de caroube`, category `CHOCOLATE_AND_CANDY`, no aliases, null active density, and empty unit mappings. The existing locust-bean-gum row adds French `farine de caroube`. The English `carob flour` term stays unallocated because the validator requires unique ownership and sources document both pod-powder and gum meanings. Keep all numeric, form, recipe-link, yield, conversion, and substitution behavior inactive.

This file was saved as UTF-8 without a BOM, with a final newline and no trailing whitespace. No tests or emulator checks were run. The current AGENTS.md rule exempts changes limited to new database JSON data from testing.

## Root integration outcome

Added identity-only `ingredient-ref-carob-powder` as `carob powder / poudre de caroube` in `CHOCOLATE_AND_CANDY`, with no aliases, density, unit mappings, forms, measures, recipe links, conversions, yields, or substitutions. Added French `farine de caroube` to the existing `locust bean gum / gomme de caroube` aliases. Left English `carob flour` unallocated: sources use it for both products, and the current validator rejects duplicate alias ownership. No recipe demand was found.

## Sources

Sources checked on 2026-10-13. The source IDs below were added to the shared research ledger during integration.

| ID | Source | Supports | Limits |
|---|---|---|---|
| **WP02-B2-CAROB-POD-POWDER-20261013-R64-S01** | Translation Bureau, TERMIUM Plus, [CAROUBE results](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=1&index=frb&lang=eng&srchtxt=CAROUBE), records 1 and 4. | Record 1 pairs `carob powder / poudre de caroube` in chocolate/confectionery and baking. Record 4 lists `carob flour / farine de caroube` as synonyms of `carob bean gum / gomme de caroube` and defines its gum-like polysaccharide product. | Terminology records establish the paired terms and gum boundary, not a Canadian retail package, roast level, household measure, or density. |
| **WP02-B2-CAROB-POD-POWDER-20261013-R64-S02** | Office québécois de la langue française, [caroube (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083907/caroube), updated 1990. | Preferred French base term `caroube`, English `carob`, fruit of *Ceratonia siliqua*, and description of pods containing sweet pulp and seeds. | Base fruit terminology; not a flour/powder product label or processing specification. |
| **WP02-B2-CAROB-POD-POWDER-20261013-R64-S03** | Naturitas Canada, [Carob flour collection](https://www.naturitas.ca/c/food/cereals-legumes-and-pasta/flours/carob-flour), Canadian storefront. | Lists multiple food products under `Carob flour`; its page description says the flour is made from carob pods. Supports a human-food product class and Canadian retail use of the English phrase. | Retail collection, not a manufacturer specification or Québec French label; individual product processing varies or is unspecified. It does not resolve TERMIUM's separate seed-gum use of `carob flour`. |
| **WP02-B2-CAROB-POD-POWDER-20261013-R64-S04** | OnlineOrganics Canada, [Poudre de caroube rôtie biologique](https://onlineorganics.ca/fr/products/poudre-de-caroube-rotie-biologique), French-language Canadian product listing. | Exact Canadian French product wording; describes the product as dried and roasted carob pods and identifies roasted powder as the common form. | One roasted product listing, not an OQLF term, full process specification, general roast convention, density, or reusable measure. |
| **WP02-B2-CAROB-POD-POWDER-20261013-R64-S05** | Eldeeb & Mosilhey, [“Roasting temperature impact on bioactive compounds and PAHs in Carob powder”](https://pmc.ncbi.nlm.nih.gov/articles/PMC8758873/), *Journal of Food Science and Technology* 59 (2022), “Materials and methods” and results. | Primary study separates seeds from pod pulp before grinding; compares unroasted and roasted powder and documents roast-related sensory/composition changes. Supports the pod-powder versus seed-gum material boundary. | One cultivar/lot and laboratory process; not a Canadian product specification, general roasting standard, household measure, density, or substitution ratio. |
