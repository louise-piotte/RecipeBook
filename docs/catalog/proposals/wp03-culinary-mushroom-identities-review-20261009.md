# WP03 Section N named culinary mushroom identity review

- **Reviewed:** 2026-10-09
- **Status:** proposal only. This packet is the sole file created for this research task; no catalog, ledger, recipe, plan, roadmap, code, or test file was changed.
- **Scope:** 17 named culinary-fungus identities from Section N: button, cremini, portobello, shiitake, oyster and king oyster, enoki, shimeji, maitake, porcini, chanterelle, morel, wood ear, snow fungus, straw mushroom, lion’s mane, and culinary truffles.
- **Excluded:** generic mushroom plural cleanup, candy-cap products, seaweeds/algae, and huitlacoche. The generic mushroom plural alias is already present in the active reference.
- **Plan state:** Section N remains open. This review does not close a checklist item.
- **Recommendation:** keep 17 identity candidates in a review queue, with several French labels explicitly provisional. The tranche adds useful named-product and taxonomic coverage beyond the existing broad coordinator packet, but the bundled recipes do not demand these named rows. Keep the source-qualified portion observations below as research evidence only; do not create active forms, unit mappings, densities, package yields, substitutions, or recipe links from this proposal.

## Coordinator overlap and new contribution

The existing [WP03 fungi and sea-vegetable coordinator review](wp03-fungi-seaweed-coordinator-review-20261009.md) already reviewed the generic mushroom row, its plural-search issue, candy cap, the broader Section N boundaries, and the seaweed/huitlacoche candidates. The current active generic row now carries the English plural alias mushrooms; this packet does not repeat that cleanup. Candy cap, seaweed/algae, and huitlacoche remain outside this tranche.

This packet concentrates on the still-missing named fungi. Its distinct contribution is the candidate set and the product-specific evidence that changes the earlier open questions: a Québec product listing pairs Pleurote Royal with King Oyster; current taxonomic references keep two Hypsizygus species accepted; a 2018 phylogenetic study distinguishes cultivated East Asian enoki from European F. velutipes; older regulatory usage of “enoki” and “shimeji” needs species caution; and current Auricularia research shows that “wood ear” cannot safely be assigned one universal binomial. It also adds named raw/dried portion observations and a separate search for culinary replacements. These findings do not justify global rules.

## Refreshed package snapshot

Counts describe the working-tree snapshot read on 2026-10-09. File digests are SHA-256 over exact bytes. The recipe digest hashes each manifest-relative path, a NUL byte, the recipe’s exact bytes, and another NUL byte, in manifest order.

| Artifact | Count or state | SHA-256 or digest |
|---|---:|---|
| app/src/main/assets/seed/bundled-library/manifest.v1.json | 114 recipe paths | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| app/src/main/assets/seed/bundled-library/ingredient-references.v1.json | 553 references | ef0e0b74cff528390443d3d6f5ea4dbe164b6bc31901be3df4ee01ddbeac9af4 |
| app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json | 33 forms | 275f21eda9369a4c08a869aad3952ebbe2e9e64664ccf0b48af2bb7034928732 |
| app/src/main/assets/seed/bundled-library/substitution-rules.v1.json | 0 active rules | 37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570 |
| app/src/main/assets/seed/bundled-library/contextual-substitution-rules.v1.json | 0 active rules | 37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570 |
| app/src/main/assets/seed/bundled-library/package-yields.v1.json | 1 yield; none for fungi | 5aee6b94cae0c25128ec5c99583089927c945a3438178065bff08b2b0e0d0c2b |
| app/src/main/assets/seed/bundled-library/units.v1.json | 30 units | 6f6e3afc8b2c12fe9120dbcf453d1e675fee596fa754f93cfead040a7ba8c8e4 |
| docs/catalog/research-ledger.v1.json | 731 records; 1,193 source entries; 1,007 distinct source IDs | 7a8ca099dd119fba800c0c3d3f3ef27ecc31bbd02b4e5f3fd911a1c31fb8220f |
| docs/catalog/legacy-import-identities.v1.json | 94 candidates | 1421628350323bd7c3fbf2dc566073cfc602f3dc6ff054b44aca3034680e69b5 |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows | 30e8640e29dfaf52843f22feb3fde376b0e5e618909163548c267d88bd6e41e6 |

Re-run the snapshot and collision checks at integration time if the package changes.

## Audit method

I read the current plan’s Section N checklist and Sections 06–10 research rules, the current roadmap progress, the earlier coordinator packet, all 553 active references, all 33 form rows, all 94 legacy candidates, the full 731-record research ledger, the manifest, and every manifest-listed recipe.

Reference, form, and legacy searches used the same normalization described by the app’s IngredientSearch implementation: lowercase; NFKD decomposition; fold œ, æ, ß, and ampersand; remove combining marks; turn other punctuation into spaces; and collapse whitespace. I checked exact normalized names and aliases, full-phrase matching, and substring fallback for English and fr-CA spellings, spelling variants, scientific names, and source-qualified French candidates. Recipe scanning parsed every ingredients[] row and searched its string fields, then scanned the remaining recipe strings to distinguish ingredient lines from titles, instructions, descriptions, notes, source links, and group labels.

The search covered the 17 scoped common-name families and candidate spelling variants, including champignon de Paris/de couche/café, crimini, lentin du chêne, pleurote en huître/royal, enokitake, bunashimeji, bolet/cèpe, girolle, oreille-de-Judas, champignon noir, champignon des neiges, volvaire cultivé, hydne hérisson, truffe, and the relevant binomials. Generic mushroom plurals, candy cap, seaweeds/algae, and huitlacoche were used only as boundary controls.

## Current catalog, ledger, and lexical results

| Area | Current result | Scope consequence |
|---|---|---|
| Active fungus references | The fungus rows are ingredient-ref-mushroom (mushroom / champignons; English alias mushrooms) and ingredient-ref-ground-dried-candy-cap-mushrooms. Separate lexical oyster matches are ingredient-ref-dried-oyster (dried oyster / huître séchée; category PROTEIN), ingredient-ref-oyster-sauce, and ingredient-ref-vegan-oyster-sauce (both category SAUCE_AND_CONDIMENT). | Generic mushroom and candy cap already have owners. The candy-cap identity is excluded here; the oyster rows identify seafood/condiments, not mushrooms. |
| Named candidate references | None of the 17 candidate IDs or exact proposed display terms has an active owner. | All 17 are candidates only; none is an instruction to integrate or relink. |
| Forms | No named-fungus term or product-specific fungus form was found among the 33 rows. | Add no fresh, dried, powdered, canned, reconstituted, or soaking-liquid form from this identity pass. |
| Legacy | Relevant lexical rows are ingredient-ref-mushrooms, the duplicate generic plural identity, and ingredient-ref-oyster-sauce, a duplicate condiment candidate. | The active generic mushroom row already owns mushrooms; do not create or revive either legacy duplicate. |
| Ledger | Current record keys include the generic mushroom, its duplicate legacy plural, candy cap, dried oyster, oyster sauce, and vegan oyster sauce, but no identity record for any of the 17 candidates. | Dried oyster and the sauce rows have separate protein/condiment scopes. The generic row and candy cap are outside this proposal’s candidate evidence. The literal shiitake also occurs in a source note for the separate vegan-oyster-sauce identity; it is not a shiitake identity record. |
| Measures and substitutions | No fungus package yield or active global/contextual substitution rule exists. | The portion observations below stay proposal evidence only; no rule or conversion is active. |

The long coordinator packet’s generic mushroom recommendation is already reflected in the active plural alias. No new generic alias is proposed. A one-word query for oyster is a broad fallback to the active dried oyster, oyster sauce, and vegan oyster sauce rows; the legacy oyster-sauce candidate is also a duplicate boundary hit. A bare huître query can likewise reach seafood and sauce rows. Keep the full candidate phrase oyster mushroom / pleurote en huître and do not add bare oyster or huître aliases. At integration, verify those exact phrases in the picker.

The active-reference, form, legacy, and ledger checks were rerun against the snapshot above. None of the 17 candidate IDs exists in those stores, and none of the candidate phrases is an exact active display/alias or form label. The source-ID prefix selected for this packet, WP03-MUSHROOM-IDENTITIES-20261009-S, is absent from the current ledger and other catalog documents. Its 26 source IDs are unique within this proposal. The IDs remain proposal-local; none was inserted into the shared ledger.

## Bundled recipe demand

All 114 manifest-listed recipe files and all 1,123 ingredient rows were scanned. No ingredient line names any of the 17 fungi or a source-qualified French/botanical equivalent.

The nearest lines remain generic and do not establish a named identity:

| Recipe position | Existing text/link | Finding |
|---|---|---|
| 037#7 | 1 lb white mushrooms, sliced → ingredient-ref-mushroom | The line is generic white mushrooms. It does not say button, champignon de Paris, species, or cultivar. Preserve the current generic link; do not use this line to justify a button alias or a white-button conversion. |
| 037#12 | extra sauteed mushrooms, to taste → ingredient-ref-mushroom | Generic optional garnish; no species, measured amount, or product form. |
| 089#3 | 1/2 box mushrooms → ingredient-ref-mushroom | Generic mushrooms with no package size, mass, or product state. No package yield is inferable. |
| 100#2 | ground dried candy cap mushrooms → ingredient-ref-ground-dried-candy-cap-mushrooms | Candy cap is explicitly excluded from this tranche. |

Other fungi-like words are not ingredient demand: recipe 021 describes meringue mushrooms as optional decorations and has six such group labels; recipes 057 and 112 refer to chocolate truffles/confections; recipes 085 and 097 only mention mushrooms as possible add-ins in notes. Mushroom soup/quiche titles and instructions accompany the generic lines above. No line was relinked or treated as a named-fungus request.

## Candidate identities and names

These are candidate identities, not active catalog records. If accepted, they may use the current mushroom internal category VEGETABLE_AND_AROMATIC; that category is a catalog taxonomy choice and does not classify fungi botanically. A dagger marks a descriptive or foreign-market French proposal that still needs independent Québec terminology review.

| Proposed ID | English display | fr-CA display candidate | Aliases to consider | Scope and boundary |
|---|---|---|---|---|
| ingredient-ref-button-mushroom | button mushroom | champignon de Paris blanc† | None beyond the display without review | White, young market product of Agaricus bisporus. OQLF’s champignon de Paris also covers coffee-coloured products, so do not alias the unqualified term or the recipe phrase white mushrooms to this narrower row. |
| ingredient-ref-cremini-mushroom | cremini mushroom | champignon café (cremini) | EN crimini; FR crimini | Brown, less mature Agaricus bisporus market product. Keep separate from white button and mature portobello; do not add baby bella without a source and Québec review. |
| ingredient-ref-portobello-mushroom | portobello mushroom | champignon portobello | portobella, portabella, portabello, with or without “mushroom”/“champignon” where the picker supports scoped terms | Larger, more mature Agaricus bisporus market product. These are spelling variants, not separate species or aliases for the other market stages. |
| ingredient-ref-shiitake-mushroom | shiitake mushroom | lentin du chêne (shiitaké) | EN shiitake, shitake; FR shitaké, shiitaké, shiitake, shitake, lentin comestible | Lentinula edodes. OQLF says the accented French forms are used in Québec food terminology. Do not adopt black forest/Chinese mushroom aliases from the OQLF note without a separate product review. |
| ingredient-ref-oyster-mushroom | oyster mushroom | pleurote en huître | EN oyster fungus (source-listed) | Pleurotus ostreatus. Keep the full phrase; exclude bare oyster/huître because those searches also match seafood and sauces. |
| ingredient-ref-king-oyster-mushroom | king oyster mushroom | pleurote royal† | EN king oyster | Separate market product from oyster mushroom. A Québec product page calls its item Pleurote Royal and “King Oyster”; a peer-reviewed study pairs king oyster with Pleurotus eryngii. The Québec listing does not state a species, so attach that binomial only to a product whose source identifies it. Do not add king trumpet from this evidence. |
| ingredient-ref-enoki-mushroom | enoki mushroom | enoki† (borrowed market label) | No broader French alias approved | Market label for cultivated enoki, with taxon unset until the product source identifies it. Older CFIA/EU sources use F. velutipes; a 2018 phylogenetic study distinguishes cultivated East Asian enokitake as F. filiformis from European F. velutipes. Do not globally equate the partner-authored OQLF term collybie à pied velouté with every cultivated enoki product. |
| ingredient-ref-shimeji-mushroom | shimeji mushroom | shimeji† (borrowed market label) | None | Broad market name. Species Fungorum currently lists both Hypsizygus marmoreus and H. tessellatus as accepted; older official lists treat these names as synonyms. Do not alias bunashimeji or fix a binomial for all shimeji without package-specific evidence. |
| ingredient-ref-maitake-mushroom | maitake mushroom | maitake† | No Québec alias approved; polypore en touffes / poule de bois are France-source terms only | Grifola frondosa is the food species named by the French edible-mushroom list. Its listed French vernaculars do not establish Québec display or synonym policy. Do not add hen-of-the-woods without a scoped source review. |
| ingredient-ref-porcini-mushroom | porcini mushroom | cèpe de Bordeaux† only if the product is source-identified as Boletus edulis | No broad bolet/cèpe alias | The OQLF bolet entry lists porcini mushroom among English terms and Boletus edulis, while bolet/cèpe also name a broader commercial/morphological group. Do not map every bolete or cèpe to porcini. |
| ingredient-ref-chanterelle-mushroom | chanterelle mushroom | chanterelle | FR girolle (OQLF-listed) | Use a bounded Cantharellus culinary group. Do not include false girolle (Hygrophoropsis) or craterelles (Craterellus) by shared market wording. OQLF’s 1991 taxonomic list is old; retain genus-level scope rather than relying on its historic synonym list. |
| ingredient-ref-morel-mushroom | morel mushroom | morille | None proposed | Morchella spp. Keep fresh/dried state and species-specific product separate. Do not alias false morel, which can mean Gyromitra and is not Morchella. |
| ingredient-ref-wood-ear-mushroom | wood ear mushroom | no fr-CA display approved yet | None | Broad market/product label may cover multiple Auricularia species. ANSES lists oreille-de-Judas for A. auricula-judae and champignon noir for A. polytricha; modern phylogenetic work distinguishes cultivated A. heimuer from A. auricula-judae. Do not make oreille-de-Judas or champignon noir a global alias. |
| ingredient-ref-snow-fungus | snow fungus | champignon des neiges† | None | Tremella fuciformis. The EU residue-commodity table supplies French names including champignons de neige, trémelles en fuseau, and gelée d’arbre blanche. This is France/EU terminology, not a Québec ruling. Keep separate from Auricularia wood ears; do not add white fungus without a Québec/product source. |
| ingredient-ref-straw-mushroom | straw mushroom | volvaire cultivé / champignon de la paille de riz† | None | Volvariella volvacea. France/EU sources list both French product names. This means the species/product, not any mushroom cultivated on straw. |
| ingredient-ref-lions-mane-mushroom | lion’s mane mushroom | hydne hérisson† (singular proposed from the France/EU plural) | None | Hericium erinaceus fruiting body. The official French commodity table supplies hydnes hérissons; Québec usage needs review. Keep culinary fruiting body separate from mycelium, extracts, supplements, and other Hericium species. |
| ingredient-ref-culinary-truffle | truffle | truffe | None beyond the bilingual display | Culinary edible Tuber product, with species retained when the package identifies it. OQLF warns that not every fungus called a truffle is edible. Exclude truffle oil/paste/salt and chocolate confections. |

The OQLF entry for champignon de Paris identifies Agaricus bisporus as white or coffee-coloured and lists champignon de couche, cremini/champignon café, and portobello usage. CFIA groups common cultivated mushroom, cremini, and portabella under A. bisporus. Those sources support the shared species and distinct market labels, not interchangeable aliases. Keep recipe 037#7 generic.

## Source-qualified measurements

A separate measurement search checked the USDA National Nutrient Database Standard Reference Release 28 vegetables table by item name and NDB number, plus exact USDA FoodData Central queries for king oyster, shimeji, porcini, chanterelle, wood ear, and snow fungus. Accessed 2026-10-09. SR28 is a 2015 release. Its common-measure values below are portion observations for named food records, not ingredient densities.

| Candidate or boundary item | USDA SR28 food record and measures | Disposition |
|---|---|---|
| Cremini | NDB 11266, brown/Italian/crimini, raw: 87 g per cup whole; 72 g per cup sliced; 20 g per whole piece. | Source-qualified raw portions only. Do not merge the whole and sliced cups or treat them as density. |
| Portobello | NDB 11265, portabella, raw: 86 g per cup diced; 84 g per whole piece. | Source-qualified raw portions only; the source does not support a generic portobello cup value. |
| Shiitake, raw | NDB 11238: 89 g per cup whole; 97 g per cup sliced; 19 g per whole piece. | Preserve exact cut state and record wording. |
| Shiitake, dried | NDB 11268: 3.6 g per mushroom; 15.0 g per four mushrooms. | Dried-only count observations; do not infer fresh-to-dried yield. |
| Oyster mushroom, raw | NDB 11987: 148 g per large mushroom; 15.0 g per small mushroom; 86 g per cup sliced. | Source-qualified raw portions only; large/small count units are not a uniform size grade. |
| Enoki, raw | NDB 11950: 5.0 g per large; 3.0 g per medium; 64 g per cup whole. | Raw source portions only; the record’s taxonomy uses older commodity naming, so do not use it to resolve the enoki species question. |
| Maitake, raw | NDB 11993: 70 g per cup diced; also lists 1.1 g per whole piece. | The cup observation is source-specific. Treat the 1.1 g whole-piece figure as anomalous and do not carry it without checking the original food record. |
| Morel, raw | NDB 11240: 66 g per cup; 12.9 g per piece. | Source-qualified raw portion observations only; no dry-morel conversion. |
| White mushroom, raw — boundary control | NDB 11260: 70 g per cup pieces or slices; 96 g per cup whole; 23 g per large mushroom. | The food record says white mushroom, not button mushroom/A. bisporus. Do not attach these values to the button candidate or recipe 037#7 without a product source. |

No comparable SR28 common-measure record was located in this pass for button as a named grade, king oyster, shimeji, porcini, chanterelle, wood ear, snow fungus, straw mushroom, lion’s mane, or truffle. The exact FDC search pass also returned no indexed results for king oyster, shimeji, porcini, chanterelle, wood ear, and snow fungus. This is a scoped negative search, not proof that no other source exists.

If these findings are later entered in the ledger, recommend measurementState researched_supported only for the exact SR28 item/form/portion observations above, and researched_no_supported_value for the candidates without a supported portion in this search. Do not create defaultDensity, unitMappings, forms, or package-yield records from these observations. A cup value depends on the exact product and cut/fill state; the package currently has no named-fungus form rows or recipe lines to bind those measures to.

## Separate culinary-substitution search

Substitutions were searched independently from measurement evidence on 2026-10-09. Query families targeted each candidate’s “substitute for [name] in cooking/recipe” wording, with focused searches for cremini versus white/portobello, enoki replacement, morel alternatives, and mushroom-to-mushroom alternatives in recipe contexts. The reviewed sources were The Kitchn’s ingredient guide and named recipes, Bon Appétit’s named recipes, and Just One Cookbook’s enoki guidance. Generic SEO/listicle substitution pages were not treated as supported evidence.

| Candidate group | Source-qualified finding | Disposition |
|---|---|---|
| Button, cremini, portobello | The Kitchn says these Agaricus bisporus market products can sometimes substitute for one another, depending on the recipe. It gives no amount or cooking adjustment and does not define the recipes covered. | Record only as a source-specific qualitative claim if desired. It does not justify a global or contextual runtime rule. |
| Cremini, shiitake, oyster, king oyster, maitake | The Kitchn crostini recipe asks for 1 lb of bite-sized mushrooms “such as” cremini, shiitake, beech, King Oyster, or Hen of the Woods. The stuffing and egg-bake recipes also use mixed mushroom sets. These are allowed ingredient selections/mixes in those dishes, not one-to-one alternatives for a named mushroom. | Do not transform a shared recipe mixture into pairwise substitutions or a ratio. No active rule. |
| Enoki | Just One Cookbook says enoki can be replaced by any mushroom, naming king oyster, shiitake, cremini, and maitake. It gives no dish, amount, or preparation adjustment. | Too broad for the app’s directional, context-bound rule model. No active rule and do not reverse the stated direction for maitake. |
| Morel and shiitake | Bon Appétit’s asparagus/leek lasagna lists 4 oz fresh morels or 5 oz fresh shiitake as alternatives in that recipe. Its salmon-with-peas recipe also lists fresh morels, sliced/stemmed shiitake, or other mushrooms; the amount language for alternatives is not fully explicit. | Keep the lasagna’s 4-to-5 oz alternative as one recipe-specific research finding only. It does not justify a general morel-to-shiitake ratio or a rule for other dishes. |
| Oyster or lion’s mane used in place of meat/seafood | Culinary articles describe meat/seafood-like uses for king oyster or lion’s mane, but these do not specify an exact source ingredient plus replacement amount and cooking adjustment. | Not evidence for mushroom-to-mushroom substitution; no meat/seafood rule proposed. |
| Shimeji, porcini, chanterelle, wood ear, snow fungus, straw mushroom, truffle | No reviewed primary or recipe-specific source gave a bounded, actionable replacement for these exact products. Low-quality generalized substitution pages were rejected. | Recommend substitutionResearchState researched_no_supported_substitute for a general rule search. Retain no active global/contextual rule. Reopen only with source and recipe context naming product state, direction, role/method, and usable amount/adjustments. |

The morel/shiitake recipe option is useful as source-qualified evidence, but the bundle contains no morel or shiitake recipe line and the recipe’s alternative is not a validated cross-recipe ratio. Therefore the coordinator should not create an active substitution row from this packet. No substitution evidence transfers between oyster and king oyster, between snow fungus and wood ear, from enoki to every fungus, or from mushroom to confection/flavour products.

## Source register

All web sources below were accessed on 2026-10-09. Source IDs are proposal-local references; they have not been added to the research ledger. OQLF entries are Québec terminology evidence; French ANSES/EUR-Lex names are explicitly France/EU evidence and are not treated as Québec approval.

| Source ID | Source | Exact use and limitation |
|---|---|---|
| WP03-MUSHROOM-IDENTITIES-20261009-S01 | OQLF, [champignon de Paris](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869343/champignon-de-paris), updated 2006. | A. bisporus; says white or coffee colour; terms button mushroom, cremini/crimini, champignon café, and portobello; describes portobello as more mature and larger. Does not make white mushrooms an exact cultivar label. |
| WP03-MUSHROOM-IDENTITIES-20261009-S02 | CFIA, [D-94-26 import list for mushrooms and vegetables](https://inspection.canada.ca/fr/protection-vegetaux/phytoravageurs-plantes-envahissantes/directives/horticulture/94-26). | Lists champignon de couche, cremini, and portabella as A. bisporus; enoki as F. velutipes; oyster as P. ostreatus; shiitake as L. edodes; truffle as Tuber spp. Phytosanitary table, not current consumer taxonomy or common-measure evidence. |
| WP03-MUSHROOM-IDENTITIES-20261009-S03 | OQLF, [lentin du chêne](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8393503/lentin-du-chene), updated 2016. | Québec preferred French terms lentin du chêne, shitaké, and shiitaké; English shiitake/shitake; Lentinula edodes. Notes the accented forms’ Québec usage. |
| WP03-MUSHROOM-IDENTITIES-20261009-S04 | OQLF, [pleurote en huître](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8412484/pleurote-en-huitre), updated 1987. | French/English oyster mushroom and P. ostreatus. Does not establish king oyster as a synonym. |
| WP03-MUSHROOM-IDENTITIES-20261009-S05 | OQLF, [chanterelle](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082989/chanterelle), updated 1991. | French chanterelle and girolle usage with an older taxonomic list. Use it for French vocabulary, not the modern market species boundary. |
| WP03-MUSHROOM-IDENTITIES-20261009-S06 | OQLF, [morille](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296903/morille), updated 1991. | French morille / English morel / Morchella spp. Its English note also lists sponge mushroom; that broader term is not proposed because it can be ambiguous. |
| WP03-MUSHROOM-IDENTITIES-20261009-S07 | OQLF, [bolet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296987/bolet), updated 1990. | Lists English porcini mushroom and Boletus edulis while French bolet/cèpe names a broader bolete group. Do not make bare bolet or cèpe a global porcini alias. |
| WP03-MUSHROOM-IDENTITIES-20261009-S08 | OQLF GDT, [collybie à pied velouté](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10423453/collybie-a-pied-veloute), authored by Les Éditions Québec Amérique inc., 2003. | Partner-authored entry pairs enoki mushroom with collybie à pied velouté, but supplies no current cultivated-product taxonomy. |
| WP03-MUSHROOM-IDENTITIES-20261009-S09 | OQLF GDT, [oreille-de-Judas](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10423451/oreille-de-judas), authored by Les Éditions Québec Amérique inc., 2003. | Partner-authored English/French term pair wood ear / oreille-de-Judas; no species scope. |
| WP03-MUSHROOM-IDENTITIES-20261009-S10 | OQLF, [truffe](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082620/truffe), updated 1991. | French truffe / English truffle / Tuber spp.; notes some fungi called truffles are not edible. |
| WP03-MUSHROOM-IDENTITIES-20261009-S11 | CFIA, [fresh whole mushroom surveillance report](https://inspection.canada.ca/fr/salubrite-alimentaire-lindustrie/chimie-microbiologie-alimentaires/rapports-danalyse-articles-revues/microbiologie-aliments), data 2018–2023. | French category wording includes fresh whole enoki, shimeji, pleurote, and pleurote royal. Surveillance category terms, not taxonomy or culinary performance. |
| WP03-MUSHROOM-IDENTITIES-20261009-S12 | Aliments du Québec, [Pleurote Royal](https://alimentsduquebec.com/aliments-dici/fruits-et-legumes/pleurote-royal). | Québec product listing calls its product Pleurote Royal and King Oyster. Exact local product-language evidence; no scientific name stated. |
| WP03-MUSHROOM-IDENTITIES-20261009-S13 | Ogawa et al., [Compression properties of the fruit body of king oyster mushroom Pleurotus eryngii](https://doi.org/10.1111/j.1365-2621.2012.3126.x), 2012. | Scholarly food-texture paper explicitly pairs king oyster mushroom and P. eryngii. Its mechanical measurements are not recipe conversions or substitutions. |
| WP03-MUSHROOM-IDENTITIES-20261009-S14 | Wang et al., [Phylogeny and species delimitation of Flammulina](https://doi.org/10.1007/s11557-018-1409-2), 2018. | Phylogenetic study distinguishes cultivated East Asian enokitake, treated as F. filiformis, from European F. velutipes. Does not identify every retail package. |
| WP03-MUSHROOM-IDENTITIES-20261009-S15 | Species Fungorum, [Flammulina species listing](https://www.speciesfungorum.org/Names/Names.asp?strGenus=Flammulina). | Current taxonomic reference consulted for F. filiformis. Taxonomy, not a Québec food-name source. |
| WP03-MUSHROOM-IDENTITIES-20261009-S16 | Species Fungorum, [Hypsizygus species tree](https://www.speciesfungorum.org/names/TreeOfLife.asp?GenusRecordID=17844). | Lists H. marmoreus and H. tessellatus as accepted species; contradicts older regulatory lists that reduce them to synonyms. |
| WP03-MUSHROOM-IDENTITIES-20261009-S17 | France DGCCRF/ANSES, [Liste de champignons de culture et sauvages comestibles](https://www.economie.gouv.fr/files/files/directions_services/dgccrf/securite/produits_alimentaires/Liste-champignons-comestibles-ANSES.pdf), based on ANSES advice dated 2017-04-04. | Lists French vernaculars for Grifola frondosa, Auricularia products, Lentinula edodes, Hypsizygus tessulatus, Volvariella volvacea, and Flammulina velutipes. France reference list, with older taxonomy in places; not Québec naming or species-equivalence authority. |
| WP03-MUSHROOM-IDENTITIES-20261009-S18 | European Commission, [Regulation (EU) 2018/62](https://eur-lex.europa.eu/legal-content/FR/TXT/?uri=CELEX%3A32018R0062), Annex I commodity table. | French residue-commodity names include shimeji/bunashimeji, champignons de la paille de riz/volvaires cultivées, hydnes hérissons, snow-fungus names, and older enoki/wood-ear names. The table is a regulatory residue classification, not a Québec common-name or synonym ruling. |
| WP03-MUSHROOM-IDENTITIES-20261009-S19 | Wu et al., [Species clarification of cultivated Auricularia “Heimuer”](https://doi.org/10.11646/phytotaxa.186.5.1), 2014. | Morphological and molecular study separates Chinese cultivated A. heimuer from European A. auricula-judae. Supports caution on the broad market phrase wood ear; it does not name all retail products. |
| WP03-MUSHROOM-IDENTITIES-20261009-S20 | USDA Agricultural Research Service, [National Nutrient Database SR28, Food Group 11: Vegetables and Vegetable Products](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg11.pdf), Release 28 (2015). | Source for NDB records and common-measure portions listed above. Preserve exact item name, raw/dried state, portion wording, and release. Portion observations do not define density or cross-species conversion. |
| WP03-MUSHROOM-IDENTITIES-20261009-S21 | The Kitchn, [What Are Cremini Mushrooms?](https://www.thekitchn.com/what-are-cremini-mushrooms-a-f-73949), updated 2023-10-04. | Says button, cremini, and portobello can sometimes substitute depending on recipe. Secondary culinary guidance without a defined recipe, ratio, or adjustments. |
| WP03-MUSHROOM-IDENTITIES-20261009-S22 | The Kitchn, [Miso-Roasted Wild Mushroom Crostini](https://www.thekitchn.com/recipe-miso-roasted-wild-mushroom-crostini-251503), published 2017-12-07. | One 1 lb mushroom ingredient allows an illustrative set of mushrooms. It is a mixed/choice ingredient in one dish, not a one-to-one rule. |
| WP03-MUSHROOM-IDENTITIES-20261009-S23 | The Kitchn, [Mushroom Stuffing](https://www.thekitchn.com/mushroom-stuffing-recipe-261115) and [Mixed Mushroom Egg Bakes](https://www.thekitchn.com/recipe-mixed-mushroom-egg-bakes-recipes-from-the-kitchn-219483). | Named recipes use mixed cremini/shiitake/oyster choices in stuffing or egg bakes. Recipe-specific selection, not measured species substitutions. |
| WP03-MUSHROOM-IDENTITIES-20261009-S24 | Bon Appétit, [Lasagna with Asparagus, Leeks, and Morels](https://www.bonappetit.com/recipe/lasagna-with-asparagus-leeks-and-morels), published 2010-02-21. | Explicit recipe alternative: 4 oz fresh morels or 5 oz fresh shiitake, for this lasagna only. Not a general ratio. |
| WP03-MUSHROOM-IDENTITIES-20261009-S25 | Bon Appétit, [Poached Wild Salmon with Peas and Morels](https://www.bonappetit.com/recipe/poached-wild-salmon-with-peas-and-morels), published 2012-04-16. | Lists morels, sliced/stemmed shiitake, or other mushrooms in one sauce; wording does not give a clear amount for each alternative. |
| WP03-MUSHROOM-IDENTITIES-20261009-S26 | Just One Cookbook, [Enoki Mushroom](https://www.justonecookbook.com/enoki-mushrooms/). | Author suggests king oyster, shiitake, cremini, or maitake for enoki but gives no recipe context, amount, or adjustment. Qualitative culinary advice, not an actionable substitution rule. |

## Source-ID and candidate-ID preflight

The 17 proposed ingredient-reference IDs above were absent from active references, forms, legacy candidates, and ledger record IDs in the refreshed snapshot. The source-ID prefix WP03-MUSHROOM-IDENTITIES-20261009-S is absent from the shared ledger and other proposal/batch files. The source register contains 26 distinct IDs, S01–S26, with no duplicate suffix. These checks must be repeated if the package changes before integration. No source ID, candidate, or decision was added to the live ledger in this task.

## Open issues

1. Independent Québec French terminology review is needed for button, king oyster, enoki, shimeji, maitake, porcini, wood ear, snow fungus, straw mushroom, and lion’s mane labels marked provisional or unresolved.
2. Keep king oyster’s Québec product wording but require a product source before storing P. eryngii as its canonical taxon.
3. Resolve cultivated enoki product taxonomy from package/source evidence; do not perpetuate older F. velutipes commodity naming as a universal retail identification.
4. Keep shimeji as a market name until a source identifies a species/product; current taxonomy recognizes H. marmoreus and H. tessellatus separately.
5. Do not globally equate wood ear, oreille-de-Judas, champignon noir, and cultivated Heimuer; the names have different or unresolved species scopes.
6. Keep the truffle candidate scoped to edible culinary Tuber products, retaining a named species where a package identifies it. Decide whether other edible fungi sold as truffles belong in a separate identity; neither the name nor a chocolate confection should expand this candidate implicitly.
7. Decide whether Section N needs all 17 picker identities despite zero bundled recipe demand. Any accepted identity should remain separate from product forms and from unsupported measures/substitutions.
8. Recheck candidate IDs, all spellings, forms, search fallback, ledger source IDs, and recipe rows at integration time. The current package may change before then.

Section N stays open. No tests were run or requested for this proposal-only task.
