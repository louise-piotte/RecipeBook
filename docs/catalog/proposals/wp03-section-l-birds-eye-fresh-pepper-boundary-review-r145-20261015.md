# WP03 Section L R145 — bird’s-eye fresh-pepper boundary review — 2026-10-15

- **Disposition:** Hold; no catalog delta.
- **Candidate:** The open Section L item `bird’s-eye` in the fresh-chile checklist.
- **Reason:** Canadian fresh-produce sources use `bird’s-eye` as another name for Thai chillies or combine both terms in one product title. Technical and Canadian spice sources also apply bird’s-eye wording to other products, including African Bird Chile / peri-peri and dried whole or ground chiles. Québec French evidence supports `piment oiseau` as a term and recipe wording, but this pass did not find a standalone Québec fresh-produce listing that separates it from Thai-labelled peppers or other bird’s-eye products.
- **Scope:** Do not add a reference, alias, form, measure, mapping, substitution, or recipe link. Do not use `Thai pepper`, `Thai chili`, `piment thaï`, `piment de Thaïlande`, `piri-piri`, or `peri-peri` as aliases for a bird’s-eye row. Revisit when a distinct fresh-market identity and its French product wording can be bounded from those overlapping uses.
- **Testing:** None. This is proposal-only; no shared data changed.

## Checklist, ownership, and archive audit

The [active WP03 Section L checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4503) lists `bird’s-eye` and `Thai` as separate unresolved candidates. R145 reviews the bird’s-eye term only; it does not resolve the Thai entry.

The read-only catalog snapshot has **1,501 ingredient references and 118 forms**. Neither the live [reference catalog](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) nor the [form catalog](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) contains a bird’s-eye or `piment oiseau` row, alias, or form. The [legacy identity archive](../legacy-import-identities.v1.json) has no such candidate. No focused bird’s-eye proposal or active ledger identity was found. The R140 Shishito review mentions bird’s-eye only in a RICARDO note about replacing fresh Cayenne in that recipe’s separate mayonnaise; it explicitly does not generalize that note to Shishito. R138 includes bird’s-eye only in a broad zero-hit recipe scan. Neither prior review owns this identity.

The bundled [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) lists **114 recipes** and **1,123 ingredient rows**. A static scan of every manifest-listed recipe file and ingredient row found no matches for `bird’s eye`, `birdseye`, `bird’s-eye chile/chili/pepper`, `piment oiseau`, Thai-pepper variants, or piri/peri-piri variants. The bundled corpus therefore has no bird’s-eye demand, recipe link, or line-level substitution to attach.

## Names and product boundary

The OQLF-hosted [GDT entry `piment oiseau`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10423440/piment-oiseau) gives the English translation `bird’s eye chile`, but its author field identifies **Les Éditions Québec Amérique inc., 2003**. It is useful Québec French terminology evidence, not a current retailer specification or a claim that OQLF itself authored the entry. Québec RICARDO recipes also use `piment oiseau` in ingredient lines; one labels the ingredient `piment rouge (piment oiseau) frais`. That local recipe wording supports recognition of the French term and fresh use, but does not identify a particular fresh-market product or distinguish Thai-labelled fruit from African/Piri-Piri uses. [S10, S11]

Current Canadian product evidence confirms that bird’s-eye wording appears in fresh-pepper sales, while also showing why this evidence does not establish a separate row:

- Iqbal Foods lists **`Chilli Thai / Ontario - Hot (Per 1/2 Lb)`** under fruits and vegetables and describes Thai chili as also known as bird’s-eye chili. The page’s quantity selector is in half-pound increments. It supports a Canadian fresh-produce naming equivalence, not a distinct bird’s-eye product apart from Thai chili. Its live page could not be opened in this pass; the current search-indexed product result supplied the title, description, and selector details. [S04]
- Swadesh lists **`Chillies (Thai) Per lb`** under fruits and vegetables and says Thai chillies are also known as bird’s-eye chillies. The page opened directly. Like Iqbal, it ties the phrase to the Thai product; it does not list a second bird’s-eye item. [S05]
- AgriTech North in Dryden, Ontario, indexes **`Hot Pepper - Thai Chili Bird’s Eye - Fresh Harvest Fruiting Crop`** and describes its Thai chili bird’s-eye peppers as fresh, harvested-to-order produce. The current page says the product is sold out; its 7 g, 14 g, 28 g, and 112 g options are package choices. The direct page returned a cache miss, so evidence is limited to the current indexed listing. Its title combines Thai and bird’s-eye rather than separating them. [S06]
- Walmart Canada currently lists **Thai green chili peppers** in fresh vegetables / peppers, with a 60 g package. This corroborates a fresh Thai market label without using bird’s-eye wording and helps preserve `Thai pepper` as a separate pending picker query. The 60 g is listing/package-specific. [S07]

Other current Canadian product wording broadens the collision. The Calgary-based Silk Road Spice Merchant sells `Bird’s Eye Chiles` in whole and ground spice formats and describes them as Southeast Asian/Indian chiles similar to, and the same species as, African Bird Chile / Peri Peri. The source’s taxonomy and similarity claims are retailer copy, not a general identity standard; its product listing is for dried spice formats, not fresh produce. [S08] A current French Nando’s Peri-Peri sauce listing uses `piment oiseau africain` in a compound product, not as a fresh ingredient sale. [S12] Provigo’s current French listing **`Dion Piments piment oiseau — 20 g`** supplies another local French retail phrase, but it appears in the pantry/spices context; the state is not identified well enough to count as a fresh-pepper product. The direct product page returned a cache miss. [S09]

The University of Florida IFAS extension guide says **Thai pepper is also called bird’s-eye chili or bird’s chili** and reports that it is often confused with some *Capsicum frutescens* cultivars because of appearance. This is technical naming context, not a Canadian product standard. It supports the picker boundary: adding `Thai pepper` or `Thai chili` as aliases would treat a documented overlapping market term as a separate one-to-one search key, while the material reviewed does not establish which bird’s-eye use a bare query intends. No species or cultivar is assigned here. [S02]

The CFIA report on whole fresh hot peppers sold at Canadian retail sampled 854 products from 2022–2025. Its product-type table lists **163 `Piment de Thaïlande` samples**, and does not list a bird’s-eye type. This is bounded surveillance classification evidence, not proof that no bird’s-eye-labeled fresh products are sold in Canada. It reinforces that Thai is a well-documented fresh retail type and does not resolve bird’s-eye as a distinct type. [S03]

### Constrained add option considered

A narrow market-name row is technically possible without Thai aliases: canonical English `bird’s-eye chile`, canonical French `piment oiseau`, one English spelling alias `bird’s eye chili`, and a single `fresh` form. That option would leave species, cultivar, growing origin, color, and heat unspecified. It would let a user search the exact GDT/local French term and the English phrase on the Canadian fresh listings, while `Thai pepper`, `Thai chili`, and `piment thaï` remain outside the row.

| Field | Constrained add option (not adopted) |
|---|---|
| Reference names | `bird’s-eye chile` / `piment oiseau` |
| Aliases | EN: `bird’s eye chili`; FR: none |
| Form | One `fresh` form: `fresh bird’s-eye chile` / `piment oiseau frais` |
| Numeric or conversion data | None |
| Substitution and recipe links | None |
| Identity claims | No species, cultivar, origin, color, or fixed heat |

I do **not** recommend that row in this proposal. The fresh-market evidence that contains `bird’s-eye` also identifies the item as Thai (or explicitly says the names are equivalent); the GDT entry is from 2003 rather than a current product standard; and the Québec retail item is a pantry/spice package whose preparation state is unclear. The narrow row could be a useful market-name search target, but the current evidence does not show where it stops relative to the separate Thai candidate or other products sold as bird’s-eye. Keep the explicit hold until one fresh-food source names bird’s-eye independently or otherwise establishes the intended boundary.

## Picker projection and alias boundary

Counts below use a static projection of `IngredientReferenceSearchIndex`’s normalization and phrase-first, word-boundary matching over the current 1,501 references and 118 forms. The hold projection is unchanged because this proposal adds no row. The constrained-add column illustrates the no-Thai-alias option described above; it is not the proposal.

| Query | Current | Hold projection | Constrained add | Decision |
|---|---:|---:|---:|---|
| `piment oiseau` | 0 | 0 | 1 | Exact Québec term; the market identity remains unbounded. |
| `bird’s eye` / `bird's eye` | 0 | 0 | 1 | Exact English phrase; current Canadian fresh listings use it with Thai. |
| `bird’s eye chile` | 0 | 0 | 1 | GDT English equivalent. |
| `bird’s eye chili` | 0 | 0 | 1 | English alias variant seen in Canadian fresh-product wording. |
| `Thai pepper` | 0 | 0 | 0 | Keep separate and unresolved; no Thai alias. |
| `Thai chili` | 1 | 1 | 1 | Current result is the existing prepared `nam prik pao` reference; no Thai alias is needed. |
| `piment thaï` | 0 | 0 | 0 | Keep separate and unresolved; no Thai alias. |
| `piment` | 24 | 24 | 25 | Broad French query gains a new row under the constrained option. |
| `pepper` | 29 | 29 | 29 | No change because the constrained canonical name and alias do not include `pepper`. |
| `chile` | 1 | 1 | 2 | Broad English query gains a result through the canonical name. |
| `chili` | 9 | 9 | 10 | Broad English query gains a result through the spelling alias. |

Do not add `Thai pepper`, `Thai chili`, `piment thaï`, or `piment de Thaïlande` as aliases: Canadian product and technical sources explicitly associate these names, while Section L keeps Thai as a separate candidate. Do not add `African Bird’s Eye`, `Piri-Piri`, `piri-piri`, or `peri-peri`: the reviewed Canadian spice and sauce evidence concerns other regional/product contexts, and the terms do not establish synonyms for one generic fresh row. Keep plural/generic `piments`, `peppers`, and `chiles` out as well.

If later evidence supports the identity, rerun this projection before integration. In particular, any Thai alias would change `Thai chili` from one current result (the prepared paste) to two results, and a future Thai-pepper row could then duplicate a bird’s-eye result.

## Forms, numeric evidence, and substitutions

No form is proposed. The fresh Canadian listings use `Thai` and `bird’s-eye` together, so they do not establish a distinct bird’s-eye fresh form. The Canadian Silk Road product has whole and ground **dried spice** variants; that does not justify adding dried forms to an unallocated fresh identity. The Provigo 20 g spice package has no explicit preparation-state detail.

No reusable measure is supported. Iqbal’s half-pound selector, Swadesh’s per-pound title, AgriTech’s package-size options, Walmart’s 60 g Thai package, and Provigo’s 20 g pantry package are retailer-specific purchase quantities, not pepper counts or per-fruit masses. RICARDO recipe lines such as `1 piment oiseau` or `1/2 petit piment oiseau` are dish-scoped recipe quantities, not general count mappings, densities, or unit conversions.

No substitution is proposed. RICARDO’s coriander-cashew pesto page allows **2.5 ml crushed chile flakes** in place of **1/2 small piment oiseau** in that pesto recipe. Its piperade recipe says that, if fresh pepper is unavailable, a little dried Cayenne or another chile may be used. Both notes are recipe-specific, and neither establishes a ratio or an identity mapping for other dishes. The R140 Cayenne-to-bird’s-eye/Sriracha note concerns the separate mayonnaise in one Shishito recipe; it is not a bundled recipe need or a global rule. [S10, S11]

## Exact proposed JSON delta

**None.** Keep the reference catalog, form catalog, research ledger, legacy archive, plan, roadmap, and generated index unchanged. Add no identifier, alias, form, measurement, substitution, recipe link, or ledger finding in this proposal.

Reconsider when a current Canadian fresh-food listing—preferably bilingual or Québec-local—uses bird’s-eye as a standalone product name and provides enough context to distinguish it from Thai-labelled peppers and African/Piri-Piri products. Pair that with stronger evidence that the exact French term labels the same fresh product, then repeat the picker and bundled-row audits.

## Source register

Sources checked on **2026-10-15**. Retail price, package quantity, product availability, heat, origin, and grower descriptions remain source-scoped.

| Source ID | Source and retrieval | Evidence and limits |
|---|---|---|
| `WP03-L-BIRDS-EYE-20261015-R145-S01` | OQLF, [GDT — `piment oiseau`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10423440/piment-oiseau), directly opened. | Gives the French term `piment oiseau` and English `bird’s eye chile`; the author field credits Les Éditions Québec Amérique inc., 2003. Terminology evidence, not a fresh retail product definition and not authored by OQLF. |
| `WP03-L-BIRDS-EYE-20261015-R145-S02` | University of Florida IFAS Extension, [Pepper Production in Miami-Dade County](https://ask.ifas.ufl.edu/publication/tr010), directly opened, section “Thai Pepper.” | Says Thai pepper is also called bird’s-eye chili / bird’s chili and is often confused with some *C. frutescens* cultivars. Technical naming context; no Canadian market scope. Species claims are not generalized by this proposal. |
| `WP03-L-BIRDS-EYE-20261015-R145-S03` | CFIA, [Bactéries pathogènes et organismes indicateurs dans des piments forts entiers à l’état frais](https://publications.gc.ca/collections/collection_2026/acia-cfia/A104-701-2026-fra.pdf), 2026 final report, directly opened. | Covers 854 whole fresh hot-pepper samples sold at Canadian retail from 2022-04-01 to 2025-03-31. Table 5 lists `Piment de Thaïlande` (163 samples) but no bird’s-eye product type. A bounded sampling classification, not a complete market census and not evidence of absence. |
| `WP03-L-BIRDS-EYE-20261015-R145-S04` | Iqbal Foods, [Chilli Thai / Ontario — Hot (per 1/2 lb)](https://iqbalfoods.ca/product/chilli-thai-ontario-hot-per-1-2-lb-91726), current indexed listing; direct open returned an internal error. | Search-indexed content places the item under fruits and vegetables, uses the Thai/Ontario-hot title, describes Thai chili as also known as bird’s-eye chili, and presents half-pound quantity increments. Supports a Canadian fresh-produce naming equivalence, not a separate bird’s-eye product or reusable pepper measure. |
| `WP03-L-BIRDS-EYE-20261015-R145-S05` | Swadesh Supermarket, [Chillies (Thai) Per lb](https://www.swadesh.ca/products/chillies-thai-per-lb), directly opened. | Product is under fruits and vegetables; the description says Thai chillies are also known as bird’s-eye chillies. The per-pound title is a purchase basis, not a per-pepper weight. It lists the Thai item rather than a second bird’s-eye product. |
| `WP03-L-BIRDS-EYE-20261015-R145-S06` | AgriTech North, [Hot Pepper — Thai Chili Bird’s Eye — Fresh Harvest Fruiting Crop](https://agritech-north.ca/products/hot-pepper-thai-chili-birds-eye-fresh-harvest-fruiting-crop), current indexed listing; direct open returned a cache miss. | Canadian seller’s title combines Thai, chili, and bird’s-eye; indexed copy says fresh, harvested-to-order crop and lists 7 g–112 g package options. Page showed sold out. Product-specific listing and package amounts; not a separate Thai-free bird’s-eye label or a reusable measure. |
| `WP03-L-BIRDS-EYE-20261015-R145-S07` | Walmart Canada, [Thai green chili peppers, Your Fresh Market, 60 g](https://www.walmart.ca/en/ip/Thai-green-chili-peppers-Your-Fresh-Market-60-g/6000207538035), directly opened. | Page places the product under fresh vegetables / peppers, calls it fresh hot peppers, and lists Thai chili peppers as the ingredient. The 60 g value is the package size. It does not label the product bird’s-eye. |
| `WP03-L-BIRDS-EYE-20261015-R145-S08` | The Silk Road Spice Merchant, [Bird’s Eye Chiles](https://silkroadspices.ca/products/birds-eye-chiles), directly opened. | Canadian spice retailer offers whole and ground forms at 25–65 g package sizes and says its bird’s-eye chile is similar to and the same species as African Bird Chile / Peri Peri. Source-specific dried spice context and retailer taxonomy; not fresh produce evidence or a general identity rule. |
| `WP03-L-BIRDS-EYE-20261015-R145-S09` | Provigo, [Dion Piments piment oiseau, 20 g](https://www.provigo.ca/fr/piments-piment-oiseau/p/20631002_EA?source=nspt), current indexed French listing; direct open returned a cache miss. | Product number `20631002_EA` and French listing wording are visible in the indexed page; the item is in pantry/spices context. The 20 g is package-specific, and the indexed product detail does not establish a fresh form or explicit preparation state. |
| `WP03-L-BIRDS-EYE-20261015-R145-S10` | RICARDO, [Pesto à la coriandre et aux noix de cajou](https://www.ricardocuisine.com/recettes/10903-pesto-a-la-coriandre-et-aux-noix-de-cajou), directly opened. | Québec French recipe uses `1/2 petit piment oiseau`; its note allows 2.5 ml crushed chile flakes instead in this pesto. This is outside the bundled corpus and is not a generic measurement or substitution rule. |
| `WP03-L-BIRDS-EYE-20261015-R145-S11` | RICARDO, [Piperade](https://www.ricardocuisine.com/recettes/3414-piperade), directly opened. | Ingredient line says `1/2 piment rouge (piment oiseau) frais, haché finement`; the note allows a little dried Cayenne or another pepper if fresh is unavailable. Supports local French fresh-use wording and one dish-scoped fallback, not a standalone fresh retailer identity, generic count measure, or general substitution. |
| `WP03-L-BIRDS-EYE-20261015-R145-S12` | Walmart Canada, [Nando’s Piquante Péri-Péri Sauce](https://www.walmart.ca/fr/ip/Nando-s-Piquante-P-ri-P-ri-Sauce-Piquante/6000201084889?classType=VARIANT), current indexed French page; direct open returned a cache miss. | Product description identifies African Bird’s Eye as an ingredient in a finished peri-peri sauce. It supports the compound-product wording only; it is not a standalone fresh-pepper listing or an alias proposal. |
