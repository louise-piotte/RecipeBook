# WP03 Section F — multigrain-flake blend identity review (2026-10-12)

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Proposal only. No active reference, form, ledger entry, recipe link, or runtime data is changed by this file.
- **Open checklist:** Section F still requests review of regionally significant cereal mixes and preprocessed grains ([global plan, line 2129](../../RecipeBook-global-ingredient-catalog-plan.txt#L2222)). Recent work already covers grain-specific flakes, branded hot cereals, and separate granola/muesli identities.
- **Selected boundary:** a dry blend made from flakes of multiple cereal grains, marketed as a loose ingredient mix.
- **Recommendation:** add identity-only **multigrain flakes / flocons multigrains** as **ingredient-ref-multigrain-flakes** in **GRAIN_AND_CEREAL**. Add **multi-grain flakes** as the sole English spelling alias. Leave French aliases, forms, density, unit mappings, recipe links, yields, and substitution rules empty.
- **Prior mentions:** the spelt-flakes and Khorasan-flakes reviews mention multigrain flakes only as a neighboring composite product. They do not allocate an identity or decide the mixed-flake boundary ([spelt-flakes review](./wp03-section-f-spelt-flakes-identity-review-20261011.md), [Khorasan-flakes review](./wp03-section-f-khorasan-flakes-identity-review-20261012.md)).

## Identity recommendation

The reviewed Québec mill sells a dry product whose cereal-grain components are all flakes. Its current product pages name the product Organic Multigrain Flakes / Flocons multigrains biologiques and list organic oat, barley, wheat, rye, and Khorasan flakes. A Québec retailer independently lists the French product title and same ingredient list. A second manufacturer sells multigrain flakes with a different five-grain formula. These sources support a useful source-neutral identity for a blend of cereal flakes without fixing one formula, grain count, brand, or organic claim.

| Field | Proposed value | Scope |
|---|---|---|
| Stable ID | ingredient-ref-multigrain-flakes | Unallocated; no active reference or ledger candidate owns the ID. |
| English display | multigrain flakes | A dry blend of flakes made from at least two cereal grains. Do not retain the source SKU’s organic claim in the generic name. |
| Québec French display | flocons multigrains | Exact current Québec manufacturer wording, corroborated by a Québec retailer. This is product-attested wording; no OQLF product entry for the compound was found. |
| English aliases | multi-grain flakes | OQLF lists multi-grain as an English term for multigrain in the food domain. This is a spelling alias only. |
| French aliases | None | Retain the directly attested display. Do not mechanically create flocons multicéréales or flocons multi-grains. |
| Category | GRAIN_AND_CEREAL | Composite dry cereal-grain flake product. |
| Density and mappings | defaultDensity null; unitMappings empty | No general volume-to-mass source was found. |

The identity covers unseasoned, loose mixtures whose declared cereal ingredients are flakes. Component species and proportions may vary by product. It does not imply that all ingredients are whole grain, organic, ready to eat, gluten-free, or interchangeable with oat flakes.

Keep these adjacent products distinct:

- Species-specific flakes, including rolled oats, barley flakes, wheat flakes, rye flakes, spelt flakes, Khorasan flakes, millet flakes, amaranth flakes, triticale flakes, buckwheat flakes, quinoa flakes, brown-rice flakes, and red-rice flakes.
- Muesli, granola, bran-flakes cereal, shredded-wheat cereal, Red River cereal, Sunny Boy cereal, and other named or formulated breakfast cereals.
- Frosted Flakes Multigrain / Céréales Frosted Flakes Multigrains Moins de sucre. The Canadian manufacturer presents this as a finished breakfast cereal product, not a plain bag of dry cereal-grain flakes.
- Mixtures containing seeds, nuts, sweeteners, chocolate, flour, bran, or extruded pieces as defining components. Do not make these aliases of the plain flake blend.

The general adjective multigrain is intentionally broad: OQLF defines it as describing food made from grains of multiple cereals and lists multigrain and multicéréale as preferred French adjectives. The identity boundary therefore comes from the product phrase and component list, not from the adjective alone.

## Alias ownership and picker boundary

The current catalog, forms, legacy candidates, and research ledger were checked with the repository’s search-key normalizer. No exact normalized owner was found for the reviewed candidate phrases or proposed ID.

| Candidate key | Current exact owner | Disposition |
|---|---|---|
| multigrain flakes / multigrain flake | None | Use the plural product display. The current picker’s substring fallback finds the singular query in the plural display, so no singular alias is needed. |
| multi-grain flakes | None | Add as the one English orthographic alias, supported by OQLF’s English term list. |
| flocons multigrains / flocon multigrain | None | Use only the attested French display; no French alias is needed. |
| multicereal flakes / multi-cereal flakes / mixed-grain flakes | None | Do not add. The sources do not establish these as the same Québec ingredient phrase. |
| multigrain cereal / multigrain breakfast cereal / céréales multigrains | None | Do not add. These can name finished breakfast cereals with additional ingredients and processing. |
| ingredient-ref-multigrain-flakes / candidate-multigrain-flakes | None | Both identifiers are unallocated. |

The phrase-first picker can match a shorter phrase within a longer product name. The proposed row should therefore keep the full qualified display and avoid aliases such as multigrain cereal or breakfast cereal. The current Canadian Frosted Flakes manufacturer page demonstrates that multigrain is also used in a separate ready-to-eat cereal line. If that product family is later added, a full multigrain query may appropriately show both distinct product choices; the plain flake-blend row must not absorb flavored or formulated cereal products.

Current neighboring active identities include ingredient-ref-rolled-oats, ingredient-ref-barley-flakes, ingredient-ref-wheat-flakes, ingredient-ref-rye-flakes, ingredient-ref-spelt-flakes, ingredient-ref-khorasan-flakes, ingredient-ref-malted-wheat-flakes, ingredient-ref-millet-flakes, ingredient-ref-amaranth-flakes, ingredient-ref-triticale-flakes, ingredient-ref-buckwheat-flakes, ingredient-ref-quinoa-flakes, ingredient-ref-brown-rice-flakes, and ingredient-ref-red-rice-flakes. None is an exact owner of the mixed-flake candidate.

## Forms, measurements, and conversions

- **Forms:** add none. The blend is a composite product identity, not a form of oat, barley, wheat, rye, or Khorasan.
- **Product size:** La Milanaise lists a 500 g package. This is a product/package fact, not a serving size, package yield, household measure, or mass-volume conversion.
- **Preparation direction:** the French manufacturer page suggests two parts water to one part flakes and simmering at low heat for about ten minutes. It does not state whether “parts” are measured by mass or volume and describes one product’s preparation. Do not infer a generic cooked form, cooking yield, density, unit mapping, or conversion.
- **Density and unit mappings:** no reviewed source gives a generic cup weight or volume-to-mass relation. Keep null density and empty unit mappings.

## Substitution evidence

La Milanaise describes its blend as a good alternative to conventional oat flakes. This is a manufacturer’s qualitative product suggestion without a replacement amount, recipe context, cooking method crosswalk, or tested performance conditions. Record it, if useful, only as a source-specific claim. Do not create a global or contextual substitution rule between multigrain flakes and rolled oats, another grain flake, or a finished breakfast cereal.

The other product pages describe uses in porridge, granola, breads, cookies, or muffins. Those use suggestions do not establish a reusable substitution.

## Bundled recipe demand

All 114 manifest-listed recipe files and 1,123 ingredient rows were searched for multigrain flakes, multigrain flake, multi-grain flakes, multicereal flakes, multi-cereal flakes, mixed-grain flakes, flocons multigrains, flocon multigrain, flocons multi-grains, flocons multicéréales, multigrain cereal, and multigrain breakfast cereal.

| Corpus check | Result |
|---|---:|
| Candidate phrase in complete recipe files | 0 / 114 |
| Candidate phrase in structured ingredient rows | 0 / 1,123 |
| Broader multigrain / flocons multigrains mention in ingredient rows | 0 |
| Recipe links supported | 0 |

No recipe text or amount should be inferred from supplier use suggestions or package sizes.

## Live artifact snapshot

The read-only audit used the current working tree on 2026-10-12.

| Artifact | Count | SHA-256 |
|---|---:|---|
| ingredient-references.v1.json | 1,300 references | e8017fbccef0477fa66b70f41300e44ae79082b1a55c51e3bf3d3418913c2b07 |
| ingredient-forms.v1.json | 98 forms | b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c |
| legacy-import-identities.v1.json | 64 candidates | 69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005 |
| research-ledger.v1.json | 1,608 records | e5ed17619386c80455b128f3df6b6827d68bad8cbf3a6fec389f890c048c8b1d |
| manifest.v1.json | 114 recipe paths | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |

No exact candidate phrase or stable ID is owned in the active reference, form, legacy-candidate, or ledger records. No dedicated multigrain-flake identity proposal or accepted/held identity record was found. Existing spelt- and Khorasan-flake proposals mention the multigrain product only as an excluded sibling.

## Source register

Sources were accessed on 2026-10-12. Where a publication or update date was not shown, the source is identified as a current page with no publication date displayed.

| Source ID | Source and date/access note | Supports and limits |
|---|---|---|
| WP03-MFLAKES-20261012-S01 | Office québécois de la langue française, [multigrain (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8355580/multigrain). Last updated 2005; accessed 2026-10-12. | Defines multigrain in food as made from grains of multiple cereals; gives French preferred adjectives multigrain and multicéréale and English terms multigrain, multi-grain, multicereal, and multi-cereal. Supports the word family and spelling alias, not a flakes-specific product class. |
| WP03-MFLAKES-20261012-S02 | La Milanaise, [Flocons multigrains biologiques](https://lamilanaise.com/produits/flocons-multigrains-biologique/). Current Québec manufacturer page; no publication date shown; accessed 2026-10-12. | Gives the exact French product wording, lists oats, barley, wheat, rye, and Khorasan flakes, describes porridge and baking uses, and calls the product an alternative to traditional oat flakes. It lists a 500 g format and a preparation direction of two parts water to one part flakes for about ten minutes; neither gives a general measure or substitution ratio. |
| WP03-MFLAKES-20261012-S03 | La Milanaise, [Organic Multigrain Flakes](https://lamilanaise.com/en/produits/organic-multigrain-flakes/). Current Québec manufacturer page; no publication date shown; accessed 2026-10-12. | Confirms the English product name, five-grain blend, 500 g format, and use examples. Supports the paired English/French product names but not a universal formula, density, or replacement quantity. |
| WP03-MFLAKES-20261012-S04 | Marche Branche D’Olivier, [Flocons multigrains 500 g](https://branchedolivier.com/products/la-milanaise-flocons-multigtains). Current Québec retailer listing; no publication date shown; accessed 2026-10-12. | Uses the French listing name and repeats the ingredient list; calls the product Québec-made and shows an available online listing. Retailer metadata and package size remain SKU-specific. |
| WP03-MFLAKES-20261012-S05 | Kölln, [Organic Delicate Multigrain Flakes](https://www.koelln.com/products/koelln-organic-delicate-multigrain-flakes). Current manufacturer page; no publication date shown; accessed 2026-10-12. | Its ingredient list contains wholegrain oat, wheat, rye, barley, and spelt flakes. The different formula supports variable composition within a multigrain-flake product family. It is not Canadian/Québec naming evidence. |
| WP03-MFLAKES-20261012-S06 | WK Kellogg Co Canada, [Frosted Flakes, French brand page](https://www.wkkellogg.ca/fr/nos-aliments/nos-marques/frosted-flakes) and [English brand page](https://www.wkkellogg.ca/en/our-foods/our-brands/frosted-flakes). Current pages; English page carries ©2026; accessed 2026-10-12. | The pages list Céréales Kellogg’s Frosted Flakes Multigrains Moins de sucre / Frosted Flakes Less Sugar Multigrain Cereal among distinct products. Supports keeping finished branded breakfast cereals outside the plain flake-blend identity. The pages do not provide this product’s ingredient statement. |
| WP03-MFLAKES-20261012-S07 | Metro Québec, [La Milanaise Organic Multigrain Flakes, product 627062207255](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/ingredients-pour-cuisson-et-preparation/farines-et-essentiels-de-cuisson/flocons-multigrain-biologiques/p/627062207255). Current retailer listing; no publication date shown; accessed 2026-10-12. | The French URL redirected to the English listing, which names Organic Multigrain Flakes and lists oat, barley, wheat, rye, and Khorasan flakes. The selected listing reported out of stock when opened; this does not establish general availability. Its product number and 500 g package are not reusable measures. |

The proposal-local source IDs S01–S07 were checked against the live ledger and are not allocated there. Reuse any source already registered by URL if a later shared-ledger integration follows.

## Acceptance checks for a later integration

1. Add one identity-only GRAIN_AND_CEREAL reference as ingredient-ref-multigrain-flakes with the two reviewed displays.
2. Add only multi-grain flakes as an English alias; keep French aliases empty. Do not transfer organic, brand, component-grain, grain-count, or cereal-ready-to-eat wording.
3. Keep the blend separate from every species-specific flake reference and from granola, muesli, bran-flakes cereal, shredded wheat cereal, Red River cereal, Sunny Boy cereal, and formulated multigrain cereals.
4. Leave forms, recipe links, active measures, density, unit mappings, package/cooking yields, conversions, and substitution rules empty. Keep the manufacturer’s serving/preparation statements source-scoped.
5. Recheck exact normalized ownership and the live picker: the full English and French product phrases should select the blend, and broad cereal queries should retain all distinct products.
6. Recheck the 114-file / 1,123-row bundle before linking any future recipe line. Current demand is zero.
7. Validate source-ID reuse, catalog normalization, generated index freshness, ledger/package consistency, UTF-8 without BOM, and whitespace after any future JSON integration. No tests are required for this research proposal.

## Unresolved gaps

- No stable cross-manufacturer formula or minimum component count is defined. This proposal uses the defensible boundary of flakes from at least two cereal grains and preserves formula variation.
- No OQLF or TERMIUM entry specifically names multigrain flakes. The French display rests on a current Québec manufacturer product page and retailer listing; independent Québec terminology review can still assess the compound.
- A supplier’s “alternative to oat flakes” statement has no amount or scoped validation. Substitution remains unsupported.
- No reusable mass-volume measure, density, unit mapping, or cooking yield was found. The manufacturer’s “parts” direction does not identify a measurement basis.
- Finished multigrain breakfast cereals can use similar words while containing added ingredients or other processed components. Keep those products separate and revisit picker behavior if a specific recipe later requires them.

This proposal completes one scoped Section F review; the wider grain, cereal, regional-mix, terminology, and measurement checklists remain open.
