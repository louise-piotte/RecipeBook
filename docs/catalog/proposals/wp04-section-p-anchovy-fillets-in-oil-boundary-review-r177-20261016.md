# WP04 Section P — oil-packed anchovy-fillets boundary review (R177)

- **Reviewed / source-access date:** 2026-10-16.
- **Candidate:** Oil-packed anchovy fillets / *filets d’anchois à l’huile*, including Canadian retail products marketed in the canned-fish aisle.
- **Recommendation:** **Hold** an oil-packed-fillet form or separate product identity pending an exact recipe or product request that resolves the product state.
- **Scope:** One preserved-anchovy product boundary under the open Section P fish-preservation work. This review retains the accepted family-scoped `anchovy / anchois` identity and the separate `anchovy paste / pâte d’anchois` condiment. It does not decide fresh anchovy forms, dried anchovy, anchovy powder, fish sauce, or Norwegian-style `anchois de Norvège`.
- **Status:** Proposal-only at authoring. No shared catalog JSON, generated code, ledger, legacy identities, plan, roadmap, recipe, manifest, or batch record was changed by the reviewer. No builds, tests, emulator checks, or deployment were run.
- **Proposal-local source IDs:** `WP04-SECTIONP-ANCHOVY-OIL-FILLETS-R177-20261016-S03` through `S07`, plus audit ID `WP04-SECTIONP-ANCHOVY-OIL-FILLETS-R177-20261016-R01`. These IDs are local; no new shared-ledger source entries are proposed. Prior anchovy identity sources are cited by their existing source IDs.

## Why this is a distinct open product boundary

The open [Section P preservation checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L5937) includes oil-packed fish forms. The plan’s prior preservation review explicitly left preserved anchovy fillets and anchovies in oil unresolved without an exact recipe request. The accepted anchovy-fish identity review also kept all preparation forms open because the bundle had no anchovy ingredient line. Those are the relevant prior decisions; neither allocated an oil-packed-fillets form or determined whether Québec retail “filets d’anchois” denotes a single reusable preparation state.

This review takes one narrower product question from that open work. Current Québec-facing retail pages use *filets d’anchois* for salted fillets sold with olive or sunflower oil, while OQLF scopes the bare fish name to the Engraulidae family. The multilingual fish-products dictionary describes salt-ripened anchovy fillets in oil as semi-preserved and distinguishes Scandinavian “anchovies” made from sprats or small herring. The local products do not disclose a species or curing/storage process, and the recipe corpus has no matching request. Keep the product-specific evidence separate until a selected use identifies the state it needs.

## Current product and terminology evidence

| Evidence | What it supports | Limit |
|---|---|---|
| OQLF GDT, *anchois* [S01, reused source `WP04-ANCHOVY-20261011-S01`] | Québec French *anchois*, English *anchovy*, and the family *Engraulidae*. | A fish-name entry, not a prepared-product name or preservation definition. It does not select one species or state. |
| CFIA Fish List search for `Anchovy` [S02, reused source `WP04-ANCHOVY-20261011-S03`] | Canadian accepted-name records attach `Anchovy / Anchois` to multiple Engraulidae species and genera, alongside narrower names. | A labelling-name list; it does not identify the anchovy species in a particular oil-packed product. |
| OQLF GDT, *anchois de Norvège* [S03] | Québec terminology describes “Norwegian anchovies” as fresh sprats lightly salted in spiced brine and packed in barrels or buckets. | The entry identifies a distinct sprat product, not salted Engraulidae fillets or every retail use of “anchovy.” |
| OECD/FAO/Eurostat multilingual fish-products dictionary [S04] | The fish-products entry distinguishes salt-ripened anchovies sold as semi-preserved whole or filleted products in oil or sauce from Scandinavian “anchovies,” which can be sprats or small herring spice-cured in brine and repacked in cans or jars. | A terminology reference, not a Canadian product specification or a universal process requirement. It establishes a relevant boundary but does not identify the current Québec SKUs. |
| Metro Québec, Aurora flat anchovy fillets in olive oil [S05] | A Québec French grocery page titles the product *Filets d’anchois plats à l’huile d’olive*; the listing gives 50 g and ingredients of anchovy fillets, olive oil, and salt. Its aisle path is “Canned & Jarred / Fish & Seafood.” | The page currently marks the item out of stock and gives no Latin species, curing method, preservation classification, storage direction, or drained amount. The 50 g package belongs to this SKU only. |
| Metro Québec, Allessia anchovy fillets [S06] | A current French listing calls the item *Filets d’anchois* and reports fillets, sunflower oil, and salt. The same product number appears as an 80 g grocery item. | The listing is out of stock and provides no species or curing/storage process. It is not proof that all products called *filets d’anchois* have one process or packing medium. |
| Mayrand Québec, Allessia 150 g anchovy fillets [S07, URL new; related 560 g listing source reused from `WP04-ANCHOVY-20261011-S07`] | The current French storefront lists a 150 g Allessia *Filets d’anchois* item under its canned-fish section and reports stock at its Québec stores. | The 150 g package and stock are SKU/store facts. This product page does not provide ingredients, species, oil medium, curing method, or preservation classification. The prior ledger source concerns a different 560 g SKU. |

These sources show that Canadian Québec stores market several anchovy-fillet products under similar French names, but they do not establish one shared species or preservation process. The products may use different fish, packing oils, cuts, salting or ripening, packaging, and storage. The aisle placement “Canned & Jarred” is retailer taxonomy and does not, by itself, establish that the product is commercially sterilized canned fish rather than a semi-preserved product in a tin or jar. Keep *anchois de Norvège* separate: OQLF’s entry describes sprats in spiced brine, not Engraulidae fish fillets in oil.

## Ownership, source and collision audit

A read-only exact-key check covered active reference names and aliases, form labels and match terms, legacy candidate IDs/names/aliases, and ledger record IDs/terms for `oil-packed anchovy fillets`, `anchovy fillets in oil`, `filets d’anchois à l’huile`, `filets d’anchois plats à l’huile d’olive`, `filets d’anchois`, `anchois de Norvège`, `Norwegian anchovies`, and candidate IDs `ingredient-form-anchovy-fillets-in-oil`, `ingredient-ref-anchovy-fillets-in-oil`, and `candidate-anchovy-oil-fillets`. No such active form, separate product reference, or exact legacy candidate exists. The source-ID prefix is proposal-local and unique in the inspected ledger/archive.

| Current owner or near-collision | Ownership and disposition |
|---|---|
| `ingredient-ref-anchovy` | Active `anchovy / anchois` identity scoped to edible fish in *Engraulidae*, with `anchovies` as its English plural alias. This is the base fish identity, not a product-state form. Keep unchanged. |
| `ingredient-ref-anchovy-paste` | Active `anchovy paste / pâte d’anchois` condiment. Keep separate; the word `anchois` in the paste label is not ownership of fillets, oil-packed fish, or a substitute for them. |
| Existing anchovy ledger record `ingredient-ref-anchovy` | Owns the family-level identity review and its prior sources, including OQLF, CFIA, Sea Tales, Costco Canada, and a different 560 g Mayrand item. Its accepted decision left preparation forms unassigned. Reuse the applicable prior OQLF/CFIA sources rather than adding duplicate source entries. |
| `ingredient-ref-anchovy-paste` ledger record | Owns the paste product boundary and its OQLF/Metro paste sources. It does not own the fillet products reviewed here. |
| OQLF *anchois de Norvège* | No active reference or alias was found for this phrase. Keep it out of generic anchovy aliases because OQLF defines it as sprats in spiced brine. |
| Candidate form/product identifiers above | No matching active, form, legacy, or ledger ID exists. Illustrative only; none is reserved or allocated. |

The focused proposal/batch search found the prior [anchovy-fish identity review](wp04-section-p-anchovy-fish-identity-vs-paste-review-20261011.md) and [preserved-fish state review](wp04-section-p-preserved-fish-product-state-boundary-review-20261012.md), but no focused review of oil-packed anchovy fillets. The identity review explicitly deferred forms; the preservation review names anchovy fillets and anchovies in oil as unrequested gaps. This proposal does not reopen either accepted decision.

The audit found that OQLF `anchois`, the CFIA `Anchovy` query, and the prior 560 g Mayrand product URLs already have ledger provenance. Those existing source IDs are reused. The R177 Metro Aurora, Metro Allessia, new 150 g Mayrand and OQLF `anchois de Norvège` URLs had no exact ledger URL owner at the checked snapshot. No new ledger source entry or source ID is proposed.

## Picker projection and recipe demand

The current search index normalizes case, accents, and punctuation; it prefers complete word phrases and uses substring fallback only when no phrase match exists ([`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)). Current ownership projects as follows:

| Query | Current results | Consequence |
|---|---|---|
| `anchovy`; `anchois` | The generic anchovy identity and anchovy paste | These results reflect the existing fish-versus-condiment boundary. Keep both. |
| `anchovy paste`; `pâte d’anchois` | Anchovy paste only | Preserve exact product-phrase ownership. |
| `anchovy fillets`; `filets d’anchois`; `filets d’anchois à l’huile` | No exact phrase result | No active form currently resolves a preparation-specific query. A future exact form would add one result for a selected anchovy product state. |
| `anchois de Norvège`; `Norwegian anchovies` | No result | Do not add these as aliases to Engraulidae or to a hypothetical oil-packed fillet form. |

Under the recommended hold, picker behavior remains unchanged. The manifest-ordered recipe audit parsed all **114 recipe files** and **1,123 ingredient rows**, searched all decoded recipe JSON strings and ingredient-row values for `anchovy fillets`, `anchovies in oil`, `anchovies in olive oil`, `filets d’anchois`, accented and accent-folded variants, `anchois de Norvège`, `Norwegian anchovies`, and broader `anchovy / anchois` terms. It found **zero matching recipe files and zero matching ingredient rows**. [R01] This is consistent with the previous family-identity and preservation reviews, but the current audit includes the exact R177 product-state phrases against the live manifest.

## Forms, numeric behavior, and substitutions

- **Form and product allocation:** Add no oil-packed, salt-cured, filleted, canned, jarred, or semi-preserved form under `ingredient-ref-anchovy`. Current retail labels do not identify species, cure/ripening, storage, or commercial-sterility process; those differences matter to what a recipe requests. Do not add a separate product row without a selected product request.
- **Package quantities:** The observed 50 g Aurora, 80 g Allessia, 150 g Allessia, and prior 560 g Allessia titles are package facts for distinct SKUs. They do not establish a standard package, recipe portion, drained amount, fillet count, edible yield, density, or unit mapping. Add no reusable numeric observation, conversion, yield, or measure.
- **Substitutions:** The corpus has no anchovy use to provide dish, preparation, or quantity context. No global or contextual substitution is supported between fresh anchovy, oil-packed fillets, salt-ripened anchovy, vinegar-marinated fillets, Norwegian sprat “anchovies,” anchovy paste, fish sauce, or another fish. Add no substitution, warning, or recipe-line link.

## Proposed delta

**No catalog or shared-ledger delta is proposed.** Keep oil-packed anchovy fillets and a generic canned-anchovy state unallocated until a recipe or explicit product request identifies the intended species/product and preparation. Do not create a form or new reference, attach `filets d’anchois` or oil-packed language to the base identity, add a legacy mapping, or create a second anchor ledger candidate. Keep the paste identity, family-scoped fish identity, and OQLF Norwegian-anchovy distinction unchanged. Reopen with a selected package or recipe; if the request resolves to a particular state, evaluate a narrow form or product group and keep any package amount, oil, cure, storage, and drained details source-specific.

## Source register

Sources were checked on 2026-10-16 unless a reused source has its earlier recorded access date. The source IDs marked reused already belong to the previous anchovy identity ledger record and are not reallocated.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **Reused `WP04-ANCHOVY-20261011-S01`** | OQLF, [GDT: anchois](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199027/anchois). | Preferred Québec fish term and English equivalent; family *Engraulidae*. No product state. |
| **Reused `WP04-ANCHOVY-20261011-S03`** | CFIA Fish List, [Anchovy query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Anchovy). | Assigns `Anchovy / Anchois` across multiple species and genera; not a product identification. |
| **WP04-SECTIONP-ANCHOVY-OIL-FILLETS-R177-20261016-S03** | OQLF, [GDT: anchois de Norvège](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8498984/anchois-de-norvege). | Defines sprats fresh, lightly salted in spiced brine and packed in barrels or buckets. Distinct from oil-packed Engraulidae fillets. |
| **WP04-SECTIONP-ANCHOVY-OIL-FILLETS-R177-20261016-S04** | OECD, [Multilingual Dictionary of Fish and Fish Products (EN-FR)](https://www.oecd.org/content/dam/oecd/en/publications/reports/2008/10/multilingual-dictionary-of-fish-and-fish-products_g1gh94d9/9789264056473-en-fr.pdf). | Describes salt-ripened anchovy fillets in oil or sauce as semi-preserved; distinguishes “Scandinavian anchovy” from Engraulidae fillets by use of sprats or small herring. Terminology evidence only, not a Canadian processing standard. |
| **WP04-SECTIONP-ANCHOVY-OIL-FILLETS-R177-20261016-S05** | Metro Québec, [Aurora flat anchovy fillets in olive oil, 50 g](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/poissons-et-fruits-de-mer/filets-d-anchois-plats-a-l-huile-d-olive/p/061659000056). | Current Québec product title, 50 g package, ingredient line (anchovy fillets, olive oil, salt), and retailer canned/jarred aisle placement. Listing is out of stock; no species, cure, process, or drained amount. |
| **WP04-SECTIONP-ANCHOVY-OIL-FILLETS-R177-20261016-S06** | Metro Québec, [Allessia anchovy fillets, 80 g](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/poissons-et-fruits-de-mer/filets-d-anchois/p/061659003712). | Current Québec product title and ingredient line (anchovy fillets, sunflower oil, salt). Listing is out of stock and gives no species or preservation process. |
| **WP04-SECTIONP-ANCHOVY-OIL-FILLETS-R177-20261016-S07** | Mayrand, [Allessia filets d’anchois, 150 g](https://mayrand.ca/fr/nos-produits/epicerie/poisson-et-viande-en-conserve/poisson-en-conserve/filets-danchois-150g-allessia-30408). | Current Québec retail title and package listing in the canned-fish category; stock is shown at Québec stores. No species or product ingredients are listed on the page. |
| **Reused `WP04-ANCHOVY-20261011-S07`** | Mayrand, [Allessia filets d’anchois, 560 g](https://mayrand.ca/fr/nos-produits/epicerie/poisson-et-viande-en-conserve/poisson-en-conserve/filets-danchois-560g-allessia-35618). | Prior anchovy identity source, a different package SKU. Reused only to show product/package variability; no conversion or new source entry. |
| **WP04-SECTIONP-ANCHOVY-OIL-FILLETS-R177-20261016-R01** | [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L5937), active references/forms, legacy identities, research ledger, manifest-listed recipes, focused proposal/batch archive, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Read-only exact-key, source-ID/URL, picker, and corpus audit. Snapshot contained 1,551 active references, 120 forms, 1,896 ledger records, and 114 recipes / 1,123 ingredient rows. Counts describe this repository snapshot only. |

## Final disposition

**Hold** oil-packed anchovy fillets as a shared form or product reference. The current Québec products use similar French names but do not resolve their fish species, curing process, or preservation class; authoritative terminology distinguishes salt-ripened oil-packed anchovy from sprat-based “Norwegian anchovies.” With no bundled demand, the catalog should not infer one reusable anchovy-fillets state from retailer aisle placement or package labels. No tests were run because this is proposal-only work.


## Integration outcome

Root added identity-only `anchovy fillets in oil / filets d’anchois à l’huile` as a prepared-fillet market group, using the reviewed Québec retail listings while leaving fish species, curing, storage, and canning process unspecified. Existing OQLF and CFIA anchovy source records were reused. No alias, form, measurement, conversion, yield, recipe link, or substitution was added. See the R177 integration README.
