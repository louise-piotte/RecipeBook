# WP05 Section W — Koikuchi and Usukuchi Soy-Sauce Styles

- **Status:** Integrated, identity-only; broader Section W remains open.
- **Scope:** Japanese koikuchi and usukuchi soy-sauce styles, kept distinct from generic soy sauce/shoyu, Chinese-style light and dark soy sauce, shiro shoyu, saishikomi, and tamari.
- **Integration date:** 2026-10-11.

## Catalog rows

| ID | English display | Québec French display | Aliases | Category |
|---|---|---|---|---|
| `ingredient-ref-koikuchi-soy-sauce` | `koikuchi soy sauce` | `sauce soya de type koikuchi` | EN: `koikuchi shoyu`; FR: none | `SAUCE_AND_CONDIMENT` |
| `ingredient-ref-usukuchi-soy-sauce` | `usukuchi soy sauce` | `sauce soya pâle (usukuchi)` | EN: `usukuchi shoyu`; FR: none | `SAUCE_AND_CONDIMENT` |

JAS 1703 defines koikuchi and usukuchi as separate Japanese soy-sauce styles. Québec and Canadian products use the qualified style names. An independent Québec French review accepted both displays. Bare `shoyu` stays on generic soy sauce. Color-only descriptions `sauce soya claire` and `sauce soya foncée` remain owned by Chinese-style light and dark soy sauce, respectively; they were not copied to these rows.

No bundled recipe line names either style, so no recipe link was added. These style identities have no forms, densities, unit mappings, measurements, conversions, package yields, or substitutions. No package or nutrition value was generalized.

## Evidence

- [JAS 1703:2021, Soy Sauce (Shoyu)](https://www.maff.go.jp/j/jas/jas_standard/attach/pdf/index-470.pdf), §§1 and 3.8–3.10: separate style scope and definitions.
- [MAFF, Soy sauce, miso, other seasonings](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/syouyu-miso.html): descriptive style distinctions.
- [OQLF, sauce soya](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095123/sauce-soya): Québec family wording; it does not standardize either full Japanese-style compound.
- Québec retail/product language: [Tokusen usukuchi](https://tokusen.store/collections/produits-de-detail/products/usukuchi), [Tokusen koikuchi product](https://tokusen.store/collections/sushi/products/haizakura), and the local Montréal [koikuchi listing](https://staysharpmtl.com/products/maruama-sauce-soya-foncee).
- Independent terminology review: [`wp05-koikuchi-usukuchi-soy-style-quebec-wording-review-20261011.md`](../../proposals/wp05-koikuchi-usukuchi-soy-style-quebec-wording-review-20261011.md). The source-to-claim register and owner/collision audit are in the [identity proposal](../../proposals/wp05-koikuchi-usukuchi-soy-style-review-20261011.md).

## Validation

- Current package: **1,083 references**, **79 forms**, **114 recipes / 1,123 ingredient rows**.
- Research ledger: **1,382 records**, **4,590 source entries**, **3,755 distinct source IDs**.
- Reference normalization, bundled-package normalization and validation, ledger-schema validation, generated-index freshness, exact-name/source-ID collision checks, no-demand scan, UTF-8/no-BOM, and whitespace checks passed.
- No tests or emulator runs were performed. The change only adds database JSON data, as allowed by [`AGENTS.md`](../../../../AGENTS.md).
