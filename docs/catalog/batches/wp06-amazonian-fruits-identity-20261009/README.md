# WP06 Amazonian fruit identities — 2026-10-09

This coordinator batch adds açaí fruit and cupuaçu as separate ingredient references. It records
whole-fruit identities only; pulp, seed-derived products, drinks, and prepared foods stay outside
these rows.

## Catalog decisions

| ID | English | French | Category | Alias |
|---|---|---|---|---|
| `ingredient-ref-acai-fruit` | açaí fruit | açaï | `FRUIT` | English `assai` |
| `ingredient-ref-cupuacu-fruit` | cupuaçu | cupuaçu (provisional) | `FRUIT` | none |

- OQLF defines French `açaï`, lists English `açai` and `assai`, and identifies the term as an Amazonian
  palm fruit. The catalog activates `assai` as an English alias; accent-folded search covers the
  other spelling without storing a duplicate alias.
- Embrapa documents more than one palm species associated with açaí. The common-name row does not
  assign a single species or regional type. Species-level products and names remain source-specific.
- Embrapa identifies cupuaçu as *Theobroma grandiflorum*. Its pulp is treated as a separate product;
  cupuaçu is not an alias for cacao, pulp, frozen pulp, seed-derived chocolate-like products, or
  prepared beverages and preserves.
- Neither row has a form, density, unit mapping, measurement, conversion, substitution, or recipe
  link. The French cupuaçu display remains provisional pending independent Québec terminology review.
- A scan of all 114 bundled recipes found no açaí or cupuaçu ingredient line. No recipe file changed.

## Sources

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP06-SOUTHAM-20261009-S11` | [Brazil Ministry of Health, *Alimentos regionais brasileiros*](https://bvsms.saude.gov.br/bvs/publicacoes/alimentos_regionais_brasileiros_2ed.pdf), 2nd ed. (2015), North-region fruit entries | Lists açaí and cupuaçu as separate regional fruits. Supports regional food identity, not universal processing forms or measurements. |
| `WP06-SOUTHAM-20261009-S31` | [Office québécois de la langue française, “açaï” (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26500517/acai), updated 2008 | Defines the fruit; supports French `açaï`/`açai`, English `açai`/`assai`, and source-listed Latin names. It does not settle all regional species naming. |
| `WP06-SOUTHAM-20261009-S32` | [Embrapa Amapá, *Boas práticas na cadeia de produção de açaí*](https://www.infoteca.cnptia.embrapa.br/infoteca/bitstream/doc/1135385/1/CPAF-AP-2021-Boas-praticas-cadeia-producao-acai.pdf) (2021), origin and fruit-use sections | Documents *Euterpe oleracea* and *E. precatoria* as açaí palms with different regional distributions and identifies the fruit as a principal food product. This batch does not map either species as an alias. |
| `WP06-SOUTHAM-20261009-S33` | [Embrapa Acre, *Geleia de cupuaçu*](https://www.infoteca.cnptia.embrapa.br/infoteca/bitstream/doc/965809/1/AGROINDFAMGeleiadecupuacued022012.pdf), 2nd revised ed. (2012), introduction pp. 9–10 | Identifies cupuaçu as *Theobroma grandiflorum* and describes culinary use of pulp as a separate product. The processing guide does not establish general aliases or conversions. |

## Validation

- Package: 471 ingredient references (SHA-256
  `1bf65a37654f72e16981045c242a932d01baac01d64231c23750dcdb72c54e74`), 17 forms; manifest SHA-256
  `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.
- Research ledger: 637 records, 868 source entries, and 758 distinct source IDs (SHA-256
  `8a5577f26eee6ec0e1bc46a9d667d437a6192872d002182e33cd8b565f43d7d5`).
- Corpus: 114 recipes and 1,123 ingredient lines.
- Normalized package and generated-index checks passed; the research ledger validates against its
  JSON Schema. All 9 Python seed-package tests passed. Android unit tests: 291 passed, 0 failures,
  errors, or skips.
- Pixel 9a / Android 16 instrumentation on `emulator-5556`: 29 XML cases, 27 passed, 2 skipped,
  0 failures or errors. Deployment succeeded.
- Live English search `acai` returned `açaí fruit`; English alias `assai` resolved to the same row.
  French accent-folded search `acai` returned `açaï`, and `cupuacu` returned `cupuaçu`. The temporary
  recipe draft was discarded and the French home was restored to 114 recipes.

## Emulator screenshots

| Screenshot | SHA-256 |
|---|---|
| [English açaí picker](en-picker.png) | `5474e2b6248a9ad4fb06910eac65e19a0b3414266c7ff6b6cdba8de8af59167d` |
| [French açaï picker](fr-picker-acai.png) | `6b176562c468d71ed6d3f5c7ef10d04d47654ffc160f1d685334ffc657788c51` |
| [French cupuaçu picker](fr-picker-cupuacu.png) | `d4b7f0567704c5e9283e756ca0eab54b208c72a11c89718068a7cb24ac6ebca3` |
| [French library home, 114 recipes](fr-library-114.png) | `5212d6ab5465428fa2cd6ef91b34d9a03cd9462896e084f272c31d8e7010b536` |

## Open work

Review species-specific açaí products and regional names only if a recipe or product source requires
them. Obtain independent Québec terminology review for cupuaçu. Broader Amazonian and South American
coverage remains open.
