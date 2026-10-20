# WP04 Section P — Abalone / ormeau species and product boundary review

- **Packet type:** proposal-only identity and boundary review.
- **Research date:** 2026-10-11.
- **Scope:** edible abalone foods under the common names `abalone` / `ormeau`; current Canadian species-name and protected-species evidence; Québec French display; product states, recipe demand, measures, and substitutions.
- **Recommendation:** hold an active ingredient identity and recipe links. Reopen when a recipe or product import identifies a specific edible product and its species/source can be checked. The common-name evidence is strong, but it does not establish a species-neutral, currently saleable ingredient for this corpus.
- **Write scope:** this report only. No shared catalog, ledger, plan, roadmap, code, tests, or recipes were changed.

## Plan and prior-review context

WP04 Section P of `docs/RecipeBook-global-ingredient-catalog-plan.txt` leaves abalone open beside sea urchin, conch, whelk, and sea cucumber. The prior mollusk boundary review, [`wp04-mollusks-shellfish-cephalopods-boundary-review-20261009.md`](wp04-mollusks-shellfish-cephalopods-boundary-review-20261009.md), leaves abalone as separate future work. The recent sea-urchin review, [`wp04-sea-urchin-uni-quebec-product-boundary-review-20261011.md`](wp04-sea-urchin-uni-quebec-product-boundary-review-20261011.md), held its candidate and recipe links because no matching recipe demand existed. This review applies the same demand gate while adding the abalone-specific protected-species and product-status boundary.

## Recommendation and contingent names

Do not add a reference, alias, form, or recipe link for abalone now. If a future recipe names an abalone product, first establish the named species and the product/source in that recipe or supplied package. The Fish List includes *Haliotis* spp. with English `Abalone` and French `Ormeau`; OQLF lists `ormeau` as the preferred Québec term for the edible mollusc, with English `abalone` and Latin *Haliotis* sp. [S01, S02] Those sources support a future name pair, but they do not resolve species, form, or the product’s Canadian sale/import status.

If later evidence establishes a product that is appropriate for the catalog, use the exact CFIA species-associated common name when the species is known. Keep `northern abalone / ormeau nordique`, `red abalone / ormeau rouge`, `Japanese abalone / ormeau`, and other species-linked names scoped to their listed species; do not turn them into broad aliases. In particular, the manufacturer’s `Haliotis discus hannai` wording is not itself a CFIA listing for that exact name, so this review does not map it automatically to the Fish List’s *H. discus* common names. [S02, S08]

The hold is a catalog decision, not a claim that every abalone product is prohibited. DFO identifies Northern Abalone as endangered under SARA, prohibits all harvesting in British Columbia, and tells consumers not to buy or eat it. The CFIA Fish List identifies Northern Abalone as *Haliotis kamtschatkana*. This is a species-specific restriction; it must not be generalized to every *Haliotis* species. [S02, S05]

## Canadian status and Québec naming

| Topic | Source fact | Catalog consequence / limit |
|---|---|---|
| Generic common name | CFIA’s current Fish List includes *Haliotis* spp. as `Abalone / Ormeau`; it also has multiple species-level rows and some alternative species names. [S02] | `abalone / ormeau` is a supported generic common-name pair. The list is naming guidance, not a blanket authorization to harvest, import, or sell every species or product. |
| Québec terminology | OQLF marks `ormeau` as preferred in zoology/malacology and edible mollusc; it gives English `abalone` and Latin *Haliotis* sp. It says `abalone` and `oreille de mer` were not retained by Québec’s fish-products terminology committee. [S01] | Use `ormeau` as the contingent fr-CA display. Do not add `oreille de mer` as a normalized alias. OQLF’s 2012 entry supports the term, not a species-specific package label. |
| Species-scoped names | CFIA lists examples including *H. kamtschatkana* `Abalone / Ormeau Nordique`, *H. rufescens* `Red Abalone / Ormeau rouge`, and *H. discus* entries `Abalone` (no French specified) and `Japanese Abalone / Ormeau`. [S02] | Preserve those species links; do not use them as aliases for an unspecified abalone product. The manufacturer’s *H. discus hannai* wording requires its own nomenclature review before choosing one of the *H. discus* label names. |
| Protected Northern Abalone | DFO says Northern Abalone is endangered under SARA, all harvest in BC is prohibited, and consumers should not buy or eat it; CFIA maps the common name to *H. kamtschatkana*. [S02, S05] | Exclude Northern Abalone from any generic recipe suggestion or future active alias. This does not make all farmed or imported abalone illegal. |
| Fish-product common-name rules | CFIA requires a common name on the principal display panel of prepackaged fish products; the Fish List provides acceptable names, while other names must meet the non-misleading common-name rules. [S03, S04] | Use package and species evidence when a real product is proposed. A database alias does not establish that a label or imported lot complies. |
| Live/raw molluscan-shellfish import scope | CFIA says herbivorous gastropods such as abalone (Haliotidae) are not “shellfish” under Part 1 of the SFCR definition used for its live/raw molluscan-shellfish requirements. [S06] | This is a narrow definition within those requirements, not an exemption from all food, import, or animal-health controls and not evidence of sale approval. Check applicable requirements for the actual species, state, and product. |

## Product boundary

| Product or term | Boundary decision | Evidence and limit |
|---|---|---|
| Frozen raw shell-on product | Keep distinct from cleaned edible meat and from canned/drained abalone; do not infer an edible yield. | JS Korea lists a Korean-origin, farmed *H. discus hannai* product as frozen, raw, and shell-on, separate from its canned listings. This is one supplier’s product evidence, not a universal market taxonomy or evidence of live retail availability in Canada. [S08] |
| Cleaned or processed edible tissue | Do not infer whether a recipe’s “abalone” means whole animal, raw meat, cooked meat, or drained meat without recipe/package context. | Health Canada’s CNF entry is for raw, mixed-species abalone and says “edible portion”; it does not define a whole-animal yield. [S07] |
| Canned, retort, braised, or sauced abalone | Keep product-specific preparations separate. Do not merge the can’s sauce, broth, or mixed meal with plain abalone. | The manufacturer lists canned farmed abalone in brine and oyster sauce, braised canned product, and an abalone-and-mushroom cream-sauce product. Its product list proves these examples exist; it does not define global forms or conversions. [S08] |
| Other gastropods / shellfish | Keep conch, whelk, periwinkle, snail, and bivalve identities separate; none is a synonym for abalone. | CFIA’s live/raw rule distinguishes herbivorous abalone from bivalves and predatory gastropods, including whelks. Similar culinary use is not identity evidence. [S06] |
| Shell, extract, sauce, powder, stock, or composite product | Do not alias these to edible abalone meat. | The reviewed evidence does not establish global ingredient equivalence or a conversion for these products. A future package must be reviewed by its actual ingredient declaration and state. |
| `pāua / paua`, “sea ear,” “oreille de mer,” generic “sea snail,” “shellfish,” or “seafood” | Do not add as aliases. | None of the reviewed sources identifies `pāua / paua` or “sea ear” as a generic *Haliotis* alias. OQLF says `oreille de mer` was not retained for Québec fish-product terminology; `seafood` and `shellfish` are broader than abalone. The reviewed sources do not justify broadening this identity with these terms. [S01, S02, S06] |

## Recipe demand and current ownership audit

The audit read all **114 manifest-listed recipe files / 1,123 ingredient rows**. It found **zero** row mentions for `abalone`, `ormeau`, *Haliotis*, `pāua / paua`, or the species-linked terms checked below. Recipe 093 has the unlinked generic ingredient “Cooked meat or seafood, to taste”; recipe 097 mentions seafood only in an optional add-in note. Neither specifies abalone, species, product state, or amount, so neither is abalone demand.

The current normalized-key audit mirrored `IngredientSearch.kt`: lowercase/NFKD, fold œ/æ/ß, remove combining marks, normalize punctuation and spaces, then match complete word phrases before partial strings. There is no exact active-reference, form, or legacy-candidate owner for `abalone`, `ormeau`, `pāua`, `paua`, `Haliotis`, `northern abalone`, `ormeau nordique`, `ormeau du nord`, `red abalone`, `ormeau rouge`, `Japanese abalone`, `ormeau japonais`, `sea ear`, `oreille de mer`, or `abalone meat/sauce/extract`; the app-style query simulation returns no reference for these names. The ledger has no normalized text hit for abalone, ormeau, Haliotis, or paua. At preflight, the source-ID prefix `WP04-ABALONE-20261011-` had no collision in the ledger, pre-existing proposals, or batches; it is used only in this report, and no ledger records were added.

### Refreshed package preflight

Counts and hashes below are the current-tree snapshot taken for this review. The recipe digest hashes each manifest-listed recipe basename in lexical order, then NUL, exact recipe-file bytes, then NUL.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Active ingredient references | 934 | `2a6eeb5247ccc0cb9ea4c36abd3a99cf525cdc7dec5c3c2815833a7919d9f03f` |
| Active ingredient forms | 52 | `2d1d872697cae29d9c448e1df11f9bd3405306ea1f3f860fc2b4163180288c50` |
| Legacy import candidates | 75 | `e4d72caab8c2dd6cced0015a07bd99dde535463e30f44ca48653c7bd38366de0` |
| Research ledger | 1,198 records / 3,415 source entries / 2,766 distinct source IDs | `d46672456267c77375216d3fbb67115d96303e334a7d2abf21e20db7e3e52159` |
| Manifest-listed recipe files | 114 files / 1,123 ingredient rows | `09e82b7d7ff8922e552869bf3a355e71ad3817b4a6d8ec9fd030f73e73963e37` |

## Measures, forms, conversions, yields, and substitutions

Health Canada’s CNF Food Code 3107 entry is “Mollusks, abalone, mixed species, raw” / “Mollusques, ormeau, espèces diverses, crues”; it lists 100 g edible portion and one 90 g food-guide serving. That is a source-specific nutrition/serving entry, not a recipe amount, package yield, whole-shell conversion, or cooked/canned measure. [S07]

The manufacturer’s examples are product-specific package facts: one farmed *H. discus hannai* canned product is 450 g net / 120 g drained / 8 pieces; another is 120 g net / 50 g drained / 3 pieces; its frozen raw shell-on listing is 1 kg / 18 pieces per kg. Do not normalize these to a count weight or a generic edible-yield rule. The supplier page is not a Canadian retail package or proof of current Canadian sale. [S08]

Add no household measure, density, unit mapping, form row, package yield, raw-to-cooked conversion, or substitution rule. None of the reviewed sources supports replacing abalone with conch, whelk, scallop, generic seafood, or another ingredient, and similarity in recipe role is not safety or culinary equivalence evidence.

## Source register and limits

All pages were accessed 2026-10-11. IDs are proposal-local and were not added to the research ledger.

| ID | Source | Claim used and exact limit |
|---|---|---|
| **WP04-ABALONE-20261011-S01** | Office québécois de la langue française, [ormeau](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198910/ormeau) | Preferred Québec term for the edible mollusc; English `abalone`; Latin *Haliotis* sp.; says `abalone` and `oreille de mer` were not retained by the fish-products terminology committee. Last updated 2012; does not identify a species-specific product label. |
| **WP04-ABALONE-20261011-S02** | CFIA, [Fish List search results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e) | Current list results include *Haliotis* spp. `Abalone / Ormeau` plus the species-associated names described above. Dynamic results are a naming reference, not proof of legal harvest, product approval, or sale of every listed species. |
| **WP04-ABALONE-20261011-S03** | CFIA, [Guidance on determining common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) | Says the Fish List provides English/French names and only listed common name(s) should be used as the name for the species sold or processed in Canada. This is naming guidance; it does not approve a particular species/product. |
| **WP04-ABALONE-20261011-S04** | CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish) | Requires a common name on prepackaged fish products and describes the prescribed / generally known or descriptive naming hierarchy. Product-specific label review remains necessary. |
| **WP04-ABALONE-20261011-S05** | Fisheries and Oceans Canada, [Protecting British Columbia’s Northern Abalone](https://www.pac.dfo-mpo.gc.ca/fm-gp/shellfish-mollusques/docs/northern-abalone-ormeaux-nordique-eng.html) and [French version](https://www.pac.dfo-mpo.gc.ca/fm-gp/shellfish-mollusques/docs/northern-abalone-ormeaux-nordique-fra.html) | Says Northern Abalone is endangered under SARA, all harvest in BC is prohibited, and consumers should not buy/eat it. Species is linked to *H. kamtschatkana* by S02. Does not say all abalone species or products are prohibited. |
| **WP04-ABALONE-20261011-S06** | CFIA, [Importing live and raw molluscan shellfish](https://inspection.canada.ca/en/importing-food-plants-animals/food-imports/food-specific-requirements/importing-fish-and-shellfish/molluscan-shellfish) | Defines the narrow SFCR Part 1 molluscan-shellfish import scope and excludes herbivorous Haliotidae from that definition. It is not a general import exemption or sale authorization for abalone. |
| **WP04-ABALONE-20261011-S07** | Health Canada, [Canadian Nutrient File serving entry, Food Code 3107](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=3107) | Raw mixed-species abalone; 100 g edible portion; 90 g food-guide serving. Page last modified 2019-03-01. These amounts are not recipe measures or shell-on yields. |
| **WP04-ABALONE-20261011-S08** | JS Korea, [abalone product catalogue](https://www.en.jskoreagroup.com/product-abalone) | Supplier page identifies Korean-origin farmed *H. discus hannai* and lists frozen raw shell-on, canned, drained-weight and composite preparations with product-specific weights/counts. It does not establish Canadian bilingual labelling, current Canadian availability, or Canadian sale/import approval. |

## Coordinator disposition

1. Hold an active `abalone / ormeau` ingredient reference, aliases, forms, measurements, and recipe links until a bundled recipe or specific product import creates demand.
2. For future review, require species and product-state evidence; check the exact common name and current Canadian status for that species/product. Do not use a generic alias that can hide Northern Abalone, whose protected status is species-specific but explicit.
3. If that evidence supports integration, use OQLF/CFIA-supported `ormeau` / `abalone` only within the validated species/product boundary; keep `oreille de mer`, `pāua / paua`, other species names, generic seafood/shellfish terms, shells, sauces, extracts, and composite meals out of global aliases.
4. Add no recipe link, form, measure, conversion, yield, or substitution from the current evidence. Leave WP04 Section P open.
