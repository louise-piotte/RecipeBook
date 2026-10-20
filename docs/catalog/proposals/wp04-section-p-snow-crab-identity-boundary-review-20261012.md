# WP04 Section P — snow crab / crabe des neiges identity boundary review

- **Review date:** 2026-10-12
- **Status:** Documentation-only hold integrated on 2026-10-12; no shared catalog or ledger data changed.
- **Scope:** Test whether Québec’s species-specific `snow crab / crabe des neiges` identity can be represented as a single shared picker result, including exact owners, prior reviews, Québec and Canadian naming, product scope, recipe demand, measurements, and substitutions.
- **Recommendation:** Keep *Chionoecetes opilio* unallocated in the shared picker for now. Québec terminology and fishery sources support a high-value local identity, but the CFIA Fish List uses the same English and French names for several *Chionoecetes* species. The catalog has no locale-scoped search term or product-label context, so a single result could assign a different Canadian product to *C. opilio*.

## Decision and boundary

The prospective key checked in this review was `ingredient-ref-snow-crab`. Do not add it, its names, or a ledger candidate yet. OQLF normalizes `crabe des neiges` for Québec consumer fish-product labeling and maps it to *C. opilio*; MAPAQ and DFO also identify *C. opilio* as the Québec/Atlantic snow crab. Current Québec retail evidence uses the same consumer name for cooked-frozen sections. This is strong evidence for the Québec meaning.

The national naming boundary remains unresolved. CFIA says its Fish List contains English and French names acceptable for fish labeling in Canada. Its crab lookup lists `Snow Crab` for *C. angulatus*, *C. japonicus*, and *C. opilio*. It lists `Crabe des neiges` for *C. angulatus*, *C. bairdi*, *C. japonicus*, *C. opilio*, and *C. tanneri*. The CFIA list does not prove that every species is sold in Québec under those names; it does establish that these unqualified names do not uniquely identify *C. opilio* across the Canadian label system. Since the shared picker cannot scope a name to Québec or show a taxonomic qualification, activating one row would present that contested mapping as universal.

Reopen this boundary if a product-specific Québec source consistently uses a taxon-qualified consumer label, the picker can represent locale-scoped naming, or a recipe requires an identifiable snow-crab product. The generic crab hold remains separate: this review adds a species-name boundary and does not propose a whole-crab or generic `crab / crabe` row.

## Prior archive and current owners

The main Section P checklist keeps the parent `Shrimp/prawn by meaningful preparation; crab and crayfish` item open. Its generic-crab subreview is complete and holds a second, unqualified whole-crab row beyond the active crab-meat identity. The [generic crab proposal](wp04-section-p-generic-crab-identity-boundary-review-20261012.md) already cites OQLF’s snow-crab terminology as one species example; it does not allocate a snow-crab reference or review the cross-taxon CFIA collisions as a dedicated picker boundary. This proposal does not reopen that generic decision.

| Candidate phrase or record | Exact active owner | Finding |
|---|---|---|
| `snow crab`, `crabe des neiges`, *Chionoecetes opilio*, `ingredient-ref-snow-crab` | None in references, forms, legacy candidates, or ledger record IDs/text | No exact normalized row, form, legacy candidate, or source-bounded candidate exists. |
| `crab meat / chair de crabe` | `ingredient-ref-crab` | Verified species-unspecified crab-meat identity; aliases are empty, density is null, and unit mappings are empty. It is not whole crab or a snow-crab identity. |
| `jumbo lump crab meat / chair de crabe en gros morceaux (jumbo lump)` | `ingredient-form-crab-jumbo-lump` under `ingredient-ref-crab` | Verified commercial grade form. Its notes state that no measure, density, conversion, or substitution is established. |

The two crab ledger records have `measurementState` and `substitutionResearchState` set to `not_yet_researched`; their four reference sources and two form sources do not establish a snow-crab identity. No snow-crab phrase or taxon occurs in the live ledger. The existing [generic crab hold integration](../batches/wp04-section-p-generic-crab-hold-integration-20261012/README.md) preserves those crab-meat records and is not changed here.

## Search and picker projection

The projection follows the current phrase-first search behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete word phrases are returned before partial matches. A hypothetical row would have only the bilingual display names `snow crab / crabe des neiges`, with no aliases. It was not inserted into a test catalog or UI.

| Query | Current projected result | If the hypothetical row were activated |
|---|---|---|
| `snow crab` | No result | `ingredient-ref-snow-crab` only, although CFIA accepts the same English name for multiple taxa. |
| `crabe des neiges` | No result | `ingredient-ref-snow-crab` only, although CFIA accepts the same French name for multiple taxa. |
| `crab` / `crabe` | `ingredient-ref-crab` through the complete word in `crab meat / chair de crabe` | Both crab meat and snow crab; the broad query would add a species-specific result beside the edible-meat result. |
| `crab meat` | `ingredient-ref-crab` | `ingredient-ref-crab` only. |
| `snow` | `ingredient-ref-snow-fungus` | Snow fungus and snow crab. |

The exact snow-crab query is the main concern: it would return one species row despite the Canadian name collision. Broad `crab / crabe` searches would also become less specific without any recipe demand for the species.

## Recipe demand

The live manifest contains 114 recipe paths and 1,123 ingredient rows. I searched every manifest-listed recipe file and each ingredient’s name, original text, reference ID, and form ID for `snow crab`, `crabe des neiges`, and *Chionoecetes opilio*. There are zero file-text hits and zero ingredient-line hits.

The only ingredient row with crab wording is recipe `019#8`: `1 lb jumbo lump crab meat`, linked to `ingredient-ref-crab` and `ingredient-form-crab-jumbo-lump`. The title `Crab Balls`, preparation text, and group label describe the dish; they do not ask for snow crab. No recipe link or relink is supported.

## Product states, measures, and substitutions

Québec product evidence confirms distinct formats, not a single kitchen form. MAPAQ’s *Les crustacés du Québec* sheet says whole snow crab is sold live, fresh, or frozen raw/cooked; its frozen sections are sold by size grades and commercial case weights; it also lists shelled leg meat, leg/salad-meat combinations, other meat mixes, and canned formats. Those package sizes and the nutrition panel’s 100 g cooked-meat basis describe commercial products or nutrition reporting, not a recipe portion, edible-yield conversion, or standard measure. The sheet is an official Québec product reference but gives no publication date, so it is not treated as a current retailer inventory source.

Mayrand currently lists SKU 53044 as `Section de crabe des neiges cuit et congelé`, approximately 1 kg per unit. That is one Québec retailer product state and approximate sale unit; availability and package weight can change. DFO’s biological crab weights and dimensions likewise do not establish a cooking measure or meat yield. No snow-crab reference, form, measurement, density, or unit mapping exists in the package. Do not infer a conversion from whole crab or sections to picked meat.

The active global and contextual substitution-rule files are empty. The existing Jumbo Lump form explicitly says no substitution is established, and neither the ledger nor the recipe corpus supplies snow-crab substitution evidence. Do not add a global form conversion or a contextual ingredient substitution between snow crab, generic crab meat, lobster, or another seafood.

## Live package and corpus snapshot

Snapshot read from the worktree on **2026-10-12**. File hashes cover exact bytes. The recipe-corpus digest processes manifest paths in manifest order, hashing each relative path, a NUL byte, exact recipe-file bytes, and another NUL byte.

| Artifact | Count / size | SHA-256 or corpus digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,324 references; 423,934 bytes | `6b4a1e34d8b7e8b75fdaf48c1bbf27c6ca1ce6562a75dc958a00d1b9e5014a7d` |
| `ingredient-forms.v1.json` | 98 forms; 73,589 bytes | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates; 15,264 bytes | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,632 records; 6,017 source entries; 5,033 distinct source IDs; 8 unit conversions; 5,975,018 bytes | `b959f36a409e902795dfc8f5322cfbce667e7e7c0030eecef6c6c49ca3298d0d` |
| `manifest.v1.json` | 114 paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,792 recipe bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| `substitution-rules.v1.json` | 0 rules; 3 bytes | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| `contextual-substitution-rules.v1.json` | 0 rules; 3 bytes | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| Generated `BundledIngredientCatalog.kt` | 1,324 reference entries; 580,316 bytes | `d2f206e8499e985c8195a76ce1d38cd39de4f9781f283f5d5fc05f485f4472ba` |

## Sources

Sources were accessed on 2026-10-12. The proposal-local IDs use the unique prefix `WP04-SECTIONP-SNOW-CRAB-20261012`; the prefix and candidate path were absent before this file was created.

| Source ID | Source and scope | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-SNOW-CRAB-20261012-S01** | Office québécois de la langue française, [crabe des neiges (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198901/crabe-des-neiges), updated 2012 | Normalizes `crabe des neiges` for Québec consumer fish-product labeling and maps it to *Chionoecetes opilio*; lists `snow crab` and `queen crab` in English. This is Québec terminology, not a Canadian-wide unique common-name mapping. |
| **WP04-SECTIONP-SNOW-CRAB-20261012-S02** | CFIA, [Fish List lookup for “crab”](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=crab) | The returned taxon/name rows show `Snow Crab` and `Crabe des neiges` across multiple *Chionoecetes* species. The lookup establishes label-name scope, not actual retail supply of every listed species in Québec. |
| **WP04-SECTIONP-SNOW-CRAB-20261012-S03** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Defines the Fish List as the source for English/French names acceptable for Canadian fish labels and corresponding scientific names. The overview page is dated 2019; the lookup result is a name-boundary reference, not a real-time market survey. |
| **WP04-SECTIONP-SNOW-CRAB-20261012-S04** | Fisheries and Oceans Canada, [Crabe des neiges (*Chionoecetes opilio*)](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/snow-crab-crabe-neiges-atl-fra.html), modified 2025-07-04 | Confirms the Atlantic *C. opilio* species scope, range in eastern Canada, and the Québec fishery. Biological body sizes and weights are not culinary measures or edible-yield data. |
| **WP04-SECTIONP-SNOW-CRAB-20261012-S05** | MAPAQ, [Les crustacés du Québec (PDF)](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/peche/FI_crustaces-quebec_MAPAQ.pdf), publication date not stated | Identifies Québec snow crab as *C. opilio* and describes processor product formats, size grades, and pack sizes. These are industry-format observations; the publication is undated and its quantities do not establish kitchen measures. |
| **WP04-SECTIONP-SNOW-CRAB-20261012-S06** | Gouvernement du Québec, [Portrait de la pêche commerciale](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/peches-aquaculture-commerciales/portraits-peche-aquaculture-commerciales/portrait-peche-commerciale), data 2024 | Identifies snow crab and lobster as Québec’s most-landed species over several years and lists snow crab among major seafood exports. Supports local market importance, not a unique Canadian label or recipe use. |
| **WP04-SECTIONP-SNOW-CRAB-20261012-S07** | Mayrand, [Section de crabe des neiges cuit et congelé, SKU 53044](https://mayrand.ca/fr/nos-produits/poissonnerie/fruit-de-mer/crabe/crabe-des-neiges-section-cg-53044) | Current Québec retailer listing uses the consumer name for cooked-frozen sections at approximately 1 kg per unit. Inventory and approximate unit weight are retailer- and date-specific; the page does not identify a scientific taxon. |

## Static review checks

- Confirmed the proposed file path did not exist before writing and the source prefix did not occur in the ledger, existing proposals, batches, or other searched repository files.
- Compared normalized candidate names and the proposed ID against active reference IDs, displays and aliases; form IDs, labels and match terms; legacy candidate fields; and ledger IDs and text. No exact owner or held ledger candidate was found.
- Checked the generic-crab proposal and integration archive. The existing `ingredient-ref-crab` and Jumbo Lump form remain the only crab ingredient owners; no snow-crab-specific allocation is archived.
- Recomputed the phrase-first search projection from the active references and forms and scanned all 114 manifest-listed recipe files and 1,123 ingredient rows. Exact snow-crab/taxon demand is zero; recipe `019#8` remains linked to crab meat and its Jumbo Lump form.
- Recomputed the package snapshot and hashes above. No catalog or ledger data changed; no app, unit, instrumentation, or emulator tests were run for this documentation-only hold.

## Integration status

Root integrated the hold in the [snow-crab picker-hold batch README](../batches/wp04-section-p-snow-crab-picker-hold-integration-20261012/README.md) and updated the Section P checklist/history and roadmap. The source register and package snapshot above remain unchanged. No database JSON data was added, so no tests were needed. The scoped whitespace check `git diff --check -- docs/catalog/proposals/wp04-section-p-snow-crab-identity-boundary-review-20261012.md` passed after this reconciliation.
