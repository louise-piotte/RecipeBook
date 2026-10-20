# WP04 Section P — escolar / oilfish naming boundary (round 64)

- **Review and source-access date:** 2026-10-13.
- **Packet type:** Proposal-only fish identity, Canadian/Québec naming, market, picker, ownership, recipe-demand, and field-limit review.
- **Candidate:** Escolar, oilfish, and rouvet names across *Lepidocybium flavobrunneum*, *Ruvettus pretiosus*, and *Thyrsites atun*.
- **Disposition:** **Hold all candidate rows outside active references and the research ledger.** The Canadian Fish List assigns `Escolar / Escolier` to three fish taxa, while Health Canada's consumer page names two. The local frozen product listing uses both `Oil Fish` and `Escolar` without a binomial, and OQLF reserves preferred `rouvet` for *R. pretiosus* while listing `escolar` as a term used in some contexts. A species row would make a broader common query return one taxon; a generic row would require a product-group and French-display decision not established by the local listing. The bundle has no matching demand.
- **Status:** Root reviewed; all candidate rows remain held outside active references and the research ledger. See [`wp04-section-p-escolar-oilfish-boundary-hold-integration-20261013`](../batches/wp04-section-p-escolar-oilfish-boundary-hold-integration-20261013/README.md).
- **Worktree scope:** this proposal file only. No shared catalog JSON, ledger, or recipe was changed.

## Why this is a distinct open gap

The open Section P vernacular-fish checklist asks for names to be resolved against identity evidence instead of treating different species as synonyms. A full exact-name scan of that checklist, the proposal and batch archives, active references, forms, legacy candidates, and ledger found no prior focused escolar / escolier / oilfish / rouvet review or allocation. The separate eulachon market-scope hold remains in force; this packet does not reopen it.

The candidate matters because an online Montréal-area wholesale catalogue names a frozen fillet `Oil Fish Fillet, Escolar`, but gives no scientific name. Health Canada says escolar is a common name for two species and warns that species identification matters. The CFIA Fish List includes a third species under `Escolar`, and OQLF's French `rouvet` record is specific to *Ruvettus pretiosus*. These sources support a real fish product and several bounded names; they do not establish one species or one approved catalog scope for the local SKU.

## Canadian and Québec naming boundary

CFIA lists these entries under the Gempylidae family:

| Species | CFIA English / French common-name pair(s) | Boundary |
|---|---|---|
| *Lepidocybium flavobrunneum* | `Escolar / Escolier Noir`; `Snake Mackerel` with no French name | Species-specific CFIA label data. Do not use the broader `Escolar` or `Snake Mackerel` wording as a species-exclusive alias. |
| *Ruvettus pretiosus* | `Escolar / Escolier`; `Oilfish / Rouvet`; `Snake Mackerel` with no French name | CFIA and OQLF support the species-qualified `rouvet` / `oilfish` pair. Health Canada still describes `escolar` as a name shared across species. |
| *Thyrsites atun* | `Escolar / Escolier`; `Snake Mackerel` with no French name | A third CFIA-listed species under `Escolar`; the local supplier listing does not identify it or either of the other taxa. |

The CFIA Fish List is the Canadian source for common names used in fish labelling, with each name attached to a scientific taxon. Its result rows make `Escolar / Escolier` a multi-species name, not a one-species synonym. [S01–S02]

Health Canada's English consumer page explicitly says `escolar` is the common name for *R. pretiosus* and *L. flavobrunneum*. Its French counterpart uses `escolier` for the food and names the same two taxa. Both pages say escolar may legally be imported and is commonly sold frozen or served in restaurants; both warn that some people may experience short-lived gastrointestinal effects from indigestible wax esters and advise consumers to confirm the fish species with the seller when uncertain. The current CFIA list's additional *T. atun* row means the Health Canada consumer description is not a complete inventory of all CFIA uses of the label. Do not use either page to infer that an unlabelled SKU is one particular species. [S03–S04]

OQLF's preferred Québec term `rouvet` is scoped to *R. pretiosus*. Its record lists English `oilfish` and records `escolar` only as a term used in some contexts. It does not establish `rouvet` as a French name for *L. flavobrunneum*, *T. atun*, or an all-species escolar product group. [S05]

A Canadian government fish-name reference from 1978 also records `oilfish` among names for eulachon (*Thaleichthys pacificus*). This is historical synonym evidence, not a current Canadian retail label. It is another reason to keep `oilfish` from becoming an unqualified route to a single active species while the related eulachon candidate remains unallocated. [S08]

## Québec-facing market evidence

Ozawa Canada's online frozen-seafood catalogue lists **Oil Fish Fillet, Escolar** (item FS-1420ACA). Its product page describes a case-only frozen-seafood item; the page provides no binomial, harvest lot, French product label, or specification tying the product to *L. flavobrunneum*, *R. pretiosus*, or *T. atun*. Ozawa lists a Montréal-area office in Lachine, so this is Québec-facing wholesale-catalogue evidence, not proof of a specific consumer SKU or retail stock. [S06–S07]

The vendor product page's 13.6 kg case specification is not a kitchen portion or a species-matched ingredient observation. Health Canada's general advice about small first-time portions and its 150 g average adult finfish-meal figure are consumer guidance, not escolar-specific recipe measurements. Do not add a default portion, count conversion, density, unit mapping, or package yield. [S03–S04, S06–S07]

## Exact ownership and archive audit

The exact-key audit followed [`normalizeIngredientSearchKey`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase/NFKD, fold `œ`, `æ`, `ß`, and `&`, remove combining marks, normalize punctuation, and collapse spaces. It checked reference IDs and bilingual displays/aliases; form IDs, labels, and match terms; legacy candidate IDs and names; ledger record IDs and source/decision text; and focused Section P plan/proposal/batch text.

At review time the package contained **1,388 active references, 100 forms, 63 legacy candidates, and 1,721 ledger records** (6,767 source entries, 5,682 distinct source IDs). The recipe manifest lists 114 files.

| Candidate key or neighbor | Current owner | Boundary |
|---|---|---|
| `escolar`; `escolier`; `escolier noir` | None in active references, forms, legacy candidates, or ledger. | CFIA/Health Canada assign the broad label across multiple taxa; do not allocate it to one species. |
| `oilfish`; `oil fish` | None in active references, forms, or legacy candidates. No exact `oilfish` owner appears in the ledger. | OQLF/CFIA attach `oilfish / rouvet` to *R. pretiosus*; the 1978 Canadian common-name source also uses `oilfish` for eulachon. Do not add the term as an alias to either fish. |
| `rouvet`; *Ruvettus pretiosus* | None in active references, forms, legacy candidates, or ledger. | OQLF's preferred term is species-scoped to *R. pretiosus*, but the paired English display `oilfish` has the documented broader-name issue. |
| `Lepidocybium flavobrunneum`; *Thyrsites atun*; `snake mackerel` | None in active references, forms, legacy candidates, or ledger. | Distinct CFIA taxa share the Escolar and Snake Mackerel name families. Do not create one species row from the market listing. |
| `ingredient-ref-escolar`; `ingredient-ref-oilfish`; `ingredient-ref-rouvet` | None in active references, forms, legacy candidates, or ledger. | Conditional IDs only; do not reserve them while the hold stands. |

The only ledger phrase hit for the spaced words `oil fish` is an FAO sardine source describing oil as one preservation method. It is not a fish identity, a display, or an alias owner. No exact source ID under the proposal-local prefix `WP04-SECTIONP-ESCOLAR-BOUNDARY-20261013-R64-` exists in the ledger or proposal/batch archive.

## Phrase-first picker projection

The current picker matches complete phrases in bilingual display names, aliases, and attached-form terms before substring fallback. A hypothetical species-specific row would still make its broad name phrase the only result while the other CFIA-listed species remain outside the catalog.

| Query | Current picker | With a hypothetical species row | Boundary |
|---|---|---|---|
| `escolar`; `escolier` | No result | One result if only one of the candidate species is added | CFIA assigns `Escolar` to three taxa; Health Canada assigns the common term to two. A singleton would hide that scope. |
| `escolier noir` | No result | One result for a hypothetical *L. flavobrunneum* row | CFIA uses the qualified French phrase for this taxon, but Health Canada's French page treats the wider escolier name family across two species. A species-only row must not own broad `escolier`. |
| `oilfish`; `rouvet` | No result | One result for a hypothetical *R. pretiosus* row | `rouvet` is OQLF-preferred for *R. pretiosus*; `oilfish` also has the historical eulachon naming overlap. |
| `snake mackerel` | No result | One result if only one species row is present | CFIA lists this English label for all three candidate taxa, with no French label. Do not alias it to one row. |
| `Ruvettus pretiosus`; `Lepidocybium flavobrunneum`; `Thyrsites atun` | No result | No result with the recommended name-only fields | Scientific names are audit evidence, not proposed aliases. |

A deliberately grouped Escolar market reference might eventually represent the broader product class, but the local vendor's listing does not show which species it contains or give a consumer-facing French label. The currently supported evidence does not justify creating a generic group row or linking the SKU to a species row. Keep all candidate IDs unallocated until a recipe or a species-identified package defines the intended scope.

## Complete bundled-recipe demand audit

All **114 manifest-listed recipe files**, all **1,123 ingredient rows**, and full recipe JSON text were scanned for `escolar`, `escolier`, `escolier noir`, `oilfish`, `oil fish`, `rouvet`, `snake mackerel`, `Ruvettus pretiosus`, *Lepidocybium flavobrunneum*, *Thyrsites atun*, `white tuna`, `butterfish`, `walu`, `gemfish`, and `rudderfish`. The scan found **zero ingredient-row hits and zero full-file hits**. No recipe names the product, one of its taxa, a cut, or a preparation state; no recipe link or relink is supported.

## Supported fields and limits

| Field | Finding |
|---|---|
| Canadian species names | Supported as CFIA label-name pairs for each of the three listed taxa; these remain species-scoped evidence, not aliases for a shared row. |
| Québec French names | `rouvet` is OQLF-preferred for *R. pretiosus*. Health Canada uses `escolier` for the broader consumer term. No reviewed Québec consumer package identifies a species and supplies a matching French fish label. |
| Category | `PROTEIN` would be appropriate only if a later, well-scoped identity is accepted. No category is added under this hold. |
| Aliases | None. In particular, do not add `escolar`, `escolier`, `escolier noir`, `oilfish`, `oil fish`, `snake mackerel`, `white tuna`, `butterfish`, `walu`, `gemfish`, or `rudderfish` to a single species row. |
| Forms | None. The wholesaler's frozen-filleted SKU does not identify the species; Health Canada's general frozen-market note is not a species-specific form observation. |
| Default density and unit mappings | No supported value; no data added. |
| Measures, conversions, yields, package data | No recipe measure or transferable product observation. Case weights and general health advice remain source-specific. |
| Recipe links | None; the full corpus has no matching demand. |
| Substitutions | None. No source or recipe establishes a directed substitution between the three species, eulachon, tuna, or other finfish. |

## Recommendation and revisit condition

Keep the escolar/oilfish naming family outside active references and the ledger. Do not add a single-species `ingredient-ref-escolar`, `ingredient-ref-oilfish`, or `ingredient-ref-rouvet` row, and do not add an unqualified `candidate-escolar` record. Preserve the existing eulachon hold and all neighboring fish identities.

Revisit only when a bundled recipe or a current Québec package supplies a concrete target. If it names a species, verify the binomial and use only that species' CFIA and OQLF-supported names. If it names a species-neutral Escolar product, first establish whether the intended catalog entity is a broader market class and obtain a current Québec French label that supports that scope. Do not infer a species from the Montréal wholesaler's combined `Oil Fish / Escolar` title or from the vendor's case weight.

No tests or emulator checks were run because this is a proposal-only documentation review with no app or database changes.

## Root integration outcome

Confirmed the hold. CFIA and Health Canada attach the broad `Escolar / Escolier` names to multiple taxa, while OQLF's preferred `rouvet / oilfish` identity is scoped to *Ruvettus pretiosus*. The current Québec-facing wholesale listing does not supply a binomial or French label, and the bundle contains no recipe demand. No active reference, ledger candidate, alias, form, measure, recipe link, conversion, yield, or substitution was added. Section P remains open.

## Sources

Sources were accessed on 2026-10-13. Proposal-local source IDs are not ledger allocations.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-ESCOLAR-BOUNDARY-20261013-R64-S01** | CFIA, [Fish List query for Escolar](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Escolar) | Current result rows attach `Escolar` to *L. flavobrunneum*, *R. pretiosus*, and *T. atun*. The first has French `Escolier Noir`; the latter two have `Escolier`. Canadian fish-label names, not evidence that these species are interchangeable. |
| **WP04-SECTIONP-ESCOLAR-BOUNDARY-20261013-R64-S02** | CFIA, [Fish List overview and common-name guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) and [Guidance on determining common names for fish](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) | Describes the list as Canadian fish-label common names paired with scientific taxa. It does not provide a recipe or equivalence rule. |
| **WP04-SECTIONP-ESCOLAR-BOUNDARY-20261013-R64-S03** | Health Canada, [Escolar and Adverse Reactions](https://www.canada.ca/en/health-canada/services/food-nutrition/food-safety/information-product/escolar-adverse-reactions.html) | Names *R. pretiosus* and *L. flavobrunneum* as escolar; says it may be imported legally and is commonly sold frozen or served in restaurants; explains the indigestible wax-ester effect and consumer advice. This page does not cover CFIA's third Escolar-listed taxon or identify the local vendor SKU. |
| **WP04-SECTIONP-ESCOLAR-BOUNDARY-20261013-R64-S04** | Health Canada, [L’escolier et les effets indésirables](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/salubrite-aliments/information-produit/escolier-effets-indesirables.html) | French-language consumer wording, two named taxa, permitted Canadian sale, and consumer advice. It is not a species-specific package label or culinary measurement. |
| **WP04-SECTIONP-ESCOLAR-BOUNDARY-20261013-R64-S05** | OQLF GDT, [rouvet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17487043/rouvet) | Preferred Québec term for *R. pretiosus*; lists `oilfish` in English and `escolar` as a term used in some contexts. Last updated 1992; species terminology, not current market availability. |
| **WP04-SECTIONP-ESCOLAR-BOUNDARY-20261013-R64-S06** | Ozawa Canada, [Oil Fish Fillet, Escolar product page](https://ozawa.ca/product/ocean-jewel-oil-fish-fillet-escolar-27lbscs/) | Frozen-seafood item FS-1420ACA, sold by case; gives no binomial or French label. The listed package is vendor-specific and not a kitchen measure. |
| **WP04-SECTIONP-ESCOLAR-BOUNDARY-20261013-R64-S07** | Ozawa Canada, [Frozen seafood catalogue](https://ozawa.ca/category/japanese-foods/frozen-seafoods/) | Lists the Escolar item and the company's Montréal-area Lachine office. Wholesale-market evidence; it does not establish consumer retail stock or taxon. |
| **WP04-SECTIONP-ESCOLAR-BOUNDARY-20261013-R64-S08** | Government of Canada Translation Bureau, [Ichthyology Canada / Ichtyologie Canada, Terminology Bulletin 161 (1978)](https://publications.gc.ca/collections/collection_2014/tpsgc-pwgsc/S52-2-161-1978-fra.pdf), p. 100 | Records `oilfish` as a historical English common name for eulachon (*Thaleichthys pacificus*) and `rouvet` for *R. pretiosus`. Historical naming evidence only; not a current accepted-label or retail source. The separate [eulachon market-scope hold](wp04-section-p-next-gap-review-20261012-round5.md) remains unchanged. |
