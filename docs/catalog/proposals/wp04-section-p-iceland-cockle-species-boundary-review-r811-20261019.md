# WP04 Section P — Iceland cockle species boundary review (R811)

- **Review date:** 2026-10-19.
- **Open checklist item:** “Mussel, clam, oyster, cockle, and remaining shellfish identities; scallop is integrated below” in the [global ingredient-catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L8139).
- **Candidate:** Iceland cockle / **coque d’Islande**, listed in older Canadian naming sources as *Clinocardium ciliatum* and currently accepted by WoRMS as *Ciliatocardium ciliatum*.
- **Disposition:** **Hold the species row outside active references and the research ledger.** Species identity and qualified English/Québec French names are well supported, but the bilingual display itself makes previously empty broad `cockle` and `coque` queries return this single species while the generic cockle candidate remains unresolved. The manifest recipes have no matching demand, and current Canadian product evidence does not identify this species.
- **Exact proposed data delta:** none. Preserve the existing generic `ingredient-ref-cockle` candidate and its evidence. Add no reference, aliases, form, ledger source, legacy identity, recipe link, measure, density, mapping, conversion, yield, or substitution.

## Scope and prior-work boundary

The [generic cockle/coque review](wp04-cockle-coque-identity-boundary-review-20261011.md) held the unqualified identity, recorded `ingredient-ref-cockle` as unresolved, and explicitly left a later review of species-qualified *Clinocardium ciliatum* / **Iceland cockle / coque d’Islande** as a separate possibility. It did not allocate that species. The [R144 Greenland cockle review](wp04-section-p-next-shellfish-identity-gap-review-r144-20261015.md) addresses *Serripes groenlandicus*, not this taxon. The current plan and proposal archive contain no focused species-boundary review for Iceland cockle. The R808 edible-crab integration concerns *Cancer pagurus* and is unrelated.

This review answers the deferred species question without reopening the broader clam, Greenland-cockle, or other shellfish decisions. It distinguishes a useful species-qualified picker phrase from the effect that the phrase also has on broad family-level searches.

## Identity and bilingual naming evidence

The identity is stable across sources although the accepted Latin combination has changed. CFIA, OQLF, and TERMIUM use *Clinocardium ciliatum*. WoRMS/OBIS now lists that combination as superseded and accepts *Ciliatocardium ciliatum*; Fisheries and Oceans Canada’s recent survey table also uses *Ciliatocardium ciliatum*. These names refer to the same species for this review. Keep scientific names in the evidence record, not in user-facing aliases.

For Québec French, OQLF’s food-mollusc entry prefers **coque**, pairs it with English **cockle**, and associates both with *Clinocardium ciliatum*. OQLF notes that `mye` occurs in some contexts but was not retained by the fisheries-products terminology committee. The entry was last updated in 2012, so I use it as Québec terminology evidence and cross-check it against later sources.

TERMIUM Plus’s 2023 terminology record pairs *Clinocardium ciliatum* with English **hairy cockle** (a trade name recommended by the commercial-fishing terminology committee and DFO) and **Iceland cockle**, and with French **coque** and **coque d’Islande**. Usito independently distinguishes **coque commune** (*Cerastoderma edule*) from **coque d’Islande** (*Clinocardium ciliatum*) and describes unqualified `coque` as a broader edible-mollusc word; it also records `coque` as another name for `mye` in a regional, generally Acadian, use. These sources support the qualified pair **Iceland cockle / coque d’Islande** and the English search alias **hairy cockle**. They do not establish that every Canadian product sold as `cockle` or `coque` is this species.

TERMIUM’s adjacent **European cockle** record also lists bare English `cockle` for *Cerastoderma edule*. Together with CFIA’s separate plain **Cockle** label for *Clinocardium nuttallii*, this confirms that broad English `cockle` use is not species-exclusive either.

CFIA’s Fish List lists TSN 80867 *Clinocardium ciliatum* as **Hairy Cockle / Coque** and TSN 80873 *Clinocardium nuttallii* as **Cockle / Coque**. CFIA describes the list as acceptable common names for Canadian fish labelling; the page’s data-modification date is 2023-09-18. The rows support both the Canadian names and the shared French label, but are not a rule for recipe synonyms. The exact qualified French phrase `coque d’Islande` avoids that bare-name ambiguity.

The current DFO report for the 2024 August ecosystem survey lists *Ciliatocardium ciliatum* as **Coque d’Islande / Iceland Cockle**. The survey is evidence that the species and bilingual qualified name remain in recent Gulf-region scientific records. It is a fishery-independent ecosystem survey, not evidence of a current food SKU or consumer product label.

## Canadian product boundary

Clearwater’s current French product page sells **Coques** under its palourde category and describes North Atlantic harvest, blanching, and rapid individual freezing. It does not identify a binomial, name a species-qualified product, or show a package size. This supports a present Canadian culinary-market use of plural `coques`, but not an assignment to *Ciliatocardium ciliatum*. The reviewed targeted searches found no current Canadian or Québec product page that identifies this species by binomial or by a species-qualified SKU.

As a non-Canadian comparison only, Iceland Foods’ **Iceland Cooked Cockle Meat** product record identifies *Cerastoderma edule*, cooked and de-shelled, in a 225 g frozen pack; the retailer page currently marks it unavailable. Here “Iceland” is the retailer’s name, not the species name. This is useful evidence that a retail cockle product can be another taxon and a defined preparation; it is not evidence for a Canadian Iceland-cockle product and its package/form must not transfer to this candidate.

## Active catalog, ledger, aliases, and picker projection

The current package snapshot has **1,885 active ingredient references** and **199 forms**. Exact-term inspection found no active owner for `Iceland cockle`, `coque d’Islande`, `hairy cockle`, *Clinocardium ciliatum*, or *Ciliatocardium ciliatum*. No form claims these terms. There are **56 legacy-import candidates**, with no matching identity or phrase. The research ledger has **2,293 records** and **10,752 source entries**. It contains the generic `ingredient-ref-cockle` candidate (`needs_clarification`; measurements and substitutions not yet researched) with six prior source entries, but no species-specific Iceland-cockle candidate or R811 source allocation. The ledger already owns the OQLF and CFIA sources used above under the generic hold; this proposal reuses that evidence and does not create another ledger allocation.

The only relevant active geographic-name result is `ingredient-ref-icelandic-scallop` (**Icelandic scallop / pétoncle d’Islande**). The hypothetical row below is for projection only, not an active-data request:

| Field | Hypothetical value used for projection |
|---|---|
| English display | `Iceland cockle` |
| Québec French display | `coque d’Islande` |
| English aliases | `hairy cockle` |
| French aliases | none |
| Category if eventually accepted | `PROTEIN` |
| Density and unit mappings | none |

Projection follows the current [phrase-first ingredient search](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It returns complete normalized word phrases occurring inside longer indexed terms before trying substring fallback. Therefore, leaving bare `cockle` and `coque` out of alias arrays does **not** prevent them from matching inside the bilingual display.

| Query | Current results | With hypothetical row | Assessment |
|---|---|---|---|
| `Iceland cockle` | 0 | 1: hypothetical Iceland cockle | Useful species-qualified English choice. |
| `coque d’Islande` | 0 | 1: hypothetical Iceland cockle | Useful species-qualified Québec French choice. |
| `hairy cockle` | 0 | 1: hypothetical Iceland cockle | TERMIUM/CFIA-supported English name. |
| `cockle` | 0 | 1: hypothetical Iceland cockle | The row would become the sole result for the still-unresolved generic query. |
| `coque` | 0 | 1: hypothetical Iceland cockle | The row would become the sole result despite the CFIA shared label and broader French uses. |
| `cockles` / `coques` | 0 / 0 | 0 / 0 | No plural aliases are proposed; adding them would also make broad plural queries singletons. |
| `Iceland` / `Islande` | 1 each: Icelandic scallop | 2 each: Icelandic scallop and hypothetical Iceland cockle | Both qualified choices remain visible; the query is broader than this species. |
| `mye` | 1 substring fallback: `myeolchi-jeot` | unchanged if no French alias is added | TERMIUM lists `mye`, but adding it would create an exact-phrase match and suppress the current unrelated fallback result; it also overlaps the unresolved clam terminology. Exclude it. |
| `clam` / `palourde` | 0 / 0 | 0 / 0 | No English or French clam aliases are proposed. |

The species-qualified display remains useful and discoverable when the query is qualified. Its phrase components also make it the only result for the two currently empty generic queries. With no generic cockle identity represented and no recipe selecting this species, that picker outcome would imply that this one taxon resolves general `cockle`/`coque` use. Keep the species row held until generic scope can be represented without that implication, or a recipe requires an explicit species choice.

## Recipe demand and substitutions

All **114 manifest-listed recipe files** were parsed; all **1,123 ingredient rows** and complete recipe JSON documents were searched for `cockle`, `cockles`, `coque`, `coques`, `Iceland cockle`, `coque d’Islande`, `hairy cockle`, both scientific-name combinations, and `mye`/`palourde` context. Result: **0 matching files, 0 ingredient rows, and 0 recipe-line substitution links**. No recipe provides a cooking method, preparation, product-state requirement, or portion for this species.

No current Canadian source reviewed defines a culinary substitution involving this taxon. The Clearwater `coques` page is species-unspecified, the UK retail example is a different species, and the DFO survey is ecological rather than culinary. None establishes interchangeability among *Ciliatocardium ciliatum*, *C. nuttallii*, *Cerastoderma edule*, other cockles, clams, or mussels. The package has no global or contextual substitution rule containing cockle/coque terms. Do not infer a substitute from shared family membership or market wording.

## Measurements, density, and forms

The recent DFO table records the species in its 2024 survey as **Occurrence 2, Weight 0.4 kg, Number 21**. Those are survey catch observations, not edible yield, a package quantity, a serving, or a reusable count-to-mass conversion. Clearwater’s nutrition panel is stated per 100 g for its unspecified `coques` product; it does not provide a household volume, species identity, product net weight, or ingredient density. The UK 225 g frozen, cooked/de-shelled pack belongs to *Cerastoderma edule* and is product-specific.

No reviewed source supports a cup-to-mass conversion, density in g/ml, shell-to-meat yield, cooking yield, package yield, or household serving for Iceland cockle. Do not add a form from a supplier page that names only `coques`, and do not transfer the UK product’s cooked/de-shelled form or package weight. Leave all numeric fields unset if this identity is revisited.

## Static checks and testing disposition

- Read-only parsing confirmed the current manifest (114 recipe paths), references, forms, research ledger, and legacy-candidate file are valid JSON.
- Exact identity/source ownership was checked across references, forms, the 56 legacy candidates, ledger records, recent proposals, and the plan/archive. The generic cockle ledger hold is the only existing candidate allocation; OQLF and CFIA source URLs are already owned there.
- The picker table is a static projection of the current search behavior with the exact hypothetical English/French names and alias above; it is not an app test.
- The full manifest corpus scan covered 114 recipe files and 1,123 ingredient rows, plus complete recipe JSON text and recipe-line substitution links.
- No tests, build, emulator run, or deployment were performed. This proposal recommends no data integration. If a later accepted change adds only database JSON data, the current `AGENTS.md` rule says no testing is needed for that change.

## Source register

Sources were checked on 2026-10-19. IDs are local to this proposal and have not been added to the shared ledger. Existing OQLF and CFIA source URLs are reused from `ingredient-ref-cockle`.

| Source ID | Source and evidence | Limit |
|---|---|---|
| **Reused WP04-COCKLE-COQUE-20261011-S01** | OQLF, [coque (Grand dictionnaire terminologique)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198883/coque). Food-mollusc domain; preferred French `coque`, English `cockle`, *Clinocardium ciliatum*; notes commercial potential in Québec. | Last updated 2012. Supports a Québec species/term pairing, not every unqualified product or recipe use. |
| **WP04-SECTIONP-ICELAND-COCKLE-R811-20261019-S01** | TERMIUM Plus, [COQUE results, record 13](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=frw&lang=eng&srchtxt=COQUE), internally updated 2023-01-04. | Pairs *Clinocardium ciliatum* with `hairy cockle`, `Iceland cockle`, `coque`, `coque d’Islande`, and `mye`; marks `hairy cockle` as a commercial trade name recommended by the terminology committee and DFO. Terminology evidence, not a current SKU. |
| **WP04-SECTIONP-ICELAND-COCKLE-R811-20261019-S02** | Université de Sherbrooke, [Usito: coque](https://examen-francais-quebec.usito.usherbrooke.ca/d%C3%A9finitions/coque). | Distinguishes `coque commune` (*Cerastoderma edule*) and `coque d’Islande` (*Clinocardium ciliatum*), describes a broader edible-mollusc sense, and records regional use as another name for `mye`. Dictionary evidence, not fish-product labelling. |
| **Reused WP04-COCKLE-COQUE-20261011-S02** | CFIA, [Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) and [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). TSN 80867 lists `Hairy Cockle / Coque` for *Clinocardium ciliatum*; TSN 80873 lists `Cockle / Coque` for *C. nuttallii*. | CFIA lists acceptable Canadian labelling names; the visible data-modification date is 2023-09-18. This is not a recipe-alias policy. |
| **WP04-SECTIONP-ICELAND-COCKLE-R811-20261019-S03** | WoRMS/OBIS, [Clinocardium ciliatum taxon record](https://obis.org/taxon/156819); linked [WoRMS taxon](https://www.marinespecies.org/aphia.php?p=taxdetails&id=156819). | Lists *Clinocardium ciliatum* as a superseded combination, accepted as *Ciliatocardium ciliatum*, with vernacular names `hairy cockle` and `Iceland cockle`. Taxonomy, not a Québec product label. |
| **WP04-SECTIONP-ICELAND-COCKLE-R811-20261019-S04** | Fisheries and Oceans Canada, [Preliminary Results from the 2024 August Ecosystem Survey in the Estuary and Northern Gulf of St. Lawrence](https://publications.gc.ca/collections/collection_2025/mpo-dfo/fs70-5/Fs70-5-2025-032-eng.pdf) and [French report](https://publications.gc.ca/collections/collection_2025/mpo-dfo/fs70-5/Fs70-5-2025-032-fra.pdf), July 2025, invertebrate catch table, code 4351. | Uses *Ciliatocardium ciliatum*, `Iceland Cockle / Coque d’Islande`, and survey columns for occurrence, weight and number. The survey is not directed commercial harvest or consumer availability. |
| **WP04-SECTIONP-ICELAND-COCKLE-R811-20261019-S05** | Clearwater, [Coques](https://www.clearwater.ca/fr/seafood-industry/clams/coques/). Current French company page for North Atlantic coques; describes blanched and individually frozen seafood. | Gives no taxon, species-qualified product title, SKU/package size, or household conversion. Its 100 g nutrition basis is not a kitchen measure or density. |
| **WP04-SECTIONP-ICELAND-COCKLE-R811-20261019-S06** | Iceland Foods, [Cooked Cockle Meat, 225 g](https://www.iceland.co.uk/p/iceland-cooked-cockle-meat-225g/73887.html). UK product record identifies *Cerastoderma edule*, cooked and de-shelled; page currently marks the item unavailable. | Different species and market; “Iceland” is the retailer name. Do not transfer its package, form, aliases, or substitution scope to Canadian Iceland cockle. |

**Recommendation:** keep Iceland cockle / coque d’Islande outside the active picker for this pass. Preserve the existing generic cockle hold. Reopen if a recipe or current Canadian target product selects *Ciliatocardium ciliatum*, or when broad cockle/coque queries can remain unresolved while the species-qualified choices are separately searchable.
