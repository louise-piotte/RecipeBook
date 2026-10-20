# WP03 Section N proposal: button, cremini, and portobello mushrooms

- **Reviewed:** 2026-10-09
- **Status:** proposal only. This task creates this packet only. No seed data, recipes, catalog ledger, plan, roadmap, code, tests, or existing proposal packet was changed.
- **Scope:** the open Section N terms button, cremini, and portobello, including Québec French naming, shared species, market distinctions, and search collisions.
- **Plan state:** open. The current plan still lists “Button, cremini, portobello, unqualified shimeji, and porcini.” This packet does not close that checklist item.
- **Excluded:** forms, recipe interpretations or relinks, measures, yields, conversions, substitutions, and additions to the shared research ledger.

## Recommendation

Treat these as **market-product names within one species**, not three species. Québec terminology and Canadian sources identify all three in *Agaricus bisporus*. When the app needs these product distinctions, keep cremini and portobello as separate culinary identities: cremini names the brown/café product, while portobello names the larger, more mature product. Do not alias either to the other, to the species name, or to a broad Agaricus term.

Keep the unqualified **button mushroom** assignment held. The OQLF uses *button mushroom* as an English term for the broader *champignon de Paris* entry, which it says can be white or café-coloured. Canadian agricultural classification also uses the qualified *white button mushroom* for white Agaricus. These sources do not settle whether this checklist’s bare “button” means white button specifically or the broader cultivated mushroom. If a later review chooses the white product, it should make that scope explicit and review *champignon blanc* as a fr-CA display; do not silently equate the bare term with the broad French terms *champignon de Paris* or *champignon de couche*.

| Open term | Disposition | Candidate display if accepted | Name/alias boundary |
|---|---|---|---|
| Button | **Hold unqualified term pending scope decision.** It may mean white button in Canadian production categories, but OQLF’s English term is broader. | If narrowed to white button: `white button mushroom` / `champignon blanc` (the French display is a candidate from Statistics Canada terminology, not an OQLF preferred-term ruling). | Do not use `button mushroom`, `cultivated mushroom`, `champignon de Paris`, or `champignon de couche` as a white-only alias while the broader OQLF sense remains unresolved. A search for `button mushroom` would also match the phrase inside a proposed `white button mushroom` display under the app’s phrase search, so accepting that narrower row would make an explicit scope choice. |
| Cremini | **Propose a distinct market-product identity.** | `cremini mushroom` / `cremini` | `crimini` is a supported spelling variant. Keep `champignon café` unassigned as a global alias: it can describe the broader brown/café Agaricus product, including the mature portobello description. |
| Portobello | **Propose a distinct market-product identity**, separate from cremini. | `portobello mushroom` / `champignon portobello` | OQLF documents `portobella`, `portabella`, and `portabello`, with or without the generic mushroom noun. Keep these spellings on the portobello identity only. |

Candidate IDs, if the owner proceeds, are `ingredient-ref-button-mushroom` (held until scope is resolved), `ingredient-ref-cremini-mushroom`, and `ingredient-ref-portobello-mushroom`. None currently exists in active references, legacy candidates, or ledger record IDs. The two recommended rows would be culinary market-product identities; their shared species is evidence, not an alias or a separate scientific taxonomy field. The current mushroom category `VEGETABLE_AND_AROMATIC` is a catalog classification, not a claim that fungi are botanically vegetables.

## Evidence and limits

The OQLF entry for *champignon de Paris* identifies *Agaricus bisporus*, says the mushroom may be white or café-coloured, and lists *button mushroom*, *cremini*, and *portobello mushroom* among related English terms. Its note says cremini/crimini names the café-coloured product and that portobello is the café mushroom at a more advanced maturity and larger size. The Government of Québec’s French and English pages likewise name *champignons de Paris*, *champignons café*, and *champignons portabellas* / white, cremini, and portobello under *Agaricus bisporus*.

Canadian sources support keeping the display products distinct without turning them into species. CFIA lists button/de couche, cremini, and portabella under *A. bisporus*. Statistics Canada’s survey terminology separates white Agaricus (including white button) from brown Agaricus, while listing cremini/crimini and portobello/portabella within brown Agaricus. Statistics Canada also warns that its survey sometimes combines varieties into a category; that grouping is not evidence that the names are interchangeable. A federal food-procurement specification distinguishes White Button, Café (cremini), and Portobello product descriptions. It describes white buttons across a size range and notes that mature white mushrooms can have open veils and darker caps, so “button” is not a reliable fixed size or maturity stage.

These sources do **not** establish a universal harvest-stage boundary for every button or cremini product. Only the portobello-to-café-mushroom maturity relationship is stated directly by OQLF. Do not infer a strict three-step maturation model, a conversion between these names, or any preparation or cooking rule.

## Live catalog and recipe audit

Counts and digests below were recomputed from exact bytes in the working tree on 2026-10-09. File SHA-256 covers each whole file. The recipe-corpus digest hashes each manifest-relative path, a NUL byte, the exact bytes of that recipe, and another NUL byte, in manifest order.

| Artifact | Live count or state | SHA-256 or digest |
|---|---:|---|
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 643 references | `e983262f70b8195e83b50eb1b4a205ec0adab7eb3c193e1c31b8fba8f2e6ca18` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 33 forms | `275f21eda9369a4c08a869aad3952ebbe2e9e64664ccf0b48af2bb7034928732` |
| `docs/catalog/legacy-import-identities.v1.json` | 86 candidates | `7e416c84748a1d83bd29e05962dbc18cf9b9f4b16f5f572fcddb7b40667fa5ab` |
| `docs/catalog/research-ledger.v1.json` | 813 records; 1,360 source entries; 1,150 distinct source IDs | `0f3b91d066acb2a4149b13e079deea12dd0235db403865d73fffb2c8ec2749c0` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows | `7b275f9696892e81ee05c247177d4c09a7a92f51d64586882d7599760bc6f22f` |

The exact target IDs and normalized target phrases were checked across the live references, forms, legacy candidates, and ledger record IDs. None is currently active or a legacy candidate. The live generic row remains `ingredient-ref-mushroom` (`mushroom` / `champignons`, with English alias `mushrooms`); the legacy file still has the duplicate generic `ingredient-ref-mushrooms` candidate. Neither is a button, cremini, or portobello identity. No form row matches these names or a related Agaricus state.

All 114 manifest-listed recipes and their 1,123 ingredient rows were scanned. None contains button, cremini/crimini, portobello spellings, *Agaricus bisporus*, or the scoped French candidate phrases in any recipe string. The only nearby ingredient lines remain generic: recipe 037#7, `1 lb white mushrooms, sliced`; 037#12, `extra sauteed mushrooms, to taste`; and 089#3, `1/2 box mushrooms`, all linked to `ingredient-ref-mushroom`. Recipe 100#2 is the separate `ground dried candy cap mushrooms` identity. The white-mushroom wording does not identify button mushrooms, so no named link is inferred.

The phrase audit followed `normalizeIngredientSearchKey`: lowercase, NFKD normalization, folding `œ`/`æ`/`ß` and `&`, removing combining marks, replacing punctuation with spaces, and collapsing whitespace. Exact phrase matching and substring fallback were considered. Collision controls are therefore:

- Keep broad `mushroom`, `champignon`, *Agaricus bisporus*, *champignon de Paris*, and *champignon de couche* separate from the narrower market labels.
- Do not globally map `champignon café` or `champignon brun` to cremini; those terms can span the brown Agaricus market class, and OQLF describes portobello as a more mature café-coloured mushroom.
- Keep `crimini` with cremini and portobello spelling variants with portobello. Do not share aliases across the two identities.
- If button is resolved as white-button, document that this narrows the term and fr-CA display before adding a row. Do not use the generic recipe phrase `white mushrooms` as evidence or link.

The proposal source-ID prefix `WP03-AGARICUS-MARKET-TERMS-20261009-S` was checked against the current catalog documents and ledger IDs before drafting; it was absent. IDs S01–S06 below are unique within this packet and remain proposal-local.

## Source register

Sources were checked on 2026-10-09. These IDs are proposal-local and were not written to the shared ledger.

| Source ID | Source | Supports and limits |
|---|---|---|
| **WP03-AGARICUS-MARKET-TERMS-20261009-S01** | OQLF, [champignon de Paris (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869343/champignon-de-paris). | Québec French preferred terms and context terms; *A. bisporus*; white-or-café scope; cremini/crimini and portobello relationships; portobello spellings and maturity note. Updated 2006. This entry also shows why unqualified *button mushroom* and *champignon de Paris* can be broader than a white-only product. |
| **WP03-AGARICUS-MARKET-TERMS-20261009-S02** | Gouvernement du Québec, [Champignons sauvages et de culture domestique](https://www.quebec.ca/sante/alimentation/salubrite-aliments-prevention-risques/salubrite-aliments-domicile/preparation-aliments-cuisson-securitaires/precautions-manipule-aliments/champignons-sauvages-culture-domestique). | French page names *champignons de Paris*, *champignons café*, and *champignons portabellas* under *Agaricus bisporus*. Updated 2024-11-12. A food-safety page, not a formal identity standard. |
| **WP03-AGARICUS-MARKET-TERMS-20261009-S03** | Gouvernement du Québec, [Wild and domestic mushrooms](https://www.quebec.ca/en/health/nutrition/food-safety-risk-prevention/food-safety/preparing-cooking-food-safely/food-handling-precautions/wild-domestic-mushrooms). | English counterpart names white, cremini, and portobello mushrooms under *A. bisporus*. A food-safety page, not a formal identity standard. |
| **WP03-AGARICUS-MARKET-TERMS-20261009-S04** | CFIA, [D-94-26 mushroom and vegetable import list (English)](https://inspection.canada.ca/en/plant-health/invasive-pests-and-plants/directives/horticulture/94-26) and [French](https://inspection.canada.ca/fr/protection-vegetaux/phytoravageurs-plantes-envahissantes/directives/horticulture/94-26). | Lists the button/de couche, cremini, and portabella labels under *A. bisporus*. Import phytosanitary list; it supports the shared species but does not make the three market names synonyms. |
| **WP03-AGARICUS-MARKET-TERMS-20261009-S05** | Statistics Canada, [Mushroom Growers’ Survey 2024](https://www23.statcan.gc.ca/imdb/p3Instr.pl?Function=assembleInstr&Item_Id=1559878&wbdisable=true); [species-of-mushrooms terminology, English](https://www.statcan.gc.ca/en/node?URL=0&page=350) and [French](https://www.statcan.gc.ca/fr/node?URL=8&page=318). | Survey labels distinguish white Agaricus/white button from brown Agaricus and list cremini/crimini and portobello/portabella under brown. French grouping includes *champignon blanc*, *cremini/crimini*, and *portobello/portabella*. Survey categories intentionally combine varieties in places; they are classification and naming evidence, not a synonym policy for the catalog. |
| **WP03-AGARICUS-MARKET-TERMS-20261009-S06** | Department of National Defence, [Food Quality Specifications FQS-11-32 Mushrooms (English, 2018)](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-11-2018-eng.pdf) and [French](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-11-2018-fra.pdf). | Procurement descriptions distinguish White Button, Café/cremini, and Portobello by product appearance and culinary characteristics. The specification is not a taxonomic standard or a universal maturity cutoff. |

## Proposal-only boundary

This packet records identity research only. Do not infer forms, recipe links, quantities, densities, measures, yields, conversions, or substitutions from it. Do not change or append to the research ledger, plan, roadmap, seed package, or any existing proposal. The only new file for this task is this packet; Section N remains open.

## Coordinator disposition — 2026-10-09

Accepted `ingredient-ref-cremini-mushroom` (`cremini mushroom / cremini`) and `ingredient-ref-portobello-mushroom` (`portobello mushroom / champignon portobello`) as separate market-product identities within *Agaricus bisporus*. Only source-backed spelling variants were added. The unqualified button term remains held; the active catalog has no white-button row. `champignon café` and `champignon brun` remain unassigned, and no recipe lines were relinked. No forms, measurements, yields, conversions, or substitutions were added. See `docs/catalog/batches/wp03-wp04-sultana-agaricus-shrimp-followup-20261009/README.md`.
