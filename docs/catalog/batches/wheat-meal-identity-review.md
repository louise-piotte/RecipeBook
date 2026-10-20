# WP02 Section A7 Wheat Meal Candidate Review

## Review record

- **Owner:** integration owner (WP10)
- **Research packet:** WP02 baking catalog; identity boundary and bilingual naming
- **Research date:** 2026-10-06
- **Reviewers:** independent Québec French reviewer — pending
- **Status:** unresolved candidate; no active catalog reference
- **Research-ledger candidate:** `ingredient-ref-wheat-meal`

## Evidence and disposition

Canadian food standards list `wheat meal` separately from whole-wheat flour, graham flour, gluten
flour, and wheat starch among possible bread ingredients, but do not define its product composition
[WP02-S118]. Statistics Canada's current product classification places `wheat meal (except durum
semolina)` among grain products for human consumption and explicitly excludes wheat meal from its
wheat-flour class [WP02-S119–S120]. This supports treating wheat meal as a candidate distinct from
ordinary wheat flour and the existing durum-semolina identities.

The current Canadian customs tariff classifies wheat meal with cereal groats under heading 11.03 and
defines the group by cereal-grain fragmentation and particle-size criteria [WP02-S121]. Its French
version uses the collective label `gruaux et semoules de froment (blé)` for wheat groats and meal,
without isolating a consumer-facing French equivalent for wheat meal alone [WP02-S122]. The generic phrase `semoule de blé` also overlaps the existing catalog names `semoule de blé dur`
and `semoule de blé dur remoulue`; it is not safe as a broad alias.

Keep this candidate unresolved. No category, display name, alias, density, unit mapping, form,
conversion, yield, or substitution is activated. Revisit when a source describes a specific
human-food wheat-meal product and its milling boundary, and an independently supportable Québec
French name is available.

## Catalog and recipe audit

The active catalog and all 114 bundled recipe JSON files have no exact occurrence of `wheat meal`,
`wheat groats`, `wheat grits`, `gruau de blé`, or `gruaux de blé`. A substring search for `semoule de
blé` matches the two existing durum-semolina display names, which is why that broad wording was not
added as an alias. No recipe lines were changed.

## Sources

- [WP02-S118 — CFIA, Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0): Volume 12, section 12.2.1(h) lists wheat meal separately but supplies no composition definition for it.
- [WP02-S119 — Statistics Canada, NAPCS 2022, 1821294](https://www23.statcan.gc.ca/imdb/p3VD.pl?CLV=4&CPV=1821294&CST=17022022&CVD=1386659&Function=getVD&MLV=4&TVD=1384502): wheat meal (except durum semolina) is an illustrative human-consumption grain product.
- [WP02-S120 — Statistics Canada, NAPCS 2022, 18212](https://www23.statcan.gc.ca/imdb/p3VD.pl?CLV=2&CPV=18212&CST=17022022&CVD=1384663&D=1&Function=getVD&MLV=4&TVD=1384502): wheat meal is excluded from the wheat-flour product class.
- [WP02-S121 — CBSA, Customs Tariff T2026-2, Chapter 11 (English)](https://www.cbsa.gc.ca/trade-commerce/tariff-tarif/2026/html/02/ch11-eng.html): heading 11.03 groups wheat groats and meal and gives a particle-size definition for the class.
- [WP02-S122 — ASFC, Tarif des douanes T2026-2, chapitre 11 (français)](https://www.cbsa.gc.ca/trade-commerce/tariff-tarif/2026/html/02/ch11-fra.html): uses the collective wording `gruaux et semoules de froment (blé)` for wheat groats and meal.

## Next action

Find a specific human-food wheat-meal product and source its milling/process distinction and Québec
French name. Then determine whether the ingredient belongs under `GRAIN_AND_CEREAL` or
`FLOUR_AND_STARCH`; retain the candidate status until that review is complete.
