# WP04 Section P — gilthead bream / dorade royale picker-boundary review

- **Review and source-access date:** 2026-10-12.
- **Packet type:** species identity, Québec naming, picker boundary, ownership, and recipe-demand review.
- **Disposition:** **Hold recorded** for `gilthead bream / dorade royale` (*Sparus aurata*) outside the active catalog and ledger. The species identity and bilingual name pair are supported, but activating the species-only display would make broad `bream` and `dorade` searches return this one species. Keep generic bream and dorade wording unresolved until picker behavior can preserve those broader boundaries.
- **Worktree scope:** the proposal recommendation was recorded in the catalog plan, roadmap, and batch README. No catalog JSON, forms, legacy candidates, ledger, recipes, or generated code changed.

## Candidate and recommendation

Section P remains open for species and regional finfish coverage. The prior finfish gap review held generic sea-bream/bream names because Canadian common-name usage spans multiple taxa. This packet examines one unreviewed species identity within that open boundary; it does not reopen the generic-bream decision or any prior cod, trout, bass, perch, wolffish, cusk, sardine, or product-state review.

The source-supported future identity is:

| Candidate ID | Category | English display | fr-CA display | Taxon | Proposed aliases |
|---|---|---|---|---|---|
| `ingredient-ref-gilthead-bream` | `PROTEIN` | **gilthead bream** | **dorade royale** | *Sparus aurata* | None while the picker boundary remains unresolved |

OQLF’s edible-fish entry gives *Sparus aurata*, prefers Québec French **dorade royale**, and lists **gilthead bream** among its English translations. The CFIA Fish List independently pairs the taxon with `Gilthead Bream / Dorade Royale`; FAO uses the same French term and the English variant `Gilthead seabream` [S01–S03]. This supports a species identity, but does not make its shorter market words species-specific.

If this row were activated in the current picker, the display itself would match the one-word query **bream**. The French display would match **dorade**. CFIA lists multiple taxa under bream and related names, including *Abramis brama* (`Bream / Brème`, `Common Bream / Brème Commune`), *Boops boops* (`Bream / Bogue`), several *Pagellus* species, and other Sparidae; it also lists *Pagrus auratus* as `Silver Seabream / Dorade` [S01]. A user choosing the only result from an unqualified query would be shown one species as though it represented the broader term. Keep the candidate unallocated until the picker can retain that scope.

## Taxon and naming boundary

- Any future reference must be limited to *Sparus aurata* (family Sparidae). Keep it distinct from common bream (*Abramis brama*, family Cyprinidae), *Boops boops*, *Pagellus* species, and other fish carrying bream, seabream, porgy, or dorade names [S01–S03].
- Use the complete proposed display pair only if picker behavior is resolved: English **gilthead bream** and Québec French **dorade royale**. OQLF marks **dorade royale** as preferred and says **daurade royale** was not retained by the fish-product terminology committee. Do not add `daurade royale` as a catalog alias [S02].
- OQLF also lists English **gilthead sea bream** and **porgy**. Do not add these as aliases in the current picker: `sea bream` is a broader market phrase, while CFIA assigns `porgy` to multiple species, including *Pagellus bogaraveo* and *Pagrus caeruleostictus* [S01–S02]. A future species-specific alias may be reconsidered if broad-query search no longer collapses to this sole result.
- Do not add bare `bream`, `brème`, `sea bream`, `seabream`, `porgy`, `dorade`, or `daurade` as aliases. They are broad or overlapping fish-market terms, not evidence that those names denote *S. aurata* alone [S01–S02].
- The local retail listing uses `dorade royale` for a fresh whole product, but does not show a scientific name. OQLF and CFIA supply the taxon/name connection; the retailer listing is evidence of Québec product wording only [S01–S02, S04].

## Prior work and exact ownership audit

A repository search covered the Section P checklist, finfish proposals and batches, active references, ingredient forms, legacy candidates, and research ledger. Earlier packets do hold generic bream/sea-bream wording; none allocates or reviews a dedicated `gilthead bream / dorade royale` identity for *S. aurata*. Existing catalog work for Pacific ocean perch, striped bass, cusk, and Atlantic wolffish concerns different taxa and boundaries.

Snapshot read from the live worktree immediately before drafting on 2026-10-12. Hashes cover exact file bytes. The recipe-corpus digest follows `manifest.v1.json` order and hashes each relative path, a NUL byte, the recipe bytes, and a trailing NUL byte.

| Artifact | Count / kind | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,260 active references | `f0e0f496d79abedf2e4ff0409cdc0acaaad389f6b08161ece4c6180d68185434` |
| `ingredient-forms.v1.json` | 94 forms | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,569 records; 5,502 source entries; 4,540 distinct source IDs | `5c551e67598cbefed66d9cbbb98bba869e5cb62c627df58fc5ab01f576ab9c13` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The exact-key audit followed `normalizeIngredientSearchKey` in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase, Unicode NFKD, fold `œ` / `æ` / `ß` and `&`, remove combining marks, replace other characters with spaces, then trim and collapse whitespace. It checked active reference IDs, English/French displays and aliases; form IDs, labels, and match terms; every legacy candidate ID, name, and alias; and ledger record IDs and evidence text.

| Candidate or boundary key | Exact current owner and result |
|---|---|
| `gilthead bream`, `gilthead sea bream`, `gilthead seabream`, *Sparus aurata*, `dorade royale`, `daurade royale` | No exact active reference, form, legacy candidate, or ledger identity record owns these names or the taxon. The English/French display pair is supported in sources but remains unallocated. |
| `ingredient-ref-gilthead-bream`, `candidate-gilthead-bream`, `ingredient-form-gilthead-bream` | No active reference, form, legacy candidate, or ledger record uses these IDs. |
| `bream`, `brème`, `sea bream`, `seabream`, `porgy`, `dorade`, `daurade` | No exact active reference, form, or legacy candidate owns these keys. Their broader CFIA usage means they must not become aliases for *S. aurata*. |
| `ingredient-ref-pacific-ocean-perch`, `ingredient-ref-striped-bass`, `ingredient-ref-cusk`, `ingredient-ref-atlantic-wolffish` | Separate fish identities or proposal boundaries; none owns the gilthead-bream keys. |

The proposed ID and source prefix `WP04-P-GILTHEAD-BREAM-20261012` are absent from active data, the ledger, and earlier catalog research documents. No form is attached to a gilthead-bream identity. The old generic-bream hold remains a scope decision, not an exact active owner.

## Picker phrase boundary

Reference search normalizes each query and matches it against complete word phrases found anywhere in an English/French display or alias before falling back to partial matching ([IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)). Therefore, if only the proposed pair were activated:

- `gilthead bream` and `dorade royale` would retrieve the intended species.
- `bream` would retrieve the same single species because it is a word in the English display.
- `dorade` would retrieve the same single species because it is a word in the French display.
- Adding OQLF’s `gilthead sea bream` as an alias would also make `sea bream` a single-result query. Adding `porgy` would collapse a name used for other taxa onto *S. aurata*.
- The same effect is not solved by omitting explicit broad aliases: the unqualified terms occur inside the display names themselves.

Hold the identity outside the active picker until it can return a meaningful broader bream/dorade scope or explicitly communicate that a query is ambiguous. A species-specific alias is acceptable only if it does not make a broader query resolve to this one species.

## Bundled recipe-corpus demand audit

All 114 manifest-listed recipe files, every one of the 1,123 ingredient rows, and complete recipe JSON text were checked for `gilthead bream`, `gilthead sea bream`, `gilthead seabream`, *Sparus aurata*, `dorade royale`, `daurade royale`, `bream`, `brème`, `sea bream`, `seabream`, `porgy`, `dorade`, and `daurade` using normalized whole-phrase matching.

**Result: zero candidate or broad-term hits in ingredient rows and zero matching recipe files.** No recipe asks for this species or a generic bream/dorade ingredient, so no recipe link, species inference, form, measurement, or substitution is supported.

Nearby bundle rows remain distinct: recipe 077#10 asks for skinless salmon fillets; recipe 111#1 asks for an unqualified tuna steak; recipe 093#4 says “Cooked meat or seafood, to taste” without a species; recipes 093#6 and 095#5 use fish sauce; recipe 019#8 uses jumbo-lump crab meat. None implies gilthead bream or a generic bream identity.

## Québec/Canadian source limits; forms, numbers, and substitutions

- **Québec French:** OQLF’s GDT entry was last updated in 2011. It identifies *S. aurata*, names `dorade royale` as the preferred term, and rejects `daurade royale` for fish-product terminology. Its note that the species has commercial potential in Québec is not proof of present availability or consumer use [S02].
- **Canadian/English:** CFIA’s Fish List gives `Gilthead Bream / Dorade Royale` for *S. aurata* and shows adjacent taxa under other bream and related names. The Fish List was last modified 2023-09-18 and is a Canadian fish-label naming reference, not a recipe equivalence or substitution standard [S01].
- **International terminology:** FAO’s multilingual species sheet independently pairs `Gilthead seabream / Dorade royale` with *S. aurata*. It is global aquaculture/species evidence, not Québec consumer-language evidence, current Canadian inventory, or a kitchen-measure source [S03].
- **Local retail:** Mayrand’s Québec listing uses `Dorade royale entière fraîche` and gives an approximate 500 g item. At access, store availability showed “Bientôt disponible.” This establishes a local product listing and one product-specific approximate size, not current shelf stock, a standard count weight, a portion, yield, or conversion [S04].
- The retail whole-fish wording is not grounds to add a generic `fresh`, `whole`, or prepared form to the catalog without recipe demand and a defined form model. Add no form, default density, unit mapping, count-to-mass conversion, edible fraction, package yield, cooking yield, recipe link, or measure.
- No source reviewed supports substituting *S. aurata* for common bream, another sea bream, porgy, snapper, sea bass, or a generic finfish. Add no global form conversion or contextual ingredient substitution.

## Source register

Sources were accessed on 2026-10-12. These proposal-local source IDs are not ledger additions.

| Source ID | Source | Claim supported and limit |
|---|---|---|
| **WP04-P-GILTHEAD-BREAM-20261012-S01** | CFIA, [Fish List query for Gilthead Bream](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Gilthead%20Bream) and [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | The current indexed list pairs *Sparus aurata* with `Gilthead Bream / Dorade Royale` and gives examples of other species under `Bream`, `Sea Bream`, `Porgy`, and `Dorade`. The list is for acceptable Canadian fish-label common names, not a recipe or interchangeability standard; it was last modified 2023-09-18. |
| **WP04-P-GILTHEAD-BREAM-20261012-S02** | OQLF GDT, [dorade royale](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199006/dorade-royale) | In edible-fish and ichthyology domains, identifies *S. aurata*, prefers `dorade royale`, and lists `gilthead bream`, `gilthead sea bream`, and `porgy` in English. Says `daurade royale` was not retained by the fish-product terminology committee. Last updated 2011; Québec terminology evidence, not current retailer inventory. |
| **WP04-P-GILTHEAD-BREAM-20261012-S03** | FAO, [Sparus aurata — cultured aquatic species fact sheet](https://www.fao.org/fishery/docs/DOCUMENT/aquaculture/CulturedSpecies/file/en/en_giltheadseabr.htm) | Gives the scientific identity *Sparus aurata* and FAO names `Gilthead seabream / Dorade royale`. Global species and aquaculture evidence; not a Canadian label, Québec market, recipe-measure, or substitution source. Fact sheet cites FAO 2009. |
| **WP04-P-GILTHEAD-BREAM-20261012-S04** | Mayrand, [Dorade royale entière fraîche 500 g](https://mayrand.ca/fr/nos-produits/poissonnerie/poissons-a-larrivage/dorade-royale-entiere-fr-52921) | Québec retail listing uses the French product wording and shows an approximate 500 g item size; displayed store status at review was “Bientôt disponible.” The page does not identify the taxon itself or establish a transferable measure. |

## Recommendation

**Original 2026-10-12 decision:** hold `ingredient-ref-gilthead-bream` outside the active reference catalog, forms, and ledger because the broad `bream` and `dorade` queries would return this one species. **Current status:** R604 added separate multi-species `bream / brème` and `sea bream / dorade` groups, but did not add this species identity or any species-specific aliases, forms, recipe links, or numeric behavior. See the [R604 proposal](wp04-section-p-bream-sea-bream-market-group-review-r604-20261018.md) for the current broad-query representation.

No app tests or emulator checks were run because this documentation-only hold changed no application or database data.
