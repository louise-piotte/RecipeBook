# WP03 Section F — White canjica maize identity review (2026-10-13, R67)

- **Status:** proposal only; no catalog JSON, ledger, roadmap, or checklist data changed.
- **Gap:** the open Section F regional cereal-mix and preprocessed-grain review includes a Brazilian white canjica grain product not present in the current catalog.
- **Recommendation:** integrate one identity-only reference for the white canjica grain product. Do not merge it with corn kernels, hominy corn, or hominy grits, and do not add a general `hominy` alias.
- **Proposed displays:** English `white canjica maize`; Québec French `maïs blanc pour canjica`. Preserve the Canadian retail wording `Canjica White` as one English alias if the catalog canonical is phrased naturally; no other aliases are needed.
- **Scope:** white-class packaged canjica maize, a *Zea mays* grain or grain-piece product with partial or total germ absence from mechanical or manual scarification (degermination). This is a source-defined regional processed-grain identity, not a universal white-corn, nixtamalized hominy, prepared dessert, or cooked-grain identity.

## Identity and process evidence

MAPA's official product compendium defines *canjica de milho* as *Zea mays* grains or grain pieces with partial or total germ absence resulting from mechanical or manual scarification (degermination). It also classifies canjica by size, remaining pericarp, color, and quality. The white class is a color class, with the standard's white/ivory/straw wording and threshold; yellow and mixed classes also exist. MAPA's current product-registration listing continues to identify Canjica de Milho and cites Portaria MA 109/1989. The process and product category are therefore distinct from ordinary unprocessed corn kernels, though the source standard itself is dated 1989 and the compendium reproduces that standard rather than a new product-specific standard [S01–S02].

The proposal intentionally covers only the documented white retail product. Yoki's manufacturer page identifies its 400 g product as `Canjica de Milho`, lists the ingredient as white canjica maize, and provides a package-serving statement. A Canadian retailer separately labels a Yoki product `Canjica White`. Québec retailers list a Yoki `Canjica Cristal` product as white-maize grains; one Longueuil product description says the grains are degerminated. These sources corroborate a real product sold under this name, while the MAPA standard supplies the clearest process identity [S03–S06].

Do not generalize the row to every canjica color or grade. MAPA also recognizes yellow and mixed classes and several industrial size groups. Their classification does not establish separate culinary forms, a home grind scale, or interchangeable recipe behavior. The proposed record is the white product class only; size and pericarp grades remain outside active aliases and forms.

## English and Québec French naming

| Locale | Proposed wording | Evidence and limit |
|---|---|---|
| English | `white canjica maize` | Mi Tierra Latina's Canada-facing page labels its Yoki item `Canjica White` and describes traditional Brazilian corn kernels. Use `Canjica White` as an alias if the English display is reordered for readability. This is retail naming, not a standard English term; the product page showed sold out when opened and its detail content is stale. |
| Québec French | `maïs blanc pour canjica` | Padoca Cuisine in Longueuil uses this exact phrase for Yoki Canjica Cristal and describes selected, degerminated white maize grains. Its page appeared in a search-index extract crawled two weeks before this review, but direct opening returned a cache miss and the extract showed the item out of stock. Treat it as local retail wording, not an OQLF-approved term. |
| Montréal corroboration | `Canjica Cristal Mais blanc concassee` / `grains de maïs blanc` | Marche Branche D'Olivier's Montréal listing uses the product title and describes natural white maize grains. Its title's unaccented `Mais` and `concassee` are not adopted as catalog wording: the description says grains and does not substantiate a ground form. The page's stock indicator is volatile. |

The OQLF entry for `maïs lessivé` is not a translation for this product. Its 1979 definition describes mature dry yellow or white maize placed in a preserving liquid and its note discusses alkaline treatment. MAPA's canjica definition instead identifies mechanical/manual scarification and degermination. Keep the existing `maïs lessivé / hominy corn` row and this proposed white canjica identity distinct; the OQLF entry is old and scoped to its own product definition [S07].

## Ownership, archive, picker, and recipe audit

The read-only live snapshot contains 1,389 ingredient references, 100 forms, 63 legacy-import candidates, and 1,722 research-ledger records. Complete normalized phrase checks found no `canjica`, `canjica white`, `white canjica`, `white canjica maize`, `canjica de milho`, `canjica de milho branca`, `maïs blanc pour canjica`, or `canjiquinha` owner in active references, form labels/match terms, legacy identities, or ledger records. A pre-write search across Section F proposals, batch notes, the research ledger, and the global plan found no previous canjica review. The proposed `ingredient-ref-canjica-white-maize` ID and `WP03-CANJICA-R67-20261013-` source prefix were unused before this proposal was created. The current plan leaves the broader Section F regional cereal-mix and preprocessed-grain review open [plan].

| Current row or query | Live ownership and picker effect |
|---|---|
| `ingredient-ref-corn-kernels` | `corn kernels / maïs`; no aliases, attached forms, density, or unit mappings; category `VEGETABLE_AND_AROMATIC`. |
| `ingredient-ref-hominy-corn` | `hominy corn / maïs lessivé`, with only English `lyed corn`; no attached forms, density, or unit mappings. Its ledger record is already verified. |
| `ingredient-ref-hominy-grits` | `hominy grits / gruau de maïs`; no aliases, attached forms, density, or unit mappings. Its ledger record is already verified. |
| `ingredient-ref-corn` in legacy candidates | One unreviewed generic legacy identity (`corn / mais`); it is not an active owner of the canjica product phrase. |
| `canjica`, `Canjica White`, `maïs blanc pour canjica` | No current active phrase match. A new bilingual identity would make the exact product phrases and bare `canjica` query resolve to this row alone. The bare query can also name the prepared Brazilian dessert; the ingredient picker has no separate dessert row, and the current recipe corpus contains no such term. |
| `hominy` | Currently returns the separate hominy-corn and hominy-grits rows. Do not add this term to the new row, so the existing broad result set stays intact. |
| `maïs` | Currently matches 22 active references. The proposed French display would add one relevant result to this already broad query, not capture it as a singleton. Keep `maïs` out of aliases. |

The picker normalizes case, accents, ligatures, and punctuation; it prefers complete normalized word phrases and falls back to substring matches. With the proposed display plus only the source-attested `Canjica White` English alias, exact searches for `white canjica maize`, `Canjica White`, and `maïs blanc pour canjica` would have one owner. Bare `canjica` would also select this ingredient row because it appears inside the canonical terms. This is a deliberate product-specific search result, but it does not make the prepared dessert itself an ingredient identity. No hominy, generic corn, `corn kernels`, `canjica de milho branca`, `canjiquinha`, or `mungunzá` aliases should be added without separate intent evidence.

The bundled seed has 114 recipe files and 1,123 ingredient rows. Exact checks for `canjica`, `canjiquinha`, `mungunzá`, and `munguzá` found no recipe demand or row to relink. The proposal adds no recipe link.

## Measures, forms, and substitutions

Yoki reports a serving of 50 g as `⅓ xícara de chá` on its white canjica product page [S03]. Preserve this only as a manufacturer-label, product-specific portion observation if the identity is integrated. The page gives no millilitre capacity for `xícara de chá`; do not convert it to the app's cup, derive a density, or create a reusable unit mapping. The package size and MAPA's moisture, size-screen, and quality-class thresholds are not kitchen measures.

Yoki's separate `Canjiquinha de Milho` is described as yellow canjica maize, crushed; it gives the same nominal 50 g / ⅓ cup serving. That statement belongs to the crushed yellow product and must not be transferred to white whole-grain canjica. Keep `canjiquinha` outside this reference. No recipe-tested substitute was located in the reviewed sources; do not add a substitution rule. Keep cooked yield and dry-to-cooked conversion inactive [S08].

## Integration sketch

If accepted by the root integrator:

- Add `ingredient-ref-canjica-white-maize` in `GRAIN_AND_CEREAL` with English `white canjica maize`, French `maïs blanc pour canjica`, and only English alias `Canjica White`.
- Keep `defaultDensity: null`, `unitMappings: []`, and no ingredient forms or recipe links.
- Add a research-ledger identity record with the MAPA process and Québec naming evidence. It may retain Yoki's `50 g (⅓ xícara de chá)` as a source-specific manufacturer-label observation, with the unstated cup volume convention explicit. Do not use it as an active app conversion.
- Leave substitution research unallocated/not yet researched and add no contextual or form-conversion rule.
- Keep yellow/mixed canjica, canjiquinha, prepared canjica/mungunzá dessert, canned or cooked `white hominy canjica`, and the existing hominy products outside the proposed identity.

## Sources

| ID | Source | Supports and limitations |
|---|---|---|
| S01 | MAPA, [Compêndio de Produtos Vegetais](https://www.gov.br/agricultura/pt-br/assuntos/inspecao/produtos-vegetal/legislacao-programas-nacionais-e-seguranca-dos-alimentos-1/legislacao/compendios/compendio-produtos-vegetais.pdf/%40%40download/file), pp. 119–121, Canjica de Milho; accessed 2026-10-13. | Official product definition, species, degermination process, classification groups and white/yellow/mixed classes. The entry cites Portaria MA 109/1989. Industrial grading details are not recipe measures. |
| S02 | MAPA, [Produtos de origem vegetal padronizados e referências normativas](https://www.gov.br/agricultura/pt-br/assuntos/inspecao/produtos-vegetal/registro-importacao-e-exportacao-1/registro/registro-de-estabelecimentos/padroes-aplicaveis-as-bebidas), Canjica de Milho row; accessed 2026-10-13. | Current MAPA page lists Canjica de Milho and cites Portaria 109/1989. This confirms the official reference remains listed on the page; it does not show whether the 1989 technical text has since been amended. |
| S03 | Yoki, [Canjica de Milho, 400 g](https://www.yoki.com.br/produtos/canjica-de-milho-400-g); accessed 2026-10-13. | Manufacturer states the product is white canjica maize and gives 50 g = ⅓ xícara de chá. The capacity of that source measure is not supplied; this is one product's label portion, not a density or general conversion. |
| S04 | Mi Tierra Latina, [Yoki, Canjica White, 500 g](https://mitierralatina.ca/products/yoki-canjicawhite-500g); accessed 2026-10-13. | Canada-facing English retail title and grain-product description. The detail page is crawled about 1.4 years ago and showed sold out; use for naming only, not current availability or process. |
| S05 | Marche Branche D'Olivier, [Canjica Cristal, 400 g](https://branchedolivier.com/products/canjica-cristal-400g); accessed 2026-10-13. | Montréal retailer page title and description identify a Yoki product and white maize grains. Its title includes the ambiguous/nonstandard `concassee`; the body does not support a ground form. Inventory is volatile. |
| S06 | Padoca Cuisine, [Canjica Cristal Yoki](https://padocacuisine.com/products/canjica-cristal); search-index extract crawled about two weeks before access; direct page open returned a cache miss. | Longueuil retailer uses `maïs blanc pour canjica`, describes selected, degerminated white maize grains, and calls canjica/mungunzá a dessert. The extract showed the item out of stock; wording is market evidence, not official terminology or availability evidence. |
| S07 | OQLF, [maïs lessivé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17059882/mais-lessive); accessed 2026-10-13. | Preferred French term and definition for the distinct hominy-corn product in liquid, with an alkaline-treatment note. Entry last updated 1979; used here as a product-boundary comparator, not as a modern general corn-processing standard. |
| S08 | Yoki, [Canjiquinha de Milho](https://www.yoki.com.br/produtos/yoki-canjiquinha-de-milho); accessed 2026-10-13. | Manufacturer says the yellow canjica maize is crushed and publishes a 50 g / ⅓ cup serving. This is a separate grind/color product and its serving cannot be transferred to the proposed white-grain reference. |

## Review outcome

The official process definition, a current manufacturer white product, Canadian English retail naming, and Québec French retail wording support a bounded white canjica grain identity. The recommendation is identity-only integration, with source-specific portion evidence kept out of runtime conversions. The remaining limits are the retailer-only Québec French label, the potentially dish-level use of bare `canjica`, and the lack of recipe demand or substitution studies. No tests or emulator checks were run because this is a proposal-only documentation change.

## Root integration outcome

Integrated on 2026-10-13 as identity-only `white canjica maize / maïs blanc pour canjica` with
English alias `canjica white`. The research ledger retains Yoki's 50 g / ⅓ `xícara de chá` serving
only as a product-specific manufacturer-label observation; no app conversion, density, form, recipe
link, cooking yield, or substitution was added. The identity remains separate from `maïs lessivé`,
hominy grits, and yellow crushed `canjiquinha`. See the [integration record](../batches/wp03-section-f-canjica-white-maize-identity-integration-20261013/README.md).
No app tests or emulator checks were run because the change only adds database JSON data.
