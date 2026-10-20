# WP03 Section F R522 — Honey Bunches of Oats cereal identity review (2026-10-17)

**Integration status:** Integrated. See the [R522 integration README](../batches/wp03-section-f-honey-bunches-of-oats-cereal-identity-integration-r522-20261017/README.md).

## Scope and recommendation

The open [Section F cereal and preprocessed-grain review](../../RecipeBook-global-ingredient-catalog-plan.txt#L15610) calls for continued coverage of distinct, source-backed grain products. After the [R516 Sugar Crisp review](wp03-section-f-next-gap-review-r516-20261017.md) and [R519 Honeycomb review](wp03-section-f-next-gap-review-r519-20261017.md), this review selects three current Canadian Honey Bunches of Oats finished-cereal products with product-specific English and Canadian French manufacturer pages.

**Recommend three separate, bilingual, identity-only `GRAIN_AND_CEREAL` references:** Honey Roasted, with Almonds, and with Real Strawberries. They are separately formulated finished products, not forms of one ingredient. Keep each as its own picker result; add no aliases, forms, package or household measures, mappings, density, conversions, yields, recipe links, or substitutions. This proposal covers the three product identities directly supported by current product pages; it does not claim to enumerate every historical, international, or future Honey Bunches of Oats product.

At proposal review, the live snapshot was **1,793 ingredient references / 143 forms / 56 legacy candidates; 2,150 ledger records / 9,866 source entries / 8,350 distinct source IDs / 7,060 distinct URLs**. The R516 and R519 proposals document the adjacent cereal decisions.

## Product evidence and exact proposed fields

Post Consumer Brands Canada describes Honey Bunches of Oats as a finished cereal with crunchy oat clusters, four grains, and honey. Its Canadian English product pages currently name Honey Roasted, with Almonds, and with Real Strawberries; their Canadian French counterparts use the family name **Bouchées d’avoine au miel** and give product-specific French titles. Listed package sizes vary by product and remain package information, not household measures.

| ID | English display | French display | Category | Aliases | Density / unit mappings |
|---|---|---|---|---|---|
| `ingredient-ref-honey-bunches-of-oats-honey-roasted-cereal` | `Honey Bunches of Oats Honey Roasted cereal` | `Céréales Bouchées d’avoine au miel, saveur originale` | `GRAIN_AND_CEREAL` | English `[]`; French `[]` | `null` / `[]` |
| `ingredient-ref-honey-bunches-of-oats-with-almonds-cereal` | `Honey Bunches of Oats with Almonds cereal` | `Céréales Bouchées d’avoine au miel avec amandes` | `GRAIN_AND_CEREAL` | English `[]`; French `[]` | `null` / `[]` |
| `ingredient-ref-honey-bunches-of-oats-with-real-strawberries-cereal` | `Honey Bunches of Oats with Real Strawberries cereal` | `Céréales Bouchées d’avoine au miel – Avec vraies fraises` | `GRAIN_AND_CEREAL` | English `[]`; French `[]` | `null` / `[]` |

The first French display adds “saveur originale” to distinguish the product whose French product-page H1 is simply “Bouchées d’avoine au miel”; the page text explicitly describes it as the original flavor. The Almonds and Real Strawberries French displays preserve the corresponding Canadian product-page wording, with “céréales” clarifying the food class. These are descriptive picker labels grounded in the manufacturer's Canadian French pages, not OQLF terminology rulings.

Keep the three products separate from each other and from generic oats, rolled oats, wheat or corn flakes, oat clusters, honey, almonds, and strawberries. Do not add family-name aliases to a generic cereal ingredient, and do not model the flavor products as forms of plain oats or a base cereal: each is a packaged multi-grain formulation with its own name and ingredients. A family phrase will already match each display name.

The French brand overview says “Essayez les 3 saveurs” and its product pages provide support for the same three identities, but the overview's image carousel also retains an image alt labeled “HBO avec chocolat.” Search of the current Canadian manufacturer site found no matching product-specific chocolate page in both languages. The French overview was last updated in 2025, so its image asset is not enough to establish a current fourth product. Exclude chocolate from this proposal and do not claim the three rows are an exhaustive international or historic roster. Revisit it only with a current, product-specific Canadian identity and Québec-facing French evidence.

## Ownership and archive audit

The read-only audit covered the live [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), the global plan, roadmap, prior proposals and batches, and the complete manifest-listed recipe corpus.

Case-folded identity/ID searches found no active reference, form, legacy candidate, or ledger identity for “Honey Bunches of Oats,” “Bouchées d’avoine au miel,” any of the three proposed product identities, or the three proposed reference IDs. The only ledger text hit for the generic phrase “with almonds” is an unrelated GialloZafferano chestnut-flour cantucci source title; it is not a Honey Bunches product, active cereal identity, or candidate source. The archive search found no prior focused Honey Bunches of Oats catalog decision.

At proposal review, all eight proposed source IDs and all eight exact URLs below were unowned in the live ledger. Each ID maps to exactly one URL. The complete current ledger audit found **zero source IDs mapped to multiple URLs**. Assign product-page sources only to their matching product identity decision; family pages are context for the brand name and limited roster evidence.

| Source ID | One URL | Evidence and limits |
|---|---|---|
| `WP03-POST-HONEY-BUNCHES-OF-OATS-R522-20261017-S01` | Post Consumer Brands Canada, [Honey Bunches of Oats brand overview](https://www.postconsumerbrands.ca/brand/honey-bunches-of-oats/) | Canadian manufacturer describes the brand's cereal as crunchy granola-oat clusters, four grains, and honey. This overview does not enumerate a current SKU roster. |
| `WP03-POST-HONEY-BUNCHES-OF-OATS-R522-20261017-S02` | Post Consumer Brands Canada, [Bouchées d’avoine au miel brand overview](https://www.postconsumerbrands.ca/fr-ca/marques/bouchees-davoine-au-miel/) | Canadian French brand wording and the “3 saveurs” statement. The page was updated in 2025 and its carousel includes a “HBO avec chocolat” image alt; treat it as family context, not as conclusive current roster evidence. |
| `WP03-POST-HONEY-BUNCHES-OF-OATS-R522-20261017-S03` | Post Consumer Brands Canada, [Honey Bunches of Oats Honey Roasted](https://www.postconsumerbrands.ca/brand/honey-bunches-of-oats/products/honey-roasted/) | Current Canadian English product page names Honey Roasted, describes it as the original flavor, and lists 340 g and 625 g boxes. The page warns the formula and ingredients may change. |
| `WP03-POST-HONEY-BUNCHES-OF-OATS-R522-20261017-S04` | Post Consumer Brands Canada, [Bouchées d’avoine au miel (French-Canadian product page)](https://www.postconsumerbrands.ca/fr-ca/marques/bouchees-davoine-au-miel/produits/bouchees-davoine-au-miel/) | Canadian French product page names the product “Bouchées d’avoine au miel,” calls it the original flavor in the body text, and lists 340 g and 625 g packages. It supports the descriptive French display, not a terminology ruling. |
| `WP03-POST-HONEY-BUNCHES-OF-OATS-R522-20261017-S05` | Post Consumer Brands Canada, [Honey Bunches of Oats with Almonds](https://www.postconsumerbrands.ca/brand/honey-bunches-of-oats/products/almonds/) | Current Canadian English product page names the Almonds cereal and lists 340 g, 625 g, 1.2 kg, and 1.4 kg packages. Formula may change. |
| `WP03-POST-HONEY-BUNCHES-OF-OATS-R522-20261017-S06` | Post Consumer Brands Canada, [Bouchées d’avoine au miel avec amandes](https://www.postconsumerbrands.ca/fr-ca/marques/bouchees-davoine-au-miel/produits/bouchees-davoine-au-miel-avec-amandes/) | Canadian French product-specific page uses the Almonds name and lists the same package sizes. It corroborates the Québec-facing display but is not a terminology ruling. |
| `WP03-POST-HONEY-BUNCHES-OF-OATS-R522-20261017-S07` | Post Consumer Brands Canada, [Honey Bunches of Oats with Real Strawberries](https://www.postconsumerbrands.ca/brand/honey-bunches-of-oats/products/honey-bunches-of-oats-with-real-strawberries/) | Current Canadian English product-specific page names the Real Strawberries cereal and lists a 311 g package. Formula may change. |
| `WP03-POST-HONEY-BUNCHES-OF-OATS-R522-20261017-S08` | Post Consumer Brands Canada, [Bouchées d’avoine au miel – Avec vraies fraises](https://www.postconsumerbrands.ca/fr-ca/marques/bouchees-davoine-au-miel/produits/bouchees-davoine-au-miel-avec-vraies-fraises/) | Canadian French product-specific page uses this title and lists a 311 g package. It supports the picker wording but is not an OQLF ruling. |

No numeric ledger observation is proposed. The listed 340 g–1.4 kg values are packages; the cited pages do not provide a supported household volume paired with mass. If integrated, each new record can carry the product-specific identity decision and these owned sources, with measurement state `researched_no_supported_value` and substitution state `not_yet_researched`. No reusable measurement, density, conversion, or substitution is supported by these pages.

## Phrase-first picker projection

This static projection follows the current [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it normalizes case, accents, ligatures, punctuation, and spacing; returns complete normalized word-phrase matches first across reference names, aliases, and linked form terms; and uses substring fallback only when there are no phrase matches. The three proposed references have no aliases or forms.

| Query | Current results | With proposal | Projection |
|---|---:|---:|---|
| `Honey Bunches of Oats` | 0 | 3 | All three distinct product references. |
| `Bouchées d’avoine au miel` | 0 | 3 | All three distinct product references. |
| `Honey Bunches of Oats Honey Roasted`; `Bouchées d’avoine au miel saveur originale` | 0; 0 | 1; 1 | Honey Roasted only. |
| `with Almonds`; `avec amandes` | 0; 0 | 1; 1 | Almonds only. |
| `with Real Strawberries`; `avec vraies fraises` | 0; 0 | 1; 1 | Real Strawberries only. |
| `honey`; `miel`; `oats`; `avoine` | 8; 6; 9; 15 | 11; 9; 12; 18 | Each family member is returned because its display contains these complete words. |
| `cereal`; `céréales` | 58; 54 | 61; 57 | Broad cereal queries gain the three named products. |
| `almond`; `almonds`; `strawberry`; `strawberries` | 11; 1; 5; 2 | 11; 2; 5; 3 | Singular English queries stay unchanged under phrase-first matching; plural queries gain the corresponding product. |

These are static projections against the current reference and form data, not runtime picker tests. No alias is needed to expose the family or product-specific results.

## Full manifest recipe scan

All **114** recipe files named in the current package manifest were parsed: **1,123** structured ingredient rows and **753,988** exact recipe-file bytes. The manifest-ordered corpus SHA-256 is `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`; the digest hashes each manifest-relative path as UTF-8, a NUL byte, exact recipe-file bytes, then a NUL byte.

Full-file and ingredient-row scans for the family name, French family name, and proposed reference IDs found **zero matching recipe files and zero matching ingredient rows**. The bundle supplies no ingredient demand, amount, or existing recipe link for these cereals.

## Evidence limits and data boundaries

The English and Canadian French product pages directly support the three individual cereal identities and their distinct product names. The French brand and products pages support Québec-facing French wording, while the brand overview's old update date and remaining chocolate image mean the broader roster is not fully resolved. Do not add a chocolate product from that image alone. Do not infer Canadian retail availability at a specific store, a current inventory state, or product formula stability from the manufacturer site.

Product composition does not make these ingredients aliases or interchangeable forms of oats, wheat, corn, honey, almonds, strawberries, or other cereals. Package weights do not establish recipe measures or conversions. No source or bundled recipe supports a substitution quantity or use-context rule.

## Static checks and testing rule

At proposal review, the reference/form/legacy/ledger snapshot, source-ID and URL ownership, phrase-first picker projection, and complete manifest corpus were checked read-only. The proposal links, UTF-8 without BOM, whitespace, and mojibake markers were checked.

Integration added three active references and three ledger records. The eight unique sources are attached as twelve source entries because the two family pages are shared context for all three product records. Static package validation, generated-index freshness, source ownership, picker projections, encoding, and corpus checks passed. No software tests, builds, emulator runs, or deployment were performed because this change only adds database JSON data under `AGENTS.md`.
