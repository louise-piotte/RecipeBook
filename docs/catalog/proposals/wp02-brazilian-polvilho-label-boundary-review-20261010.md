# WP02 Brazilian polvilho label-boundary review

- **Reviewed:** 2026-10-10
- **Status:** reviewed and integrated as two identity-only catalog references; French terminology review remains open.
- **Scope:** Brazilian `polvilho doce` and `polvilho azedo`; the English labels `sweet cassava starch`, `sour cassava starch`, `sweet tapioca starch`, and `sour tapioca starch`; candidate Québec/Canadian French descriptions.
- **Out of scope:** cassava flour and generic tapioca-starch identity work, except the active tapioca-starch row as a collision boundary. The prior integrated cassava flour/starch review is not reopened.
- **Source-ID audit:** `WP02-POLVILHO-LABELS-20261010-S01–S08` was searched across the pre-existing ledger and proposal corpus before drafting; no reuse was found. Reused evidence from the prior Brazil packet is cited by its existing `WP06-BR-CASSAVA-20261009-S##` ID.

## Integration update (2026-10-10)

Added `ingredient-ref-brazil-polvilho-doce` with English display `sweet cassava starch (polvilho doce)` and French display `polvilho doce`, plus `ingredient-ref-brazil-polvilho-azedo` with English display `sour cassava starch (polvilho azedo)` and French display `polvilho azedo`. Each row uses category `FLOUR_AND_STARCH`, no aliases, null density, and empty unit mappings. The reviewed English product descriptions remain paired with their Portuguese source names; neither is a global tapioca-starch alias. The French displays remain provisional pending Québec terminology review.

The evidence ledger now records four source entries for each identity, using the MAPA 2022 guidance, Embrapa's product distinction, Incol's separate product listings, and Grupo PQ's respective product page. No forms, measurement observations, conversions, yields, substitutions, or recipe links were added. The full verification snapshot and emulator screenshots are in [`../batches/wp02-wp06-wp07-polvilho-regional-boundary-integration-20261010/README.md`](../batches/wp02-wp06-wp07-polvilho-regional-boundary-integration-20261010/README.md).

## Decision

**Accept two separate, source-named identity candidates:** `ingredient-ref-brazil-polvilho-doce` and `ingredient-ref-brazil-polvilho-azedo`. Brazilian MAPA guidance discusses the two as different named products and describes less versus more fermentation; Embrapa material and a Brazilian producer’s separate product listings also preserve both names. A current MAPA compendium still points to the 2022 guidance, which says there is no repeatable, reproducible method for distinguishing fécula, the two polvilhos, and mixtures. A 2025 MAPA impact report describes a *proposed* review intended to establish a distinct standard for polvilho azedo; it is a proposal, not an enacted standard. Treat these as culinary product identities, not uniform process or performance specifications. [WP06-BR-CASSAVA-20261009-S03; WP02-POLVILHO-LABELS-20261010-S01–S05]

For English, use the directly attested product descriptions `sour cassava starch` for azedo and `sweet cassava starch` for doce only with the Portuguese names visible. Do **not** add `sour tapioca starch` or `sweet tapioca starch` as global aliases. A Canadian seller uses `sour cassava tapioca starch` for one explicitly named retail listing, and a distributor catalog lists `tapioca starch` among names for one Olinda Sweet product; neither establishes a stable cross-brand mapping. The unqualified `tapioca starch` already has an active generic owner. A source-specific package or retailer record may preserve its exact wording with its product provenance. [WP02-POLVILHO-LABELS-20261010-S06–S07]

For fr-CA, keep `polvilho azedo` and `polvilho doce` visible as the proposed names. `Amidon aigre de manioc` is attested in French-language cassava research and a Canadian retail listing for polvilho azedo; `fécule douce de manioc` also appears in French-language product/recipe material. These are useful **provisional descriptions**, not OQLF-approved terms. OQLF’s [fécule de manioc](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3287219/fecule-de-manioc) and [tapioca](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497643/tapioca) entries and TERMIUM’s [cassava-starch record](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=enr&lang=fra&srchtxt=STARCH+PAPER) define generic terminology, not either Brazilian product. Do not activate a French alias until a Québec terminology reviewer approves it. [WP02-POLVILHO-LABELS-20261010-S06–S08; WP06-BR-CASSAVA-20261009-S09, S10, S13]

## Product and label decisions

| Candidate | Decision | Naming to carry forward | Held terms and scope |
|---|---|---|---|
| `polvilho azedo` | **Accept a distinct identity-only candidate.** | EN: `sour cassava starch (polvilho azedo)`; FR: `polvilho azedo` (provisional). `Amidon aigre de manioc` is a French descriptive candidate for terminology review. | `sour tapioca starch` is source-scoped only. A Canadian retailer lists one Da Terrinha product as “Sour Cassava Tapioca Starch”; that supports the wording for that listing, not a global alias. Do not map to generic `tapioca starch`, `cassava starch`, or `fécule de manioc`. [S05, S07–S08; WP06-BR-CASSAVA-20261009-S03, S12] |
| `polvilho doce` | **Accept a distinct identity-only candidate.** | EN: `sweet cassava starch (polvilho doce)`; FR: `polvilho doce` (provisional). Keep the Brazilian name alongside the English product description in any later display. | `sweet tapioca starch` remains held as a global alias. A distributor catalog lists `polvilho doce` and `tapioca starch` as names for one Olinda Sweet product, while a producer page translates a PQ product as `sweet cassava starch`. This does not make `tapioca starch` a safe global alias or establish a universal sweet/fermentation threshold. `Fécule douce de manioc` is a provisional description only. [WP02-POLVILHO-LABELS-20261010-S05–S06; WP06-BR-CASSAVA-20261009-S03] |

The word `doce` is retained as part of the Brazilian product name. Sources reviewed do not support interpreting it as a sugar or sweetness claim. The producer wording `sweet cassava starch` is a product translation, not a claim that every item sold as polvilho doce has identical composition or processing. Likewise, MAPA’s comparative description of fermentation does not establish a measurable threshold, recipe behavior, or conversion.

The English compound labels with **tapioca** are deliberately not treated as equivalent to the active generic row. The active row owns exact normalized `tapioca starch` / `fécule de manioc`; a product listing that adds `sour`, `sweet`, or `polvilho` is useful source context, not permission to alias the unqualified phrase.

## Live package, ledger, plan, and proposal audit

The shared worktree was already dirty. The hashes below identify the files read for this review at `HEAD 0caaef893ebd9e12443c62fdbbb6a5a328c53fc4`; they are not a clean-commit claim.

| Artifact | Count | Bytes | SHA-256 / fingerprint |
|---|---:|---:|---|
| Bundled manifest | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Ingredient references | 703 rows | 222,185 | `424578020c8f6d75f2bd2025f5a6abc17d379d681eaeffcdf8a5ea94e103cc39` |
| Ingredient forms | 34 rows | 23,272 | `904bd11af25889fd9e03baa3a4fa5afe9a772f2349f3044eea763ff1f5826938` |
| Legacy import identities | 84 candidates | 20,087 | `454d11ebf0a39dbc0584242eb9736c9009c00bc1bbd57f85b42e4ad1f7ecd36d` |
| Research ledger | 892 records; 1,682 source entries; 1,388 distinct source IDs | 1,814,626 | `cfc06a40c19721554aef2ab8a6ab39dbdd4302cf502907acb5debd28710a70fe` |
| WP02 coverage plan, `docs/RecipeBook-global-ingredient-catalog-plan.txt` | — | 358,614 | `58b6254d71cae02fea9cd019cbfa54930f499d52de1483f9a260096653e0147b` |
| Baking-flours-starches review | — | 132,379 | `f6d72d3248961e07296f1469fce9cb57034b4176ef72b48effbe2188ac2d36f0` |
| Pre-existing proposal corpus | 137 Markdown files | — | `84ed4b428384ed8ade5cf8423ba9146bb71c7260b5d2756bc70d321c1978e9ae` |

The recipe corpus has 114 manifest-listed files and 1,123 ingredient rows. Its fingerprint is `527e85904f286fd7ecd1001bd6980779ecbe7bb549094db6a75d60cbdf9e3a5f`, computed over sorted manifest paths by hashing each relative path, a NUL byte, exact recipe-file bytes, and a NUL byte. The proposal fingerprint uses the same sorted path/NUL/file-bytes/NUL method over the 137 pre-existing proposal files, before this file was added.

The global plan still leaves the B2 cassava/tapioca/polvilho checklist open at line 1039. The baking batch lists B2 as partial and says to keep the native polvilho names distinct pending fr-CA labels; it separately reports cassava flour vs tapioca starch as an established boundary. This review addresses only the open polvilho naming question. The earlier `wp06-brazil-cassava-products-resolution-20261009.md` already proposed the two separate identities and cited MAPA/Embrapa; this packet refines that decision with direct producer/export-label sources and current regulatory-status context. The `wp06-south-american-cuisine-gap-sweep-20261009.md` records the tacacá recipe wording but correctly does not globalize its “or” construction. The earlier `wp02-regional-starches-open-gap-review-20261010.md` excludes the integrated cassava/tapioca boundary. A full-text scan of all 137 existing proposals found direct polvilho/sour-or-sweet cassava-starch discussion in those two WP06 packets only.

### Normalized collision audit

The name scan followed the app’s ingredient search normalization (case fold, NFKD, accent removal, punctuation-to-space, and whitespace collapse). For the proposed terms, exact normalized matches were:

- `polvilho`, `polvilho doce`, `polvilho azedo`, `sour cassava starch`, `sweet cassava starch`, `sour tapioca starch`, `sweet tapioca starch`, and `cassava starch`: no exact match in active references, forms, or legacy candidates.
- `tapioca starch` and `fécule de manioc`: the existing `ingredient-ref-tapioca-starch` row only.
- `amidon de manioc`: no exact match.
- At the pre-integration audit, no polvilho term occurred in the active forms, ledger records, or legacy candidate names/aliases. The existing cassava-flour and tapioca-starch records did not contain a polvilho candidate decision; the prior WP06 proposal was proposal evidence, not a ledger record.

That collision audit describes the pre-integration snapshot: unqualified `tapioca starch` and `fécule de manioc` belonged only to `ingredient-ref-tapioca-starch`, while no polvilho-family alias was proposed for that generic row. The two new source-named identities now own only their approved display text; neither generic tapioca phrase resolves to either identity. The French display strings are still pending independent Québec review.

## Recipe demand

All 1,123 ingredient rows and all string fields in the 114 manifest-listed recipe files were searched for `polvilho`, `sour/sweet cassava starch`, and `sour/sweet tapioca starch`. Result: **0 matching ingredient rows and 0 matching recipe files**. No recipe link, recipe-demand claim, or use-based rule is proposed.

## Source register

Previously reviewed evidence is cited by the source IDs in `wp06-brazil-cassava-products-resolution-20261009.md`: MAPA’s 2022 guidance (`WP06-BR-CASSAVA-20261009-S03`), Embrapa’s Pará product list (`WP06-BR-CASSAVA-20261009-S06`), OQLF’s generic cassava starch/tapioca entries (`WP06-BR-CASSAVA-20261009-S09–S10`), Penido et al.’s Brazilian study (`WP06-BR-CASSAVA-20261009-S12`), and TERMIUM (`WP06-BR-CASSAVA-20261009-S13`). Their original scope limits remain in force. New sources used for this label-focused review:

| ID | Source | Claim used and exact limit |
|---|---|---|
| **WP02-POLVILHO-LABELS-20261010-S01** | Brazil, MAPA, [Compêndio de Qualidade Vegetal](https://www.gov.br/agricultura/pt-br/assuntos/inspecao/produtos-vegetal/legislacao-de-produtos-origem-vegetal/normativos-cgqv/compendio-qualidade-vegetal.pdf/%40%40download/file), entry for cassava-derived starchy products, pp. 28 and 274 in the PDF. | Current index lists IN MAPA 23/2005 and the guidance on inexigibility of standardization for polvilho doce/azedo. It confirms the guidance remains in the current compendium; it does not turn the 2022 guidance into a uniform quality standard. |
| **WP02-POLVILHO-LABELS-20261010-S02** | Brazil, MAPA, [2025 Regulatory Impact Analysis, process 21000.069706/2024-41](https://www.gov.br/agricultura/pt-br/acesso-a-informacao/bpr/analise-de-impacto-regulatorio/relatorio-de-analise-de-impacto-regulatorio/sda/2025/21000-0697062024-41.pdf); current MAPA [2025 RIA index](https://www.gov.br/agricultura/pt-br/acesso-a-informacao/bpr/analise-de-impacto-regulatorio/relatorio-de-analise-de-impacto-regulatorio/sda/2025). | The report describes a proposed revision of the cassava-starch standard that would recognize polvilho azedo distinctly from polvilho doce. The MAPA index still labels it a proposed portaria/RIA; this is evidence of a planned review, not an enacted rule. No proposed thresholds or measurements are imported. |
| **WP02-POLVILHO-LABELS-20261010-S03** | Embrapa Mandioca e Fruticultura, *Processamento e utilização da mandioca* (2005), [Embrapa Alice record and PDF](https://www.alice.cnptia.embrapa.br/alice/handle/doc/653661), section “Utilização da mandioca e de seus produtos na alimentação humana,” PDF pp. 233–234. | Describes polvilho doce and azedo as two named products with process differences. Regional technical book; not a current standard, recipe specification, or bilingual terminology authority. |
| **WP02-POLVILHO-LABELS-20261010-S04** | Incol Alimentos, Brazilian cassava-products [manufacturer catalog](https://incol.com.br/). | Separately lists fécula de mandioca, polvilho doce, and polvilho azedo in its own product lineup. This supports product-family separation at one producer only; it does not establish universal composition or aliases. |
| **WP02-POLVILHO-LABELS-20261010-S05** | Grupo PQ Alimentos, [Polvilho Doce](https://www.grupopq.com.br/produto/polvilho-doce/) and [Polvilho Azedo](https://www.grupopq.com.br/produto/polvilho-azedo/) manufacturer pages. | The pages pair the product names with `sweet cassava starch` and `sour cassava starch`, respectively. Product-specific English label translations, not standards. The Doce page also shows a `Grupo I – Fécula – Tipo 1` classification line; because MAPA guidance says polvilhos are outside IN 23/2005’s standard scope, do not generalize that page line into legal equivalence. |
| **WP02-POLVILHO-LABELS-20261010-S06** | A.B. Food & Beverage, [English Olinda/Indemil starch catalog](https://abfoodbeverage.com/wp-content/uploads/2017/09/AB-Food-Catalog-English.pdf), pp. 13–15. | For the Olinda Sweet product, its “You may know as” list includes Polvilho Doce, Tapioca Starch, and Fécula. This is an importer/distributor’s product-specific market mapping; it does not establish `tapioca starch` or `sweet tapioca starch` as global aliases. |
| **WP02-POLVILHO-LABELS-20261010-S07** | Canadian retail listings: [Parce Canada’s Brazilian groceries](https://parce.ca/store-c/groceries-canada/) lists Da Terrinha polvilho azedo as “Sour Cassava Tapioca Starch”; [Rapidito Latin Market’s Pinduca product listing](https://rapiditolatinmarket.ca/products/pinduca-amidon-aigre-de-manioc-polvilho-azedo-500g) uses “Sour Cassava Starch (Amidon Aigre de Manioc).” | These are retailer titles/product listings, not package standards or Québec terminology rulings. They show that Canada-market English labels vary and that `amidon aigre de manioc` is in Canadian retail use for one named product. Preserve the product/source context; do not treat these as general alias evidence. |
| **WP02-POLVILHO-LABELS-20261010-S08** | French-language cassava research, including CIRAD’s [French-language cassava-processing proceedings](https://horizon.documentation.ird.fr/exl-doc/pleins_textes/pleins_textes_6/colloques1/43505.pdf) and Brabet’s [CIRAD thesis record](https://publications.cirad.fr/une_notice.php?dk=312828). | Documents French descriptive usage such as `amidon aigre de manioc` for fermented cassava starch and links it to Brazilian `polvilho azedo`. Academic terminology outside Québec; useful for term review, not proof of a preferred fr-CA display. |

## Next work

1. Ask the bilingual terminology reviewer whether the fr-CA displays should keep `polvilho doce` / `polvilho azedo` alone or pair them with a short explanatory gloss. Keep the observed Canadian `amidon aigre de manioc` as a term to evaluate, not an approved alias.
2. Keep the four English labels distinct in review notes: accept `sour cassava starch` as a supported descriptor for azedo; retain `sweet cassava starch` with the source product name; hold `sour tapioca starch` and `sweet tapioca starch` as provenance-bound wording.
3. Check the final status of MAPA’s proposed revision before making any regulatory or quality-standard claim. Until a final act is located, retain the 2022 guidance’s stated limits.
4. Keep the two candidate rows identity-only. No forms, measurements, density, conversions, yields, substitutions, or recipe links are proposed here.
