# WP03 Section L: Fresno pepper fresh-market identity review (R144)

- **Disposition:** Add one narrowly scoped fresh-market identity, **Fresno pepper / piment Fresno**, with one `fresh` form. Use only the English alias `Fresno peppers` and French alias `piment fort Fresno`.
- **Scope:** The Canadian surveillance report and a current bilingual Canadian retail listing support Fresno as a named fresh-pepper product type. They do not establish a formal botanical cultivar, species, growing origin, fixed color, or heat level. Keep Fresno distinct from jalapeño, serrano, and other active pepper identities.
- **Numeric and substitution limits:** Add no density, unit mapping, package yield, per-pepper mass, conversion, or substitution. Walmart’s 225 g is a product-package amount without a pepper count; CFIA’s sampling weights are not per-pepper measures. Similarity and use suggestions do not establish substitution.
- **Recipe demand:** No matching bundled ingredient rows were found; add no recipe link or recipe-scoped substitution finding.
- **Testing:** None. This is proposal-only; `AGENTS.md` exempts JSON-only database additions from testing.

## Ownership, plan, and corpus audit

The [open WP03 Section L checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4498) names Fresno among the fresh-chile candidates. At the time of this audit, the live [reference catalog](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) and [form catalog](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) had **1,500 ingredient references and 117 forms**. They had no Fresno reference, alias, or form; the [legacy-import archive](../legacy-import-identities.v1.json) had no Fresno identity. No Fresno item appeared in the [research ledger](../research-ledger.v1.json) or in a focused prior proposal. R138 mentioned Fresno only as a term in a broad zero-hit corpus scan; the older WP06 `El Fresno chiles secos` mention is a package-label example, not a Fresno pepper identity review.

The manifest lists **114 recipe files and 1,123 ingredient rows**. Every manifest-listed recipe and ingredient row was scanned for Fresno and French/English variants (`Fresno`, `Fresno pepper(s)`, `Fresno chile(s)`, `piment Fresno`, and `piment fort Fresno`); there were **zero hits**. No bundled recipe requires a recipe link, measure, or substitution.

## Naming and product boundary

CFIA’s 2026 final report covers whole fresh hot peppers sold at Canadian retail, with sampling in Québec City and Montréal as well as other Canadian cities. Its product-type table lists **Piment Fresno** separately from Habanero, Poblano, Scotch Bonnet, Serrano, Shishito, and other named products. This supports a distinct market identity and the French display `piment Fresno`; the table is a surveillance product-type classification, not a botanical or cultivar standard. [S01]

Walmart Canada currently lists a 225 g Fresno pepper product in English and French under the same SKU and UPC. The English listing calls it `Peppers, Fresno` and describes fresh hot peppers; the French listing title is `Piments forts Fresno`, and its product details use the singular `piment fort Fresno frais`. This is current Canadian retail wording for the same product, not proof of a terminology authority’s preferred Fresno translation. The product-page breadcrumb routes the item through a “fresh pre-cut vegetables” category even though its title and text describe peppers; that inconsistent category is not used to add a cut form. [S02, S03]

OQLF’s general entry gives preferred French `piment` and English `pepper`, but it has no Fresno-specific term. Use the direct CFIA `piment Fresno` label as the French display, and retain the retailer’s singular `piment fort Fresno` as a narrowly qualified French alias. Do not add the retailer’s plural title `piments forts Fresno`: the live picker currently returns no result for bare `piments`, and that plural alias would make a generic plural query return a single Fresno result. [S01, S03, S04]

NMSU’s Chile Pepper Institute calls the pepper `Fresno Chile` and discusses its culinary use; a University of California garden guide also lists Fresno separately from nearby fresh-pepper types. These sources support that Fresno is an established named pepper type, but their horticultural descriptions do not supply catalog behavior. This proposal does not assign *Capsicum annuum* or another species, a cultivar, origin, color stage, or fixed heat to every market product called Fresno. Do not add `Fresno chile` or `Fresno chiles` aliases: the Canadian market wording is adequately covered by the canonical `Fresno pepper` and source-attested plural `Fresno peppers`, while bare `chile(s)` queries are broader terms. [S05, S06]

## Picker projection

The projection applies the `IngredientReferenceSearchIndex` normalization and phrase-first word-boundary matching to the **pre-addition** snapshot of 1,500 references and 117 forms, then adds the proposed reference and fresh form. Counts are reference results, not form counts. The shared catalog now includes the integrated Fresno row, so current live counts are one higher for these broad queries than the baseline below.

| Query | Current | Projected | Effect |
|---|---:|---:|---|
| `Fresno` | 0 | 1 | Fresno pepper |
| `Fresno pepper` | 0 | 1 | Fresno pepper |
| `Fresno peppers` | 0 | 1 | Fresno pepper |
| `Fresno chile` | 0 | 0 | Kept outside aliases |
| `piment Fresno` | 0 | 1 | Fresno pepper |
| `piment fort Fresno` | 0 | 1 | Fresno pepper |
| `piment fort Fresno frais` | 0 | 1 | Fresh form phrase |
| `piments forts Fresno` | 0 | 0 | Plural retail title omitted from aliases |
| `piments` | 0 | 0 | Avoid a false singleton |
| `piment` | 23 | 24 | Broad French pepper query gains Fresno |
| `pepper` | 28 | 29 | Broad English pepper query gains Fresno |
| `peppers` | 8 | 9 | Broad English plural gains Fresno |
| `piment fort` | 3 | 4 | Broad qualified query gains Fresno alongside existing matches |
| `jalapeño` | 1 | 1 | No change |
| `Serrano` | 2 | 2 | No change; current results include queso fresco serrano and serrano pepper |
| `Habanero` | 1 | 1 | No change |
| `Scotch Bonnet` | 2 | 2 | No change; fresh pepper and sauce remain distinct |
| `poblano` | 1 | 1 | No change |
| `banana pepper` | 1 | 1 | No change |
| `Hungarian wax` | 1 | 1 | No change |

Keep the single row. Do not add a second hot-qualified Fresno identity: the cited Canadian listing already scopes this market label to fresh hot peppers, while the bundled corpus has no distinct sweet/hot Fresno ingredient need. Do not add a French plural alias just because it appears as the retailer title; the singular canonical and qualified singular alias cover useful French queries without changing bare `piments` into a singleton.

## Form, numeric evidence, and substitutions

Add one `fresh` form under the Fresno identity. CFIA explicitly scopes its product table to whole fresh hot peppers; the Walmart listing calls its Fresno product fresh. The retailer’s conflicting pre-cut breadcrumb does not justify chopped or otherwise prepared forms. Do not add dried, pickled, cooked, ground, or sauce forms. Walmart’s comment that Fresno peppers can be dried describes a possible preparation, not a standalone dried product standard. Metro’s indexed Gochuracha sauce lists dried Fresno peppers only as a compound-sauce ingredient; its product page could not be opened directly, and it does not establish an independently sold dried Fresno product. [S01–S03, S07]

Walmart’s **225 g** is the package amount for one retail SKU and gives no pepper count; it is not a per-pepper weight or a recipe quantity. CFIA states each surveillance sample comprised one or more retail units weighing at least 250 g, which is a sample-collection criterion, not a unit measure. Its 12 Fresno samples likewise are sample counts, not a measure. The retailer’s medium-hot description and variable Scoville range are product-page claims, not fixed identity properties. Keep density, `unitMappings`, and package-yield observations empty. [S01–S03]

Walmart and NMSU compare Fresno with jalapeño or serrano and suggest culinary uses including salsa, roasting, stir-frying, and hot sauce. Those descriptions do not name a replacement amount or a controlled recipe role/method. Add no global or contextual substitution. No bundle ingredient line supports a recipe-scoped substitution. [S02, S03, S05]

## Source register

Sources were checked on **2026-10-15**. Retail stock, package quantities, heat descriptions, and source-specific uses are not generalized.

| Source ID | Source and retrieval | Evidence and limits |
|---|---|---|
| `WP03-L-FRESNO-20261015-R144-S01` | CFIA, [Bactéries pathogènes et organismes indicateurs dans des piments forts entiers à l’état frais](https://publications.gc.ca/collections/collection_2026/acia-cfia/A104-701-2026-fra.pdf), 2026 final report; directly opened 2026-10-15. | The study covers whole fresh hot peppers sold at Canadian retail from 2022-04-01 through 2025-03-31; sampled cities include Québec and Montréal. Table 5 lists `Piment Fresno`, 12 samples (1.4%), separately from neighboring product types. This is a product-type label in a surveillance study, not a botanical/cultivar identification or per-pepper measure. Each sample consisted of one or more retail units weighing at least 250 g. |
| `WP03-L-FRESNO-20261015-R144-S02` | Walmart Canada, [Peppers, Fresno, Your Fresh Market, 225 g](https://www.walmart.ca/en/ip/peppers-fresno-your-fresh-market/6000207538828), current listing; search-indexed 2026-10-15, while direct opening returned a cache miss. SKU `6000207538828`, UPC `627735271941`. | English title and product details name Fresno peppers and describe them as fresh hot peppers. The 225 g title is one product-package amount with no pepper count. Walmart’s similarity, medium-hot, Scoville, color, and cooking-use copy is not generalized. Its breadcrumb also says “Fresh Pre-cut Vegetables”; no cut form is inferred from that conflicting category. |
| `WP03-L-FRESNO-20261015-R144-S03` | Walmart Canada, [Piments forts Fresno Mon marché fraîcheur, 225 g](https://www.walmart.ca/fr/ip/piments-forts-fresno-mon-march-fracheur/6000207538828), current French page; directly opened 2026-10-15. Same SKU `6000207538828` and UPC `627735271941` as S02. | Title `Piments forts Fresno`; details use the singular `piment fort Fresno frais`, call the item fresh hot peppers, and list `Piments forts Fresno` as the ingredient. Supports the qualified singular French alias and fresh form wording. Its 225 g remains package-specific; its “fresh pre-cut vegetables” breadcrumb conflicts with the product text and is not used to add a cut form. |
| `WP03-L-FRESNO-20261015-R144-S04` | OQLF, [piment (Grand dictionnaire terminologique)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8410223/piment), accessed 2026-10-15; last updated 1988. | Gives preferred general French `piment`, English `pepper`, and Latin `Capsicum spp.` for the broad term. It does not provide a Fresno-specific French term or settle a Fresno cultivar/species boundary. |
| `WP03-L-FRESNO-20261015-R144-S05` | New Mexico State University Chile Pepper Institute, [Fresno recipe handout](https://cpi.nmsu.edu/_assets/documents/qr/Fresno%20recipe.pdf), directly opened 2026-10-15. | Uses `Fresno Chile` / `Fresno chiles` and gives a recipe-context description. This supports the English spelling in its source context, but it is not a Canadian retail label or identity standard; no `chile(s)` alias or heat/size behavior is proposed. |
| `WP03-L-FRESNO-20261015-R144-S06` | University of California Agriculture and Natural Resources, [Peppers in Your Garden](https://ucanr.edu/sites/default/files/2026-06/Peppers%20in%20Your%20Garden%205.28.26.pdf), directly opened 2026-10-15. | Lists Fresno separately from Anaheim, Habañero, Hungarian Wax, Jalapeño, Serrano, and Thai peppers in a garden guide. Its days-to-maturity and heat-scale values are horticultural source data, not reusable food measures or fixed catalog properties. |
| `WP03-L-FRESNO-20261015-R144-S07` | Metro Québec, [Gochuracha Sriracha/Gochujang sauce](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/sauce-piquante-sriracha-gochujang/p/628347300593), indexed listing reviewed 2026-10-15; direct open returned an access/cache error. | Indexed ingredient wording includes dried Fresno peppers inside this compound sauce. It is not a standalone dried-pepper listing and does not justify a dried form under the proposed fresh-market identity. |

## Exact proposed JSON delta

Add the following reference and fresh form only if approved. The French display uses CFIA’s exact `Piment Fresno` label; the qualified singular alias and form use wording from the matching Québec retailer listing. French accents are escaped in the proposed database JSON as required by `AGENTS.md`.

### Addition to `ingredient-references.v1.json`

```json
{
  "id": "ingredient-ref-fresno-pepper",
  "nameFr": "piment Fresno",
  "nameEn": "Fresno pepper",
  "category": "VEGETABLE_AND_AROMATIC",
  "aliasesFr": ["piment fort Fresno"],
  "aliasesEn": ["Fresno peppers"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z"
}
```

### Addition to `ingredient-forms.v1.json`

```json
{
  "id": "ingredient-form-fresno-pepper-fresh",
  "ingredientRefId": "ingredient-ref-fresno-pepper",
  "formCode": "fresh",
  "labelFr": "piment fort Fresno frais",
  "labelEn": "fresh Fresno pepper",
  "prepState": "fresh",
  "matchTermsFr": [],
  "matchTermsEn": [],
  "densityGPerMl": null,
  "notesFr": "Les sources de vente au d\u00e9tail indiquent un emballage de 225 g sans nombre de piments; le rapport de l'ACIA d\u00e9crit des \u00e9chantillons compos\u00e9s d'une ou de plusieurs unit\u00e9s. Aucune masse par piment n'est \u00e9tablie.",
  "notesEn": "The retail source lists a 225 g package without a pepper count; CFIA describes samples made up of one or more retail units. No per-pepper mass is established.",
  "updatedAt": "2026-10-15T00:00:00Z"
}
```

No package-yield observation, measurement observation, substitution rule, additional form, or recipe-line link is proposed. At integration, attach the accepted identity source IDs to its ledger record; add no measurement or substitution finding.
