# WP02 B2 — Brazilian pinhão flour identity review (R84)

- **Reviewed:** 2026-10-13.
- **Status:** Proposal only. No shared catalog, form, ledger, recipe, plan, roadmap, checklist, code, test, or emulator files are changed by this review.
- **Scope:** One distinct open Section 04 B2 flour identity: Brazilian pinhão flour from the edible seed of `Araucaria angustifolia`. This is separate from the generic Pinus pine-nut flour boundary held in R69, from whole pine nuts, and from the existing Bunya identity (`Araucaria bidwillii`).
- **Source-ID prefix:** `WP02-B2-PINHAO-FLOUR-IDENTITY-R84-20261013`. IDs are proposal-local until any future integration.

## Recommendation

**Add identity-only Brazilian pinhão flour / farine de graines du pin du Paraná in FLOUR_AND_STARCH.** Keep the French display explicitly provisional for Québec, leave both alias arrays empty, and add no forms, active measures, density, unit mappings, conversions, yields, recipe links, or substitutions.

The product boundary is flour made from edible pinhão seeds of `Araucaria angustifolia`. A current Brazilian maker lists a 500 g “Farinha Integral de Pinhão de Araucária” food product made by drying and milling harvested pinhão; Embrapa documents the same species as a flour ingredient for baked foods and product development. The evidence supports the ingredient identity, but does not establish Canadian/Québec availability, one standard process, or a common kitchen conversion. [S01–S04, S08]

Use the source-food word `pinhão` in the English display so the unresolved broad queries `pine seed flour` and `pine nut flour` do not resolve to this one Araucaria product. English papers translate the term as “Brazilian pine seed flour,” but that phrase is broader than the reviewed species and would reopen the generic boundary held in R69. Do not add it as an alias. [S05–S08]

The French display uses the species-qualified French common name `pin du Paraná` as a transparent descriptive compound. Codex lists `pin du Paraná` under its edible Araucaria nut group; EPPO lists it as a French common name for `A. angustifolia`. Neither source is Québec terminology, and no Québec food label for this flour was found, so the full flour phrase remains provisional. Do not use the broader Codex term `noix d’araucaria` as a display or alias: Codex assigns that group to `A. bidwillii`, `A. angustifolia`, and `A. araucana`, which would blur the current Bunya boundary. [S05–S07]

## Product identity and boundaries

| Question | Finding |
|---|---|
| What ingredient is this? | A milled human-food ingredient from Brazilian pinhão, identified in primary product and research sources as the edible seed of `Araucaria angustifolia`. Embrapa describes raw pinhão flour and baking uses; a technical thesis describes drying and milling these seeds into flour; a Brazilian maker currently lists an integral pinhão flour. [S01–S03, S08] |
| Is it a Pinus pine nut? | No. `Araucaria` is a separate genus. Do not expand or alias the active `pine nuts / noix de pin` row or revive R69’s generic pine-nut flour hold. OQLF’s `pignon` entry supports Québec pine-seed wording for `Pinus pinea`, not this Araucaria flour. [S05–S07] |
| Is it bunya flour? | No. The active `ingredient-ref-bunya-nuts` reference is the edible seed/kernel of `Araucaria bidwillii`. Keep its `bunya nuts / noix de bunya` display and current alias unchanged. The Codex term `noix d’araucaria` covers multiple Araucaria species and is not an acceptable single-species display. [S05] |
| Are raw, cooked, and seed-coat flours one process? | No common process specification is established. Embrapa offers a raw flour process; Capella et al. study raw and cooked seeds dried and milled as flour; Embrapa’s 2023 integral-flour work deliberately includes kernel and shell. These are process variations, not evidence of interchangeable forms or measures. The proposed row records the ingredient identity only; add no forms. [S01, S03, S04] |
| Is there a Québec product name? | No Québec/Canadian retail listing or OQLF flour headword was located. `Pin du Paraná` is attested in French terminology and Codex’s food classification and supports a descriptive fr-CA display; the full `farine de graines du pin du Paraná` compound is provisional, not an OQLF or Québec-label claim. [S05–S07] |

The root catalog already contains separate active identities for whole pine nuts, pine-nut butter, and Bunya nuts. None is a flour owner. [R69](wp02-b2-pine-nut-flour-boundary-review-20261013-round69.md) reviewed unqualified pine-nut flour and explicitly excluded Brazilian `A. angustifolia` seed flour from that candidate; it did not decide this species-specific flour identity. R84 continues the open B2 flour review without changing the R69 hold.

## Québec naming and picker boundary

The active search implementation in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes case, accents, and punctuation, prefers complete word-phrase matches, then falls back to substring matches. The projections below were checked against that logic and the current reference catalog.

| Search term | Current result | With the proposed row | Decision |
|---|---|---|---|
| `pinhão` / `pinhão flour` | No result | `ingredient-ref-pinhao-flour` | Use this source-named, species-bound term as the English display. |
| `farine de graines du pin du Paraná` / `pin du Paraná` | No result | `ingredient-ref-pinhao-flour` | Descriptive French display only; keep provisional and alias-free. |
| `pine seed flour` / `pine nut flour` | No result | No result | Keep both generic keys unallocated; do not add either as a display or alias. |
| `Brazilian pine seed flour` | No result | No result | The literature’s translated phrase is not an alias because the broad phrase would select one species-specific row. |
| `pine nuts` / `noix de pin` | `ingredient-ref-pine-nuts` | `ingredient-ref-pine-nuts` | Whole pine-seed ownership remains unchanged. |
| `pine nut` | `ingredient-ref-pine-nut-butter` | `ingredient-ref-pine-nut-butter` | The existing complete-phrase picker result remains unchanged. |
| `bunya nuts` / `noix de bunya` | `ingredient-ref-bunya-nuts` | `ingredient-ref-bunya-nuts` | Keep the `A. bidwillii` whole-seed identity separate. |
| `pin` | Pine nuts plus pine-nut butter | Pine nuts, pine-nut butter, and pinhão flour | Broad French one-word query displays all three source-specific choices. |
| `araucaria` / `noix d’araucaria` | No result | No result | Do not introduce a genus-wide term that would narrow a multi-species query to one flour row. |

Do not add `Brazilian pine seed flour`, `pine seed flour`, `pine nut flour`, `pine nut meal`, `araucaria flour`, `araucaria seed flour`, `noix d’araucaria`, `pignon`, or `noix de pin` as aliases. Do not change the whole-pine-nut or Bunya rows.

## Live ownership, archive, and recipe demand

Read-only snapshot on 2026-10-13:

| Surface | Count |
|---|---:|
| Active ingredient references | 1,412 |
| Ingredient forms | 104 |
| Research-ledger records | 1,751 |
| Legacy import candidates | 63 |
| Manifest-listed recipes / ingredient rows | 114 / 1,123 |

The ownership scan covered reference IDs, names and aliases; form IDs, labels and match terms; legacy IDs, names and aliases; and ledger record IDs. It found no exact owner or collision for `ingredient-ref-pinhao-flour`, `Brazilian pinhão flour`, `pinhão flour`, or `farine de graines du pin du Paraná`. No Araucaria-flour form or previous Araucaria/pinhão flour ledger record exists.

Related active ownership remains:

| Current owner | Current scope |
|---|---|
| `ingredient-ref-pine-nuts` | `pine nuts / noix de pin`; whole-seed identity, category NUT_SEED_AND_DRIED_FRUIT, no aliases, density null, unit mappings empty. |
| `ingredient-ref-pine-nut-butter` | `pine nut butter / beurre de pignon de pin`; butter identity, category FAT_AND_OIL, no aliases, density null, unit mappings empty. |
| `ingredient-ref-bunya-nuts` | `bunya nuts / noix de bunya` with English alias `bunya nut`; edible `A. bidwillii` seed/kernel, category NUT_SEED_AND_DRIED_FRUIT. |

The proposal/batch archive was searched for `pinhão flour`, `pinhão`, `Araucaria angustifolia flour`, `Brazilian pine seed flour`, `farine de graines du pin du Paraná`, and the proposed ID/prefix. The only adjacent mention is R69’s explicit exclusion of Brazilian `A. angustifolia` seed flour from its generic Pinus pine-nut flour review. The live B2 parent remains open. No prior proposal or batch allocates this species-specific flour candidate.

Across the 114 manifest-listed recipe JSON files and 1,123 ingredient rows, the scan of ingredient text, normalized ingredient names, reference IDs, and form IDs found **zero** matches for `pinhão`, `pinhao`, `Araucaria`, `Araucaria angustifolia`, `Brazilian pine seed flour`, `pine seed flour`, `pine nut flour`, or the proposed French display. The corpus supplies no recipe demand or links.

## Numeric, form, yield, and substitution evidence

- **Package/serving numbers:** The Farinhas de Cunha listing is a 500 g package and its nutrition panel uses a 50 g label serving. These are one seller’s package and nutrition-label quantities, not a household recipe measure or a mass/volume relation. Keep them in source notes only. [S02]
- **Density, cup weight, and conversions:** No directly supported bulk density, grams-per-cup value, or kitchen unit mapping was found. Keep the proposed density null and unit mappings empty; add no conversions.
- **Process and yield:** Research reports process-specific drying and milling conditions. It does not establish a reusable flour yield or cooking conversion across raw, cooked, kernel-only, and integral seed-plus-shell preparations. Add no form or yield.
- **Substitution:** Food studies use pinhão flour in particular gluten-free cake and snack formulations. Nascimento et al. tested pinhão/rice blend ratios of 12.5%, 25%, 37.5%, and 50%; those experimental ratios are not a general replacement rule for rice, wheat, or other flour. Add no global or contextual substitution finding and no recipe link. [S08]

## Exact future JSON delta

If accepted for integration, add one reference row:

~~~json
{
  "id": "ingredient-ref-pinhao-flour",
  "nameFr": "farine de graines du pin du Paran\u00e1",
  "nameEn": "Brazilian pinh\u00e3o flour",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-13T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
~~~

Add one research-ledger record with identity evidence and no reusable numeric or substitution finding:

~~~json
{
  "recordId": "ingredient-ref-pinhao-flour",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP02-B2-PINHAO-FLOUR-IDENTITY-R84-20261013-S01",
      "url": "https://www.embrapa.br/ativos-para-parcerias/detalhe/-/ativo-parceria/2661/processo-de-descascamento-e-secagem-de-pinhao-araucaria-angustifolia-para-obtencao-de-farinha",
      "title": "Embrapa, Processo de descascamento e secagem de pinhão (Araucaria angustifolia) para obtenção de farinha",
      "accessedOn": "2026-10-13",
      "locator": "Product/process description, raw flour identity, stated baking uses, and technology-transfer status.",
      "supports": "Embrapa identifies a process for raw flour from Araucaria angustifolia pinhão seeds and lists bread, cake, savoury, and sweet applications. The page offers the process for partnership at TRL/MRL 5; it does not establish broad retail availability.",
      "sourceKind": "extension"
    },
    {
      "sourceId": "WP02-B2-PINHAO-FLOUR-IDENTITY-R84-20261013-S02",
      "url": "https://www.farinhasdecunha.com.br/product-page/farinha-integral-de-pinh%C3%A3o-de-arauc%C3%A1ria",
      "title": "Farinhas de Cunha, Farinha Integral de Pinhão de Araucária - 500g",
      "accessedOn": "2026-10-13",
      "locator": "Product title and description, package size, nutrition label, and delivery scope.",
      "supports": "Current Brazilian maker listing for a human-food integral pinhão flour. The seller says harvested pinhões are dried and milled into pure flour without additives; it lists a 500 g package, a 50 g nutrition-label portion, and delivery within Brazil. The page does not publish a Latin species on the SKU or establish Canadian/Québec sale.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-B2-PINHAO-FLOUR-IDENTITY-R84-20261013-S03",
      "url": "https://www.infoteca.cnptia.embrapa.br/handle/doc/1159384",
      "title": "Embrapa Florestas, Farinha integral de pinhão [Araucaria angustifolia]: um alimento funcional rico em fibras e compostos antioxidantes",
      "versionOrDate": "2023",
      "accessedOn": "2026-10-13",
      "locator": "Description of whole-seed flour made from pinhões containing kernel and shell.",
      "supports": "Primary technical publication identifies Araucaria angustifolia integral flour and deliberately processes whole seeds containing kernel and shell. This is one research-defined preparation, not a universal consumer flour specification or proof that shell-in and kernel-only flour are equivalent.",
      "sourceKind": "food_composition"
    },
    {
      "sourceId": "WP02-B2-PINHAO-FLOUR-IDENTITY-R84-20261013-S04",
      "url": "https://doi.org/10.5380/cep.v27i1.15009",
      "title": "Capella, Penteado, and Baldi, Semente de Araucaria angustifolia: aspectos morfológicos e composição química da farinha",
      "versionOrDate": "2009",
      "accessedOn": "2026-10-13",
      "locator": "Abstract and study methods comparing raw and cooked Araucaria angustifolia seeds dried at 65 °C and milled as flour.",
      "supports": "Primary research establishes raw- and cooked-seed pinhão flours as food-processing preparations and reports sample-specific composition differences. It does not provide a household measure, standard density, yield, or transferable form conversion.",
      "sourceKind": "food_composition"
    },
    {
      "sourceId": "WP02-B2-PINHAO-FLOUR-IDENTITY-R84-20261013-S05",
      "url": "https://workspace.fao.org/sites/codex/Meetings/CX-718-43/REP11_PRf.pdf",
      "title": "Codex Alimentarius Commission, REP11/PR Annex VI, Revision of the Codex Classification of Foods and Animal Feeds",
      "versionOrDate": "2011",
      "accessedOn": "2026-10-13",
      "locator": "French tree-nut group, TN 3101 Noix d'araucaria, listed species, and the Pin du Paraná synonym entry.",
      "supports": "Official French food-commodity taxonomy lists Araucaria bidwillii, A. angustifolia, and A. araucana under noix d'araucaria, and points Pin du Paraná / A. angustifolia to that group. This supports the species-qualified French common name but warns that noix d'araucaria is not a single-species name.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-B2-PINHAO-FLOUR-IDENTITY-R84-20261013-S06",
      "url": "https://gd.eppo.int/taxon/ARUAN",
      "title": "EPPO Global Database, Araucaria angustifolia (ARUAN)",
      "accessedOn": "2026-10-13",
      "locator": "Preferred scientific name and common-name table.",
      "supports": "Identifies Araucaria angustifolia and lists Brazilian pine / Paraná pine in English and araucaria du Brésil / pin du Paraná in French. It is botanical terminology, not a Québec flour label or food-product specification.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-B2-PINHAO-FLOUR-IDENTITY-R84-20261013-S07",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083473/pignon",
      "title": "Office québécois de la langue française, pignon (GDT)",
      "accessedOn": "2026-10-13",
      "locator": "Preferred French names, English equivalents, and Latin name for culinary pine seed.",
      "supports": "Supports Québec food wording pignon / noix de pin and the English pine seed / pine nut for Pinus pinea. It does not identify Araucaria seeds or name a pinhão flour product.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-B2-PINHAO-FLOUR-IDENTITY-R84-20261013-S08",
      "url": "https://www.scielo.br/j/cr/a/ZG6PLgrZVbysGCPwyYRBdmp/?lang=en",
      "title": "Nascimento et al., Influence of Brazilian pine seed flour addition on rheological, chemical and sensory properties of gluten-free rice flour cakes",
      "versionOrDate": "2018",
      "accessedOn": "2026-10-13",
      "locator": "Abstract, materials and methods, flour/rice ratios, and conclusions.",
      "supports": "Primary study identifies Brazilian pine seeds as Araucaria angustifolia pinhão, prepares flour from dried and milled seeds, and tests specified rice-flour blends in gluten-free cakes. The 12.5%–50% experimental blend levels are formulation-specific and are not a general substitution ratio.",
      "sourceKind": "food_composition"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add identity-only Brazilian pinhão flour / farine de graines du pin du Paraná for flour from edible Araucaria angustifolia seeds. The French flour compound is provisional for Québec and the English display retains the source-specific term pinhão to avoid assigning generic pine seed flour or pine nut flour queries to one species. Preserve separate Pinus pine-nut and Araucaria bidwillii bunya identities. Add no aliases, forms, density, unit mappings, measures, conversions, yields, recipe links, or substitutions; product servings, research processes, and blend ratios remain source-specific.",
      "sourceIds": [
        "WP02-B2-PINHAO-FLOUR-IDENTITY-R84-20261013-S01",
        "WP02-B2-PINHAO-FLOUR-IDENTITY-R84-20261013-S02",
        "WP02-B2-PINHAO-FLOUR-IDENTITY-R84-20261013-S03",
        "WP02-B2-PINHAO-FLOUR-IDENTITY-R84-20261013-S04",
        "WP02-B2-PINHAO-FLOUR-IDENTITY-R84-20261013-S05",
        "WP02-B2-PINHAO-FLOUR-IDENTITY-R84-20261013-S06",
        "WP02-B2-PINHAO-FLOUR-IDENTITY-R84-20261013-S07",
        "WP02-B2-PINHAO-FLOUR-IDENTITY-R84-20261013-S08"
      ]
    }
  ]
}
~~~

The proposed delta is one new ingredient-reference row and one matching research-ledger record. It adds no form, recipe link, generated search code, app logic, or runtime conversion. Current AGENTS.md says database-JSON-only additions need no tests; this proposal review runs no tests or emulator.

## Source register

All sources were checked on 2026-10-13. Source IDs below are proposal-local until any future ledger integration.

| ID | Source and direct support | Limits |
|---|---|---|
| **WP02-B2-PINHAO-FLOUR-IDENTITY-R84-20261013-S01** | Embrapa, [Processo de descascamento e secagem de pinhão (Araucaria angustifolia) para obtenção de farinha](https://www.embrapa.br/ativos-para-parcerias/detalhe/-/ativo-parceria/2661/processo-de-descascamento-e-secagem-de-pinhao-araucaria-angustifolia-para-obtencao-de-farinha). Defines raw flour from this pinhão species, food uses, and a process offered for partnership. | Technology-transfer page at TRL/MRL 5; not proof of current general retail availability. |
| **WP02-B2-PINHAO-FLOUR-IDENTITY-R84-20261013-S02** | Farinhas de Cunha, [Farinha Integral de Pinhão de Araucária - 500g](https://www.farinhasdecunha.com.br/product-page/farinha-integral-de-pinh%C3%A3o-de-arauc%C3%A1ria). Current seller product description, dried/milled process, 500 g package, nutrition label, and Brazil-only delivery. | Brazil domestic listing; no Canadian/Québec sale. Page does not state a Latin species on this SKU, and package/label quantities do not give a kitchen conversion. |
| **WP02-B2-PINHAO-FLOUR-IDENTITY-R84-20261013-S03** | Embrapa Florestas, [Farinha integral de pinhão (Araucaria angustifolia)](https://www.infoteca.cnptia.embrapa.br/handle/doc/1159384), 2023. Describes flour from whole pinhão containing kernel and shell. | A technical research preparation; not a common retail specification or evidence that every flour includes shell. |
| **WP02-B2-PINHAO-FLOUR-IDENTITY-R84-20261013-S04** | Capella et al., [Semente de Araucaria angustifolia: aspectos morfológicos e composição química da farinha](https://doi.org/10.5380/cep.v27i1.15009), 2009. Primary study describes flour from raw and cooked seeds. | Sample/process-specific research; does not establish a shared density, yield, or conversion. |
| **WP02-B2-PINHAO-FLOUR-IDENTITY-R84-20261013-S05** | Codex Alimentarius Commission, [REP11/PR Annex VI](https://workspace.fao.org/sites/codex/Meetings/CX-718-43/REP11_PRf.pdf), 2011. French human-food classification uses noix d’araucaria for three Araucaria species and lists pin du Paraná for A. angustifolia. | Supports a French common name and food group, not an OQLF preferred term or Québec flour product; its generic group also includes Bunya. |
| **WP02-B2-PINHAO-FLOUR-IDENTITY-R84-20261013-S06** | EPPO Global Database, [Araucaria angustifolia](https://gd.eppo.int/taxon/ARUAN). Botanical name and English/French common-name table. | Species terminology only; no food product or Québec retail label. |
| **WP02-B2-PINHAO-FLOUR-IDENTITY-R84-20261013-S07** | OQLF, [pignon (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083473/pignon). Québec terminology for the culinary pine seed, English equivalents, and Latin name. | Applies to the Pinus term, not Araucaria pinhão or flour. |
| **WP02-B2-PINHAO-FLOUR-IDENTITY-R84-20261013-S08** | Nascimento et al., [Influence of Brazilian pine seed flour addition on gluten-free rice flour cakes](https://www.scielo.br/j/cr/a/ZG6PLgrZVbysGCPwyYRBdmp/?lang=en), 2018. Primary study identifies A. angustifolia pinhão flour and tests named cake formulations. | Experimental rice-flour blend percentages do not provide a general substitution, kitchen measure, or commercial product standard. |

## Static review record

- Re-read AGENTS.md, the open WP02 B2 plan item, current reference/form/legacy/ledger data, relevant proposals and batches, and current IngredientSearch.kt.
- Confirmed snapshot counts: 1,412 active references, 104 forms, 1,751 research-ledger records, 63 legacy candidates, 114 recipes, and 1,123 ingredient rows.
- Searched the archive and live data for the proposed ID and English/French/source terms. Confirmed no duplicate reference/form/legacy/ledger owner and no prior species-specific Araucaria/pinhão flour decision; R69 explicitly excluded this different taxon from its generic Pinus flour hold.
- Scanned all recipe ingredient rows for pinhão, Araucaria, the scientific name, generic pine-seed flour wording, and the proposed French phrase; found zero candidate matches.
- Projected current and proposed search outcomes with the current complete-phrase-first matcher. Verified generic pine-seed and pine-nut flour queries remain unmatched and existing whole pine-nut, butter, and bunya queries retain their owners.
- Static checks after saving: UTF-8 without BOM, final newline, no trailing whitespace, valid JSON for both proposed snippets, source-ID uniqueness and source-register mapping, HTTPS source URL syntax, and local Markdown link resolution. No Gradle tasks or emulator were run.
