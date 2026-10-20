# WP03 Section N proposal — huitlacoche identity and product boundary

- **Reviewed:** 2026-10-10
- **Status:** proposal only. This task creates this file alone; no canonical catalog, ledger, recipe, plan, roadmap, code, or test file was changed.
- **Scope:** culinary huitlacoche/cuitlacoche identity, Québec French naming, and the boundary between edible maize galls, ordinary corn, generic mushrooms, the broader plant disease, and preserved or prepared products.
- **Recommendation:** add one identity-only reference, `ingredient-ref-huitlacoche`, displayed as `huitlacoche` in both English and French, with the English alias `cuitlacoche`. Scope the food identity to young *Ustilago maydis* galls on maize ears. Do not alias it to corn, mushroom, or common-smut terms. Keep all forms, measures, conversions, recipe links, and substitutions unset.
- **Plan state:** Section N remains open.

## Prior decisions and scope

The live plan still has the unchecked item “Huitlacoche and other documented culinary fungi.” The [WP03 fungi and sea-vegetable coordinator review](wp03-fungi-seaweed-coordinator-review-20261009.md) already recommends a separate `huitlacoche / huitlacoche` identity scoped to young *Ustilago maydis* galls on maize, and says not to map it to corn, generic mushroom, truffle, or corn-smut disease. The [other culinary fungi follow-up](wp03-other-culinary-fungi-followup-20261009.md) treats this as adjacent work rather than duplicating it. This packet refreshes the product boundary, Québec terminology evidence, package collision audit, and candidate spelling decision; it does not propose a broader fungi sweep.

The inspected regional packets were the Mexico/Central America and North American cuisine gap sweeps and the South American choclo boundary review. They do not establish a huitlacoche recipe link, a synonym to corn, or a Québec alias beyond the local plant-diagnostic evidence discussed below. Existing maize identities and the generic mushroom row remain distinct.

## Current working-tree snapshot

Counts and SHA-256 values describe the exact working-tree bytes read on 2026-10-10. The recipe corpus digest hashes each manifest-relative path, a NUL byte, the exact recipe-file bytes, and another NUL byte, in manifest order.

| Artifact | Count or state | SHA-256 or digest |
|---|---:|---|
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 654 references | `7ea212dc45e6c03d47826ac3bbd44e87171492e26aeef1d71e341836109ace3f` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 33 forms | `275f21eda9369a4c08a869aad3952ebbe2e9e64664ccf0b48af2bb7034928732` |
| `docs/catalog/research-ledger.v1.json` | 838 records; 1,430 source entries; 1,197 distinct source IDs | `3fb50a7a1b31678ea02d67d861e92a001e63152e79d473a55a32b188ea9df063` |
| `docs/catalog/legacy-import-identities.v1.json` | 86 candidates | `7e416c84748a1d83bd29e05962dbc18cf9b9f4b16f5f572fcddb7b40667fa5ab` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows | `7b275f9696892e81ee05c247177d4c09a7a92f51d64586882d7599760bc6f22f` |

## Food identity and naming recommendation

| Proposal ID | Recommendation | English display | fr-CA display | Aliases | Product scope |
|---|---|---|---|---|---|
| `ingredient-ref-huitlacoche` | Recommend identity-only reference | `huitlacoche` | `huitlacoche` | EN: `cuitlacoche`; FR: none | Culinary young galls of *Ustilago maydis* on maize ears. This identifies the food product, not corn kernels, an intact ear of corn, generic mushrooms, or every infection caused by the fungus. |

TERMIUM’s Food Industries records use `huitlacoche` in both English and French. Its English record also lists `cuitlacoche` as an accepted term, and the American Phytopathological Society describes cuitlacoche/huitlacoche as the name for young edible galls on infected corn ears [S01–S02]. I therefore recommend the narrow English alias `cuitlacoche`; the primary display stays `huitlacoche` in both languages. No botanical field exists in the current reference shape, so *U. maydis* and the host/tissue boundary belong in evidence notes, not in an invented schema field.

The Québec MAPAQ-linked Iriis phytoprotection page uses `huitlacoche` for the culinary use of common-smut galls on sweet-corn ears and also parenthetically says `champignon du maïs` [S04]. The primary French display can stay with TERMIUM’s shared food term `huitlacoche`; this avoids turning a descriptive phrase into a broad alias. OQLF explains that `charbon` applies more to the disease than to the fungus that causes it, and identifies *Ustilago maydis* as common smut of maize [S05].

If accepted, use the same `VEGETABLE_AND_AROMATIC` category as the existing culinary-fungus identities. This is the catalog’s product taxonomy, not a botanical classification.

### Alias decisions

| Term | Decision | Reason |
|---|---|---|
| `cuitlacoche` | Recommend as EN alias | TERMIUM lists it as an accepted English term, and APS pairs it with huitlacoche for the young edible maize-ear galls. The spelling remains searchable without replacing the bilingual display name. [S01–S02] |
| `corn smut`, `common smut`, `common smut of corn`, `maize smut` | Hold as aliases | These are disease/common-name terms. The same fungus can cause galls on other plant tissues; the culinary identity is specifically the young ear-gall food product. Adding a disease label would make the ingredient row broader than the food. [S02, S04–S05] |
| `charbon du maïs`, `charbon commun`, `champignon du maïs` | Hold as catalog aliases | Québec sources use these expressions in plant-disease descriptions, and Iriis uses `champignon du maïs` as a culinary gloss. The source supports local descriptive usage, but not a preferred, food-only alias. In particular, OQLF says `charbon` refers more to the disease. Keep `huitlacoche` as the unambiguous French display. [S04–S05] |
| `maize mushroom`, `corn fungus` | Hold | `Maize mushroom` occurs in TERMIUM’s related English record, but it reads as a generic crop/fungus description and has no Québec French product label. `Corn fungus` is not needed to find the specifically named food. [S01] |
| `Mexican truffle`, `corn truffle` | Hold | These are analogical/marketing names that could direct searches to culinary truffles or imply a fungible mushroom product. They are not needed as synonyms for the exact food identity. |

## Product-state evidence; no forms proposed

Research sources report fresh, canned, frozen, and lyophilized/dehydrated huitlacoche in commerce [S06–S07]. These reports show that the named food can be sold in multiple presentations; they do not establish a recipe-matched conversion, common yield, unit mapping, or substitution. A report of canned huitlacoche with or without other vegetables also does not make a vegetable-containing canned mixture an alias for plain huitlacoche [S06].

Keep an unqualified identity and do not add a generic `fresh`, `canned`, `frozen`, `dried`, `lyophilized`, powdered, cooked, or reconstituted form from these review statements. A future explicitly named product or recipe may justify a separately bounded state or prepared reference. Soups, quesadillas, and other dishes that contain huitlacoche remain prepared recipes, not synonyms for the ingredient. No quantity, density, conversion, yield, recipe link, or substitution is supported here.

## Catalog, ledger, legacy, and recipe audit

I inspected the live Section N plan; all 654 ingredient references and 33 forms; all 838 ledger records and 1,430 source entries; all 86 legacy candidates; the prior fungal and regional packets; and every ingredient row and string field in all 114 manifest-listed recipes. Candidate query checks replicate `normalizeIngredientSearchKey`: lowercase, Unicode NFKD, fold `œ`/`æ`/`ß` and `&`, remove combining marks, replace other non-alphanumeric characters with spaces, and collapse whitespace. Whole normalized word phrases are checked first, matching the app search behavior.

| Candidate phrase/query | Active reference or form owner | Legacy owner | Recipe ingredient-row hits | Finding |
|---|---|---|---:|---|
| `huitlacoche`, `huitlacoches` | None | None | 0 / 1,123 | No active identity or form collision. |
| `cuitlacoche`, `cuitlacoches` | None | None | 0 / 1,123 | No active identity or form collision; proposed singular alias has a clean normalized key. |
| `corn smut`, `common smut`, `common smut of corn`, `maize smut`, `maize mushroom`, `corn fungus` | None | None | 0 / 1,123 | No existing exact phrase owner; held because the names are broader or less specific than the food identity. |
| `champignon du maïs`, `champignons du maïs`, `charbon du maïs`, `charbon commun`, `charbon commun du maïs`, `Mexican truffle(s)`, `corn truffle(s)` | None | None | 0 / 1,123 | No exact owner; held for disease, descriptive, or metaphorical ambiguity. |

The unique candidate ID `ingredient-ref-huitlacoche` and source-ID prefix `WP03-HUITLACOCHE-20261010-S` were searched repository-wide before drafting and have no prior match. The ledger contains no candidate record or source entry for these names. Proposal source IDs S01–S07 are local to this file and have not been added to the shared ledger.

No candidate phrase appears in any of the 1,123 recipe ingredient rows or other recipe string fields. The live controls remain `ingredient-ref-corn-kernels` (`corn kernels` / `maïs`), `ingredient-ref-corn-on-the-cob` (`corn on the cob` / `maïs en épis`), and `ingredient-ref-mushroom` (`mushroom` / `champignons`). Their identities and recipe links should not be changed based on this proposal. The app’s broad single-word searches currently return 10 corn-named references for `corn` and 14 mushroom-named references for `mushroom`; keeping those generic words out of huitlacoche aliases avoids adding another unrelated result to either set. The proposed names `huitlacoche` and `cuitlacoche` do not collide with those broad results.

## Source register

Sources were checked on 2026-10-10. Source IDs use the proposal-local prefix `WP03-HUITLACOCHE-20261010-S`.

| Source ID | Source | Supports and limits |
|---|---|---|
| **WP03-HUITLACOCHE-20261010-S01** | Translation Bureau, Government of Canada, TERMIUM Plus, [English record](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=enr&lang=fra&srchtxt=HUITLACOCHE) and [French record](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frb&lang=fra&srchtxt=HUITLACOCHE) for `huitlacoche` (Food Industries, records dated 1999). | Uses `huitlacoche` as the English and French term; its related English record lists `cuitlacoche`, `corn smut`, and `maize mushroom`. It describes Mexican culinary use but does not by itself establish the precise botanical binomial or developmental stage. The additional terms are evidence, not automatic catalog aliases. |
| **WP03-HUITLACOCHE-20261010-S02** | American Phytopathological Society, [Common smut of corn](https://www.apsnet.org/edcenter/pdlessons/Pages/CornSmut.aspx). | Describes cuitlacoche/huitlacoche as the Mexican name for young edible galls that form on corn ears infected by *Ustilago maydis*. A plant-pathology teaching source; supports the species, host, edible stage, and spelling variant, not product measurements or a general safety statement. |
| **WP03-HUITLACOCHE-20261010-S03** | Valverde et al., [Huitlacoche (*Ustilago maydis*) as a food source—biology, composition, and production](https://pubmed.ncbi.nlm.nih.gov/7632354/), *Critical Reviews in Food Science and Nutrition* 35(3):191–229 (1995). | Scholarly food-source review identifies huitlacoche as young *U. maydis* galls on maize and documents Mexican food use. It is not a Québec naming or conversion source. |
| **WP03-HUITLACOCHE-20261010-S04** | Iriis phytoprotection, with MAPAQ contributions, [Maïs grain et fourrager — Charbon commun (*Ustilago maydis*)](https://iriisphytoprotection.qc.ca/fr/maladies-parasitaires/champignons/ustilago-maydis/mais-grain-et-fourrager-charbon-commun). | Québec French plant-diagnostic source says certain countries use common-smut tumors on sweet-corn ears as a sought-after food and calls it `champignon du maïs` or `huitlacoche`. The page covers disease on ears and other plant tissues, so its descriptive name should not become a broad ingredient alias. |
| **WP03-HUITLACOCHE-20261010-S05** | OQLF, [ustilago (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8359967/ustilago). | Defines the fungus, identifies *U. maydis* as the common maize smut, and notes that `charbon` refers more to the disease than the organism. Supports holding disease terms away from the food alias set; terminology entry last updated 2003. |
| **WP03-HUITLACOCHE-20261010-S06** | Villagrán et al., [Huitlacoche (*Ustilago maydis*), an Iconic Mexican Fungal Resource](https://pmc.ncbi.nlm.nih.gov/articles/PMC10254540/), *Molecules* 28(11):4415 (2023 review). | Reviews the fungal food resource and reports fresh, canned (with or without other vegetables), and lyophilized/dehydrated presentations. Review evidence for available products only; it supplies no recipe-specific universal state conversion. |
| **WP03-HUITLACOCHE-20261010-S07** | Patel, [Nutrition, safety, market status quo appraisal of emerging functional food corn smut (huitlacoche)](https://www.sciencedirect.com/science/article/pii/S0924224415301138), *Trends in Food Science & Technology* 57:93–102 (2016 review). | Reports fresh, frozen, and canned market presentations and stresses that the food product is harvested as young, intact galls. This is a review, not a Québec terminology ruling, and its market reports do not establish recipe conversions or substitutions. |

## Review decision requested from integration owner

Review one separate identity row (`huitlacoche / huitlacoche`) with the singular English alias `cuitlacoche`, scoped to young *U. maydis* galls on maize ears. Keep disease terms and broad descriptive names out of the alias arrays. Preserve the existing corn and generic-mushroom identities. Treat fresh/canned/frozen/dried presentations and multi-ingredient preparations only as documented product evidence until a specific product or recipe justifies a separately supported form. Section N remains open; no tests were run because this was a proposal-only assignment.
