# WP02 B2 — hemp flour identity boundary

- **Reviewed:** 2026-10-12.
- **Status:** Proposal only. No canonical catalog, ledger, recipe, plan, roadmap, workflow, or generated file was changed.
- **Scope:** One unreviewed B2 seed-derived flour identity: current Canadian and Québec wording for hemp flour, its product boundary from whole hemp seeds and hulled hemp hearts, exact picker ownership, recipe demand, and numeric/substitution limits.
- **Source IDs:** `WP02-B2-HEMP-FLOUR-IDENTITY-20261012-S01` through `S05`. These IDs are local to this proposal; the prefix was absent from the ledger and proposal/batch archive at review time.

## Recommendation

**Accept one identity-only `FLOUR_AND_STARCH` candidate: `hemp flour / farine de chanvre`.** A current Québec producer sells the exact bilingual product names and describes its flour as stone-ground hemp press-cake. The Québec Food Directory independently lists the 400 g Cuisine Soleil flour product and its declared serving of 1/4 cup (30 g). Health Canada names hemp flour as an industrial-hemp derivative. Together, these sources establish a current food-milling product with usable English and Québec French displays, separate from whole hemp seeds and hulled hemp hearts. [S01–S04]

Keep both alias arrays empty. The canonical displays themselves are the current producer's product-page headings. Do not add `organic hemp flour` or `farine de chanvre biologique` as aliases: those are product-certification wording, not a distinct flour name. Do not attach flour wording to either seed identity. [S01–S03; prior WP03 seed review]

The accepted row is a discovery identity only. Cuisine Soleil says its press-cake product is lower in fat than other hemp flours made from seed itself, so the name does not prove a common oil-removal process or uniform composition. Retain this observation in the research evidence; create no separate full-fat/defatted identity, flour form, density, unit mapping, recipe link, conversion, yield, or substitution until a source-backed need defines one. [S01–S02]

| Candidate or phrase | Disposition | Scope |
|---|---|---|
| `ingredient-ref-hemp-flour` | **Accept as the new candidate**, category `FLOUR_AND_STARCH`. | English display `hemp flour`; fr-CA display `farine de chanvre`; aliases `[]` / `[]`; `defaultDensity: null`; `unitMappings: []`. Covers hemp-seed-derived food flour marketed as flour, without asserting a shared press-cake, fat, protein, or baking specification. |
| Whole hemp seeds | Keep `ingredient-ref-whole-hemp-seeds` unchanged. | Preserve its whole-qualified names and aliases. Do not put `hemp flour`, `hemp meal`, or `farine de chanvre` on this seed row. |
| Hulled hemp hearts | Keep `ingredient-ref-hemp-hearts` unchanged. | Preserve its hulled-qualified names and aliases. Flour is a milled product, not a hulled-seed synonym. |
| Full-fat, pressed, deoiled, or protein-rich hemp-flour grades | **Hold as separate identities/forms and aliases.** | The current Québec producer documents a process difference but no stable Canadian product-grade vocabulary or common performance class. Do not invent a French compound such as `farine déshuilée de chanvre`. |
| `hemp meal`, `hemp seed meal`, `hemp protein powder`, `farine de tourteau de chanvre` | **Keep unassigned.** | Current evidence does not establish these as synonyms for the exact food flour display. The maker's `press-cake` wording describes how its flour is made; it is not a marketed alternate name. |

## Coverage and prior-decision audit

The active plan's open WP02 Section B item covers alternative flours and regional starch products, but its reviewed flour list and later B2 additions do not include hemp flour. The live references contain two hemp food identities, both still categorized `NUT_SEED_AND_DRIED_FRUIT`: `ingredient-ref-hemp-hearts` and `ingredient-ref-whole-hemp-seeds`. There is no hemp flour reference, form, legacy candidate, or ledger record. The active plan and archive do not contain a prior WP02 hemp-flour review.

One adjacent WP03 proposal, [`wp03-flax-hemp-poppy-seed-gap-review-20261010.md`](wp03-flax-hemp-poppy-seed-gap-review-20261010.md), says hemp flour/meal must not be added as aliases to the seed identity. That is preserved here: the proposed flour is a separate milling-product row, not a seed alias. The two existing hemp-seed ledger records also require whole/hulled terms to remain qualified. Nothing in those decisions assesses or rejects a separate flour identity.

The plan and live corpus were rechecked for the candidate and nearby phrases before drafting. In the proposal/batch archive the only exact `hemp flour` mention is the WP03 no-alias boundary above; no earlier WP02 proposal or batch covers the flour product. The proposed ID and source-ID prefix are absent from active references, forms, legacy candidates, ledger, and manifest.

## English and Québec French naming

Cuisine Soleil's live English page is headed **“Hemp flour”**; its French page is headed **“Farine de chanvre.”** The pages identify the product as flour, offer delivery in Québec and Ontario, and describe the hemp as grown in Québec. These are current producer product names and support the concise bilingual display pair. [S01–S02]

The Québec Food Directory lists the maker's product in English as **“Organic Hemp Flour,”** while current French product-finder listings use **“Farine de chanvre”** and **“Farine de chanvre biologique.”** The directory's package description and organic certification do not establish `organic` as part of the ingredient identity. Use the unqualified local French product heading and leave certification wording out of aliases. [S03–S04]

No exact `farine de chanvre` entry surfaced in the bounded OQLF/TERMIUM search. This proposal therefore treats the Québec maker's live bilingual product page as market-language evidence; it does not claim an OQLF-preferred term. No botanical or drug-related wording is proposed as a recipe-picker alias.

## Product identity and process boundary

Cuisine Soleil states that its hemp flour is stone-ground from hemp press-cake and that it is less fatty than other hemp flours made from the seed itself. This supports at least one commercially named press-cake flour and establishes that “hemp flour” can cover products with different oil/fat states. It does not identify a standardized degree of pressing, residual oil, particle size, or flour performance, and it does not name the other product class precisely. [S01–S02]

Health Canada's industrial-hemp FAQ lists hemp flour among derivatives of industrial hemp. It does not define the flour's food standard, processing method, or seed preparation; those details remain limited to the maker's statement. This separate flour identity does not broaden the active seed rows to unqualified `hemp` or `chanvre`. [S05]

| Wording or product | Disposition | Reason |
|---|---|---|
| `hemp flour` / `farine de chanvre` | **Accept as the proposed displays** for one new flour reference. | Exact current bilingual Québec producer headings. |
| `organic hemp flour` / `farine de chanvre biologique` | Keep outside the alias lists. | Current package/certification wording qualifies the producer's product; “organic” is not a flour type. The core product headings already resolve to the candidate. |
| `hemp press-cake flour`; `hemp seed flour`; `farine de tourteau de chanvre`; `farine de graines de chanvre` | Do not add as aliases. | The first is a descriptive process phrase in the maker's English copy, not its page heading; the French compounds were not found as current product titles. The available sources do not establish that these phrases have one market-wide scope. |
| `hemp meal`; `hemp protein powder`; `hemp hearts`; `whole hemp seeds` | Keep separate or unassigned as above. | Meal and protein-powder terms are not established synonyms; whole and hulled seed identities already have separate owners. |

## Live catalog, collision, search, and recipe audit

Read-only snapshot of the shared worktree on 2026-10-12. Counts and hashes identify the exact files used for this review; the worktree is shared and may change after this snapshot.

| Surface | Count | SHA-256 |
|---|---:|---|
| Active ingredient references | 1,292 | `02ee85fb3179af8c13707984d3de5d12c163b88e68f2a21062c4f643355b02b3` |
| Ingredient forms | 98 | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import candidates | 64 | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research-ledger records | 1,600 | `fd07c886184ae131084d272924feb92b42f5eacbe8644359e5d51898cf4aa125` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipes | 114 files / 1,123 ingredient rows / 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The recipe-set digest is SHA-256 over each manifest-relative path, a NUL byte, the exact recipe-file bytes, and a trailing NUL byte, in manifest order. Exact candidate ownership was checked across active reference names/aliases, form labels/match terms, legacy names/aliases, and ledger records. Exact candidate-ID and source-prefix checks were also run on those surfaces.

### Exact phrase ownership and expected picker results

The check mirrors `normalizeIngredientSearchKey` and `IngredientReferenceSearchIndex`: lowercase with Unicode NFKD/accent folding, normalize punctuation/spacing, then prefer contiguous full-word phrase matches before substring fallback. Current ownership was:

| Query | Current exact phrase owners | Proposed result after integration |
|---|---|---|
| `hemp flour` | None | New `ingredient-ref-hemp-flour` only. |
| `farine de chanvre` | None | New `ingredient-ref-hemp-flour` only. |
| `organic hemp flour`; `farine de chanvre biologique`; `hemp seed flour`; `farine de graines de chanvre`; `hemp meal`; `hemp protein powder` | None | Remain unassigned because no aliases are proposed. |
| `hemp hearts`; `graines de chanvre décortiquées` | `ingredient-ref-hemp-hearts` | Existing hearts row only. |
| `whole hemp seeds`; `graines de chanvre entières` | `ingredient-ref-whole-hemp-seeds` | Existing whole-seed row only. |
| Broad one-word `hemp`; `chanvre` | Both existing hemp rows | Three rows after the new flour is added; this is an expected broad query and does not alter the exact qualified queries above. |

The French and English broad word queries remain multi-result searches. No alias `hemp`, `chanvre`, `hemp seeds`, or `graines de chanvre` is proposed. This protects the current whole-versus-hulled distinction and lets the flour's full qualified displays resolve independently.

### Recipe demand

All 114 manifest-listed recipe JSON files and all 1,123 ingredient rows were scanned. Full recipe JSON and ingredient `ingredientName`/`originalText` fields were checked for `hemp flour`, `hemp seed flour`, `hemp meal`, `hemp protein powder`, `farine de chanvre`, `farine de chanvre biologique`, `farine de graines de chanvre`, and `farine de tourteau de chanvre`. Each phrase had **zero recipe-file hits and zero ingredient-row hits**. No ingredient row links to either existing hemp reference. The maker's flour-blend recipe is product-use evidence, not bundled-library demand; add no recipe links or relinks.

## Numeric and substitution limits

The Québec Food Directory reports the Cuisine Soleil SKU `851424000233`, 400 g, at **1/4 cup (30 g)**. This is one product-specific label observation from the directory's GS1-sourced record. It gives no fill/level method or reusable volume specification. Record it only as a source-specific observation if the candidate is integrated; do not set `defaultDensity`, infer g/mL, or add a generic volume-to-mass `unitMapping`. [S03]

Cuisine Soleil's “create an all-purpose mix” section recommends 1%–15% hemp flour in its own three-step blend. The source does not specify a general one-for-one replacement for wheat flour or other flour, and its formula is not a catalog conversion. Add no global or contextual substitution rule. [S01–S02]

No universal mass-per-cup value, density, yield, form conversion, or substitution ratio is established. The producer's process and fat-content comparison warns against transferring any single SKU's measurements or behavior to all hemp flours.

## Exact integration delta if accepted

1. Add one `FLOUR_AND_STARCH` reference with ID `ingredient-ref-hemp-flour`, `nameEn: "hemp flour"`, `nameFr: "farine de chanvre"`, `aliasesEn: []`, `aliasesFr: []`, `defaultDensity: null`, and `unitMappings: []`.
2. Add a new research-ledger identity record with sources S01–S05 and preserve the process/composition, measurement, recipe-demand, and substitution limits in this review. Do not modify the existing hemp-seed or hemp-hearts records except to cross-reference this separate candidate if the maintainers require it.
3. Regenerate the derived ingredient search index from the canonical references. Do not hand-edit generated search data.
4. Add no ingredient form, organic qualifier alias, package measure, density, unit mapping, recipe link, conversion, yield, or substitution rule. Keep the broader B2 checklist open.

## Sources

All pages were accessed on **2026-10-12**. The source IDs below are proposal-local, not shared ledger records.

| ID | Source and evidence | Limits |
|---|---|---|
| **WP02-B2-HEMP-FLOUR-IDENTITY-20261012-S01** | Cuisine Soleil, [Hemp flour](https://cuisinesoleil.com/en/product/hemp-flour/). Current English product-page heading and description; shows sale page for Québec/Ontario delivery, calls the product organic hemp flour, says it is stone-ground from hemp press-cake, contrasts it with other hemp flour made from the seed itself, and says the hemp is grown in Québec. The same page's all-purpose-mix section gives a 1%–15% blend range. | Manufacturer description is SKU-specific; it gives no general process specification, flour-grade threshold, household measure, or replacement ratio. The blend range belongs only to this maker's blend. |
| **WP02-B2-HEMP-FLOUR-IDENTITY-20261012-S02** | Cuisine Soleil, [Farine de chanvre](https://cuisinesoleil.com/produit/farine-de-chanvre/). Current French product-page heading and description; uses the exact fr-CA product name and `tourteau de chanvre` as its process description, identifies Québec-grown hemp, and gives its own blend instructions. | Product wording, process, and usage claims are maker-specific; `tourteau` is not proposed as an alias. |
| **WP02-B2-HEMP-FLOUR-IDENTITY-20261012-S03** | Government of Québec, [Répertoire des aliments québécois: Organic Hemp Flour](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8223775). GS1-sourced product record for Cuisine Soleil / Moulin A. Coutu (2002) inc., GTIN 851424000233, net 400 g, ingredient organic hemp flour, declared 1/4 cup (30 g), and last-updated date 2026-04-09. | Product record and serving are SKU-specific. The page states MAPAQ is not responsible for the information's accuracy; no cup-filling method or general flour density is supplied. |
| **WP02-B2-HEMP-FLOUR-IDENTITY-20261012-S04** | Celiac Canada, [GF Product Finder](https://www.celiac.ca/gf-product-finder/), current product list. Lists Cuisine Soleil `Farine de Chanvre` in 400 g and 20 kg packages, plus Québec-market `Farine de chanvre biologique` listings for La Minoterie des Anciens and Pure Gaspésie. | Directory listings corroborate Canadian/French product names and pack listings, not current shelf stock, composition, process, or flour equivalence. |
| **WP02-B2-HEMP-FLOUR-IDENTITY-20261012-S05** | Health Canada, [Hemp and the hemp industry: Frequently Asked Questions](https://www.canada.ca/en/health-canada/services/drugs-medication/cannabis/producing-selling-hemp/about-hemp-canada-hemp-industry/frequently-asked-questions.html). Under “What is industrial hemp?”, includes hemp flour as an example of an industrial-hemp derivative. | Regulatory context only; does not define a food-flour process, name a flour grade, or support a recipe measure or substitution. |

**Decision:** Accept the separate `hemp flour / farine de chanvre` identity candidate with empty aliases and no active numeric or recipe behavior. Preserve the existing whole-seed and hemp-hearts identities. Hold process-qualified grades, unverified meal/protein synonyms, and all reusable measure/substitution data.
