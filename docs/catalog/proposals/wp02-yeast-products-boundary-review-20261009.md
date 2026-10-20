# WP02 Section E — Yeast product boundary review

- **Packet type:** proposal-only research followed by coordinator integration.
- **Prepared and source-access date:** 2026-10-09.
- **Scope:** baker’s yeast parent identity; active dry, instant/rapid-rise, fresh/compressed, and osmotolerant yeast. Sourdough starter/levain appears only as a product boundary.
- **Status:** Integrated on 2026-10-09. The coordinator accepted four yeast product identities plus the exact recipe-072 instant-yeast link; broader Section E remains open.
- **Source IDs:** `WP02-E-YEAST-20261009-S01` through `WP02-E-YEAST-20261009-S14`. The prefix was checked against all source IDs in the live ledger and all existing proposal/batch text before assignment; no collision was found.

## Coordinator recommendation

1. **Narrow the current generic row to baker’s yeast.** The current `ingredient-ref-yeast` is categorized for baking but displays the broad terms `yeast` / `levure`. TERMIUM distinguishes baker’s yeast used as leaven from brewer’s yeast as a brewing by-product, and OQLF notes that yeast also includes brewing and wine uses [S01, S05]. Consider the bilingual display `baker’s yeast` / `levure de boulangerie`, with `baking yeast`, `bread yeast`, `levure de boulanger`, and `levure de panification` as terminology-backed aliases. Keep `yeast` / `levure` under review as broad queries rather than deciding here whether to retain them on the bakery parent. The current aliases `dried yeast` and `sachet de levure` do not identify a subtype; do not move them to active dry or instant yeast.
2. **Represent active dry and instant yeast as separate product identities.** OQLF and TERMIUM provide separate terms for active dry yeast and instant yeast. Manufacturer descriptions distinguish granule size, processing, and how the types are incorporated [S02–S06, S08]. Proposed displays are `active dry yeast` / `levure sèche active` and `instant yeast` / `levure à action rapide`. For instant yeast, TERM/OQLF also support `quick-acting yeast`, `quick-rising yeast`, `quick yeast`, `fast-rising yeast`, `levure à levée rapide`, and `levure instantanée` [S04, S06]. Keep `dry yeast` / `levure sèche` broad; they do not select active dry over instant. Keep `rapid-rise` and `quick-rise` as unassigned terms pending terminology review: the sources include branded names and TERMIUM’s instant record also cross-lists qualified “rapid rise active dry” spellings [S06, S08, S10]. Do not alias those qualified phrases to either identity.
3. **Treat fresh compressed yeast as a distinct product candidate.** TERMIUM identifies compressed/cake yeast as fresh, not dried, and provides the French terms `levure comprimée`, `levure fraîche pressée`, and `levure pressée` [S07]. Candidate aliases for a compressed-cake identity are `compressed yeast`, `cake yeast`, `pressed yeast`, `levure comprimée`, and `levure fraîche pressée`. Leave `fresh yeast` / `levure fraîche` unresolved as global aliases: TERMIUM lists them with cake yeast, while Lallemand’s Canadian bakery range separately lists cream, compressed/crumbled, and dry formats [S07, S13].
4. **Model osmotolerant baker’s yeast as a separate product-class candidate, never an alias of instant or fresh yeast.** Lallemand describes a baker’s yeast selected for reduced osmotic stress and higher-sugar doughs, available in both fresh and instant-dried presentations [S11–S12]. Candidate displays are `osmotolerant baker’s yeast` / `levure de boulangerie osmotolérante`; retain `levure de boulangerie résistante à la pression osmotique` and the manufacturer wording `osmotically-resistant baker’s yeast` as source-supported terminology pending review. I recommend a distinct identity under the current catalog model because it cannot be represented as a single presentation form. If the schema later gains orthogonal product properties, osmotolerance could move to that dimension without creating a fresh/instant identity matrix.
5. **Keep starter products separate.** `levain` / sourdough starter, discard, and dried starter are cultured mixtures or products, not commercial baker’s yeast aliases. Existing baking-substitution research gives no general starter-to-commercial-yeast dose replacement [existing `docs/catalog/batches/baking-substitutions.md`]. The broader starter review remains open under Section E.

No yeast product forms, densities, unit mappings, package yields, conversion rules, or recipe substitution rules are proposed. Observed amounts below remain inactive and product-scoped.

## Proposed identities and alias boundaries

| Product boundary | Candidate display | Supported names and aliases for review | Keep separate or unresolved |
|---|---|---|---|
| Baker’s yeast parent | EN `baker’s yeast`; fr-CA `levure de boulangerie` | `baking yeast`, `bread yeast`; French `levure de boulanger`, `levure de panification` [S05] | Existing generic `yeast` / `levure` are broader than this baking identity. Keep brewer’s yeast, nutritional yeast, yeast extract, and inactive dry yeast outside this parent’s aliases. Review existing `dried yeast` and `sachet de levure` aliases without assigning a subtype. |
| Active dry yeast | EN `active dry yeast`; fr-CA `levure sèche active` | Exact EN/FR term pair supported by OQLF [S02]. | Distinct from instant yeast. Do not alias generic `dry yeast`, `dried yeast`, `dry yeast granules`, or `levure sèche`; those terms do not select this subtype. |
| Instant yeast | EN `instant yeast`; fr-CA `levure à action rapide` | EN `quick-acting yeast`, `quick-rising yeast`, `quick yeast`, `fast-rising yeast`; FR `levure à levée rapide`, `levure instantanée` [S04, S06]. | Distinct from active dry. Do not globally alias brand names `RapidRise®`, `Quick-Rise™`, `Bread Machine Yeast`, or qualified “rapid rise active dry yeast” phrases. A maker’s same-product naming does not establish a cross-brand alias. |
| Fresh compressed/cake yeast | EN `compressed yeast`; fr-CA `levure comprimée` | EN `fresh compressed yeast`, `cake yeast`, `pressed yeast`; FR `levure fraîche pressée`, `levure pressée` [S07]. | Distinct from dried products. Leave unqualified `fresh yeast` / `levure fraîche` unresolved because manufacturers also distinguish cream yeast from compressed yeast [S07, S13]. `Wet yeast` is not proposed as an alias because it may cover more than compressed cake. |
| Osmotolerant baker’s yeast | EN `osmotolerant baker’s yeast`; fr-CA `levure de boulangerie osmotolérante` | Also document manufacturer wording `osmotically-resistant baker’s yeast` and `levure de boulangerie résistante à la pression osmotique` [S11–S12]. | Distinct from ordinary yeast by the reported performance class, not by hydration state. It may be sold fresh or instant-dried; do not map it to either product or create combinations without a schema decision. No recipe line requests it. |
| Sourdough starter / levain family | Out of this packet’s candidate identities | Keep `sourdough starter`, `levain`, `discard`, and dried starter in the separate Section E review. | Never alias to commercial yeast or infer a yeast-dose equivalence [existing baking-substitutions batch]. |

### Terminology limits

- OQLF pairs `levure sèche active` with `active dry yeast`, `levure sèche` with the broader `dry yeast`, and `levure à action rapide` with `instant yeast` [S02–S04]. That vocabulary supports separate active-dry and instant identities; it does not justify moving the current broad `dried yeast` alias to active dry.
- TERMIUM records quick-acting, quick-rising, quick, and fast-rising terms under instant yeast, but the same record lists some qualified “rapid rise active dry yeast” variants. Manufacturer product pages also use RapidRise® and Quick-Rise™ as product names [S06, S08, S10]. Keep the unqualified rapid/quick-rise family out of active aliases until terminology and trademark scope are reviewed.
- Lallemand’s product description supports osmotolerance as a specific baking-yeast performance class and states that its product is sold both fresh and instant-dried [S11–S13]. It does not establish a universal recipe sugar cutoff, formulation, or dosage for all osmotolerant yeasts.

## Measurement and substitution observations (inactive)

| Source observation | Exact basis and limit | Catalog disposition |
|---|---|---|
| Red Star Quick-Rise Instant Yeast: one packet is 0.25 oz / 7 g and about 2¼ tsp [S10]. | The manufacturer specifies its packet product and volume estimate; this is not a general mass-volume value for every brand or yeast presentation. | Record only as a source-specific package observation if a later package-yield record is supported. Do not add density or unit mapping. |
| Fleischmann’s FAQ: one 0.6 oz cake equals one packet of dry yeast; one 2 oz cake equals three packets [S08–S09]. | Brand-specific cake sizes and packet equivalences; “packet” is the source’s own package convention. | Keep inactive; no global fresh-to-dry conversion. |
| Red Star allows its Quick-Rise instant yeast to replace its active dry yeast 1:1 in traditional dough methods [S10]. Fleischmann’s advises 25% more active dry than RapidRise instant, with method and rise-time adjustments [S09]. | These are different manufacturers’ instructions and methods. Their quantities cannot establish one global conversion. | No substitution rule. Leave the product- and recipe-scoped evidence inactive. |
| Lallemand reports its osmotolerant yeast is suited to higher-sugar sweet dough and is available fresh and instant-dried [S11–S12]. | Product-specific application description, not a universal sugar threshold or bake formula. | No runtime threshold, form, mapping, or substitution rule. |

No source-backed default density, unit mapping, ingredient form, package yield, mass-volume conversion, form conversion, or substitution is activated by this packet. Keep those fields unset. Do not infer fresh-to-dry ratios from packet labels or recipe examples.

## Live package, exact-key, legacy, recipe, and source-ID audit

Snapshot rechecked on 2026-10-09 after the coordinator’s integration notice:

| Artifact | Count / SHA-256 |
|---|---|
| Seed manifest `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths; `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Active ingredient references | 447 rows; `b5b527cb3d6be40aba99939183b36aece0ff1c8e37d2fe2c63e943e3ee29e577` |
| Ingredient forms | 17 rows; `2098e1048796a1aba42c25e4020f018d02c04c332567620432084fceac8f2d15` |
| Research ledger | 614 records / 764 source entries; `e32ac1d3c1a6c01f409c30c8b7f50f14cc2218c06e674784609c29243d36457a` |
| Legacy candidates | 99 rows; `63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b` |
| Manifest-listed recipes | 114 files / 1,123 ingredient rows; aggregate `7498b32d956db5a5d60f920da2ac41876db9c787ed132c60deb4f9ac1e121bab` |

File hashes are SHA-256 over exact file bytes. The recipe aggregate sorts manifest-listed recipe filenames lexically and hashes each filename, a NUL byte, its exact file bytes, and a NUL byte in order.

The exact-key audit mirrored `normalizeIngredientSearchKey` in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`: lowercase/NFKD, `œ`/`æ`/`ß` folding, combining-mark removal, ampersand expansion, punctuation and non-ASCII-alphanumeric folding to spaces, and whitespace collapse. Candidate names and boundary terms were checked against every current reference name/alias, form label/match term, and legacy candidate name/alias.

| Exact normalized query group | Live owner/result | Disposition |
|---|---|---|
| `yeast`; `levure` | Canonical EN/FR names on `ingredient-ref-yeast` | Existing generic row; candidate to narrow to baker’s yeast after coordinator review. |
| `dried yeast`; `sachet de levure` | Existing EN/FR aliases on `ingredient-ref-yeast` | Keep subtype unresolved; neither uniquely identifies active dry or instant. |
| Baker’s yeast terms; active dry terms; instant/quick terms; fresh/compressed/cake terms; osmotolerant terms; starter/levain terms | No exact active reference or form match, except the current generic owners above | No exact candidate collision. All proposed aliases remain unassigned pending review. |
| Legacy candidates | No yeast-, levure-, levain-, or sourdough-named candidate; no exact candidate key for scoped terms | No legacy owner to merge or reactivate. |

The current `ingredient-ref-yeast` has category `BAKING_MIXIN_AND_PANTRY`, aliases `dried yeast` and `sachet de levure`, null `defaultDensity`, and an empty `unitMappings` array. The ledger entry is `unreviewed`, measurement and substitution research are `not_yet_researched`, and it has no sources. No active form refers to this row. Existing proposal/batch search found no prior yeast-product boundary packet; `batches/baking-substitutions.md` covers yeast/starter substitution limits only.

All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned for yeast/levure/levain/sourdough terms. Three linked ingredient rows were found:

| Recipe file and exact line | Ingredient row | Current wording and link | Recommendation if integration is accepted |
|---|---|---|---|
| `recipes/005-bao-buns-vapeur-steamed-bao-buns-559fff48-4d46-4922-b1b8-66808cb0715c.v1.json:34` | `559fff48-4d46-4922-b1b8-66808cb0715c-ingredient-2` | `1 tsp dried yeast`, linked to `ingredient-ref-yeast`; preparation `dried` / `séché` | Keep on the broad baker’s-yeast parent. “Dried” does not distinguish active dry from instant. |
| `recipes/072-pains-a-hamburger-hamburger-buns-cfa64319-d4b9-4425-b087-3e30be3cc4a0.v1.json:79` | `cfa64319-d4b9-4425-b087-3e30be3cc4a0-ingredient-6` | `8 g instant yeast`, linked to `ingredient-ref-yeast`; preparation `instant` / `instantané` | Link this line to a distinct instant-yeast identity in a future accepted integration. Do not edit the recipe in this packet. |
| `recipes/076-pate-a-pizza-pizza-dough-14d20789-1967-432a-b9bc-0319599ffbd3.v1.json:50` | `14d20789-1967-432a-b9bc-0319599ffbd3-ingredient-3` | `7 g yeast`, linked to `ingredient-ref-yeast`; no subtype | Keep on the broad baker’s-yeast parent. |

No recipe row names active dry, fresh/compressed, osmotolerant yeast, or sourdough starter. No recipe line requests a fresh-to-dry conversion. The `WP02-E-YEAST-20261009-S` prefix had zero collisions against all 764 live ledger source IDs and all existing proposal/batch files before IDs were assigned.

## Source search log

All source searches and page checks were performed on 2026-10-09. Search result snippets were used only to locate sources; claims below refer to the listed source pages.

| Search group | Representative queries | Result and scope |
|---|---|---|
| Québec French and identity terms | `site:vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt levure sèche active`; `levure sèche`; `levure à action rapide`; `levure`; direct OQLF GDT entries | OQLF supplies fr-CA terms for active dry yeast, generic dry yeast, and instant yeast; its general yeast entry distinguishes bakery, brewing, and wine uses. |
| Canadian government terminology | `site:btb.termiumplus.gc.ca "INSTANT YEAST"`; `"PURE CULTURE YEAST"`; `"FERMENTATION LEVURE"` | TERMIUM supplies English/French bakery terms and synonyms, compressed-cake terminology, and baker’s versus brewer’s yeast distinctions. Some rapid-rise-qualified synonym entries need conservative review. |
| Manufacturer product boundaries | `Fleischmann yeast active dry instant rapid rise fresh cake yeast FAQ`; `Red Star Quick-Rise Instant Yeast active dry 7 gram packet`; `Lallemand Canada osmotolerant yeast sweet dough French` | Producer sources describe product-specific dry/instant/fresh distinctions, package observations, differing substitution directions, and osmotolerant baker’s-yeast applications. They do not justify general app-wide numeric rules. |
| Canadian French recipe wording | `Cuisinart Canada levure instantanée levure sèche active français` | Cuisinart Canada’s French manual uses active-dry and instant yeast names in a product-specific bread-machine context; this corroborates local usage without creating a universal ratio. |

## Source-to-claim map

The source ID prefix was checked against the current ledger and all existing proposal/batch files before assigning IDs. All sources were accessed on 2026-10-09.

| ID | Source | Evidence used and limits |
|---|---|---|
| **WP02-E-YEAST-20261009-S01** | OQLF, [levure (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8362852/levure) | Defines broad yeast and notes brewing, wine, and baker’s yeast applications. Supports narrowing the catalog’s baking-scoped parent; does not make plain yeast a bakery-only term. |
| **WP02-E-YEAST-20261009-S02** | OQLF, [levure sèche active (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2498055/levure-seche-active) | Directly pairs preferred French `levure sèche active` with English `active dry yeast`. Supports the active-dry candidate name only. |
| **WP02-E-YEAST-20261009-S03** | OQLF, [levure sèche (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297235/levure-seche) | Pairs French `levure sèche` with generic `dry yeast`. Supports leaving these broad names off the active-dry identity. |
| **WP02-E-YEAST-20261009-S04** | OQLF, [levure à action rapide (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18968726/levure-a-action-rapide) | Preferred Québec French term `levure à action rapide` and English `instant yeast`. Supports the instant candidate display. |
| **WP02-E-YEAST-20261009-S05** | Government of Canada TERMIUM Plus, [baker’s yeast terminology record](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=enb&lang=eng&srchtxt=PURE+CULTURE+YEAST) | Lists baker’s yeast, baking yeast, bread yeast, and French `levure de boulangerie`, `levure de boulanger`, `levure de panification`; distinguishes compressed cakes and dehydrated granules and differentiates baker’s from brewer’s yeast. Search URL returns multiple terminology records; claims here are limited to the baker’s-yeast entry. |
| **WP02-E-YEAST-20261009-S06** | Government of Canada TERMIUM Plus, [instant yeast terminology record](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=ent&lang=eng&srchtxt=INSTANT+YEAST) | Lists quick-acting, quick-rising, instant, quick, and fast-rising English terms, plus French `levure à action rapide`, `levure à levée rapide`, and `levure instantanée`. The record also includes qualified “rapid rise active dry” variants; no such qualified phrase is proposed as an alias. |
| **WP02-E-YEAST-20261009-S07** | Government of Canada TERMIUM Plus, [compressed yeast terminology record](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frr&lang=fra&srchtxt=FERMENTATION+LEVURE) | Defines compressed yeast as fresh, not dried, yeast formed into a cake; lists compressed, cake, pressed, and fresh English terms and French `levure comprimée`, `levure fraîche pressée`, `levure fraîche`, and `levure pressée`. The broad fresh terms are held pending a distinction from cream yeast formats. |
| **WP02-E-YEAST-20261009-S08** | Fleischmann’s, [Frequently Asked Questions](https://www.fleischmannsyeast.com/frequently-asked-questions/) | Producer distinguishes active dry from instant processing and use; calls Instant, Bread Machine, and RapidRise the same yeast in its own product line; describes RapidRise PLUS as including an added dough enhancer; gives brand-specific fresh-cake equivalences and packet amount. Not a cross-brand identity or universal substitution standard. |
| **WP02-E-YEAST-20261009-S09** | Fleischmann’s, [Yeast 101](https://www.fleischmannsyeast.com/baking-basics/yeast-101/) | Gives Fleischmann’s method-specific 25% Active Dry adjustment for RapidRise instant and product-specific fresh-cake packet equivalents. Contrasts with Red Star’s 1:1 advice; do not activate a global ratio. |
| **WP02-E-YEAST-20261009-S10** | Red Star, [Quick-Rise Instant Yeast product page](https://redstaryeast.com/product/quick-rise-instant-yeast-strip/) | Calls its Quick-Rise an instant yeast, gives 0.25 oz / 7 g packets and about 2¼ tsp per packet, and recommends 1:1 replacement of its active dry yeast. Supports product-specific identity, package observation, and substitution conflict only. |
| **WP02-E-YEAST-20261009-S11** | Lallemand Baking, [Osmotolerant Yeast — Canada French page](https://www.lallemandbaking.com/fr/canada/boulangers-industriels/levure-de-boulangerie/levure-osmotolerante/) | Describes lower-invertase baker’s yeast, the French wording `levure de boulangerie résistante à la pression osmotique`, higher-sugar sweet-dough use, and fresh/instant-dried presentations. Product-specific; not a universal composition, threshold, density, or dose. |
| **WP02-E-YEAST-20261009-S12** | Lallemand Baking, [Osmotolerant Yeast — English page](https://www.lallemandbaking.com/en/belgium/industrial-bakers/bakers-yeast/osmotolerant-yeast/) | Uses `osmotolerant yeast` / `osmotically-resistant baker’s yeast` and confirms fresh and instant-dried offerings for sweet dough. The page is the manufacturer’s English regional site, not a Canadian product specification. |
| **WP02-E-YEAST-20261009-S13** | Lallemand Baking Canada, [Levure de boulangerie](https://www.lallemandbaking.com/fr/canada/boulangers-industriels/levure-de-boulangerie/) | Lists cream, compressed/crumbled, and dry bakery-yeast formats; describes instant yeast as an extruded, dried form. Supports caution about equating all “fresh yeast” with compressed cake yeast; industrial product scope does not establish household measurement rules. |
| **WP02-E-YEAST-20261009-S14** | Cuisinart Canada, [CPZ-120C French instruction booklet](https://www.cuisinart.ca/on/demandware.static/-/Sites-master-ca/fr_CA/v1775034248828/Instruction%20Booklet/cpz120c_ib_fr.pdf) | French Canadian recipe/manual wording distinguishes `levure sèche active` and `levure instantanée` in its bread-machine context. Does not establish equivalence outside the cited recipes. |

## Coordinator checks before integration

1. Decide whether to narrow `ingredient-ref-yeast` to baker’s yeast and what to do with the existing broad `yeast` / `levure`, `dried yeast`, and `sachet de levure` keys.
2. Accept or revise the separate active dry, instant, compressed-cake, and osmotolerant identity candidates. The recommendation is a separate osmotolerant identity under today’s schema; do not make it a form alias or combine it with fresh/instant presentation identities.
3. Resolve generic `fresh yeast` / `levure fraîche`, the rapid-rise/quick-rise term family, and brand/product names before activating aliases.
4. If the instant identity is accepted, link recipe 072’s exact `8 g instant yeast` row to it in a future integration; leave recipe 005’s broader dried yeast and recipe 076’s unqualified yeast on the parent.
5. Keep all numeric observations inactive and preserve unset density, unit mappings, forms, yields, conversions, and substitutions until evidence is exact-product and recipe-scoped.
6. Keep the wider Section E checklist open for starter/levain, malt, dough improvers, hydrocolloids, and other technical baking ingredients.

## Coordinator integration — 2026-10-09

The existing `ingredient-ref-yeast` now displays `baker's yeast` / `levure de boulangerie`, with broad yeast and baking-yeast terms retained as search aliases. Added `ingredient-ref-active-dry-yeast`, `ingredient-ref-instant-yeast`, `ingredient-ref-compressed-yeast`, and `ingredient-ref-osmotolerant-yeast`. Only recipe 072's explicit `8 g instant yeast` line was relinked to the instant identity; its source wording and preparation are retained. Recipe 005's `dried yeast` and recipe 076's unqualified `yeast` remain on the baker's-yeast parent.

Source-specific package weights, volume observations, and conflicting manufacturer replacement advice remain in the research ledger only. No active density, unit mapping, form, package yield, conversion, or substitution was added. Rapid-rise/quick-rise families and unqualified fresh yeast remain unresolved; independent Québec review of the osmotolerant display remains open. Section E remains incomplete beyond this yeast batch.

The package grew from the proposal-time snapshot of 447 references, 17 forms, 614 ledger records, 764 source entries, 99 legacy candidates, and 114 recipes / 1,123 ingredient rows to 453 references, 17 forms, 620 records, 808 source entries, 99 legacy candidates, and 114 recipes / 1,123 rows. Current reference, form, manifest, ledger, and recipe-corpus SHA-256 values, plus final test and emulator results, are recorded in the global checklist and workflow checkpoint.

The proposal research itself changed only this file. The later coordinator integration updated canonical references and ledger, recipe 072, generated index, checklist, workflow, roadmap, and relevant unit tests.
