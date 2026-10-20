# WP05 Section W — Korean fermented pastes and pepper seasoning follow-up

**Packet type:** proposal only  
**Owner/author:** `/root/wp05_east_asia`  
**Reviewer:** coordinator review pending  
**Acceptance status:** prepared; not accepted or integrated  
**Prepared and source access date:** 2026-10-08  
**Scope:** Korean fermented pastes and pepper seasoning in Section W, lines 1304–1305. This packet does not complete Section W or WP05.

## Input revision and live-state recheck

- Git HEAD observed: `0caaef893ebd9e12443c62fdbbb6a5a328c53fc4`.
- Live ingredient-reference seed SHA-256: `34bd437479a29e920486964fc72e48de03581ceb9333d80c2f8e95c2e70a2158`.
- Live ingredient-forms seed SHA-256: `247a927eb706ac3867d001f556b480bdc5244a80eaeffe85a0861497a9c0378a`.
- Live research-ledger SHA-256: `c47ffd66f4a541720ee77b9f735a39bbca410299403b492c92121ae76628a9d4`.
- Checklist SHA-256: `9cf0cdb142d581e370abedff5ff4d800d07818186b2afdead44fc7af5a0ff7ab`.

The checkout was already dirty at inspection: canonical seed/forms, the checklist, workflow-related code/data, and numerous other tracked and untracked files had pre-existing changes. This packet does not replace or amend any of them. The target proposal path was absent before drafting.

Section W’s existing WP05 work covers generic kimchi and separate light/dark soy-sauce identities in `docs/catalog/batches/wp05-kimchi-soy-sauce-styles.md`; the first-tranche work also covers oyster, hoisin, plum, and black-bean sauces. These are excluded. Current live references also contain generic soy sauce, tamari, white miso paste, `ingredient-ref-chili-powder`, and `ingredient-ref-red-chili-flakes`; this packet does not duplicate or rename them. The live forms file has no Korean-candidate entries. Exact searches of the live references, forms, existing WP05 packets, ledger, and all 114 bundled recipe JSON files found no gochujang, doenjang, ssamjang, or gochugaru identity/form/recipe-line matches. The older East Asian proposals leave Korean pastes and jeotgal unselected; no Korean-specific in-progress proposal was found.

## Candidate disposition and proposed records

Stable IDs and labels below are research proposals only.

| Proposed ID | Proposed `nameEn` | Proposed `nameFr` (fr-CA) | Category recommendation | Alias proposal | Identity and boundary |
|---|---|---|---|---|---|
| `ingredient-ref-gochujang` | `gochujang` | `pâte de soja fermentée au piment fort (gochujang)` | `SAUCE_AND_CONDIMENT` | None | Distinct red/dark-red fermented paste. Codex CXS 294-2023 names the product gochujang and expressly excludes chili paste or chili sauce products whose main ingredient is red pepper. Keep separate from dry gochugaru and generic pepper/chili sauces. The proposed French display follows Codex’s official French product name. |
| `ingredient-ref-doenjang` | `doenjang` | `pâte de soja coréenne doenjang` | `SAUCE_AND_CONDIMENT` | None | Korean fermented soybean paste, supported by Sempio’s named product and a Canadian French-market product listing. Codex CXS 298R defines the broader fermented-soybean-paste class, but does not by itself establish a complete Korean-product crosswalk. Do not alias to white miso, generic soybean paste, shoyu/ganjang, or other fermented pastes. |
| `ingredient-ref-ssamjang` | `ssamjang` | `pâte de soja assaisonnée ssamjang` | `SAUCE_AND_CONDIMENT` | None | A separately named prepared Korean condiment/paste: producer descriptions identify fermented soybean paste with added seasonings (including red-pepper seasoning in the cited products). Keep distinct from its doenjang/gochujang components. The French phrase is documented on a Canadian French retailer product title; it is not asserted as an OQLF-preferred term. |
| `ingredient-ref-gochugaru` | `gochugaru` | `piment coréen gochugaru` | `BAKING_AND_SPICE` | None | Dry pepper seasoning, distinct from fermented gochujang and from generic `chili powder` and `red chili flakes`. Product sources document both coarse flakes and finer grind variants, but these are not proposed as preparation-state forms or aliases. A “Korean” style name does not guarantee Korean-grown pepper: the cited Québec retail product lists China as pepper origin and Tae Kyung (Korea) as manufacturer. |

These proposed names are evidence-backed product wording, not claims that each phrase is the sole official Canadian term. No OQLF terminology entry was found in the targeted lookup for these four Korean terms. No generic alias is proposed for “Korean chili paste,” “fermented soybean paste,” “seasoned soybean paste,” “Korean pepper flakes/powder,” or translated descriptors; these can refer to broader or product-specific concepts. No `ingredient-forms.v1.json` records are proposed: the observed gochugaru grind differences are product-style/particle-size variants, while the current form records model preparation states.

## Other Section W candidates left unresolved

- **Chunjang:** no validated Korean/French crosswalk or evidence establishing whether the catalog should represent it separately from other black-bean pastes/sauces. Do not alias it to existing black-bean sauce.
- **Ganjang:** unresolved whether it is a Korean-specific soy-sauce identity/style or a language-scoped alias for existing soy sauce. Do not map it to generic, light, dark, or tamari soy sauce without a direct crosswalk and locale review.
- **Named kimchi types:** generic kimchi is already integrated. Keep named types open for type-by-type product-name and French-label evidence; do not add them as generic kimchi aliases.
- **Fermented shrimp and other jeotgal:** no source-backed item-level identity/form mapping or fr-CA display was established here. Keep separate from fish sauce, shrimp paste, and generic kimchi.
- **Gochugaru particle size:** coarse and finer products are evidenced, but no stable catalog style/form policy or recipe-specific requirement was validated. Keep the variants unresolved rather than creating generic forms.

## Direct source evidence

Sources were directly reviewed on **2026-10-08**.

1. FAO/WHO Codex Alimentarius Commission, [Standard for Gochujang CXS 294-2023 (English)](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/pl/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B294-2023%252FCXS_294e.pdf). Defines gochujang as a red or dark-red pasty fermented food; requires the product name “gochujang”; distinguishes it from chili paste/sauce whose main ingredient is red pepper.
2. FAO/WHO Codex Alimentarius Commission, [Norme pour la pâte de soja fermentée au piment fort (Gochujang), CXS 294-2023 (French)](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/en/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B294-2023%252FCXS_294f.pdf). Supplies the proposed fr-CA gochujang wording and same paste/product boundary.
3. Lucky Foods, [Pâte de Gochujang Tub (Canadian French product page)](https://luckyfood.com/fr-ca/products/gochujang-paste-15-8oz). A French-language product listing describes it as a classic Korean chili paste and retains “Gochujang.” Its label reports a serving of 1 tablespoon (15 g) for this specific tub only.
4. Sempio, [Doenjang, Soybean Paste, Classic](https://en.sempio.com/product/yondu/view/630). Producer product name and description identify doenjang as soybean paste made by grinding and fermenting soybeans.
5. Haisue, [Sempio — Pâte de Soja Coréenne Doenjang (Végane) 460 g](https://haisue.ca/fr/products/sempio-doenjang-korean-soybean-paste-vegan-460g). Canadian French retailer wording supports the proposed French phrase and describes the product as fermented Korean soybean paste. This is product-language evidence, not an OQLF recommendation.
6. FAO/WHO Codex Alimentarius Commission, [Regional Standard for Fermented Soybean Paste (Asia) CXS 298R-2009, amended 2026](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/pl/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B298R-2009%252FCXS_298Re.pdf). Provides a broad definition of fermented soybean paste; cited as context only, not as a one-to-one naming rule for doenjang.
7. O’Food USA, [Ssamjang (Mixed Soy Bean Paste)](https://ofoodusa.com/products/ssamjang). Brand product title and description identify ssamjang as a Korean dipping condiment and describe a blend containing fermented bean paste and gochujang.
8. Sempio, [Ssamjang, Seasoned Soybean Paste, Regular Plus](https://en.sempio.com/product/yondu/view/634). Producer product listing distinguishes ssamjang as its own seasoned soybean-paste product and supplies a product ingredient list.
9. SUE FOODS, [O’Food Pâte de ssamjang doux (Canadian French product page)](https://suefoods.com/products/o-food-pate-de-ssamjang-doux-170g). Supports the French market use of “pâte de ssamjang” for this specifically mild product; “doux” is not proposed as a generic alias or attribute.
10. Yami Canada, [ASSI — Pâte de soja assaisonnée Ssamjang](https://www.yami.com/ca/fr/p/assi-soy-bean-paste-for-wrap-tube/1148304741). Canadian French product title directly supports the proposed descriptive wording; it is another brand/product, not a terminology authority.
11. Révolution Fermentation Canada (Québec), [Piment coréen gochugaru](https://shop.revolutionfermentation.ca/products/piment-coreen-gochugaru-500g). French product title and description identify gochugaru as dried red pepper coarsely ground into flakes. Its technical details list China as pepper origin and Tae Kyung (South Korea) as manufacturer, so the display wording must not be read as a country-of-growth guarantee.
12. Gochujar Global, [Jayeonae — 100% Korean Sun-Dried Chili Pepper Flakes](https://global.gochujar.com/products/jayeonae-100-korean-sun-dried-chili-pepper-flakes). English product description explicitly calls the seasoning gochugaru and documents a medium-coarse product. This supports the EN product name and existence of grind variants, not a universal origin/grind standard.

## Measurement, conversion, yield, and substitution state

**No global values proposed.** The sources do not establish exact-form catalog density, unit mappings, package-yield relations, or substitution ratios for these identities. The Lucky Foods gochujang label’s 1 tablespoon (15 g) declaration is for that exact branded tub and is not applied as a generic conversion. The cited Sempio serving declarations are mass-only and do not establish volume conversions. Do not infer values or replacements from category, flavor, heat, fermentation, or recipe role.

## Recipe audit and checks required before any integration

A term search for gochujang, doenjang, ssamjang, chunjang, ganjang, gochugaru, jeotgal, and kimchi returned no matching ingredient lines in the 114 bundled recipe JSON files. Recheck recipes and exact alias collisions immediately before integration because the checkout is actively modified.

Before integration, the coordinator should validate candidate IDs and localized name collisions against the then-current seed and ledger; confirm category enums and alias normalization; decide whether the French wording for doenjang and ssamjang is acceptable for fr-CA; and resolve gochugaru grind-size policy. If accepted, run the repository’s catalog and bundled-seed validation/normalization workflow, confirm generated manifest/package consistency, and run relevant catalog/search and seed-package tests. **No tests or canonical checks were run for this proposal-only packet.**

## Non-integration statement

This file is a research proposal only. No canonical reference/form JSON, recipes, Kotlin/code, tests, checklist, workflow ledger, progress tracker, or other proposal was edited. No checklist item was marked complete.
