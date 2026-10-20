# WP02 Section 04 B3 — Lentil starch identity review (R141)

- **Disposition:** Add one identity-only reference for lentil starch, with no aliases, forms, active measurements, unit mappings, recipe links, or substitutions.
- **Scope:** The open regional-starch parent at docs/RecipeBook-global-ingredient-catalog-plan.txt (WP02 Section 04 B3, line 2209). This review covers the food-grade ingredient listed as **Lentil Starch** and isolates it from whole lentils, lentil flour, and starch-rich lentil flour.
- **Review boundary:** R120’s chickpea-starch hold mentions lentil starch as a research comparator; it does not resolve the distinct lentil-starch identity. A focused archive search found no prior lentil-starch proposal, hold, active ID, or research-ledger candidate. No other recent R136–R140 starch decision concerns lentils.
- **Human-food limit:** The Canadian gluten-free product finder lists an AGT Foods item named **Lentil Starch**, with no UPC; its current note says some listings are ingredients for food manufacturers. This supports a Canadian-facing food-ingredient identity but does not establish consumer retail availability or a Québec package label. Keep the row narrowly identity-only and describe the French name as provisional.

## Recommendation

Add **lentil starch / amidon de lentille** as a **FLOUR_AND_STARCH** ingredient reference. The current Canadian product finder lists the exact product name under AGT Foods, while the manufacturer’s ingredient brochure gives a separate Lentil Starch product specification and describes pulse starches as food-grade ingredients. Canadian primary research also isolates starch from red and green lentil cultivars separately from lentil flour. Together, these sources support a distinct food-ingredient identity without requiring a claim that all lentil-derived powders are purified starch. [S01–S04]

Use **amidon de lentille** as a descriptive, provisional Québec French display. OQLF identifies **lentille** with English **lentil** and *Lens culinaris*, and prefers **amidon** for food starch; its note reserves **fécule** more specifically for starch from tubers and underground organs. The reviewed Québec sources do not attest the exact compound or a French lentil-starch product label. Do not add **fécule de lentille** or an unverified alias. [S05–S06]

This is an ingredient-market identity, not evidence of a consumer-size package in Québec. The Celiac Canada product finder was last updated July 2026 and lists the AGT item with UPC **N/A**; its own note says some entries are available only as ingredients for food manufacturers. [S01]

## Product and taxonomy boundary

| Concept | Decision |
|---|---|
| **English display** | **lentil starch** |
| **French display** | **amidon de lentille** — descriptive and provisional; no exact Québec product label was found |
| **Category** | **FLOUR_AND_STARCH** |
| **Product scope** | The food-grade lentil-starch ingredient sold/listed under that name. Do not imply a 100% purified isolate: AGT’s product specification reports at least 65% starch and at least 8% protein, and does not state a purification method. |
| **Whole lentils** | Keep distinct from **ingredient-ref-lentils**, green lentils, red lentils, French green lentils, and black Beluga lentils. The food finder’s product name is not a whole-seed form. |
| **Lentil flour** | Keep distinct from **ingredient-ref-green-lentil-flour**, source-listed whole/red/yellow lentil flours, and AGT’s high-starch Lentil Flour V-6000. A starch-enriched flour is not this product merely because it contains a high starch percentage. |
| **Other pulse starches** | Keep distinct from pea starch, mung-bean starch, and the held chickpea-starch candidate. Shared pulse origin or thickening use does not establish synonymy or an exchange ratio. |
| **Aliases** | None. In particular, do not add broad **lentil**, **lentille**, **lentil flour**, or **lentille verte** terms. |

The pulse-starch technical overview distinguishes wet-isolated starch, generally reported at more than 85% purity, from air-classified starch-rich products, typically 65–85% starch and retaining protein and fibre. That distinction reinforces the need to keep the AGT product’s actual marketed name and specification bounded; it does not establish which processing route AGT uses for this Lentil Starch item. [S03]

## Picker and ownership audit

The live package contains 1,496 ingredient references and 114 forms. Exact normalized searches found no active reference, form, legacy-code, or ledger owner for **lentil starch**, **amidon de lentille**, or **ingredient-ref-lentil-starch**. The current lentil-related owners are whole-seed identities and green lentil flour; no form is attached to a lentil-starch identity. The ledger has no **candidate-lentil-starch**. The only prior focused-adjacent reference is R120’s comparative discussion of lentil starch in a chickpea-starch review.

Static projection against IngredientReferenceSearchIndex complete-word phrase behavior:

| Query | Current rows | With proposed row | Picker consequence |
|---|---:|---:|---|
| **lentil starch** | 0 | 1 | Exact source-qualified ingredient query returns only lentil starch. |
| **amidon de lentille** | 0 | 1 | Exact proposed French display returns only lentil starch. |
| **lentil** | 1 | 2 | Adds lentil starch beside green lentil flour; both display names stay qualified. |
| **lentille** | 2 | 3 | Adds lentil starch beside the two Kersting’s-groundnut rows whose French names contain **lentille de terre**; the full lentil-starch display makes the different ingredient visible. |
| **lentils / lentilles** | 5 / 6 | 5 / 6 | Plural whole-lentil searches are unchanged. |
| **lentil flour / farine de lentille de terre** | 1 / 1 | 1 / 1 | Existing flour and Kersting’s-groundnut ownership is unchanged. |
| **starch / amidon** | 34 / 28 | 35 / 29 | One additional qualified starch result; no bare alias is introduced. |

The singular **lentil** and **lentille** queries necessarily match words in the canonical names. This is an expected discovery result, not a proposed broad alias: the picker keeps the complete **lentil starch / amidon de lentille** display visible. Do not add whole-seed or flour aliases to increase these results.

## Bundled recipe demand

The static scan covered all 114 manifest-listed recipe files and 1,123 ingredient rows. Complete normalized-phrase searches for **lentil starch**, **lentil starch powder**, **amidon de lentille**, and **fécule de lentille** found **zero full-recipe hits and zero ingredient-line hits**. Existing recipes that use whole lentils do not establish demand for a separated starch ingredient. No recipe link or relink is proposed.

## Measurements, forms, and substitutions

- AGT’s brochure reports source-product composition limits (moisture **≤10%**, protein **≥8%**, starch **≥65%**, fibre **≤6%**, and fat **≤3%**). These describe that product specification; they are not density, spoon/cup weights, or a reusable package conversion. The brochure does not state the product’s retail size or identify its starch-isolation method. [S02]
- Pulse Canada’s 40–50% dry-seed starch range and its processing/purity ranges are general pulse data, not a household measure or a lentil-flour-to-starch yield. [S03]
- The Canadian cultivar study reports laboratory properties for its isolated samples. It distinguishes flour from isolated starch and records cultivar-dependent digestion/thermal observations, but does not supply a culinary amount, generic density, or preparation yield. Do not import these assay values into active conversions or mappings. [S04]
- Add no ingredient form, default density, unit mapping, package-yield observation, conversion, recipe-specific substitution, or global/contextual substitution. Functional descriptions such as thickening and gel formation do not establish an equivalent mass replacement for cornstarch, potato starch, tapioca starch, or flour. [S02–S04]

## Exact proposed ingredient-reference JSON delta

Append one reference object to ingredient-references.v1.json; do not modify shared files as part of this proposal.

    {
      "id": "ingredient-ref-lentil-starch",
      "nameFr": "amidon de lentille",
      "nameEn": "lentil starch",
      "aliasesFr": [],
      "aliasesEn": [],
      "defaultDensity": null,
      "unitMappings": [],
      "updatedAt": "2026-10-15T00:00:00Z",
      "category": "FLOUR_AND_STARCH"
    }

No form, substitution, recipe link, or numeric catalog delta is proposed. The open B3 parent remains open.

## Proposed research-ledger JSON delta

Append the following record to `research-ledger.v1.json` if the identity reference is integrated. It uses the seven source IDs in this proposal’s source register. The identity decision is accepted; measurements and substitution remain explicitly unresolved within the limits below. No measurement observation or supported substitution finding is recorded.

    {
      "recordId": "ingredient-ref-lentil-starch",
      "recordType": "ingredient_reference",
      "identityState": "verified",
      "measurementState": "researched_no_supported_value",
      "substitutionResearchState": "researched_no_supported_substitute",
      "sources": [
        {
          "sourceId": "WP02-B3-LENTIL-STARCH-R141-S01",
          "url": "https://www.celiac.ca/gf-product-finder/",
          "title": "Celiac Canada, Gluten-Free Product Finder",
          "versionOrDate": "Last updated July 2026",
          "accessedOn": "2026-10-15",
          "locator": "AGT Foods entry Lentil Starch, UPC N/A; page note on food-manufacturer ingredients.",
          "supports": "Lists an AGT Foods item named Lentil Starch in a Canadian gluten-free product finder. The listing has no UPC and does not establish current consumer stock or a Québec retail package.",
          "sourceKind": "other"
        },
        {
          "sourceId": "WP02-B3-LENTIL-STARCH-R141-S02",
          "url": "https://www.agtfoods.com/uploads/01JS2QAH31GKZNNPGWEX07ZW6M.pdf",
          "title": "AGT Foods, PulsePlus Starches product brochure",
          "versionOrDate": "Product sheet IPL-AGTUSA-04-2025",
          "accessedOn": "2026-10-15",
          "locator": "Page 2, Lentil Starch product specification and PulsePlus Starches description.",
          "supports": "Lists Lentil Starch with product specification thresholds and describes pulse starches as fine powders from the natural starch content of milled, dehulled pulses, for viscosity and binding uses. The brochure is headed for petfood/feed ingredients and supplies no household measure or confirmed isolation method for this product.",
          "sourceKind": "manufacturer"
        },
        {
          "sourceId": "WP02-B3-LENTIL-STARCH-R141-S03",
          "url": "https://pulsecanada.com/processing/pulse-starch",
          "title": "Pulse Canada, Pulse Starches",
          "accessedOn": "2026-10-15",
          "locator": "Producing Pulse Starch, Pulse Starch Composition and Functionality, and Applications sections.",
          "supports": "Describes wet-isolated pulse starch and starch-rich air-classified products and includes lentil data. This general technical overview does not establish AGT's processing route, a kitchen measure, or a transferable replacement ratio.",
          "sourceKind": "other"
        },
        {
          "sourceId": "WP02-B3-LENTIL-STARCH-R141-S04",
          "url": "https://doi.org/10.1111/ijfs.13649",
          "title": "Lu et al., Physicochemical and digestion characteristics of flour and starch from eight Canadian red and green lentils",
          "versionOrDate": "International Journal of Food Science & Technology 53(3), 2018, 735–746",
          "accessedOn": "2026-10-15",
          "locator": "Materials and Methods on lentil flour and isolated-starch preparation; results and tables on sample composition, digestion, and thermal behavior.",
          "supports": "Separately prepares lentil flour and isolated starch from Canadian red and green lentil cultivars. The reported laboratory properties are sample-specific and do not establish a household measure, generic density, culinary yield, or substitution ratio.",
          "sourceKind": "other"
        },
        {
          "sourceId": "WP02-B3-LENTIL-STARCH-R141-S05",
          "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17059911/lentille",
          "title": "Office québécois de la langue française, lentille (GDT)",
          "accessedOn": "2026-10-15",
          "locator": "Preferred term, English translation, and Latin name.",
          "supports": "Supports Québec French lentille, English lentil, and Lens culinaris for the plant/seed; it does not attest the compound amidon de lentille.",
          "sourceKind": "regional_authority"
        },
        {
          "sourceId": "WP02-B3-LENTIL-STARCH-R141-S06",
          "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon",
          "title": "Office québécois de la langue française, amidon (GDT)",
          "versionOrDate": "Updated 2026",
          "accessedOn": "2026-10-15",
          "locator": "Preferred French term and usage note distinguishing amidon from fécule.",
          "supports": "Supports amidon as the general French term for food starch and explains that fécule more specifically refers to starch from tubers or underground organs. It does not attest a lentil-starch product name.",
          "sourceKind": "regional_authority"
        },
        {
          "sourceId": "WP02-B3-LENTIL-STARCH-R141-S07",
          "url": "urn:recipebook:local-audit:wp02-b3-lentil-starch-r141:2026-10-15",
          "title": "RecipeBook live package and archive, read-only audit",
          "accessedOn": "2026-10-15",
          "locator": "Bundled ingredient references and forms, research ledger, WP02 plan, prior proposals, and manifest-listed recipes; audit performed 2026-10-15.",
          "supports": "The audited catalog and archive contained no active lentil-starch owner, form, ledger candidate, legacy owner, focused prior proposal, or matching recipe line; R120 mentions lentil starch only as a comparator.",
          "sourceKind": "other"
        }
      ],
      "measurementObservations": [],
      "substitutionFindings": [],
      "decisions": [
        {
          "outcome": "accepted",
          "reason": "Accept the distinct food-ingredient identity lentil starch / amidon de lentille as an identity-only FLOUR_AND_STARCH reference. The Canadian product-finder listing and separate manufacturer product entry support the named ingredient, while Canadian cultivar research distinguishes isolated starch from lentil flour. Keep the French display descriptive and provisional because no reviewed Québec source attests the exact compound or a local package label; keep whole lentils, lentil flour, and starch-rich lentil flour distinct.",
          "sourceIds": [
            "WP02-B3-LENTIL-STARCH-R141-S01",
            "WP02-B3-LENTIL-STARCH-R141-S02",
            "WP02-B3-LENTIL-STARCH-R141-S03",
            "WP02-B3-LENTIL-STARCH-R141-S04",
            "WP02-B3-LENTIL-STARCH-R141-S05",
            "WP02-B3-LENTIL-STARCH-R141-S06",
            "WP02-B3-LENTIL-STARCH-R141-S07"
          ]
        },
        {
          "outcome": "unresolved",
          "reason": "The reviewed product thresholds, general pulse composition/process ranges, and cultivar-specific laboratory results do not establish a bulk-powder density, household measure, generic yield, or reusable unit mapping. Leave default density null and unit mappings empty; add no measurement observation unless same-product kitchen-scale evidence becomes available.",
          "sourceIds": [
            "WP02-B3-LENTIL-STARCH-R141-S01",
            "WP02-B3-LENTIL-STARCH-R141-S02",
            "WP02-B3-LENTIL-STARCH-R141-S03",
            "WP02-B3-LENTIL-STARCH-R141-S04",
            "WP02-B3-LENTIL-STARCH-R141-S07"
          ]
        },
        {
          "outcome": "unresolved",
          "reason": "No reviewed source establishes a product-specific or tested recipe replacement ratio for lentil starch. Functional thickening/binding descriptions and related starch research do not support a global or contextual substitution; keep substitution findings empty unless a same-product replacement study or tested recipe relationship is found.",
          "sourceIds": [
            "WP02-B3-LENTIL-STARCH-R141-S02",
            "WP02-B3-LENTIL-STARCH-R141-S03",
            "WP02-B3-LENTIL-STARCH-R141-S04",
            "WP02-B3-LENTIL-STARCH-R141-S07"
          ]
        }
      ]
    }

## Reconsideration criteria and limits

Revisit the wording if a Québec-facing French package, regulator, or terminology authority publishes an exact name for the same lentil-starch product. Replace the provisional display only with product-matched evidence; do not infer **fécule** from English “starch” or use generic **lentille** aliases.

If the exact AGT listing is confirmed to be only a petfood/feed ingredient or otherwise not for human-food use, withdraw this addition recommendation and keep the candidate outside the food catalog. If a current product specification clarifies whether the material is purified starch or a starch-rich fraction, narrow the product description accordingly; do not merge it with V-6000 lentil flour or any generic lentil flour.

Measurements or substitutions should be reopened only with a source for the same food-grade lentil-starch product and an explicit household measure, tested recipe relationship, or product-specific replacement formula. A laboratory cultivar result, ingredient list, or broad functional claim is insufficient.

## Source register

| ID | Source | Evidence and limits |
|---|---|---|
| **WP02-B3-LENTIL-STARCH-R141-S01** | Celiac Canada, [Gluten-Free Product Finder](https://www.celiac.ca/gf-product-finder/), last updated July 2026; AGT Foods entry **Lentil Starch**, UPC **N/A**. | Current Canadian human-food/gluten-free product-finder listing. The page says some entries may only be available as ingredients for food manufacturers; it is not a current consumer-stock or Québec retail listing. |
| **WP02-B3-LENTIL-STARCH-R141-S02** | AGT Foods, [PulsePlus Starches product brochure](https://www.agtfoods.com/uploads/01JS2QAH31GKZNNPGWEX07ZW6M.pdf), product sheet **IPL-AGTUSA-04-2025**, p. 2. | Lists Lentil Starch with product-specification thresholds and describes PulsePlus starches as fine powders from the natural starch content of milled, dehulled pulses, with food-grade use for viscosity/binding. The brochure is headed for petfood/feed ingredients; it does not prove Québec retail scope, a particular isolation method, or a household measure. |
| **WP02-B3-LENTIL-STARCH-R141-S03** | Pulse Canada, [Pulse Starches](https://pulsecanada.com/processing/pulse-starch), current page. | Defines pulse-starch processing and distinguishes wet-isolated starch from starch-rich air-classified product; includes lentil data. General technical industry source, not a product specification for AGT’s item. |
| **WP02-B3-LENTIL-STARCH-R141-S04** | Zhan-Hui Lu, Elizabeth Donner, Rong Tsao, D. Dan Ramdath, and Qiang Liu, [“Physicochemical and digestion characteristics of flour and starch from eight Canadian red and green lentils”](https://doi.org/10.1111/ijfs.13649), *International Journal of Food Science & Technology* 53(3), 2018, 735–746. | Primary study from Agriculture and Agri-Food Canada on Canadian lentil cultivars. It separately prepares lentil flour and isolated starch and reports sample-specific physicochemical/digestion results. Research evidence does not establish retail scope, a kitchen measure, or a substitution ratio. |
| **WP02-B3-LENTIL-STARCH-R141-S05** | Office québécois de la langue française, [lentille (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17059911/lentille). | Supports Québec French **lentille**, English **lentil**, and Latin *Lens culinaris* for the plant/seed. It does not attest the compound **amidon de lentille**. |
| **WP02-B3-LENTIL-STARCH-R141-S06** | Office québécois de la langue française, [amidon (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), updated 2026. | Prefers **amidon** for food starch and says **fécule** more specifically refers to starch from tubers or other underground organs. It does not approve a lentil-starch product name. |
| **WP02-B3-LENTIL-STARCH-R141-S07** | Live bundled package, research ledger, WP02 plan, prior proposals, and manifest-listed recipes (read-only audit, 2026-10-15). | No active lentil-starch owner, form, ledger candidate, legacy owner, prior focused proposal, or matching recipe line was found. The WP02 B3 parent remains open; R120 mentions lentil starch only as a comparator. |

No app, Gradle, unit, instrumentation, emulator, or deployment tests were run. This is a proposal-only review; the project rule also waives testing for JSON-only database additions.
