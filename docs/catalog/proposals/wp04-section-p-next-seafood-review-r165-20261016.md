# WP04 Section P — kippered sardine product-boundary review (R165)

- **Reviewed / source-access date:** 2026-10-16.
- **Candidate:** Brunswick `Kippered Sardine Fillets` / Québec retail `Filets de sardines kipper` (product 066613172039).
- **Recommendation:** **Hold** the product outside active references, forms, legacy mappings, and the research ledger. Do not add `kipper` or `kippered` to a sardine or herring identity.
- **Scope:** One named preserved-sardine product boundary. This review does not reopen the R154 hold on herring kippers, the two accepted sardine species, generic preserved-fish policy, or the R164 Finnan-haddie / `gades fumés` hold and accepted smoked-haddock identity.
- **Status:** Proposal-only. No shared catalog JSON, ledger, legacy identities, manifest, recipe, plan, roadmap, batch README, generated file, or code was changed. No app, unit, instrumentation, emulator, deployment, or build tests were run.
- **Proposal-local source IDs:** `WP04-SECTIONP-KIPPERED-SARDINE-R165-20261016-S01` through `S03`, plus audit ID `WP04-SECTIONP-KIPPERED-SARDINE-R165-20261016-R01`. These IDs are local to this proposal and are not shared-ledger allocations.

## Why this is a distinct open product boundary

The open [Section P preservation checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L5860) calls for review of smoked, salt-cured, dried, canned, oil-packed, water-packed, and fermented fish products. The [sardine identity review](wp04-sardine-fish-identity-boundary-review-20261011.md) accepted only species-qualified European pilchard and Pacific sardine references and explicitly kept prepared sardine products open. R154 resolved a different question: it held herring kipper / `hareng kipper` and cited Brunswick's sardine product only to show that “Kippered” is also used outside the OQLF-defined herring product. R154 did not decide whether this SKU merits a separate product identity. The R164 [Finnan-haddie review](wp04-section-p-finnan-haddie-naming-picker-boundary-review-r164-20261016.md) concerns a separate haddock/gadid name boundary and is unchanged here.

## Current product and terminology evidence

Brunswick's current manufacturer page titles the product **Sardine Fillets Seafood Snacks – Kippered**, describes a lighter smoke flavour, and lists sardine fillets, water, and natural smoke flavouring. It gives a nutrition basis of **one can drained (85 g)**. The page does not give a scientific species, identify a smoking process, or provide a Québec French name. [Reused `WP04-SECTIONP-KIPPER-R154-20261015-S04`]

Super C's current Québec French product listing for the matching product number calls it **Filets de sardines kipper**, shows an 85 g listing, and provides an ingredient statement of sardine fillets, water, salt, natural smoke flavour, and sodium phosphate. The retailer warns that product information can change. This supports a current local bilingual-market phrase and product listing, but does not establish a taxon or manufacturing method. [S01]

OQLF's GDT entry, last updated in 1983, defines **kipper** as a cold-smoked product made from fatty herring split along the back from head to tail. It lists `kipper`, `hareng kipper`, and `kipper de Newcastle` as preferred Québec French terms; its English terms include `kipper` and `kippered herring`. It also notes that U.S. `kippered` can refer to hot-smoked fish. This is terminology evidence, not a specification for Brunswick's sardine-labelled product. [Reused `WP04-SECTIONP-KIPPER-R154-20261015-S01`]

One current Save-On Foods retailer listing uses the English product title `Sardine Fillets Kippered` but reports `HERRING FILLETS` in the ingredients and gives a 100 g size under the same item number. Its page could not be directly retrieved during this review; the search-indexed retailer text is used only to flag conflicting retailer metadata, not to identify the fish or override the manufacturer and Québec listing. [S03]

CFIA's current Fish List and common-name guidance connect acceptable English/French fish names to individual taxa. Its sardine query contains several taxa under `Sardine`, including taxa already represented by the qualified European-pilchard and Pacific-sardine rows. The Brunswick product page does not provide a binomial, and the Save-On metadata disagrees with the manufacturer's sardine ingredient wording. No reviewed evidence resolves whether this exact SKU is a species-specific sardine product, a herring product, or a retailer-data mismatch. [Reused `WP04-SARDINE-FISH-BOUNDARY-20261011-S02` and `WP04-SARDINE-FISH-BOUNDARY-20261011-S07`]

The source evidence establishes a named Brunswick finished product and a Québec retailer phrase, but only for one SKU. It does not establish a general product class called `kippered sardines`, a Québec-preferred translation of the manufacturer name, or equivalence with the OQLF-defined herring kipper. Do not make `kipper` or `kippered` a species or product alias on either herring or sardine rows.

## Exact ownership and source-ID audit

The current read-only snapshot has **1,540 ingredient references**, **119 forms**, **61 legacy candidates**, and **1,885 ledger records / 8,032 source entries / 6,873 distinct source IDs / 5,671 distinct URLs**. The manifest lists **114 recipes / 1,123 ingredient rows**. Counts reflect the files read for this proposal.

Exact normalized-key checks covered bilingual active-reference names and aliases, form labels and match terms, legacy candidate IDs/names/aliases, and ledger record IDs. The candidate source-ID prefix and retail product number were also checked against the ledger and focused archive.

| Key or neighboring owner | Current ownership | Disposition |
|---|---|---|
| `Kippered Sardine Fillets`; `kippered sardine`; `kippered sardine fillets`; `filets de sardines kipper`; `filets de sardines kippered`; `066613172039` | No exact active reference, form, legacy candidate, or ledger record owner. | The manufacturer and retailer phrases remain source-specific; do not allocate an identity or map the UPC to a species. |
| `kipper`; `kippered`; `kippered herring`; `hareng kipper` | No exact active reference, form, legacy candidate, or ledger record owner. R154 holds herring kipper as a separate candidate outside the active catalog and ledger. | Preserve the R154 hold; do not treat the Brunswick sardine wording as resolving it. |
| `ingredient-ref-kippered-sardine-fillets`; `ingredient-ref-kippered-sardine`; `candidate-kippered-sardine` | No matching active, legacy, or ledger ID. | No ID is allocated or reserved under this hold. |
| `ingredient-ref-european-pilchard`; `ingredient-ref-pacific-sardine` | Active species rows with qualified bilingual displays and qualified aliases only. | Keep both rows unchanged; neither currently owns the product phrase or an unqualified preserved-sardine state. |
| `ingredient-ref-atlantic-herring`; `ingredient-ref-pacific-herring` | Active species rows with qualified bilingual displays and no aliases. | Keep both rows unchanged; neither currently owns the product phrase or a kipper form. |

The proposal-local prefix `WP04-SECTIONP-KIPPERED-SARDINE-R165-20261016` has no exact collision in the ledger or proposal/batch archive. The Super C, Walmart, and Save-On listing URLs below have no exact ledger/archive owner. Brunswick's manufacturer URL and OQLF's kipper URL are reused from R154 S04 and S01; CFIA Fish List and naming-guidance sources are reused from the sardine identity review. These reused IDs remain attached to their existing proposal/ledger context; this hold adds no shared source entry.

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalize case, accents, and punctuation, prefer complete word phrases across bilingual reference names and aliases, and use substring fallback only when no phrase matches. A hypothetical row is shown only to measure impact; it is not proposed data. Its display uses the current product wording `Kippered sardine fillets / filets de sardines kipper`, with no aliases or forms.

| Query | Current results | With hypothetical row | Consequence |
|---|---|---|---|
| `kipper`; `kippered`; `filets de sardines kipper` | None | Hypothetical product only | The current local French retailer wording would make broad `kipper` and English `kippered` searches resolve to a sardine-labelled product despite the separate OQLF herring definition and unresolved R154 hold. |
| `sardine`; `sardines` | European pilchard; Pacific sardine | Same two plus hypothetical product | Adds one SKU-specific prepared product to broad sardine searches without a product-wide or species crosswalk. |
| `herring`; `hareng` | Atlantic herring; Pacific herring | Same two | The hypothetical display does not resolve the retailer's conflicting herring ingredient metadata. |
| `smoked`; `fumé` | Existing results only | Unchanged | Do not add smoke-flavour wording as an alias or claim a smoked form; the manufacturer identifies natural smoke flavouring, not a smoking process. |

Under the recommended hold, the current picker projection remains unchanged: `kipper` and `kippered` return no result, `sardine` / `sardines` return the two qualified species rows, and `herring` / `hareng` return the two qualified herring rows. Do not solve the product-name overlap by adding a bare `kipper` or `sardine` alias.

## Bundled-recipe demand

The manifest-ordered audit parsed all **114 recipe files** and **1,123 ingredient rows**, and scanned the complete recipe JSON plus ingredient rows for `kipper`, `kippered`, `sardine`, `sardines`, `herring`, `hareng`, the matching product number, and the listed English/French product phrases. **There were zero matching recipe files and zero matching ingredient rows.** No recipe link, recipe-specific amount, preparation role, or product choice supports integrating this SKU. [R01]

## Forms, measures, density, conversions, yields, and substitutions

- **Forms:** The active 119-form catalog has no attached form for either sardine species or either herring species, and no exact kippered-sardine form. Add none. The sources do not establish a general smoked, canned, kippered, drained, or filleted form across the species rows.
- **Measurements and densities:** Brunswick's 85 g drained-can nutrition basis and Super C's 85 g item listing are SKU-specific source statements with different stated bases; do not equate them, turn them into a recipe measure, or generalize them. No count, volume, density, unit mapping, package-to-drained conversion, or edible-yield rule is supported. The relevant active sardine/herring references have null `defaultDensity` and empty `unitMappings`. Pacific herring's existing CNF observations are raw-fish source-specific portions and do not transfer to this product.
- **Conversions and yields:** No kippered-sardine conversion or package yield is supported. Do not infer raw-to-kippered, smoke, drained, canned, or edible yields from the package or nutrition basis.
- **Substitutions:** No global or contextual substitution is supported between this product, herring kippers, Atlantic/Pacific herring, European pilchard, Pacific sardine, smoked sardines, or another fish. The recipe corpus contains no relevant dish or quantity context. Add no rule, warning, or recipe-line substitution link.

## Proposed delta

**No catalog or shared-ledger delta is proposed.** Do not create a `Kippered Sardine Fillets` reference or a legacy mapping, attach `kipper` / `kippered` to any existing row, add a universal smoke/canning form, register the product number as an identity, or add measurements, conversions, yields, recipe links, or substitutions. The R165 source IDs above are proposal-local provenance only. Reopen if a bundled recipe or explicit product request selects this SKU or a wider product family and a current package/producer source resolves the species and the meaning of the French `kipper` wording.

## Source register

Online sources were accessed on 2026-10-16 unless noted. Reused sources are not reallocated; R165 source IDs remain local to this proposal.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **Reused `WP04-SECTIONP-KIPPER-R154-20261015-S04`** | Brunswick Canada, [Sardine Fillets Seafood Snacks – Kippered](https://brunswickcanada.ca/products/sardine-fillets-seafood-snacks-kippered/). | Current manufacturer product title, lighter-smoke flavour claim, ingredient declaration, and one-can-drained 85 g nutrition basis. It gives no species binomial or smoking process. The page was already cited in R154 as evidence that `Kippered` is used on a sardine-labelled product. |
| **WP04-SECTIONP-KIPPERED-SARDINE-R165-20261016-S01** | Super C, [Filets de sardines kipper, Bouchées de la Mer Brunswick](https://www.superc.ca/allees/garde-manger/aliments-en-conserve-et-en-pot/poissons-et-fruits-de-mer/filets-de-sardines-kipper/p/066613172039), product 066613172039. | Current Québec French retailer title and 85 g listing; ingredient text says sardine fillets, water, salt, natural smoke flavour, and sodium phosphate. A retailer product entry, not a species determination or manufacturer process specification. |
| **WP04-SECTIONP-KIPPERED-SARDINE-R165-20261016-S02** | Walmart Canada, [Filets de sardines Brunswick kipper](https://www.walmart.ca/fr/ip/Filets-de-sardines-Brunswick-kipper/10187320). | Current French-language retail listing under the Brunswick product name; page displays a 100 g product size and sardine-ingredient text. Walmart notes that suppliers provide product information that it does not separately verify. Do not reconcile the package-size listing with Brunswick's drained nutrition basis. |
| **WP04-SECTIONP-KIPPERED-SARDINE-R165-20261016-S03** | Save-On Foods, [Brunswick Sardine Fillets Kippered](https://www.saveonfoods.com/sm/pickup/rsid/983/product/brunswick-sardine-fillets-kippered-id-00066613172039), item identifier `00066613172039`. | Current search-indexed retailer text gives a 100 g listing under the sardine product title but an ingredient line beginning `HERRING FILLETS`. Direct retrieval returned a cache miss. Use only as a data-conflict signal; it is not a species authority or sufficient to override the manufacturer source. |
| **Reused `WP04-SECTIONP-KIPPER-R154-20261015-S01`** | OQLF, [GDT: kipper](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8428368/kipper), last updated 1983. | Defines the Québec product as fatty split herring that is cold-smoked; lists the preferred French and English terms. Does not define Brunswick's sardine product. |
| **Reused `WP04-SARDINE-FISH-BOUNDARY-20261011-S02`** | CFIA, [Fish List](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list); sardine query results. | Lists acceptable Canadian fish common names against taxa and shows the broader taxonomic scope of `Sardine`. It does not identify the Brunswick SKU. |
| **Reused `WP04-SARDINE-FISH-BOUNDARY-20261011-S07`** | CFIA, [Guidance on determining the common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names). | Explains species-specific common-name scope in the Canadian Fish List; does not decide this product's identity. |
| **Reused `WP04-SARDINE-FISH-BOUNDARY-20261011-S09`** | CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish). | General guidance on fish-product common names and relevant condition/form descriptors. It does not define kippered sardines. |
| **WP04-SECTIONP-KIPPERED-SARDINE-R165-20261016-R01** | [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L5860), R154 kipper proposal/integration, sardine identity proposal, R164 Finnan-haddie proposal/integration, active references/forms, legacy candidates, research ledger, manifest-listed recipes, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Read-only exact-key, source-ID/URL, picker, forms/numeric/substitution, archive, and corpus audit at the counts stated above. Snapshot only. |

## Final disposition

**Hold** the Brunswick kippered-sardine product outside active references, forms, legacy mappings, and the research ledger. Its current maker and Québec retailer use sardine wording, while the term `kipper` has a narrower Québec herring-product definition and one current retailer feed conflicts on the fish ingredient. The bundled corpus has no matching demand, and no species/process crosswalk or reusable quantity is available. Keep the accepted species rows, R154 herring-kipper hold, and R164 Finnan-haddie hold unchanged. No tests were run for this proposal-only audit.
