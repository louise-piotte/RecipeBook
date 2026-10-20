# WP03 Section F — puffed teff Québec naming recheck (R158, 2026-10-16)

## Review record

- **Status:** Proposal only. No shared catalog JSON, ledger, generated index, checklist, roadmap, integration README, or recipe was changed.
- **Scope:** Recheck the Québec French naming gate for the existing ledger-only candidate `candidate-puffed-teff`.
- **Checklist context:** The active Section F checklist still leaves wider puffed-grain coverage open. R157 integrated soft white winter wheat berries; this review addresses a separate processed-grain candidate.
- **Recommendation:** **Hold active catalog integration.** Keep the existing candidate ledger-only until a current Québec source names plain puffed teff in French or Québec terminology guidance supports a product-specific display. Do not allocate `ingredient-ref-puffed-teff`, add a display or alias, or add forms or numeric behavior.
- **Proposal-local source-ID prefix:** `WP03-PTEFF-R158-20261016-S` (S01–S06). These IDs are absent from the current ledger.

## Product boundary and naming evidence

Current supplier and retail sources establish a real human-food product made from puffed teff grain. A Dutch retailer currently lists **Teff Pops** as 100% teff, says the grain is popped and ready to eat, and describes using it in yogurt, muesli, salads, and other foods [S01]. Tradin Organic lists teff as available whole, as flour, and puffed, and describes puffed teff as an ingredient in breakfast cereals and bars [S02]. These support the product class, but Tradin's B2B listing does not provide a consumer ingredient declaration.

KENTAUR's current French-language supplier page labels the product **Teff soufflé** and describes preheating teff kernels and saturating them with steam under pressure before expansion [S03]. KENTAUR is Swiss; that exact wording is not Québec product evidence. OQLF's current GDT entry covers the base cereal as *tef*, calls that spelling non-current but recommended, and gives English *teff* as its translation [S04]. It does not define a puffed-teff product name. CFIA's current cereal-labelling guidance classifies puffed cereals among prepared cereal products and includes teff in its cereal list, but does not give a teff-specific French product name [S05].

A current French-facing Yupik product page based in the Canadian market lists raw whole teff as **Graines de teff**. It says the product is in stock and gives South Africa as that product's origin [S06]. It supports current Québec-facing wording for raw teff only; it is not evidence for a puffed product or for the origin of teff generally. Targeted searches for `puffed teff`, `teff soufflé`, and related Québec/Canadian terms did not surface a current local French product listing for plain puffed teff. This is a bounded search result, not proof that no such listing exists.

The product boundary, if a Québec display is later established, should remain limited to plain puffed teff grain. Keep it separate from:

- raw teff (`ingredient-ref-teff-grain`), teff flour, ivory teff flour, and brown teff flour;
- flour-based or extruded `Teff Crispies` and other snack products;
- prepared breakfast cereals, cereal bars, granolas, and mixes that merely contain puffed teff; and
- other puffed grains.

Do not generalize the Baktotaal product's package size, nutrition panel, or ready-to-eat wording into a reusable amount, conversion, or universal process specification.

## Bilingual display limits and disposition

`puffed teff` is directly attested in English by suppliers; `popped teff` and `Teff Pops` are also source-attested product phrases [S01–S02]. They remain research wording only while the identity is held. Do not activate aliases from those suppliers without an accepted bilingual product boundary.

`teff soufflé` is directly attested on KENTAUR's Swiss French page [S03], but it is not established as a Québec label. OQLF's *tef* entry covers only the crop term and does not approve the processed compound [S04]. CFIA's umbrella wording `céréales soufflées` establishes a general processed-cereal phrase, not a teff-specific Québec product name [S05]. The Canadian/Québec raw-grain page uses `Graines de teff` [S06]; keep that phrase on the active raw-grain row and do not repurpose it as the puffed product display.

**Hold:** retain `candidate-puffed-teff` in the research ledger with `identityState: needs_clarification`. Do not add an active bilingual row, aliases, forms, measurements, conversions, yields, recipe links, or substitutions. Reopen the French naming gate when a Québec manufacturer, distributor, retailer, or authoritative terminology source directly names plain puffed teff.

## Exact ownership and ID audit

Current package snapshot: **1,530 active references**, **119 forms**, **61 legacy candidates**, and **1,875 research-ledger records** with **7,949 source entries / 6,797 distinct source IDs**. The manifest lists **114 recipe files** and **1,123 structured ingredient rows**.

An exact-key review normalized case, accents, ligatures, punctuation, and spacing across active reference names/aliases, form labels/match terms, and legacy-candidate names/aliases. It found no exact active owner for `puffed teff`, `popped teff`, `teff pops`, `teff soufflé`, `tef soufflé`, or the other qualified puffed-teff variants checked. Existing teff names remain on their current owners:

| Current owner | Exact names and scope |
| --- | --- |
| `ingredient-ref-teff-grain` | `teff / teff d'Abyssinie`; French aliases `tef` and `graines de teff`. This is the unpuffed grain. |
| `ingredient-ref-teff-flour` | `teff flour / farine de teff`. |
| `ingredient-ref-ivory-teff-flour` | `ivory teff flour / farine de teff ivoire`. |
| `ingredient-ref-brown-teff-flour` | `brown teff flour / farine de teff brun`. |

No teff-specific form or form hint exists. The proposed reference ID `ingredient-ref-puffed-teff` is absent from active reference IDs, form IDs, legacy-candidate IDs, and ledger record IDs. The existing research-ledger candidate ID `candidate-puffed-teff` is already allocated and has a `needs_clarification` decision; retain it rather than creating a second candidate. The R158 source-ID prefix is unused in the current ledger and archive. No new candidate ID is proposed.

Ledger text hits for the puffed-teff identity and its English/French product terms all belong to that one existing `candidate-puffed-teff` record; no second ledger record owns the identity. Its older evidence remains scoped to the same Québec naming hold. The new source IDs below are proposal-local and do not create ledger entries.

## Static picker projection

The projection follows the phrase-first, accent-folding behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It models a hypothetical row with only `puffed teff / teff soufflé` and no aliases. This is static analysis, not live picker QA.

| Query | Current active results | If a bilingual row were added | Effect |
| --- | --- | --- | --- |
| `puffed teff` | 0 | 1 proposed row | Exact English phrase would resolve. |
| `teff soufflé` / `teff souffle` | 0 / 0 | 1 proposed row each | Exact French phrase would resolve with accent folding. |
| `popped teff` / `teff pops` | 0 / 0 | 0 / 0 | These source phrases would remain unavailable unless separately accepted as aliases. |
| `teff` | 4 refs: raw grain, ordinary flour, ivory flour, brown flour | 5 refs | A new result would appear in a broad teff query. |
| `puffed` | 13 refs | 14 refs | Adds one item to the broad puffed-grain set. |
| `soufflé` | 12 refs | 13 refs | Adds one item to the broad French puffed-grain set. |
| `teff flour` | 3 refs: ordinary, ivory, and brown teff flours | unchanged | Flour searches remain scoped to flour identities. |
| `graines de teff` | `ingredient-ref-teff-grain` | unchanged | Preserve the existing raw-grain alias owner. |

Because the French product label remains unresolved, none of these hypothetical results is active. Do not add `teff soufflé` or `teff pops` as aliases to the raw-grain row.

## Manifest recipe demand

Parsed all **114 manifest-listed recipe files** and **1,123 structured ingredient rows**. Scanned full recipe JSON and ingredient rows for `puffed teff`, `popped teff`, `teff pops`, `teff soufflé`/`teff souffle`, `puffed teff cereal`, other candidate variants, the proposed reference ID, and the existing candidate ID. Results: **0 candidate-term file hits, 0 ingredient-row hits, and 0 broader teff ingredient rows**. No recipe link, amount, form, or substitution is warranted.

## Forms, measures, conversions, yields, and substitutions

- **Forms:** No teff-specific form exists. If accepted later, puffing should be a distinct processed-grain identity rather than a form of raw teff; no form is proposed here.
- **Measures and density:** The current ledger candidate has no measurement observations. Baktotaal's 140 g package and nutrition values per 100 g are product-specific; they are not household portions, density, or unit mappings. Keep `defaultDensity` null and `unitMappings` empty if the candidate is ever promoted.
- **Conversions and yields:** The package-yield file has one unrelated record; no teff entry exists. The ledger has eight unit conversions and none concerns teff. KENTAUR's pressure-and-steam process description supplies no reusable input/output ratio or cooking yield.
- **Substitutions:** The candidate has no substitution findings. The global and contextual substitution-rule files are empty. Add no global or contextual rule; marketing descriptions do not establish an interchangeable quantity for puffed rice, quinoa, millet, or other grains.
- **Recipe links:** None; the manifest scan found no candidate-term or teff ingredient line.

## Source register and limits

Sources were checked online on 2026-10-16. Product availability and pages can change; claims are limited to the cited page. Source IDs below are proposal-local and should be checked again before any ledger integration.

| Source ID | Source | Evidence used and limits |
| --- | --- | --- |
| `WP03-PTEFF-R158-20261016-S01` | Baktotaal, [Teff Pops 140 grams](https://www.baktotaal.com/teff-pops-140-grams). | Current listing states 100% teff, says the grain is popped and ready to eat, and gives several food uses. This establishes a bounded consumer food product outside Canada; the 140 g package and per-100 g nutrition values are SKU information, not general measurements. |
| `WP03-PTEFF-R158-20261016-S02` | Tradin Organic, [Organic teff](https://www.tradinorganic.com/organic-products/all/organic-teff). | Current supplier portfolio separates whole grain, flour, and puffed teff and describes puffed teff as an ingredient for cereal bars and breakfast cereal. It gives no consumer label, exact formula, Québec display, or reusable measure. |
| `WP03-PTEFF-R158-20261016-S03` | KENTAUR AG, [Céréales soufflées](https://www.kentaur.ch/fr/produits/cereales-soufflees), section “Teff soufflé.” | Current Swiss supplier page uses the exact French phrase and describes its own pressure/steam puffing process. It is direct French product wording, but not Québec product-name evidence or a universal process specification. |
| `WP03-PTEFF-R158-20261016-S04` | OQLF, [tef (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8480763/tef). | Defines the base cereal term, marks `tef` non-current but recommended, and gives English `teff`. The cited entry does not name or standardize a puffed-teff product. |
| `WP03-PTEFF-R158-20261016-S05` | CFIA, [Exigences d'étiquetage et de composition pour les céréales et les produits de boulangerie](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/cereales-produits-boulangerie). | Current federal guidance lists teff among cereal types and describes puffed cereals as prepared cereal products; modified 2025-01-15. It does not provide a teff-specific French product name or a Québec display ruling. |
| `WP03-PTEFF-R158-20261016-S06` | Yupik, [Graines de teff](https://yupik.com/fr/teff-seeds-p20075), French-facing Canadian product page. | Current page lists raw whole teff seeds in stock, gives South Africa as the origin of this SKU, and uses `Graines de teff`. It supports local wording for the raw grain only, not a puffed product, universal origin, or puffed-teff measures. |

## Static review checks

- Read the current Section F checklist, R157 integration README, prior puffed-teff hold, current package, research ledger, and WP03 Section F archive before selection.
- Confirmed no exact puffed-teff owner or proposed ID in active references, forms, legacy candidates, or ledger record IDs; confirmed the existing `candidate-puffed-teff` ledger record and unused R158 source-ID prefix.
- Reproduced representative phrase-first picker results from current reference/form data and the implementation in `IngredientSearch.kt`.
- Parsed all 114 manifest recipe files and 1,123 ingredient rows; candidate and broader teff phrase scans found no hits.
- Checked current forms, unit conversions, package yields, measurement observations, and substitution files; none supports reusable puffed-teff behavior.
- This proposal changes only this file. No tests, builds, emulator, or deployment checks were run.
