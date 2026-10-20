# WP04 Section P — frozen cooked mussel meat product-boundary review (R392)

- **Review date:** 2026-10-17.
- **Recommendation:** Add one identity-only `PROTEIN` reference for **frozen cooked mussel meat / chair de moule cuite surgelée**. Keep the explicitly shell-free bilingual variant as a source-backed alias. Add no forms, quantities, recipe links, conversions, yields, or substitutions.
- **Scope:** The market-named prepared product whose package descriptions say cooked mussel meat and frozen. The identity does not assign a mussel species, supplier, origin, universal shell state, readiness for immediate consumption, preparation instructions, or recipe quantity.
- **Open checklist:** WP04 Section P fish and shellfish products; the parent shellfish and product-state work remains open.
- **Status:** Proposal only. No catalog, ledger, recipe, form, plan, or roadmap data was changed. No software tests, build, emulator, or deployment was run.

## Product evidence and boundary

Current Canadian retailer pages show two independently named bilingual presentations of this prepared product:

- Super C lists **Chair de moule cuite surgelée**, 900 g, product number `710497549028`. Its ingredient panel says `Moule`; the selected store showed the listing out of stock when reviewed. Food Basics lists the same product number and package amount as **Frozen Cooked Mussel Meat**, with ingredient `Mussel`; its selected store also showed it out of stock. The matched product number and weight support the English/French phrase pair, while the retailer pages do not identify a scientific species. [S01–S02]
- Metro lists a 340 g product, number `059749994569`, as **Frozen Cooked Mussel Meat without Shell** in English and **Chair de moule cuite sans coquilles surgelée** in French. The product pages use the same number; the shell-free wording is therefore retained only as an exact product-name variant, not a universal declaration about every SKU in the group. [S03–S04]

MAPAQ's *Les mollusques du Québec* factsheet places the format rows under a blue-mussel heading and a table labelled **CHAIR DE MOULE CUITE**. It lists **Surgelée individuellement — 1 kg** separately from brine, canned, and smoked formats. This is useful Québec producer-format evidence for the French term and the cooked/frozen product boundary. It is publication 09-0018, an older guide now hosted on a current Québec site; it does not establish current production, the species of the listed retail SKUs, a transferable package size, or household recipe measurements. [reused R159 S01]

The CFIA Fish List identifies *Mytilus edulis* with species-qualified names including **Blue Mussel / Moule Bleue**, while other taxa also appear in the list under “Mussel” and, for some rows, “Moule.” Its species/common-name table does not identify the retailer SKUs: the Super C and Food Basics ingredient fields say only `Moule` / `Mussel`, and the Metro page titles give no species. None supplies a binomial or species-qualified name. Keep this prepared-product group species-neutral and separate from `ingredient-ref-blue-mussel`, `ingredient-ref-mediterranean-mussel`, and `ingredient-ref-green-lipped-mussel`; do not infer a taxon from the MAPAQ blue-mussel guide or from a generic retailer ingredient declaration. The CFIA source is used for species distinction, not for a regulatory conclusion about these listings. [reused R133 S01]

This is a named product group, not a general `frozen`, `cooked`, or shell-removal form on any mussel species. Keep it separate from smoked mussels, mussels in brine, canned mussels in escabeche, Sardo's herb-and-garlic marinated listing, dried mussels, and cooked mussel meat mentioned as one component of Metro's frozen seafood medley. It does not resolve the ledger-only unqualified `ingredient-ref-mussel` candidate.

## Ownership, archive, and source audit

The live snapshot inspected for this proposal contains **1,701 active references**, **141 forms**, **56 legacy candidates**, and **2,057 research-ledger records**. The ledger has **9,272 source entries**, **7,846 distinct source IDs**, and **6,568 distinct URLs**.

Normalized exact-key checks across active reference IDs/names/aliases, form IDs/labels/match terms, legacy candidate IDs/names/aliases, and ledger record IDs found no owner for:

- `frozen cooked mussel meat`, `frozen cooked mussel meat without shell`, or `cooked mussel meat`;
- `chair de moule cuite surgelée` or `chair de moule cuite sans coquilles surgelée`;
- proposed reference ID `ingredient-ref-frozen-cooked-mussel-meat`.

The live catalogue has named mussel species and separate smoked, brine, and escabeche product references, but no mussel form. The legacy file has no exact candidate for this frozen cooked product. The ledger has no product record or exact phrase for it; it retains the broader unresolved `ingredient-ref-mussel` candidate. No exact-key owner for the proposed phrases or reference ID was found in the plan, proposal archive, or batch archive. The four retailer product URLs below are absent from the ledger and proposal/batch archive. Reuse the existing MAPAQ and CFIA source IDs shown below rather than creating another ID for either URL.

The nearby archive decisions remain distinct: R159 covers smoked mussels; R194 covers canned mussels in escabeche; R197 covers mussels in brine; R46 holds a Sardo herb-and-garlic marinated product; R207 holds general dried mussels; and R67 holds a generic seafood medley. R159 and R197 already cite the MAPAQ factsheet, and R67 mentions cooked mussel meat inside one mixed product, but none allocates or decides the standalone frozen cooked mussel-meat product boundary. The immediate R383 milt review and R387 surimi-stick review cover other Section P candidates. The Section P plan retains its open shellfish/product-state parent and does not list this frozen cooked product as a decided identity.

| Existing owner or review | Current scope and separation |
|---|---|
| `ingredient-ref-blue-mussel` | Species-scoped *Mytilus edulis* reference. Do not attach the retailer product to this species. |
| `ingredient-ref-mediterranean-mussel`, `ingredient-ref-green-lipped-mussel` | Species-scoped references; no frozen cooked meat form is attached. |
| `ingredient-ref-smoked-mussels`, `ingredient-ref-mussels-in-brine`, `ingredient-ref-mussels-in-escabeche` | Separate market product groups; none is an alias or form for this candidate. |
| `ingredient-ref-mussel` | Ledger-only, unresolved scope for an unqualified mussel request. Leave unchanged. |
| R159, R194, R197, R46, R207, R67 | Neighboring product decisions as described above. None is a standalone frozen cooked mussel-meat decision. |
| Forms and legacy candidates | No mussel form or exact legacy product candidate was found. |

## Picker projection

The static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): case/accent/punctuation normalization, complete word-phrase matching first, and substring fallback only when no complete phrase matches. The proposed row has two display names and only the two longer shell-free product-name variants as aliases.

| Query | Before | If accepted |
|---|---|---|
| `frozen cooked mussel meat`; `chair de moule cuite surgelée` | No result | New product reference |
| `frozen cooked mussel meat without shell`; `chair de moule cuite sans coquilles surgelée` | No result | New product reference via source-backed alias |
| `cooked mussel meat`; `mussel meat`; `chair de moule`; `moule cuite` | No result | New product reference |
| `mussel`; `moule` | Three species-scoped results | The same three plus the prepared product; the broad singular query remains multi-result |
| `mussels`; `moules` | Five current species/product results | Unchanged; no unsupported plural alias is added |
| `frozen`; `cooked`; `surgelée` | 8; 9; 1 result(s) | 9; 10; 2 result(s), respectively |
| `mussels in brine`; `moules en saumure`; `smoked mussels`; `moules fumées`; escabeche phrases | Existing corresponding prepared-product results | Unchanged |
| `frozen mussels` | No result | No result; that broad wording is not a source-backed product name |

Do not add `mussels`, `moules`, `frozen mussels`, `moules congelées`, `blue mussel`, or a species name as an alias. The listing evidence supports the specific cooked-meat phrases above, not a universal mussel identity or an unqualified frozen-mussel form.

## Bundled recipe demand and use limits

The manifest-ordered audit read all **114 recipe files** and **1,123 structured ingredient rows**. Complete recipe JSON and ingredient-row text were checked for the exact English/French product phrases above and for mussel/moule ingredient requests. It found **zero matching product phrases and zero mussel/moule ingredient rows**. No recipe link or substitution use case is supported. Any French `moule(s)` in non-ingredient recipe text is not counted as a seafood request.

The retailer pages show only package-specific masses: 340 g and 900 g. MAPAQ's 1 kg value is an older producer-format entry for individually frozen cooked blue-mussel meat. None is a household measure, serving, drained quantity, edible-yield factor, or recipe conversion. No count, density, thawed yield, or cooked-to-frozen conversion is supplied. Keep `defaultDensity: null` and `unitMappings: []`; add no `IngredientForm`, recipe-line mapping, global/contextual substitution, or recipe substitution link. Cooked/frozen in a product title does not establish ready-to-eat status, cooking instructions, or safe interchangeability with fresh, brined, smoked, canned, or species-specific mussels.

## Proposed mapping if accepted

Add one identity-only `PROTEIN` entry:

```json
{
  "id": "ingredient-ref-frozen-cooked-mussel-meat",
  "nameEn": "frozen cooked mussel meat",
  "nameFr": "chair de moule cuite surgelée",
  "aliasesEn": ["frozen cooked mussel meat without shell"],
  "aliasesFr": ["chair de moule cuite sans coquilles surgelée"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-17T00:00:00Z",
  "category": "PROTEIN"
}
```

If integrated, use a ledger record with `recordType: ingredient_reference`, `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Link only the four new product-page source IDs and the two explicitly reused sources below. Keep measurement observations and substitution findings empty. Do not create a legacy mapping, form, package-yield conversion, density, recipe link, or species association.

## Source register

The four retail pages were checked on 2026-10-17. Retail availability is location-sensitive; page presence and naming are not claims that a selected-store item was in stock. Each new source ID resolves to one exact URL and uses the required R392 prefix.

| Source ID | Source and locator | Evidence and limit |
|---|---|---|
| **WP04-SECTION-P-FROZEN-COOKED-MUSSEL-MEAT-R392-20261017-S01** | Super C, [Chair de moule cuite surgelée](https://www.superc.ca/allees/produits-surgeles/poissons-et-fruits-de-mer/crevettes-et-fruits-de-mer/chair-de-moule-cuite-surgelee/p/710497549028), product number `710497549028`, title, package weight, and ingredient panel. | Current Québec retailer page names the 900 g product in French and lists `Moule`; the selected store marked it out of stock. It provides no scientific species or edible/drained-yield statement. |
| **WP04-SECTION-P-FROZEN-COOKED-MUSSEL-MEAT-R392-20261017-S02** | Food Basics, [Frozen Cooked Mussel Meat](https://www.foodbasics.ca/aisles/frozen/fish-seafood/shrimp-seafood/frozen-cooked-mussel-meat/p/710497549028), product number `710497549028`, title, package weight, and ingredient panel. | Current Canadian retailer page names the 900 g product in English and lists `Mussel`; it is the same product number as S01 and was marked out of stock at the selected store. It gives no scientific species, edible/drained-yield statement, or consumer French wording. |
| **WP04-SECTION-P-FROZEN-COOKED-MUSSEL-MEAT-R392-20261017-S03** | Metro, [Frozen Cooked Mussel Meat without Shell](https://www.metro.ca/en/online-grocery/aisles/frozen/fish-seafood/shrimp-seafood/frozen-cooked-mussel-meat-without-shell/p/059749994569), product number `059749994569`, title and package weight. | Current Canadian retailer page names the 340 g product and supports the longer English title as a product-name variant. It does not identify the species; package details can change and should be checked on the actual label. |
| **WP04-SECTION-P-FROZEN-COOKED-MUSSEL-MEAT-R392-20261017-S04** | Metro, [Chair de moule cuite sans coquilles surgelée](https://www.metro.ca/epicerie-en-ligne/allees/produits-surgeles/poissons-et-fruits-de-mer/crevettes-et-fruits-de-mer/chair-de-moule-cuite-sans-coquilles-surgelee/p/059749994569), product number `059749994569`, title and package weight. | Paired with the same number and 340 g as S03, supporting the Québec French product-name variant. It does not identify the species or establish a general product measure. |
| **Reused `WP04-SECTIONP-MEDITERRANEAN-MUSSEL-R133-20261015-S01`** | CFIA, [Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), current results for mussel rows. | The official species/common-name table includes species-qualified entries and reuses `Mussel` / `Moule` across multiple taxa. This is why the prepared retail product is not assigned to a species. It is common-name evidence, not a package declaration or a regulatory finding about these retail listings. |
| **Reused `WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S01`** | MAPAQ, [Les mollusques du Québec](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/peche/FI_mollusques-quebec_MAPAQ.pdf), publication 09-0018, blue-mussel factsheet, page 1, `CHAIR DE MOULE CUITE` format table. | Lists `Surgelée individuellement — 1 kg` under cooked blue-mussel meat. This is older Québec producer-format evidence; it does not prove current production, current retail stock, retail SKU species, or a reusable measure. |

**Disposition:** Recommend one identity-only reference for `frozen cooked mussel meat / chair de moule cuite surgelée`, with only the two exact shell-free product-name variants as aliases. Preserve species-scoped mussel identities and the brine, smoked, escabeche, dried, and held generic-mussel decisions. Add no forms, measurements, recipe links, conversions, yields, or substitutions.
