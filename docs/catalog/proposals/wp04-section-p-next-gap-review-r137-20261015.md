# WP04 Section P — Kumamoto oyster identity review (R137)

- **Review and source-access date:** 2026-10-15.
- **Candidate:** Kumamoto oyster, currently accepted taxon *Magallana sikamea*; Québec French **huître Kumamoto**.
- **Recommendation:** Add an identity-only `PROTEIN` reference with the species-qualified bilingual display and only source-backed plural aliases. Keep the existing broad fresh-oyster candidate and the Pacific, Eastern, and dried-oyster identities separate.
- **Data boundary:** No general form, kitchen measure, density, unit mapping, recipe link, yield, conversion, or substitution is supported. Seacore's live product, 60-count case, and 1.5–2.5-inch size are supplier-specific item specifications, not reusable recipe quantities.
- **Write scope:** This review edited only the proposal document; it made no shared catalog JSON, research ledger, generated-file, plan, roadmap, or batch-file edits. No app or Gradle tests were run; this proposal-only document does not change database JSON.

## Candidate selection and prior work

The open Section P parent is **“Mussel, clam, oyster, cockle, and remaining shellfish identities; scallop is integrated below.”** in the [global ingredient-catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L5336). R130 added Pacific oyster, R131 added Eastern oyster, and R135 held Olympia oyster because the Canadian Fish List maps the exact English name “Olympia Oyster” to more than one taxon. The R136 scallop integration is already present in the live catalog. This review selects a separate oyster species that those decisions did not cover.

The candidate is useful because Canadian terminology and supplier records pair “Kumamoto oyster” with *Crassostrea sikamea*, DFO's 2025 marine-aquaculture permit carries the Québec-facing form **Huître Kumamoto**, and a current Montréal fishmonger lists **les huîtres Kumamoto**. A Vaughan seafood supplier separately lists the product with its binomial. These sources support a bounded species identity and a Québec market term; they do not resolve generic oyster requests or establish routine stock at either retailer. [S05–S09]

## Ownership and archive audit

The current bundled snapshot contains **1,490 active ingredient references**, **110 forms**, **61 legacy-import candidates**, and **1,835 research-ledger records** (**7,678 source entries / 6,534 distinct source IDs**). The manifest lists **114 recipes**.

No active reference, form, legacy candidate, or ledger record owns `ingredient-ref-kumamoto-oyster`, *Magallana sikamea*, *Crassostrea sikamea*, `Kumamoto oyster`, `Kumamoto oysters`, `huître Kumamoto`, or `huîtres Kumamoto`. Searches of the Section P proposals and integration batches found no earlier focused Kumamoto identity decision or allocation. Existing oyster-adjacent references remain separate:

- `ingredient-ref-pacific-oyster`: Pacific oyster / huître creuse du Pacifique.
- `ingredient-ref-eastern-oyster`: Eastern oyster / huître de l’Est.
- `ingredient-ref-dried-oyster`: dried oyster / huître séchée.
- `ingredient-ref-oyster-sauce`, `ingredient-ref-vegan-oyster-sauce`, `ingredient-ref-oyster-mushroom`, and `ingredient-ref-king-oyster-mushroom`.
- `ingredient-ref-fresh-oyster`: unresolved generic candidate, not an identity allocation.

No oyster form is active. The proposal ID `ingredient-ref-kumamoto-oyster` and source prefix **`WP04-SECTIONP-KUMAMOTO-OYSTER-R137-20261015`** were checked against the live catalog, ledger, proposals, and batch records; no ID or source-prefix collision was found.

## Taxonomy, Canadian names, and Québec French

Use *Magallana sikamea* as the current accepted taxon. ITIS marks *Crassostrea sikamea* as an invalid name combination and gives *Magallana sikamea* as the valid name; WoRMS likewise accepts *M. sikamea*. CFIA announced that *Magallana sikamea* would be added to its aquatic-animal susceptible-species list effective 2026-10-05, and the current list pairs it with **Kumamoto oyster**. The susceptible-species list is an animal-health list; CFIA explicitly says it does not replace the Fish List used for food labeling. [S01–S04]

DFO's 2025 French marine-aquaculture permit prints **Huître Kumamoto — Crassostrea sikamea** in its authorized-species schedule. DFO's Pacific shellfish aquaculture plan describes the Kumamoto oyster as a different species from Pacific oyster and lists it as a cultured British Columbia species; the plan's named licence table is dated September 2015, so it is historical culture context rather than a claim about current output. [S05, S07]

TERMIUM's food-domain record for *Crassostrea sikamea* marks **Kumamoto oyster** as correct English, lists **Kumo oyster** as another correct English term, and marks **huître Kumamoto** and **huître Kumo** as proposed French terms. It does not label the French entries preferred. The current Montréal fishmonger La Mer independently uses the plural **les huîtres Kumamoto**, and DFO's permit uses the French singular **Huître Kumamoto**. Use **Kumamoto oyster / huître Kumamoto** as the display pair; this is current Québec market wording corroborated by federal terminology and aquaculture records, not a claim that OQLF has designated it as a preferred term. [S05–S06, S09]

### Fish List naming caveat

The CFIA Fish List is Canada's food-labeling common-name reference. CFIA describes Fish List names as acceptable and recommends their use; names not listed are assessed against the rule against false, misleading, or deceptive labels. Its general common-name guidance says that where no prescribed standard name applies, the food's generally known name or a non-generic descriptive name is used. The Fish List output includes a legacy **`Crassostrea gigas kumamoto`** row under TSN 79868, the same TSN used for *C. gigas*. That row's common names are only **Oyster / Huître**; it does not assign **Kumamoto oyster** to a second taxon. ITIS marks the old *C. gigas kumamoto* trinomial invalid, while current ITIS, CFIA aquatic-health nomenclature, DFO's 2025 permit, and the supplier's current item distinguish *M. sikamea* / *C. sikamea*. Do not use the old Fish List row as proof that Kumamoto oyster is Pacific oyster, and do not claim that the exact display pair is itself a CFIA Fish List entry or a formal labeling approval. [S01, S04–S05, S08, S10–S12]

Use only the sourced market plurals **Kumamoto oysters** and **huîtres Kumamoto** as aliases. The former appears on Seacore's current product page; the latter appears on La Mer's current Montréal oyster page. Keep `Kumo oyster(s)`, `huître Kumo`, `oyster`, `oysters`, `huître`, `huîtres`, *Crassostrea gigas kumamoto*, *Crassostrea sikamea*, and *Magallana sikamea* out of aliases. Do not add Pacific, Japanese, or generic oyster wording as species aliases. [S06, S08–S09]

## Canadian and Québec food-market evidence

- **Québec retail listing:** La Mer's current French page for its Montréal fish shop lists **les huîtres Kumamoto** among its Pacific oyster varieties. It describes a seasonal selection of more than 30 varieties and says oyster count options vary by variety. This establishes local market wording and a retailer catalog item, not a binomial, a guaranteed Kumamoto stock date, or a Kumamoto-specific case count. [S09]
- **Canadian supplier product:** Seacore Seafood Products lists **Kumamoto Oysters — Crassostrea sikamea**. Seacore's product page identifies its Vaughan, Ontario address. The product page says **live**, harvested in Washington, product of the USA, available weather permitting, **60 count per case**, and **1.5–2.5 inches**. This is direct Canadian-supplier evidence for a species-specific imported food product; it is not Canadian harvest evidence or a stock guarantee. Its case and shell-size figures remain supplier-specific. [S08]
- **Canadian aquaculture context:** DFO's 2025 permit species schedule pairs `Huître Kumamoto` with *Crassostrea sikamea*. Its older Pacific-region plan says the species is cultivated in small numbers in British Columbia and lists a suspended-culture authorization in a September 2015 table. Neither source establishes present production volume or a current market pack. [S05, S07]

Together, these sources establish a real human-food listing from a Canadian supplier and current Québec retailer terminology. They support the identity proposal without implying Canadian-origin Kumamotos, guaranteed inventory, or species identification for every unqualified oyster product.

## Picker projection and aliases

The projection follows `filterByIngredientSearchQuery` in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt` (complete normalized word-phrase matches first, then partial fallback) across the current references and forms, then adds the proposed bilingual display and two plural aliases. No Latin binomial is searchable through this proposal.

| Query | Current results | With proposed row | Effect |
|---|---:|---:|---|
| `oyster` | 7 | 8 | Broad English query remains multi-result. |
| `oysters` | 3 | 4 | Broad plural remains multi-result. |
| `huître` | 5 | 6 | Broad Québec French query remains multi-result. |
| `huîtres` | 5 | 6 | Broad plural remains multi-result. |
| `Kumamoto` / `Kumamoto oyster` / `Kumamoto oysters` | 0 | 1 | Species-market wording resolves to the proposed row. |
| `huître Kumamoto` / `huîtres Kumamoto` | 0 | 1 | Québec retailer wording resolves to the proposed row. |
| `Crassostrea sikamea` / `Magallana sikamea` | 0 | 0 | Scientific names remain out of picker terms. |
| `Kumo oyster` / `huître Kumo` | 0 | 0 | Alternate names are not aliases. |
| `Pacific oyster` / `Pacific oysters` | 1 | 1 | Existing Pacific-oyster identity remains the only match; no Kumamoto alias is added. |

The exact name `Kumamoto oyster` is supported for *sikamea* by TERMIUM, DFO aquaculture records, CFIA's current aquatic-health entry (not its labeling list), and Seacore's species-named product page. The legacy CFIA Fish List row discussed above does not provide an exact `Kumamoto oyster` common-name match for a second current taxon. Broad `oyster`/`huître` results already have multiple active choices and stay multi-result. The row does not resolve `ingredient-ref-fresh-oyster` or assign a species to generic market wording. [S04–S08, S10]

## Manifest recipe demand

The complete manifest-listed corpus was scanned: **114 recipe files and 1,123 ingredient rows**. The demand scan read strings only from each recipe's `ingredients` rows (`ingredientName`, `originalText`, and row notes when present). It did not count titles, instructions, descriptions, tags, or other non-ingredient text as ingredient demand. Terms included `Kumamoto`, `Kumamotos`, `Kumamoto oyster(s)`, `Kumo oyster(s)`, `huître(s) Kumamoto`, *Magallana sikamea*, *Crassostrea sikamea*, and the older *Crassostrea gigas kumamoto* spelling.

**Result: zero matching recipe files and zero matching ingredient rows.** No recipe link, line relink, recipe-specific form, amount, or substitution is supported.

## Forms, numeric observations, and substitutions

Seacore's product page documents one supplier listing as live and gives a 60-count case and a 1.5–2.5-inch size band. La Mer says it sells oysters by varied count formats depending on variety, without identifying a Kumamoto-specific pack. The supplier's case quantity and shell-size band are not a recipe portion, mass, edible yield, or transferable count-to-weight mapping. No reviewed source gives a Kumamoto-specific kitchen quantity, mass per oyster, package mass, density, shell-on-to-meat yield, or cooking yield. Keep `measurementState` as `researched_no_supported_value`; record no measurement observation, default density, unit mapping, active measure, or package yield. [S08–S09]

The Seacore page's **live** status is a seller-item fact; it does not establish a need for a reusable `live` form on the species identity. Add no form. No bundled recipe or reviewed source compares *M. sikamea* with Pacific oyster, Eastern oyster, or another ingredient in a specified recipe context and amount. Keep `substitutionResearchState` as `researched_no_supported_substitute`; add no global conversion, contextual substitution, warning, or recipe-line substitution link.

## Recommendation and exact proposal JSON

Add `ingredient-ref-kumamoto-oyster` as an identity-only `PROTEIN` reference. Keep the generic fresh-oyster candidate unresolved, preserve the distinct Pacific and Eastern species identities and dried-oyster product, and do not add aliases for broad oyster names or scientific names.

### Ingredient reference

```json
{
  "id": "ingredient-ref-kumamoto-oyster",
  "nameFr": "hu\u00eetre Kumamoto",
  "nameEn": "Kumamoto oyster",
  "aliasesFr": [
    "hu\u00eetres Kumamoto"
  ],
  "aliasesEn": [
    "Kumamoto oysters"
  ],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "PROTEIN"
}
```

### Research-ledger record

```json
{
  "recordId": "ingredient-ref-kumamoto-oyster",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP04-SECTIONP-KUMAMOTO-OYSTER-R137-20261015-S01",
      "url": "https://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=1267864",
      "title": "Integrated Taxonomic Information System, Crassostrea sikamea, TSN 1267864",
      "accessedOn": "2026-10-15",
      "locator": "Current standing and valid-name field.",
      "supports": "Marks Crassostrea sikamea as an invalid name combination and gives Magallana sikamea as the valid name. This is taxonomic evidence, not food-label guidance.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-KUMAMOTO-OYSTER-R137-20261015-S02",
      "url": "https://www.marinespecies.org/aphia.php?p=taxdetails&id=836041",
      "title": "World Register of Marine Species, Magallana sikamea, AphiaID 836041",
      "accessedOn": "2026-10-15",
      "locator": "Accepted taxon and synonymized-name fields.",
      "supports": "Accepts Magallana sikamea and lists Crassostrea sikamea as an unaccepted combination for the same species.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-KUMAMOTO-OYSTER-R137-20261015-S03",
      "url": "https://inspection.canada.ca/en/animal-health/aquatic-animals/notices-industry/2026-09-04",
      "title": "Canadian Food Inspection Agency, notice on susceptible aquatic-animal species changes",
      "versionOrDate": "2026-09-04 notice; update effective 2026-10-05",
      "accessedOn": "2026-10-15",
      "locator": "Species additions to the susceptible-species list and effective date.",
      "supports": "Announces Magallana sikamea as a species added to the aquatic-animal susceptible-species list effective 2026-10-05. This is an import-health update, not food-label naming guidance.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-KUMAMOTO-OYSTER-R137-20261015-S04",
      "url": "https://inspection.canada.ca/en/animal-health/aquatic-animals/diseases/susceptible-species",
      "title": "Canadian Food Inspection Agency, Susceptible species of aquatic animals",
      "versionOrDate": "Page modified 2026-10-05",
      "accessedOn": "2026-10-15",
      "locator": "Molluscs table row Magallana sikamea.",
      "supports": "Pairs Magallana sikamea with Kumamoto oyster; CFIA states this list is for aquatic-animal health and does not replace the Fish List for food labeling.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-KUMAMOTO-OYSTER-R137-20261015-S05",
      "url": "https://www.pac.dfo-mpo.gc.ca/aquaculture/licence-permis/docs/licence-cond-permis-shell-coq/licence-cond-permis-shell-coq-fra.pdf",
      "title": "Pêches et Océans Canada, Conditions de permis de conchyliculture marine en 2025",
      "versionOrDate": "2025 permit conditions",
      "accessedOn": "2026-10-15",
      "locator": "Appendix I, PDF page 17: Huître Kumamoto / Crassostrea sikamea.",
      "supports": "Pairs the French name Huître Kumamoto with Crassostrea sikamea in a federal marine-aquaculture permit schedule; this is not a consumer label or retail-stock statement.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-KUMAMOTO-OYSTER-R137-20261015-S06",
      "url": "https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?codom2nd_wet=1&consrv_prsent=1&i=1&index=frr&lang=eng&srchtxt=CAS+CONNU",
      "title": "TERMIUM Plus, food-domain record for Crassostrea sikamea",
      "versionOrDate": "Record dated 2016-05-10",
      "accessedOn": "2026-10-15",
      "locator": "Record for Crassostrea sikamea; English and French term fields.",
      "supports": "Marks Kumamoto oyster as correct English and huître Kumamoto as a proposed French term; also lists Kumo oyster and huître Kumo, which are not proposed as aliases here.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-KUMAMOTO-OYSTER-R137-20261015-S07",
      "url": "https://www.pac.dfo-mpo.gc.ca/aquaculture/docs/shellfish-imap-pgia-mollusques-crustaces-eng.html",
      "title": "Fisheries and Oceans Canada, Shellfish Integrated Management of Aquaculture Plan",
      "versionOrDate": "Named aquaculture-licence table dated September 2015",
      "accessedOn": "2026-10-15",
      "locator": "Section 1.2.4 and the shellfish licence table: Kumamoto oyster / Crassostrea sikamea.",
      "supports": "Describes Kumamoto oyster as a different species from Pacific oyster and includes it in a dated British Columbia aquaculture species table. Historical culture context, not current output or market stock.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-KUMAMOTO-OYSTER-R137-20261015-S08",
      "url": "https://www.seacoreseafood.com/product/Kumamoto_Oysters",
      "title": "Seacore Seafood Products, Kumamoto Oysters",
      "accessedOn": "2026-10-15",
      "locator": "Current product title, scientific-name line, characteristics, availability note, and Vaughan contact address.",
      "supports": "Lists Kumamoto Oysters / Crassostrea sikamea; says live, harvested in Washington, product of the USA, 60 count per case, 1.5–2.5 inches, and available weather permitting. Canadian supplier product evidence; numbers and state are specific to this item.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-KUMAMOTO-OYSTER-R137-20261015-S09",
      "url": "https://www.lamer.ca/pages/notre-poissonnerie",
      "title": "Poissonnerie La Mer, Notre Poissonnerie",
      "accessedOn": "2026-10-15",
      "locator": "Huîtres section, current Montréal oyster-variety listing and count-format note.",
      "supports": "Lists les huîtres Kumamoto among oyster varieties and says package counts vary by variety. Supports Québec market wording, not a binomial, current Kumamoto inventory guarantee, or Kumamoto-specific package count.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-KUMAMOTO-OYSTER-R137-20261015-S10",
      "url": "https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp",
      "title": "Canadian Food Inspection Agency, CFIA Fish List output for oyster names",
      "versionOrDate": "Fish List modified 2023-09-18; output checked 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Rows for TSN 79868: Crassostrea gigas and Crassostrea gigas kumamoto, common names Oyster / Huître; compare the separate current Magallana sikamea aquatic-health row.",
      "supports": "Shows that the legacy Crassostrea gigas kumamoto spelling has only generic Oyster / Huître common-name rows under the Pacific-oyster TSN; it does not assign the exact Kumamoto oyster label to a second taxon. Do not treat this legacy list row as a current taxonomic ruling.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-KUMAMOTO-OYSTER-R137-20261015-S11",
      "url": "https://inspection.canada.ca/en/food-labels/labelling/industry/fish",
      "title": "Canadian Food Inspection Agency, Labelling requirements for fish and fish products",
      "accessedOn": "2026-10-15",
      "locator": "Common name section, CFIA Fish List guidance and general common-name rule.",
      "supports": "CFIA describes Fish List names as acceptable and recommends their use; names not listed are assessed against the false, misleading, or deceptive labeling requirement. Its general common-name guidance also describes the generally-known or non-generic descriptive-name rule where no prescribed standard name applies. This proposal does not claim Fish List inclusion or formal label approval for Kumamoto oyster.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-KUMAMOTO-OYSTER-R137-20261015-S12",
      "url": "https://www.itis.gov/servlet/SingleRpt/SingleRpt?categories=All&search_credRating=all&search_kingdom=every&search_span=containing&search_topic=Scientific_Name&search_value=Crassostrea+gigas&source=html",
      "title": "Integrated Taxonomic Information System, scientific-name search for Crassostrea gigas",
      "accessedOn": "2026-10-15",
      "locator": "Search-result line for Crassostrea gigas kumamoto.",
      "supports": "Lists Crassostrea gigas kumamoto as invalid. This supports distinguishing the legacy trinomial from current Magallana sikamea nomenclature; it is not a food-label naming source.",
      "sourceKind": "other"
    }
  ],
  "measurementObservations": [],
  "substitutionFindings": [],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add identity-only Kumamoto oyster / huître Kumamoto for Magallana sikamea, with only the source-backed English and Québec French plural aliases. Keep generic fresh-oyster, Pacific-oyster, Eastern-oyster, and dried-oyster identities separate. Do not claim that the display pair is a CFIA Fish List label.",
      "sourceIds": [
        "WP04-SECTIONP-KUMAMOTO-OYSTER-R137-20261015-S01",
        "WP04-SECTIONP-KUMAMOTO-OYSTER-R137-20261015-S02",
        "WP04-SECTIONP-KUMAMOTO-OYSTER-R137-20261015-S03",
        "WP04-SECTIONP-KUMAMOTO-OYSTER-R137-20261015-S04",
        "WP04-SECTIONP-KUMAMOTO-OYSTER-R137-20261015-S05",
        "WP04-SECTIONP-KUMAMOTO-OYSTER-R137-20261015-S06",
        "WP04-SECTIONP-KUMAMOTO-OYSTER-R137-20261015-S07",
        "WP04-SECTIONP-KUMAMOTO-OYSTER-R137-20261015-S08",
        "WP04-SECTIONP-KUMAMOTO-OYSTER-R137-20261015-S09",
        "WP04-SECTIONP-KUMAMOTO-OYSTER-R137-20261015-S10",
        "WP04-SECTIONP-KUMAMOTO-OYSTER-R137-20261015-S11",
        "WP04-SECTIONP-KUMAMOTO-OYSTER-R137-20261015-S12"
      ]
    },
    {
      "outcome": "unresolved",
      "reason": "No reusable kitchen measure, edible yield, form, or substitution is supported. Preserve Seacore's count-per-case and shell-size details only in the proposal as supplier-specific product facts; add no ledger observation, runtime measure, form, density, unit mapping, conversion, or substitute.",
      "sourceIds": [
        "WP04-SECTIONP-KUMAMOTO-OYSTER-R137-20261015-S04",
        "WP04-SECTIONP-KUMAMOTO-OYSTER-R137-20261015-S05",
        "WP04-SECTIONP-KUMAMOTO-OYSTER-R137-20261015-S07",
        "WP04-SECTIONP-KUMAMOTO-OYSTER-R137-20261015-S08",
        "WP04-SECTIONP-KUMAMOTO-OYSTER-R137-20261015-S09"
      ]
    }
  ]
}
```

## Direct source register

| ID | Direct source and scope |
|---|---|
| S01 | [ITIS, *Crassostrea sikamea*, TSN 1267864](https://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=1267864). Taxonomic record marks this combination invalid and gives valid name *Magallana sikamea*. |
| S02 | [WoRMS, *Magallana sikamea*, AphiaID 836041](https://www.marinespecies.org/aphia.php?p=taxdetails&id=836041). Accepted taxon and synonymized-name status. |
| S03 | [CFIA, 2026 susceptible-species-list notice](https://inspection.canada.ca/en/animal-health/aquatic-animals/notices-industry/2026-09-04). Announces *Magallana sikamea* addition effective 2026-10-05; aquatic-health import scope. |
| S04 | [CFIA, Susceptible species of aquatic animals](https://inspection.canada.ca/en/animal-health/aquatic-animals/diseases/susceptible-species), modified 2026-10-05. *Magallana sikamea* / Kumamoto-oyster name pairing; CFIA explicitly says this is not the food-label Fish List. |
| S05 | [DFO, 2025 marine-shellfish aquaculture permit conditions (French PDF)](https://www.pac.dfo-mpo.gc.ca/aquaculture/licence-permis/docs/licence-cond-permis-shell-coq/licence-cond-permis-shell-coq-fra.pdf), Appendix I, PDF p. 17. Prints `Huître Kumamoto — Crassostrea sikamea`; permit terminology, not retail naming. |
| S06 | [TERMIUM Plus, food-domain *Crassostrea sikamea* record](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?codom2nd_wet=1&consrv_prsent=1&i=1&index=frr&lang=eng&srchtxt=CAS+CONNU), record dated 2016-05-10. Marks English `Kumamoto oyster` correct; French `huître Kumamoto` proposed. |
| S07 | [DFO Pacific shellfish aquaculture plan](https://www.pac.dfo-mpo.gc.ca/aquaculture/docs/shellfish-imap-pgia-mollusques-crustaces-eng.html), §1.2.4 and September 2015 licensed-species table. Describes Kumamoto as distinct from Pacific oyster and lists *C. sikamea* in BC culture context. |
| S08 | [Seacore Seafood Products, Kumamoto Oysters](https://www.seacoreseafood.com/product/Kumamoto_Oysters). Current Vaughan supplier listing pairs product name and *C. sikamea*; Washington harvest, US origin, live status, 60-count case, 1.5–2.5-inch product size, weather-dependent availability. |
| S09 | [Poissonnerie La Mer, Notre Poissonnerie](https://www.lamer.ca/pages/notre-poissonnerie), Montréal oyster section. Current French product-variety listing uses `les huîtres Kumamoto`; general count formats vary by variety. |
| S10 | [CFIA Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), table rows under TSN 79868. The legacy *C. gigas kumamoto* spelling is paired only with `Oyster / Huître` at the same TSN as *C. gigas*; this is not a second exact Kumamoto-oyster name assignment. |
| S11 | [CFIA, Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish), Common name section. Explains Fish List naming and the general-known/descriptive-name rule; no formal label-approval claim is made here. |
| S12 | [ITIS, scientific-name search for *Crassostrea gigas*](https://www.itis.gov/servlet/SingleRpt/SingleRpt?categories=All&search_credRating=all&search_kingdom=every&search_span=containing&search_topic=Scientific_Name&search_value=Crassostrea+gigas&source=html). Search result marks *Crassostrea gigas kumamoto* invalid. |

This proposal changes no shared catalog or ledger file. It is a proposal-only review; no app, Gradle, unit, instrumentation, emulator, or deployment tests were run.
