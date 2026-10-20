# WP03 Section F R247 — precooked durum wheat grains boundary review (2026-10-16)

## Review record

- **Scope:** one residual grain-product candidate: dry, quick-cooking precooked durum-wheat grains sold as a standalone pantry product. This does not revisit durum wheat berries, bulgur grind forms, durum flour/semolina, or other preprocessed grains.
- **Recommendation:** **hold catalog integration.** Current Québec-facing product evidence confirms a marketed item titled `Blé précuit` with an ingredient line `Grains de blé dur précuit`, but does not state whether the kernels remain whole or are cracked. Canadian retail wording also uses `blé dur précuit (boulgour)` for bulgur. The candidate is real, but the available French wording does not safely distinguish it from the existing bulgur identity. The coordinator accepted this hold; see the [R247 integration README](../batches/wp03-section-f-precooked-durum-wheat-boundary-hold-r247-20261016/README.md).
- **Proposal-local source-ID prefix:** `WP03-PRECOOKED-DURUM-R247-20261016-S`. These IDs are unallocated and are not written to the research ledger by this proposal.

## Product boundary and rationale

ACEMA, a food distributor with a Longueuil address, currently lists a French-language Leader Price product called **Blé précuit**. Its page gives France as origin, a 500 g pack, and the ingredient `Grains de blé dur précuit`; the description says that this product cooks in 10–12 minutes [S01]. This is a Québec-facing product-name and market observation. The page does not provide a package image or a technical description establishing whether the grains are whole, cracked, or otherwise milled.

The product is not the active raw-kernel identity `durum wheat berries / blé dur`. It is also not automatically the active `bulgur / boulgour`: those are distinct product states in the catalog, and the active bulgur row has separate fine, medium, coarse, and extra-coarse grind forms. A current Metro ingredient statement explicitly labels one component `BLÉ DUR PRÉCUIT (BOULGOUR)` [S04]. That statement does not prove that the ACEMA product is bulgur; it does show that the phrase `blé dur précuit` can identify bulgur in Canadian French retail usage.

The EBLY manufacturer describes its own precooked durum-grain process as selecting durum wheat grains, precooking them, removing bran, drying and cooling them, and finishing for a 10-minute cook [S02]. INRAE’s case study describes EBLY as a new food made from durum-wheat grains by a patented process [S03]. These sources support a distinct whole-kernel precooked product concept, but they do not establish that the Leader Price SKU follows that process or that `blé précuit` is an unambiguous generic Québec display. OQLF’s 2019 entry supports `blé dur` as the Québec French term for the grain and notes its use in producing boulgour; it does not name a precooked whole-kernel product [S05].

The candidate is therefore distinct in concept and culinary behaviour from the raw durum-kernel row, but the exact product boundary and picker-safe Québec name are not established for the local SKU. Hold rather than transfer the label to raw durum wheat or bulgur.

## Current ownership and archive audit

| Scope | Current owner or result | Disposition |
|---|---|---|
| Intact, unprocessed durum kernels | `ingredient-ref-durum-wheat-berries` — `durum wheat berries / blé dur`, category `GRAIN_AND_CEREAL`; no aliases, forms, density, or unit mappings. | Retain for the reviewed whole-kernel product only. Its identity review explicitly separates kernels from flour, semolina, and processed products. |
| Generic whole wheat kernels | `ingredient-ref-wheat-berries` — `wheat berries / grains de blé entiers`, category `GRAIN_AND_CEREAL`; no aliases or forms. | Retain; it does not name a precooked state. |
| Bulgur | `ingredient-ref-bulgur` — `bulgur / boulgour`, category `GRAIN_AND_CEREAL`; four dry grind forms: fine, medium, coarse, and extra coarse. | Retain. Do not add `blé dur précuit` as a bulgur alias or as an alias for the candidate. |
| Precooked durum-wheat grains | No active reference, form, exact ledger candidate, legacy identity, or prior focused proposal/batch review found for `precooked durum wheat grains`, `precooked wheat grains`, `blé précuit`, `blé dur précuit`, or `grains de blé dur précuit`. | Keep unallocated pending a product-state specification and a French name that preserves the whole-kernel/bulgur boundary. |

The active durum-grain identity is already integrated; this candidate is a separately processed product class, not a missing raw-grain alias. The focused durum-berries review covers intact kernels and explicitly excludes processed products. Prior bulgur reviews cover bulgur terminology and grind forms, not the standalone quick-cooking Leader Price product. A bounded search of the current plan, roadmap, active references/forms, the **1,986-record** ledger, **61** legacy-import identities, and proposal/batch archives found no focused prior decision for this candidate. It is distinct from the already reviewed pozole corn, dried sweet corn, common grits/polenta, puffed fonio/einkorn/emmer, farro, and samp items.

Normalized exact-key scans of active reference names/aliases, form labels/match terms, ledger record IDs, and legacy-candidate names/aliases found no exact owner for the candidate phrases. The current package snapshot examined for this proposal had **1,639 ingredient references**, **124 forms**, and **1,986 ledger records**; these totals are snapshot counts, not a claim about later concurrent updates.

## Picker and recipe-corpus audit

The audit used the repository’s phrase-first, accent-folding search normalization in `IngredientSearch.kt`. The static projection is based on current reference and attached-form terms; it is not live Android picker QA.

| Query | Current result | Implication |
|---|---|---|
| `precooked wheat grains`, `precooked durum wheat grains` | No result | The Canadian English retail wording has no active owner. |
| `blé précuit`, `grains de blé dur précuit` | No result | The Québec-facing product title and ingredient wording have no active owner. |
| `blé dur` | Four references: durum wheat berries, durum flour, durum semolina, remilled durum semolina. | Existing broad durum query is already shared across grain and milling identities. |
| `bulgur` / `boulgour` | `ingredient-ref-bulgur` | Keep the active bilingual identity and its four grind forms unchanged. |
| `blé dur précuit` | No exact active picker result | Do not assign this phrase: a current Canadian retail ingredient list uses it with the parenthetical `boulgour`. |

The current seed manifest lists **114 recipe files** and **1,123 structured ingredient rows**. A normalized full-file and ingredient-row scan for the candidate names, English/French spellings, `Ebly`, and `Leader Price Blé précuit` found **zero matching recipe files, zero matching ingredient rows, and zero direct links** to a candidate reference. The corpus provides no recipe-driven form, measure, or relink need.

## Category, forms, measures, and substitutions

- **Potential category if later accepted:** `GRAIN_AND_CEREAL`. The candidate is a standalone grain product, not flour, semolina, or a seasoning.
- **Forms:** Add none now. The available local product page does not say whether the grain is unbroken, and its precooked-but-dry state cannot be inferred as an ordinary `cooked` form. If later evidence confirms intact, dried kernels, prefer reviewing a separate product identity rather than aliasing the product to raw `durum wheat berries`.
- **Package and cooking observations:** ACEMA lists 500 g and 12 units per case; these are SKU and shipping details, not kitchen measures or yields. The page’s 10–12 minute cooking time applies to that product. EBLY’s separate 10-minute cooking claim applies only to its own product and process. Neither source gives a serving mass, cup-to-mass value, reusable density, or cooked-yield ratio.
- **Density and unit mappings:** Add none. Keep `defaultDensity` null and `unitMappings` empty if a later identity is approved. The existing durum-wheat USDA cup observation is already scope-limited and does not support this processed product.
- **Conversions and yields:** Add none. The package mass and cook times do not establish a transferable mass-volume conversion, dry-to-cooked conversion, or yield.
- **Substitutions:** Add no global or contextual substitution. ACEMA’s claim that the product is an alternative to rice and pasta is broad marketing language without a tested ratio, method, or dish-role scope. No reviewed source supports replacing raw durum berries or bulgur with it at an equivalent amount.

## Sources

All web sources below were checked on **2026-10-16**. Where a page has no publication or update date, the table records that limit instead of treating retrieval date as publication date.

| ID | Source and date | Evidence and limits |
|---|---|---|
| `WP03-PRECOOKED-DURUM-R247-20261016-S01` | ACEMA, [Blé précuit](https://www.acema.ca/fr/produits/crpf-701), current product page, checked 2026-10-16; no page publication/update date shown. | Longueuil-based distributor listing for Leader Price, product CRPF-701 / UPC 3263850619564; title `Blé précuit`, origin France, 500 g, 12 units per case, ingredient `Grains de blé dur précuit`, and 10–12-minute cook description. Does not state whether kernels are intact or cracked, show a transferable portion, or document current store stock. |
| `WP03-PRECOOKED-DURUM-R247-20261016-S02` | EBLY, [La marque](https://www.ebly.fr/la-marque-ebly), current manufacturer page, checked 2026-10-16; copyright 2026, no publication date shown. | Describes the EBLY process: French durum grains are selected, precooked, decorticated, dried/cooled, then finished for a 10-minute cook. This is manufacturer evidence for EBLY only; do not transfer the process, timing, or naming to Leader Price. |
| `WP03-PRECOOKED-DURUM-R247-20261016-S03` | INRAE ASIRPA, [Ebly: un nouvel aliment, le blé dur précuit](https://asirpa.hub.inrae.fr/60-cas-ex-post-etudies/etudes-de-cas-ex-post/agroalimentaire/ebly-ble-dur-precuit), created 2021-06-14 and updated 2023-08-28. | Describes EBLY as a new food made from durum-wheat grains using a patented transformation process. Authoritative product-development context, not a Québec retail name, current package, or specification for Leader Price. |
| `WP03-PRECOOKED-DURUM-R247-20261016-S04` | Metro Canada, [Quinoa, boulghour et blé, Gourmet](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/pates-riz-et-feves/quinoa-et-grains-de-specialite/quinoa-boulghour-et-ble/p/081893010239), current retail page checked 2026-10-16; page crawled four months earlier. | Ingredient statement includes `BLÉ DUR PRÉCUIT (BOULGOUR)` beside durum semolina and precooked durum semolina. Supports a Canadian retail wording collision with bulgur; it is a mixed product, not evidence that the standalone Leader Price product is bulgur. The page showed unavailable at the selected store when retrieved; availability is not generalized. |
| `WP03-PRECOOKED-DURUM-R247-20261016-S05` | Office québécois de la langue française, [blé dur (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357379/ble-dur), last updated 2019; checked 2026-10-16. | Supports preferred French `blé dur`, English `durum wheat`/`durum`, and notes uses including boulgour. It does not establish a preferred Québec name for precooked whole kernels. |
| `WP03-PRECOOKED-DURUM-R247-20261016-S06` | ZaytunaMart Canada, [Ebly L’Original Precooked Wheat Grains 500g](https://www.zaytunamart.ca/products/natural-precooked-wheat-mazyana-500g), checked 2026-10-16; page has no publication date. | Vaughan, Ontario retailer lists the English product wording and 500 g size, but says the item is out of stock. Its description does not provide an ingredient panel or processing specification; it corroborates Canadian retail naming only. |

## Disposition

**Keep the standalone precooked durum-wheat-grain candidate unallocated.** Preserve the existing `durum wheat berries / blé dur` and `bulgur / boulgour` records and their current aliases/forms. Do not add `blé précuit`, `blé dur précuit`, `grains de blé dur précuit`, or English precooked-wheat phrases as an alias to either active row. Reopen only when a current Canadian/Québec package or technical sheet establishes the Leader Price product’s intact-versus-cracked state and supports a picker-safe bilingual name distinct from bulgur. Section F remains open.

## Coordinator disposition

Accepted as a documentation-only hold. No active reference, form, legacy mapping, research-ledger candidate, or recipe link was added or changed. The cited ACEMA page is live but does not establish the kernel state; the other sources describe separate EBLY and bulgur products. No software tests or emulator checks were run because no database or application data changed.
