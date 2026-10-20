# WP03 Section N independent Québec terminology review — button, shimeji, and porcini

- **Reviewed:** 2026-10-10
- **Status:** proposal only. This is the only file created for this review. No seed data, research ledger, legacy candidates, recipes, plan, roadmap, code, tests, or existing proposal was changed.
- **Scope:** the still-open bare button, unqualified shimeji, and porcini terms from Section N, including current catalog/search boundaries and Québec French product naming.
- **Plan state:** Section N remains open. This packet does not close its checklist item.
- **Excluded:** recipe relinks, forms, measurements, conversions, yields, substitutions, and safety claims.

## Recommendation

Keep the **bare `button mushroom`**, **unqualified `shimeji`**, and **unqualified `porcini`** assignments held. Current evidence does not support a single exact Québec bilingual product boundary for bare button or shimeji. For porcini, the sources now give a useful species-qualified boundary—*Boletus edulis* / `cèpe de Bordeaux` / `porcini mushroom`—but they do not justify treating every product or recipe that says only `porcini` as that exact species. The app’s search behavior would also make `porcini` match a longer `porcini mushroom` display, so a qualifier in the display cannot preserve that distinction.

One conditional product boundary is supportable for a product explicitly identified as *Boletus edulis*: the naming candidate is **`porcini mushroom` / `cèpe de Bordeaux`**. This is an inference across OQLF terminology and an older Québec commercial study, not an OQLF preferred-term ruling for Québec food labels. It does not make the unqualified terms `cèpe`, `bolet`, or `porcini` global aliases and does not create an active catalog identity. Keep all three existing candidate IDs inactive pending a direct product-label boundary suitable for the picker.

| Candidate ID | Current disposition | Exact boundary supported by this review | What stays unresolved |
|---|---|---|---|
| `ingredient-ref-button-mushroom` | **Hold** | Statistics Canada distinguishes `white button` from brown *Agaricus* categories, but no exact current Québec French display is established for that product. | OQLF uses `button mushroom` for the broader cultivated *Agaricus bisporus* identity, which it says can be white or café. `Champignons blancs` appears on a Québec retail product, but that listing does not identify its species. Do not use bare `button`, `button mushroom`, `champignon de Paris`, or the recipe wording `white mushrooms` as a white-only alias. |
| `ingredient-ref-shimeji-mushroom` | **Hold** | TERMIUM records `shimeji` for *Hypsizygus tessulatus* and separately records `hon-shimeji` for *Lyophyllum shimeji*. | Other Canadian regulatory naming assigns `Shimeji` to *Tricholoma conglobatum*; the Québec retail listing has no species label; and the active Bunashimeji row already partially matches `shimeji`. Do not assign a species or alias `shimeji` to Bunashimeji. |
| `ingredient-ref-porcini-mushroom` | **Hold as an unqualified picker identity** | For a product explicitly identified as *Boletus edulis*, the candidate display pair is `porcini mushroom` / `cèpe de Bordeaux` (cross-source inference, not a Québec preferred-term ruling). | The current Québec retail pages use `porcini` or `cèpe` without a binomial. OQLF’s French `bolet`/`cèpe` definitions include a broader group. Do not activate a global `porcini` alias or a broad `cèpe`/`bolet` alias. |

The conditional *B. edulis* wording above is a source-backed boundary rule, not a proposal to add a second porcini identity or a conditional alias mechanism. If the catalog later accepts `porcini mushroom` as the English display, the picker’s phrase search will also match a bare `porcini` query; reviewers must consciously accept that user-facing result as the *B. edulis* meaning before activation.

## Refreshed working-tree snapshot

These values describe the exact working-tree files read for this proposal. File SHA-256 values cover exact file bytes. The manifest-ordered recipe digest hashes each manifest-relative path, a NUL byte, exact recipe-file bytes, and another NUL byte in manifest order.

| Artifact | Count or state | SHA-256 or digest |
|---|---:|---|
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `ingredient-references.v1.json` | 660 active references | `0ed3cf126bc93c3dc709b222d831aade0d68990c944c3e2da6835ba058c8af4a` |
| `ingredient-forms.v1.json` | 33 forms | `275f21eda9369a4c08a869aad3952ebbe2e9e64664ccf0b48af2bb7034928732` |
| `research-ledger.v1.json` | 844 records; 1,446 source entries; 1,213 distinct source IDs | `b4c72b7199cc4736f2ae26a72d546080b43b7d98694352974de4813a6b84f380` |
| `legacy-import-identities.v1.json` | 86 candidates | `7e416c84748a1d83bd29e05962dbc18cf9b9f4b16f5f572fcddb7b40667fa5ab` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows | `7b275f9696892e81ee05c247177d4c09a7a92f51d64586882d7599760bc6f22f` |

## Repository audit

I inspected `Requirements.md`, the Section N plan passage around line 1561, the prior Agaricus and fungi packets, current references and forms, the complete research ledger, legacy candidates, every ingredient row in all 114 manifest-listed recipes, and `normalizeIngredientSearchKey` / `IngredientReferenceSearchIndex` in the app. Search checks used the actual normalization behavior: lowercase, NFKD decomposition, fold `œ`, `æ`, `ß`, and `&`, remove combining marks, replace other punctuation with spaces, and collapse whitespace. The app searches complete word phrases before substring fallback.

| Area | Finding | Consequence |
|---|---|---|
| Active references | The 660 rows include generic mushroom, Bunashimeji, cremini, portobello, and the previously integrated named fungi. No active row is button, unqualified shimeji, or porcini. The active Bunashimeji ID is `ingredient-ref-bunashimeji-mushroom`; it remains separate. | Do not duplicate an active ID or change any existing row. |
| Candidate IDs | `ingredient-ref-button-mushroom` is present in the ledger as `needs_clarification`, not as an active reference. `ingredient-ref-shimeji-mushroom` and `ingredient-ref-porcini-mushroom` occur in prior proposal packets but are absent as active IDs and ledger record IDs. | Reuse these only as held review candidates; propose no duplicate or replacement ID. |
| Forms | None of the 33 active forms names button, shimeji, porcini, or a relevant mushroom product state. | No forms or form-related claims are proposed. |
| Ledger | The existing ledger records the button hold, the integrated Bunashimeji product boundary, and prior porcini/shimeji terminology evidence. New source IDs below are local to this proposal and are not additions to the ledger. | Keep the shared ledger unchanged. |
| Legacy candidates | The 86 rows include the old duplicate generic `ingredient-ref-mushrooms` candidate, but no button, shimeji, or porcini candidate. | Do not reactivate the generic duplicate. |
| Recipe ingredient rows | The corpus contains no button, shimeji, porcini, *Agaricus bisporus*, or *Boletus edulis* ingredient name. Its mushroom lines remain generic; candy cap remains its separate named ingredient. No line supports a new identity link. | Preserve all current recipe links. |

The mushroom-related ingredient rows are limited to:

| Recipe line | Ingredient wording | Current reference | Finding |
|---|---|---|---|
| 037#7 | `white mushrooms` | `ingredient-ref-mushroom` | Colour wording only; no cultivar, species, or button label. Keep generic. |
| 037#12 | `mushrooms` | `ingredient-ref-mushroom` | Generic wording. |
| 089#3 | `mushrooms` | `ingredient-ref-mushroom` | Generic wording. |
| 100#2 | `ground dried candy cap mushrooms` | `ingredient-ref-ground-dried-candy-cap-mushrooms` | Separate identity, outside this review. |

Recipe 021 has a `Meringue mushrooms` group label, while the ingredient rows in that group are meringue components. No target term appears in the other recipe strings. This review does not relink recipe 037#7 or any other row.

## Search behavior and false-match boundaries

The current app query results below were computed from the implementation’s matching rules against the active reference names and aliases:

| Query | Current result |
|---|---|
| `button`, `button mushroom` | No result |
| `shimeji`, `shimeji mushroom` | `bunashimeji mushroom` by substring fallback |
| `porcini`, `porcini mushroom`, `bolet`, `cèpe`, `cèpe de Bordeaux`, `champignon de Paris` | No result |

Adding a row with display `white button mushroom` would make the bare query `button` match the phrase inside that display. Likewise, a `porcini mushroom` display would make the bare `porcini` query match, and a new `shimeji mushroom` display would become the exact-phrase result for `shimeji`, taking precedence over Bunashimeji’s substring result. These are real user-visible search outcomes under the current implementation; a narrower word in the display is not a search boundary. Do not depend on users entering a qualifier that the picker cannot enforce.

## Evidence and dispositions

### Button

The current Statistics Canada grower questionnaire separates **white Agaricus / white button** from brown Agaricus categories [S04]. Its French 2024 questionnaire uses **champignons Agaricus blancs**, glossed as **champignons de Paris** [S05]. OQLF, however, defines `champignon de Paris` as *Agaricus bisporus* that can be white **or café**, and lists `button mushroom` in the English terminology for that broader entry [S01]. The Québec government’s English/French mushroom pages use `white mushrooms` in English and list `champignons de Paris`, `champignons café`, and `champignons portabellas` in French [S02–S03]. A current Mayrand item is sold as `Champignons blancs`, but its page does not identify *A. bisporus* [S06].

This evidence distinguishes the white production category, but it does not give an exact Québec French consumer label for the white-button product while also keeping the broad OQLF `button mushroom` sense out of picker results. Hold `ingredient-ref-button-mushroom`; do not assign `white mushrooms` from recipe 037#7 to it and do not store `button mushroom`, `button`, `champignon de Paris`, or `champignon de couche` as white-only aliases. A later review can reconsider a separately named white Agaricus product if it finds a current Québec bilingual product label that identifies that exact product.

### Unqualified shimeji

I found no OQLF/GDT entry resolving unqualified `shimeji` in this pass. TERMIUM’s 2023 entries associate `shimeji` / `shiméji` with *Hypsizygus tessulatus* and separately name *Lyophyllum shimeji* as `hon-shimeji` [S07]. Species Fungorum lists *Hypsizygus marmoreus* and *H. tessellatus* separately [S11]. Health Canada’s English and French residue crop tables use `Shimeji` / `Shimeji` for *Tricholoma conglobatum* and distinguish it from `Bunashimeji`, which the active catalog already scopes to *H. marmoreus* [S08–S09]. A Québec retailer currently lists `Champignons frais de shimeji` without a scientific name [S10].

These are conflicting taxonomic/product uses, not a single exact identity. Keep the unqualified name held; do not add it as an alias of Bunashimeji or assign *H. tessulatus* based only on the TERMIUM entry. A source-identified package could support its own qualified identity in a later review. In the current picker, searching `shimeji` returns only Bunashimeji via substring fallback, which is misleading but does not authorize changing either record in this proposal.

### Porcini

OQLF’s `bolet` entry lists `porcini mushroom` in English and *Boletus edulis* in its Latin field, while its French definition discusses the broader edible-bolet group and more than twenty edible varieties [S12]. No separate OQLF entry for porcini or for the species-qualified `cèpe de Bordeaux` surfaced in this pass. A Québec commercial-market study by Biopterre, funded by MAMROT, explicitly identifies *B. edulis* and says it is called `cèpe de Bordeaux` in France and `porcini` in Italy [S13]. Canadian import nomenclature uses `Porcini (Boletus edulis)` for one dried-mushroom tariff category [S14]. Current Québec listings show `Cèpes` / `Porcini` and dried `porcini`, but do not name the binomial [S15–S16].

By cross-source inference, a product explicitly identified as *Boletus edulis* may be named **`cèpe de Bordeaux`** in French, with **`porcini mushroom`** as the source-listed English name. The sources do not show that every Québec product labeled simply `porcini` or `cèpe` is *B. edulis*. The OQLF and Québec report are also old, and the current Québec listings omit the species. Keep `ingredient-ref-porcini-mushroom` held as a global picker identity; do not add `porcini`, `cèpe`, `bolet`, or `bolet comestible` as general aliases. If a future source identifies a specific product as *B. edulis*, use the qualified terminology boundary above without inferring a recipe link or product form.

## Proposal-local source register

All sources were checked on 2026-10-10. IDs are unique to this proposal and were not written to the shared ledger.

| Source ID | Source | Supports and limits |
|---|---|---|
| **WP03-MUSHROOM-QUEBEC-20261010-S01** | OQLF, [champignon de Paris (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869343/champignon-de-paris). | Gives *Agaricus bisporus*, says the cultivated mushroom may be white or café, and lists `button mushroom` in English. The entry was last updated in 2006; it supports the broad-sense warning, not a white-only display. |
| **WP03-MUSHROOM-QUEBEC-20261010-S02** | Gouvernement du Québec, [Champignons sauvages et de culture domestique](https://www.quebec.ca/sante/alimentation/salubrite-aliments-prevention-risques/salubrite-aliments-domicile/preparation-aliments-cuisson-securitaires/precautions-manipule-aliments/champignons-sauvages-culture-domestique). | Current French wording lists `champignons de Paris`, `champignons café`, and `champignons portabellas` with *A. bisporus*. Used for bilingual product terminology only. |
| **WP03-MUSHROOM-QUEBEC-20261010-S03** | Government of Québec, [Wild and domestic mushrooms](https://www.quebec.ca/en/health/nutrition/food-safety-risk-prevention/food-safety/preparing-cooking-food-safely/food-handling-precautions/wild-domestic-mushrooms). | English counterpart names white, cremini, and portobello mushrooms with *A. bisporus*. It does not supply an exact French translation for white-button specifically. |
| **WP03-MUSHROOM-QUEBEC-20261010-S04** | Statistics Canada, [Mushroom Growers’ Survey — 2025](https://www23.statcan.gc.ca/imdb/p3Instr.pl?Function=assembleInstr&Item_Id=1583172&lang=en&wbdisable=true). | Current questionnaire calls a production category `White Agaricus mushrooms i.e., white button` and separates brown Agaricus. It is a grower classification, not a Québec food-label ruling. |
| **WP03-MUSHROOM-QUEBEC-20261010-S05** | Statistics Canada, [Enquête relative aux producteurs de champignons — 2024](https://www23.statcan.gc.ca/imdb/p3Instr_f.pl?Function=assembleInstr&Item_Id=1559878&lang=fr&wbdisable=true). | French category is `Champignons Agaricus blancs c.-à-d. champignons de Paris`. It does not establish that unqualified `champignon de Paris` means white only. |
| **WP03-MUSHROOM-QUEBEC-20261010-S06** | Mayrand, [Champignons blancs 227 g](https://mayrand.ca/fr/nos-produits/fruits-et-legumes/legumes/champignon/champignon-blanc-entier-15305). | Current Québec retail wording `Champignons blancs`; no species is printed on the page. |
| **WP03-MUSHROOM-QUEBEC-20261010-S07** | TERMIUM Plus, [shimeji search result](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=frw&lang=eng&srchtxt=SHIMEJI). | 2023 terminology records map `shimeji` / `shiméji` to *H. tessulatus*, and distinguish `hon-shimeji` / `lyophylle shiméji` as *Lyophyllum shimeji*. Federal terminology evidence; not a Québec retail-product identification. |
| **WP03-MUSHROOM-QUEBEC-20261010-S08** | Health Canada, [Residue Chemistry Crop Groups — English](https://www.canada.ca/en/health-canada/services/consumer-product-safety/pesticides-pest-management/public/protecting-your-health-environment/pesticides-food/residue-chemistry-crop-groups.html). | Regulatory crop naming assigns `Shimeji` to *Tricholoma conglobatum* and separately lists Bunashimeji / *H. marmoreus*. It is not a current retail synonym authority. |
| **WP03-MUSHROOM-QUEBEC-20261010-S09** | Health Canada, [Groupes de cultures et propriétés chimiques de leurs résidus — français](https://www.canada.ca/fr/sante-canada/services/securite-produits-consommation/pesticides-lutte-antiparasitaire/public/proteger-votre-sante-environnement/pesticides-aliments/groupes-cultures-proprietes-chimiques-residus.html). | French regulatory list includes `Shimeji` and `Bunashimeji` under different taxonomic labels. Used to show the unresolved naming conflict, not to assign a catalog name. |
| **WP03-MUSHROOM-QUEBEC-20261010-S10** | Mayrand, [Champignons frais de shimeji 150 g](https://mayrand.ca/fr/nos-produits/fruits-et-legumes/legumes/champignon/champignon-shimeji-frais-22466). | Current Québec product listing uses the unqualified name `shimeji` but does not identify the taxon. |
| **WP03-MUSHROOM-QUEBEC-20261010-S11** | Species Fungorum, [*Hypsizygus* species tree](https://www.speciesfungorum.org/names/TreeOfLife.asp?GenusRecordID=17844). | Lists *H. marmoreus* and *H. tessellatus* as separate accepted species; taxonomy only. |
| **WP03-MUSHROOM-QUEBEC-20261010-S12** | OQLF, [bolet (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296987/bolet). | Lists English `porcini mushroom` and Latin *B. edulis*, while the French definition of `bolet`/`cèpe` covers a wider edible group. The entry was last updated in 1990. |
| **WP03-MUSHROOM-QUEBEC-20261010-S13** | Biopterre, [Analyse de commercialisation des champignons forestiers sauvages à potentiel commercial du Québec](https://www.agrireseau.net/documents/Document_118788.pdf), 2009. | MAMROT-funded Québec study identifies *B. edulis* and reports `cèpe de Bordeaux` / `porcini` as France / Italy regional names. Historical commercial research, not a current preferred Québec label. |
| **WP03-MUSHROOM-QUEBEC-20261010-S14** | Innovation, Science and Economic Development Canada, [Canadian Importers Database: dried porcini](https://ised-isde.canada.ca/app/ixb/cid-bdic/productReportHS10.html?hsCode=0712391100). | Current import category uses `Porcini (Boletus edulis)` for a specified dried-mushroom tariff item. It does not establish the identity of all products sold as porcini. |
| **WP03-MUSHROOM-QUEBEC-20261010-S15** | Aliments du Québec, [Cèpe déshydraté](https://alimentsduquebec.com/aliments-dici/fruits-et-legumes/cepe-deshydrate). | Current Québec producer listing uses `cèpe` but does not identify the species. |
| **WP03-MUSHROOM-QUEBEC-20261010-S16** | Mayrand, [Champignons séchés porcini 250 g](https://mayrand.ca/fr/nos-produits/fruits-et-legumes/fines-herbes-et-vinaigrette/herbes-et-champignons-seches/champignon-porcini-seche-valli-49047). | Current Québec retail product name uses `porcini`; no species is given. |

## Review boundary

Keep Section N open. This review creates no active reference, alias, form, recipe link, or numeric data. No tests or emulator checks were run because this task is proposal-only. The working-tree snapshot is scoped to the exact files audited above; recheck candidate IDs, source IDs, search behavior, and recipe rows if the package changes before integration.
