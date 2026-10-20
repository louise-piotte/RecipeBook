# WP02 A7 Round 21: sprouted rye flour identity and Québec French review

## Review record

- **Review date:** 2026-10-13.
- **Status:** Integrated on 2026-10-13 as a ledger-only unallocated candidate; no active reference was added. See the R21 integration batch README.
- **Scope:** One distinct Section A7 flour gap: the product named sprouted rye flour. The broad A7 checklist does not list this candidate by name; it keeps the wider A7 identity review open for other grain meals, malted/toasted flour identities, and gluten-flour equivalence ([plan line 1435](../../RecipeBook-global-ingredient-catalog-plan.txt#L1435)). If integrated, add a named child item for this candidate.
- **Source register IDs:** The new product sources are recorded in the shared research ledger. The OQLF rye-flour source and Québec germination evidence reuse existing ledger IDs where available; source-ID limitations are described in the integration batch README.
- **Review inputs:** Current root [AGENTS.md](../../../AGENTS.md), active [roadmap](../../../roadmap.md), [catalog workflow](../ingredient-catalog-workflow.md), A7 flour summary, live seed references/forms/manifest/recipe files and ledger, and archived proposals/batches.

The focused archive search found no prior A7 decision for sprouted rye flour. The A7 grain-meal and malted/toasted-flour review and its residual follow-up do not cover this identity. The WP03 [sprouted rye berries review](wp03-section-f-next-gap-review-20261012-round7.md) explicitly keeps flour separate because it reviews intact sprouted rye kernels; that whole-grain naming hold does not decide a flour name. The current WP02 A6 round 20 Navane packet is a different category and candidate.

## Recommendation

| Candidate | Disposition | Proposed catalog delta | Boundary |
|---|---|---|---|
| Sprouted rye flour | **Propose a separate identity, gated on independent Québec French review** | ID **ingredient-ref-sprouted-rye-flour**; English display **sprouted rye flour**; provisional Québec French display **farine de seigle germé**; category **FLOUR_AND_STARCH**; no aliases. | Current Canadian product and bilingual label sources name flour made with sprouted rye. Keep it separate from unsprouted rye flour grades, rye meal, malted/toasted/roasted rye flour, whole sprouted rye berries, and fresh living rye germinations. |

The exact French phrase appears in a Canadian bilingual product label, but it is not an OQLF term. Independent Québec review should accept the display and the search effect described below before integration. If the reviewer finds the wording or the fact that a bare seigle germé query selects this flour too ambiguous, keep the candidate held and seek another attested name; do not construct a replacement French term.

Use a separate flour identity rather than attaching a sprouted form to ordinary rye flour. The sources name a flour product made from sprouted rye, and the active catalog already models sprouted buckwheat flour and sprouted amaranth flour as distinct flour references. A sprouted black-bean-flour form exists elsewhere, but it does not settle the rye product boundary. No conversion between sprouted and unsprouted rye flour is supported.

## Product and naming boundary

Anita’s Organic Mill names “Organic Sprouted Rye Flour” as an ingredient in its 60/40 Baker’s Blend, and the accompanying bilingual package sheet prints “Sprouted rye flour” / “Farine de seigle germé.” Everspring Farms separately lists sprouted rye flour and describes dark and medium variants, including medium flour with some bran sifted out. Together these sources support a named flour identity, but they do not establish a universal extraction rate, bran level, grind, germination protocol, or whole-grain specification for every product.

Keep the candidate distinct from:

- plain, light, medium, whole-grain, malted, toasted, and roasted rye flours;
- rye meal and other coarse rye products;
- sprouted rye berries, which are whole kernels, and the fresh living germinations called “Seigle Germé” in some Québec-facing listings; and
- sprouting rye seed or rye sprouts sold as fresh produce.

The French display retains the label’s masculine agreement in “farine de seigle germé”: germé describes seigle. Do not change it to the unsupported “farine de seigle germée.” The phrase “farine de seigle” alone is the existing generic rye-flour name and remains on its current reference.

## Live ownership and search behavior

Snapshot audited on 2026-10-13: 1,347 active references, 98 ingredient forms, 64 legacy candidates, and 1,660 ledger records with 6,463 source entries. The proposed reference ID and the exact candidate phrases below have no active, form, legacy, or ledger owner. Existing rye-related references remain separate; all have null default density and empty unit mappings.

| Normalized phrase | Current exact owner | Proposed state |
|---|---|---|
| ingredient-ref-sprouted-rye-flour | None | Available as a new reference ID. |
| sprouted rye flour; farine de seigle germé | None | New English and provisional French display phrases. |
| germinated rye flour; farine de seigle germée; seigle germé | None as an exact stored term | No alias proposed. Seigle germé is also discussed in the separate fresh-germination hold; as a query it is a complete word phrase inside the proposed French display. |
| rye flour; farine de seigle | ingredient-ref-rye-flour | Keep on the current reference; the new display will be a phrase match for broad searches. |

The rye references currently include cracked rye, rye grain, rye berries, flakes, meal, generic rye flour, light/medium/whole rye flour, and malted rye flour. No attached form has rye or seigle wording. The current legacy catalog has no exact candidate phrase. The ledger has no sprouted-rye-flour record; candidate-puffed-rye and candidate-toasted-rye-flour remain separate unresolved candidates.

Picker behavior was simulated from [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), which normalizes accents and prefers complete normalized word phrases before falling back to substring matches. Results are static for the audited snapshot, not emulator screenshots.

| Query | Current results | With proposed display |
|---|---|---|
| sprouted rye flour | None | The proposed reference only. |
| farine de seigle germé | None | The proposed reference only. |
| germinated rye flour | None | None; no such alias is proposed. |
| rye flour | Five rye-flour references: light, malted, medium, generic, and whole rye flour | Those five plus the proposed reference. |
| farine de seigle | The same five existing rye-flour references | Those five plus the proposed reference. |
| rye or seigle | Ten rye-related references | The same ten plus the proposed reference. |
| seigle germé | None | The proposed reference through the complete-phrase pass, even without a seigle germé alias. |

The last result is the Québec review gate. Under IngredientSearch.kt, query words are matched as an ordered phrase within a stored term before substring fallback. Therefore “seigle germé” matches the consecutive words in the proposed canonical display “farine de seigle germé” and selects the flour reference today; it does not need a separate alias or fall back to substring matching. That selection can be wrong when someone means a fresh or whole sprouted rye product. The prior WP03 review records Québec sources using “Seigle Germé” for fresh germinations and Québec government guidance describing them as fresh foods; see reused sources WP03-SPRYEBERRIES-20261012-S03–S05 in that review. If a future whole-kernel sprouted-rye reference uses a display containing the same phrase, the query would be expected to return both references. An empty alias list does not remove this canonical-name match.

## Complete recipe-corpus audit

All 114 recipe files listed in the live seed manifest and all 1,123 ingredient rows were inspected. Normalized whole-phrase checks covered the candidate English/French names, germinated/sprouted rye variants, the proposed reference ID, and generic rye/seigle phrases. The scan found **zero matching recipe files and zero matching ingredient rows**; no recipe row links to a rye reference.

The manifest-ordered corpus fingerprint hashes each relative recipe path, a NUL byte, the exact recipe-file bytes, and a trailing NUL byte: **SHA-256 7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c**. There is no bundled recipe demand, amount, form, or link to carry forward.

## Measures, forms, yields, and substitutions

| Concern | Recommendation |
|---|---|
| Household measures and density | Add none. The Anita’s product page gives a 4 × 2 kg blend pack; Everspring’s indexed product text gives bulk bags and a minimum order. These are package/order quantities, not measures for the flour. The Hartley & Berg label sheet reports 1/4 cup (30 g) for the **composite 60/40 blend**; do not transfer that serving to sprouted rye flour or infer a density. |
| Existing rye measurements | The ingredient-ref-rye-flour ledger record has measurement state not_yet_researched and no observations. Keep the USDA 1 cup = 169 g observation on ingredient-ref-rye-grain tied to its source-named food record; it is not a flour measure and must not be transferred. |
| Forms and conversions | Add no rye form, conversion, unit mapping, or package yield. The live forms catalog has no rye/seigle form; the one sprouted black-bean-flour form belongs to a different ingredient. The package-yield file has no rye entry, and no ingredient-specific rye unit conversion exists. |
| Substitutions | Add no global or contextual rule or recipe-line substitution. The active global and contextual substitution-rule files are empty, and no reviewed source establishes a tested replacement ratio between sprouted and unsprouted rye flour or another flour. |
| Recipe links | Add none. The complete corpus contains no rye/seigle ingredient rows. |

## Source register and collision audit

New source IDs use prefix WP02-A7-SPROUTED-RYE-FLOUR-20261013-R21. All four IDs and all four URLs were checked against the live ledger and archived proposal/batch Markdown; no collision was found. The prefix is absent from both places. The OQLF base-term source and prior fresh-germination evidence are reused under their existing IDs rather than duplicated.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| **New WP02-A7-SPROUTED-RYE-FLOUR-20261013-R21-S01** | Anita’s Organic Mill / Nature’s Path, [60/40 Baker’s Blend Flour](https://naturespath.com/en-ca/products/bakers-blend-flour-aom-ca), ingredient declaration and mill description; accessed 2026-10-13. | The current manufacturer-hosted page names Organic Sprouted Rye Flour as one component of a 60/40 flour blend and says Anita’s grains are milled, sprouted, blended, and packaged at its Chilliwack mill. The page showed the multipack as sold out; no availability claim is made. This is blend-component evidence, not a standalone flour specification or measure. |
| **New WP02-A7-SPROUTED-RYE-FLOUR-20261013-R21-S02** | Everspring Farms, [Sprouted Rye Flour](https://www.everspringfarms.ca/product/sprouted-rye-flour/), product descriptions and product-code table; search-indexed page crawled about two weeks before review. | The manufacturer page lists sprouted rye flour, organic and regenerative variants, and describes dark and medium products. It says medium flour may have some bran sifted out. Direct page opening returned a cache miss, so use only the indexed manufacturer text; do not infer current stock or a universal grade/process. |
| **New WP02-A7-SPROUTED-RYE-FLOUR-20261013-R21-S03** | Hartley & Berg, [Anita’s 60/40 Baker’s Blend package sheet](https://hartleyberg.com/wp-content/uploads/2022/01/Anitas-Organic-Mills-60-40-Bakers-Blend-Flour-Hartley-Berg.pdf), pp. 1–2. | A bilingual package sheet names “Sprouted rye flour” and “Farine de seigle germé” as ingredients of a blend. Its 1/4 cup (30 g) Nutrition Facts basis belongs to the composite blend only. The sheet supports exact Canadian bilingual label wording, not an OQLF-preferred generic term, standalone flour availability, or a transferable measure. |
| **New WP02-A7-SPROUTED-RYE-FLOUR-20261013-R21-S04** | Walmart Canada, [Stonemill 12-grain sprouted rye bread](https://www.walmart.ca/fr/ip/pain-de-seigle-germ-aux-12-grains-honest-wellness-stonemill-454-g/6000197290251), French ingredient statement. | The French-Canadian listing uses “Farine de seigle germé” for a bread component. Walmart states its product details are supplied by manufacturers, suppliers, or sellers and are not independently verified. This corroborates Canadian retail usage, not standalone flour specifications or preferred Québec terminology. |
| **Reused WP02A4-S01** | OQLF, [farine de seigle (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489069/farine-de-seigle), preferred term and English equivalent. | Supports the base term “farine de seigle” / “rye flour.” It does not attest the sprouted compound. This existing source ID and URL are reused. |
| **Reused WP03-SPRYEBERRIES-20261012-S03–S05** | Prior [sprouted rye berries review](wp03-section-f-next-gap-review-20261012-round7.md), source register entries for the Ferme La Défriche / Marché Outaouais “Seigle Germé bio” listing and Québec government pages on germination and handling. | Supports the separate fresh-living-germination context that makes the short picker query “seigle germé” ambiguous. The cached farm product page did not establish a shelf-stable flour; government guidance describes fresh germinations, not flour terminology. Reuse these records and do not create duplicate source IDs. |

The proposed ingredient ID ingredient-ref-sprouted-rye-flour is absent from current reference, form, legacy, and ledger record IDs. Among the new candidate sources, the OQLF page is the only existing URL reused; it already has source IDs including WP02A4-S01. The three prior fresh-germination sources are also reused by their existing WP03 IDs. The four new source URLs are not exact URLs in the current ledger or archived proposals/batches.

## Root integration recommendation

Treat sprouted rye flour as an A7 identity candidate distinct from ordinary rye flour and from the held whole-kernel sprouted rye berries candidate. If the independent Québec reviewer accepts both the exact product-label display and the known effect that a bare seigle germé query selects the flour, integrate only the identity row with no aliases, density, unit mappings, forms, yield, conversion, recipe link, or substitution. Keep the broader A7 checklist open. If the display or query effect is declined, leave this candidate unallocated until a Québec-acceptable wording is evidenced.

This is a documentation proposal only. No tests or emulator checks were run.
