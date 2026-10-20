# WP03 Section F: regional Dalia cereal and alias boundary (2026-10-12)

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Integrated into the cracked-wheat research ledger as boundary evidence only. No active alias or measurement observation was added.
- **Scope:** One concrete residual in Section F's open regional-cereal and preprocessed-grain coverage: current Canadian products sold as cracked-wheat Dalia, the Québec-facing French label for one such product, and the cross-product ambiguity of unqualified Dalia terms.
- **Accepted integration:** Keep the existing cracked-wheat identity and its Québec French display. Record the source-attested product titles and competing Dalia uses as boundary evidence, but **do not activate either Dalia phrase as an alias**. The current search matcher finds a query word inside a longer alias, so either qualified alias would make a bare “dalia” query return cracked wheat. Fortinos describes the Suraj product as coarsely ground; CFIA defines crushed/coarse-ground wheat separately from cracked wheat. The product-specific 40 g serving therefore was not attached to the existing cracked-wheat identity. Keep generic or multigrain Dalia, Dallia/Daliya, Fada, and bulgur-crosswalk claims held.
- **Plan and roadmap context:** The Section F checklist still leaves regional cereal mixes and preprocessed grains open ([plan, regional cereal mix item](../../RecipeBook-global-ingredient-catalog-plan.txt#L2028)). Recent focused work has already addressed chiwda/chivda, wheat flakes, amaranth flakes, Khorasan flakes, millet flakes, bran flakes, shredded wheat cereal, and other named flakes. The current roadmap keeps Section F in progress after those integrations. This packet does not repeat or reopen them.
- **Workflow:** The catalog workflow keeps research proposals separate from integration; the integration owner allocates or updates shared records after review ([workflow](../ingredient-catalog-workflow.md)).

## Disposition

Current product listings use “Cracked Wheat Dalia” and **blé concassé (dalia)** for a Suraj 800 g item. OQLF's existing GDT evidence supports the base French term **blé concassé**, while the retail listing does not establish an OQLF naming ruling. The Government of India's Wheat Porridge (Dallia) rules define a wheat product ground to granules with most flour sifted out. These are product-label attestations, not proof that the Suraj item meets the Canadian cracked-wheat identity: Fortinos describes it as whole wheat that is coarsely ground, and CFIA distinguishes crushed/coarse-ground wheat from cracked wheat. The listings also do not make bare Dalia a safe global name for wheat.

The current catalog search matches a complete normalized query phrase inside a longer indexed term, then falls back to substring matching. If either qualified Dalia title is added to the cracked-wheat aliases, searching only **dalia** will match that longer term and return cracked wheat. This erases the qualifier in search results. The existing [WP03 Section H chickpea review](wp03-h-chickpea-types-roasted-gram-review-20261011.md) says not to add bare Dalia/Daliya aliases because the terms cross whole roasted seeds, split roasted gram, and flour contexts. A Canadian retailer listing also uses “Roasted Dalia (Split Chickpeas).” Therefore, keep the qualified phrases source-attested but inactive until search can preserve qualification or another safe display mechanism is available.

## Pre-integration package and corpus snapshot

Snapshot rechecked after the Section A German wheat-type integration. File hashes cover exact bytes. The corpus fingerprint hashes each manifest-relative recipe path, a NUL byte, the exact recipe bytes, and a trailing NUL byte in manifest order.

| Artifact | Pre-integration count/state | SHA-256 or corpus fingerprint |
|---|---:|---|
| ingredient-references.v1.json | 1,233 references; 112 in GRAIN_AND_CEREAL | 0a0336b7429232a4a48eb344c266d8e5ba94aa587047186c2bd56b6af62b6e0d |
| ingredient-forms.v1.json | 86 forms | 24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978 |
| legacy-import-identities.v1.json | 66 candidates | bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f |
| research-ledger.v1.json | 1,531 records; 5,263 source entries; 4,305 distinct source IDs | d26175916691ffa17d6ac3b7b79edf8d08afcfbe2da0d26411b52bc2211cc9fa |
| manifest.v1.json | 114 recipe paths | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 752,993 recipe-file bytes | 2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27 |

The same recipe counts, byte total, and fingerprint were reproduced after the parent reconciled recipe 090#17.
The post-integration ledger snapshot is recorded in the [integration report](../batches/wp03-section-f-dalia-boundary-integration-20261012/README.md).

## Existing identities and normalized ownership

| Surface | Live state |
|---|---|
| Cracked wheat | ingredient-ref-cracked-wheat; cracked wheat / blé concassé; category GRAIN_AND_CEREAL; no aliases; defaultDensity null; unitMappings empty. Its ledger identity is verified; measurement and substitution research are not_yet_researched. |
| Bulgur | ingredient-ref-bulgur; bulgur / boulgour; no aliases. It has four distinct active forms: fine, medium, coarse, and extra coarse bulgur, displayed as boulgour fin, boulgour moyen, boulgour gros, and boulgour extra gros. |
| Cracked-wheat forms | None. No form or grade phrase is assigned to cracked wheat. |
| Legacy candidates | No exact Dalia, broken-wheat, Fada, or multigrain-Dalia candidate. |

The audit used the repository's accent-, ligature-, case-, and punctuation-folding function on active reference names/aliases, form labels/match terms, and legacy names/aliases. Exact normalized ownership is:

- cracked wheat and blé concassé resolve only to ingredient-ref-cracked-wheat;
- bulgur and boulgour resolve only to ingredient-ref-bulgur;
- Dalia, Dallia, Daliya, cracked wheat dalia, blé concassé (dalia), Dalia de blé concassé, Dalia de blé fendu, broken wheat, Fada, Fada wheat, bulghur, burghul, wheat porridge, and multigrain Dalia have no exact active reference, form, or legacy owner.

The ledger contains no exact normalized Dalia candidate. A loose text search finds “Vidalia” within an onion source record; it is not a Dalia product record or exact-key owner. Proposal-local source IDs WP03-DALIA-WHEAT-ALIAS-20261012-S01 through S08 were checked against all current ledger source IDs and were absent.

## Recipe-demand audit

Every recipe file named by the active manifest was scanned, in manifest order, using the complete candidate phrase set from the ownership audit. The scan covered full recipe text and each ingredient row's originalText, ingredientName, and ingredientRefId. It found **zero matching recipe files and zero matching ingredient rows** among all 114 recipes and 1,123 rows. No row is linked to cracked wheat or bulgur. No recipe link or recipe text change is proposed.

## Candidate decisions

| Candidate | Decision | Reason and exact shared-data effect |
|---|---|---|
| cracked wheat dalia | **Hold as an active alias.** | Fortinos currently titles the Suraj 800 g product “Cracked Wheat Dalia,” and the product description says it is whole wheat coarsely ground. The exact phrase is source-attested, but adding it would make a bare “dalia” query return cracked wheat under the current matcher. Record it as source evidence on the existing cracked-wheat ledger entry; add no active alias. |
| blé concassé (dalia) | **Hold as an active alias.** | A current Québec-facing listing for Suraj's 800 g product uses this exact title. OQLF already supports blé concassé as the base French name. The qualified alias would still make the bare query “dalia” return cracked wheat. Do not change the canonical French display. |
| Bare Dalia, Dallia, and Daliya | **Hold.** | The official Dallia rule defines a wheat-porridge product, while current Canadian retail evidence also uses Dalia for roasted split chickpeas. Preserve the explicit hold in the WP03 Section H chickpea review. Add no alias, form, new identity, or recipe link. |
| Multigrain Dalia / Dalia multigrains | **Hold as an identity and alias.** | The Canadian seller's product description names a mix of wheat, millet, and other cereals but does not give a complete formula; the same description also calls it gluten-free despite listing wheat. This is product-specific and internally inconsistent, not a stable generic cereal-mix identity. Add no row or formula. |
| Fada, Fada wheat, broken wheat, bulghur, burghul, and “Bulgur #3” | **Hold as cracked-wheat or bulgur aliases.** | A current Rani marketplace listing combines these terms and describes a parboiled, dried, cracked wheat product as both Fada and Bulgur #3. That listing cannot establish interchangeability or a Québec grade crosswalk. Keep cracked wheat separate from bulgur; preserve the four reviewed bulgur forms and existing Québec naming decision. |
| Wheat porridge | **Hold as a generic alias.** | The official Dallia standard describes a granulated product intended as porridge, but a porridge name can refer to the prepared food. This packet has no product-specific Québec display or recipe demand for a separate cooked identity or form. |

## Measurement, form, conversion, and substitution findings

Fortinos reproduces a nutrition-panel serving declaration of **40 g** for the Suraj Cracked Wheat Dalia product. It supplies no cup, volume, fill method, or recipe-specific amount. The value remains source evidence in this proposal and is **not** entered as a measurement observation under the existing cracked-wheat record: the listing describes the product as coarsely ground, which does not establish that it meets that record's CFIA-based angular-fragment identity.

| Field | Measurement decision |
|---|---|
| Question | Accepted decision |
| Product label | Fortinos' page titles the item “Cracked Wheat Dalia” and prints “Serving Size Per 40 g.” |
| Identity match | Not established. The same page describes whole wheat that is coarsely ground; CFIA defines that product class separately from cracked wheat. |
| Ledger treatment | Keep the 40 g value in source evidence only. Do not create a portion observation under `ingredient-ref-cracked-wheat`; leave `measurementState: not_yet_researched`. |

The product's 40 g label serving does not support a generic cracked-wheat serving, household measure, mass-volume conversion, default density, unit mapping, package yield, cooking yield, or form conversion. Keep defaultDensity null and unitMappings empty. Add no IngredientForm: the product title does not establish a reusable grind class or measurable form boundary. Product pages describe uses such as porridge, upma, khichdi, pilaf, soups, or side dishes; generic marketing statements about replacing rice or pasta are not tested, quantity-qualified substitutions. Add no substitution finding or active rule; leave substitution research not_yet_researched. Add no recipe-line links.

## Overlap and preservation of prior decisions

- The existing [WP02 Section A7 cracked-wheat identity](wp02-a7-wheat-meal-current-product-boundary-review-20261011.md) is retained. No second Dalia reference is proposed.
- The [WP03 Section H chickpea packet](wp03-h-chickpea-types-roasted-gram-review-20261011.md) explicitly keeps Dalia/Daliya out of chickpea aliases due to whole-roasted, split-roasted, and flour contexts. This packet preserves that decision and adds one current Canadian product example of “Roasted Dalia (Split Chickpeas).”
- The active bulgur identity and its four grind forms remain separate from cracked wheat. The [prior Québec bulgur review](wp03-section-f-bulgur-grade-quebec-display-review-20261011.md) and OQLF evidence are preserved; source ID WP02-S104 is already cited on the cracked-wheat ledger record. The OQLF GDT entry for blé concassé is already documented as WMA7-20261010-S05 on the wheat-meal research record. Do not duplicate either source ID.
- The [Section F chiwda/chivda hold](wp03-section-f-chiwda-chivda-alias-boundary-review-20261012.md) remains as accepted; this packet does not create a generic prepared-cereal-snack identity.
- Wheat flakes, Khorasan flakes, millet flakes, triticale flakes, bran flakes cereal, shredded wheat cereal, amaranth flakes, and previously reviewed cereal products remain unchanged.

## Integration outcome

Integrated shared-file changes:

1. In docs/catalog/research-ledger.v1.json, append proposal-local sources S01–S08 to the existing `ingredient-ref-cracked-wheat` record and append an accepted boundary decision. Keep its `measurementState` as `not_yet_researched`; no measurement observation was added because the 40 g serving belongs to a product that the cited page describes as coarsely ground.
2. Leave `ingredient-references.v1.json` unchanged: no Dalia aliases, new identities, or changes to the canonical cracked-wheat or bulgur displays.
3. Leave `ingredient-forms.v1.json`, recipes, recipe links, package yields, unit conversions, substitution rules, and generated `BundledIngredientCatalog.kt` unchanged.
4. Record this completed review beneath the still-open regional cereal-mix and preprocessed-grain checklist item. The broader Section F checklist stays open.

## Remaining Section F gaps

This scoped alias and product-boundary review does not close Section F. The plan still leaves regional cereal mixes and preprocessed grains open. Separate reviews continue to hold unqualified farro, generic sushi rice, pearled hominy, pozole corn, generic grits and polenta, dried sweet corn, and some puffed-grain products. Species-level grain coverage and independent Québec wording also remain incomplete, including reviewed holds for brown-top, barnyard, and Sikiya/crab-finger millet and unresolved sorghum-flake naming. Dry/cooked forms remain evidence-driven and should be reviewed only where exact recipe or measurement evidence supports them.

## Proposal-local source register

Sources were reviewed on 2026-10-12. The new IDs below are unique to this packet and were checked absent from the live ledger before drafting.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| WP03-DALIA-WHEAT-ALIAS-20261012-S01 | Government of India, [Wheat Porridge (Dallia) Grading and Marking Rules, 2000](https://upload.indiacode.nic.in/showfile?actid=AC_CEN_23_31_00011_193701_1535099362507&filename=wheat_porridge_%28dalia%29_grading_and_marking_rules_2000.pdf&type=rule), definition of Wheat Porridge (Dallia). | Defines a product made from properly cleaned wheat ground to a granular product with as little flour as possible, most of which is removed by sifting; the removed flour is limited to 10 percent of whole wheat. Supports a scoped wheat-porridge product sense, not a universal cracked-wheat grade, recipe amount, or Québec display. |
| WP03-DALIA-WHEAT-ALIAS-20261012-S02 | Fortinos/Loblaw, [Suraj Cracked Wheat Dalia, 800 g](https://www.fortinos.ca/en/cracked-wheat-dalia/p/21068371_EA), product title, description, and nutrition panel. | Current Canadian retail page says prepared in Canada, titles the item “Cracked Wheat Dalia,” describes it as whole wheat coarsely ground, lists wheat as the ingredient, and declares a 40 g serving. This is one product listing; 40 g is not a cup measure, density, or general cracked-wheat serving. |
| WP03-DALIA-WHEAT-ALIAS-20261012-S03 | Aubaine.ca, [Blé concassé (dalia)](https://aubaine.ca/aliment/ble-concasse-dalia-epc-upekswhixiyf), Suraj 800 g listing compared at Maxi and Provigo. | Supports the exact Québec-facing French retail title. The aggregator page's direct open returned an internal error; the indexed result shows the product title and retailer comparison. It is a listing, not an OQLF terminology ruling or product specification. |
| WP03-DALIA-WHEAT-ALIAS-20261012-S04 | Walmart Canada French, [Wheat Cracked Dalia - French](https://www.walmart.ca/fr/ip/WHEAT-CRACKED-DALIA-FRENCH/4MNHAEG9D9AA), item title and details. | The French marketplace page lists “AL PREMIUM DALIA DE BLÉ FENDU” and describes “blé concassé Desi (Dalia).” It was out of stock at review and carries Walmart's third-party-information disclaimer. This is corroborating Canadian French listing text, not an approved Québec display. |
| WP03-DALIA-WHEAT-ALIAS-20261012-S05 | Walmart Canada, [Dalia Indian (Crack Wheat)](https://www.walmart.ca/en/ip/DALIA-INDIAN-CRACK-WHEAT/6000188763061), PTI item details. | A current Canadian listing presents Dalia Indian (Crack Wheat), wheat grain type, granules, and cracked wheat as ingredient. It corroborates a qualified English market phrase; marketplace product metadata does not establish Québec French naming or a broader synonym. |
| WP03-DALIA-WHEAT-ALIAS-20261012-S06 | Spice Divine, [Jabsons Roasted Dalia (Split Chickpeas), 400 g](https://spicedivine.ca/fr/collections/vendors?page=2&q=jabsons), indexed French product listing. | Uses Dalia in a named roasted split-chickpea snack. The item was listed out of stock. This is direct evidence that the bare term family crosses away from cracked wheat; it does not establish a wheat alias. |
| WP03-DALIA-WHEAT-ALIAS-20261012-S07 | Spice Divine, [From The Earth Organic Gluten-Free Multigrain Dalia, 2 lb](https://spicedivine.ca/fr/products/from-the-earth-organic-gluten-free-multigrain-dalia-2lb), product description. | Describes a product-specific mixture including wheat, millet, and other grains, while also claiming that the product is naturally gluten-free. The page was out of stock and does not provide a full formula. It supports holding the generic mix identity. |
| WP03-DALIA-WHEAT-ALIAS-20261012-S08 | Walmart Canada, [Rani Cracked Wheat Coarse (Fada / Commonly called Bulgur #3)](https://www.walmart.ca/en/ip/Rani-Cracked-Wheat-Coarse-Fada-Commonly-called-Bulgur-3-4lb-64oz-All-Natural-Vegan-No-Colors-NON-GMO-Kosher-Indian-Origin/7659AHK6QHPD), product details. | The US-based brand's Canadian marketplace listing calls the item cracked wheat coarse, Fada, broken wheat, and Bulgur #3 and describes parboiling before drying/cracking. Its incompatible product-name crosswalk is treated as a hold signal, not as evidence that cracked wheat and bulgur are interchangeable. |

Existing terminology sources are reused without new source IDs: OQLF's GDT entry for [blé concassé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2494947/ble-concasse) is recorded as WMA7-20261010-S05, and OQLF's GDT entry for [boulgour](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502438/boulgour) is already recorded on the cracked-wheat reference as WP02-S104. OQLF supports blé concassé as the Québec French base term and defines boulgour as precooked, dried, germinated wheat that is cracked.
