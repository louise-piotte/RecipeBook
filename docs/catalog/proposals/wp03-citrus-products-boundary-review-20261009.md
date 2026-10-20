# WP03 Section M: citrus product boundary review

- **Reviewed:** 2026-10-09
- **Status:** proposal only; no shared catalog, ledger, legacy, recipe, plan, roadmap, code, or test file was edited.
- **Scope:** citrus juice, zest, peel, pulp, concentrate, purée, and related preserved products that are absent from or overlap with current references. This packet proposes one generic citrus-zest reference and holds the other unrepresented product terms.
- **Sources accessed:** 2026-10-09. OQLF, Télé-Québec, Metro Québec, and current CFIA product and common-name guidance were reviewed.

## Recommendation

Propose one identity-only product reference:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-citrus-zest` |
| English display | `citrus zest` |
| Québec French display | `zeste d’agrumes` |
| Aliases | None |
| Category | `SAUCE_AND_CONDIMENT`, matching the existing `ingredient-ref-lemon-zest` product row |

The OQLF defines *zeste* as the colored, aromatic external part of a citrus rind used to flavor food, distinguishes the white bitter *ziste* underneath, and gives English `zest`. Québec usage independently uses `zeste d’agrumes`. This is a cross-citrus product identity, not a form attached to one whole-fruit identity. Keep it separate from lemon-specific `ingredient-ref-lemon-zest` and from whole-rind products.

The only unlinked general-citrus recipe wording is the optional phrase “and/or citrus zest” in the grouped fresh-aromatics line `111#5`. It does not identify lemon or lime, has no separate quantity, and is not a standalone ingredient line. The exact wording supports the generic product candidate, but it does **not** justify a recipe link or a lemon/lime interpretation. Keep the recipe line and its optional note unchanged.

Keep the active lemon-juice, lime-juice, and lemon-zest references. They already distinguish products from their whole-fruit references. Do not add other species-specific juices, bottled/fresh variants, or concentration states without an exact recipe request. Hold citrus peel, dried/candied peel, pulp, concentrate, powder, purée, canned fruit, marmalade, jam, jelly, preserves, compote, and fruit butter as separate future product decisions; no such product is named by a bundled citrus ingredient line. Canadian product standards distinguish several of these terms, which is a reason not to collapse them into one citrus alias, not a reason to prepopulate them without demand. [S04–S06]

This proposal adds no alias for `zest`, `zeste`, `citrus peel`, `écorce d’agrumes`, `lemon zest`, or any fruit name. It establishes no form, amount, density, unit mapping, conversion, yield, substitution, or recipe link.

## Refreshed live snapshot

Counts and hashes describe the worktree read on 2026-10-09, before this proposal file was created. File hashes use raw bytes. The recipe-corpus SHA-256 processes each manifest-relative recipe path, a NUL byte, exact recipe-file bytes, and a NUL byte, in manifest order.

| Artifact | Live count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 646 references | `b78ddd512c3cf5bf77955875035b36610ef6699181963b92a47ef5753d140ce4` |
| `ingredient-forms.v1.json` | 33 forms | `275f21eda9369a4c08a869aad3952ebbe2e9e64664ccf0b48af2bb7034928732` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `research-ledger.v1.json` | 817 records; 1,388 source entries; 1,166 distinct source IDs, including unit-conversion sources | `ca8a3824ff1f0cb8cf522c4430d72184027f5bb93163d83653abca8903b84b58` |
| `legacy-import-identities.v1.json` | 86 candidates | `7e416c84748a1d83bd29e05962dbc18cf9b9f4b16f5f572fcddb7b40667fa5ab` |
| Manifest-listed recipe corpus | 114 recipes; 1,123 ingredient rows | `7b275f9696892e81ee05c247177d4c09a7a92f51d64586882d7599760bc6f22f` |

The candidate reference ID `ingredient-ref-citrus-zest` is absent from active references, forms, ledger record IDs, and the legacy candidate file. The proposal-local source prefix `WP03-M-CITRUS-PRODUCTS-20261009` had no match in `docs/catalog` before this file was created. Source IDs below are local to this proposal and have not been added to the shared ledger.

## Live citrus references, forms, and ledger

The 15 active whole-citrus `FRUIT` identities are `ingredient-ref-orange`, `ingredient-ref-lemon`, `ingredient-ref-lime`, `ingredient-ref-grapefruit`, `ingredient-ref-mandarin`, `ingredient-ref-clementine`, `ingredient-ref-pomelo`, `ingredient-ref-kumquat`, `ingredient-ref-yuzu`, `ingredient-ref-sudachi`, `ingredient-ref-calamansi`, `ingredient-ref-citron-cedrat`, `ingredient-ref-bergamot`, `ingredient-ref-finger-lime`, and `ingredient-ref-bitter-orange`. The distinct whole-fruit records remain unchanged.

| Current product/reference | Live display and category | Ledger / form state | Recommendation |
|---|---|---|---|
| `ingredient-ref-lemon-juice` | `lemon juice / jus de citron`; `SAUCE_AND_CONDIMENT`; French alias `jus de citron frais` | Ledger identity `unreviewed`, no sources; measurement `blocked_pending_evidence`; substitution state `existing_rule_needs_review`; no citrus-juice form | Retain. Recipe uses already resolve to this product. Preserve `fresh` only where recipe preparation says it; do not infer bottled, reconstituted, or concentrated juice. |
| `ingredient-ref-lime-juice` | `lime juice / jus de lime`; `SAUCE_AND_CONDIMENT`; French alias `jus de citron vert` | Ledger identity `unreviewed`, no sources; measurement `blocked_pending_evidence`; substitution state `existing_rule_needs_review`; no citrus-juice form | Retain. Recipe uses already resolve to this product. Do not merge it with lemon juice or the whole lime. |
| `ingredient-ref-lemon-zest` | `lemon zest / zeste de citron`; `SAUCE_AND_CONDIMENT`; no aliases | Ledger identity `unreviewed`, no sources; no zest form | Retain as the fruit-specific product. The OQLF definition of *zeste* plus the already source-reviewed lemon identity can support a ledger review; do not use it to make lemon a generic citrus alias. |
| `ingredient-ref-lemon`, `ingredient-ref-lime` | Whole fruit, `FRUIT` | Whole-fruit identities have separate source-backed ledger records | Keep separate from their juice products and the proposed generic zest product. |
| `ingredient-ref-lime-pickle`; `ingredient-ref-makrut-lime-leaves` | Preserved condiment; leaf identity | Three forms exist for fresh, frozen, and dried makrut lime leaves only | Outside this product proposal. A pickle, leaf, and fruit-juice reference do not establish citrus-fruit product aliases or forms. |

No matching legacy import candidate exists for a citrus juice, zest, peel, pulp, concentrate, powder, or purée product. Of the 33 current forms, only the three makrut-lime-leaf forms concern citrus; none belongs to a whole citrus fruit or to lemon/lime juice or lemon zest. The active lemon/lime juice rows have no source entries despite recipe use, and their ledger’s old substitution-rule status remains a review issue. This proposal does not reactivate any substitution rule or supply numeric evidence.

## Product boundaries and decisions

| Product or phrase | Evidence and recipe demand | Disposition |
|---|---|---|
| **Citrus zest / zeste d’agrumes** | OQLF defines the culinary product and distinguishes the aromatic colored surface from the bitter white layer. Metro Québec uses the exact phrase `zeste d’agrumes`; Télé-Québec’s citrus marmalade recipe calls for grapefruit zest “sans la partie blanche.” Recipe `111#5` contains the exact generic English and French phrase in an optional aromatics note. [S01–S03] | Propose one generic identity-only reference. It covers unspecified citrus species; it is not a synonym for lemon zest, the complete peel, or candied peel. No recipe link is justified. |
| **Lemon zest / zeste de citron** | Four recipe lines already resolve to `ingredient-ref-lemon-zest`; the product is species-specific. The row has no ledger sources today. OQLF’s generic zest definition and the previously accepted OQLF lemon identity evidence can be recorded if the coordinator reviews the existing row. [S01; WP03-M-CITRUS-IDENTITY-20261009-S03] | Keep the active row distinct. Do not add a citrus-zest alias to it or transfer the optional generic `111#5` line. |
| **Lemon and lime juice** | Eight lemon-juice lines and two linked lime-juice lines already resolve to their respective product rows. Two lines explicitly retain a `fresh` preparation qualifier. Canadian sources recognize lemon juice and lime juice as named product classes; OQLF also uses `jus de lime` in its Québec definition of *limade*, distinguishing it from lemon-based *limonade*. [S04, S07] | Retain both active rows and their existing links. No new orange, grapefruit, yuzu, or generic “citrus juice” reference is supported by recipe demand. Do not equate fresh juice, bottled juice, juice from concentrate, and concentrate. |
| **“Vinegar or lime juice”** | Recipe `007#5` is an unlinked either/or alternative, not a standalone lime-juice amount. | Do not relink it to one alternative. The existing lime-juice row remains the owner for explicit lime-juice lines. |
| **Citrus peel / rind / écorce** | OQLF distinguishes zest from the bitter white layer; CFIA separately defines sweetened/glazed `Fruit Peel or Cut Mixed Peel`. A citrus “peel” request can refer to a broader part of the fruit than zest. [S01, S04] | Hold as a separate product. Do not alias peel or rind to zest. No recipe line names citrus peel. |
| **Concentrated or juice-from-concentrate products** | OQLF lists `jus de citron concentré` and `concentré de jus de citron` as product terms. CFIA identifies frozen concentrated orange juice and directs that orange juice from concentrate be named accordingly. [S04–S06] | Hold species-specific concentrate, reconstituted juice, frozen concentrate, and juice powder until an exact recipe need establishes the relevant product. None is an alias or form inferred from generic juice. |
| **Pulp, purée, canned citrus, marmalade, jam, jelly, preserves, compote, fruit butter** | CFIA has distinct standards for citrus marmalade and fruit peel; the current recipe corpus has no citrus line naming these products. The standards do not establish a universal “citrus pulp” or “citrus purée” identity. [S04] | Hold. Review a specific prepared product when an ingredient line or import use names it. Do not create a generic citrus-preparations row. |

`Fresh` is a recipe preparation qualifier, not a separate juice reference in the current rows. `Grated` in recipe `012#2` is preparation of lemon zest, not a new product identity. OQLF’s description of zest also permits thin strips, but no bundled citrus line requires a separate strip/whole/grated zest form. No numeric data or conversions were studied for this packet.

## Complete recipe audit

All 114 manifest-listed recipe JSON files and all 1,123 `ingredients[]` rows were scanned for citrus identities and product terms in original text, ingredient name/reference, preparation, and notes. A second scan of complete recipe JSON text found citrus terms in the same 14 recipe files; it found no additional citrus product request outside the rows below.

| Recipe and line | Ingredient wording | Current owner / interpretation |
|---|---|---|
| `007#5` | `5 g vinegar or lime juice` | Unlinked alternative; not a specific lime-juice line. |
| `010#7` | `1 tsp lemon zest` | `ingredient-ref-lemon-zest`. |
| `012#2` | `1 tbsp grated lemon zest` | `ingredient-ref-lemon-zest`; `grated` is preparation. |
| `012#6` | `60 ml fresh lemon juice` | `ingredient-ref-lemon-juice`; `fresh` is preparation. |
| `014#4` | `1 tbsp lemon juice` | `ingredient-ref-lemon-juice`. |
| `014#5` | `1 tsp lemon zest` | `ingredient-ref-lemon-zest`. |
| `019#5` | `2 tsp fresh lemon juice` | `ingredient-ref-lemon-juice`; `fresh` is preparation. |
| `024#3` | `2 tbsp lemon juice` | `ingredient-ref-lemon-juice`. |
| `029#4` | `1 tbsp lemon juice` | `ingredient-ref-lemon-juice`. |
| `034#13` | `3 tbsp lime juice` | `ingredient-ref-lime-juice`. |
| `066#13` | `1/2 lemon, thinly sliced` | Whole `ingredient-ref-lemon`, not juice or zest. |
| `095#7` | `1 tbsp fresh lime juice` | `ingredient-ref-lime-juice`; `fresh` is preparation. |
| `106#3` | `1/2 tsp lemon zest` | `ingredient-ref-lemon-zest`. |
| `106#4` | `1/2 tbsp lemon juice` | `ingredient-ref-lemon-juice`. |
| `108#3` | `1/2 tbsp lemon juice` | `ingredient-ref-lemon-juice`. |
| `111#5` | `Fresh aromatics such as thyme, dill, parsley, thinly sliced shallots, and/or citrus zest`; French note: `facultatif; par exemple ... ou zeste d’agrumes` | Existing line is grouped and optional, with no citrus-specific amount, fruit, or separate ingredient reference. It supports only a generic citrus-zest candidate. No lemon/lime interpretation or recipe link is justified. |
| `113#5` | `1 tbsp lemon juice` | `ingredient-ref-lemon-juice`. |

The corpus contains no ingredient line naming orange, grapefruit, true pomelo, mandarin, clementine, yuzu, sudachi, calamansi, kumquat, bergamot, citron/cédrat, finger lime, or bitter-orange juice or zest. It also contains no citrus peel, dried/candied peel, pulp, concentrate, powder, purée, canned citrus, marmalade, jam, jelly, preserve, compote, or fruit-butter ingredient. No recipe link or quantity change is proposed.

## Normalized-key and picker audit

The search audit follows `IngredientSearch.kt`: Unicode compatibility decomposition, lowercasing, diacritic and ligature folding, punctuation-to-space, whitespace collapse, whole-phrase matching first, then substring matching. The two proposed display keys were checked against all current reference names/aliases, form labels/match terms, and legacy candidate labels. Exact normalized-key collisions: **none**.

| Proposed term | Role | Normalized key | Existing exact owner |
|---|---|---|---|
| `citrus zest` | English display | `citrus zest` | none |
| `zeste d’agrumes` | Québec French display | `zeste d agrumes` | none |

Code-path search simulation against current names, aliases, and forms shows:

| Query | Current results | If candidate is accepted |
|---|---|---|
| `citrus zest` | none | `ingredient-ref-citrus-zest` |
| `zeste d’agrumes` | none | `ingredient-ref-citrus-zest` |
| `lemon zest` / `zeste de citron` | `ingredient-ref-lemon-zest` | `ingredient-ref-lemon-zest` only |
| `zest` / `zeste` | `ingredient-ref-lemon-zest` | `ingredient-ref-lemon-zest` and `ingredient-ref-citrus-zest` |
| `lemon juice` | `ingredient-ref-lemon-juice` | unchanged |
| `lime juice` / `jus de lime` | `ingredient-ref-lime-juice` | unchanged |
| `jus de citron` | `ingredient-ref-lemon-juice` and `ingredient-ref-lime-juice` (the latter through its existing `jus de citron vert` alias) | unchanged |

The broad `zest`/`zeste` overlap is expected for a generic citrus-zest product alongside a lemon-specific one; exact species-specific phrases remain uniquely owned. The existing French `jus de citron` overlap is already caused by the lime-juice alias and is not altered here. No picker was run on an emulator and no search code or test was changed.

## Source register

All sources below were accessed 2026-10-09. IDs use the proposal-local prefix `WP03-M-CITRUS-PRODUCTS-20261009`; they are not shared-ledger source IDs.

| ID | Source | Support and limit |
|---|---|---|
| `WP03-M-CITRUS-PRODUCTS-20261009-S01` | Office québécois de la langue française, [zeste (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497908/zeste) | 2025 entry defines the colored, aromatic outer part of citrus rind used to flavor food; distinguishes the white bitter *ziste* and lists English `zest`. The term applies across citrus; it does not make whole peel equivalent to zest. |
| `WP03-M-CITRUS-PRODUCTS-20261009-S02` | Télé-Québec, Cuisinez, [Marmelade d’agrumes](https://cuisinez.telequebec.tv/recettes/5614/marmelade-d-agrumes) | Independent Québec recipe uses the title `marmelade d’agrumes` and instructs to take grapefruit zest “sans la partie blanche,” then separately refers to the white peel and fruit flesh. Recipe terminology/use, not a product standard. |
| `WP03-M-CITRUS-PRODUCTS-20261009-S03` | Metro Québec, [Ensoleillez votre assiette avec des agrumes](https://www.metro.ca/produits-a-decouvrir/fruits-et-legumes/conseils-de-mon-maraicher/fruits-citrins-pour-faire-rayonner-votre-journee) | Québec-market source uses the exact phrase `zeste d’agrumes` as well as species-specific `zeste de citron` and `jus de mandarine`. Market wording, not formal terminology authority. |
| `WP03-M-CITRUS-PRODUCTS-20261009-S04` | Canadian Food Inspection Agency, [Canadian Standards of Identity: Volume 4 – Processed Fruit or Vegetable Products](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-4) | Sections 68–69 distinguish frozen concentrated orange juice; sections 80–81 cover citrus marmalade; section 86 defines fruit peel/cut mixed peel as sweetened/glazed outer rinds. Supports product boundaries, not a new product row without recipe demand. |
| `WP03-M-CITRUS-PRODUCTS-20261009-S05` | Canadian Food Inspection Agency, [Common name on food labels](https://inspection.canada.ca/en/food-labels/labelling/industry/common-name) | Current naming guidance says orange juice from concentrate should be described as `orange juice from concentrate`, not simply `orange juice`; supports keeping processing/concentration wording distinct. General label guidance, not a culinary conversion rule. |
| `WP03-M-CITRUS-PRODUCTS-20261009-S06` | Office québécois de la langue française, [jus de citron concentré (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18968393/jus-de-citron-concentre) | Lists `jus de citron concentré` and `concentré de jus de citron`, with English `lemon juice concentrate`. Supports Québec terminology for a distinct concentrate product, not an alias for ordinary lemon juice. |
| `WP03-M-CITRUS-PRODUCTS-20261009-S07` | Office québécois de la langue française, [limade (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26579766/limade) | 2025 Québec/Canada entry defines *limade* as a drink made with lime juice, sweetener, and water, and distinguishes it from lemon-based *limonade*. It corroborates the local `jus de lime` wording; it does not establish a juice measurement or substitution. |

## No-shared-mutation statement

This task created only this standalone proposal file. It did not edit the shared ingredient-reference package, ingredient forms, research ledger, legacy candidates, recipes, plan, roadmap, generated code, tests, or any other proposal. No tests were run. The coordinator should recheck the snapshot and normalized-key queries at integration time.

## Coordinator disposition (2026-10-09)

Accept the identity-only `citrus zest / zeste d’agrumes` row. Keep it distinct from lemon zest and leave recipe 111#5 unchanged and unlinked because the phrase is an optional, unquantified grouped-aromatics note. Other citrus product candidates remain open. No forms, measurements, yields, conversions, or substitutions were added.
