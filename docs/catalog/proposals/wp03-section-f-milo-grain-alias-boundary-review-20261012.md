# WP03 Section F: Milo / grain-sorghum alias boundary review

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Accepted hold integrated on 2026-10-12. The existing grain-sorghum reference and its empty aliases remain unchanged; an accepted boundary decision and source evidence were added to its ledger record.
- **Scope:** One English alias candidate for the existing grain identity: whether bare *milo* or *sorghum milo grain* should resolve to `grain sorghum / sorgho à graine`.
- **Recommendation:** **Hold the aliases.** Keep the existing reference and its empty alias arrays unchanged. Current Canadian sources use *milo* both as a name for *Sorghum bicolor* and for a narrower milo-variety grain class; the latter is defined in an animal-feed table. The current Canadian food-market wording is product metadata, not a reliable general food synonym. No Québec human-food source uses *milo* for this grain.

## Current catalog and corpus audit

This is the proposal-time snapshot, read before the later pea-starch terminology and Atlantic-tomcod integrations on 2026-10-12. It contained 1,252 active references (116 `GRAIN_AND_CEREAL`), 94 forms, 66 legacy candidates, 1,560 ledger records, and 114 manifest-listed recipes with 1,123 ingredient rows. The hashes below describe that historical review baseline, not the final integrated worktree.

Audit snapshot SHA-256: references `a67716b92d4129d7ecbd7109e5481787f12b3a479fb6f09769e5cd00e6a3ecf8`; forms `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b`; legacy identities `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f`; ledger `2e667165a27c6fca16738e7f724b6a2495a8ef12dbc4c4e58528ec7b50764eba`; manifest `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.

| Candidate phrase | Exact normalized active/form/legacy owner | Ledger owner or state | Recipe phrase hits |
| --- | --- | --- | ---: |
| `grain sorghum` | Active display: `ingredient-ref-grain-sorghum` | Verified reference record | 0 |
| `sorgho à graine` | Active French display: `ingredient-ref-grain-sorghum` | Same verified record; current recorded OQLF source `WP03-S22` | 0 |
| `milo`, `milo grain`, `sorghum milo grain`, `sorghum grain`, `grain de sorgho milo`, `grain de sorgho`, `sorghum` | None among active display names/aliases, forms, or the 66 legacy identities | No `milo` candidate, source, or decision. The separate `candidate-sorghum-flakes` record concerns flakes; it is not a grain-sorghum alias candidate. | 0 for each phrase |

The audit used the repository's `normalize_search_key` from `tools/seed_package/bundled_seed_package.py` for exact-key matching. The recipe scan checked all 114 manifest-listed recipe files, their full serialized text, and each ingredient row; the listed variants produced no hits. This is a text and exact-key audit, not a runtime picker test.

At the proposal-time snapshot, `ingredient-ref-grain-sorghum` had EN `grain sorghum`, FR `sorgho à graine`, category `GRAIN_AND_CEREAL`, and no aliases, forms, density, or unit mappings. Nearby references remain separate: `ingredient-ref-sorghum-flour` (`sorghum flour / farine de sorgho`, with `jowar flour` as an English alias) and `ingredient-ref-puffed-sorghum` (`puffed sorghum / sorgho soufflé`, with `popped sorghum` and `sorghum puffs`). Neither is a grain-sorghum form or a proposed owner for `milo`. At that snapshot, the verified grain-sorghum ledger record contained its existing OQLF naming decision but no `milo` evidence or alias decision; the integration added the review evidence and accepted hold.

## Product and picker boundary

The current bilingual Canadian Feed Ingredients Table separates “Sorghum grain” from “Sorghum milo grain (or milo).” Its milo entry is specifically whole grain from the milo variety, and the table is for animal feed. That is a meaningful counterexample to treating *milo* as a proven synonym for every grain-sorghum product, but it does not establish a human-food catalog definition.

The Canadian Food Inspection Agency's plant-biology page lists *milo* among the common English names for *Sorghum bicolor*. It also cautions that common names may apply only to particular subspecies, working groups, races, or intended uses. The page says Canadian sorghum use is primarily animal feed, while also describing grain use in human food. This supports the plant-name relationship but does not settle the ingredient alias scope.

The current Canadian marketplace page for Bob's Red Mill whole-grain sorghum shows “Sorghum Milo” as a grain-type attribute. Its title and ingredient description say whole-grain sorghum, and the page disclaims separate verification of information supplied by marketplace sellers. This is evidence of one current cataloging label, not a manufacturer label or proof that *milo* is a general human-food name. Its French counterpart uses “Sorgho à Grains Entiers” and a grain-type field “Sorgho,” with no *milo* wording.

For Québec French, OQLF's GDT entry identifies *sorgho* as the preferred botanical term and pairs it with English *sorghum*. A current Longueuil retailer, Mako Foods Exotik, sells a 400 g product titled “Sorgho” and describes sorghum as a cereal. This supports local use of *sorgho* for food, not *milo* as a Québec label. OQLF also lists *gros mil* and *grand mil* as French terms for the plant; this review does not add either as an alias for the edible grain product. The current English/French OQLF entry does not list *milo* as a Québec term.

The single word *Milo* also names a branded malt drink. A separate [Section V beverage review](wp05-section-v-coffee-tea-beverages-followup-20261012.md) keeps that beverage wording separate from grain ingredients. It is not an active catalog owner, but it reinforces why a bare, case-insensitive picker query should not be assigned to grain sorghum without product-specific evidence.

| Phrase | Disposition |
| --- | --- |
| `grain sorghum / sorgho à graine` | Retain the current bilingual display and exact ownership. |
| `milo` | Do not add as an English alias. Evidence is split between a broad botanical common-name list, an animal-feed class specific to the milo variety, one weak marketplace facet, and a distinct branded beverage use. |
| `sorghum milo grain` | Do not add as an alias. CFIA defines this as a milo-variety grain class in its feed table; no human-food evidence justifies merging it into the general reference. |
| `grain de sorgho milo` / French *milo* | Do not add. The French feed-table phrase is feed-scoped; no Québec human-food label or OQLF term supports it. |
| `sorghum grain` / `sorghum` | Do not add from these sources. The OQLF supports the existing qualified display, while short or unqualified wording would broaden search ownership without helping disambiguate grain from flour or other sorghum products. |
| `milo flour`, drink mixes, planting seed, and feed grain | Keep outside this grain identity. Review each only if an exact recipe or catalog need arises. |

This is a fresh Section F review of the sorghum-grain *milo* alias boundary. It does not repeat the recent `jowar flour` alias decision: that decision is limited to flour, retains grain sorghum as a separate row, and does not establish a grain-level *jowar* alias.

## Recipe demand and numeric/form limits

No bundled ingredient line names *milo*, grain sorghum, sorghum grain, or their French variants. The corpus therefore supports no recipe link. No form, variety/color dimension, milling state, dry/cooked form, cooking yield, density, unit mapping, measurement, conversion, or substitution is proposed.

The CFIA table's animal-feed composition limits and the marketplace package size are not kitchen quantities. FAO's human-nutrition discussion of food-sorghum classes and kernel weights is contextual evidence only; it does not establish a volume conversion, serving size, density, or cooking yield. Do not infer equivalence or substitutions among milo-variety grain, general grain sorghum, pearl millet, sorghum flour, puffed sorghum, or Milo drink mix.

## Source register

Pages were checked on 2026-10-12. Source IDs were proposal-local during review; the integration registered S01–S06 and S04-FR on the existing grain-sorghum ledger record.

| Source ID | Source | Supports and limits |
| --- | --- | --- |
| `WP03-MILO-GRAIN-20261012-S01` | Office québécois de la langue française, [GDT: sorgho](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506486/sorgho). | Current page identifies *sorgho* as the preferred Québec French plant term and gives *sorghum* and *Sorghum bicolor*. It is botanical terminology, not a grain processing standard; it does not list *milo*. The existing `sorgho à graine` display is also backed by the prior OQLF source `WP03-S22` on the live ledger. |
| `WP03-MILO-GRAIN-20261012-S02` | Mako Foods Exotik, Longueuil, [Sorgho (400 g)](https://www.makofoods.ca/). | Current Québec-facing French retailer product and cereal description use *sorgho*. This supports local food wording, not a universal grain specification or a *milo* alias. |
| `WP03-MILO-GRAIN-20261012-S03` | Canadian Food Inspection Agency, [The Biology of Sorghum bicolor (L.) Moench](https://inspection.canada.ca/en/plant-varieties/plants-novel-traits/applicants/directive-94-08/biology-documents/sorghum-bicolor-moench), sections 2.4 and 4.3. | Lists *milo* as an English common name for *S. bicolor*, notes that names may apply to narrower subspecies/races/uses, and describes Canadian feed predominance alongside possible grain-food uses. Botanical and crop-context evidence; it does not equate *milo* with all food-grade grain sorghum. |
| `WP03-MILO-GRAIN-20261012-S04` | Canadian Food Inspection Agency, [Canadian Feed Ingredients Table](https://inspection.canada.ca/en/animal-health/livestock-feeds/documents-incorporated-reference/canadian-feed-ingredients-table), entries 1-201-014 and 1-201-015; French [Tableau canadien des ingrédients des aliments du bétail](https://inspection.canada.ca/fr/sante-animaux/aliments-du-betail/documents-incorporer-renvoi/tableau-canadien-ingredients-aliments-du-betail), same entries. | The bilingual table separates generic sorghum grain from sorghum-milo grain and defines the latter as the whole grain of the milo variety. This is an animal-feed ingredient standard, not a human-food name standard. |
| `WP03-MILO-GRAIN-20261012-S04-FR` | Agence canadienne d’inspection des aliments, [Tableau canadien des ingrédients des aliments du bétail](https://inspection.canada.ca/fr/sante-animaux/aliments-du-betail/documents-incorporer-renvoi/tableau-canadien-ingredients-aliments-du-betail), entries 1-201-014 and 1-201-015. | Registered separately in the research ledger to preserve the direct French-language source URL; its scope is the same as S04. |
| `WP03-MILO-GRAIN-20261012-S05` | FAO, [Sorghum and millets in human nutrition](https://www.fao.org/4/t0818e/T0818E01.htm), sorghum section. | Describes milo as one of several types of grain sorghum grown primarily for food. This older human-nutrition discussion supports a food-grain sense but presents *milo* as a class among several, not as a general synonym for all grain sorghum; its kernel-weight data are not culinary measurements. |
| `WP03-MILO-GRAIN-20261012-S06` | Walmart Canada, [Bob's Red Mill Whole Grain Sorghum](https://www.walmart.ca/en/ip/Bob-s-Red-Mill-Whole-Grain-Sorghum-24-oz/1RULXMAXCO37?classType=REGULAR) and paired [French listing](https://www.walmart.ca/fr/ip/Bob-s-Red-Mill-Sorgho-Entier-24-oz/1RULXMAXCO37). | Current marketplace metadata calls the English grain type “Sorghum Milo,” while the product title/ingredient says whole-grain sorghum and the French listing says *sorgho*. The seller page warns that third parties supply information it does not verify. Use only as a weak retail-metadata observation, not a product-definition source. |

## Disposition

**Hold bare `milo` and `sorghum milo grain` outside active catalog ownership.** Retain `ingredient-ref-grain-sorghum` with its current display, empty aliases, and identity-only numeric/form state. Reconsider only if a current human-food producer or authoritative food terminology source establishes whether *milo* is a general food-grain synonym or a specific variety/product, with Québec French naming evidence for that same scope.

## Integration result

The hold was recorded as an accepted alias-boundary decision on the existing `ingredient-ref-grain-sorghum` ledger record. Seven proposal sources (including the direct French CFIA feed-table URL) were added; the existing OQLF source `WP03-S22` remains the evidence for the displayed term. No active reference, alias, form, recipe link, measurement, conversion, yield, or substitution changed. Ledger and seed-package static validation passed. No app tests or emulator checks were run because this is a database-JSON-only catalog decision under `AGENTS.md`.
