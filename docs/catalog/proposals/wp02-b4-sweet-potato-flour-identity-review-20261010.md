# WP02 B4 — Sweet-potato flour identity and Québec naming review

- **Reviewed:** 2026-10-10
- **Status:** Proposal only. This review changes no canonical package, ledger, recipe, roadmap, plan, code, or test file.
- **Scope:** Whole-root sweet-potato flour as a distinct product from fresh sweet potato, extracted sweet-potato starch, and potato flour. The broader B4 root/fruit-flour checklist remains open.
- **Source-ID prefix:** `WP02-SWEETPOTATO-FLOUR-20261010-S01–S08`; checked against the current proposal and ledger corpus before writing. These IDs are proposal-local, not ledger records.

## Recommendation

Integrate one identity-only `FLOUR_AND_STARCH` reference for food flour made from sweet-potato roots (*Ipomoea batatas*). The open B4 work explicitly leaves other established regional root/fruit flours in scope, and the separate B9 boundary requires whole-root flour to remain distinct from extracted and processed starch products. The East African standard lists sweetpotato flour as a food product from *I. batatas*; a technical processing source describes cleaning, slicing, drying, and milling the roots. A Québec retailer uses the exact French product name `farine de patate douce`, which agrees with OQLF's accepted Québec name for the root. This is a category-priority recommendation; the bundled recipes contain no flour demand.

| Field | Proposed value | Evidence boundary |
| --- | --- | --- |
| Candidate ID | `ingredient-ref-sweet-potato-flour` (unallocated) | No exact ID or name collision was found in the current package, forms, ledger, legacy candidates, or focused proposals. |
| Category | `FLOUR_AND_STARCH` | The candidate is the milled food flour, not the fresh vegetable or extracted starch. |
| English display | `sweet potato flour` | Attested by the EAS standard and Canadian manufacturer/retailer product pages. |
| English alias | `sweetpotato flour` | Exact one-word spelling in the EAS standard title; keep it as a spelling variant only. |
| Québec French display | `farine de patate douce` | Exact name on a Québec retailer's French product page. OQLF lists `patate douce` as an accepted term. |
| French aliases | None | OQLF also accepts `patate sucrée` for the root, but this review found no Québec product evidence for the compound `farine de patate sucrée`. Do not synthesize it as an alias. |
| Product boundary | Food flour obtained by processing *Ipomoea batatas* roots; the documented process example slices, dries, and mills the roots. | Do not extend the row to fresh sweet potato, extracted sweet-potato starch, sweet-potato glass noodles, composites, or a product whose label only says `powder`. |

Do not alias `sweet potato starch` / `fécule de patate douce`, `potato flour` / `farine de pomme de terre`, `yam flour` / `farine d'igname`, `sweet potato powder`, or `poudre de patate douce`. OQLF defines sweet-potato starch as a wet-extracted product, and documents *Dioscorea* yam as botanically distinct from *Ipomoea batatas* sweet potato [S03, S08].

## Measurement, forms, and substitution

- **Density and unit mappings:** `defaultDensity: null`; `unitMappings: []`. No supported general kitchen volume-to-mass value was found. La Moisson's 227 g listing is a package size, not a cup measure. The processing paper's process-specific flour yield is not an ingredient density, household measure, or catalog yield.
- **Forms and conversions:** Add no `RecipeIngredientForm` or conversion. The proposed row represents the flour product itself. Fresh sweet-potato roots, extracted starch, dried chips, powders with unspecified process, and finished noodles remain separate products or unresolved product-specific labels.
- **Package yields:** Add none. No source-specific package yield has been established for a recipe line.
- **Substitution:** Activate no global or contextual rule. Ecoideas markets its own sweet-potato flour as a 1:1 substitute for wheat or corn flour, but that brand claim does not establish a general ratio across flour processes, varieties, recipes, or measurement bases [S05].

## Bundled recipe demand

The audit covered all **114 manifest-listed recipes** and **1,123 ingredient rows**, searching ingredient fields and recipe text for `sweet potato flour`, `sweetpotato flour`, `farine de patate douce`, `sweet potato powder`, and `poudre de patate douce`. Exact candidate hits: **zero**. No recipe relink, quantity, form, measure, conversion, or substitution is justified.

Two nearby recipe lines are for the fresh root and already point to `ingredient-ref-sweet-potato`; they are not flour demand:

| Recipe file | Ingredient-line ID | Exact line | Current reference |
| --- | --- | --- | --- |
| `recipes/090-ragout-aux-arachides-africain-african-peanut-stew-89f89f5e-4afc-4e3a-b37f-e7841ac24ff8.v1.json` | `89f89f5e-4afc-4e3a-b37f-e7841ac24ff8-ingredient-13` | `2 small sweet potatoes, peeled and diced` | `ingredient-ref-sweet-potato` |
| `recipes/105-soupe-aux-pois-habitant-pea-soup-e152b749-db75-4a7c-9bbf-3b94f721451d.v1.json` | `e152b749-db75-4a7c-9bbf-3b94f721451d-ingredient-5` | `1 sweet potato` | `ingredient-ref-sweet-potato` |

## Catalog and collision audit

Snapshot of the live package at review time: 885 ingredient references, 48 forms, 1,130 research-ledger records, 77 legacy-import candidates, and 114 recipes. Normalized exact-key checks found no owner for `sweet potato flour`, `sweetpotato flour`, `farine de patate douce`, `sweet potato powder`, or `poudre de patate douce` in those records. No matching form or legacy candidate exists. The ledger has an active evidence record for sweet-potato starch, but no sweet-potato-flour record.

| Existing record | Current name/category | Boundary and search consequence |
| --- | --- | --- |
| `ingredient-ref-sweet-potato` | `sweet potato / patate douce`; `VEGETABLE_AND_AROMATIC` | Keep for the fresh root. Bare `sweet potato` is broad and should surface the distinct root, flour, starch, and leaf products after integration. |
| `ingredient-ref-sweet-potato-starch` | `sweet potato starch / fécule de patate douce`; `FLOUR_AND_STARCH` | Keep for wet-extracted starch, not the root flour. The exact English and French starch names remain on this row only. |
| `ingredient-ref-potato-flour` | `potato flour / farine de pomme de terre`; `FLOUR_AND_STARCH` | Keep the ordinary potato product separate. The search implementation's partial phrase behavior means a query for `potato flour` may return both this record and `sweet potato flour`; the qualified exact query `sweet potato flour` must resolve only to the proposed row. |
| `ingredient-ref-sweet-potato-leaves` | `sweet potato leaves / feuilles de patate douce`; `VEGETABLE_AND_AROMATIC` | Leaves remain a separate vegetable product. Do not extend a bare sweet-potato alias to the flour. |
| `ingredient-ref-yam-flour` and `ingredient-ref-yam` | `yam flour / farine d’igname` and `true yam / igname` | Keep *Dioscorea* identities separate. OQLF notes that North American `yam` is sometimes applied to sweet potatoes, so do not use `yam` or `yam flour` as an alias for this *Ipomoea* product [S08]. |

## Prior-review reconciliation

- `docs/catalog/proposals/wp02-regional-starches-open-gap-review-20261010.md` established the extracted sweet-potato-starch identity and explicitly kept it separate from whole-root sweet-potato flour; it did not propose the flour reference.
- `docs/catalog/proposals/wp02-b2-b3-regional-starches-residual-gap-review-20261010.md` carries the same starch-versus-flour boundary, not a focused flour identity review.
- `docs/catalog/proposals/wp02-regional-root-flour-boundaries-20261010.md` reviewed breadfruit, tigernut, yam, and taro flour and left the broader B4 list open; it discusses sweet potato only as a root distinct from yam.
- `docs/catalog/proposals/wp03-section-g-rice-noodles-boundary-review-20261010.md` records a manufacturer page whose sweet-potato glass-noodle description and ingredient panel conflict. That finished-noodle product does not define a generic sweet-potato flour or starch identity.

No prior proposal in this set resolved the standalone whole-root sweet-potato-flour row or its exact Québec French product name.

## Acceptance checks for a later integration

1. Recheck the live package and normalized exact keys before allocating `ingredient-ref-sweet-potato-flour`; preserve the active references named above.
2. Add only a `FLOUR_AND_STARCH` identity with `sweet potato flour / farine de patate douce` and the source-supported English spelling alias `sweetpotato flour`. Add no French alias, form, measurement, density, unit mapping, yield, conversion, or substitution rule.
3. Verify that `sweet potato flour`, `sweetpotato flour`, and `farine de patate douce` return the new row; `sweet potato starch` and `fécule de patate douce` remain on the starch row; `farine de pomme de terre` remains on `ingredient-ref-potato-flour`. Confirm that broad `potato flour` results do not auto-select or merge either product.
4. Keep all existing fresh-root recipe lines linked to `ingredient-ref-sweet-potato`. Do not create recipe links from category coverage alone.
5. Review English and Québec French picker displays. Do not activate `farine de patate sucrée`, `sweet potato powder`, `poudre de patate douce`, or `yam flour` without exact product-source evidence.

## Bounded unresolved gaps

- The bundled corpus has no demand for this flour; the recommendation rests on the open regional root/fruit-flour category and source-backed product identity.
- `sweet potato powder` / `poudre de patate douce` was not established as a safe synonym for the standard-defined flour. Keep these terms unassigned until an exact package or manufacturer process resolves what they contain.
- The Québec product listing provides a clear French name, but not the Ecoideas manufacturing method. The proposed identity is bounded by the standard and the cited whole-root process evidence; it does not claim that every commercial product with a similar powder label has this process.
- Sweet-potato flour varies by cultivar, color, pretreatment, drying, and milling. This pass does not create grade, variety, or processing forms.
- No default kitchen density, cup measure, package yield, or source-neutral wheat/corn substitution is supported. Ecoideas's 1:1 statement stays product-specific and is not an app-wide rule.

## Source register

Accessed **2026-10-10** unless stated otherwise.

| ID | Source and date | Support and limits |
| --- | --- | --- |
| **WP02-SWEETPOTATO-FLOUR-20261010-S01** | East African Community Secretariat, *EAS Standards Catalogue*, June 2023; entry for **EAS 773:2012, Sweetpotato flour — Specification**. [Official catalogue PDF](https://www.eac.int/component/filery/?Itemid=297&controller=download&file=4a15c808-4e2f-405e-8a26-596f623eeb16&name=EAS+Standards+Catalogue+June+2023.pdf&task=download.file). | Identifies a human-consumption flour obtained by processing *Ipomoea batatas*. Supports a distinct flour product and botanical scope; the catalogue entry does not supply a household measurement or substitution value. |
| **WP02-SWEETPOTATO-FLOUR-20261010-S02** | Office québécois de la langue française, [*patate* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082785/patate), English source term credited to OQLF, 2020; accessed 2026-10-10. | Lists `patate douce` and `patate sucrée` as acceptable terms and distinguishes them from `pomme de terre`. It supports the root wording, not by itself the flour compound. |
| **WP02-SWEETPOTATO-FLOUR-20261010-S03** | Office québécois de la langue française, [*fécule de patate douce* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3287217/fecule-de-patate-douce), source credited to AFNOR, 1979; accessed 2026-10-10. | Defines the separate starch product as industrial wet extraction from *Ipomoea batatas* tuberous roots and gives the English equivalent `sweet potato starch`. It is not flour evidence. |
| **WP02-SWEETPOTATO-FLOUR-20261010-S04** | La Moisson Supermarché Santé, [*Farine de patate douce*](https://lamoisson.com/products/farine-de-patate-douce), undated product page; accessed 2026-10-10. | Québec retailer page gives the exact French product name, 227 g package, and ingredient text `Farine de patate douce`; its delivery terms include Québec. This is product-label evidence, not process or measure evidence. |
| **WP02-SWEETPOTATO-FLOUR-20261010-S05** | Ecoideas, [*Organic Fair Trade Sweet Potato Flour*](https://www.ecoideas.ca/products/organic-fair-trade-sweet-potato-flour-227g), undated manufacturer page; accessed 2026-10-10. | Names the product `Sweet Potato Flour`, says it has one ingredient and no fillers, and makes a 1:1 wheat/corn-flour replacement claim. The formulation/use claim is brand-specific and does not give a preparation basis or general conversion. |
| **WP02-SWEETPOTATO-FLOUR-20261010-S06** | Hagenimana, Vital, and Constance Owori, *Process of producing sweetpotato flour*, dated 2009 in the FAO AGRIS bibliographic record; [AGRIS record](https://agris.fao.org/search/en/providers/122602/records/647356a908fd68d54600f31c); accessed 2026-10-10. | The bibliographic record links to the DFID R7036 technical paper. It identifies sweet-potato roots as flour raw material and supports a product-processing distinction from starch extraction. |
| **WP02-SWEETPOTATO-FLOUR-20261010-S07** | Hagenimana and Owori, *Process of producing sweetpotato flour*, DFID R7036 technical paper, 2009 per the AGRIS record; [GOV.UK-hosted PDF](https://assets.publishing.service.gov.uk/media/57a08d76e5274a31e0001890/R7036_sweetpotato_flour.pdf); accessed 2026-10-10. | Describes cleaning, washing, slicing, drying, and milling sweet-potato storage roots into flour. Its process and variety-specific yield observations are not kitchen conversion or universal yield data. |
| **WP02-SWEETPOTATO-FLOUR-20261010-S08** | Office québécois de la langue française, [*igname* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082772/igname), last updated 1991; accessed 2026-10-10. | Identifies *Dioscorea* and notes its botanical distinction from sweet potatoes, while warning that North American `yam` may be applied to sweet potato. Supports excluding yam names and aliases. |
