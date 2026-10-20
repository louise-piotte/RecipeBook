# WP02/WP03 farro grain-versus-flour boundary review

- **Review date:** 2026-10-10
- **Status:** proposal only
- **Candidate:** `ingredient-ref-farro` (`needs_clarification` in the research ledger)
- **Question:** whether bare `farro` can be assigned to a grain identity, a flour identity, or an alias of the existing emmer references.

## Recommendation and dispositions

**Hold unqualified `farro` as a global ingredient identity or alias.** The reviewed sources use the term at different species scopes, and current Canadian product examples apply it to grain and flour products. Do not add a `farro` identity or form, and do not relink recipes based on the bare term.

| Candidate use | Disposition | Reason |
| --- | --- | --- |
| Bare `farro` as an alias of `ingredient-ref-emmer-grain` or `ingredient-ref-emmer-flour` | **Held** | OQLF gives `farro` for emmer, but TERMIUM and Canadian food-reference and market sources also use it for spelt and einkorn. OQLF's terminology entry does not resolve product form. |
| Bare `farro` as an alias of `ingredient-ref-spelt-flour` or `ingredient-ref-einkorn-flour` | **Held** | Product-level examples exist for spelt, but do not establish a global species mapping. |
| New generic `farro grain` identity / `farro en grains` display | **Held** | Grain use is well attested, but species scope and Québec French display do not converge. A market or procurement name alone is insufficient to distinguish one grain identity from a broad product class. |
| New generic `farro flour` identity / `farine de farro` display | **Held** | Flour use is documented, but sources do not establish a single species, milling boundary, or standardized Québec French display. Do not infer that farro flour is emmer flour. |
| Source-qualified use that identifies a product or species and its state | **Accepted as contextual evidence only** | Preserve the source wording and map only after a separate review verifies the specific species and product state. This does not authorize a global alias or automatic recipe relink. |
| Relationship to `ingredient-ref-wheat-meal` / `whole wheat meal` | **Held separate** | That row is a sourced whole-kernel milling product named `whole wheat meal / farine de blé entier brute`; none of the farro evidence equates it with wheat meal. |

If future recipe text or a package identifies a specific species and a grain or flour product, review that full phrase against the corresponding active identity. Keep emmer grain, emmer flour, spelt flour, einkorn flour, wheat berries, wheat meal, whole-wheat flour, and durum semolina separate. No measurement, yield, conversion, or substitution claim is made here.

## Evidence and naming analysis

OQLF's Québec terminology entry accepts *farro* in French and lists *farro* among the English terms for *amidonnier* (*Triticum dicoccum*) [FARRO-S01]. TERMIUM's Food Industries entry describes the term as covering three cultivated hulled wheats: einkorn, emmer, and spelt [FARRO-S02]. The Canadian Department of National Defence's bilingual food-quality reference likewise names farro as an Italian name for emmer in one passage, then says that *Triticum monococcum*, *T. dicoccum*, and *T. spelta* are all called *farro* in Italy; it describes whole, semi-pearled, and pearled forms and separately mentions emmer semolina [FARRO-S03]. These sources support the competing names and product contexts, not a single unqualified catalog interpretation.

Current Canadian product wording confirms that ambiguity at the product level. A Metro Québec listing is titled *Farro d'épeautre perlé biologique* and reports the ingredient as pearled spelt [FARRO-S05]. A Montréal retailer describes pasta made with *spelt (farro) flour* [FARRO-S06]. A Canadian farm identifies emmer as also called farro while offering emmer berries and whole-grain and sifted flour selections [FARRO-S07]. These are product-specific usages; they do not establish that all farro is spelt or emmer. In the other direction, the European Commission's protected *Farro di Monteleone di Spoleto* specification explicitly scopes that regional product to *Triticum dicoccum* and includes whole, semi-pearled, cracked, and milled semolina forms [FARRO-S04]. That protected designation is evidence for this named product only.

The current Québec/Canadian wording therefore cannot support one global English/French display pair for bare `farro`. OQLF supports *farro* as a Québec French term, but in its entry for emmer; current Québec retail wording also uses it with *épeautre* (spelt) and a pearled-grain qualifier. Retain *farro* as source wording where it appears, with its supplied species and product qualifiers, pending a specific mapping review.

## Reconciliation with existing work

- The WP03 oat-groats/emmer/freekeh checkpoint integrated `ingredient-ref-emmer-grain` as `emmer wheat / blé amidonnier`, separate from emmer flour, spelt, and einkorn. It left `farro` unresolved because the term can span multiple wheat species. Its ledger candidate cites OQLF, TERMIUM, and a Government of Canada grain-procurement list [WP03-S33, WP03-S71, WP03-S9]. Those IDs are cited here by reference; the proposal-local register below assigns fresh local IDs to the sources used in this review.
- The WP02 emmer-flour checkpoint integrated `emmer flour / farine d'amidonnier` without aliases and left the grain/form boundary open. Its picker verification found that bare `farro` did not return the emmer-flour identity. This packet preserves that boundary.
- The recent wheat-meal review scoped `ingredient-ref-wheat-meal` to `whole wheat meal / farine de blé entier brute` using a whole-kernel milling description and OQLF terminology. It explicitly keeps wheat meal distinct from wheat flour, wheat groats, cracked wheat, and durum semolina. That product and its alternate French alias do not provide a farro identity.
- The WP06 South American cuisine gap sweep has no farro candidate or farro source claim; it provides no evidence for this decision.

## Active catalog, collision, and recipe audit

The live seed snapshot read for this review has 676 active ingredient references and 33 forms. It contains no active `farro` reference and no farro form. Relevant active neighbors are:

| ID | Current English / French display | Catalog boundary retained |
| --- | --- | --- |
| `ingredient-ref-emmer-grain` | `emmer wheat` / `blé amidonnier` | Emmer grain; no `farro` alias. |
| `ingredient-ref-emmer-flour` | `emmer flour` / `farine d'amidonnier` | Emmer flour; no aliases. |
| `ingredient-ref-spelt-flour` | `spelt flour` / `farine d'épeautre` | Spelt flour; no aliases. |
| `ingredient-ref-einkorn-flour` | `einkorn flour` / `farine de petit épeautre` | Einkorn flour; no aliases. |
| `ingredient-ref-wheat-berries` | `wheat berries` / `grains de blé entiers` | Wheat grain reference; not a farro product synonym. |
| `ingredient-ref-wheat-meal` | `whole wheat meal` / `farine de blé entier brute` | Scoped whole-wheat meal milling product. |
| `ingredient-ref-whole-wheat-flour` | `whole-wheat flour` / `farine de blé entier` | Wheat flour; distinct from wheat meal and species-specific flours. |
| `ingredient-ref-durum-semolina` | `durum semolina` / `semoule de blé dur` | Durum milling product. |

A normalized exact-key audit of active names, aliases, form labels, and form match terms found no collision for `farro`, `farro grain`, `farro grains`, `farro flour`, `farro en grain`, `grains de farro`, `farine de farro`, or `farro d'épeautre`. This is a current catalog snapshot check; it is not evidence that the search index has been tested in the app. `docs/catalog/legacy-import-identities.v1.json` has no farro candidate; the separate research-ledger record `ingredient-ref-farro` remains `needs_clarification`.

All 114 manifest-listed recipe files were parsed as UTF-8 JSON. The scan covered the full recipe records and all 1,123 ingredient rows, using case-insensitive, accent-folded phrase checks for `farro`, `emmer`, `spelt`, `einkorn`, `épeautre`, `petit épeautre`, `amidonnier`, and `engrain`. It found zero matching recipe files and zero matching ingredient lines. No recipe is a farro hit, and no recipe relink is proposed.

## Evidence limits

- The terminology sources disagree in scope: OQLF's entry ties *farro* to emmer, while TERMIUM and the federal food reference describe the broader three-species use.
- The federal food-quality document is a bilingual procurement reference, not a comprehensive consumer-label standard or botanical authority. Its product descriptions are not adopted as a universal processing specification.
- Metro, Berchicci, and Living Sky Farms establish only the names and product descriptions on their current listings. Retail listings and producer descriptions do not settle universal synonymy.
- The European Commission source protects one regionally named product; its emmer and semolina scope cannot be generalized to all farro.
- No recipe corpus evidence requires a generic farro identity now. Independent Québec French review of any future scoped display remains open.

## Proposal-local source register

These IDs are local to this packet. They are distinct from prior ledger IDs, including WP03-S33, WP03-S71, and WP03-S9.

- **FARRO-S01 — Office québécois de la langue française (OQLF), [amidonnier](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10487378/amidonnier), 2019.** Preferred French terms include *amidonnier* and *farro*; English terms include *emmer*, *emmer wheat*, and *farro*; the entry identifies *Triticum dicoccum*. Québec terminology evidence for the emmer sense, not flour or grain state.
- **FARRO-S02 — TERMIUM Plus, [farro](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?fchrcrdnm=2&i=&index=enb&lang=fra&sg_kp_wet=215052&srchtxt=EINKORN), Food Industries entry.** Describes *farro* as a term for einkorn (*Triticum monococcum*), emmer (*T. dicoccon*), and spelt (*T. spelta*). Federal terminology evidence for broad species scope; it does not establish a specific flour or grain product.
- **FARRO-S03 — Department of National Defence, [Food Quality Specifications – Cereal Grain (French)](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-24-2018-fra.pdf) and [English](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-24-2018-eng.pdf), SQA-24-06, §§36–40, pp. 4–5.** Names emmer and farro, discusses whole/semi-pearled/pearled products, notes species confusion among einkorn, emmer, and spelt, and mentions emmer semolina. Canadian food-procurement reference; not adopted as a universal taxonomy or milling standard.
- **FARRO-S04 — European Commission, [Farro di Monteleone di Spoleto protected product specification](https://eur-lex.europa.eu/legal-content/EN/TXT/?toc=OJ:C:2021:269:FULL&uri=uriserv:OJ.C_.2021.269.01.0025.01.ENG), 2021.** Identifies the protected product as a local *Triticum dicoccum* emmer ecotype and describes whole, semi-pearled, cracked, and semolina products. Evidence for this protected regional name and product family only.
- **FARRO-S05 — Metro Québec, [Farro d'épeautre perlé biologique](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/pates-riz-et-feves/quinoa-et-grains-de-specialite/farro-d-epeautre-perle-biologique/p/039978002112), Bob's Red Mill listing, accessed 2026-10-10.** The French title uses *farro d'épeautre perlé* and the ingredient statement says pearled spelt. Current Québec product wording; not a definition of generic farro.
- **FARRO-S06 — Berchicci, Montréal, [Castel’Oro Casarecce Spelt Pasta](https://store.berchicci.ca/Castel-Oro-Casarecce-Spelt-Pasta-Casteloro), accessed 2026-10-10.** Describes the pasta as made with spelt (*farro*) flour. Québec retailer evidence that the borrowed label also appears in a flour-product context; product-specific only.
- **FARRO-S07 — Living Sky Farms, Saskatchewan, [Emmer](https://livingskyfarms.ca/products/emmer), accessed 2026-10-10.** The Canadian farm labels the species emmer (also called farro) and offers emmer berries, whole-grain flour, and sifted flour as separate product selections. Producer terminology evidence for an emmer/farro market synonym and explicit form distinctions; not a universal definition.

## Coordinator disposition — 2026-10-10

The source review was independently checked and the recommendation is accepted: unqualified `farro` remains unresolved across species and grain/flour product states. It is not an alias of emmer, spelt, or einkorn, and no generic farro row or recipe relink was added. New evidence and the unresolved decision are recorded on the existing `ingredient-ref-farro` ledger candidate.
