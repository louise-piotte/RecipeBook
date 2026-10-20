# WP04 Section P R745 — live Blue Crab form picker hold

- **Review date:** 2026-10-18.
- **Status:** Integrated documentation-only hold. Root updated the plan, roadmap, workflow, and batch integration README; no catalog, ledger, recipe, generated file, or application code changed.
- **Checklist target:** [Shrimp/prawn by meaningful preparation; crab and crayfish](../../RecipeBook-global-ingredient-catalog-plan.txt#L7735), still open in the current plan.
- **Scope:** Whether supplier-specific live availability warrants a `live` form under the existing Blue Crab / *Callinectes sapidus* identity.
- **Recommendation:** Hold the form from active data because the current phrase-first picker would turn the generic query `live` into a Blue-Crab-only result and suppress the six current substring results. The same form would make French `vivant` a Blue-Crab-only result. The supplier evidence is product-specific and does not establish generic live-crab availability.
- **Exact proposed delta:** Zero references, forms, aliases, source records, ledger records, observations, recipe links, conversions, yields, and substitution rules. The possible bilingual display `live blue crab / crabe bleu vivant` remains a review candidate only; no form ID is allocated.

## Prior decisions and current ownership

R5 integrated identity-only `ingredient-ref-blue-crab` for **blue crab / crabe bleu**, scoped to *Callinectes sapidus*. It added no form or alias. R78 separately held Québec soft-shell-crab wording outside active data because the local seller supplied no binomial and `crabe mou` also describes a snow-crab post-moult condition. This review does not reopen that soft-shell decision or add `soft shell crab`, `crabe mou`, `swimming crab`, or another alias. See the [R5 integration](../batches/wp02-wp03-wp04-round5-gap-review-integration-20261013/README.md), [R78 integration](../batches/wp02-wp03-wp04-r78-integration-20261013/README.md), and their [R5 proposal](wp04-section-p-next-fish-gap-review-20261013-round5.md) and [R78 proposal](wp04-section-p-next-seafood-gap-review-r78-20261013.md).

The latest catalog checkpoint is R740–R742. The live package has **1,848 references and 178 forms**; the research ledger has **2,235 records, 10,491 source entries, 8,855 distinct source IDs, and 7,502 distinct URLs**. The current Blue Crab reference has no aliases, density, or unit mappings. It has no attached form. The existing crab forms are canned crab meat and Jumbo Lump crab meat under the generic `ingredient-ref-crab` identity. The legacy-import list has no Blue Crab/live candidate. The proposed illustrative ID `ingredient-form-blue-crab-live` is absent from active forms and ledger, but is not allocated by this hold.

The active Blue Crab ledger record is verified for identity; measurement and substitution research remain `not_yet_researched`. The exact Seafood Depot URL is already owned once by `ingredient-ref-blue-crab`, under source ID `WP04-SECTIONP-BLUE-CRAB-IDENTITY-20261013-R5-S07`. Reuse that existing owner as evidence; add no duplicate URL, source ID, or form-level ledger record. The OQLF name page is already owned under R5 S01, and the CFIA Blue query is already owned under R5 S03. The current local retailer page for “Live Blue Crabs” has no exact URL owner in the live ledger or proposal archive and is used here only as a product-specific boundary observation; its proposal-local ID below is not entered in the ledger.

## Evidence and bilingual form boundary

Seafood Depot’s current [Blue Crab supplier page](https://www.seafooddepot.ca/product-bluecrab2) identifies *Callinectes sapidus*, says it is available live at certain times of year, and specifies live availability by special order. Its note distinguishes that offer from pasteurized meat available year-round. This supports only this supplier’s seasonal/special-order live offer. It does not establish Québec availability, general market stock, a standing all-season form, head or shell status, cleaning, storage, cooking readiness, or product mass. The page also says “also known as Swimming Crab”; do not copy that wording into the catalog because the CFIA Fish List separately assigns Blue Swimming Crab to *Portunus pelagicus*.

OQLF’s [GDT entry for *crabe bleu*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198912/crabe-bleu) gives preferred French **crabe bleu**, English **blue crab**, and *Callinectes sapidus*. Its terminology is stable but the entry was last updated in 1998; it is not current product evidence. If a picker-safe form is reconsidered later, `live blue crab / crabe bleu vivant` is a clear compositional bilingual label: the species-qualified names remain intact, and `vivant` agrees with masculine `crabe`. The exact French phrase is not attested on the English-only Seafood Depot page. Do not broaden it to `live crab / crabe vivant` or treat it as a generic live-crab name.

The current [Superwafer “Live Blue Crabs” SKU](https://www.superwafer.ca/en/product/16089/live-blue-crabs), item 16089, is marked sold out and lists approximately 1 lb / 2–3 pieces by weight. It does not name a scientific species and warns that product information may not be current or complete. Do not attach that SKU or its package/count figures to *C. sapidus*, and do not convert them into a reusable measure or yield.

## Current picker projection

The projection uses the current [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) behavior and current reference/form labels: complete normalized word phrases win; partial substring matches are returned only when there is no phrase match. Forms are searched as part of their parent reference. The “after hypothetical form” column adds only `live blue crab / crabe bleu vivant`, with no match terms, to that projection.

| Query | Current picker result | After hypothetical form | Assessment |
|---|---|---|---|
| `live blue crab` | 0 | Blue Crab only (exact phrase) | Good species-qualified English form phrase. |
| `crabe bleu vivant` | 0 | Blue Crab only (exact phrase) | Good species-qualified French form phrase, composed from OQLF identity and the supplier’s live state. |
| `live` | 6 substring results: canned cod liver, extra-virgin olive oil, lovage, octopus in olive oil, olive oil, and steamed monkfish liver | Blue Crab only (exact phrase); the six fallback results are suppressed | Bad singleton for a generic live state; the catalog has no other live seafood form. |
| `vivant` | 0 | Blue Crab only (exact phrase) | Bad singleton for a generic French state. |
| `live crab`; `crabe vivant` | 0 | 0 | They do not match the qualified labels as contiguous phrases; adding these unqualified match terms would create broader species assignment. |
| `blue crab`; `crabe bleu` | Blue Crab only for each | Same | Existing identity queries remain stable. |
| `crab`; `crabe` | 13 results for each | Same 13 for each | Broad crab searches remain multi-choice; they do not offset the generic `live`/`vivant` singleton. |

The qualified form phrases themselves would resolve to the intended parent. The blocker is that the same labels make shorter, generic state queries appear complete and exclusive. The current picker has no form-only filter or ranking rule that can retain a broad result set while still returning the qualified form hint. Do not add unqualified `live crab`, `crabe vivant`, or `swimming crab` match terms to work around the phrase-order issue.

## Recipe corpus, measures, yields, and substitutions

The complete `manifest.v1.json` lists **114 recipes** and **1,123 structured ingredient rows**. A UTF-8 scan of all manifest-listed recipe JSON text and ingredient rows for `blue crab`, `crabe bleu`, *Callinectes sapidus*, live-crab wording, and the candidate bilingual form phrases found **zero matching files and zero matching rows**. Recipe [019, Crab Balls](../../../app/src/main/assets/seed/bundled-library/recipes/019-boulettes-de-crabe-crab-balls-135813a6-75e2-4596-8c71-ffd450fab0ca.v1.json), asks for 1 lb of Jumbo Lump crab meat and links to `ingredient-ref-crab` / `ingredient-form-crab-jumbo-lump`; it does not request Blue Crab or a live animal.

Seafood Depot gives no reusable mass, piece count, kitchen unit, or edible yield. Superwafer’s approximate weight/count is tied to one sold-out SKU without a binomial and remains excluded. No cleaning, storage, head/shell, cooking, raw-to-cooked, whole-to-meat, or package conversion is established. No global or contextual substitution, recipe-line link, density, unit mapping, or yield is supported.

## Source register and ownership

Sources were checked on 2026-10-18. Existing R5 source IDs remain the live ledger owners shown below; R745 adds no ledger source entries.

| Source ID | Source and exact URL owner | Support and limits |
|---|---|---|
| `WP04-SECTIONP-BLUE-CRAB-IDENTITY-20261013-R5-S07` | Seafood Depot, [Blue Crab](https://www.seafooddepot.ca/product-bluecrab2). Exact URL owner: `ingredient-ref-blue-crab` in the live ledger. Page accessed 2026-10-18; current page crawl reported last week. | Names *Callinectes sapidus* and describes seasonal live availability plus live special order. Supplier-specific only; no Québec inventory, cleaning/storage state, package mass, or generic live-crab market claim. |
| `WP04-SECTIONP-BLUE-CRAB-IDENTITY-20261013-R5-S01` | OQLF, [GDT: crabe bleu](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198912/crabe-bleu). Exact URL owner: Blue Crab identity and the separate Blue Swimming Crab candidate reuse this shared source ID. | Supports preferred Québec `crabe bleu`, English `blue crab`, and *C. sapidus*. Updated 1998; terminology/taxon only, not current supply. |
| `WP04-SECTIONP-BLUE-CRAB-IDENTITY-20261013-R5-S03` | CFIA, [Fish List Blue query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?lang=e&q=Blue). Exact URL owner: Blue Crab identity and the separate Blue Swimming Crab candidate reuse this shared source ID. | Keeps *Portunus pelagicus* / Blue Swimming Crab separate. The supplier’s “Swimming Crab” wording is not added as an alias. |
| **Proposal-local `WP04-SECTIONP-BLUE-CRAB-LIVE-FORM-HOLD-R745-20261018-S01`** | Superwafer, [Live Blue Crabs, item 16089](https://www.superwafer.ca/en/product/16089/live-blue-crabs). Exact URL owner: none found in the live ledger or prior proposal/batch archive; not entered into the ledger. | Current product page is sold out, has no binomial, gives 1 lb / approximately 2–3 pieces for that SKU, and warns product information may not be current or complete. Supports only a non-taxonomic wording/package boundary. |

## Disposition and revisit condition

**Hold** the `live blue crab / crabe bleu vivant` form outside active data. The supplier page does support a current supplier-specific seasonal/special-order offer, but indexing that qualified name would make `live` and `vivant` Blue-Crab-only searches. The package count source does not identify a species, and the bundled corpus provides no recipe demand to justify accepting that picker cost.

Revisit if the picker can preserve the generic result boundary while exposing a qualified form hint, or if the form is represented through a search path that does not make `live`/`vivant` exclusive. Keep the source’s availability claim scoped to Seafood Depot. Require a same-product taxon pairing before attaching another supplier’s “live blue crab” SKU, and do not infer preparation, cleaning, storage, package measure, yield, or substitution.

## Review checks

- Current plan, R5/R78 proposal and integration records, reference/form JSON, legacy candidates, and the full research ledger were inspected. The R745 illustrative form ID and output filename were unallocated at review time.
- Recipe scan covered all 114 manifest-listed files and 1,123 structured rows.
- Picker projection follows the current phrase-first implementation; no catalog or generated index was changed.
- Relative links, UTF-8 without BOM, mojibake markers, trailing whitespace, and final newline were checked after drafting.
- No software tests, build, emulator run, or deployment were performed. This integrated hold changes no database JSON; current `AGENTS.md` also says database-JSON-only changes do not need tests.
