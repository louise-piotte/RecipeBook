# WP03 Section G couscous, pasta-shape, and noodle identities

- **Reviewed:** 2026-10-07
- **Status:** six identity-only products integrated; independent Québec terminology review completed for the couscous and pasta-shape rows, with ramen terms directly supported by OQLF.
- **Owner:** WP03 identity research; WP10 catalog integration lead for canonical IDs, seed merge, and validation.
- **Dependencies:** completed Section G generic pasta identity and direct Québec terminology sources.
- **Scope:** couscous as a semolina ingredient, pearl couscous, orzo, macaroni, ramen noodles, and penne. This packet does not infer cooking forms, universal composition, measurements, density, yields, conversions, substitutions, or recipe links.

## Acceptance checks

- [x] Use direct OQLF product definitions for couscous, orzo, and macaroni.
- [x] Use the OQLF definition and bilingual terms for ramen noodles; keep instant noodles, instant ramen, and ramen soup outside the identity.
- [x] Use the OQLF shape definition and supported terms for penne; keep surface variants and ambiguous occasional French terms out of aliases.
- [x] Keep regular couscous separate from pearl couscous and the prepared couscous dish.
- [x] Add only source-supported aliases: French `orzos` and English `risoni` for orzo, plus French `macaronis` for macaroni.
- [x] Keep `Israeli couscous`, `Jerusalem couscous`, `Mograbieh`, and `ptitim` inactive as broad aliases; a Québec directory listing applies those terms to one named product.
- [x] Keep all measurement, form, yield, conversion, and substitution data unset.
- [x] Complete an independent Québec terminology review of the four couscous and pasta-shape identities and aliases; independently audit the penne labels and alias scope.
- [x] Audit all 114 bundled recipes and normalized catalog keys; no ingredient lines or exact collisions were found.
- [ ] Validate the normalized package, generated Kotlin index, ledger, unit tests, and Pixel 9a emulator behavior for all six products.

## Integrated references

| ID | English | fr-CA | Aliases | Category | Identity boundary |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-couscous` | couscous | couscous | None | `GRAIN_AND_CEREAL` | OQLF-defined agglomerated semolina grains, steamed and dried. Keep the separately defined prepared dish outside the ingredient reference. |
| `ingredient-ref-pearl-couscous` | pearl couscous | couscous perlé | None | `GRAIN_AND_CEREAL` | Named pearl-couscous retail product family, separate from regular couscous. No universal composition or synonym set is inferred. |
| `ingredient-ref-orzo` | orzo | orzo | FR: `orzos`; EN: `risoni` | `GRAIN_AND_CEREAL` | OQLF-defined pasta shape resembling barley or flattened rice. The source says it is generally made with durum semolina; the catalog does not assert a universal composition. |
| `ingredient-ref-macaroni` | macaroni | macaroni | FR: `macaronis` | `GRAIN_AND_CEREAL` | OQLF-defined elbow- or tube-shaped pasta. Keep prepared macaroni dishes separate. |
| `ingredient-ref-ramen-noodles` | ramen noodles | nouilles ramen | FR/EN: `ramen` | `GRAIN_AND_CEREAL` | OQLF-defined fine quick-cooking egg noodles made from wheat flour. Keep instant-noodle products and prepared ramen soup separate. |
| `ingredient-ref-penne` | penne | penne | FR: `pennes`; EN: `mostaccioli` | `GRAIN_AND_CEREAL` | OQLF-defined short tubular pasta with bevelled ends. Category follows the project's existing pasta classification and does not assert a specific grain composition. |

The OQLF distinguishes the couscous semolina product from the prepared dish while using the same bilingual name. The ingredient row follows only the cereal-product sense. Pearl couscous remains distinct: a Québec manufacturer presents it as a separate product category from its regular couscous, and the Québec Food Directory lists a pearled couscous product as a cereal/grain/pulse product. The same directory names one larger product “Large Pearl Couscous Israeli”; that single listing does not make Israeli, Jerusalem, Mograbieh, or ptitim universal aliases.

OQLF gives `orzo` as the preferred Québec French and English term, records the French plural `orzos`, and lists `risoni` as an English term. It lists `langue d'oiseau` and `pâte grecque` as French terms used mainly in France or Belgium, so neither is active in the Québec catalog. OQLF defines macaroni by its elbow or tube shape and records `macaronis` as the French plural. Neither row inherits broad `pasta` or `noodles` aliases.

An independent Québec terminology reviewer confirmed the chosen labels and category assignments for the four couscous and pasta-shape identities, and recommended keeping the variant names above out of the pearl-couscous aliases. OQLF supplies the French and English ramen terms and defines its wheat-flour noodle product; the category assignment follows the project taxonomy. A separate reviewer confirmed the penne terms and alias boundary, including that `penne lisce` and `penne rigate` name surface variants, while `plume` is an occasional term excluded from normalization as an ambiguous common noun. Penne uses the project's existing category for generic pasta; no grain composition is inferred. All six references have empty density and unit-mapping fields; no forms, recipe links, yields, conversions, or substitutions were added.

## Recipe and collision audit

All 114 bundled recipe files were scanned. No ingredient line uses couscous, pearl couscous, orzo, macaroni, ramen noodles, penne, or their accepted aliases. The turkey-meatball recipe mentions regular couscous only as a serving suggestion, so no recipe line was linked or changed.

The normalized catalog-key audit found no exact collision for any accepted label or alias. The broad query `couscous` intentionally returns both `ingredient-ref-couscous` and `ingredient-ref-pearl-couscous`; the qualified queries `pearl couscous` and `couscous perlé` resolve to the pearl product alone. `langue d'oiseau`, `pâte grecque`, unsupported pearl-couscous variant names, instant-noodle phrases, `penne lisce`, `penne rigate`, and `plume` are not active search terms.

## Sources

- **WP03-S164 — OQLF, [couscous (céréale traitée)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502225/couscous):** bilingual ingredient name and semolina-grain product definition.
- **WP03-S165 — OQLF, [couscous (mets)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502206/couscous):** separate prepared-dish sense.
- **WP03-S166 — Codex Alimentarius, [Standard for Couscous CXS 202-1995](https://www.fao.org/input/download/standards/65/CXS_202e.pdf):** corroborates the durum-semolina food-product scope and physical processing.
- **WP03-S167 — Zinda, [Le couscous perlé](https://produitszinda.ca/collections/couscous-perle):** Québec manufacturer’s separate pearl-couscous product category, French label, and product examples.
- **WP03-S168 — Québec Food Directory, [Organic Pearled Couscous](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8207445):** English product name and cereal/grain/pulse product category.
- **WP03-S169 — Québec Food Directory, [Large Pearl Couscous Israeli](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8215655):** one product-specific name; not generalized as a universal synonym list.
- **WP03-S170 — OQLF, [orzo](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2094699/orzo):** product definition, Québec French term, English terms, and regional-use notes.
- **WP03-S171 — OQLF, [macaroni](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8364650/macaroni):** product shape, bilingual name, and French plural.
- **WP03-S172 — OQLF, [nouilles ramen](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26529875/nouilles-ramen):** fine quick-cooking wheat-flour noodle product, French preferred term and alias, English terms, and product scope.
- **WP03-S173 — OQLF, [penne](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2094755/penne):** short tube with bevelled ends, preferred French and English term, French plural, English alternative, and smooth/ridged market variants.

## Verification record

Verified on 2026-10-07 with the isolated Pixel 9a AVD (`emulator-5556`, Android 16 / API 36). Seed normalization, generated-index freshness, research-ledger schema validation, UTF-8/no-BOM and mojibake checks, and `git diff --check` passed. All 125 bundled seed JSON files parse, use escaped Unicode, and have no BOM. The 9 Python seed-package tests and 267 Android unit tests passed. The deploy script's full Gradle `test` task and debug APK assembly passed; the APK installed and launched. Connected instrumentation's XML report shows 29 cases: 27 passed, 2 environment-gated skips, and 0 failures. The Gradle runner log reported an inconsistent total, so the XML report is the recorded count.

In English app mode, exact picker searches for `ramen noodles` and `penne` each returned their one matching product. In French app mode, `nouilles ramen` returned `nouilles ramen`, and `penne` returned `penne`. The unit tests cover aliases `ramen`, `pennes`, and `mostaccioli`, plus excluded instant-noodle phrases, `penne lisce`, `penne rigate`, and `plume`. The temporary draft was discarded without selecting an ingredient or saving a recipe; the app returned to the French home with 114 recipes. `app.recipebook` remains installed only on `emulator-5556`; the original `emulator-5554` has no package installed.

Pixel screenshots and SHA-256:

- [English ramen picker](pixel9a-ramen-picker-en.png) — `cf2b26ca12fab05e71dca647034c938bc78abbcfca271c99524f29ba0ee83df7`
- [French ramen picker](pixel9a-ramen-picker-fr.png) — `f57f267077b772aa2d181a8a87d70673365ef6f23bcd1c71beb06b296c2776a7`
- [English penne picker](pixel9a-penne-picker-en.png) — `aa4df34d181e02b6be47150d5cb469b3b511c5d59fcfca4933d5c40a1519e20b`
- [French penne picker](pixel9a-penne-picker-fr.png) — `17e5c8d4760ebea8accf5034910f9359096ab18146b63c26cba9ef470d977408`
- [Final French library home](pixel9a-pasta-identities-home-fr-final.png) — `ce1d8de28f6d3375be1352112d0094c49cc0cbfd71ebd92fa1e54e5f385e748f`

Final artifact hashes:

- Ingredient references (373 rows): `ed427b779ff3633cef643cd26d6e35b1f07c9801fe8d8badfd56bad8ede389dc`
- Generated Kotlin catalog: `5dc09367f33cde5678ea031fb1fc46f6223e3ec0d896170ae752e921f69b0bb3`
- Research ledger (543 records): `32497640c4c2135073f507a2fdd9b0edfc43f2d2e8bef51068fcda3ff29dc7a3`
- Debug APK: `7c1a308d59e91a80fce0808491a37c7bebb526f9e062052e0e1855fef0597ba2`

Identity implementation is complete for these six products. Broader Section F/G candidates and the global independent terminology review remain open.
