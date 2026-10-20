# WP04 Section P — mahi-mahi / coryphène market identity review

- **Review and source-access date:** 2026-10-12.
- **Packet type:** identity, Québec market-name, live picker, catalog ownership, and recipe-demand review.
- **Status:** integrated by root on 2026-10-12 as `ingredient-ref-mahi-mahi`; see `docs/catalog/batches/wp04-section-p-mahi-mahi-identity-integration-20261012/README.md`.
- **Recommendation:** accepted and integrated as one identity-only generic food-fish reference for **mahi-mahi / coryphène**, scoped to *Coryphaena* species as a market group. Do not identify the row as *Coryphaena hippurus* alone: OQLF says both *C. hippurus* and *C. equisetis* can occur on the market. Keep the species-specific CFIA label evidence for *C. hippurus* bounded to that taxon. A current Québec fishmonger’s product list provides direct local-market evidence [S08].
- **Proposed alias:** English `dolphinfish`, supported by OQLF. Do not add bare `dolphin`, `dorado`, `pompano dolphin`, `dauphin`, or `dorade tropicale`.
- **Integration boundary:** root added the reference and source ledger record, plus one source-specific 680 g/four-portion observation from Metro. No recipe link, form, active measure, conversion, yield, or substitution was added. No app tests or emulator checks were run because this change only adds database JSON data.

## Candidate and open-checklist fit

The open Section P checklist still includes “regional fish.” A repository-wide search of the current checklist, WP04 proposals and batches, active references, forms, legacy identities, and ledger found no prior mahi-mahi/coryphène review or allocation. This candidate is separate from the recently integrated finfish and from the reviewed Nile tilapia, cunner, gilthead bream, Pacific ocean perch, and common-carp boundaries.

| Proposed ID | Category | English display | fr-CA display | Alias | Scope |
|---|---|---|---|---|---|
| `ingredient-ref-mahi-mahi` | `PROTEIN` | **mahi-mahi** | **coryphène** | EN: `dolphinfish`; FR: none | Generic market identity for *Coryphaena* spp.; OQLF names *C. hippurus* and *C. equisetis* as species that may occur on the market. |

OQLF’s GDT entry is in the edible-fish and ichthyology domains, gives preferred Québec French **coryphène**, identifies the broader term as *Coryphaena* sp., and lists English `mahi-mahi` and `dolphinfish`. It specifically says that grande coryphène (*C. hippurus*) and petite coryphène (*C. equisetis*) can both be found on the market [S01]. Metro’s Québec fish-counter material uses `mahi-mahi` and `coryphène` for the food fish [S04–S05], and a current Saint-Hyacinthe fishmonger lists `Mahi-Mahi` among its wild-fish products [S08]. Those retailer sources do not provide a binomial; together with OQLF they support one group-level culinary identity, not a species assertion.

CFIA lists **Mahi-mahi / Mahi-mahi** and **Dolphinfish / Coryphène** for *C. hippurus* [S02]. That Canadian fish-label entry is species-specific: it corroborates the name for *C. hippurus*, but does not extend the CFIA label to *C. equisetis*. The generic catalog scope instead follows OQLF’s broader Québec market entry. Metro’s retail material does not supply a scientific name for its product, so it does not narrow its use to one of the two species.

## Name and product boundaries

- Keep the proposed catalog scope at *Coryphaena* spp. Do not attach only *C. hippurus* as the row’s taxon, and do not interpret a recipe or retailer phrase as a selection of either species.
- Use **mahi-mahi / coryphène** as the displays. OQLF supports `dolphinfish` as an English term, so it is the only proposed alias. Do not add the bare `dolphin`: that term is ambiguous with the marine mammal, and the picker would match it as a substring of `dolphinfish` even without a bare alias.
- OQLF lists `dorado`, `pompano dolphin`, `dolphin`, `dauphin`, and `dorade tropicale` among related wording, but these are not needed to retrieve the proposed bilingual displays. Do not add them as aliases; the bare forms are broad or less clear in a food picker. OQLF notes that `dauphin` and `dorade tropicale` were not retained for Québec fish-product terminology.
- Keep *C. hippurus* and *C. equisetis* as separate biological species in evidence. The generic row does not claim that they are the same fish, share a preparation state, or are interchangeable in a recipe.
- Keep the fish identity separate from prepared, preserved, or composite products such as surimi, imitation crab, smoked fish, or fish cakes.

## Exact ownership and snapshot

Snapshot read from the live worktree on 2026-10-12. File hashes cover exact bytes. The recipe-corpus digest processes `manifest.v1.json` recipe paths in stored order and hashes each relative path, a NUL byte, the exact recipe bytes, and a trailing NUL byte.

| Artifact | Count / kind | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,280 references | `413807562d803612597c65b765a8e155896dd2f9ec11e1b17d03c0e327269150` |
| `ingredient-forms.v1.json` | 95 forms | `d3f9a438190785ef7a6e21cd0eeea19b6737a6aef2fb9ff5c845ce5120b556d2` |
| `legacy-import-identities.v1.json` | 64 candidates | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,587 records; 5,647 source entries; 4,678 distinct source IDs | `07ca6e3f66fa9019292b3bbc87f0dfff75b94a5936ffdf58e728c85de7803ab4` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

Exact normalized-key ownership followed `normalizeIngredientSearchKey` in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`: lowercase, Unicode NFKD, fold common ligatures, remove combining marks, convert punctuation to spaces, and collapse whitespace. The audit checked reference displays and aliases, form labels and match terms, legacy names and aliases, ledger record IDs and text, and the proposed reference/candidate IDs.

| Key or allocation | Active reference / form / legacy / ledger ownership |
|---|---|
| `mahi-mahi`, `coryphène`, `dolphinfish` | No exact active reference, form label/match term, or legacy candidate owner. No exact ledger identity record or text hit. |
| `mahi`, `coryphene`, `dolphin`, `dorado`, `pompano dolphin`, `Coryphaena`, *C. hippurus*, *C. equisetis* | No exact active reference, form, legacy, or ledger owner. These are not all proposed aliases. |
| `ingredient-ref-mahi-mahi`, `candidate-wp04-mahi-mahi-coryphene` | Neither ID is allocated in active references, legacy candidates, or ledger records. |
| Mahi-mahi/coryphène form | No active form is attached to this candidate; no existing form owns its proposed names. |
| Proposal-local source IDs `WP04-SECTIONP-MAHI-MAHI-20261012-S01` through `S08` | At the pre-draft audit, these IDs were absent from the live ledger and existing proposal/batch files. |

The absence of exact ownership does not mean substring searches are unique; those effects are audited below.

## Actual picker behavior

`IngredientReferenceSearchIndex` searches English/French displays, aliases, and attached form terms. It normalizes accents and punctuation, returns complete normalized word-phrase matches first, and only uses substring matching if no complete-phrase result exists. The proposed projection below assumes the single identity row above, with `dolphinfish` as its only alias and no form.

| Query | Current live picker | Projected picker | Match behavior and interpretation |
|---|---|---|---|
| `mahi-mahi`, `mahi` | No result | One result: **mahi-mahi / coryphène** | Complete word-phrase match; `mahi` is a token in the displayed English name, not a stored alias. |
| `coryphène`, `coryphene` | No result | One result: **mahi-mahi / coryphène** | Complete word-phrase match after accent normalization. |
| `dolphinfish` | No result | One result: **mahi-mahi / coryphène** | Complete phrase via the OQLF-supported English alias. |
| `dolphin` | No result | One result: **mahi-mahi / coryphène** | Substring fallback through `dolphinfish`; `dolphin` is not an accepted alias. The visible food-fish display is explicit, but the broad mammal word can still surface this fish row. |
| `dorado`, `pompano dolphin`, `Coryphaena`, *C. hippurus*, *C. equisetis* | No result | No result | Not stored as aliases; scientific names remain evidence scope, not picker terms. |

This boundary differs from the prior Nile-tilapia and gilthead-bream holds: those proposed **species-specific** rows would be the only result for a generic market query (`tilapia`, `bream`/`dorade`). Cunner was held both because local commercialization evidence was negative and because the species display would match the non-retained bare term `tanche`. Here, the selected row is explicitly a **generic *Coryphaena* market group** supported by OQLF, which names two market species; a `mahi-mahi` or `coryphène` result therefore does not silently choose one taxon. The `dolphin` substring result is documented as a broad-query limitation, not a `dolphin` alias or a mammal identity. Keep the names and scope as shown; do not replace the group row with a *C. hippurus*-only row.

## Full bundled-recipe demand scan

All 114 manifest-listed recipe files, all 1,123 ingredient rows, and complete recipe JSON text were scanned for `mahi-mahi`, `mahi mahi`, `mahi`, `coryphène`/`coryphene`, *Coryphaena*, *C. hippurus*, *C. equisetis*, `dolphin`/`dolphinfish`, `dorado`, and `pompano dolphin`. **There were zero candidate-term hits in ingredient rows and zero matching files.** No new recipe link, relink, or recipe-derived substitution is supported.

The broad `fish`/`seafood` phrase scan surfaced only these three ingredient rows; none is mahi-mahi demand:

| Recipe row | Exact ingredient request | Why it is not this candidate |
|---|---|---|
| `093#4` | `Cooked meat or seafood, to taste` | An unqualified optional placeholder; it does not identify a finfish species or quantity. |
| `093#6` | `2 tbsp fish sauce` | A condiment, not fish flesh. |
| `095#5` | `1 tbsp fish sauce` | A condiment, not fish flesh. |

## Measurements, product forms, and substitutions

- Metro describes mahi-mahi as sold in steaks, fillets, and sometimes whole, and discusses grilling, roasting, pan-frying, and poaching [S04]. Those retailer descriptions establish market presentations, not global ingredient forms or standardized preparation conversions. Add no forms.
- Metro’s dated publisher recipe uses **680 g (1½ lb) fresh mahi-mahi fillets for four portions** [S06]. If the identity is integrated, this can be retained as one recipe-source observation in the ledger, with the exact quantity, freshness wording, publisher, and portion count. Do not derive a standard single-fillet weight or a universal 170 g portion, and do not place the value in the reference JSON or activate a count, density, or unit mapping.
- Metro’s fish-size statements (body length/whole-fish weight) are biological or descriptive context, not ingredient portions, edible yield, package yield, or kitchen conversion data. The recipe’s five-minute poaching instruction is specific to that recipe and is not a food-safety or general cooking-time rule.
- No source reviewed provides a tested substitute or ratio for mahi-mahi/coryphène. Similar flesh descriptions or shared fish-counter placement do not support substituting cod, tilapia, tuna, or another fish. Add no global or contextual substitution rule.
- No bundled recipe line requests this identity. The single Metro recipe amount is a publisher-specific recipe observation only; it does not justify recipe linkage, default serving amount, or app measure behavior.

## Exact possible integration delta

If the coordinator accepts this proposal, add one `PROTEIN` reference and a verified ledger record for the group-level *Coryphaena* identity. No form, recipe link, default density, unit mapping, conversion, yield, or substitution is proposed.

```json
{
  "id": "ingredient-ref-mahi-mahi",
  "nameFr": "coryph\u00e8ne",
  "nameEn": "mahi-mahi",
  "aliasesFr": [],
  "aliasesEn": ["dolphinfish"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-12T00:00:00Z",
  "category": "PROTEIN"
}
```

The ledger identity boundary records that the catalog row represents the OQLF market group *Coryphaena* sp. and can include *C. hippurus* or *C. equisetis*; it does not attach the species-specific CFIA listing solely to the group. The 680 g / four-portion Metro recipe is retained only as a source-specific observation. Source IDs S01–S08 below were copied into the `ingredient-ref-mahi-mahi` ledger record during integration.

## Sources

Sources were accessed or rechecked on 2026-10-12. Naming, product, and recipe sources have distinct scopes; none establishes a substitution or universal measure.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-MAHI-MAHI-20261012-S01** | OQLF GDT, [coryphène](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198955/coryphene) | Preferred Québec French edible-fish term; taxonomic scope *Coryphaena* sp.; lists English `mahi-mahi` and `dolphinfish`; says *C. hippurus* and *C. equisetis* can both be on the market. Last updated 2011. Terminology and market-scope evidence, not current inventory or portion data. |
| **WP04-SECTIONP-MAHI-MAHI-20261012-S02** | CFIA Fish List, [mahi-mahi query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Mahi-mahi) | Lists *C. hippurus* as `Mahi-mahi / Mahi-mahi` and `Dolphinfish / Coryphène`. The list is Canadian fish-label common-name evidence and is species-specific; it does not extend that label to *C. equisetis*. The list page is dated 2023-09-18. |
| **WP04-SECTIONP-MAHI-MAHI-20261012-S03** | CFIA, [Guidance on determining common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) | Explains that the CFIA Fish List collects acceptable Canadian common names and taxon identifiers for fish sold or processed in Canada. Labeling guidance only; it does not assign a species to an unqualified cookbook or retailer phrase. |
| **WP04-SECTIONP-MAHI-MAHI-20261012-S04** | Metro Québec, [Poissons exotiques à découvrir](https://www.metro.ca/produits-a-decouvrir/poissonnerie/conseils-de-mon-poissonnier/poissons-exotiques-decouvrir) | Uses `mahi-mahi`, gives French `coryphène` and English `dolphinfish`, says it is offered in Metro fish-counter departments, and describes sale whole, as steaks, or as fillets. Page has no visible publication date or species binomial; it is retailer guidance, not a live store/SKU/stock record. |
| **WP04-SECTIONP-MAHI-MAHI-20261012-S05** | Metro Québec, [Cuisinez la mer, tout simplement](https://api.metro.ca/produits-a-decouvrir/poissonnerie/conseils-de-mon-poissonnier/cuisinez-mer-tout-simplement) | The fish-counter page says Metro offers mahi-mahi and lists a mahi-mahi recipe. It corroborates consumer-market usage; it does not identify species, current local store stock, or a tested substitution. |
| **WP04-SECTIONP-MAHI-MAHI-20261012-S06** | Metro, [Filet de mahi-mahi à la dijonnaise](https://www.metro.ca/recettes-et-occasions/recettes/filet-de-mahi-mahi-a-la-dijonnaise) | Publisher recipe dated 2013-08-06; lists 680 g (1½ lb) fresh mahi-mahi fillets for four portions and poaches for five minutes. This is one recipe’s amount and technique, not a standardized serving, fillet weight, general cooking rule, or safety endpoint. |
| **WP04-SECTIONP-MAHI-MAHI-20261012-S07** | SeaCore Seafood Products, [Mahi Mahi](https://www.seacoreseafood.com/product/Mahi_Mahi) | Canadian supplier page names *C. hippurus* and lists whole, portion, and fillet presentations, fresh and frozen. Supports a Canadian supplier product for that species only; it does not establish Québec shelf stock or a generic group-level form. |
| **WP04-SECTIONP-MAHI-MAHI-20261012-S08** | Poissonnerie Granada, Saint-Hyacinthe, [Poissons et fruits de mer](https://www.poissonneriegranada.ca/poissons-et-fruits-de-mer) | Current Québec fishmonger list places `Mahi-Mahi` among wild-fish offerings. This is local consumer-market evidence, not an availability guarantee, French display, taxon label, or product specification. |

## Recommendation

**Advance** `ingredient-ref-mahi-mahi` as the identity-only market-group row shown above. The Québec naming source explicitly supports *Coryphaena* sp. and both market species; Metro supplies exact Québec food wording and product presentations, and a current Saint-Hyacinthe fishmonger lists mahi-mahi among its products. Keep the CFIA species entry and Metro’s one recipe quantity scoped to their source descriptions. Add no recipe link, form, measure behavior, conversion, yield, or substitution; preserve the broad `dolphin` substring caveat in the review record.
