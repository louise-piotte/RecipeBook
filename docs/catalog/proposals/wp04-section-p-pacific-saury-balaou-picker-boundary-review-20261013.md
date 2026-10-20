# WP04 Section P Pacific saury / `balaou du Pacifique` boundary review — 2026-10-13

- **Review and source-access date:** 2026-10-13.
- **Packet type:** finfish identity, Canadian and Québec naming, product use, ownership, picker, recipe-demand, measurement, and substitution review.
- **Recommendation:** **Ledger-only candidate; keep the identity out of active ingredient references for now.** The species and Canadian human-food use are well supported, but the current picker would make bare `saury` and `balaou` queries appear to select Pacific saury alone.
- **Candidate ledger ID:** `candidate-pacific-saury`.
- **Status:** Root-reviewed and integrated as a verified ledger-only candidate; no active reference was added.

## Candidate identity and language boundary

The candidate is Pacific saury, *Cololabis saira* (CFIA taxonomic serial number 165609). CFIA lists this species as `Pacific Saury / Balaou`, and also gives the qualified French names `Balaou du Pacifique` and `Balaou du Japon`. The same Fish List assigns `Saury / Balaou` and `Atlantic Saury / Balaou` to *Scomberesox saurus* (TSN 165612). The species boundary is therefore clear, but the short common names are shared.

For Québec French, the OQLF GDT entry prefers unqualified `balaou` and pairs it with English `Atlantic saury` and a *Scomberesox* taxon. The entry is dated 1983 and displays the genus as `Scombereson`; CFIA’s current fish-name table separately identifies *Scomberesox saurus* and its accepted labels. A current DFO French page uses the qualified pair `balaou du Pacifique (Cololabis saira)`. The safest conditional display is therefore **Pacific saury / balaou du Pacifique**, with no aliases. A qualified display does not prevent the current picker from matching the shorter word contained in it.

If a future catalog review can preserve broad-name choices, the conditional active row would be:

| Field | Conditional value |
|---|---|
| ID | `ingredient-ref-pacific-saury` |
| Category | `PROTEIN` |
| English display | `Pacific saury` |
| Québec French display | `balaou du Pacifique` |
| English and French aliases | None proposed |
| Taxon | *Cololabis saira* |
| Density and unit mappings | None |
| Forms, recipe links, conversions, yields, substitutions | None |

Do not use bare `saury` or `balaou` as aliases. Do not add `sanma`, `balaou du Japon`, `mackerel pike`, `saira`, or the scientific name as a search alias in this review. CFIA recognizes some of those as alternate names, and one Canadian retailer titles a product `Pacific Saury (Sanma)`, but the qualified Canadian and Québec names are sufficient for this candidate. The shorter terms either overlap the Atlantic species, are not Québec recipe terms established here, or are unnecessary without recipe demand.

## Current ownership and prior-review audit

The current seed snapshot contains 1,384 ingredient references and 100 ingredient forms; the legacy file contains 63 candidates and the research ledger has 1,716 records. Exact candidate-key checks used the app’s `normalizeIngredientSearchKey` behavior (lowercase, Unicode decomposition and accent folding, punctuation-to-space, and collapsed whitespace) across reference IDs/names/aliases, form IDs/labels/match terms, legacy candidate IDs/names/aliases, and ledger record IDs.

No exact owner was found for `Pacific saury`, `saury`, `sanma`, `balaou`, `balaou du Pacifique`, `balaou du Japon`, *Cololabis saira*, `ingredient-ref-pacific-saury`, or `candidate-pacific-saury`. No existing form, recipe reference, ledger record, or legacy candidate needs relinking. Searches of the open Section P checklist, prior Section P proposals, batches, current ledger, and legacy identities found no focused Pacific-saury integration or hold. The broader Section P fish, species, and regional-terminology work remains open in the [catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt) and [roadmap](../../../roadmap.md).

The proposal-local source-ID prefix `WP04-P-PACIFIC-SAURY-20261013` was also checked against the existing research ledger and catalog proposals/batches before drafting; it was unused.

## Picker projection

[`IngredientReferenceSearchIndex`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) indexes each reference’s bilingual displays and aliases. It matches complete normalized word phrases before substring fallback, so adding the qualified display would also make its component terms searchable even with empty alias arrays. The following projection assumes the one conditional reference above:

| Query | Current picker | With conditional row | Boundary |
|---|---|---|---|
| `Pacific saury` | No result | Pacific saury / balaou du Pacifique | Qualified English name selects the candidate. |
| `balaou du Pacifique` | No result | Pacific saury / balaou du Pacifique | Qualified French name selects the candidate. |
| `saury` | No result | Pacific saury / balaou du Pacifique only | CFIA assigns `Saury` to both *C. saira* and *S. saurus*; this would falsely narrow the broader English query. |
| `balaou` | No result | Pacific saury / balaou du Pacifique only | OQLF assigns bare Québec `balaou` to Atlantic saury; CFIA also lists `Balaou` for both species. |
| `sanma` or `balaou du Japon` | No result | No result | Not proposed as aliases. |
| `Cololabis saira` | No result | No result | Keep the binomial in evidence, not as a recipe-search alias. |

The specific Pacific phrases are valid identity queries, but the shared search implementation cannot suppress the short components embedded in the displays. An active row would therefore make generic English and Québec French requests look species-resolved. Keep the evidence ledger-only until both saury scopes can be represented in the picker or its search behavior preserves the broader choice.

## Québec and Canadian food-product evidence

A current Montréal Korean-grocery listing is titled `DONGWON Canned Pacific Saury ... 400G`; the page gives Montréal store addresses and an online price. This is direct Québec human-food product evidence for the species-level trade name, though its listing does not supply a scientific name or a reusable serving basis. Save-On-Foods lists a Canadian `3 Fish - Frozen Pacific Saury, 454 Gram` product and describes it as wild-caught, whole-round, and kept frozen. These sources support canned and frozen whole-round product availability; they do not establish a universal recipe form, package yield, or count-to-mass conversion.

The manifest-listed package contains **114 recipe files and 1,123 ingredient rows**. I scanned the complete recipe JSON and ingredient rows for `Pacific saury`, `saury`, `sanma`, `balaou`, `Cololabis saira`, and qualified French/name variants. There were **zero candidate-term hits**. No recipe line, reference link, recipe amount, or recipe-specific substitution is supported.

## Forms, numeric behavior, and substitutions

- The reviewed product pages show canned fish and frozen whole-round fish. Keep those source-specific product states out of active forms because the bundled recipes do not select either presentation. Do not collapse canned Pacific saury with frozen whole fish or with Atlantic saury.
- The Montréal product title’s `400G` and Save-On’s SKU-specific `3 Fish / 454 Gram` listing are package descriptions, not recipe portions. Do not derive a per-fish weight from the package count. No supported density, cup mapping, serving size, count-weight observation, edible yield, cooking yield, or reusable package relationship was found.
- No reviewed recipe or source establishes Pacific saury as a safe substitute for Atlantic saury, sardine, mackerel, herring, or another fish. Add no global or contextual substitution and no recipe-line substitution link.
- If represented as a candidate ledger record, use `recordType: candidate`, `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Keep measurement observations and substitution findings empty.

## Sources

Sources were accessed or rechecked on 2026-10-13. Their limits are stated with each finding; none supplies transferable culinary measures or substitution behavior.

| Source ID | Source | Finding and limit |
|---|---|---|
| **WP04-P-PACIFIC-SAURY-20261013-S01** | CFIA, [Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) | Lists *Cololabis saira* (TSN 165609) as `Pacific Saury / Balaou`, with `Balaou du Pacifique` and `Saury / Balaou du Japon`; it lists *Scomberesox saurus* (TSN 165612) as `Atlantic Saury / Balaou` and `Saury / Balaou de l’Atlantique`. This is Canadian fish-label name and species evidence, not recipe-use or substitution evidence. |
| **WP04-P-PACIFIC-SAURY-20261013-S02** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Explains that the Fish List provides English/French common names acceptable for Canadian fish labelling and pairs them with scientific names and TSNs. It does not establish retail inventory or culinary quantities. |
| **WP04-P-PACIFIC-SAURY-20261013-S03** | OQLF GDT, [balaou](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10435862/balaou) | In the edible-fish and ichthyology domains, the preferred headword is `balaou`; English is `Atlantic saury`, and the page gives a *Scomberesox* taxon. The entry was last updated in 1983 and shows the Latin spelling `Scombereson saurus`; it does not describe Pacific saury. |
| **WP04-P-PACIFIC-SAURY-20261013-S04** | Fisheries and Oceans Canada, [Thon du Pacifique 2025–2026, French](https://www.pac.dfo-mpo.gc.ca/fm-gp/mplans/tuna-thon-ifmp-pgip-sm-fra.html) | Uses `balaou du Pacifique (Cololabis saira)` in a discussion of juvenile albacore prey. It supports a current authoritative French name/taxon pairing, not human-food use or culinary behavior. |
| **WP04-P-PACIFIC-SAURY-20261013-S05** | Marché Korea, Montréal, [Dongwon canned Pacific saury](https://marchekorea.com/shop/dongwon-dongwon-canned-pacific-saury-%EC%9E%90%EC%97%B0%EC%82%B0-%EA%BD%81%EC%B9%98%EC%BA%94-400g/) | Current Montréal store listing names a 400 g canned Pacific-saury product. It establishes Québec retail human-food use at the product-name level; it does not state the scientific name, drained mass, serving amount, or reusable can yield. |
| **WP04-P-PACIFIC-SAURY-20261013-S06** | Save-On-Foods, [3 Fish — Frozen Pacific Saury](https://www.saveonfoods.com/sm/pickup/rsid/918/product/3-fish-frozen-pacific-saury-id-00874718001006) | Canadian retailer page lists a 454 g three-fish SKU and describes it as whole-round and frozen. These values and descriptors are SKU-specific; they do not establish average fish mass, edible yield, or a Québec package. |
| **WP04-P-PACIFIC-SAURY-20261013-S07** | Uniking Enterprises (Canada) Ltd., [French product catalogue](https://www.uniking.ca/fr/products) | A Canadian distributor catalogue includes `balaou du Pacifique (Sanma)` in a French product title. It corroborates Canadian French trade wording; the listing gives no scientific name, item-level specification, or recipe measure. |

## Recommendation

Keep **`candidate-pacific-saury` ledger-only**, with verified species identity and no active ingredient-reference row. CFIA, DFO, and the current Montréal product listing establish a distinct Pacific taxon, a Québec-qualified French name, and human-food use. However, the current phrase-first picker would return a sole Pacific result for bare `saury` and `balaou`; CFIA shares those names with Atlantic saury, and OQLF specifically assigns unqualified Québec `balaou` to Atlantic saury. Retain no aliases, forms, measures, recipe links, conversions, yields, or substitutions. Revisit the active row after search can preserve both species scopes.

## Root review and integration (2026-10-13)

Accepted the verified species identity as ledger-only `candidate-pacific-saury`. The picker would
make bare `saury` and `balaou` queries appear to select this Pacific species alone, despite the
documented Atlantic names. Added the bounded candidate and source evidence to the research ledger;
no active reference, alias, form, measure, recipe link, conversion, yield, or substitution was
added. The integration record is in
[`the batch README`](../batches/wp04-section-p-pacific-saury-picker-boundary-integration-20261013/README.md).
No tests or emulator checks were run because this change only adds database JSON research data, per
`AGENTS.md`.
