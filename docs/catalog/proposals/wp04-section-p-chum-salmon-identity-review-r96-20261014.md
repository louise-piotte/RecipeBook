# WP04 Section P — chum salmon / saumon kéta identity review (R96)

- **Review and source-access date:** 2026-10-14.
- **Packet type:** finfish identity, Québec and Canadian market wording, picker projection, recipe demand, and product-state review.
- **Open checklist:** the [Section P fish and regional seafood item](../../RecipeBook-global-ingredient-catalog-plan.txt#L4353) remains open. The broader [vernacular fish-name item](../../RecipeBook-global-ingredient-catalog-plan.txt#L5208) also remains open.
- **Recommendation:** Add one identity-only `PROTEIN` reference for **chum salmon / saumon kéta**, *Oncorhynchus keta*, with only `keta salmon` as an English alias. Do not assign any recipe to this species.
- **Integration status:** accepted and integrated on 2026-10-14; the root decision and validation record are below.
- **Shared-data delta:** one identity-only reference and one research-ledger record with six source-specific CNF observations. No recipe link, form, active measure, conversion, yield, or substitution was added.
- **Tests:** no app, Gradle, instrumentation, or emulator tests were run because the application change only adds database JSON data and its generated catalog index under the `AGENTS.md` exception. Static package and catalog checks are recorded in the batch README.

## Candidate and prior scope

This review selects one salmon species identity, *Oncorhynchus keta*. It is separate from the recent R95 spot-prawn hold and from the other recent Section P decisions. The live catalog has a recipe-facing row for unqualified salmon fillets, but no taxon-specific chum-salmon row.

There is relevant prior work: the [2026-10-11 salmon/tuna species-boundary review](wp04-finfish-salmon-tuna-species-boundary-recheck-20261011.md) and its live ledger record `candidate-wp04-salmon-species-scope` kept species inference out of the generic recipe references. That review names chum/keta among the separate taxa, but its decision concerns the unqualified recipe line and did not audit current Québec Keta product listings, Keta-specific external recipe use, or the search effect of a qualified chum-salmon row. This proposal does not reopen or relink the generic recipe line. If root accepts the identity, reconcile the older broad-scope candidate explicitly rather than treating recipe 077 as species evidence.

The Section P [R95 spot-prawn hold](../batches/wp04-section-p-spot-prawn-boundary-hold-integration-20261014/README.md) remains distinct: that hold is about generic `prawn` search scope, whereas the proposed chum-salmon row makes broad `salmon` and `saumon` queries return both the generic fillet product and a qualified species.

## Taxon and bilingual product wording

CFIA Fish List TSN 161976 assigns *Oncorhynchus keta* the names **Chum Salmon / Saumon Kéta**, **Keta Salmon**, and **Silverbrite Salmon**. OQLF’s edible-fish entry identifies *O. keta*, gives **saumon kéta** as its preferred Québec French term and **chum salmon** as English, and records the GDT entry as last updated in 2012. The Québécois terms `saumon chien`, `saumon chum`, and `saumon Qualla` were not retained by the fish-product terminology committee. Current Québec retailer labels also use **Keta Salmon** and **saumon kéta** for the species-qualified product name. [S01–S04]

Use the source-supported canonical pair **chum salmon / saumon kéta**. Add `keta salmon` as an English search alias because CFIA and Québec retail labels use that word order. Keep French aliases empty: accents are normalized by the picker, so searches for `saumon keta` still match the preferred `saumon kéta` display. Do not add `silverbrite salmon`, OQLF’s `silverbright salmon` spelling, or `dog salmon`; those alternatives are unnecessary for the current Canadian/Québec product wording. Do not add Latin names, broad `salmon`/`saumon` aliases, or the unretained French variants.

The bounded candidate is *O. keta* only. Keep Atlantic salmon (*Salmo salar*), pink salmon (*O. gorbuscha*), coho (*O. kisutch*), sockeye (*O. nerka*), Chinook/quinnat (*O. tshawytscha*), rainbow trout, and salmon roe separate. A shared genus, family, or broad salmon query is not a species or recipe equivalence.

## Exact ownership and snapshot

I checked the current reference and form terms, legacy candidate names and aliases, research-ledger record IDs and decisions, prior Section P proposals and batch records, and the active recipe corpus for the proposed ID, taxon, display pair, alias, and adjacent fish-product names. There is no active reference, form, or legacy candidate for chum salmon, keta salmon, saumon kéta, or *O. keta*. The one related ledger owner is the broader `candidate-wp04-salmon-species-scope` described above; there is no dedicated chum-salmon identity record. The proposed ID `ingredient-ref-chum-salmon` and source prefix `WP04-SECTIONP-CHUM-SALMON-R96-20261014-` are unallocated.

The only active salmon-named reference is the generic recipe-facing `ingredient-ref-salmon-fillets-without-skin`, displayed as **salmon fillets / filet de saumon**, with no aliases, forms, density, or unit mappings. It is not scoped to a taxon. No form attaches to it.

Current worktree snapshot before writing this proposal:

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,428 references | `43410faf616fd812275fdf0cfdd07916fe416c5a6c4d65558742e2fdbc9f3ce1` |
| `ingredient-forms.v1.json` | 105 forms | `32dc182e715bf48a500039141c5385b0aef02650173a7327c6025ff7882760f0` |
| `legacy-import-identities.v1.json` | 63 candidates | `a704cf17c1e8ed75682190a4d2e060f7ee312aceb95cb74316ec7b58bf622deb` |
| `research-ledger.v1.json` | 1,768 records | `9400fc1fc70f39caf19f243b31108f9cea81b3ed88372731e83884f17d63fad2` |
| Bundled manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,928 bytes | `0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143` |

The recipe-corpus digest iterates each stored `recipeFiles` path, then hashes its UTF-8 relative path, a NUL byte, exact file bytes, and a trailing NUL byte. The picker audit follows normalization and phrase-first matching in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).

## Proposed identity and picker projection

The proposed object is for root’s review only:

~~~json
{
  "id": "ingredient-ref-chum-salmon",
  "nameFr": "saumon kéta",
  "nameEn": "chum salmon",
  "aliasesFr": [],
  "aliasesEn": ["keta salmon"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-14T00:00:00Z",
  "category": "PROTEIN"
}
~~~

The static projection adds only that proposed display and alias to the current reference/form terms; it does not run the UI or change the live catalog.

| Query | Current result | Projected result | Effect |
|---|---|---|---|
| `chum salmon` | None | Chum salmon / saumon kéta | Species-qualified English phrase resolves to the candidate. |
| `saumon kéta` | None | Chum salmon / saumon kéta | Preferred Québec French phrase resolves to the candidate. |
| `keta salmon` | None | Chum salmon / saumon kéta | Source-backed English alias resolves to the candidate. |
| `salmon`; `saumon` | Generic salmon fillets / filet de saumon | Generic salmon fillets plus Chum salmon / saumon kéta | Broad queries remain multi-result and preserve the generic row. |
| `salmon fillets`; `filet de saumon` | Generic salmon fillets / filet de saumon | Same generic row | The proposed display and alias do not capture the existing recipe-facing phrase. |
| `silverbrite salmon`; `dog salmon` | None | None | No synonym aliases are added. |

## Recipe demand and product-state boundary

All **114** manifest-listed recipe JSON files and **1,123** ingredient rows were scanned for chum/keta wording, *Oncorhynchus keta*, alternate salmon names, and relevant salmon/roe phrases. There are **zero bundled chum/keta text matches and zero candidate ingredient rows**.

Recipe 077 row 10 asks for **675 g salmon fillets without skin, cut into cubes** and links to `ingredient-ref-salmon-fillets-without-skin`. It names no species, brand, origin, or retail label. Keep its line, amount, and reference unchanged; do not link it to the proposed chum-salmon row. Recipe 111’s tuna line and the generic “cooked meat or seafood, to taste” line are unrelated. The bundled corpus supports no recipe link, relink, or chum-specific substitution.

External Canadian and Québec material confirms culinary use but is not bundled recipe demand:

- A Québec recipe for pâtes au saumon uses **one can of Keta salmon** and says fresh skinless salmon fillet (**375 g**) can be used instead. The can size and fresh salmon species are not stated, so this is one recipe-specific alternative, not a conversion or reusable substitution ratio. [S09]
- Gordon Food Service Canada’s saumon aux herbes recipe names 24 skinless Keta salmon fillets for a 24-portion service. Its listed 397 g portion is the finished plate, not the weight of an individual fillet. Do not convert that recipe yield into a per-fillet measure. [S10]

Current Québec product pages show distinct presentations: frozen 170 g wild Keta individual portions through Montréal’s Lufa marketplace; a 200 g previously frozen wild Keta portion and a 418 g canned Keta salmon item on Metro’s online grocery site; and a frozen 500 g Keta salmon roe product from Montréal fishmonger La Mer. Metro marked its selected-store fish and canned items out of stock when checked; those pages support named SKU presentation, not current local inventory. The La Mer product is roe and stays separate from the proposed fish-flesh identity. Canadian seafood supplier Oceanfood Sales currently lists ready-to-eat, hot-smoked and candied Keta salmon strips that are processed and packaged in Canada. [S04–S08]

Do not add a canned, frozen, previously frozen, fillet/portion, smoked, candied, or roe form in this batch. The listings describe distinct seller-specific products and do not establish a single normalized form set or a bundled line that chooses among them. In particular, smoked strips and salmon roe remain separate product boundaries; neither becomes a form alias for generic chum salmon.

## Measures and substitutions

Health Canada’s Canadian Nutrient File supplies taxon-named observations for raw chum salmon (food code 3217) and baked/broiled chum salmon (food code 3158). The raw record lists a half fillet as 198 g and one food-guide serving as 90 g; the baked/broiled record lists 100 mL flaked as 57.5 g, 250 mL as 143.7 g, a half fillet as 154 g, and one food-guide serving as 75 g. Each record also reports 65% total refuse. These are source-code and preparation-specific nutrition observations, not measurements from the recipe bundle or a tested universal ingredient conversion. Keep them out of default density and unit mappings; do not turn refuse into a generic edible-yield factor. [S11–S12]

The retailer package sizes (170 g, 200 g, 418 g, and 500 g for roe) are SKU-specific. Recettes du Québec’s can has no net or drained weight. Do not convert a can, half fillet, fillet count, or package into another state; do not add portion, cup, density, package-yield, or count-to-mass defaults.

No source reviewed establishes a global chum-to-Atlantic/coho/sockeye/pink/Chinook salmon substitution, or a general chum-to-trout, cod, or other finfish substitution. The Québec pasta recipe’s alternative from one can of Keta to 375 g generic fresh salmon is limited to that recipe; it does not provide the can’s drained weight or identify the fresh salmon species. Record no directed form conversion or contextual substitution rule from that note. [S09]

## Recommendation

**Add the species identity only** as `ingredient-ref-chum-salmon`, category `PROTEIN`, with `chum salmon / saumon kéta`, English alias `keta salmon`, no French aliases, null density, and no unit mappings. CFIA and OQLF establish a clean taxon/name pair, current Québec listings and Canadian suppliers show distinct Keta-labelled food products, and the current picker would expand broad salmon queries to multiple useful choices while keeping the existing generic product intact.

Do not map or relabel recipe 077, attach forms, add numeric behavior, or infer substitutions. The older salmon/tuna scope record remains important: if this species identity is integrated, root should update that record’s scope or disposition so it still protects the unqualified recipe without blocking a separately sourced retail identity. Section P remains open.

## Source register

Sources were accessed on 2026-10-14. Source IDs are local to this proposal; the prefix was checked against the live ledger and proposal/batch archive and is not a ledger allocation.

| Source ID | Source and supported evidence | Limit |
|---|---|---|
| `WP04-SECTIONP-CHUM-SALMON-R96-20261014-S01` | CFIA, [Fish List results for Oncorhynchus keta](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Oncorhynchus%20keta). The indexed result for TSN 161976 pairs *O. keta* with Keta Salmon and Chum Salmon / Saumon Kéta; also lists Silverbrite Salmon. | The direct query page was inaccessible to the browser during this review; the indexed result supports Canadian fish-label names and taxon evidence, not recipe-species inference or equivalence. |
| `WP04-SECTIONP-CHUM-SALMON-R96-20261014-S02` | OQLF, [saumon kéta, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198949/saumon-keta). Preferred Québec French term, English chum salmon, *O. keta*, edible-fish domain, and note about commercial potential in Québec; last updated 2012. | Terminology and taxon evidence, not current market availability. OQLF says `saumon chien`, `saumon chum`, and `saumon Qualla` were not retained for fish-product terminology. |
| `WP04-SECTIONP-CHUM-SALMON-R96-20261014-S03` | Fisheries and Oceans Canada, [Chum Salmon species profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/chum-salmon-saumon-keta-eng.html). Identifies the Latin name *Oncorhynchus keta* and Pacific-salmon biology. | Government species profile; does not identify recipe 077 or establish Québec retail stock. |
| `WP04-SECTIONP-CHUM-SALMON-R96-20261014-S04` | Marché des Fermes Lufa, [Organic Ocean Seafood Inc. marketplace listing](https://montreal.lufa.com/en/marketplace/partner/organic-ocean-seafood-inc-487). Lists Wild Keta Salmon as an individual frozen portion, 170 g, in the Montréal marketplace. | Retailer product listing; the SKU weight is not a standard fillet or recipe amount. |
| `WP04-SECTIONP-CHUM-SALMON-R96-20261014-S05` | Metro, [Previously Frozen Wild Keta Salmon](https://www.metro.ca/en/online-grocery/aisles/frozen/fish-seafood/fish-filets-steaks/previously-frozen-wild-keta-salmon/p/244867), 200 g. | Product page showed the item out of stock at the selected store when checked; no taxon printed on the page. |
| `WP04-SECTIONP-CHUM-SALMON-R96-20261014-S06` | Metro, [Selection Keta Salmon](https://www.metro.ca/en/online-grocery/aisles/pantry/canned-jarred/fish-seafood/keta-salmon/p/059749902540), 418 g, canned aisle. | Product page showed the item out of stock at the selected store; SKU net weight is not drained weight or a recipe measure. |
| `WP04-SECTIONP-CHUM-SALMON-R96-20261014-S07` | Poissonnerie La Mer, [Caviar de saumon Keta (Ikura)](https://www.lamer.ca/products/caviar-saumon-keta), Montréal retailer. Page describes wild Canadian product from British Columbia, frozen, sold in a 500 g format. | Roe only; does not establish a flesh form, taxon printed on the page, or universal roe identity. |
| `WP04-SECTIONP-CHUM-SALMON-R96-20261014-S08` | Oceanfood Sales, [Products — keta salmon strips](https://oceanfoods.com/products/). Current page lists ready-to-eat, hot-smoked and candied wild Keta strips, processed and packaged in Canada. | Finished supplier SKU; no universal smoked form, product mass, taxon label, or Québec retail availability. |
| `WP04-SECTIONP-CHUM-SALMON-R96-20261014-S09` | Recettes du Québec, [Pâtes au saumon, câpres et citron](https://www.recettes.qc.ca/recettes/recette/pates-au-saumon-capres-et-citron-211566), 4 portions. Uses one can of Keta salmon; author note offers 375 g fresh skinless salmon as an alternative. | Editorial recipe-specific suggestion; can weight and fresh replacement species are unspecified. Not bundled demand or a reusable substitution ratio. |
| `WP04-SECTIONP-CHUM-SALMON-R96-20261014-S10` | Gordon Food Service Canada, [Saumon aux herbes](https://gfs.ca/fr-ca/idees/recette/saumon-aux-herbes/). Names 24 skinless Keta fillets for a 24-serving foodservice recipe. | Finished 397 g serving includes sides; no weight per fish fillet and no substitution is supplied. |
| `WP04-SECTIONP-CHUM-SALMON-R96-20261014-S11` | Health Canada, [Canadian Nutrient File raw chum salmon, food code 3217](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=3217). Lists half-fillet and food-guide portions and total refuse for the raw food-code entry. | Published raw-food-code portions, not recipe measures or universal mappings; the 65% refuse value is not a generic edible-yield factor. |
| `WP04-SECTIONP-CHUM-SALMON-R96-20261014-S12` | Health Canada, [Canadian Nutrient File baked/broiled chum salmon, food code 3158](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3158). Lists cooked flaked-volume, half-fillet, and food-guide portions and total refuse. | Published baked/broiled-food-code portions, not recipe measures or universal mappings; do not transfer between raw and cooked states or generalize the 65% refuse value. |

## Static review record

- Re-read `AGENTS.md`, `Requirements.md`, the current global catalog plan and roadmap, the R95 integration record, the older salmon/tuna proposal and ledger record, and the nearby salmon-roe boundary review.
- Parsed current reference, form, legacy, ledger, manifest, and recipe JSON. Confirmed the ownership counts and hashes recorded above. Scanned all 114 manifest-listed recipe files and 1,123 ingredient rows for candidate terms and inspected recipe 077’s existing salmon row.
- Reproduced the current normalized phrase-first picker projection with the proposed row in memory. Qualified terms resolve to the candidate, generic salmon searches return two results, and the current salmon-fillets phrase remains on its existing generic owner.
- Checked the proposed reference ID and source-ID prefix against the live catalog, ledger, proposals, and batch archive. No dedicated chum/keta identity or source-prefix allocation was found; the broader salmon species-scope ledger candidate is explicitly disclosed above.
- No app tests, Gradle tasks, or emulator checks were run because the accepted changes only add database JSON data and its generated catalog index under the `AGENTS.md` exception.

## Root integration decision (2026-10-14)

Added identity-only `chum salmon / saumon kéta` for *Oncorhynchus keta* as
`ingredient-ref-chum-salmon`, with `keta salmon` as its only alias. Preserved six CNF portions as
raw- or baked/broiled-code-specific ledger observations; they do not create a density, unit mapping,
form, conversion, or generic edible-yield rule. Added no recipe link or substitution. Recipe 077
remains linked to the generic salmon-fillets identity.

Updated the unresolved `candidate-wp04-salmon-species-scope` decision to clarify that it applies to
species inference for the unqualified recipe line, not to separately sourced species identities.
The candidate remains unresolved for recipe 077. Updated the Section P checklist, global plan, and
roadmap. See the batch README for static validation results.
