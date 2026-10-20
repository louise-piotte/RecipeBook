# WP04 Section P — European sea bass / bar commun picker-boundary review

- **Review and source-access date:** 2026-10-12.
- **Packet type:** Proposal-only finfish identity and Canadian/Québec market-name boundary review, including exact ownership, picker projection, bundled-recipe demand, product states, measurements, and substitution limits.
- **Decision status:** The hold is integrated and recorded in the [batch note](../batches/wp04-section-p-european-sea-bass-picker-hold-integration-20261012/README.md).
- **Recommendation:** Hold the *Dicentrarchus labrax* identity outside the active catalog and research ledger for now. OQLF, CFIA-related federal naming evidence, and current Québec products support the fish identity and the Québec term **bar commun**. However, an active row would make broad **sea bass**, **bar**, and **bass** searches return this one species alone; older Health Canada retail surveillance also cautions that products labeled “sea bass” may have included several species. There is no species-specific recipe demand.
- **Worktree scope:** This follow-up updates this proposal only; the hold integration is recorded in the [batch note](../batches/wp04-section-p-european-sea-bass-picker-hold-integration-20261012/README.md). No canonical JSON, research ledger, forms, legacy candidates, recipes, generated Kotlin, plan, roadmap, or application code changed. No tests or emulator checks were run.

## Candidate and disposition

The candidate is the European sea bass, *Dicentrarchus labrax*. OQLF’s preferred Québec food-fish term is **bar commun**; its English entry gives **sea bass**, and the federal fish-name material identifies that name pair with *D. labrax*. Québec retail pages currently list fresh whole fish under **bar commun européen** and frozen fish under **bar commun de la Méditerranée**. Those product pages establish a real local product boundary, but they do not make the broad English query **sea bass** safe as a species assignment in every recipe or product context.

| Prospective ID if the picker boundary is later resolved | Category | Conditional English display | Québec French display | Taxon | Aliases proposed now |
|---|---|---|---|---|---|
| `ingredient-ref-european-sea-bass` | `PROTEIN` | European sea bass | bar commun | *Dicentrarchus labrax* | None while held; if search is later redesigned, `bar commun européen` is a conditional French search alias supported by two Québec-facing seller pages |

This is a conditional identity shape only. Do not create an active reference, legacy candidate, or ledger record from this review. Keep it separate from white bass (*Morone chrysops*), striped bass (*M. saxatilis*), black sea bass (*Centropristis striata*), Asian sea bass/barramundi (*Lates calcarifer*), Japanese sea bass (*Lateolabrax japonicus*), and Patagonian toothfish (*Dissostichus eleginoides*). Do not merge species based on shared names, family, market categories, or recipe resemblance.

## Prior work and archive boundary

The 2026-10-10 finfish-gap review holds the generic **sea bass** family/query and notes European sea bass (*D. labrax*) as one possible future species candidate alongside black sea bass. This packet is a distinct species-level review under that open generic hold; it does not reopen or resolve the generic fish name. The more recent white-bass review concerns *M. chrysops*, and the striped-bass review concerns *M. saxatilis*. Both preserve species boundaries and mention European sea bass only as an excluded neighboring species, not as a prior review or catalog decision.

The active references, forms, legacy candidates, and research ledger contain no exact owner for the proposed ID, candidate ID, taxon, or bilingual name pair. The normalized exact-key audit checked current display names and aliases, form IDs/labels/match terms, legacy IDs/names/aliases, and ledger IDs and evidence strings. A phrase search of the prior proposal and batch archive found no European-sea-bass-specific packet or hold; the existing generic sea-bass hold and the white/striped-bass boundary mentions are the only relevant prior context. The proposed source prefix **`WP04-SECTIONP-EUROPEAN-SEA-BASS-20261012`** was absent from the ledger and prior catalog archive before this proposal was written and occurs only in this packet now.

| Key checked | Exact active reference/form/legacy/ledger owner |
|---|---|
| `ingredient-ref-european-sea-bass`; `candidate-european-sea-bass` | None |
| `sea bass`; `European sea bass`; `bar commun`; `bar commun européen`; `bar commun de la Méditerranée` | None |
| *Dicentrarchus labrax* | None |
| `sea perch`; `white sea perch`; `bar`; `bass`; `corvine`; `loubine`; `loup` | None as exact stored keys; several are broader or rejected terms and are not proposed as aliases |

The terms **European sea bass** and *D. labrax* do occur in earlier proposal prose as examples or explicit species boundaries. Those references do not allocate or hold this species-specific candidate. In particular, `wp04-finfish-gaps-20261010.md` keeps the generic sea-bass boundary open, and `wp04-section-p-striped-bass-picker-boundary-review-20261012.md` excludes European sea bass while reviewing a different taxon.

## Québec and Canadian name and market evidence

OQLF’s edible-fish entry places **bar commun** in ichthyology and food-fish terminology, identifies *Dicentrarchus labrax*, and gives English **sea bass** (along with sea perch and white sea perch). The conditional English display **European sea bass** adds an explicit taxon qualifier; Health Canada describes that English name as used in other jurisdictions, while the CFIA-facing Canadian name is **sea bass**. This display choice should be rechecked if the identity is reconsidered. OQLF labels **bar**, **corvine**, **loubine**, and **loup** as contextual terms not retained by the Québec fish-products terminology committee. The entry says the species has commercial potential in Québec, but it dates to 2011 and is not current inventory evidence. Do not activate the rejected short forms or the broader sea-perch translations as aliases. [S01, S03]

CFIA’s Fish List is the Canadian fish-label naming authority. Its result page for the exact sea-bass query did not render in this review environment; a Health Canada report independently says that the list identifies **Sea Bass / bar commun** as *D. labrax*. The same report distinguishes the accepted name from products that may be sold using similar market wording. The Fish List evidence concerns Canadian common names, not recipe equivalence or guaranteed source-species verification for every retail item. [S02, S03]

Current Québec-facing retail evidence demonstrates a species-qualified product class:

- Mayrand lists **bar commun européen entier frais**, an approximately 1 kg unit, and reports availability at its Anjou, Laval, Brossard, and Saint-Jérôme locations in the retrieved listing. Its page supports Québec consumer wording and a current whole-fresh product; it does not show the scientific name or guarantee later inventory. [S04]
- Metro’s Ocean Jewel listing names **bar commun de la Méditerranée éviscéré avec tête surgelé**, SKU 059371807145, 640 g, and declares *Dicentrarchus labrax* in the ingredient information. It is a specific frozen SKU, not a standard product or kitchen conversion. The search result exposed the product detail, but direct page retrieval returned a cache miss. [S05]
- LeRonier’s French product page lists fresh **bar commun européen**, names *D. labrax*, and offers 600 g, 700 g, 800 g, and 3 kg selections. The page is useful as direct species-name/product evidence; its site-wide delivery statement is not proof of a Québec-specific lot or local retail stock. [S06]

These Québec listings support a distinct *D. labrax* product identity and show why an exact label on a specific package can identify the fish. They do not establish that every unqualified use of **sea bass** or **bar** refers to this taxon.

## Picker projection and search ownership

The static projection follows the current `normalizeIngredientSearchKey` and phrase-first search behavior in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Complete normalized word phrases are returned ahead of substring fallback. This projection is computed from the canonical references and forms, with a hypothetical alias-free `sea bass / bar commun` row added in memory; it is not an app UI test.

| Query | Current result | With the hypothetical row | Boundary |
|---|---|---|---|
| `sea bass` | None | sea bass / bar commun only | A broad English market query becomes species-only. |
| `European sea bass` | None | European sea bass / bar commun only | The species-qualified phrase is currently unowned. |
| `bar commun` | None | European sea bass / bar commun only | A Québec species-qualified phrase would resolve cleanly. |
| `bar commun européen` | None | European sea bass / bar commun only if retained as a conditional French search alias | Exact current Québec-facing product wording is supported by Mayrand and LeRonier. |
| `bar` | 26 substring-fallback results | sea bass / bar commun only | The complete `bar` token in the French display wins and suppresses the broad fallback set. |
| `bass` | 1 substring-fallback result (bottle gourd / courge bouteille) | sea bass / bar commun only | The complete `bass` token wins over the current substring match. |
| `sea perch` / `white sea perch` | None | None | OQLF English translations are not added as aliases; they could widen or confuse perch searches. |
| `loup` | Atlantic wolffish / loup de l’Atlantique | Same existing result | OQLF does not retain `loup` for bar commun fish-product naming; do not create a collision with wolffish. |

The full candidate pair is therefore unsafe to activate under the present search behavior even though the names identify *D. labrax* in official terminology. Search must preserve the broad choices or make species ambiguity visible before the candidate is reconsidered. Do not add `bar`, `bass`, `sea perch`, `white sea perch`, `corvine`, `loubine`, `loup`, `Chilean sea bass`, or regional names for other taxa as aliases. The specific retail phrase `bar commun européen` could be considered only as a full phrase alias if an active row is eventually appropriate; it does not repair the broad-query collision.

## Bundled recipe demand

All **114** manifest-listed recipe files, all **1,123** ingredient rows, and all parsed recipe strings were scanned for complete normalized phrases **sea bass**, **European sea bass**, **European seabass**, **bar commun**, **bar commun européen**, **bar commun de la Méditerranée**, **bar européen**, **sea perch**, **white sea perch**, and *Dicentrarchus labrax*. The broad row/file scan also checked **bar** and **bass**.

**Result: zero matching ingredient rows and zero matching recipe files for the candidate or the broad bass/bar terms.** No recipe link, relink, preparation state, or recipe-specific quantity is supported. The corpus digest is recorded below; it hashes each manifest-relative path, a NUL byte, the exact recipe bytes, and a trailing NUL in manifest order.

## Product states, measurements, and substitutions

The current Québec listings describe whole fresh fish, a frozen headed-and-eviscerated fish, and supplier-selected product weights. Keep these as source-specific market observations only. They do not establish generic forms, net edible amounts, a count-to-mass mapping, package yield, or a serving measure. In particular:

- Mayrand’s approximately 1 kg per-unit listing is for one current whole-fish SKU and location view.
- Metro’s 640 g is the declared package amount for the Ocean Jewel SKU; its head-on/eviscerated state is product-specific.
- LeRonier’s 600/700/800 g and 3 kg options belong to that supplier’s listings and are not transferable portion weights.
- Targeted Canadian Nutrient File searches did not retrieve a species-specific *D. labrax* serving observation. The retrieved CNF entry for “bass, fresh water, mixed species, raw” (food 2986; 79 g per fillet) is a different fish group and is not transferable. [S07]

No species-specific default density, mass-volume relationship, standard fillet weight, edible yield, cooking yield, or recipe measure is supported. If search later permits an identity row, leave `defaultDensity` null and `unitMappings` empty unless new source evidence meets the catalog’s separate activation requirements. Add no forms or package-yield records from this identity review.

No bundled recipe requests this fish, and the reviewed naming, retail, and government sources do not establish a directed, method-scoped home-recipe substitution to white bass, striped bass, black sea bass, cod, or generic white fish. Do not infer interchangeability from shared market words, flesh description, family, or culinary use. Add no global or contextual substitution, recipe-line substitution, conversion, or safety/cooking claim.

## Live snapshot, hashes, and uniqueness

Snapshot recomputed from the current worktree on 2026-10-12. Hashes cover exact file bytes.

| Artifact | Live count | Bytes | SHA-256 |
|---|---:|---:|---|
| `ingredient-references.v1.json` | 1,323 references | 423,574 | `86076e7b58fe1d06889f15792a0d2928f69951582bc0d39aaa13a3f7f54f3835` |
| `ingredient-forms.v1.json` | 98 forms | 73,589 | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates | 15,264 | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,631 records; 6,000 source entries; 5,017 distinct source IDs | 5,955,122 | `95da8ee4b608a3a8bc3cac26205762222765e7dfb5c72b6620aaff01a51fea84` |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | 753,792 total recipe bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| `BundledIngredientCatalog.kt` | Generated catalog index | 579,852 | `9eff5dce691429d43cfc0c13a1feeac55c04c200f3615eaae03b0f713f0ac55d` |
| `substitution-rules.v1.json` | 0 global rules | 3 | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| `contextual-substitution-rules.v1.json` | 0 contextual rules | 3 | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |

The candidate ID, alternate legacy-candidate ID, exact bilingual key, and proposed source prefix are unowned in active references, forms, legacy candidates, and ledger records. The generic query terms remain unallocated. No ledger/source allocation was made because this packet is proposal-only and recommends a hold.

## Sources and access limits

Sources were accessed on 2026-10-12. Proposal-local source IDs are not ledger allocations.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-EUROPEAN-SEA-BASS-20261012-S01** | OQLF, [bar commun (Grand dictionnaire terminologique)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198933/bar-commun) | Preferred Québec edible-fish term; English **sea bass**, **sea perch**, and **white sea perch**; taxon *D. labrax*; says short `bar`, `corvine`, `loubine`, and `loup` were not retained for fish-product names. Last updated 2011; terminology, not current inventory. |
| **WP04-SECTIONP-EUROPEAN-SEA-BASS-20261012-S02** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) and [sea-bass query endpoint](https://active.inspection.canada.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Sea%20Bass) | The list supplies Canadian fish-labelling common names and species identifiers. The exact query endpoint did not render in this review environment; the name/taxon pairing is corroborated by S01, S03, and S05. No recipe or substitution implication. |
| **WP04-SECTIONP-EUROPEAN-SEA-BASS-20261012-S03** | Health Canada, [Updating the Existing Risk Management Strategy for Mercury in Retail Fish](https://www.canada.ca/en/health-canada/services/food-nutrition/reports-publications/updating-existing-management-strategy-mercury-fish.html) | Section 3.4.7 identifies the CFIA name `Sea Bass / bar commun` as *D. labrax* and says that samples sold as “sea bass” from varied origins were probably a mix that could include European sea bass, black sea bass, and Patagonian toothfish. This is historical surveillance: its references state online materials were last accessed in 2007. Use it as a market-name caution, not current prevalence, mercury advice, or a culinary claim. |
| **WP04-SECTIONP-EUROPEAN-SEA-BASS-20261012-S04** | Mayrand, [Bar commun européen entier frais](https://mayrand.ca/fr/nos-produits/poissonnerie/poissons-a-larrivage/bar-commun-europeen-entier-fr-54003) | Québec-market whole-fresh listing, approximately 1 kg per unit, with availability shown at four Québec stores in the retrieved listing. Product wording and amount are SKU/location-specific; the page does not give a scientific name or standard measure. |
| **WP04-SECTIONP-EUROPEAN-SEA-BASS-20261012-S05** | Metro, [Ocean Jewel bar commun de la Méditerranée, headed and eviscerated, frozen](https://api.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/emballes-et-en-vrac/bar-commun-de-la-mediterranee-eviscere-avec-tete-surgele/p/059371807145) | Product page/search output identifies SKU 059371807145, 640 g and an ingredient declaration naming *D. labrax*. Supports one French Québec-market packaged product; not a general unit mapping. Direct page retrieval returned a cache miss, so the indexed result is recorded with that limitation. |
| **WP04-SECTIONP-EUROPEAN-SEA-BASS-20261012-S06** | LeRonier, [Bar commun product page](https://leronier.ca/fr/products/common-bass) | French-facing seller page says fresh **bar commun européen**, names *D. labrax*, and lists 600 g, 700 g, 800 g, and 3 kg options. Supplier-specific sizes; site-wide Canada delivery does not prove local Québec stock or a universal measure. |
| **WP04-SECTIONP-EUROPEAN-SEA-BASS-20261012-S07** | Health Canada Canadian Nutrient File, [food 2986 serving sizes](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=2986) | The retrieved “bass, fresh water, mixed species, raw” entry gives 1 fillet = 79 g. It is not marine *D. labrax* and is included only to document why the generic CNF observation is excluded. |

## Static checks

- Parsed the current reference, forms, legacy-candidate, ledger, manifest, and substitution-rule JSON files and recomputed the counts and byte hashes above.
- Mirrored the Kotlin normalization and phrase-first/substring-fallback search projection for the listed queries; no catalog files were modified.
- Scanned every manifest-listed recipe file, ingredient row, and parsed recipe string; the species-specific and broad bass/bar demand counts are zero.
- Confirmed the proposal path and source prefix were unused before writing, and confirmed no exact candidate identity key is allocated in the live references, forms, legacy candidates, or ledger.
- Checked this proposal as strict UTF-8 without BOM, with final newline, no trailing whitespace, and no common mojibake markers.
- No app tests or emulator checks were run; this is a proposal-only documentation change.
