# WP04 Section P — Atlantic pollock / goberge identity review (round 15)

- **Review and source-access date:** 2026-10-13.
- **Packet type:** finfish identity, Québec naming, picker, ownership, and recipe-demand proposal packet; root integration is complete.
- **Candidate:** Atlantic pollock / goberge de l’Atlantique (*Pollachius virens*).
- **Disposition:** **Advance one identity-only `PROTEIN` reference** as `ingredient-ref-atlantic-pollock`, with the Québec retail spelling `goberge Atlantique` as its only French alias. Keep generic `pollock` and `goberge` unassigned as aliases. Their searches will return the Alaska and Atlantic species rows together.
- **Scope:** resolve the open Atlantic pollock name boundary left by the earlier [pollock/mackerel review](wp04-pollock-mackerel-species-boundary-review-20261009.md) and [October 12 finfish sweep](wp04-section-p-next-finfish-gap-sweep-20261012.md). This does not reopen Alaska pollock, generic surimi, cod/haddock substitution, or other regional finfish decisions.
- **Proposal-time worktree scope:** this packet was prepared as a proposal before shared catalog JSON, ledger, plan, roadmap, recipe, or generated files were changed.

## Proposed identity-only row

| Candidate ID | Category | English display | Québec French display | French alias | Species scope |
|---|---|---|---|---|---|
| `ingredient-ref-atlantic-pollock` | `PROTEIN` | **Atlantic pollock** | **goberge de l’Atlantique** | `goberge Atlantique` | *Pollachius virens* |

The species and Québec base name are supported by OQLF and Fisheries and Oceans Canada (DFO); a current Canadian fishery regulation pairs `Pollock (Saithe)` with `Goberge` for *P. virens*. The regional seafood profile and current Québec retailer listing supply the qualified French market wording. The retailer variant `goberge Atlantique` is preserved as a narrow search alias. These sources support a fish identity, not a product form or a regulatory claim that the qualified phrase is a distinct CFIA Fish List entry [S01–S04, S07–S09].

Do not add `pollock`, `goberge`, `pollack`, `saithe`, `coalfish`, `coley`, `Boston bluefish`, `colin`, or `lieu noir` as aliases. OQLF labels several of these as UK or France/Europe wording, and the broad English/French terms collide with the Alaska pollock row or with other Québec product uses. Keep `ingredient-ref-alaska-pollock` as `Alaska pollock / goberge de l’Alaska`, scoped to *Gadus chalcogrammus* [S01–S06].

## Evidence and naming boundary

- **Québec terminology:** OQLF’s GDT entry places `goberge` in edible-fish terminology, identifies *Pollachius virens*, and lists English `pollock` and `Atlantic pollock`. It marks `goberge` as Québec/Canada preferred. The entry was last updated in 2004, so it is authoritative terminology but not current retail evidence. It notes that the fish’s flesh is sold fresh or frozen and used in surimi; that does not make the finished surimi product the same ingredient identity [S01].
- **Canadian species and fishery:** DFO’s French profile is titled `La goberge (Pollachius virens)`, describes the species and its Atlantic Canadian fishery, and was modified 2025-07-04. The current-to-2026-06-17 *Atlantic Fishery Regulations, 1985* list `Pollock (Saithe) / Goberge` for *P. virens*. These primary Canadian sources pair the taxon with the English and French base names; the regulation is fishery nomenclature, not a packaged-food label standard [S02–S03].
- **Qualified French wording:** Seafood from Canada’s Atlantic species page presents `Goberge, atlantique` with *P. virens* and uses `goberge de l’Atlantique` in its description. It is a Canadian Atlantic seafood promotion page, not a regulator or a consumer package. Supermarché PA’s current Québec fresh-seafood category lists `Filets de goberge Atlantique frais` in an approximate 400 g package. This is current local retail-name evidence, but the listing does not show a scientific name and does not establish the taxon of a particular lot [S07–S08].
- **Independent supplier corroboration:** Nova Scotia processor Sea Star Seafoods titles a current product page `Atlantic Pollock Fillets (Pollachius virens)`, says the fish may be called `Goberge`, and explicitly distinguishes it from Alaska pollock (*Gadus chalcogrammus*). This supports the bilingual species boundary, but the page is supplier-specific and is not Québec retail or official labelling guidance [S09].
- **Label-name limit:** CFIA’s Fish List `Pollock` results include *P. virens* and *G. chalcogrammus* under English `Pollock`; the Alaska entries include French `Goberge`/`Goberge d’Alaska`. The separate French-name lookup also returns *P. virens* as `Goberge`. CFIA’s guidance says Fish List names are the names to use for a species sold or processed in Canada, and warns that other names are assessed against misleading-labelling requirements. The inspected CFIA output does not establish `goberge de l’Atlantique` as a separately listed label name. This proposal uses that phrase as a Québec picker display based on current market wording and the official species/name pair; it is not advice to relabel a fish package [S04–S06].

The prior hold asked for a source-backed French qualifier rather than inventing `goberge de l’Atlantique` by analogy. The current Québec retail spelling and Canadian species listing now supply that evidence. The species-scoped row can advance while the generic-name and prepared-surimi boundaries remain open.

## Proposal-time ownership and source-ID audit

The audit used the app’s current search normalization (lowercase, Unicode NFKD, accent and punctuation folding, and collapsed spaces) across active reference names and aliases, attached form labels and match terms, legacy candidate names and aliases, and ledger record IDs. The proposal-time source snapshot contained 1,343 active references, 98 forms, 64 legacy candidates, and 1,655 ledger records.

| Key or nearby allocation | Review result |
|---|---|
| `Atlantic pollock`, `goberge de l’Atlantique`, `goberge Atlantique`, *Pollachius virens* | No exact active reference, form, or legacy-candidate name/alias owns these keys. No ledger identity record owns the proposed taxon. |
| `ingredient-ref-atlantic-pollock` | Unallocated in active references, forms, legacy candidates, and ledger records. |
| `ingredient-ref-alaska-pollock` | Existing verified `PROTEIN` reference `Alaska pollock / goberge de l’Alaska`, with no aliases; its ledger decision explicitly omits generic `pollock` and `goberge` from that row. |
| Standalone `pollock` / `goberge` | No standalone reference or alias owns either exact key. Current word-phrase search still finds Alaska pollock through its displayed names. CFIA and Québec retail evidence show why these terms must not be attached exclusively to one species. |
| `candidate-surimi-product-boundary` | Existing unresolved product-boundary record. It remains separate from this raw fish identity; its registered OQLF, CFIA, and retailer sources distinguish paste inputs from finished imitation-seafood products. |

At proposal time, the packet-local source-ID prefix `WP04-SECTIONP-ATLANTIC-POLLOCK-GOBERGE-20261013-R15-` was absent from the ledger. The CFIA `Pollock` query URL was already registered as `WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S01` on the Alaska pollock record and as `WP04-FRESHWATER-FINFISH-20261010-S07` on the walleye record. Root reused the Alaska-record source ID rather than adding another entry for that URL. Other R15 source IDs now registered in the ledger are identified below [S04].

## Proposal-time phrase-first picker projection

The app search uses complete normalized word phrases before substring fallback ([`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)). The pre-integration picker was checked against the active references and forms, then projected with the proposed display and single French alias above.

| Query | Current picker | Conditional picker | Boundary |
|---|---|---|---|
| `Atlantic pollock` | No result | Atlantic pollock / goberge de l’Atlantique only | Species-qualified English display. |
| `goberge de l’Atlantique` | No result | Candidate only | Species-qualified Québec display. |
| `goberge Atlantique` | No result | Candidate only | Narrow alias matching the current PA product wording. |
| `pollock` | Alaska pollock only | Alaska pollock + Atlantic pollock | Broad search now presents both taxa. |
| `goberge` | Alaska pollock only | Alaska pollock + Atlantic pollock | Broad search now presents both fish choices; it does not resolve a prepared surimi product. |
| `Alaska pollock` / `goberge de l’Alaska` | Alaska pollock only | Alaska pollock only | Existing qualified identity remains unchanged. |
| `surimi` | No result | No result | The separate surimi candidate remains unresolved; no paste or finished imitation product is added here. |
| `pollack`, `saithe`, `coalfish`, `coley`, `Boston bluefish`, `colin`, `lieu noir` | No result | No result | Not added as aliases; preserve regional and species-market boundaries. |

This makes a broad English or French pollock query return two species rather than silently narrowing to Alaska pollock. The current search does not have a separate surimi result, so this change must not be used to interpret recipes or shopping entries that mean imitation crab or another prepared seafood product.

## Bundled recipe demand

All 114 manifest-listed recipe files, all 1,123 `ingredients[]` rows, and complete recipe JSON text were scanned for `Atlantic pollock`, `goberge de l’Atlantique`, `goberge Atlantique`, `Pollachius virens`, `pollock`, `goberge`, and `surimi`. The manifest-ordered corpus digest was `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`.

**Result: zero matching recipe files and zero ingredient-row hits for every audited term.** No bundled recipe supports a recipe link, an interpretation of generic `pollock`/`goberge`, or a raw-fish-to-surimi substitution. The proposed identity responds to the open Section P fish coverage and current Québec retail wording; it does not establish recipe demand.

## Forms, measures, and substitutions

| Evidence | Limit and decision |
|---|---|
| Supermarché PA lists fresh Atlantic-goberge fillets in an approximate 400 g package. | Retailer- and listing-specific package quantity, not a standard filet weight, portion, or measure. Add no active form or package measure. |
| DFO gives typical biological size of 30–110 cm and 7 kg, with some fish up to 32 kg. | Biological size is not an edible yield, count weight, serving size, or recipe measure. Add no density, unit mapping, conversion, or yield. |
| Sea Star lists 454 g and 340 g retail packs for its own Pollock products. | Supplier-specific pack sizes; not global recipe amounts or unit mappings. |
| Seafood from Canada describes a mild flavour and use in fish and chips and imitation crab. | General marketing and product-use statements do not define preparation state or quantitative equivalence. Add no recipe link or substitution to cod, haddock, Alaska pollock, surimi, or imitation crab. |

No reviewed source provides a standard household amount, cooking yield, edible fraction, or measured substitution ratio. Keep the candidate identity-only. Preserve the existing surimi boundary and all cod/haddock/Alaska-pollock relationships unchanged.

## Source register

Pages were accessed or rechecked on 2026-10-13 unless a source’s date is stated. Root added S01–S03, S05, and S07–S09 to the ledger. S04 reuses the existing Alaska-record CFIA `Pollock` query source ID, and S06 was not added because the shared ledger already records the CFIA guidance URLs.

| Source ID | Source | Claim supported and evidence limit |
|---|---|---|
| `WP04-SECTIONP-ATLANTIC-POLLOCK-GOBERGE-20261013-R15-S01` | OQLF GDT, [goberge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198637/goberge) | Québec/Canada preferred term `goberge`, English `pollock` / `Atlantic pollock`, and Latin *Pollachius virens*. Last updated 2004; terminology and taxon evidence, not current inventory. |
| `WP04-SECTIONP-ATLANTIC-POLLOCK-GOBERGE-20261013-R15-S02` | Fisheries and Oceans Canada, [La goberge (*Pollachius virens*)](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/pollock-goberge-fra.html) | Current French species/fishery profile with the taxon and Québec French base name; modified 2025-07-04. Its biological measurements are not culinary measures. |
| `WP04-SECTIONP-ATLANTIC-POLLOCK-GOBERGE-20261013-R15-S03` | Department of Justice Canada, [Atlantic Fishery Regulations, 1985, Schedule I](https://laws.justice.gc.ca/PDF/SOR-86-21.pdf) | Current to 2026-06-17; pairs `Pollock (Saithe)` / `Goberge` with *P. virens*. This is current fishery nomenclature, not a packaged-food label standard. |
| `WP04-SECTIONP-ATLANTIC-POLLOCK-GOBERGE-20261013-R15-S04` | CFIA Fish List, [Pollock query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Pollock) | Lists `Pollock` for *P. virens* and *G. chalcogrammus* and Alaska French variants including `Goberge`. The list displays a 2023-09-18 modification date; this exact query is already registered under the source IDs noted above. |
| `WP04-SECTIONP-ATLANTIC-POLLOCK-GOBERGE-20261013-R15-S05` | CFIA Fish List, [Goberge query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=f&q=Goberge) | Returns *P. virens* with French `Goberge` and also supports the generic-name overlap. The list displays a 2023-09-18 modification date; it does not establish the qualified retail phrase as a separate CFIA entry. |
| `WP04-SECTIONP-ATLANTIC-POLLOCK-GOBERGE-20261013-R15-S06` | CFIA, [Guidance on determining fish common names](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) and [labelling requirements for fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish) | CFIA common names guide Canadian fish labels and discusses generally known names and surimi products. These sources define label limits; they do not decide the app’s recipe-picker display. |
| `WP04-SECTIONP-ATLANTIC-POLLOCK-GOBERGE-20261013-R15-S07` | Seafood from Canada, [Autres espèces](https://seafoodfromcanada.ca/fr/seafood/autres-especes/) | Pairs `Goberge, atlantique` and *P. virens*, and uses `goberge de l’Atlantique`. Industry promotion, not a regulatory common-name decision or lot-specific label. |
| `WP04-SECTIONP-ATLANTIC-POLLOCK-GOBERGE-20261013-R15-S08` | Supermarché PA, [fresh fish and seafood catalogue](https://www.supermarchepa.com/collections/fresh-fish-seafood?page=5&view=fr) | Current Québec retail listing for `Filets de goberge Atlantique frais`, approximate 400 g. It gives no scientific name and does not confirm live stock or taxon for a particular package. |
| `WP04-SECTIONP-ATLANTIC-POLLOCK-GOBERGE-20261013-R15-S09` | Sea Star Seafoods, [Atlantic Pollock Fillets](https://seastarseafoods.com/?page_id=27) | Canadian supplier page pairs Atlantic pollock and *P. virens*, calls it `Goberge`, and distinguishes Alaska pollock. The page is supplier-specific, undated, and not Québec retail. |

## Recommendation

Advance only `ingredient-ref-atlantic-pollock`, category `PROTEIN`, with `Atlantic pollock / goberge de l’Atlantique` and the one French retail spelling alias `goberge Atlantique`, scoped to *Pollachius virens*. Keep Alaska pollock separate. Do not add broad aliases, forms, recipe links, measures, conversions, yields, or substitutions. Keep the unresolved surimi product boundary unchanged.

No app, unit, instrumentation, or emulator tests were run. The shared changes add database JSON data and documentation, so app and emulator tests were not needed under the updated workspace rule; static package and ledger checks are recorded in the integration README.

## Root integration status

**Integrated.** Added identity-only `ingredient-ref-atlantic-pollock` with the proposed qualified names and one French retail spelling alias. Generic `pollock` and `goberge` remain unassigned; both species now appear. See [round-fifteen integration](../batches/wp02-wp03-wp04-round15-gap-review-integration-20261013/README.md). No app or emulator tests were run because the shared changes add database JSON data and documentation.
