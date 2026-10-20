# WP03 Section F — Gorilla Munch cereal identity review (R265, 2026-10-16)

## Review record

- **Status:** Integrated as an identity-only reference; see the [R265 integration record](../batches/wp03-section-f-gorilla-munch-cereal-integration-r265-20261016/README.md).
- **Scope:** One current Canadian EnviroKidz ready-to-eat cereal product marketed as Gorilla Munch. This review does not allocate plain puffed corn, a generic corn-puffs identity, or other EnviroKidz cereal products.
- **Checklist context:** The active Section F review remains open for grain and cereal identities and Québec terminology. R262 added the separate Post Cranberry Almond Crunch cereal; R264 added Post OREO PUFFS. Neither decision covers Gorilla Munch.
- **Archive context:** The 2026-10-11 plain puffed-corn review expressly excluded branded/formulated cereals and cited Metro's Gorilla Munch listing only to distinguish its corn-meal formula from a plain puffed-corn product. That record did not allocate a Gorilla Munch identity. This proposal audits that separate finished cereal.
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference for `EnviroKidz Organic Gorilla Munch cereal / Céréales Gorilla Munch (EnviroKidz)`.
- **Proposed ID:** `ingredient-ref-gorilla-munch-cereal` (unallocated).
- **Catalog snapshot:** 1,653 active references, 125 forms, 2,001 research-ledger records, and 114 manifest-listed recipes with 1,123 structured ingredient rows. These counts describe the shared worktree when checked and may change during parallel integration.

## Identity and Québec wording

Nature's Path's Canadian English page names **EnviroKidz Organic Gorilla Munch Cereal**, describes a whole-grain corn-puffs cereal, and identifies the product as ready-to-eat cereal [S01]. Its Canadian French page identifies Gorilla Munch as cereal but leaves the product title substantially in English [S02]. Metro Québec currently lists the 650 g item as **Céréales de maïs soufflé biologiques Format familial, Gorilla Munch** [S03]. The two manufacturer package options are 6 × 650 g and 12 × 284 g; Metro's Québec listing corroborates the 650 g package [S01, S03]. These are product/package facts only.

Metro's current ingredient statement lists whole-grain corn meal, corn meal, cane sugar, and sea salt. The manufacturer describes the item as a corn-puffs cereal and says it is made from four ingredients; its page details whole-grain corn meal, cane sugar, and sea salt in the organic-ingredients section [S01, S03]. Treat it as the named formulated cereal sold, not as a single-ingredient puffed-corn grain. Do not map it to cornmeal, plain puffed corn, popcorn, or any one of its components. The page and label content may change and are not treated as a universal formula.

Proposed displays preserve the source product name and use a short, brand-anchored French cereal label:

| Field | Proposed value | Boundary |
|---|---|---|
| ID | `ingredient-ref-gorilla-munch-cereal` | Proposed only; no current owner found. |
| English display | `EnviroKidz Organic Gorilla Munch cereal` | Uses the current Canadian manufacturer product name; case can follow catalog style at integration. |
| fr-CA display | `Céréales Gorilla Munch (EnviroKidz)` | Short product-class label based on Metro's Québec cereal listing and the unchanged brand/product name. Provisional pending independent Québec review; not an OQLF-approved term. |
| Category | `GRAIN_AND_CEREAL` | Named, formulated, ready-to-eat cereal as sold. |
| Aliases | None | Keep ingredient-list terms, `corn puffs`, `céréales de maïs soufflé`, `maïs soufflé`, `maïs éclaté`, and generic brand-family wording inactive. |
| Forms | None | The reference names the finished packaged cereal, not a preparation state. |
| Default density / unit mappings | `null` / `[]` | Package masses do not establish volume or density. |
| Recipe links / conversions / yields / substitutions | None | No bundled recipe demand or transferable product behavior was found. |

The retailer's descriptive French title contains *maïs soufflé*, but OQLF assigns *maïs soufflé* and *maïs éclaté* to popcorn [S04]. Do not copy that phrase into the proposed display or aliases: it would make a query for *maïs soufflé* return both popcorn and the branded cereal. The brand-anchored French display keeps the active popcorn term with `ingredient-ref-popcorn`. It also keeps the prior plain puffed-corn candidate unresolved; the Gorilla Munch formula is not evidence for that separate single-grain product.

Keep this one cereal separate from `ingredient-ref-corn-meal`, `ingredient-ref-corn-flakes`, `ingredient-ref-corn-pops-cereal`, `ingredient-ref-rice-cereal`, and all plain puffed-grain identities. Do not extend the proposal to EnviroKidz Choco Chimps, Koala Crisp, Panda Puffs, or any other item in the manufacturer directory.

## Ownership and archive audit

The exact normalized-key audit covered active ingredient-reference IDs, English/French display names and aliases; all form IDs, labels, and match terms; the 61 legacy-candidate IDs/names/aliases; and ledger record IDs and decision text. It found no active or legacy owner for `Gorilla Munch`, `Gorilla Munch cereal`, `Céréales Gorilla Munch`, or `ingredient-ref-gorilla-munch-cereal`, and no product form or recipe link. The only existing repository occurrences of the product name are the contextual mention in the plain puffed-corn proposal and its source entry on the still-held `candidate-puffed-corn` ledger record. No Gorilla Munch catalog decision was found in the proposal/batch archive or active Section F record.

| Existing neighbor | Current ownership | Boundary |
|---|---|---|
| `ingredient-ref-popcorn` | `popcorn / maïs soufflé`, including the OQLF-supported French term | Do not add *maïs soufflé* or *maïs éclaté* to Gorilla Munch. |
| `ingredient-ref-corn-meal` | Generic cornmeal / *semoule de maïs* milling product | The cereal's corn-meal ingredients do not make the finished product a cornmeal alias. |
| `ingredient-ref-corn-flakes`, `ingredient-ref-corn-pops-cereal` | Other processed/ready-to-eat corn cereals | Separate product identities and formulations. |
| `candidate-puffed-corn` | Held plain puffed-corn product candidate in the research ledger | Gorilla Munch's multi-ingredient corn-meal formula neither resolves its French name nor defines that candidate. |
| `ingredient-ref-puffed-rice`, `ingredient-ref-puffed-sorghum`, and other puffed-grain rows | Plain grain products | Do not add `puffs`, `puffed corn`, or any cross-grain alias. |

The Metro URL below was already used in the earlier plain puffed-corn review to document an adjacent product boundary. It is rechecked here for Gorilla Munch identity. Source IDs and URLs in this R265 register are proposal-local; this proposal does not change the shared ledger.

## Picker projection

The static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): case, accents, and punctuation are normalized; complete word phrases are preferred across the result set; substring matching is used only if no complete phrase matches. The projection includes current form search terms and is not live Android picker QA.

| Query | Current results | With proposed row | Interpretation |
|---|---:|---:|---|
| `EnviroKidz Organic Gorilla Munch Cereal` | 0 | 1 | Exact current manufacturer English product name. |
| `Gorilla Munch cereal` / `Gorilla Munch` | 0 / 0 | 1 / 1 | Product-name queries. |
| `Céréales Gorilla Munch` | 0 | 1 | Brand-anchored French display. |
| `EnviroKidz` | 0 | 1 | The full English name contains the product-line name; no broad `EnviroKidz` alias is added. |
| `cereal` / `céréales` | 45 / 41 | 46 / 42 | Broad cereal-category counts each rise by one. |
| `organic` | 1 | 2 | Adds Gorilla Munch alongside the current BioWig cereal result; this is a broad attribute query. |
| `puffs` / `puffed` | 6 / 14 | 6 / 14 | No change because those terms are not added. |
| `corn puffs` / `puffed corn` | 0 / 0 | 0 / 0 | No generic puffed-corn alias is activated. |
| `céréales de maïs soufflé` | 0 | 0 | Retailer descriptor stays out of searchable terms. |
| `maïs soufflé` | 1 | 1 | Remains assigned only to `ingredient-ref-popcorn`. |

## Bundled recipe-corpus demand

All 114 manifest-listed recipe files and 1,123 structured ingredient rows were scanned for the proposed ID and normalized forms of `Gorilla Munch`, `EnviroKidz`, `Gorilla Munch cereal`, and `Céréales Gorilla Munch`. The scan found zero recipe-file or ingredient-row matches. No recipe link, relink, authored-text change, amount assignment, or substitution is proposed. The manufacturer's separate Gorilla Munch recipes are outside the bundled library and do not justify a bundled recipe link.

## Measurements, forms, and substitutions

- **Package observations:** The manufacturer page currently offers 650 g and 284 g package options; Metro Québec lists the 650 g item. If package facts are later retained, keep them SKU-specific. They are not recipe measures.
- **Forms:** None. The identity is the finished ready-to-eat cereal as sold.
- **Density and unit mappings:** Leave unknown. No transferable household volume/mass relationship was accepted.
- **Cooking yield or conversions:** None. No source establishes a raw-grain-to-cereal yield or a useful mass-volume conversion.
- **Substitutions:** None. Similar use as cereal, snack, or recipe mix-in does not establish an interchangeable product or ratio.

## Unresolved follow-up

Independent Québec French review should confirm whether the concise display `Céréales Gorilla Munch (EnviroKidz)` is the preferred brand-anchored label. Metro's longer current product title is locally attested but includes *maïs soufflé*, which conflicts with the existing OQLF/popcorn mapping if copied into the ingredient picker. Revisit that wording only if a reviewer supports an alternative that preserves the picker boundary. Recheck current product naming and composition before any future numeric or recipe-specific integration because the manufacturer notes that product information may change.

## Source register

Sources were checked online on **2026-10-16**. These IDs were proposal-local; integration allocated S01–S02 and reused the existing ledger IDs for Metro Québec and OQLF.

| ID | Source | Supports / limits |
|---|---|---|
| `WP03-GORILLA-MUNCH-R265-20261016-S01` | Nature's Path, [EnviroKidz Organic Gorilla Munch Cereal](https://naturespath.com/en-ca/products/gorilla-munch-cold-cereal-ek-ca). | Current Canadian manufacturer page names the cereal, describes the corn-puffs cereal product, shows 650 g and 284 g package options, and says it is made from four ingredients. Its detail section identifies organic whole-grain corn meal, cane sugar, and sea salt; this does not replace the complete retailer label or establish a universal puffed-corn specification or recipe measure. |
| `WP03-GORILLA-MUNCH-R265-20261016-S02` | Nature's Path, [Gorilla Munch Cereal, Canadian French site](https://naturespath.com/fr-ca/products/gorilla-munch-cereal-650-g-de-terre-amicale-sac). | Current Canadian French product page confirms the cereal/product identity, French cereal-class description, package options, and organic-ingredient wording. Its translated page title is not used as the proposed fr-CA catalog display. |
| `WP03-GORILLA-MUNCH-R265-20261016-S03` | Metro Québec, [Gorilla Munch Céréales de maïs soufflé biologiques, 650 g](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/cereales-pour-la-famille/cereales-de-mais-souffle-biologiques-format-familial/p/058449870081). | Current Québec retailer product listing supplies the 650 g SKU, French cereal title, brand, and ingredient statement: whole-grain corn meal, corn meal, cane sugar, and sea salt. Its descriptive title does not make *maïs soufflé* a global synonym for this formulated product. |
| `WP03-GORILLA-MUNCH-R265-20261016-S04` | Office québécois de la langue française, [maïs soufflé (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358440/mais-souffle). | Defines *maïs soufflé* as popcorn and lists *maïs soufflé* and *maïs éclaté* as preferred Québec terms. Supports preserving that current catalog ownership; it does not name Gorilla Munch. |

## Disposition

**Integrated one identity-only `GRAIN_AND_CEREAL` reference for `EnviroKidz Organic Gorilla Munch cereal / Céréales Gorilla Munch (EnviroKidz)`.** Keep aliases, forms, density, unit mappings, recipe links, conversions, yields, and substitutions empty. The 650 g and 284 g package values are retained only as product-specific observations. The wider Section F review and independent Québec display review remain open. Static package, generated-index, ledger, ownership, picker, recipe-corpus, encoding, link, and whitespace checks passed. No software tests or emulator checks were run because this change only adds database JSON data and documentation under `AGENTS.md`.
