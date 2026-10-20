# WP03 Section F R497 — Honey Nut Cheerios family picker review (2026-10-17)

## Review record

- **Scope:** Reopen the R186 hold for the Canadian standard-sugar and Lower Sugar Naturally Flavoured Honey Nut Cheerios products as one two-SKU picker decision.
- **Recommendation:** Add two separate, identity-only `GRAIN_AND_CEREAL` references using the current Canadian manufacturer’s English and French product titles. Keep the standard-sugar product’s source-supported `Original Honey Nut Cheerios` wording as a narrow alias so it has a unique English search route.
- **Status:** Proposal only. This is the only intended file change. No catalog JSON, ledger, plan, roadmap, workflow, recipes, generated Kotlin, or tests were changed.
- **Prior hold and reopen condition:** R186 held the standard-sugar product because adding it alone would make a broad Honey Nut Cheerios search return one of two manufacturer-listed products. R186 explicitly allowed reconsideration when both products could be represented together. Both product pages are still current, distinct, and available in English and French; this proposal meets that condition without claiming a complete Cheerios roster.
- **Live snapshot:** 1,777 ingredient references, 143 ingredient forms, 56 legacy-import candidates, and 2,135 research-ledger records with 9,772 source entries. Counts were read from the current shared files on 2026-10-17.

## Product identity and proposed references

General Mills Canada currently gives the standard product the English title **Naturally Flavoured Honey Nut Cheerios** and the French title **Au miel et aux noix Saveurs naturelles Cheerios**. It separately lists **Lower Sugar Naturally Flavoured Honey Nut Cheerios** and **Cheerios au miel et aux noix Saveurs naturelles moins de sucre**. The lower-sugar page says it has 50% less sugar than the original, and the two pages have separate ingredient declarations. These are two formulated ready-to-eat products, not preparation forms of one ingredient. Do not infer or store a formula, component links, or equivalence from the shared oats and honey.

| Stable ID | English display | Québec French display | English aliases | French aliases |
|---|---|---|---|---|
| `ingredient-ref-naturally-flavoured-honey-nut-cheerios` | `Naturally Flavoured Honey Nut Cheerios` | `Au miel et aux noix Saveurs naturelles Cheerios` | `Original Honey Nut Cheerios` | `Cheerios au miel et aux noix originales` |
| `ingredient-ref-lower-sugar-naturally-flavoured-honey-nut-cheerios` | `Lower Sugar Naturally Flavoured Honey Nut Cheerios` | `Cheerios au miel et aux noix Saveurs naturelles moins de sucre` | None | None |

The two displays are the exact titles on the current Canadian manufacturer product pages. The aliases for the standard-sugar row are exact manufacturer wording from the lower-sugar comparison text: “original Honey Nut Cheerios” and “les céréales Cheerios au miel et aux noix originales.” They offer one unique English and French query for the standard SKU. They are not separate manufacturer page titles. Keep the lower-sugar title’s temporary “New” badge out of its display and aliases.

Both rows should use category `GRAIN_AND_CEREAL`, `defaultDensity: null`, and `unitMappings: []`. Keep them separate from plain Cheerios, Multi-Grain Cheerios, Oat Crunch Cheerios, Strawberry Banana Cheerios, and `ingredient-ref-honey-nut-chex-cereal`. Do not assign the broad `Honey Nut Cheerios` / `au miel et aux noix` family phrase to either row alone.

If accepted, the reference objects would be:

```json
[
  {
    "id": "ingredient-ref-naturally-flavoured-honey-nut-cheerios",
    "nameEn": "Naturally Flavoured Honey Nut Cheerios",
    "nameFr": "Au miel et aux noix Saveurs naturelles Cheerios",
    "aliasesEn": ["Original Honey Nut Cheerios"],
    "aliasesFr": ["Cheerios au miel et aux noix originales"],
    "defaultDensity": null,
    "unitMappings": [],
    "category": "GRAIN_AND_CEREAL"
  },
  {
    "id": "ingredient-ref-lower-sugar-naturally-flavoured-honey-nut-cheerios",
    "nameEn": "Lower Sugar Naturally Flavoured Honey Nut Cheerios",
    "nameFr": "Cheerios au miel et aux noix Saveurs naturelles moins de sucre",
    "aliasesEn": [],
    "aliasesFr": [],
    "defaultDensity": null,
    "unitMappings": [],
    "category": "GRAIN_AND_CEREAL"
  }
]
```

Do not add forms, legacy mappings, recipe links, active measurements, conversions, yields, or substitution rules. The two products have their own labeled nutrition portions, but those are SKU-specific observations. If integration retains them, keep them in each ingredient’s research-ledger record only:

- Standard-sugar SKU: `1 cup (37 g)` on the English manufacturer page and `1 tasse (37 g)` on the French manufacturer page.
- Lower-sugar SKU: `1 tasse (37 g)` on the French manufacturer page. The English page currently also renders `1 tasse (37 g)` in its serving-size line; preserve that literal page wording and do not silently rewrite it as an English package label.

Neither observation is a reusable cereal measure, a density, an active unit mapping, or a conversion. Do not transfer one product’s value to the other. If the ledger retains the observations, use `identityState: verified`, `measurementState: researched_supported`, and `substitutionResearchState: not_yet_researched` on each new record, with no substitution findings. Manufacturer statements that a cereal tastes good in recipes do not establish a tested substitute, ratio, role, or method.

## Current ownership and proposal-archive audit

Exact phrase and ID ownership was checked across all active reference names and aliases, all form labels and match terms, all 56 legacy-import candidates, and the full ledger. Neither proposed ID, either bilingual product title, either proposed unique alias, nor product code `065633132948` has an active reference, form, legacy, or ledger owner. The existing `ingredient-ref-honey-nut-chex-cereal` is a distinct cereal and remains an expected result for the shorter `honey nut` search.

The archive review found:

- **R186** is the focused predecessor. It held the standard-sugar SKU outside active data until both Honey Nut products could be handled in one picker decision. Its candidate standard-sugar ID and four product-page source IDs were not integrated, so reuse them rather than minting replacements.
- **R217** integrated plain `Cheerios / Cheerios`; it mentions the R186 hold but makes no Honey Nut identity or family decision.
- **R198** integrated the three Oat Crunch SKUs as a separate Cheerios family. It does not cover Honey Nut.
- **R488** integrated five Québec-evidenced Chex products. Its Honey Nut Chex row is not the Cheerios product family.
- No later proposal or batch resolves the R186 Honey Nut Cheerios hold.

The English product-list URL is already owned in the live ledger by **`WP03-STRAWBERRY-BANANA-CHEERIOS-R185-20261016-S03`**, attached to the existing Cheerios family records. Reuse this source ID if the list is cited; do not register the URL again. The four exact English/French product-page URLs are represented by **`WP03-HONEY-NUT-CHEERIOS-R186-20261016-S01`** through **`-S04`** in the held R186 proposal, but those IDs and URLs have no live-ledger owner because R186 changed no ledger data. Reuse those exact one-to-one ID/URL assignments. R186’s Metro URL and source `-S05` are secondary corroboration only; the prior review reported HTTP 403 on direct retrieval, so this proposal does not rely on it. No new source ID is needed.

## Current phrase-first picker projection

The static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalize accents and punctuation, return all complete word-phrase matches first, and use substring matching only if no phrase match exists. It covers current reference and attached-form terms; it is not live Android picker QA.

| Query | Current | With R497 | Effect |
|---|---:|---:|---|
| `Honey Nut Cheerios` | 0 | 2 | The family phrase returns both distinct Cheerios products. |
| `au miel et aux noix` | 0 | 2 | The French family phrase returns both products. |
| `Naturally Flavoured Honey Nut Cheerios` | 0 | 2 | This standard product title is fully contained in the lower-sugar manufacturer title, so phrase-first matching returns both. Keep this title overlap visible; do not claim the English standard title is a unique query. |
| `Original Honey Nut Cheerios` | 0 | 1 | The manufacturer’s comparison wording gives a unique route to the standard-sugar SKU. |
| `Au miel et aux noix Saveurs naturelles Cheerios` | 0 | 1 | The exact French standard-sugar title uniquely returns that SKU. |
| `Cheerios au miel et aux noix originales` | 0 | 1 | The manufacturer’s French comparison wording gives a unique route to the standard-sugar SKU. |
| `Lower Sugar Naturally Flavoured Honey Nut Cheerios` | 0 | 1 | The lower-sugar English title uniquely returns its SKU. |
| `Cheerios au miel et aux noix Saveurs naturelles moins de sucre` | 0 | 1 | The lower-sugar French title uniquely returns its SKU. |
| `honey nut` | 1 | 3 | Existing Honey Nut Chex remains alongside the two new Cheerios choices. |
| `Cheerios` | 6 | 8 | Adds both Honey Nut Cheerios products alongside the six represented Cheerios references. This does not make the 17-item manufacturer list exhaustive. |
| `cereal` / `céréales` | 60 / 52 | 60 / 52 | The exact manufacturer titles contain neither generic class term; no broad class aliases are proposed. |

Do not add `Honey Nut Cheerios` or `au miel et aux noix` as aliases to the standard-sugar SKU: that would recreate R186’s one-variant family result. Do not add `cereal` / `céréales` aliases or component names. The approved pair plus the two narrow comparison aliases keep the family query multi-result while providing a unique phrase for each sibling.

## Bundled recipe-corpus scan

The read-only audit parsed all **114 manifest-listed recipe files** and their **1,123 structured ingredient rows**. It checked serialized recipe content and ingredient-row fields for both proposed IDs; both English and French displays; the two proposed aliases; `Honey Nut Cheerios`, `au miel et aux noix`, `Lower Sugar Honey Nut Cheerios`, and the known Québec product code.

- Candidate-specific recipe-file hits: **0 / 114**.
- Candidate-specific ingredient-row hits: **0 / 1,123** for every checked phrase and ID.
- Direct links to either proposed reference ID: **0**.
- Total exact recipe-file bytes: **753,988**.
- Manifest-ordered corpus SHA-256: **`847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`**. The digest hashes each manifest-relative path, a NUL byte, exact file bytes, and a trailing NUL byte in manifest order.

No recipe link, relink, amount, or recipe-text change is supported by the bundled corpus.

## Source register and evidence limits

The sources below were opened online on **2026-10-17**. The manufacturer pages do not show a publication or update date. Package contents and nutrition information can change; General Mills directs consumers to use the package when it conflicts with the website.

| Reused source ID | Source and evidence | Limits |
|---|---|---|
| `WP03-HONEY-NUT-CHEERIOS-R186-20261016-S01` | General Mills / Cheerios Canada, [Naturally Flavoured Honey Nut Cheerios](https://www.cheerios.ca/products/honey-nut-cheerios). Current English title, product description, ingredient declaration, available package sizes, and `1 cup (37 g)` serving. Its related-products section links Lower Sugar Naturally Flavoured Honey Nut Cheerios. | Current Canadian manufacturer evidence for the standard SKU and the sibling connection. Ingredient declarations give no proportions; package sizes are not kitchen measures. |
| `WP03-HONEY-NUT-CHEERIOS-R186-20261016-S02` | General Mills / Cheerios Canada, [Au miel et aux noix Saveurs naturelles Cheerios](https://www.cheerios.ca/fr-CA/products/au-miel-et-aux-noix-cheerios). Current French title, ingredients, and `1 tasse (37 g)` serving. | Direct manufacturer support for the French display and source-specific serving; not an OQLF ruling or reusable measure. |
| `WP03-HONEY-NUT-CHEERIOS-R186-20261016-S03` | General Mills / Cheerios Canada, [Lower Sugar Naturally Flavoured Honey Nut Cheerios](https://www.cheerios.ca/products/lower-sugar-naturally-flavoured-honey-nut-cheerios). Current English product page, separate product and ingredients, 50%-less-sugar comparison to the original, and serving line printed as `1 tasse (37 g)`. | Direct manufacturer support for the lower-sugar SKU and English name. Preserve the page’s literal serving-unit wording; no English `cup` label is claimed from this page. |
| `WP03-HONEY-NUT-CHEERIOS-R186-20261016-S04` | General Mills / Cheerios Canada, [Cheerios au miel et aux noix Saveurs naturelles moins de sucre](https://www.cheerios.ca/fr-CA/products/cheerios-au-miel-et-aux-noix-saveurs-naturelles-moins-de-sucre). Current French title, distinct ingredients, 50%-less-sugar comparison, French comparison phrase `les céréales Cheerios au miel et aux noix originales`, and `1 tasse (37 g)` serving. | Direct manufacturer support for the French display, the narrow standard-SKU alias, and its own labeled serving. It does not support a generic cereal conversion or substitution. |
| Reuse `WP03-STRAWBERRY-BANANA-CHEERIOS-R185-20261016-S03` | General Mills / Cheerios Canada, [Our Products](https://www.cheerios.ca/products). Current Canadian English brand list says there are 17 results and displays 12 items on the opened page. | The current page confirms a broader national lineup exists but is not used to claim the two-item Honey Nut pair is all Cheerios products. It is already registered in the live ledger. |

The page’s “50% less sugar” statement is treated only as evidence that the manufacturer distinguishes two products. It is not a substitution ratio, recipe conversion, or independent nutrition finding. The French names are exact current Canadian manufacturer wording rather than proposed translations. No local retailer phrase is promoted to an alias, and the prior Metro result is not relied on as a primary source.

## Recommendation

Accept both distinct, identity-only references together, reusing the R186 standard-sugar ID and source assignments and adding the lower-sugar ID as shown above. Keep the brand-family phrase `Honey Nut Cheerios` / `au miel et aux noix` multi-result. Use only the manufacturer-supported `Original Honey Nut Cheerios` / `Cheerios au miel et aux noix originales` aliases to give the standard product a unique phrase despite the overlap between its official English title and the lower-sugar title. Keep both SKU observations in the ledger only; do not create active measures, forms, density, unit mappings, recipe links, conversions, yields, or substitutions. Section F and broader Cheerios family coverage remain open.

No tests, builds, emulator checks, or deployment were run, as instructed. This is a proposal-only documentation addition.
