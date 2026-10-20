# WP03 Section M follow-up: remaining fruit identities

- **Reviewed:** 2026-10-09
- **Status:** proposal only; no shared catalog, recipe, ledger, checklist, plan, roadmap, code, test, or other proposal was changed.
- **Scope:** the remaining named Section M fruit identities, excluding work already covered by citrus, small-fruit, tomato/cucurbit, and jackfruit packets. This packet recommends identities only.
- **Sources accessed:** 2026-10-09. OQLF Grand dictionnaire terminologique pages provide Québec French names and, where stated, English terms and identity boundaries.

## Recommendation

Accept 33 identity-only candidates below for a later coordinator decision. Reuse the existing legacy IDs for apple, pear, and peach if those rows are promoted. Give every new identity a stable ASCII ID, a FR-CA and English display name, and only the source-attested aliases listed here after normalized collision review. Use FRUIT for the fruit identities and VEGETABLE_AND_AROMATIC for rhubarb, whose OQLF entry classifies it as a vegetable even though it is eaten as fruit.

Retain the live banana, cherry, mango, and pineapple identities; do not make duplicates. Keep cherry subtype splits, apple/pear/peach cooking classes, generic melon naming, plantain ripeness, dried-fruit products, and generic processed-fruit families for separate boundary decisions. Defer baobab fruit, unqualified sapote, barberry as a food product, and unqualified goji aliases where the current sources do not settle a safe product identity.

The 114-recipe ingredient scan found nine lines relevant to this follow-up across eight recipes. Eight already point to represented identities. The one unlinked line says only dates and is an explicit candidate for a future generic-date link, once the broad aliases on the Medjool identity are resolved. No other open identity has a bundled recipe line in this corpus.

No forms, measurements, conversions, package or cooking yields, substitutions, or recipe links are added by this proposal. The recipe line above is only a source-text-based link candidate for a later integration decision; this proposal does not change it.

## Refreshed working-tree snapshot

Counts and file hashes were refreshed from the live worktree after the grapefruit, true pomelo, citron/cédrat, and Section J integrations. The recipe digest hashes each manifest-relative recipe path, a NUL byte, its exact file bytes, and a NUL byte, in manifest order.

| Artifact | Live count | SHA-256 |
|---|---:|---|
| ingredient-references.v1.json | 585 references | 665c70d107dab7be7c125b91f1555a265782098c23278e71d5d4ed01efb49bd9 |
| ingredient-forms.v1.json | 33 forms | 275f21eda9369a4c08a869aad3952ebbe2e9e64664ccf0b48af2bb7034928732 |
| manifest.v1.json | 114 recipe paths | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| research-ledger.v1.json | 760 records; 1,251 source entries; 1,060 distinct source IDs | 9a1b3f54b103d3949c5c488902b1d1b651aece7620ffff0a3bb898ce8ef72a1e |
| legacy-import-identities.v1.json | 91 candidates | a17f086ab34de2d4c760259ceaed9ad5ed5d4a54030cc6ba8821bb672616edc5 |
| Manifest-ordered recipe corpus | 114 recipes; 1,123 ingredient rows | 30e8640e29dfaf52843f22feb3fde376b0e5e618909163548c267d88bd6e41e6 |

There are 37 live references categorized FRUIT and no current ingredient form points to one of them. The active set already includes the earlier small-fruit additions, açaí, cupuaçu, jackfruit, and the refreshed citrus identities. Other Section M identities already represented include banana, cherries, mangoes, and pineapple. Maraschino cherries and maraschino cherry juice are distinct prepared products currently categorized FRUIT.

The live active catalog also has Medjool dates and raisins under NUT_SEED_AND_DRIED_FRUIT, date syrup under SUGAR_AND_SWEETENER, and pomegranate molasses under SAUCE_AND_CONDIMENT. The Medjool row currently has broad English dates and French dattes aliases. The active cherries row has fresh, frozen, and pitted wording among its aliases; those are states or preparation terms, not identity synonyms, and are not changed here.

Relevant legacy records are all inactive, unreviewed candidates. ingredient-ref-apple, ingredient-ref-pear, and ingredient-ref-peach can be reused for their matching fresh-fruit identities. ingredient-ref-prune is a dried-prune candidate, ingredient-ref-dried-apricot is a dried product, ingredient-ref-apricot-jam is a preserve, and ingredient-ref-pomegranate-seeds is a fruit part. Do not repurpose those as fresh plum, whole apricot, or whole pomegranate. Legacy cherry, mango, and raspberry overlap live identities and should not be promoted as duplicates.

The corresponding ledger identities for banana, cherries, Medjool dates, mangoes, pineapple, and raisins currently have no source entries. Several remain unreviewed, and Medjool dates and raisins have measurement evidence blocked pending evidence. This proposal’s OQLF source IDs are proposal-local; no evidence was entered in the shared ledger.

## Recipe audit

Every ingredient line in all 114 manifest-listed recipe files was scanned using originalText, ingredientName, and ingredientRefId. There are 1,123 ingredient rows. A broad fruit, berry, citrus, and fruit-product phrase scan surfaced 47 rows in 31 recipes. It includes citrus and small-fruit work already covered, existing fruit identities and prepared products, one lexical false positive (045#17, “Sugar pearls”), and one contextual example rather than a fruit ingredient (111#5, “fresh aromatics … citrus zest”).

The scoped set below contains nine rows in eight recipes:

| Recipe and line | Ingredient wording | Current reference | Audit result |
|---|---|---|---|
| 001#3 | over-ripe banana | ingredient-ref-banana | Existing identity; retain. |
| 001#11 | banana slices | ingredient-ref-banana | Existing identity; retain. |
| 024#1 | Medjool dates | ingredient-ref-medjool-dates | Explicit variety; retain. |
| 031#1 | Medjool dates | ingredient-ref-medjool-dates | Explicit variety; retain. |
| 052#1 | mangos | ingredient-ref-mangos | Existing identity; retain. |
| 053#14 | crushed pineapple | ingredient-ref-pineapple | Existing fruit identity; retain the recipe wording. This is not evidence for a form or conversion. |
| 058#2 | dates, pitted and chopped | none | Candidate link to a future generic dates/dattes identity; wording does not identify Medjool. |
| 073#10 | bananas, mashed | ingredient-ref-banana | Existing identity; retain. |
| 102#7 | raisins | ingredient-ref-raisins | Existing dried-grape identity; retain. |

Thus, eight of the nine scoped lines already have references, and one line has no reference. Only 058#2 directly names an unrepresented whole-fruit identity. No recipe row names the other proposed additions. The exact ingredient text was audited, but recipe quantities were not treated as measurements or evidence for conversion data.

## Accept: source-backed identity candidates

The candidate IDs below are suggestions for new identities except where an existing legacy ID is explicitly named. The display pair follows the OQLF vocabulary; the alias column lists only terms worth considering, not aliases already approved for activation.

| Candidate ID | English display | Québec French display | Alias candidates and boundary | Sources |
|---|---|---|---|---|
| ingredient-ref-apple (reuse legacy) | apple | pomme | No additional alias proposed. Keep table/cider varieties out of a generic alias. | S01 |
| ingredient-ref-pear (reuse legacy) | pear | poire | No additional alias proposed. Keep cooking-pear classes out of the generic row. | S02 |
| ingredient-ref-peach (reuse legacy) | peach | pêche | No variety alias proposed. Keep white/yellow flesh and clingstone distinctions out of the generic identity pending use evidence. | S03 |
| ingredient-ref-nectarine | nectarine | nectarine | Do not use brugnon as a full synonym: OQLF distinguishes it by an adhering stone. | S04 |
| ingredient-ref-plum | plum | prune | Do not add English prune or prunes as aliases; English prune can identify a fresh plum in trade but also dried prunes. Keep ingredient-ref-prune for the dried product only. | S05–S06 |
| ingredient-ref-apricot | apricot | abricot | Keep distinct from the legacy dried-apricot candidate and apricot jam. | S07 |
| ingredient-ref-grapes | grapes | raisin | French raisin is the source-named fresh grape identity. Do not add English raisin(s) to it; preserve dried raisins separately. | S09–S10 |
| ingredient-ref-fig | fig | figue | Keep the fresh identity separate from dried fig products. | S13–S14 |
| ingredient-ref-dates | dates | dattes | No broad alias on Medjool dates after this identity is accepted. Keep Medjool as the named variety. | S15–S16 |
| ingredient-ref-persimmon | persimmon | kaki | Plaquemine is an OQLF-listed French candidate; do not use fruit de Sharon as a generic alias because OQLF identifies it as a marketing name. | S17 |
| ingredient-ref-pomegranate | pomegranate | grenade | Do not alias pomegranate seeds or pomegranate molasses to whole fruit. Avoid the calque pomme grenade. | S18 |
| ingredient-ref-quince | quince | coing | No additional alias proposed. | S19 |
| ingredient-ref-medlar | medlar | nèfle | Do not use loquat or nèfle du Japon as aliases. OQLF documents those as a different fruit. | S20–S21 |
| ingredient-ref-rhubarb | rhubarb | rhubarbe | English pie plant is a source-backed alias candidate. Category: VEGETABLE_AND_AROMATIC. | S22 |
| ingredient-ref-watermelon | watermelon | melon d’eau | Pastèque is an OQLF-listed French alternative. Do not use bare melon; OQLF distinguishes watermelon from other melons. | S23, S26 |
| ingredient-ref-plantain | plantain banana | banane plantain | Identity only. Do not add a ripe/green form or treat the broad “cooking banana” class as a synonym. | S27 |
| ingredient-ref-papaya | papaya | papaye | Exclude pawpaw: OQLF says it can mean papaya or asimina. | S28 |
| ingredient-ref-guava | guava | goyave | No additional alias proposed. | S29 |
| ingredient-ref-passion-fruit | passion fruit | fruit de la passion | Keep the generic fruit name; do not add grenadille as a generic alias for a particular variety. | S30 |
| ingredient-ref-lychee | lychee | litchi | Letchi is an OQLF-listed French spelling candidate. Reject cerise de Chine, which OQLF discourages as misleading. | S31 |
| ingredient-ref-longan | longan | longane | Œil-de-dragon is a source-listed French alternative; review normalized search behavior before activation. Do not merge with lychee. | S32 |
| ingredient-ref-rambutan | rambutan | ramboutan | Keep litchi chevelu out of aliases to avoid returning it as a lychee synonym. | S33 |
| ingredient-ref-pitaya | dragon fruit | pitaya | Pitahaya is a source-backed spelling candidate. Confirm the catalog’s intended species/product breadth before enabling broader aliases. | S34 |
| ingredient-ref-kiwi | kiwifruit | kiwi | Do not add Chinese gooseberry; OQLF discourages it. | S35 |
| ingredient-ref-star-fruit | star fruit | carambole | Carambola is a source-backed English alias candidate; fruit étoile is an OQLF-listed French alternative. | S36 |
| ingredient-ref-tamarind | tamarind | tamarin | No additional alias proposed. | S37 |
| ingredient-ref-breadfruit | breadfruit | fruit à pain | Fruit de l’arbre à pain is an OQLF-listed French phrase. Keep separate from jackfruit; OQLF names Artocarpus altilis, while the integrated jackfruit row is a different food identity. | S38 |
| ingredient-ref-durian | durian | durion | Dourian is an OQLF-listed spelling candidate. | S39 |
| ingredient-ref-mangosteen | mangosteen | mangoustan | Do not use mangouste as an alias; keep the displayed name unambiguous. | S40 |
| ingredient-ref-soursop | soursop | corossol épineux | Corossol is an OQLF-listed French candidate. Avoid anone and sapadille because the same source also uses these for broader or potentially colliding terms. | S41 |
| ingredient-ref-cherimoya | cherimoya | chérimole | Keep distinct from soursop; OQLF identifies separate species and terms. | S42 |
| ingredient-ref-sapodilla | sapodilla | sapotille | Nèfle d’Amérique is an OQLF-listed French alternative. Reject sapote; OQLF says it names a different fruit. | S43 |
| ingredient-ref-acerola | acerola | cerise des Antilles | Do not alias to cherry/cerise. OQLF records uncertainty about the species behind the common name, so make no species claim. | S44 |

## Hold or defer

| Checklist item or term | Disposition | Reason and source-backed candidate |
|---|---|---|
| Apples, pears, peaches by cooking class or cultivar | Hold | OQLF documents table/cider apples, cooking pears, and white/yellow peach differences, but the bundled corpus has no ingredient lines requiring those splits. Keep the generic identities above and do not create cooking forms. Sources S01–S03. |
| Sweet/sour cherries and cherry forms | Retain active generic cherry; hold subtypes | ingredient-ref-cherries already exists and the legacy cherry candidate duplicates it. OQLF distinguishes cherry groups, but no recipe in this corpus requires separate sweet/sour identities. Existing fresh/frozen/pitted aliases describe states or preparation, not synonyms. Source S08. |
| Generic melon, melon brodé, and cantaloupe | Hold | Existing bitter melon and winter melon make a bare melon term unsuitable as a safe alias. OQLF differentiates Cucumis melo, melon brodé, cantaloup, and watermelon; North American use of “cantaloupe” crosses those names. Do not alias them together. Sources S23–S26. |
| Plantain maturity | Hold | Accept only the plantain banana identity above. The banana source distinguishes sweet bananas and cooking bananas, including plantain, but this review does not establish global ripeness boundaries or forms. Source S27. |
| Medlar and loquat naming | Hold extra alias; preserve separate candidates | Keep medlar/nèfle separate from loquat/nèfle du Japon. The latter is documented as a different species, but loquat is not an explicit named checklist item for this packet. Source S21. |
| Dried apricots | Defer product promotion | The existing legacy candidate ingredient-ref-dried-apricot is inactive and unreviewed. No separate authoritative bilingual product entry was verified for this proposal; retain it as unresolved rather than promote it or infer a form. |
| Dried figs | Defer product promotion | Candidate wording is dried fig / figue séchée, directly distinguished by OQLF from fig/figue. Review it in a product-identity packet rather than as a form here. Source S14. |
| Prunes/dried prunes | Defer product promotion; retain legacy ID only for this product | Candidate wording is dried prune / pruneau. OQLF distinguishes fresh plum/prune from dried pruneau and warns that English prune can name a fresh plum in fruit trade. Do not repurpose ingredient-ref-prune for fresh plum or activate bare prune as an alias. Sources S05–S06. |
| Sultanas | Defer product promotion | Candidate wording is Sultana raisins / raisins de Smyrne. OQLF identifies Smyrna raisins as a dried-grape variety, not a synonym for all fresh grapes. Decide separately whether it merits a product identity or alias on dried raisins. Source S12. |
| Dried currants | Hold as a distinct Vitis product candidate | Candidate wording is dried currants / raisins de Corinthe. OQLF defines English currants of the Vitis genus as dried grapes. Keep this separate from fresh black/red currants (Ribes) and do not place unqualified currant on either identity. Source S11. |
| Dried sour cherries, barberries, goji berries | Defer | No complete, collision-safe product identity pair is established here. OQLF’s barberry entry names the plant, not a food product; for goji it prefers wolfberry / baie du lyciet and marks goji/baie de goji as contextual trademark terms. Do not activate those marked terms as global aliases. Sources S45–S47. |
| Baobab fruit | Defer | OQLF names the tree baobab and describes its edible capsule as pain de singe, but does not settle whether the checklist item should represent whole fruit, pulp, powder, or another sold food. No product identity or alias is recommended yet. Source S45. |
| Sapote | Defer | OQLF explicitly distinguishes sapote from sapotille/sapodilla. The unqualified name does not select a single fruit identity. Source S43. |
| Pawpaw/asimina, prickly pear, and other regional fruits | Defer to a named regional-identity review | OQLF identifies asimina as a possible referent of English pawpaw and gives prickly pear / figue de Barbarie as a separate fruit. Neither term has a matching recipe line in this corpus, and the broader regional checklist requires its own bounded coverage pass. Do not add pawpaw as a papaya alias. Sources S28, S48. |
| Preserved and extracted products | Defer to product-specific review | Juice, zest, peel, pulp, concentrate, purée, canned fruit, jam, jelly, preserves, compote, fruit butter, candied fruit, and dried citrus peel are not universal synonyms or fruit forms. Keep existing product references distinct and review only named products with matching product evidence. Citrus-product questions remain with the citrus packet. |

## Conflicts and unresolved integration points

- The active Medjool row has broad dates/dattes aliases, while recipe 058#2 uses generic dates and carries no reference. If the generic dates identity is accepted, the source wording supports a future link from 058#2 to that identity and removal of those broad aliases from Medjool. Recipes 024#1 and 031#1 explicitly name Medjool and remain linked to the variety. No recipe data is changed here.
- Fresh grape is raisin in Québec French; dried grapes are raisins secs. The active English raisins row is a dried product, so review normalized search collisions before exposing the new French raisin term. Do not add English raisins to fresh grapes or bare currant to dried currants.
- Fresh plum is prune in French, while dried prune is pruneau. The inactive ingredient-ref-prune candidate uses English prune and French pruneau, so it must remain a dried-product candidate.
- Whole pomegranate must remain separate from pomegranate seeds and pomegranate molasses.
- OQLF identifies European medlar and Japanese medlar/loquat separately. Likewise, breadfruit is not jackfruit; sapodilla is not sapote; cherimoya is not soursop; and lychee is not “Chinese cherry.”
- Bare melon has a family-level scope. Watermelon/melon d’eau is source-distinguished from melon and cantaloupe. Do not place bare melon, cantaloupe, or melon brodé on one another as aliases.
- OQLF gives some old or regionally variable alternatives. The candidate displays above use its FR-CA terms but still need normalized search collision review and independent Québec terminology review before activation.
- Dried, canned, pitted, sliced, ripe, green, frozen, chopped, juiced, and puréed wording remains product or state evidence, not grounds for a universal alias, form, conversion, or substitution.

## Source register

Each source ID below is local to this proposal and unique against the current shared ledger. All listed pages were accessed 2026-10-09. OQLF pages support the bilingual terms or identity boundary stated; their descriptive text is not measurement, yield, or substitution evidence.

| ID | Québec source and supported scope |
|---|---|
| S01 | OQLF, [pomme](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297106/pomme) — apple/pomme; table and cider apples. |
| S02 | OQLF, [poire](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297123/poire) — pear/poire; includes cooking-pear classes. |
| S03 | OQLF, [pêche](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2068558/peche) — peach/pêche. |
| S04 | OQLF, [nectarine](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083906/nectarine) — nectarine; distinguishes brugnon by stone adherence. |
| S05 | OQLF, [prune](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297125/prune) — fresh plum/prune. |
| S06 | OQLF, [pruneau](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084075/pruneau) — dried prune/pruneau; notes English prune can also mean fresh plum in trade. |
| S07 | OQLF, [abricot](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084063/abricot) — apricot/abricot. |
| S08 | OQLF, [cerise](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358152/cerise) — cherry/cerise and sweet/sour distinctions. |
| S09 | OQLF, [raisin](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296927/raisin) — grape/raisin; distinguishes table, wine, and dried-grape kinds. |
| S10 | OQLF, [raisin sec](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084076/raisin-sec) — dried raisin/raisin sec; includes variety-level notes. |
| S11 | OQLF, [raisin de Corinthe](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298833/raisin-de-corinthe) — dried currant/raisin de Corinthe; English currant in this entry is a dried Vitis product. |
| S12 | OQLF, [raisin de Smyrne](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297130/raisin-de-smyrne) — Sultana raisin/raisin de Smyrne. |
| S13 | OQLF, [figue](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297116/figue) — fig/figue; distinguishes fresh and dried figs. |
| S14 | OQLF, [figue séchée](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10431080/figue-sechee) — dried fig/figue séchée. |
| S15 | OQLF, [datte](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084074/datte) — date/datte. |
| S16 | OQLF, [datte variété Medjool](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18060891/datte-variete-medjool) — Medjool date as a variety. |
| S17 | OQLF, [kaki](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083959/kaki) — persimmon/kaki and source-listed French alternatives. |
| S18 | OQLF, [grenade](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082987/grenade) — pomegranate/grenade; discourages the calque pomme grenade. |
| S19 | OQLF, [coing](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082836/coing) — quince/coing. |
| S20 | OQLF, [nèfle](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8410193/nefle) — medlar/nèfle. |
| S21 | OQLF, [nèfle du Japon](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083899/nefle-du-japon) — Japanese medlar/loquat, distinct from medlar/nèfle. |
| S22 | OQLF, [rhubarbe](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358205/rhubarbe) — rhubarb/rhubarbe; classified in food terminology as a vegetable. |
| S23 | OQLF, [melon](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084072/melon) — melon and its broad Cucumis melo scope. |
| S24 | OQLF, [melon brodé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8352909/melon-brode) — netted melon/melon brodé and North American cantaloupe naming conflict. |
| S25 | OQLF, [cantaloup](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8352910/cantaloup) — cantaloupe/cantaloup and distinction from melon brodé. |
| S26 | OQLF, [melon d’eau](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297115/melon-deau) — watermelon/melon d’eau; also lists pastèque. |
| S27 | OQLF, [banane](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297102/banane) — banana/banane and cooking bananas including plantain. |
| S28 | OQLF, [papaye](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082835/papaye) — papaya/papaye; warns pawpaw may also mean asimina. |
| S29 | OQLF, [goyave](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296918/goyave) — guava/goyave. |
| S30 | OQLF, [fruit de la passion](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296509/fruit-de-la-passion) — passion fruit/fruit de la passion as a generic covering varieties. |
| S31 | OQLF, [litchi](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084064/litchi) — lychee/litchi; letchi variant and discourages cerise de Chine. |
| S32 | OQLF, [longane](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084065/longane) — longan/longane and œil-de-dragon. |
| S33 | OQLF, [ramboutan](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084077/ramboutan) — rambutan/ramboutan; lists litchi chevelu as a French term. |
| S34 | OQLF, [pitaya](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26504954/pitaya) — pitaya and English dragon-fruit terms; names a source-specific species. |
| S35 | OQLF, [kiwi](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357795/kiwi) — kiwi/kiwifruit; discourages groseille de Chine. |
| S36 | OQLF, [carambole](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082818/carambole) — carambola/star fruit/carambole and fruit étoile. |
| S37 | OQLF, [tamarin](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296920/tamarin) — tamarind/tamarin. |
| S38 | OQLF, [fruit de l’arbre à pain](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297101/fruit-de-larbre-a-pain) — breadfruit/fruit à pain; names Artocarpus altilis. |
| S39 | OQLF, [durion](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296981/durion) — durian/durion and French spelling alternative dourian. |
| S40 | OQLF, [mangoustan](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083905/mangoustan) — mangosteen/mangoustan and its listed alternate term. |
| S41 | OQLF, [corossol épineux](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082988/corossol-epineux) — soursop/corossol épineux; multiple overlapping French terms need alias restraint. |
| S42 | OQLF, [chérimole](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296933/cherimole) — cherimoya/chérimole. |
| S43 | OQLF, [sapotille](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296930/sapotille) — sapodilla/sapotille; explicitly distinguishes sapote. |
| S44 | OQLF, [cerise des Antilles](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17488862/cerise-des-antilles) — acerola/cerise des Antilles and uncertainty between two species. |
| S45 | OQLF, [baobab](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17487017/baobab) — baobab tree and edible capsule called pain de singe; does not define a sold fruit product. |
| S46 | OQLF, [baie du lyciet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502910/baie-du-lyciet) — wolfberry/baie du lyciet; marks goji terms as contextual trademarks. |
| S47 | OQLF, [épine-vinette](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19002216/epine-vinette) — barberry/épine-vinette plant terminology only. |
| S48 | OQLF, [figue de Barbarie](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297016/figue-de-barbarie) — prickly pear/figue de Barbarie; discourages the French calque poire cactus. |
