# WP02 Section E proposal — named pectin product gap review

- **Reviewed:** 2026-10-12
- **Packet type:** proposal-only product identity and recipe-demand review
- **Scope:** the remaining Section E question about named pectin products beyond the integrated pectin classes and Pectin NH Nappage.
- **Write scope:** this proposal only. No canonical reference, form, ledger, recipe, generated catalog, checklist, plan, workflow, or roadmap file was changed. Source IDs in this packet are local research IDs and are not ledger records.

## Recommendation

Add three identity-only *grade classes*: **yellow pectin**, **Rapid Set pectin**, and **Medium Rapid Set pectin**. Use those rows only to represent the named grade/setting class, not a purchasable powder or a shared supplier formula. Keep supplier product records separate and brand-qualified if recipes or packages later require them. The catalogs use these grade labels, but that does not establish identical composition, dose, or performance between suppliers. These classes are distinct from the already active generic pectin, HM, LM, LMA, and NH Nappage identities.

Hold **X58** and **325NH95** as supplier-qualified exact products. Do not create one cross-supplier identity or put the other maker’s label in its aliases: the reviewed Louis François and Sosa pages use the same-looking code/name while describing materially different composition or conditions. Preserve a brand-qualified product only if a future recipe or package needs it. No bundled recipe currently does.

Keep **unqualified “low-sugar pectin” unresolved**. It is not one universal ingredient or product. The current sources show materially different examples: a Sosa LMA product with added calcium sulfate and sucrose; Sosa 325 NH 95, listed for low-sugar fruit preparations while also requiring at least 50% added sugar; Pomona’s pure citrus pectin sold with a separate calcium packet; Ball’s separate low/no-sugar product line; ordinary LM pectin sold for low-sugar fruit preparations; and NH or X58 products whose own manufacturers make formulation-specific low-sugar claims. Do not add “low-sugar pectin” as an alias to generic pectin, LM/LMA, NH Nappage, X58, or one brand’s product. [S02, S16, S18, S20–S22, S24]

No pectin recipe line or prose in the bundled corpus requests any reviewed product. The three recommended grade-class entries are therefore identity-only: no recipe links, forms, densities, unit mappings, conversions, doses, yields, product equivalence, or active substitutions. Supplier-qualified X58 and 325NH95 product identities remain deferred unless exact package or recipe demand appears.

## Live audit snapshot and collision method

The snapshot was read from the shared worktree on 2026-10-12. This worktree already contained concurrent changes; counts and hashes below describe the exact live bytes observed for this review. File hashes are SHA-256 over exact bytes. The recipe-set digest sorts the manifest-listed recipe basenames lexically and hashes each basename, NUL byte, exact recipe bytes, and NUL byte.

| Artifact | Snapshot count | Bytes | SHA-256 or digest |
|---|---:|---:|---|
| Bundled ingredient references | 1,192 references | 381,313 | cadcbf8364313c2c8ebe73647082aa66c0648bfad40e8b54528cda451cd48318 |
| Bundled ingredient forms | 86 forms | 64,612 | 24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978 |
| Bundled manifest | 114 recipe paths | 12,011 | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Research ledger | 1,493 records / 5,009 source entries / 4,086 distinct source IDs | 4,926,020 | 1cc991e9f32200ea398dee8b029d5d47b9f1df16731d80944b76e31abddbe59f |
| Legacy import candidates | 66 candidates | 15,752 | bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f |
| Generated BundledIngredientCatalog.kt | 1,192 reference IDs | 522,224 | 24c0e5e54aa06616967b38c2e7c507e850a1257d56b6886a4a0b4e86f2ddf93c |
| Manifest-listed recipe files | 114 files / 1,123 ingredient rows | 752,942 | b70a826e18497a37ce343f6c98cafa143d573dd59704ea6022bb034b2640e5a2 |

The current pectin references are:

- ingredient-ref-pectin — pectin / pectine
- ingredient-ref-pectin-high-methoxyl — high-methoxyl pectin / pectine HM
- ingredient-ref-pectin-low-methoxyl — low-methoxyl pectin / pectine LM
- ingredient-ref-pectin-low-methoxyl-amidated — amidated low-methoxyl pectin / pectine LM amidée
- ingredient-ref-pectin-nh-nappage — Pectin NH Nappage / Pectine NH Nappage

All five are BAKING_MIXIN_AND_PANTRY, with null default density and empty unit mappings. The 86 forms contain no pectin form. The five matching ledger records cite the prior Section E evidence; no candidate product record is already in the live ledger. Neither active substitution JSON file contains pectin. The generated catalog contains the five current pectin references and no proposed candidate row. The 66 legacy candidates have no pectin names or aliases.

I checked the active reference names and aliases, form labels and match terms, legacy names and aliases, ledger record IDs, generated reference IDs, and all 114 manifest-listed recipe files. The recipe scan searched every string field in each full recipe JSON, including ingredient text, titles, notes, and instructions, for pectin/pectine, pectic, NH Nappage, X58, 325NH95, Rapid Set, Yellow Pectin, and low-sugar-pectin wording. It found **zero matching recipe strings and zero ingredient rows**. Thus recipe demand is absent for the new grades and the current NH product as well.

Candidate phrases were checked with the app’s current normalized search key (lowercase, Unicode NFKD accent folding, punctuation to spaces) against active references, forms, and legacy candidates. There is no exact normalized phrase owner for the three proposed grade-class names or the held product names. The active generic pectin row shares the word “pectin,” and the current NH row shares “NH”; these are broad token overlaps, not complete product-name matches. Keep aliases specific to the grade class or source-qualified product so that matching the pectin parent or NH class does not erase the grade or product boundary.

## Product-grade recommendations

Each proposed class identity would use category **BAKING_MIXIN_AND_PANTRY**, null default density, and empty unit mappings. The proposed IDs below were absent from the current references, legacy candidates, ledger, generated catalog, and existing proposal files at the collision check. They represent broad grade classes only. No aliases are proposed for supplier products under these rows; exact branded products must remain separate when needed.

| Proposed ID | Recommendation and bilingual display | Supported aliases | Evidence-backed boundary |
|---|---|---|---|
| ingredient-ref-pectin-yellow | Integrate as grade class — EN **yellow pectin**; fr-CA **pectine jaune** | None beyond the bilingual display terms. | Both suppliers list a yellow pectin grade. Sosa describes its product as HM pectin with retarding salts; Louis François lists Yellow Pectin for confectionery. This row would mean the grade class only; do not treat supplier powders, compositions, or process claims as identical, and do not alias it to every HM pectin. [S02, S08–S09, S10–S13, S23] |
| ingredient-ref-pectin-rapid-set | Integrate as grade class — EN **Rapid Set pectin**; fr-CA **Pectine Rapid Set** | None beyond the bilingual display terms. | Louis François and Sosa list this named setting grade. This row would mean the setting-grade class only, not either maker’s formula; keep each maker’s ingredient list, application, pH/soluble-solids conditions, and dose source-scoped. Do not make a supplier product alias or infer product interchangeability. [S02–S03, S10–S14] |
| ingredient-ref-pectin-medium-rapid-set | Integrate as grade class — EN **Medium Rapid Set pectin**; fr-CA **Pectine Medium Rapid Set** | None beyond the bilingual display terms. | Both manufacturers list a medium-rapid grade distinct from Rapid Set. This row would represent only the named setting-grade class; supplier-specific formula, applications, and setting conditions remain source-scoped. Do not infer that the makers’ powders are identical or interchangeable. [S02–S03, S10–S13, S15] |

In particular, the display terms above are not aliases for every maker’s commercial product. A future exact product identity should include its supplier in its bilingual display name and carry only that supplier’s documented spelling variants.

French wording uses the French product labels published by the manufacturers, headed by the OQLF-supported term **pectine**. OQLF’s GDT entry supports generic pectine / pectin only; it does not standardize these grade names. Preserve the codes and maker terminology rather than inventing Quebec technical translations such as “pectine à prise rapide.” Treat the product-grade French displays as source-based and still open to an independent Québec terminology review.

## Held candidates and non-aliases

The following source names are real products or labels, but I recommend no additional row in this batch. If a future exact recipe or package calls for one, preserve the maker and product code as part of the identity; do not merge it into the grade-class rows or the existing NH Nappage row. In particular, a shared manufacturer label or code does not justify a cross-supplier alias. Any exact product row, if later justified, would be BAKING_MIXIN_AND_PANTRY and would start with null density and empty unit mappings.

| Candidate wording if later required | Disposition, aliases, and reason |
|---|---|
| EN **Louis François Pectin X58** / fr-CA **Pectine X58 Louis François**; EN **Sosa Nappage X58 Pectin** / fr-CA **Pectine Nappage X58 Sosa** | Hold as two separate supplier-qualified exact products, with no aliases between them. Louis François describes citrus/apple pectin gel with minimum 35% dry extract and calcium and/or acid conditions; Sosa’s X58 includes amidated LM pectin, sugar, diphosphate and tricalcium phosphate, and states pH >4 and minimum 50–60% added sugar. Similar code does not establish a shared formula or one identity. Preserve source spellings only within each future brand-qualified row. [S04–S05, S18] |
| EN **Louis François Pectin 325NH95** / fr-CA **Pectine 325NH95 Louis François**; EN **Sosa Pectin 325 NH 95** / fr-CA **Pectine 325 NH 95 Sosa** | Hold as two separate supplier-qualified exact products, with no aliases between them. Louis François describes low-sugar fruit preparations with at least 35% dry extract and calcium and/or acid conditions; Sosa identifies a low-sugar fruit use but also requires pH 3.2–3.5, at least 50% added sugar, and at least 20% fruit. Do not infer shared formulation, alias one maker’s wording to the other, or merge either with the current NH Nappage identity. [S06–S07, S24] |
| EN **Louis François Extra Slow Set Pectin** / fr-CA **Pectine Extra Slow Set Louis François** | Hold as a supplier-specific named grade/product in the sources reviewed. Its slower-setting use is documented, but the exact label was not independently confirmed in another current manufacturer catalog. No aliases proposed; do not alias to HM pectin or low-sugar pectin. [S02–S03] |
| EN **Sosa Low Sugar Pectin (38895)** / fr-CA **Pectine Low Sugar Sosa (38895)** | Hold the Sosa low-sugar formulation until a bundled recipe or exact package demands it. Sosa describes an LMA product containing pectin, sucrose, and calcium sulfate. No aliases proposed. In particular, do not add the unqualified alias **low-sugar pectin** or French **pectine à faible teneur en sucre**; that label does not identify this one formula universally. [S16] |
| EN **Sosa Acid Free Pectin (41543)** / fr-CA **Pectine Acid Free Sosa (41543)** | Hold as a source-specific LMA product with added calcium and dextrose, not as a universal pectin class. No aliases proposed. Its neutral/alkaline-pH performance remains Sosa-specific. [S17] |
| EN **Sosa Fruit NH Pectin (48667)** / fr-CA **Pectine Fruit NH Sosa (48667)** | Hold as a source-specific product. Its named mix includes amidated pectin and additional salts; do not alias it to the current Pectin NH Nappage row or use bare NH as an alias. No bundled demand was found. [S19] |
| EN/FR brand label **Pomona’s Universal Pectin** | Hold as a branded kit, not a generic pectin identity. Pomona says the retail box contains a pectin packet and a separate calcium packet, and that calcium activates its citrus pectin. Preserve the exact brand label in either language if a later recipe names it; no translation or alias is proposed here. [S20–S21] |
| EN **Ball RealFruit Low or No-Sugar Needed Pectin** / fr-CA **Ball RealFruit Low or No-Sugar Needed Pectin** | Hold. Ball’s official calculator treats this as a separate branded product alongside its Classic and Instant pectins, but the reviewed source did not establish a Québec French package name or enough current formulation detail for a broader identity. Keep the brand label unchanged if an exact package is later entered; no aliases proposed. [S22] |
| EN **low-sugar pectin** / fr-CA **pectine à faible teneur en sucre**; EN **standard pectin** / fr-CA **pectine standard** | Hold as unqualified phrases; no reference, alias, or substitution. “Low-sugar” and “standard” do not specify HM/LM/LMA chemistry, calcium management, sugar/acid requirements, or the particular manufacturer blend. |

## Recipe, numeric, and substitution limits

- The corpus has no pectin ingredient line, mention, prose instruction, or product link. Do not add recipe links based on external manufacturer recipes.
- Product pages give application-specific doses, pH and soluble-solids requirements, activation temperatures, and texture descriptions. Do not copy those into default ingredient quantities or general pectin-class metadata. No density, unit mapping, volume conversion, package conversion, serving yield, or form is supported.
- The source pages themselves show why numeric requirements must stay attached to named products: LF X58 gives minimum 35% dry extract plus calcium and/or acid, while Sosa X58 states pH above 4 and 50–60% added sugar; LF 325NH95 gives minimum 35% dry extract with calcium and/or acid, while Sosa 325 NH 95 gives pH 3.2–3.5, at least 50% added sugar, and at least 20% fruit. These are supplier-specific operating conditions, not shared grade defaults. [S04, S06, S18, S24]
- The Louis François overview describes 325NH95 as capable of replacing gelatin in a panna cotta. Keep that as a claim about that named product and preparation only; do not create a pectin-to-gelatin substitution or runtime rule. No general pectin-to-pectin replacement is recommended. [S02]
- X58 and 325NH95 are not universal cross-supplier identities: same-looking names conceal different compositions and/or conditions in the reviewed source pages. Keep brand-qualified products separate. Yellow, Rapid Set, and Medium Rapid Set are proposed only as grade classes; no formula or interchangeability claim attaches to them. NH Nappage and low-sugar products also remain source-specific where a formulation is named.
- The current “low-sugar pectin” warning remains explicit: Sosa product 38895, Sosa Fruit NH, Pomona’s calcium-activated retail product, Ball’s branded no/low-sugar product, and unblended LM pectin do not collapse to one universal low-sugar ingredient or replacement formula.

No tests or emulator checks were run. This is a research-only proposal; any future accepted catalog changes are bundled database JSON data, which the current AGENTS.md exempts from testing.

## Sources

All web sources below were accessed on 2026-10-12. The S-number namespace is packet-local; a prefix scan found no collisions in the shared ledger or existing proposal files. These source IDs have not been added to the ledger.

| Full source ID (short citation) | Source and evidence used |
|---|---|
| `WP02-E-PECTIN-PRODUCT-GAP-20261012-S01` (S01) | [OQLF, pectine (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8476811/pectine) — supports pectine and English pectin/pectic material, not grade or commercial-product names. |
| `WP02-E-PECTIN-PRODUCT-GAP-20261012-S02` (S02) | [Louis François, Les pectines](https://louisfrancois.com/les-pectines/) — HM, LM, LMA, set-speed grades, yellow pectin, 325NH95, NH Nappage, and X58; application and dosage details remain source-scoped. |
| `WP02-E-PECTIN-PRODUCT-GAP-20261012-S03` (S03) | [Louis François, Pectins](https://louisfrancois.com/en/les-pectines/) — English product-grade wording and matching product boundaries. |
| `WP02-E-PECTIN-PRODUCT-GAP-20261012-S04` (S04) | [Louis François, Pectine X58](https://louisfrancois.com/produit/pectine-x58/) — French product name, conditions, glaze uses, and source-specific amount. |
| `WP02-E-PECTIN-PRODUCT-GAP-20261012-S05` (S05) | [Louis François, Pectin X58](https://louisfrancois.com/en/produit/pectine-x58/) — English product name and the manufacturer’s own conditions and uses. |
| `WP02-E-PECTIN-PRODUCT-GAP-20261012-S06` (S06) | [Louis François, Pectine 325NH95](https://louisfrancois.com/produit/pectine-325nh95/) — product name, LMA-related use, and distinction from toppings. |
| `WP02-E-PECTIN-PRODUCT-GAP-20261012-S07` (S07) | [Louis François, Pectin 325NH95](https://louisfrancois.com/en/produit/pectine-325nh95/) — English name and manufacturer-specific uses and amount. |
| `WP02-E-PECTIN-PRODUCT-GAP-20261012-S08` (S08) | [Louis François, Pectine Jaune](https://louisfrancois.com/produit/pectine-jaune/) — French product name, confectionery use, and source-specific conditions. |
| `WP02-E-PECTIN-PRODUCT-GAP-20261012-S09` (S09) | [Louis François, Yellow Pectin](https://louisfrancois.com/en/produit/pectine-jaune/) — English name and product description. |
| `WP02-E-PECTIN-PRODUCT-GAP-20261012-S10` (S10) | [Louis François, Pectines collection](https://louisfrancois.com/collection/pectines/) — current product list of eight pectin products. |
| `WP02-E-PECTIN-PRODUCT-GAP-20261012-S11` (S11) | [Louis François, Pectins collection](https://louisfrancois.com/en/collection/pectines/) — English product names for that catalog. |
| `WP02-E-PECTIN-PRODUCT-GAP-20261012-S12` (S12) | [Sosa, Pectines](https://www.sosa.cat/fr/categorie-produit/pectines-fr/) — current French catalog includes low-sugar, 325 NH 95, acid-free, Fruit NH, Nappage X58, Rapid Set, Medium Rapid Set, and yellow pectin names. |
| `WP02-E-PECTIN-PRODUCT-GAP-20261012-S13` (S13) | [Sosa, Pectins](https://www.sosa.cat/en/product-category/pectins-en/) — current English product list corroborates the pectin-grade names. |
| `WP02-E-PECTIN-PRODUCT-GAP-20261012-S14` (S14) | [Sosa, Pectine Rapid Set](https://www.sosa.cat/fr/produit/pectina-rapid-set/) — exact French product name and HM formulation claims; conditions remain specific to this product. |
| `WP02-E-PECTIN-PRODUCT-GAP-20261012-S15` (S15) | [Sosa, Pectine Medium Rapid Set](https://www.sosa.cat/fr/produit/pectine-medium-rapid-set/) — exact French product name and medium setting profile. |
| `WP02-E-PECTIN-PRODUCT-GAP-20261012-S16` (S16) | [Sosa, Pectine à faible teneur en sucre](https://www.sosa.cat/fr/produit/pectina-low-sugar/) — product 38895 composition and own low-sugar preparation directions. |
| `WP02-E-PECTIN-PRODUCT-GAP-20261012-S17` (S17) | [Sosa, Pectine Acid Free](https://www.sosa.cat/fr/produit/pectine-acid-free/) — product 41543 composition and neutral/alkaline-pH performance claims. |
| `WP02-E-PECTIN-PRODUCT-GAP-20261012-S18` (S18) | [Sosa, Pectine Nappage X58](https://www.sosa.cat/fr/produit/pectine-nappage-x58/) — product name, ingredients, and formulation-specific glaze/cream conditions. |
| `WP02-E-PECTIN-PRODUCT-GAP-20261012-S19` (S19) | [Sosa, Pectine Fruit NH](https://www.sosa.cat/fr/produit/pectina-fruit-nh/) — product 48667 ingredients and its source-specific sugar, acid, and application limits. |
| `WP02-E-PECTIN-PRODUCT-GAP-20261012-S20` (S20) | [Pomona’s Universal Pectin, retail information](https://www.pomonapectin.com/PDF/Retail_Information.pdf) — exact brand name and retail package components. |
| `WP02-E-PECTIN-PRODUCT-GAP-20261012-S21` (S21) | [Pomona’s cooked-jam directions](https://www.pomonapectin.com/PDF/pomona-pectin-directions-2016.pdf) — describes citrus pectin activated by a separate calcium powder packet. |
| `WP02-E-PECTIN-PRODUCT-GAP-20261012-S22` (S22) | [Ball, Pectin Calculator](https://www.ballmasonjars.com/pectin-calculator.html) — separately names Ball RealFruit Classic, Instant, and Low or No-Sugar Needed products. |
| `WP02-E-PECTIN-PRODUCT-GAP-20261012-S23` (S23) | [Sosa, Pectine Jaune](https://www.sosa.cat/fr/produit/pectine-jaune/) — identifies its product as HM pectin with retarding salts and gives its own sugar, acid, dose, and temperature conditions. |
| `WP02-E-PECTIN-PRODUCT-GAP-20261012-S24` (S24) | [Sosa, Pectine 325 NH 95](https://www.sosa.cat/fr/produit/pectine-325-nh-95/) — product 41482 composition, pH, sugar and fruit minimums, and low-sugar fruit application. |

## Source-ID and write verification

The short citations S01–S24 refer to the full source IDs in the table. All 24 full IDs are unique within this file. Before drafting, the prefix WP02-E-PECTIN-PRODUCT-GAP-20261012-S was absent from the 5,009 shared ledger source entries and all existing proposal files. No proposal source ID was written to the shared ledger. The proposal path is the only write in this batch.
