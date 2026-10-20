# WP04 Section P — human-food dried-mussel boundary review (R207)

- **Packet type:** Proposal-only shellfish product-identity, naming, picker, recipe-demand, numeric-evidence, and substitution review.
- **Recommendation:** Hold the general human-food **dried mussels / moules séchées** candidate outside active references, forms, legacy mappings, and the research ledger. The current evidence establishes one Toronto retailer's Thai dried-mussel SKU, but not a stable, species-neutral bilingual product identity or the product's salting and drying details. Keep the existing generic mussel candidate unresolved.
- **Changes made:** This packet only. No catalog, ledger, recipe, plan, or roadmap file was changed.

## Scope and prior-work audit

The WP04 Section P checklist still marks “Mussel, clam, oyster, cockle, and remaining shellfish identities” open at [the live plan item](../../RecipeBook-global-ingredient-catalog-plan.txt#L5937). This packet reviews one remaining mussel product state: human-food mussels sold dried. It does not reopen the species identities for blue, green-lipped, or Mediterranean mussels, or the accepted smoked-mussel, brined-mussel, and canned-escabeche product groups. It is also separate from dried oyster, dried scallop, and dried shrimp.

A focused exact-phrase audit across the active plan, proposals, batches, references, forms, legacy-import candidates, and research ledger found no prior `dried mussel`, `dried mussels`, `moule séchée`, or `moules séchées` identity or focused hold. The broad Section P shellfish gap is open, but the adjacent mussel decisions have already been made:

| Existing owner or boundary | Current state | R207 treatment |
|---|---|---|
| `ingredient-ref-mussel` | Unresolved ledger candidate; no active catalog row. Its prior decision keeps unqualified `mussel / moule` unallocated. | Leave unchanged; do not infer a species or promote the generic candidate. |
| `ingredient-ref-blue-mussel`, `ingredient-ref-green-lipped-mussel`, `ingredient-ref-mediterranean-mussel` | Active species-scoped references. OQLF's `moule` entry associates that Québec commercial name with *Mytilus edulis*; the other active rows retain their own qualified names. | Do not attach a dried product to one of these identities without species evidence. |
| `ingredient-ref-smoked-mussels`, `ingredient-ref-mussels-in-brine`, `ingredient-ref-mussels-in-escabeche` | Active named prepared-product groups, separate from the species rows. | Keep drying distinct from smoke, brine, and escabeche. Do not add a universal dried form to those rows. |
| Dried seafood references | Dried oyster, dried scallop, and dried shrimp are separately represented; no dried-mussel reference or mussel form exists. | Do not infer shared forms, measures, yields, or substitutions from those other products. |
| Substitution rules | The active global and contextual rule files contain no mussel/moule substitution. | Add none. |

The exact-phrase archive search found no focused prior dried-mussel review. The latest adjacent decisions are smoked mussels (R159), canned mussels in escabeche (R194), and mussels in brine (R197); each addresses a different product descriptor and remains intact.

## Current market and classification evidence

Shing Hing Food, a Toronto retailer, currently lists **Thai Dried Mussels 454g**, SKU OY1504, as in stock and offers shipping within Canada. Its page describes the product as food for stewing soup, porridge, and steaming and says to keep it refrigerated. It does not give a Latin name, ingredient declaration, salt content, drying process, piece count, nutrition serving, or drained/rehydrated quantity. The listing is direct evidence for that retailer's specific human-food SKU; it does not establish that all dried-mussel products share its origin, species, storage, or preparation. [S01]

Statistics Canada's NAPCS Canada 2022 class 1711131, “Cured fish, shellfish and crustaceans,” includes **dried salted mussels** as an example. The French page for the same class uses **moules séchées salées**. This establishes a recognized Canadian classification for dried salted mussels, but it is not a consumer-label standard and does not show that Shing Hing's Thai SKU is salted. It also does not establish the unqualified Québec retail phrase `moules séchées`. [S02; reused source `WP04-SECTIONP-MUSSELS-BRINE-R197-20261016-S07`]

The CFIA's fish-product labelling guidance treats condition descriptors such as dried, salted, and smoked, along with packing medium, as separate descriptions that may be needed to identify a product's true nature. It supports keeping those boundaries explicit; it does not make a generic “dried” descriptor a species form or establish the identity of the listed SKU. [Reused source `WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S07`]

A scoped search of current Québec retailer/product pages for `moules séchées`, `moules séchées salées`, and the exact Thai SKU wording did not surface a Québec human-food listing. This is a search result for this pass, not proof that no Québec product exists. OQLF's existing `moule` entry supplies Québec terminology for *M. edulis* but does not name a generic dried-mussel product; that species-scoped entry cannot fill the missing product-language evidence. [Reused source `WP04-MOLLUSKS-20261009-S06`]

## Candidate disposition

| Question | Finding and limit |
|---|---|
| **Exact identity** | No active reference, attached form, legacy mapping, or ledger product record owns dried mussels. The one direct food listing says “Thai Dried Mussels,” but gives no species and no product details to decide whether it is salted or what drying process was used. “Thai” is a supplier/product qualifier, not evidence for a Thai mussel taxon or a reusable alias. |
| **Bilingual name** | `Dried salted mussels / moules séchées salées` is the exact bilingual classification example, but the SKU's salt state is unknown. `Dried mussels / moules séchées` is a possible descriptive research label only; no current Québec consumer listing or OQLF entry located in this pass verifies it as the market name for this product group. Add neither as a catalog name or alias now. |
| **Picker effect if later represented as `dried mussels / moules séchées`, without aliases or forms** | Both complete phrases currently return no result and would return this row alone. Existing plural `mussels` and `moules` searches each return five rows (blue and Mediterranean mussels, smoked mussels, mussels in brine, and canned mussels in escabeche); each would expand to six. Singular `mussel` and `moule` searches each return the three species-scoped rows and would remain unchanged if no singular alias were added. Do not add `Thai dried mussels` as an alias: it would make one retailer's SKU qualifier look general. |
| **Recipe demand** | A manifest-ordered scan of all 114 bundled recipe files and 1,123 structured ingredient rows found zero hits for `dried mussel(s)`, `moules séchées`, or `Thai dried mussels`, and zero mussel/moule ingredient rows. No recipe link is supported. Corpus digest: `0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143`. [R01] |
| **Numeric evidence** | The listing's 454 g is one package declaration. It is not a serving, piece count, recipe amount, drained amount, or reusable measure. No density, count-to-mass mapping, drying loss, rehydration ratio, cooking yield, or conversion is supported. Its refrigeration instruction also prevents treating the word “dried” as evidence of shelf stability. |
| **Substitutions** | Add no rule between dried and fresh mussels, between dried mussels and dried shrimp/scallop/oyster/sea cucumber, or between a mussel product and another shellfish. No reviewed source supplies a recipe-specific amount and preparation adjustment; sharing a species family or preservation label does not establish interchangeability. |

## Reopen conditions

Reopen only when current Canadian or Québec human-food evidence identifies a repeatable product group and supports the state needed for its name: at minimum, whether it is salted, what “dried” means for the product, and whether species can be stated or must remain unspecified. A Québec bilingual package or local retailer/manufacturer listing should establish the French market wording; the classification phrase `moules séchées salées` should be used only for products shown to meet that narrower state.

If those conditions are met, first decide whether the evidence supports a separate species-neutral finished-product reference or a form attached to a sourced mussel identity. Preserve the generic `ingredient-ref-mussel` hold, keep freeze-dried pet treats and supplements outside human-food ingredient search, and do not assign a recipe link unless a bundled ingredient line explicitly requests the product. Reopen measures or substitutions only with product-matched package/recipe evidence that establishes edible weight, count, rehydration, yield, or a dish-specific replacement amount.

## Sources and source-ID reuse audit

| ID | Source | Use and limit |
|---|---|---|
| `WP04-SECTIONP-DRIED-MUSSELS-R207-20261016-S01` | Shing Hing Food, [Thai Dried Mussels 454g](https://www.shinghingfood.com/collections/dried-oyster/products/thai-dried-mussels-454g) | Current Toronto retailer listing; in-stock status, SKU, 454 g package, cooking-use text, and refrigeration instruction. No binomial, salt declaration, process, or consumer French label. |
| `WP04-SECTIONP-DRIED-MUSSELS-R207-20261016-S02` | Statistics Canada, [NAPCS Canada 2022 class 1711131 examples](https://www23.statcan.gc.ca/imdb/p3VD.pl?CLV=4&CPV=1711131&CST=17022022&CVD=1386659&Function=getAllExample&MLV=4&TVD=1384502&V=447109&VST=17022022) | English example `dried salted mussels`; classification evidence, not SKU-level composition or consumer-label evidence. This exact English endpoint was not found in the existing ledger/archive; R197 S06 uses a different page URL for the same class's brine example. |
| `WP04-SECTIONP-MUSSELS-BRINE-R197-20261016-S07` (**reused**) | Statistics Canada, [SCPAN Canada 2022, French examples for class 17111310](https://www23.statcan.gc.ca/imdb/p3VD_f.pl?CLV=5&CPV=17111310&CST=17022022&CVD=1582206&Function=getAllExample&MLV=5&TVD=1582195&V=487859&VST=17022022) | The exact URL is already in the ledger for the R197 brine decision; the page also supplies `moules séchées salées` for this review. No new source ID is assigned. |
| `WP04-MOLLUSKS-20261009-S06` (**reused**) | OQLF, [moule (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198877/moule) | Québec common-name and species scope for *Mytilus edulis*; not a generic dried-product name. This exact URL already appears in the ledger and several WP04 proposals. |
| `WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S07` (**reused**) | CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish) | Separate form, packing-medium, and condition descriptors. This exact URL is already in the ledger under R159 and other reviews; no new source ID is assigned. |
| `WP04-SECTIONP-DRIED-MUSSELS-R207-20261016-R01` | Bundled-library manifest-ordered ingredient scan; 2026-10-16; digest above. | Internal corpus check, not an external source. The scan read all 114 manifest recipe files and 1,123 structured ingredient rows. |

**URL reuse audit:** Exact-URL search found no prior use of S01 or the English NAPCS endpoint in the plan, proposal/batch archive, or research ledger. The French NAPCS endpoint is reused as R197 S07; the OQLF URL as WP04-MOLLUSKS-20261009-S06 (among later reuses); and the CFIA URL as R159 S07 (among later reuses). No existing source ID was reassigned, and no ledger entry was created.

**Disposition:** Keep human-food dried mussels unallocated for now. Preserve the exact generic-mussel, species, smoked, brined, and escabeche boundaries; add no reference, alias, form, ledger candidate, measure, recipe link, conversion, yield, or substitution. This proposal-only documentation change required no software tests.
