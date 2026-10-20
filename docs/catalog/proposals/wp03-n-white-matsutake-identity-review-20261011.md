# WP03 Section N proposal — Québec white matsutake identity

- **Reviewed:** 2026-10-11
- **Status:** proposal only. This review creates this file alone; no seed data, ledger, recipe, plan, roadmap, code, or test file was changed. No tests were run.
- **Scope:** the Québec eastern matsutake product identified as *Tricholoma magnivelare*, its French/English culinary names, and the boundary with the Japanese *T. matsutake* and western North American *T. murrillianum*.
- **Recommendation:** add one identity-only reference, `ingredient-ref-white-matsutake-mushroom`, with English display `white matsutake mushroom`, French display `tricholome à grand voile`, and English alias `white matsutake`. Keep unqualified `matsutake` / `matsutaké`, `American matsutake`, `pine mushroom`, and botanical names out of aliases. Do not add forms, recipe links, density, unit mappings, package yields, conversions, or substitutions in this batch.
- **Plan state:** Section N remains open. No bundled recipe currently names matsutake.

## Scope and identity boundary

Section N’s broader item for documented culinary fungi remains open. Huitlacoche was covered in a prior [identity proposal](wp03-section-n-huitlacoche-identity-20261010.md) and is now integrated as an active identity, so it is excluded from this batch. The integrated named identities excluded here are cremini, portobello, bunashimeji, enoki, king oyster, lion’s mane, maitake, morel, chanterelle, shiitake, oyster, snow fungus, straw mushroom, wood ear, culinary truffle, and Haitian djon djon. The generic mushroom and separate ground dried candy-cap rows also already exist; neither identifies a matsutake.

This proposal chooses one bounded Québec market product: eastern North American *Tricholoma magnivelare*, called white matsutake in English and tricholome à grand voile in French. Canadian government terminology and Québec mycological sources support that name pair and product boundary. A 2017 phylogenetic study clarifies that the accepted name *T. magnivelare* applies to eastern USA and Canada; *T. murrillianum* applies to western USA and Canada; and *T. matsutake* is the separate Japanese species. The unqualified market word matsutake therefore should not be treated as a safe universal species alias. [S01–S03]

## Current package and collision audit

I checked all 114 manifest-listed recipe files (1,123 ingredient rows), 1,008 active ingredient references, 66 active forms, the 75 legacy candidates, the 1,289 research-ledger records, both substitution-rule files, and the package-yield list.

| Area | Current finding | Proposal effect |
|---|---|---|
| Active references | No active name, alias, ID, or exact binomial contains `matsutake`, `matsutaké`, `magnivelare`, `murrillianum`, or `tricholome à grand voile`. The related active rows are only the generic `ingredient-ref-mushroom` (`mushroom` / `champignons`; English alias `mushrooms`) and `ingredient-ref-culinary-truffle` (`truffle` / `truffe`). | Add one specific row; preserve the generic mushroom identity and culinary truffle separately. |
| Legacy candidates | No matsutake candidate. The only fungal-looking candidate is the already-inactive duplicate `ingredient-ref-mushrooms` for generic mushrooms. | Do not reactivate or merge the legacy generic row. |
| Forms | No matsutake, *Tricholoma*, or `grand voile` form exists. | No form rows in this proposal. |
| Recipe rows | No bundled ingredient row contains the target name, binomial, or proposed displays. The four bundled mushroom rows remain generic mushroom in recipe 037 and 089, plus the separately scoped candy-cap row in recipe 100. | No recipe link or relinking is supported. |
| Substitutions | Both substitution-rule files are empty. No local evidence supports replacing matsutake with generic mushroom, another *Tricholoma*, or another named fungus. | Add no global or contextual substitution. |
| Package yields and measures | The package-yield list contains no matsutake record. No active unit mapping, density, yield, or conversion is present for this identity. | Leave numeric data absent. |
| Ledger | No matsutake, *T. magnivelare*, or candidate reference record exists. | If accepted, add a new identity record using the proposal’s source IDs; keep those IDs proposal-local until integration. |

The current picker prefers complete word phrases and falls back to partial matching. A query for `matsutake` can therefore find the proposed white product through its display or alias; the displayed `white` qualifier keeps the eastern product visible. This review does not map the broad word to a generic mushroom or to Japanese *T. matsutake*. If a separate Japanese or western matsutake product is later added, the picker should show the species/product distinction rather than merge the rows.

## Recipe demand

| Source and line | Wording | What it supports | What it does not support |
|---|---|---|---|
| Bundled corpus, all 114 recipe files | No ingredient row mentions matsutake or a related name. | No direct bundled-recipe demand or recipe link. | No reason to infer one of the generic mushroom rows is matsutake. |
| Télé-Québec, *Trio de champignons sauvages rôtis*, ingredient line | `1 champignon matsutake`; instructions cut it into quarters and cook it in a pan with other mushrooms. | Current Québec culinary use of a matsutake-labeled product. | The recipe does not give a binomial, provenance, mass, size, or preparation state; do not link it specifically to *T. magnivelare*. [S08] |

The external Québec recipe makes the market name relevant, but its unqualified `matsutake` does not establish that the recipe uses the eastern species. It remains unlinked in this proposal.

## Proposed reference row

The proposed category follows the catalog’s existing product taxonomy for culinary fungi; it is not a botanical classification.

```json
{
  "id": "ingredient-ref-white-matsutake-mushroom",
  "nameFr": "tricholome \u00e0 grand voile",
  "nameEn": "white matsutake mushroom",
  "aliasesFr": [],
  "aliasesEn": ["white matsutake"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-11T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

No scientific-name field exists in the active reference schema. Keep *Tricholoma magnivelare* in the source-backed scope and ledger notes; do not invent a schema field or use the binomial as a picker alias in this batch.

### Name and search decisions

| Term | Decision | Evidence and boundary |
|---|---|---|
| `tricholome à grand voile` | French display | TERMIUM lists it as the correct French term for *T. magnivelare*. Québec forestry and mycology sources also pair it with the matsutake product. [S01, S05–S06] |
| `white matsutake mushroom` | English display | A current Québec retail listing uses this exact product phrase. [S07] |
| `white matsutake` | English alias | TERMIUM lists it as a correct English name for *T. magnivelare*, and MycoQuébec calls this Québec species the White Matsutake. [S01, S03] |
| `matsutake`, `matsutaké` | Hold as aliases | Québec sources use the unqualified term for *T. magnivelare*, but the same market term also refers to Japanese *T. matsutake* and western *T. murrillianum*. The taxonomic study shows these are separate species. Keep the common term searchable as partial text through the clearly qualified white display, but do not store it as an exact alias. [S02–S06, S08] |
| `American matsutake`, `pine mushroom` | Hold as aliases | TERMIUM lists both for *T. magnivelare*, but the source predates the 2017 regional taxonomic clarification; `pine mushroom` is also used for western products. Avoid names that can collapse eastern and western products. [S01–S02] |
| `matsutake blanc`, botanical binomials, and descriptive flavor names | Do not add | No reviewed Québec authority establishes these as stable picker aliases for the proposed identity. Flavor and taxonomy notes remain source evidence, not synonyms. |

A Québec marketplace listing currently names a product `Matsutake (Tricholoma matsutake)` and says it is resold from British Columbia. That listing is not enough to establish the specimen’s species. The 2017 study assigns western Canada to *T. murrillianum*, so keep this product label as a naming-conflict example rather than adopting its scientific-name claim or adding `Tricholoma matsutake` as an alias. [S02, S09]

## Forms, measurements, and substitutions

Québec sources document fresh and dried *T. magnivelare* market products. They support that both product states exist, but the bundled package has no matsutake ingredient line, so this proposal does not add fresh/dried form rows. No reviewed source supports a universal powder, canned, reconstituted, or soaking-liquid form for this species. [S05–S06]

Télé-Québec’s one-mushroom recipe line is species-unspecified. A local supplier sells a White Matsutake package marked 20 g, but that is package size, not the mass of one mushroom or an ingredient conversion. Neither source supports a reusable count-to-mass mapping, density, package yield, fresh-to-dried yield, or dried-to-fresh conversion. No numeric value is proposed. [S07–S08]

No source supports a matsutake substitute. Leave substitution records absent; do not infer interchangeability from shared genus, flavor, or the generic mushroom category.

## Proposed ledger disposition

If the row is accepted, add an `ingredient_reference` record for `ingredient-ref-white-matsutake-mushroom` with these source-backed states:

- `identityState`: `verified`
- `measurementState`: `researched_no_supported_value`
- `substitutionResearchState`: `researched_no_supported_substitute`
- Identity sources: S01–S07
- Recipe/numeric boundary source: S08
- Conflicting market label source: S09
- Accepted decision: add the narrowly named Québec eastern white matsutake identity only; no forms, recipe links, measurements, package yields, conversions, or substitutions.

Source IDs are proposal-local. Root may assign canonical ledger IDs during integration.

## Source register

Sources were accessed on 2026-10-11. The sources establish naming, regional taxonomy, product availability, or recipe wording as described; none is used to infer a value beyond that scope.

| Source ID | Source | Supports and limits |
|---|---|---|
| **WP03-WHITE-MATSUTAKE-20261011-S01** | Translation Bureau of Canada, [TERMIUM Plus — *Tricholoma magnivelare*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frr&lang=fra&srchtxt=GASTRONOMIQUE), fiche 8. | Gives *T. magnivelare*, English `white matsutake`, `American matsutake`, and `pine mushroom`, and French `tricholome à grand voile`. Its 2014 common-name scope predates the 2017 regional taxonomic clarification; broad English labels are not adopted. |
| **WP03-WHITE-MATSUTAKE-20261011-S02** | Trudell et al., [“North American matsutake: names clarified and a new species described,” *Mycologia* 109(3), 2017](https://pubmed.ncbi.nlm.nih.gov/28609221/). | Molecular and morphological evidence places *T. magnivelare* in eastern USA/Canada, *T. murrillianum* in western USA/Canada, and *T. mesoamericanum* in Mexico. It distinguishes these North American taxa from Japanese *T. matsutake*. |
| **WP03-WHITE-MATSUTAKE-20261011-S03** | MycoQuébec, [*Tricholoma magnivelare*](https://mycoquebec.org/scripts/fiche_pdf.php?dest=D&tag=Tricholoma+magnivelare), updated 2026. | Identifies the Québec species as White Matsutake, says it is harvested for consumption and sale in Québec, and distinguishes it genetically and geographically from western *T. murrillianum* and Eurasian *T. matsutake*. Québec identity and local market evidence; not a mass-conversion source. |
| **WP03-WHITE-MATSUTAKE-20261011-S04** | Gouvernement du Québec, [Dunes-de-Tadoussac state-of-knowledge report](https://cdn-contenu.quebec.ca/cdn-contenu/parcs/documents/rapport-etat-connaissances-Dunes-de-Tadoussac.pdf). | Records *T. magnivelare* in local jack-pine stands and describes the matsutake as a sought edible mushroom. Local ecological/culinary scope, not a measure or product synonym list. |
| **WP03-WHITE-MATSUTAKE-20261011-S05** | UQAC / Forêt modèle du lac Saint-Jean, [Gray-pine forest mushroom guide](https://sdeir.uqac.ca/id/eprint/19/1/030119055.pdf). | Pairs English `White Matsutake` with French `Matsutake ou Tricholome à grand voile`, and documents fresh cooking and dried conservation. Field-guide and preparation evidence; no conversion or mass equivalence. |
| **WP03-WHITE-MATSUTAKE-20261011-S06** | Créneau d’excellence AgroBoréal, [Tricholome à grand voile / Matsutake](https://agroboreal.com/project/tricholome-a-grand-voile-matsutake). | Names *T. magnivelare*, lists fresh and dried procurement forms, and identifies Québec buyers. Industry source; its unqualified `matsutaké` is not adopted as an alias because of the species collision. |
| **WP03-WHITE-MATSUTAKE-20261011-S07** | Wachiya, [FaunENord Eeyou Istchee products](https://wachiya.com/collections/cree-food/products/faunenord-eeyou-istchee-products). | A Canadian retailer lists a Northern Québec `White Matsutake Mushroom (20 g)` product. Supports exact English product wording and a package size only; it does not identify the taxon, state, or individual mushroom mass. |
| **WP03-WHITE-MATSUTAKE-20261011-S08** | Télé-Québec, [Trio de champignons sauvages rôtis](https://cuisinez.telequebec.tv/recettes/6220/trio-de-champignons-sauvages-rotis). | Lists one unqualified `champignon matsutake`, cut into quarters and cooked in a pan. Direct Québec recipe evidence; no binomial, provenance, mass, or form. Outside the bundled recipe corpus. |
| **WP03-WHITE-MATSUTAKE-20261011-S09** | Marché de proximité de Québec, [Matsutake 250 g](https://www.marchequebec.org/legumes-et-legumineuses-cat5.html/coop-agrobio-prd89.html). | Retail description says *T. matsutake* and resale from British Columbia. It demonstrates a conflicting commercial name claim, not verified taxonomy for that product. Do not adopt it as alias or species evidence. |

## Review disposition

Recommend adding only the identity row in the JSON block if the integration owner accepts the source boundary. Keep Section N open. No bundled recipe link, form, density, unit mapping, package yield, conversion, or substitution is warranted by this review.
