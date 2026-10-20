# WP03 Section F: quick-cooking barley identity review

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Integrated on 2026-10-12. The live catalog and ledger now contain the accepted identity and its bounded evidence; this reconciliation edits this proposal only.
- **Scope:** One plain, preprocessed barley product sold as quick-cooking barley; its product boundary, bilingual naming, current catalog ownership, bundled recipe demand, and numeric/form/substitution evidence.
- **Plan context:** Section F keeps regional cereal mixes and preprocessed grains open ([global plan, line 2146](../../RecipeBook-global-ingredient-catalog-plan.txt#L2239)). The barley-flake, cream-of-barley, pot-barley, puffed-barley, and sprouted-barley reviews concern different products; none resolves this product's process or name.
- **Integrated recommendation:** The live catalog contains one identity-only `GRAIN_AND_CEREAL` reference, **`quick-cooking barley / orge à cuisson rapide`**, with no aliases. Its identity is limited to the documented whole-kernel, hull-less barley product that is pre-cooked in water, dried, and marketed by its Canadian manufacturer as quick-cooking barley. The catalog has no forms, density, unit mappings, recipe links, conversions, package yields, or active substitutions. The ledger retains one SKU-specific 50 g / ½ cup portion observation; the source leaves the cup convention and preparation state unspecified, so it does not support a generic conversion.

## Product identity and boundary

Progressive Foods' Snappy Grains pages describe a human-food whole-grain barley product that cooks in 10 minutes. The manufacturer says it uses hull-less barley grown by Canadian farmers; its product page identifies the grain as pre-cooked and says no additives or preservatives are used. Its process account says the kernels are lightly scratched, cooked in water, dried, and packaged. Alberta's government agri-food export catalogue independently lists the producer's Natural and Organic Barley in a Snap products and the ten-minute cooking claim. Together, these sources support a distinct preprocessed-grain product identity. They do not establish that every product called “quick-cooking barley” uses the same grain, process, or preparation.

The French name has two different kinds of support. A Canadian Intellectual Property Office trademark-journal entry for the manufacturer's `SNAPPY GRAINS` filing lists `orge à cuisson rapide` in its French goods description. OQLF supports `orge` as the preferred feminine term for the plant and grain, but does not standardize this processed-product compound. Metro Québec's indexed French listing names a 400 g Snappy Grains item `Orge`; the direct page redirected to an English page during this review, so it does not independently attest the full compound `orge à cuisson rapide`. I use the CIPO wording as a manufacturer-submitted Canadian product description, not as an OQLF ruling or a confirmed current package label.

| Neighboring identity | Boundary retained |
|---|---|
| `ingredient-ref-hulled-barley` — `hulled barley / orge mondé` | The Snappy product is described as hull-less and separately processed by cooking and drying. Do not treat it as a synonym or cooking form of hulled barley. |
| `ingredient-ref-pearl-barley` — `pearl barley / orge perlé` | The manufacturer contrasts its product with pearl barley; no pearl-barley processing or equivalence is established. |
| `ingredient-ref-pot-barley` — `pot barley / orge en pot` | Keep the existing pot-barley identity and its unresolved naming questions separate. |
| `ingredient-ref-barley-flakes`, `ingredient-ref-puffed-barley`, `ingredient-ref-sprouted-barley` | Flaked, puffed, and sprouted/dried products have different processing boundaries. |
| `ingredient-ref-cream-of-barley-cereal` | A ground hot cereal is not whole barley kernels sold for cooking. |
| Barley flour and roasted/malted barley flours | Milled products remain separate from whole kernels. |

The product's brand, organic claim, selected barley variety, 400 g package, and availability are not part of the generic identity. Do not claim that all hull-less barley is pre-cooked or that all “quick-cooking barley” uses this exact manufacturer's process.

## Integrated reference fields

| Field | Integrated value | Evidence boundary |
|---|---|---|
| ID | `ingredient-ref-quick-cooking-barley` | Integrated as the live reference ID and ledger record ID. |
| English display | `quick-cooking barley` | Exact product wording used by Progressive Foods/Snappy Grains. It is supported as this documented processed product, not as a universal barley class definition. |
| French display | `orge à cuisson rapide` | Exact phrase in the manufacturer's Canadian trademark goods filing; OQLF supports the base noun `orge`. This is not an OQLF-preferred processed-product term. |
| English aliases | None | Do not add the brand, `barley in a snap`, or unsupported generic variants. |
| French aliases | None | Do not infer `orge précuite`, `orge précuite et séchée`, or another compound from the process description. |
| Category | `GRAIN_AND_CEREAL` | Plain human-food whole-kernel cereal product. |
| Density and unit mappings | `defaultDensity: null`; `unitMappings: []` | No reusable mass-volume relation is established. |
| Catalog forms, conversions, yields, recipe links, active substitutions | None | The reviewed product is defined by its pre-cooked/dried product identity; source-specific instructions do not establish generic rules. |
| Ledger portion observation | S07's 50 g / ½ cup serving for the manufacturer's Hilose product | Retained only as a SKU-specific `portion_weight` observation. Cup convention, measurement method, and preparation state are unspecified; no generic conversion or active mapping is inferred. |

## Exact ownership and picker boundary

I checked the live reference names and aliases, form labels and match terms, all 64 current legacy candidates, ledger record IDs, and prior Section F proposal/batch history using the repository's accent-, case-, punctuation-, and spacing-folding key. The integrated reference and ledger record now own `quick-cooking barley`, `quick cooking barley`, and `orge à cuisson rapide`. No other active reference, form, or legacy candidate owns the product name or integrated ID. The seven `WP03-QCBARLEY-20261012-S01` through `-S07` source IDs are now allocated to the accepted ledger record and each occurs exactly once in its `sources` list. The prefix is no longer unallocated. Repository text search found no separate quick-cooking-barley hold.

The nearest active rows remain separate: hulled barley, pearl barley, pot barley, barley flakes, cream of barley cereal, puffed barley, sprouted barley, and distinct barley flours. There is no generic barley-grain row. Broad `barley` and `orge` searches remain non-unique at 12 identities each.

The table is a static evaluation of the current `IngredientSearch.kt` word-phrase-first and substring-fallback behavior using the live references/forms, including the integrated reference. It is not a runtime picker result.

| Query | Live results after integration |
|---|---:|
| `quick-cooking barley` / `quick cooking barley` | `ingredient-ref-quick-cooking-barley` only |
| `orge à cuisson rapide` | `ingredient-ref-quick-cooking-barley` only |
| `quick-cook barley`, `quick cook barley`, `barley in a snap`, `pre-cooked barley`, `precooked barley`, `orge cuisson rapide`, `orge précuite` | 0 |
| `barley` | 12 identities, including the new identity |
| `orge` | 12 identities, including the new identity |
| `pearl barley` | `ingredient-ref-pearl-barley` only |
| `hulled barley` | `ingredient-ref-hulled-barley` only |
| `Snappy Grains` | 0; the brand is not an alias |

## Full bundled-recipe audit

I parsed every recipe path listed in the manifest and checked full serialized recipe JSON and the structured ingredient rows. The candidate phrase set included `quick-cooking barley`, `quick cooking barley`, `quick-cook barley`, `quick cook barley`, `barley in a snap`, `Snappy Grains barley`, `pre-cooked barley`, `precooked barley`, `orge à cuisson rapide`, `orge cuisson rapide`, `orge précuite`, `orge pré-cuite`, `orge Snappy Grains`, and `orge prête en 10 minutes`.

| Search result | Count |
|---|---:|
| Matching files | 0 / 114 |
| Matching ingredient rows | 0 / 1,123 |
| Existing recipe links to a quick-cooking-barley reference | 0 |

The corpus does not request this product. No recipe line, amount, form hint, or substitution is proposed. Brand cooking suggestions do not supply recipe demand.

## Forms, measurements, and substitutions

- **Forms:** Add no `IngredientForm` under hulled, pearl, or pot barley. The reviewed product is whole-grain hull-less barley that the manufacturer pre-cooks in water and dries as the marketed product. The evidence does not establish a reusable state-form mapping from any active barley reference.
- **Cooking time:** The manufacturer says this product is ready in 10 minutes. This is product-specific preparation guidance, not a generic barley cooking time or a conversion/yield rule.
- **Serving observation:** The ledger records the manufacturer's 50 g (½ cup) serving only as a SKU-specific `portion_weight` observation for its Hilose product. The source does not specify the cup convention or measurement method, and whether the cup is measured before or after preparation is unspecified. The observation is not a default density, unit mapping, or generic household measure.
- **Package:** Metro's indexed Québec listing gives a 400 g package for product 814698001009. Package net weight is not a serving or cooking yield. The page showed out of stock when reviewed; this review makes no current-availability claim.
- **Water binding and substitutions:** The manufacturer says its product has up to three times the water-binding capacity of pearl barley and describes it as an alternative to rice, potatoes, or pasta. The ledger retains these promotional alternatives as `blocked_pending_evidence`: there is no recipe-specific replacement quantity, preparation method, or tested equivalence. No global or contextual substitution rule or amount ratio is active.
- **Other numeric or process claims:** The source describes a particular hull-less barley variety and a proprietary treatment. Do not generalize its cultivar, nutrition, process, or cooking time to other barley products.

## Current package and ledger snapshot

Read-only snapshot of the live worktree on 2026-10-12. File hashes are SHA-256 over exact bytes. The recipe-corpus digest hashes each manifest-relative recipe path, a NUL byte, its exact bytes, and a trailing NUL byte in manifest order.

| Artifact | Current count/state | SHA-256 or corpus digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,322 references; 138 `GRAIN_AND_CEREAL` | `6dbbf6e07afe5c4bffde815065d5eaf377e3b5446c068bab0d8965b5df711545` |
| `ingredient-forms.v1.json` | 98 forms | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,630 records; 5,992 source entries; 5,009 distinct source IDs; 8 unit conversions | `c78b083f60d80d623805af87f2b4283811a55495ed4d5c11433a01742e174b13` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Generated `BundledIngredientCatalog.kt` | 1,322 references | `2c1988ca630ddbca1174eba71d9fd574d23a11b441615d468a03a3bd0ac9b2fd` |
| `package-yields.v1.json` | 1 entry | `5aee6b94cae0c25128ec5c99583089927c945a3438178065bff08b2b0e0d0c2b` |
| `substitution-rules.v1.json` | 0 global rules | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| `contextual-substitution-rules.v1.json` | 0 contextual rules | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,792 recipe bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

## Proposal source register

Sources were reviewed on 2026-10-12. The prefix `WP03-QCBARLEY-20261012` is allocated to the integrated ledger record `ingredient-ref-quick-cooking-barley`. Its seven source IDs below are each recorded exactly once in that record's source list.

| Source ID | Source and locator | Evidence and limit |
|---|---|---|
| `WP03-QCBARLEY-20261012-S01` | Progressive Foods / Snappy Grains, [manufacturer product page](https://snappygrains.ca/) | Names the product `quick-cooking barley`, says it is pre-cooked, made from whole-grain hull-less barley grown by Canadian farmers, and contains no additives or preservatives. Gives a ten-minute cooking claim. It does not define other manufacturers' products or establish a universal process. The live page retains a 2017 copyright notice. |
| `WP03-QCBARLEY-20261012-S02` | Progressive Foods / Snappy Grains, [Our Story and process description](https://snappygrains.ca/?page_id=177) | Says the hull-less barley is lightly scratched, cooked in water only, then dried and packaged, and that the 2016 launch included natural and organic product lines. This supports the named product's process; it is not a process standard for quick-cooking barley generally. The page carries a 2017 copyright notice. |
| `WP03-QCBARLEY-20261012-S03` | Government of Alberta, [Agri-Food Products and Services Export Catalogue: Progressive Foods Inc.](https://www.alberta.ca/ag-export-catalogue-progressive-foods-inc) | Lists Natural and Organic Barley in a Snap as Progressive Foods cereal products and says the barley cooks in ten minutes. It corroborates the producer/product line; it does not prove current retail stock in Québec or provide a consumer French name. |
| `WP03-QCBARLEY-20261012-S04` | Canadian Intellectual Property Office, [Trade-marks Journal, application 1,764,492, 2017-08-16](https://www.ic.gc.ca/opic-cipo/tmj/eng/view.html?edition=08-16&file=Journal_fr.html&year=2017) | The Progressive Foods `SNAPPY GRAINS` entry includes `orge à cuisson rapide` in its French goods description. This is a historical applicant-submitted product description, not an OQLF terminology ruling, direct package text, or evidence of present stock. |
| `WP03-QCBARLEY-20261012-S05` | Office québécois de la langue française, [orge (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8880282/orge) | Gives preferred feminine `orge` and English `barley`, and notes the term applies to the plant and grain. It does not name or classify quick-cooking barley. |
| `WP03-QCBARLEY-20261012-S06` | Metro Québec, [Snappy Grains barley, product 814698001009](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/pates-riz-et-feves/quinoa-et-grains-de-specialite/orge/p/814698001009) | The French indexed result names `Orge Snappy Grains 400 g`, gives a ten-minute claim, and showed the product out of stock. Direct access redirected to an English listing titled `Barly`; rely on the indexed French result only for local product context and SKU, not a verified active French package label or stock claim. |
| `WP03-QCBARLEY-20261012-S07` | Progressive Foods / Snappy Grains, [Eat Well product page](https://snappygrains.ca/?page_id=146) | The ledger retains the manufacturer's 50 g (½ cup) Hilose-product serving only as a SKU-specific `portion_weight` observation. The cup convention, measurement method, and preparation state are unspecified. The page also promotes alternatives and greater water binding, but provides no recipe-specific replacement quantity or tested equivalence; the ledger finding remains blocked. |

## Static checks performed

- Parsed the live references, forms, manifest, legacy-candidate data, research ledger, package-yield file, and both substitution-rule files; recomputed the counts and exact-byte hashes shown above. Confirmed the accepted reference is present with no aliases, density, or unit mappings, and the ledger record has identity `verified`, measurement research `researched_supported`, and substitution research `blocked_pending_evidence`.
- Checked the integrated ID and bilingual/product phrase keys against active reference names/aliases, form labels/match terms, all 64 legacy candidates, and ledger IDs. Verified the adjacent barley rows remain separately owned and no quick-cooking-barley form or legacy candidate exists.
- Evaluated the current search implementation's phrase-first and substring behavior statically against live reference/form data; recorded the post-integration results above. Confirmed all seven prefix source IDs occur exactly once in the integrated ledger record.
- Reparsed all 114 manifest recipes and 1,123 ingredient rows, recomputed the corpus digest, and scanned full recipe JSON and ingredient rows for the listed candidate phrases; found zero hits.
- Checked that the seven source IDs are allocated to the integrated ledger record and that no duplicate source entry exists for them.
- Checked this proposal for UTF-8 decoding, no BOM, a final newline, trailing whitespace, and listed mojibake markers. No app, unit, instrumentation, or emulator tests were run; the integration only added database JSON data, which the user's `AGENTS.md` rule exempts from testing.

## Disposition

The identity-only `GRAIN_AND_CEREAL` row **`quick-cooking barley / orge à cuisson rapide`** is integrated with no aliases, forms, catalog measures, density, mappings, conversions, yields, recipe links, or active substitutions. The ledger's 50 g / ½ cup observation is SKU-specific; its cup convention and preparation state are unspecified. Promotional alternatives remain blocked. The evidence supports a narrowly documented whole-kernel, hull-less barley product that is pre-cooked and dried; it does not justify generalizing the manufacturer's precise process, Hilose variety, 10-minute timing, serving observation, or water-binding statement to barley generally. Preserve the current hulled, pearl, pot, flaked, puffed, sprouted, hot-cereal, and flour identities. The complete bundled recipe corpus contains no current demand. No app, unit, instrumentation, or emulator tests were run under the user's database-JSON testing rule.
