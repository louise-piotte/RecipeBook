# WP04 Section O: Guinea-fowl identity review — R26

**Status:** Integrated as identity-only `ingredient-ref-guinea-fowl`; see the [R26 integration record](../batches/wp02-wp03-wp04-round26-gap-review-integration-20261013/README.md).

**Disposition:** Add one identity-only `PROTEIN` reference for guinea fowl, displayed as English **guinea fowl** and Québec French **pintade**. The Québec term and English equivalent are paired by the OQLF; Québec government and producer sources confirm that pintade meat is produced and sold locally. The bundled corpus has no direct recipe demand, so this proposal adds no recipe link or product behavior.

## Proposed identity boundary

| Field | Proposal |
|---|---|
| ID | `ingredient-ref-guinea-fowl` |
| Category | `PROTEIN` |
| English display | `guinea fowl` |
| Québec French display | `pintade` |
| Aliases | None |
| Forms and numeric behavior | None |
| Recipe links | None |

The identity names meat from the farmed guinea-fowl bird sold as pintade. The cited sources support this common-name product identity but do not justify encoding a scientific binomial or breed. It does not name a cut, age class, organ, or processed product. Keep it distinct from chicken, duck, goose, quail, pheasant, and other poultry or game birds. MAPAQ documents whole carcasses, pieces, fondue meat, pâtés, charcuteries, and prepared dishes in this regional product family; those presentations do not establish interchangeable forms or recipe conversions. Do not attach them as aliases or forms without a matching source request. The CFIA “young guinea” and “mature guinea” carcass classes describe carcass classification, not separate ingredient identities or cooking states. [S02, S03]

## Naming and market evidence

The OQLF’s preferred Québec French term is **pintade**, in zoology and aviculture, and its English equivalent is **guinea fowl**. MAPAQ includes pintade among the farm-raised bird species in Québec, says meat from these birds is commercialized in the Québec market, and identifies pintade products as whole carcasses or pieces as well as processed foods. A Québec producer labels its product **La pintade**, describes it as poultry meat, and reports availability at Provigo and Loblaws. These sources support the short bilingual display pair without adding a French alias or a region qualifier. [S01, S02, S04]

## Picker, duplication, and corpus checks

- The current active reference and form terms, research-ledger record names, and R21–R25 WP04 proposals contain no `guinea fowl`, `pintade`, `ingredient-ref-guinea-fowl`, or `candidate-guinea-fowl` entry. The proposed reference ID and source-ID prefix were also absent at review time.
- Exact full-phrase searches for **guinea fowl** and **pintade** have no existing active reference or form owner. The proposed bilingual display pair would therefore resolve each full phrase to one identity.
- Do **not** add bare **guinea** as an alias. That shorter query already matches three other active identities through existing aliases: grain sorghum (`guinea corn`), grains of paradise (`Guinea grains`), and sorghum flour (`guinea corn flour`). With the proposed row, `guinea` would remain a multi-result query. The display phrase will also match the short query `fowl`; do not add that as an alias or use it to stand for generic poultry. No `poultry` or `volaille` alias is needed.
- A phrase scan of all 114 manifest-listed recipe files / 1,123 ingredient rows found no `guinea fowl`, `guineafowl`, `pintade`, or *Numida meleagris* wording. Do not link or relink a recipe line.
- No count, mass, yield, density, unit mapping, conversion, substitution, handling, or food-safety behavior is inferred from bird size, retail package data, source carcass classes, or culinary similarity.

## Sources

| ID | Source and exact URL | Support and limits |
|---|---|---|
| `WP04-SECTION-O-GUINEA-FOWL-20261013-R26-S01` | OQLF, [pintade (Grand dictionnaire terminologique)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17047941/pintade) | Gives **pintade** as the preferred French term in zoology/ornithology and aviculture/zootechny, with **guinea fowl** as the English equivalent. Terminology and bird identity; not a meat-processing definition. |
| `WP04-SECTION-O-GUINEA-FOWL-20261013-R26-S02` | Gouvernement du Québec / MAPAQ, [Élevage d’oiseaux fermiers](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/agriculture/industrie-agricole-au-quebec/productions-agricoles/elevage-oiseaux-fermiers) | Lists pintade among Québec farm-raised birds; says their meat and eggs are commercialized in Québec; describes local sales and whole, piece, fondue, pâté, charcuterie, and prepared-product presentations. Regional market scope, not equivalence among those products. |
| `WP04-SECTION-O-GUINEA-FOWL-20261013-R26-S03` | CFIA, [Canadian Standards of Identity: Volume 7 — Meat Products](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-7) | Sections 14–15 define young and mature guinea carcasses as guinea-fowl carcasses. Supports the poultry-meat boundary and distinct age-class terminology; this proposal creates no age-class form or cooking inference. |
| `WP04-SECTION-O-GUINEA-FOWL-20261013-R26-S04` | La Ferme Avicole d’Oka, [La pintade](https://www.fermeoka.ca/produits/pintade) | Québec producer uses **pintade** for its poultry-meat product and reports retail availability at Provigo and Loblaws. Product-specific corroboration; its 1.2–1.5 kg average weight and 3–4 portions apply to its own product only, not to a universal size, portion, cooking, or preparation rule. |

These source IDs and the accepted identity-only decision are recorded under `ingredient-ref-guinea-fowl` in the shared research ledger. No producer-specific weight or serving observation, active measure, form, recipe link, or substitution rule was added.
