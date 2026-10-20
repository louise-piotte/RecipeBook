# WP05 Section W follow-up — kimchi and soy-sauce styles

**Packet type:** proposal only  
**Owner/author:** `/root/wp05_east_asia`  
**Reviewer:** coordinator integration review completed for the three rows in this packet  
**Status:** partially accepted; kimchi and the two soy-sauce styles integrated on 2026-10-08  
**Prepared/source access date:** 2026-10-08  
**Scope:** a small follow-up tranche from Section W, lines 1283–1297; does not complete Section W or WP05  
**Live input revision:** `0caaef893ebd9e12443c62fdbbb6a5a328c53fc4`  
**Live snapshot hashes:** ingredient-reference seed `9a616b7c93683953d27f224f40d18d358bb60e0ea2b8eddbbe6b677c146ead3b`; ingredient forms `247a927eb706ac3867d001f556b480bdc5244a80eaeffe85a0861497a9c0378a`; research ledger `b16fde35456b4c85520a87b4e2f930ebca3bcc1f43feb8bdc1e86624b018e604`.

## Live-state review

The no-kimchi/no-style observation below is the proposal-preparation snapshot. The coordinator has since integrated kimchi, light soy sauce, and dark soy sauce in batches/wp05-kimchi-soy-sauce-styles.md. Remaining Section W candidates are still open.


The live canonical seed already includes generic soy sauce, tamari, white miso paste, bamboo shoots, mayonnaise, oyster sauce, hoisin sauce, plum sauce, and black bean sauce. The WP05 first-tranche integration record confirms the four latter prepared sauces were integrated on 2026-10-08; it also integrated tahini, which must not be re-proposed as East Asian sesame paste. Those existing identities are excluded below.

At proposal preparation, the form seed contained 16 forms and no soy-sauce style forms or kimchi form, and the searched references had no kimchi or dedicated light/dark soy identities. At that snapshot, the Section W soy-style and kimchi rows were unchecked. Other active delegated regional work observed then was South/Central Asia–MENA and Southeast Asia; no East Asia agent was active. The first WP05 tranche left soy-style coverage and remaining Korean products open.

## Selected source-ready proposal tranche

Three proposals are included: one new identity and two explicit style/form records under the existing soy-sauce identity. Stable IDs below are recommendations and remain subject to catalog/schema review.

| Proposed stable ID | EN display | fr-CA display | Source-supported aliases | Boundary, disposition, and evidence |
|---|---|---|---|---|
| `ingredient-ref-kimchi` | **kimchi** | **kimchi** | fr: `kim chi`; en: `kim chi`, `kim chee`, `kimchee` | New prepared fermented-vegetable identity. OQLF defines it as Korean seasoned, fermented vegetables served as an accompaniment and lists these term variants. Keep it distinct from fresh cabbage, pickled vegetables generically, and fermented fish/shrimp condiments. Do not create named kimchi types as aliases; add types only as separately supported records/forms. The coordinator assigned **SAUCE_AND_CONDIMENT** because OQLF defines kimchi as a prepared fermented accompaniment and the canonical catalog already uses that category for pickles; the category choice is recorded in the batch file. |
| `ingredient-ref-light-soy-sauce` | **light soy sauce** | **sauce soya claire** | No global aliases proposed. The PRB French-language product page uses `sauce soja légère`; retain as a manufacturer wording candidate only, not an automatic fr-CA alias. | Separate searchable Chinese-style product identity, kept distinct from generic soy sauce and low-sodium soy sauce. OQLF names `sauce soya claire` and says it is more liquid and saltier than dark soy sauce; Pearl River Bridge presents light soy sauce as a separate product category. Do not equate it with Japanese usukuchi without a direct crosswalk. |
| `ingredient-ref-dark-soy-sauce` | **dark soy sauce** | **sauce soya foncée** | No global aliases proposed. PRB French wording `sauce soja noire` is not proposed as an alias because OQLF’s `sauce de soja noir / sauce de soya noir` names the separate black-bean sauce identity. | Separate searchable Chinese-style product identity, distinct from generic/low-sodium soy sauce, light soy sauce, black bean sauce, and mushroom-flavored dark soy sauce. OQLF names `sauce soya foncée`; Pearl River Bridge lists dark soy sauce as a product category. Do not map it to a Japanese JAS style without a source-backed crosswalk. |

### Candidate disposition

- **Kimchi:** the proposal snapshot had no canonical identity. The coordinator integrated the generic identity above with only the OQLF-authorized, language-scoped spellings.
- **Light/dark soy styles:** generic `ingredient-ref-soy-sauce` remains. The coordinator integrated separate identity rows because the current form model represents preparation states, not product-style dimensions. No form records were created.
- **Rejected duplication:** do not recreate soy sauce, tamari, white miso, oyster, hoisin, plum, black-bean sauce, bamboo shoots, mayonnaise, or tahini identities from the earlier proposal/first-tranche work.
- **Not selected in this follow-up:** shiro (extra-light), saishikomi (refermented), regional Chinese/Japanese soy styles, doubanjiang, douchi, fermented bean curd, sesame paste, chili products, Japanese condiments/preserves, Korean pastes/jeotgal and Chinese pickles. Their identity/style crosswalks, fr-CA display wording, or exact scope still require direct review. In particular, `usukuchi` is a Japanese JAS light-colour style, not an automatically accepted alias for generic Chinese light soy sauce.

## Direct source evidence

All sources directly reviewed on **2026-10-08**:

1. Office québécois de la langue française, [“kimchi” (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26529902/kimchi). Defines the Korean fermented vegetable accompaniment; preferred French terms are *kimchi* and *kim chi*; English terms include *kimchi*, *kim chi*, *kim chee*, and *kimchee*.
2. Office québécois de la langue française, [“sauce soya” (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095123/sauce-soya). Defines soy sauce; lists the clear/dark variants and directly says the clear one is more liquid and saltier. The page’s note supplies the exact French wording *sauce soya claire* and *sauce soya foncée*; its English concept is *soy sauce*.
3. Pearl River Bridge, [Superior Light Soy Sauce (English)](https://www.pearlriverbridge.com/superior-light-soy-sauce). Manufacturer product/category wording supports *light soy sauce* and its distinct use as a Chinese-style product.
4. Pearl River Bridge, [Sauce soja légère supérieure (French)](https://fr.pearlriverbridge.com/superior-light-soy-sauce). Supports the manufacturer wording *sauce soja légère* for its light-soy product; this is documented as a product-language variant rather than selected as the fr-CA preferred display.
5. Pearl River Bridge, [Dark Soy Sauce (English)](https://www.pearlriverbridge.com/dark-soy-sauce/). Manufacturer category and product wording supports *dark soy sauce* and describes coloring use. Its mushroom-flavored dark soy sauce is a flavored compound/style product, not an alias for generic dark soy sauce.
6. Pearl River Bridge, [Sauce soja foncée (French)](https://fr.pearlriverbridge.com/dark-soy-sauce). The product page uses the wording *sauce soja noire* in headings and *sauce soja foncée* in product text. The latter corroborates the proposed term; the former is not proposed globally because of the OQLF black-bean-sauce term collision.
7. Japanese Soy Sauce Information Center, [“Types and how to use them”](https://www.soysauce.or.jp/en/types-and-how-to-use-them). The JAS set includes common, light-colour, tamari, refermented, and extra-light-colour types; it separately describes soy-sauce blends such as dashi soy sauce, tsuyu, tare, and ponzu soy sauce. Used here to bound unresolved Japanese/Chinese crosswalks, not to assert synonymy.

## Measurement, conversion and substitution state

For all three proposals, **density, unit mappings/conversions, package-yield relations and substitutions are unavailable**. The sources reviewed do not give a supported exact-form mass-per-volume observation or cooking substitution ratio. Do not infer values from sauce categories, brands, color, saltiness, or recipe role. Proposed form records should carry no density or unit mapping; the kimchi identity should carry no measurement or substitution rule.

## Coordinator integration review

The coordinator rechecked the live seed, forms, ledger, normalized aliases, and recipe lines before merge. No bundled recipe ingredient line mentions kimchi or light/dark soy sauce styles. The form schema describes preparation states, so the two soy styles were stored as separate identities. The OQLF-preferred Québec French labels were retained; manufacturer wording `sauce soja noire` was excluded as an alias because of the black-bean-sauce collision. Normalization, generated-index freshness, package tests, Android unit tests, and diff checks are recorded in the batch and workflow checkpoint.

## Acceptance

**Partially accepted by the coordinator on 2026-10-08.** Kimchi, light soy sauce, and dark soy sauce are integrated as three identity rows and covered by focused catalog search tests. This does not complete the full Section W or WP05 sweep; the remaining candidates and open measurements/substitutions stay in scope.
