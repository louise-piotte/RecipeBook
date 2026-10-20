# WP02/WP03/WP04 — starch, gourd, and sardine identity integration

Integrated on 2026-10-11 from three proposal-only reviews. This batch adds four bilingual identity references and four evidence-ledger records.

## Accepted identities

| ID | English / français | Scope |
|---|---|---|
| `ingredient-ref-brazil-tapioca-granulada` | Brazilian tapioca granules / `tapioca granulé du Brésil` | Brazilian `tapioca granulada`, limited to the MAPA subgroup of irregular polyhedral cassava-starch granules. Pearl tapioca remains separate. |
| `ingredient-ref-snake-gourd` | snake gourd / `courge serpent` | Cultivated immature fruit of *Trichosanthes cucumerina*. Mature fruit and other plant parts are outside this identity. |
| `ingredient-ref-european-pilchard` | European pilchard / `sardine européenne` | *Sardina pilchardus*, with only species-qualified aliases. |
| `ingredient-ref-pacific-sardine` | Pacific sardine / `sardine du Pacifique` | *Sardinops sagax*, with only species-qualified aliases. |

Generic fufu flour and blends remain unresolved because the reviewed products use differing roots and compositions. Generic sardine/pilchard also remains unresolved because Canadian accepted-name rows apply those terms to multiple fish species. Canned, oil-packed, salted, smoked, dried, marinated, and other prepared fish products were not added.

The bundled recipe scan found no exact candidate-term matches in 114 recipes or 1,123 ingredient rows. No recipe links, forms, densities, unit mappings, measures, conversions, yields, or substitutions were added.

## Evidence and boundaries

- Brazil MAPA’s identity standard defines `tapioca granulada` as irregular polyhedral granules and distinguishes spherical `tapioca pérola` / `sagú artificial`. A current Marché Brésil listing names the Yoki granulated product, identifies cassava, and offers Québec pickup. OQLF keeps broad tapioca and tapioca pearls as separate product terms.
- Kew accepts *T. cucumerina* and treats var. *anguina* as a synonym under the accepted species. IAC describes immature green fruit as cooked and eaten as a vegetable, while separating mature fruit and other plant-part uses. Pépinière.ca uses the bilingual seed-catalog pair `courge serpent` / `snake gourd` for the named cultivar; this supports local terminology, not fresh-produce prevalence.
- OQLF ties Québec French `sardine` to *Sardina pilchardus*. DFO uses Pacific sardine / `sardine du Pacifique` for *Sardinops sagax*. CFIA’s Fish List assigns sardine or pilchard names across several taxa, so bare terms were not attached to either reference.

The source-specific audits and held decisions remain in [WP02’s fufu and Brazilian granule review](../../proposals/wp02-fufu-flour-blends-quebec-identity-review-20261011.md), [WP03’s snake-gourd review](../../proposals/wp03-snake-gourd-quebec-identity-boundary-review-20261011.md), and [WP04’s sardine boundary review](../../proposals/wp04-sardine-fish-identity-boundary-review-20261011.md).

## Validation snapshot

- Seed package: 1,020 ingredient references, 69 forms, 114 recipes / 1,123 ingredient rows.
- Research ledger: 1,303 records, 4,213 source entries, 3,453 distinct source IDs, and 8 unit conversions.
- SHA-256: `ingredient-references.v1.json` `11ddc15c7f6711b4b4219f917c1b3cb242d059bb3d2d89c8e5e940126518367e`; `research-ledger.v1.json` `6bc0ae3e9e4f6dfae0eb6c31d2ce8d4a3a9e47db1fe2a4cdcb6d61c7ebb08627`.
- `normalize_bundled_seed_package.py`: passed; 0 changed parts.
- Ingredient-reference normalization: passed; already normalized.
- Bundled package and ledger validation: passed.
- Generated ingredient index: current at 1,020 references.
- UTF-8 JSON / no-BOM scan and targeted `git diff --check`: passed.
- Tests were not run because this batch only adds database data and its generated index, under the updated `AGENTS.md` rule.

## Source links

- [Brazil MAPA cassava tapioca standard](https://sistemasweb.agricultura.gov.br/sislegis/action/detalhaAto.do?chave=1141329604&method=visualizarAtoPortalMapa)
- [Marché Brésil Yoki granulated tapioca](https://www.marchebresil.com/en/products/yoki-media-de-tapioca-granule-500g)
- [OQLF tapioca](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497643/tapioca) and [perle de tapioca](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26578849/perle-de-tapioca)
- [Kew *Trichosanthes cucumerina*](https://powo.science.kew.org/taxon/294175-1) and [IAC courge serpent](https://www.agripedia.nc/ressources-vegetales/plantes-alimentaires/legumes/courge-serpent)
- [Pépinière.ca Chichinda snake-gourd seeds](https://www.pepiniere.ca/en/products/courge-serpent-chichinda-bio)
- [OQLF sardine](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198919/sardine), [CFIA Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), and [DFO Pacific sardine plan](https://www.pac.dfo-mpo.gc.ca/fm-gp/mplans/sardine-ifmp-pgip-sm-eng.html)
