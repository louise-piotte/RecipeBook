# WP04 Section P — Nile perch / perche du Nil open seafood gap review

- **Review and source-access date:** 2026-10-12.
- **Packet type:** Species identity, Québec wording, picker, ownership, recipe-demand, measurement, and substitution review; integrated on 2026-10-12.
- **Disposition:** **Integrate one identity-only `PROTEIN` reference** for Nile perch / perche du Nil (*Lates niloticus*), with no aliases. Keep bare `perch` / `perche`, barramundi, yellow perch, Nile tilapia, and other fish separate. Record the picker’s broad French word-query result with its species-qualified display intact. Add no recipe link, form, density, unit mapping, conversion, yield, or runtime substitution rule.
- **Integration record:** The identity and source-specific ledger evidence are live; the generated picker catalog is current. See [integration record](../batches/wp04-section-p-nile-perch-identity-integration-20261012/README.md).

## Candidate and recommendation

The Section P finfish checklist remains open for regional fish. Canadian terminology sources associate *Lates niloticus* with **Nile perch / perche du Nil**. The 2026 Canadian tariff names the fish in its edible fillet classifications, two Québec recipe pages name Nile-perch fillets, and Canadian sellers list the fish in whole and fillet products. This is a distinct, documented food-fish identity, not another name for yellow perch or Nile tilapia.

| Proposed reference ID | Category | English display | Québec French display | Taxon | Aliases |
|---|---|---|---|---|---|
| `ingredient-ref-nile-perch` | `PROTEIN` | **Nile perch** | **perche du Nil** | *Lates niloticus* | None |

The recommended row is species-scoped and identity-only. It does not imply that a particular fishery, production method, country of origin, seller, fillet size, or recipe quantity applies generally. The sources support the exact bilingual display. TERMIUM also records `capitaine` as a correct name, while a seller uses `African snook` and `perche Victoria`; those secondary names are omitted because they are unnecessary for this precise Canadian/Québec entry and would broaden search beyond the standardized pair.

## Prior-work and checklist boundary

Section P still leaves regional fish open. The current plan and roadmap already record yellow perch / `perchaude` as an integrated species identity. The live catalog also has barramundi. Neither is this taxon: yellow perch is *Perca flavescens*, and barramundi is *Lates calcarifer*.

No dedicated Nile-perch review, active row, held candidate, or allocation was found in the current plan, roadmap, WP04 proposals/batches, active references, forms, legacy identities, or ledger. Two prior packets mention the candidate only to keep it separate:

- The Nile tilapia review and hold identify Nile perch (*Lates niloticus*) as a different fish from Nile tilapia (*Oreochromis niloticus*). They do not review or allocate a Nile-perch identity.
- The Pacific ocean-perch review covers *Sebastes alutus* and holds that different candidate because broader market terms such as `ocean perch` and `sébaste` could return it as the sole result. That decision does not cover Nile perch.

The current `ingredient-ref-yellow-perch` entry and its `yellow perch / perchaude` names remain separate. Do not merge the three taxa because of the shared words `perch`, `perche`, or `Nile`.

## Taxon, product, and name boundary

- Limit the identity to *Lates niloticus*. Keep yellow perch (*Perca flavescens*), barramundi (*Lates calcarifer*), and Nile tilapia (*Oreochromis niloticus*) distinct.
- Use only **Nile perch / perche du Nil** as displays. Add no aliases for bare `perch` / `perche`, `capitaine`, `African snook`, `Victoria perch` / `perche Victoria`, or the scientific name. Do not identify an unspecified perch as Nile perch.
- Treat whole fish, fillets, chilled, frozen, and seller-specific cleaned/cut packs as product or preparation detail. The reviewed sources describe different product states and origins; do not add a generic form or origin qualifier.
- One Ontario seller describes a wild-caught, headed, gutted, frozen product; another lists whole or fillet, fresh or frozen fish described as farm-raised in Lake Victoria and a product of South Africa. These are seller-specific offers, not a contradiction to resolve into one universal sourcing claim.
- Do not infer that a Nile-perch recipe is interchangeable with another fish from shared texture, family, or market description. Preserve the one source-specific recipe alternative below only as evidence.

## Exact ownership, snapshot, and picker audit

The exact-key audit follows `normalizeIngredientSearchKey` in `IngredientSearch.kt`: lowercase, NFKD normalization, fold `œ`, `æ`, `ß`, and `&`, remove combining marks, convert other punctuation to spaces, and collapse whitespace. Exact field ownership is distinguished from a query matching a complete word inside a longer display. Hashes below cover exact file bytes.

| Live artifact | Count | Bytes | SHA-256 |
|---|---:|---:|---|
| `ingredient-references.v1.json` | 1,272 references | 407,321 | `2b94176589510c344eedf318a03659005a7ab8883e755f79c6fb2b933bfc0e56` |
| `ingredient-forms.v1.json` | 94 forms | 70,793 | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 65 candidates | 15,508 | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| `research-ledger.v1.json` | 1,580 records; 5,591 source entries; 4,627 distinct source IDs | 5,470,716 | `0ce7c077364b57ac61626932bc40c766c29f829d07a284a9dbd3c93be797a7e3` |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `BundledIngredientCatalog.kt` | 1,272 reference entries | 557,520 | `aeabed47aa25137f2fe88587b857028576be7f62b61c33efe16f0df4b6348487` |

The proposal-local source ID range `WP04-P-NILE-PERCH-20261012-S01` through `S09`, `ingredient-ref-nile-perch`, and `candidate-nile-perch` were absent from existing proposals and batches, the live ledger, and catalog artifacts. Source IDs are proposal-local until an integration is accepted.

| Key or phrase | Exact current owner / text occurrence | Result |
|---|---|---|
| `Nile perch`; `perche du Nil`; *Lates niloticus* | No exact active-reference, form, legacy-name, or ledger-record-ID owner. | Proposed identity; no existing row to merge or relink. |
| `ingredient-ref-nile-perch`; `candidate-nile-perch` | Neither ID is allocated in active references, forms, legacy candidates, or ledger record IDs. | Both are available for a future reference and its ledger record. |
| `yellow perch`; `perchaude` | `ingredient-ref-yellow-perch` owns the exact bilingual pair. | Keep *Perca flavescens* separate. |
| `perch`; `perche` | No exact field owner for either bare word. The picker query `perch` currently returns `ingredient-ref-yellow-perch`; `perche` currently returns no result. | Do not add bare-word aliases. |
| `barramundi` | `ingredient-ref-barramundi`, taxon *Lates calcarifer*. | Same genus does not establish identity or substitution. |
| `Nile perch`; *Lates niloticus* in prior ledger text | The `candidate-nile-tilapia` decision says to keep Nile perch distinct; no record is keyed to Nile perch. | Prior separation note, not a prior Nile-perch review or hold. |
| `capitaine` in prior ledger text | Appears in an unrelated duck-egg seller URL (`lecapitaine.ca`); no active ingredient/form name or alias owns it. | Not a seafood identity owner. Keep it out of this row. |

The live picker uses complete normalized word-phrase matches first. A query for `perche` therefore matches the complete word inside `perche du Nil`, even though `perche` is not an alias. The resulting display remains species-qualified. The query can surface this species as the only result; the generic/common word remains unresolved and the row must not be interpreted as an identity for every perch. This is a visible broad-query limitation, not a claim that bare `perche` is an accepted Nile-perch name.

| Query | Current picker result | Result with the proposed display-only row |
|---|---|---|
| `Nile perch` | No result | `ingredient-ref-nile-perch` — Nile perch / perche du Nil |
| `perche du Nil` | No result | `ingredient-ref-nile-perch` — Nile perch / perche du Nil |
| `perche` | No result | `ingredient-ref-nile-perch` — result display remains `perche du Nil`; generic `perche` stays unresolved |
| `perch` | `ingredient-ref-yellow-perch` | `ingredient-ref-yellow-perch` and `ingredient-ref-nile-perch` |
| `yellow perch` | `ingredient-ref-yellow-perch` | `ingredient-ref-yellow-perch` |
| `Lates niloticus` | No result | No result; scientific names are not stored as search terms |
| `capitaine`; `African snook`; `Victoria perch` | No result | No result; no aliases proposed |

## Full bundled recipe-corpus audit

The audit read all 114 paths in the live recipe manifest, all 1,123 ingredient rows, and complete recipe JSON text. It scanned exact/normalized whole phrases for `Nile perch`, `perche du Nil`, *Lates niloticus*, `African snook`, `Victoria perch`, and `capitaine`, then checked the broader `perch` / `perche` terms.

**Bundled demand: zero matching recipe files and zero matching ingredient rows.** No recipe link, relink, recipe-derived form, or bundled recipe substitution is supported. The two Recettes du Québec pages below are external source examples, not rows in the app’s bundle.

| Recipe snapshot | Count | Bytes / digest |
|---|---:|---|
| Manifest | 114 recipe paths | 12,011 bytes; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered corpus | 114 files; 1,123 ingredient rows | 753,792 recipe-file bytes; digest `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The corpus digest is computed by iterating `manifest.recipeFiles` in stored order and hashing each relative path, a NUL byte, the exact recipe-file bytes, and another NUL byte.

## Source-specific measurements and substitution evidence

### Measurements and product observations

The 2013 Recettes du Québec recipe yields four portions and lists two Nile-perch fillets. Its author adds an approximate 180 g per person note, phrased for large “perche” fillets. Preserve this only as a single page-specific estimate: it does not state fillet size, edible/as-purchased basis, or a weighing method, and it does not establish a standard portion or a count-weight conversion.

Inter-Canada Fisheries lists a frozen, headed and gutted Nile perch product at 3–7 kg per fish and a 20 kg / 44.1 lb case title; its variant text says 44 lb. Those are inconsistent package labels for one seller’s SKU, and the fish-size range is not a fillet or recipe amount. Seafood Depot lists whole fish or fillets, fresh or frozen. Neither seller establishes a general density, standard fillet weight, package yield, edible fraction, or cooking yield.

If the identity is integrated, a ledger may preserve the Recettes du Québec estimate as a `portion_weight` observation with `evidenceKind: estimate`, its vague food state and page wording explicit, and no source quantity. Set `measurementState: researched_supported` only to record that bounded source estimate. Keep `defaultDensity` null and `unitMappings` empty. Do not add forms, a per-fillet default, or any conversion/yield.

### Recipe-specific alternative

The IFAD “Recipes for Change: Poached Sable fish” recipe is by Canadian chef Shane Chartrand of Maskêkosak Enoch Cree Nation in Alberta and serves six. Its ingredient line reads **2 lb sablefish filets (or Nile Perch), precleaned**. This supports the specific alternative in that poached recipe and that listed amount. It does not give a general fish-for-fish ratio, cooking-time adjustment, or safety equivalence.

If the identity is integrated, record one `SubstitutionFinding` with `researchState: researched_supported`, from `ingredient-ref-sablefish` to the proposed Nile-perch reference, and limit its context and basis to the IFAD recipe and its two-pound precleaned-fillet line. Set overall `substitutionResearchState: researched_supported` to describe this source-specific finding. Add no runtime rule, bundled recipe link, global sablefish replacement, grouper/sea-bass substitute, or other cross-fish equivalence. Seller texture comparisons do not support substitutions.

## Source register

All sources were accessed 2026-10-12. This register is for this proposal only; no sources were added to the live ledger.

| Source ID | Source and direct URL | Claim supported and limits |
|---|---|---|
| `WP04-P-NILE-PERCH-20261012-S01` | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) and [Nile Perch listing query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fplist.asp?cmbIn=e&lang=e&q=Nile+Perch) | CFIA says the list provides English/French fish names acceptable for Canadian labelling and scientific names. Its searchable English list includes `Nile Perch`. The detail endpoint did not load in the browser research pass, so the bilingual pair and taxon are cross-checked with TERMIUM and the tariff below. This is nomenclature evidence, not recipe or substitution guidance. |
| `WP04-P-NILE-PERCH-20261012-S02` | TERMIUM Plus, Translation Bureau, Government of Canada, [*Lates niloticus* terminology record](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=frr&lang=eng&srchtxt=NILE%20PERCH) | Record 2 (2023-01-04), in Fish, Seafood/Freshwater Food, and Commercial Fishing domains, pairs `Nile perch` with `perche du Nil`, calls the French form standardized, and identifies *Lates niloticus*. It also lists `capitaine`; that name is not adopted as an alias. Terminology evidence, not preparation or measure evidence. |
| `WP04-P-NILE-PERCH-20261012-S03` | Canada Border Services Agency, [2026 Customs Tariff, Chapter 3](https://www.cbsa-asfc.gc.ca/trade-commerce/tariff-tarif/2026/html/02/ch03-eng.html) | Names `Nile Perch (Lates niloticus)` under fish classifications, including frozen fillets. Supports identity and a recognized food-product class; it does not prove current Québec retail stock or provide a recipe quantity. |
| `WP04-P-NILE-PERCH-20261012-S04` | Usito, [perche — lexical units](https://usito.usherbrooke.ca/d%C3%A9finitions/perche_1/lexies) | Defines `perche` generally as common perch and notes extension to neighboring or similar fish; separately defines `perche du Nil`. Supports the broad-query caveat and the species-qualified French expression. It does not establish an ingredient alias or commercial measure. Content last updated 2026-05-22. |
| `WP04-P-NILE-PERCH-20261012-S05` | Inter-Canada Fisheries, [Perche (Nil) product](https://www.intercanadafisheries.com/fr/products/perch-1) | Ontario seller page describes its wild-caught, headed/gutted, immediately frozen product, lists 3–7 kg per fish and a case label of 20 kg / 44.1 lb (variant text says 44 lb), and uses `perche du Nil`, `African snook`, and `perche Victoria`. Product-page wording and quantities only; the page notes delivery to Toronto GTA and Southern Ontario, not Québec-wide availability. |
| `WP04-P-NILE-PERCH-20261012-S06` | Seafood Depot, Vaughan, Ontario, [Nile Perch product](https://www.seafooddepot.ca/product-nileperch) | Names *Lates niloticus* and lists whole or fillet, fresh or frozen product described as farm-raised in Lake Victoria and a product of South Africa. Seller-specific product scope only; do not generalize its origin or availability to Québec. |
| `WP04-P-NILE-PERCH-20261012-S07` | Recettes du Québec, [Filets de perche du Nil à la Franceska](https://www.recettes.qc.ca/recettes/recette/filets-de-perche-du-nil-a-la-franceska-147434) | Community recipe dated 2013-01-31, four servings, two Nile-perch fillets; author note estimates about 180 g per person for generally large perch fillets. Recipe wording and one author estimate only; not a standard portion or conversion. |
| `WP04-P-NILE-PERCH-20261012-S08` | Recettes du Québec, [Filets de perche du Nil aux tomates et au basilic](https://www.recettes.qc.ca/recettes/recette/filets-de-perche-du-nil-aux-tomates-et-au-basilic-168987) | Community recipe dated 2008-04-29 lists four Nile-perch fillets and gives a papillote cooking method. Confirms Québec recipe use of the species-qualified wording; the page does not provide a transferable fillet weight. |
| `WP04-P-NILE-PERCH-20261012-S09` | International Fund for Agricultural Development, [Recipes for Change: Poached Sable fish (PDF)](https://www.ifad.org/documents/38714174/40224979/recipes-for-change-poached-sable-fish.pdf/936572b9-a457-db4e-c488-f9ace3a2be20?t=1668426909031) | Canadian chef Shane Chartrand’s six-serving recipe lists 2 lb precleaned sablefish fillets “or Nile Perch.” Supports only this recipe-specific alternative and amount; no general substitution or adjustment. |

## Accepted integration record

1. The canonical `ingredient-references.v1.json` contains this identity-only reference:

   ```json
   {
     "id": "ingredient-ref-nile-perch",
     "nameFr": "perche du Nil",
     "nameEn": "Nile perch",
     "aliasesFr": [],
     "aliasesEn": [],
     "defaultDensity": null,
     "unitMappings": [],
     "updatedAt": "2026-10-12T00:00:00Z",
     "category": "PROTEIN"
   }
   ```

2. The ledger record keyed by `ingredient-ref-nile-perch` has `recordType: ingredient_reference`, `identityState: verified`, and sources `S01`–`S09`. `measurementState: researched_supported` records only this source observation:

   - `observationId: WP04-P-NILE-PERCH-M-RQ-180G-PERSON-20261012`
   - `relationship: portion_weight`, `value: 180`, `valueUnit: g`, `evidenceKind: estimate`, `sourceIds: [WP04-P-NILE-PERCH-20261012-S07]`.
   - Describe the source as the recipe author’s approximate per-person amount for large perch fillets; record the food state and weighing method as unspecified. Do not add a source quantity, fillet count weight, default measure, or conversion.

3. `substitutionResearchState: researched_supported` records only this ledger finding, with no rule ID:

   - `findingId: WP04-P-NILE-PERCH-F-IFAD-SABLEFISH-20261012`; `researchState: researched_supported`.
   - `fromIngredientRefId: ingredient-ref-sablefish`; replacement `ingredient-ref-nile-perch` at `2 lb`.
   - Limit the context to IFAD’s six-serving poached sablefish recipe and its precleaned-fillets ingredient line. State that the recipe explicitly lists Nile perch as an alternative at the same listed amount, and that no general adjustment or safety equivalence follows.
   - `sourceIds: [WP04-P-NILE-PERCH-20261012-S09]`.

4. The bare terms `perch` / `perche`, `capitaine`, `African snook`, `Victoria perch`, and *Lates niloticus* remain out of aliases. `ingredient-ref-yellow-perch`, `ingredient-ref-barramundi`, and the Nile-tilapia hold remain separate. All 114 bundled recipes and the Section P parent checklist are unchanged.
5. No form, default measure, density, unit mapping, conversion, yield, recipe link, global substitution, contextual runtime rule, or food-safety equivalence was added. The seller’s package discrepancy and differing origin descriptions remain source limits.

The accepted data and picker disposition are recorded in the [integration README](../batches/wp04-section-p-nile-perch-identity-integration-20261012/README.md). No app tests or emulator checks were run because this change only added database JSON data and its generated index.
