# WP03 Section F: unqualified farro boundary review

## Packet record

- **Review date:** 2026-10-11
- **Status:** reviewed and integrated as a held candidate update; current evidence recheck for the open Section F farro item
- **Candidate:** `ingredient-ref-farro`, still `needs_clarification` in the research ledger
- **Question:** whether Canadian/Québec usage supports one culinary identity for unqualified `farro`, including a stable French display, species scope, and grain/flour/product state.

## Recommendation

**Keep unqualified `farro` unresolved. Do not add an active reference, alias, form, recipe link, measurement, conversion, yield, or substitution.** The evidence supports several source-qualified mappings, but not one global culinary identity:

- OQLF accepts *farro* in Québec French in its entry for emmer (*Triticum dicoccum*), with *amidonnier* as the preferred French term.
- TERMIUM's food-industry entry describes farro across einkorn, emmer, and spelt.
- Current Canadian sources use farro for emmer grain and emmer flour, while a current Metro Québec listing calls pearled spelt *farro d’épeautre perlé*. A Montréal pasta listing also describes pasta made from spelt (*farro*) flour.
- Farro-labeled products include distinct whole, pearled, semi-pearled, cracked, and milled contexts. Bare `farro` therefore does not specify species or product state.

Keep source wording with its explicit species and product qualifiers. If a recipe or package explicitly says *emmer wheat berries*, *emmer flour*, *pearled spelt*, or another qualified product, map only that full product context to its separate identity. Do not promote `farro` / `farro grain` / `farro flour`, `farro` as an emmer alias, or French `farro` as an emmer alias: the Canadian spelt use makes both language fields ambiguous.

**No proposed JSON:** a generic row or alias would collapse demonstrated species and product-state differences. No recipe currently needs one.

## Current package audit

Snapshot paths audited:

- `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`
- `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json`
- `app/src/main/assets/seed/bundled-library/manifest.v1.json` and every listed recipe file under `app/src/main/assets/seed/bundled-library/recipes/`
- `docs/catalog/legacy-import-identities.v1.json`
- `docs/catalog/research-ledger.v1.json`
- `docs/catalog/proposals/` (including prior farro packets listed below)

| Audit | Current result |
| --- | --- |
| Active package | 1,030 ingredient references, 72 ingredient forms, and 114 manifest-listed recipes. No active reference or form names `farro`. |
| Nearby active identities | `ingredient-ref-emmer-grain` (`emmer wheat / blé amidonnier`), `ingredient-ref-emmer-flour` (`emmer flour / farine d'amidonnier`), `ingredient-ref-spelt-flour` (`spelt flour / farine d'épeautre`), and `ingredient-ref-einkorn-flour` (`einkorn flour / farine de petit épeautre`) each have empty alias lists and null default density. Wheat berries, wheat meal, whole-wheat flour, and durum semolina remain separate. |
| Exact normalized-key collisions | Checked reference names and aliases plus form labels and match terms for `farro`, `farro grain(s)`, `farro flour`, `farro en grain(s)`, `grains de farro`, `farine de farro`, `farro d’épeautre perlé`, `farro verde`, and `green farro`. None collides with an active key. This lexical result does not resolve identity. |
| Forms | No form label or match term refers to farro or the neighboring emmer/spelt/einkorn terms. |
| Legacy imports | `docs/catalog/legacy-import-identities.v1.json` has 75 candidates; no farro, emmer, spelt, einkorn, engrain, or amidonnier candidate. |
| Research ledger | `ingredient-ref-farro` is a `candidate`, `identityState: needs_clarification`, with measurement and substitution research still `not_yet_researched`; it has 14 sources and 3 decisions. No ledger edit is made here. |
| Recipe demand | Parsed all 114 manifest-listed recipe JSON files (1,123 ingredient rows). Case- and accent-folded phrase scan of full recipe text and ingredient rows for `farro`, `emmer`, `spelt`, `einkorn`, `épeautre`, `petit épeautre`, `amidonnier`, and `engrain` found zero files and zero ingredient rows. No link or relink is proposed. |
| Existing proposal coverage | Prior packets already hold this scope: `wp02-wp03-farro-grain-flour-boundary-20261010.md` and `wp02-wp03-farro-canadian-product-label-delta-20261010.md`. The present packet is a focused source recheck and current-package audit, not a new identity claim or checklist closure. |

This review does not run app picker or emulator checks; no active picker entry is proposed. The source and JSON audit is not a runtime search-behavior test.

## Evidence and boundary

OQLF's entry for *amidonnier* identifies *Triticum dicoccum*, lists *farro* among Québec French preferred terms, and gives English *emmer*, *emmer wheat*, and *farro*. It explicitly says the Italian borrowing is accepted in French in Québec and elsewhere. This supports a Québec emmer sense, but it does not establish a product form or exclusive meaning for all farro uses [FARRO-RECHECK-S01].

TERMIUM's food-industry record calls farro an ethnobotanical concept and lists three hulled wheat species: einkorn (*Triticum monococcum*), emmer (*T. dicoccon*), and spelt (*T. spelta*) [FARRO-RECHECK-S02]. The Canadian Department of National Defence's cereal-grain food-quality specification is internally broad: it first describes farro as emmer, then explicitly notes that einkorn, emmer, and spelt can all be called farro. It also discusses whole, pearled, semi-pearled, cracked, and semolina contexts [FARRO-RECHECK-S03]. This procurement reference documents naming and product variation; it is not treated as a universal species standard.

Current Canadian product evidence shows the conflict at the product level:

- The Source Bulk Foods Canada lists *Farro Organic* in its grain category, states product origin Canada, and declares `Farro Grain (Emmer)`. This qualifies that product as emmer grain only [FARRO-RECHECK-S04].
- Metro Québec lists Bob’s Red Mill *Farro d’épeautre perlé biologique*; its ingredient line renders *ÉPEAUTRE PERL BIOLOGIQUE*. The English listing is *Organic Pearl Spelt Farro Side Dish* and gives *ORGANIC PEARLED FARRO* as the ingredient. This supports the named pearled-spelt product; the English “side dish” title alone does not prove that it is cooked or ready to eat [FARRO-RECHECK-S05].
- A Montréal retailer describes Castel’Oro casarecce pasta as made with “100% ... spelt (farro) flour.” This is a prepared pasta product whose flour ingredient is qualified as spelt; it is not evidence for generic farro flour [FARRO-RECHECK-S06].
- True Grain, a BC mill, sells sifted and whole emmer flour products and describes “Emmer (or Farro).” This is direct maker wording on emmer-flour product pages, but it remains scoped to those emmer products [FARRO-RECHECK-S07].

The Québec name *farro* is therefore attested for emmer by OQLF and used in retail for spelt. English market usage also appears in grain and flour contexts, and a named pasta uses spelt (*farro*) flour. No one display pair or global alias safely covers those usages. The exact French qualifier *d’épeautre perlé* can be retained when quoting the Metro product, but neither that phrase nor bare *farro* becomes an app-wide alias.

## Dispositions

| Proposed treatment | Decision | Basis |
| --- | --- | --- |
| `farro` → emmer grain, emmer flour, spelt, or einkorn alias | **Hold** | OQLF supports an emmer sense; federal terminology and Canadian/Québec product sources also document spelt and wider scope. Grain and flour contexts differ. |
| New generic `farro` / `farro grain` identity | **Hold** | Grain products are documented, but species and pearling/whole/cracked state do not converge. |
| New generic `farro flour` identity | **Hold** | Emmer flour and spelt flour usage exist, but the word does not identify one species or a stable milling scope. |
| French `farro` alias/display for emmer | **Hold** | OQLF supports the emmer sense, but Québec retail uses *farro* for pearled spelt; an unqualified alias is ambiguous in French too. Preserve OQLF's existing *blé amidonnier* display. |
| Forms, quantities, conversions, yields, substitutions | **Do not add** | No generic identity or recipe demand; product-specific grain grades and maker flour advice cannot be generalized. |
| Source-qualified product interpretation | **Accept contextually** | Map only after species and product state are explicit in the package/recipe source. Preserve that exact wording and qualifier. |

## Source register

These source IDs are local to this proposal and do not alter shared ledger IDs. Pages checked 2026-10-11 unless a publication/update date is stated.

- **FARRO-RECHECK-S01 — OQLF, [amidonnier](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10487378/amidonnier), updated 2019.** Identifies *Triticum dicoccum*, accepts *farro* in Québec French, and lists *emmer*, *emmer wheat*, and *farro* as English terms. Supports the emmer terminology sense only.
- **FARRO-RECHECK-S02 — Government of Canada, Translation Bureau, [TERMIUM Plus: farro](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?fchrcrdnm=2&i=&index=enb&lang=fra&sg_kp_wet=215052&srchtxt=EINKORN), Food Industries record, 2022-03-10.** Describes three cultivated hulled-wheat species within the ethnobotanical term. Federal terminology evidence for broad species scope.
- **FARRO-RECHECK-S03 — Department of National Defence, [Food Quality Specifications – Cereal Grain (English), SQA-24-06](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-24-2018-eng.pdf), §§36–39, pp. 4–5 (2018).** Names emmer/farro, records the three-species naming confusion, and discusses multiple grain and semolina contexts. Procurement reference, not adopted as universal taxonomy.
- **FARRO-RECHECK-S04 — The Source Bulk Foods Canada, [Farro Organic](https://www.thesourcebulkfoods.ca/shop/grains/wholegrain-farro/).** Current Canadian retailer listing: grain category, product origin Canada, ingredient `Farro Grain (Emmer)`. Supports this product only.
- **FARRO-RECHECK-S05 — Metro Québec, [Bob’s Red Mill Farro d’épeautre perlé biologique](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/pates-riz-et-feves/quinoa-et-grains-de-specialite/farro-d-epeautre-perle-biologique/p/039978002112), product 039978002112.** French product title is *Farro d’épeautre perlé biologique* and its ingredient line renders *ÉPEAUTRE PERL BIOLOGIQUE*; Metro's English listing calls it *Organic Pearl Spelt Farro Side Dish* and gives *ORGANIC PEARLED FARRO* as the ingredient. Supports the named pearled-spelt product; the title does not establish cooked state.
- **FARRO-RECHECK-S06 — Berchicci, Montréal, [Castel’Oro Casarecce Spelt Pasta](https://store.berchicci.ca/Castel-Oro-Casarecce-Spelt-Pasta-Casteloro).** Product description says the pasta is made with 100% spelt (*farro*) flour. Supports source-specific spelt-flour wording in a pasta product.
- **FARRO-RECHECK-S07 — True Grain, [Organic BC Sifted Emmer Flour](https://www.truegrain.ca/products/organic-bc-sifted-emmer-flour) and [Organic BC Whole Emmer Flour](https://www.truegrain.ca/products/copy-of-organic-bc-whole-einkorn-flour-1).** BC producer pages use “Emmer (or Farro)” on emmer-flour products. Maker wording only; no global alias inferred.
- **FARRO-RECHECK-S08 — The Gourmet Warehouse, [Farro – Emmer & Spelt](https://gourmetwarehouse.ca/farro-emmer-spelt-17-6oz/).** Canadian retailer product description itself combines emmer and spelt under the farro heading. Treat as weaker retailer-level evidence because its page does not provide a formal ingredient declaration.

## Evidence limits and checklist status

Retail names and manufacturer copy apply to specific listed products and can change. The Metro page currently indicates the product is out of stock in the English storefront, even though its page remains listed; availability is not needed for the naming conclusion. The Gourmet Warehouse description is not a package ingredient declaration. TERMIUM and the federal procurement document describe broad/variable naming; only the individually named products establish their own species and state. No reviewed source makes bare `farro` a reliable grain-versus-flour marker.

The open Section F checklist items still include unqualified farro and other unresolved grain products. This recheck does not complete that aggregate. The earlier 2026-10-10 Canadian-product delta already records the shared source set for emmer, spelt, OQLF, TERMIUM, Metro, and Berchicci, so those entries were not duplicated. The Gourmet Warehouse evidence was new to the candidate and is recorded under ledger source ID `WP03-FARRO-BOUNDARY-20261011-S01`.

## Coordinator integration checkpoint

- Kept `ingredient-ref-farro` as a held `candidate` with `identityState: needs_clarification`; no active reference, form, recipe link, or numeric behavior changed.
- Added one distinct Canadian retailer source and an unresolved decision to the existing research-ledger candidate. The ledger now has 1,321 records, 4,299 source entries, and 3,535 distinct source IDs; the live package remains at 1,030 references / 72 forms / 114 recipes / 1,123 ingredient rows.
- Added the focused recheck to the Section F progress list and roadmap. The aggregate farro and Section F items remain open.
- Structural JSON and package validation, ledger-schema, generated-index, encoding, collision/demand, and whitespace checks passed. No tests or emulator were run because this update only adds database JSON evidence under `AGENTS.md`.
- Integration record: [`../batches/wp03-farro-boundary-review-integration-20261011/README.md`](../batches/wp03-farro-boundary-review-integration-20261011/README.md).
