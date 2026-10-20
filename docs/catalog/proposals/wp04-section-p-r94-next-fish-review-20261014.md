# WP04 Section P — whiteleg shrimp / crevette à pattes blanches picker-boundary review (R94)

- **Review and source-access date:** 2026-10-14.
- **Packet type:** species identity, Canadian and Québec naming, picker ownership, recipe demand, product-state, measurement, and substitution review.
- **Open checklist:** the shrimp/prawn item in the [live Section P plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4671) remains open.
- **Candidate:** whiteleg shrimp, *Litopenaeus vannamei* (also listed as *Penaeus vannamei* in terminology sources).
- **Recommendation:** hold a single-species active row for now. Canadian and Québec food-market sources establish products identified as *L. vannamei*, but the CFIA Fish List also assigns the exact names `Whiteleg Shrimp` and `Crevette Pattes Blanches` to *L. setiferus*. A row whose display is `whiteleg shrimp / crevette à pattes blanches` would therefore return only *L. vannamei* for names that CFIA applies to both taxa. Do not use `white shrimp / crevette blanche`; OQLF assigns that Québec fish-product name to another shrimp.
- **Shared-data effect:** none proposed. No reference, ledger record, alias, form, measure, recipe link, conversion, yield, or substitution is added.
- **Tests:** none. This is proposal-only documentation and makes no app or database change.

## Why this is a distinct open candidate

The Section P plan keeps shrimp and prawn coverage open by preparation. Existing work has already accepted Northern shrimp / `crevette nordique` (*Pandalus borealis*), held black tiger shrimp / *Penaeus monodon* because its unqualified names overlap another taxon in the CFIA list, reviewed Argentine red shrimp / *Pleoticus muelleri* separately, held a global fresh-shrimp/prawn row, and kept dried shrimp, shrimp powder, and shrimp pastes separate. This packet addresses only *L. vannamei* and its food-market naming.

The generic fresh-shrimp review mentions `white leg shrimp` only as an example in a CFIA animal-health fact sheet. That review explicitly limits the fact sheet to vernacular overlap; it does not assess *L. vannamei*, the CFIA food-label list entries for that species, or its shared names with *L. setiferus*. A search of the current plan, proposal and batch archive found no focused whiteleg-shrimp / *L. vannamei* identity decision, picker hold, or integration.

## Identity and Canadian / Québec naming

The Government of Canada Translation Bureau's TERMIUM Plus crustacean entry for `Pacific white shrimp` (record dated 2021-10-27) identifies both *Penaeus vannamei* and *Litopenaeus vannamei*. It lists `whiteleg shrimp` and `Pacific white shrimp` as correct English terms, and `crevette à pattes blanches` and `crevette pattes blanches` as correct French terms. These provide a Canadian bilingual species crosswalk. They do not establish that each common name is exclusive to this taxon in the current Canadian label list.

The current CFIA Fish List shrimp query shows the conflict directly:

| CFIA taxon and TSN | English / French name rows relevant here | Picker consequence |
|---|---|---|
| *Litopenaeus setiferus*, TSN 551680 | `Whiteleg Shrimp`; `Shrimp / Crevette Pattes Blanches`; `Pacific White Shrimp / Crevette` | The English qualified name and French name also occur on the target species below. |
| *Litopenaeus vannamei*, TSN 551682 | `Shrimp / Crevette Pattes Blanches`; `Pacific White Shrimp / Crevette`; `Whiteleg Shrimp` | These label names do not uniquely distinguish the target taxon from *L. setiferus*. |

The Fish List is a Canadian fish-label naming source and the result page reports a 2023-09-18 modification date. It does not decide that the two species are interchangeable in recipes. It does establish that a species-only picker row using those common names would hide the second taxon from a user entering the same name.

The Québec label `crevette blanche` is not a safe shortening or alias. OQLF's GDT entry pairs `crevette blanche` with English `white shrimp` and gives *Pasiphea multidentata* (as spelled in the entry); Fisheries and Oceans Canada reports the corresponding species as *Pasiphaea multidentata*, `sivade rose / crevette blanche`, and `Pink Glass Shrimp`. That is a different species from *L. vannamei*. Do not add `white shrimp`, `Pacific white shrimp`, `crevette blanche`, or `crevettes blanches` as aliases for this candidate.

Québec-facing market evidence does document the intended species. Aliments Pearlmark's bilingual seafood-supplier page is titled `Crevettes blanches Vannamei` and identifies *Litopenaeus vannamei*. Its Québec-serving supplier page lists tail-on, individually frozen packages in 16–20, 21–25, and 26–30 grades, each in 10 × 1 lb cases. Super C's current product listing names frozen Pacific white shrimp, identifies *L. vannamei*, and describes one 340 g raw, deveined, easy-to-peel item with a 31–40-per-pound size grade. A separate Super C listing identifies *L. vannamei* for a 340 g cooked, frozen product that is peeled except for the tail and graded 51–60 per pound. These pages establish real Canadian / Québec product wording and species-labelled SKUs, not an exclusive species-wide common name, general availability, or a standard form.

## Current ownership and picker projection

The live package snapshot has **1,426 ingredient references, 104 forms**, and the research ledger has **1,765 records**. The legacy-import file has 63 candidates. The recipe manifest lists 114 recipes and the bundle has 1,123 ingredient rows.

No active reference, form, legacy-import candidate, or ledger record owns `whiteleg shrimp`, `white leg shrimp`, `Pacific white shrimp`, `crevette à pattes blanches`, `crevette pattes blanches`, `Vannamei`, *L. vannamei*, or the prospective ID `ingredient-ref-whiteleg-shrimp`. The only prior archive hit for “white leg shrimp” is the incidental animal-health example described above; it is not an identity decision. Existing neighboring active rows remain distinct:

| Active reference | Relevant name | Scope |
|---|---|---|
| `ingredient-ref-northern-shrimp` | Northern shrimp / `crevette nordique` | *Pandalus borealis*; separate Québec shrimp identity. |
| `ingredient-ref-dried-shrimp` | dried shrimp / `crevette séchée` | Preserved product; not a fresh, raw, or species-specific synonym. |
| `ingredient-ref-saeu-jeot` | saeu-jeot (salted shrimp) | Korean salted-fermented condiment. |
| `ingredient-ref-kapi-shrimp-paste` | Kapi / `pâte de crevettes Kapi` | Named shrimp paste/condiment. |

The projection follows the current [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): complete normalized word phrases are returned before the fallback partial search. I ran a static projection against current reference names, aliases, and attached form terms, then a conditional alias-free row with the TERMIUM display pair `whiteleg shrimp / crevette à pattes blanches`. This is not a UI or emulator test.

| Query | Current result | With a hypothetical single-*L. vannamei* row | Interpretation |
|---|---|---|---|
| `whiteleg shrimp` | None | Proposed row only | It looks taxon-specific in the picker, although CFIA applies the same name to *L. setiferus*. |
| `crevette à pattes blanches` | None | Proposed row only | It looks taxon-specific, although CFIA lists `Crevette Pattes Blanches` for both taxa. |
| `shrimp` | Dried shrimp; Northern shrimp; saeu-jeot | Same three plus the proposed row | The broad query remains multi-result; it is not the blocking collision. |
| `crevette` | Dried shrimp; Northern shrimp | Same two plus the proposed row | The broad French query remains multi-result. |
| `Pacific white shrimp` | None | None unless added as an alias | Do not add it: CFIA assigns the name to both *L. setiferus* and *L. vannamei*. |
| `white shrimp`; `crevette blanche` | None | None unless added as an alias | Do not add: OQLF uses this pair for *Pasiphea multidentata*, not *L. vannamei*. |
| `Vannamei` | None | None for the TERMIUM display pair | Retailer wording can identify a particular source-labelled product, but it is not the standardized display in TERMIUM. Do not invent a general alias from the supplier title. |

The broad result sets can accommodate another clearly named shrimp identity without hiding the existing products. The problem is that the most authoritative available bilingual common name for a species row is also used for a second CFIA-listed species. The Québec supplier's `Vannamei` product title demonstrates that a fully qualified product name can identify a particular SKU; it does not authorize replacing or aliasing the shared standard names on a single-species row.

## Bundled recipe demand

I scanned every manifest-listed recipe JSON file and ingredient row for `whiteleg shrimp`, `white leg shrimp`, `Pacific white shrimp`, `white shrimp`, `Vannamei`, `crevette blanche`, `crevette à pattes blanches`, both scientific-name combinations, and broad `shrimp`, `prawn`, and `crevette` terms. The scan found **zero candidate or broad-shrimp hits in all 114 files and zero hits in all 1,123 ingredient rows**. No recipe link, relink, quantity, preparation, or substitution can be derived from the bundle. The optional line `Cooked meat or seafood, to taste` does not identify shrimp or any taxon.

The current Québec retailer and supplier listings demonstrate product-market presence, but no recipe line in the bundled corpus expresses demand for *L. vannamei* or for a product bearing one of the overlapping common names.

## Forms, quantities, and substitutions

The current Québec listings show raw and cooked products, both frozen, with different peeling/tail states and distinct seller count grades. These are product-level presentations. They do not establish one generic form relationship under *L. vannamei*, and they do not resolve the common-name collision. Add no raw/cooked, frozen/thawed, peeled/shell-on, deveined, or tail-on form in this proposal.

The listed package weights, size grades, and case configurations remain SKU-specific. Health Canada's Canadian Nutrient File has a raw **mixed-species shrimp** entry (food code 3211) with “1 large” at 7 g, a 90 g food-guide serving, and 13% tail-and-shell refuse; its boiled-or-steamed mixed-species entry (food code 3212) lists 100 mL at 61.3 g, 250 mL at 153.2 g, six medium at 30 g, a 75 g food-guide serving, and the same refuse percentage. These are observations for mixed shrimp species and specific preparations, not a *L. vannamei* value or a conversion for the retailer products. Do not add them to a candidate ledger row or activate a density, kitchen unit mapping, count conversion, shell-removal yield, or cooking yield.

No reviewed recipe or product source gives a directed, method- and quantity-specific substitution between *L. vannamei*, *L. setiferus*, Northern shrimp, Argentine red shrimp, black tiger shrimp, dried shrimp, shrimp paste, or another shellfish. Do not infer one from shared shrimp wording, farming, or broad culinary usage. Add no global or contextual substitution rule.

## Recommendation

Keep the *Litopenaeus vannamei* candidate **outside active references and the research ledger** for now. TERMIUM and current Canadian / Québec product sources support the species and bilingual market terminology, but the CFIA Fish List assigns `Whiteleg Shrimp` and `Crevette Pattes Blanches` to both *L. vannamei* and *L. setiferus*. The current phrase-first picker would turn either shared name into a single-species result if only the *L. vannamei* row were added. Preserve the Québec market title `Crevettes blanches Vannamei` as source evidence only; it is a product-scoped identification, not a safe global alias.

Revisit after a specific recipe or product request establishes the intended scope and a picker/search representation can retain the species distinction without assigning the shared common names to one taxon. Do not merge the species, use `white shrimp / crevette blanche`, add generic shrimp aliases, or attach package-specific forms, measurements, or substitutions in the meantime. Section P remains open.

## Source register

Sources were accessed on 2026-10-14. IDs below are local to this proposal and were checked against the live ledger and catalog proposal/batch archive before drafting; they are not ledger entries.

| Source ID | Source and evidence | Limit |
|---|---|---|
| `WP04-SECTIONP-WHITELEG-SHRIMP-R94-20261014-S01` | Government of Canada Translation Bureau, [TERMIUM Plus — PACIFIC WHITE SHRIMP](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=ent&lang=eng&srchtxt=PACIFIC+WHITE+SHRIMP), record 2021-10-27. Identifies *Penaeus vannamei* / *Litopenaeus vannamei* and gives `whiteleg shrimp`, `Pacific white shrimp`, `crevette à pattes blanches`, and `crevette pattes blanches` as correct terms. | Terminology and species crosswalk, not proof that these names uniquely identify one species on current Canadian fish labels or recipe equivalence. |
| `WP04-SECTIONP-WHITELEG-SHRIMP-R94-20261014-S02` | CFIA, [Fish List shrimp query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=shrimp), rows TSN 551680 and 551682; see also [CFIA common-name guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names). | Lists `Whiteleg Shrimp` and `Crevette Pattes Blanches` under both *L. setiferus* and *L. vannamei*; also lists `Pacific White Shrimp` for both, with `Crevette` as a French row. The query page reports modification date 2023-09-18. Label naming evidence, not proof of culinary interchangeability. |
| `WP04-SECTIONP-WHITELEG-SHRIMP-R94-20261014-S03` | OQLF GDT, [crevette blanche](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198898/crevette-blanche). | Pairs the Québec food-fish term with English `white shrimp` and gives *Pasiphea multidentata* (spelling in the entry). The 1998 entry is not a term for *L. vannamei*. |
| `WP04-SECTIONP-WHITELEG-SHRIMP-R94-20261014-S04` | Fisheries and Oceans Canada, [Canadian commercial fisheries landings by species — 2023, French](https://publications.gc.ca/collections/collection_2023/mpo-dfo/Fs70-5-2023-074-fra.pdf), row for *Pasiphaea multidentata*. | Uses `sivade rose, crevette blanche` and English `Pink Glass Shrimp` for the different species. Landing statistics are not current consumer product or recipe evidence. |
| `WP04-SECTIONP-WHITELEG-SHRIMP-R94-20261014-S05` | Aliments Pearlmark, [Crevettes blanches Vannamei](https://www.pearlmarkfoods.com/fr/nos-produits/crevettes-blanches-vannamei). | Names *Litopenaeus vannamei*, lists Québec among supplier service regions, and describes SKU-specific tail-on frozen grades/case packs. Supplier page, not proof of all-market retail availability or reusable recipe measures. |
| `WP04-SECTIONP-WHITELEG-SHRIMP-R94-20261014-S06` | Super C, [Crevettes blanches du Pacifique surgelées, faciles à décortiquer](https://www.superc.ca/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/emballes-et-en-vrac/crevettes-blanches-du-pacifique-surgelees/p/059749950442), product 059749950442. | Lists *L. vannamei*, raw/frozen, 340 g, easy to peel/deveined, 31–40 shrimp per pound, and aquaculture origin. All state and amount details are for this retailer product; the fish-list wording collision remains. |
| `WP04-SECTIONP-WHITELEG-SHRIMP-R94-20261014-S07` | Super C, [Crevettes blanches du Pacifique cuites surgelées, avec queue](https://prod-ereceipt.superc.ca/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/emballes-et-en-vrac/crevettes-blanches-du-pacifique-cuites-surgelees/p/059749950381), product 059749950381. | Lists *L. vannamei*, cooked/frozen, peeled except tail, 340 g, and 51–60 shrimp per pound. Product-page state and grade only; not a universal cooked form or count-to-weight mapping. |
| `WP04-SECTIONP-WHITELEG-SHRIMP-R94-20261014-S08` | Health Canada, [Canadian Nutrient File serving portion 3211](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=3211) and [serving portion 3212](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3212). | Raw and boiled/steamed entries are for mixed shrimp species. Their serving and refuse observations are not transferable to *L. vannamei* or any one retail SKU. |

## Static review record

- Re-read repository instructions, `Requirements.md`, the live Section P shrimp checklist, the domain `DESIGN.md`, the current reference/form package, research ledger, legacy-import candidates, and the directly related Northern-shrimp, generic shrimp/prawn, Argentine-red-shrimp, black-tiger-shrimp, and shrimp-powder proposals.
- Parsed current reference, form, legacy, ledger, and manifest data. Checked candidate display/alias terms and proposed IDs against active owners; found no exact owner or ID collision.
- Reproduced the phrase-first word matching from `IngredientSearch.kt` with current displays, aliases, and attached form terms; projected the no-alias candidate row only. Confirmed the shared-name singleton behavior and that the broad `shrimp` / `crevette` queries remain multi-result.
- Scanned all 114 manifest-listed recipe files and all 1,123 ingredient rows for the candidate, its taxonomic names, and broad shrimp/prawn/crevette terms; found zero hits.
- Checked the proposal-local source-ID prefix against the current ledger and proposal/batch archive before drafting. No app, Gradle, instrumentation, emulator, catalog, ledger, recipe, plan, roadmap, code, or generated-file changes were made.
- Static projection and file review only; no application tests were run for this proposal.
