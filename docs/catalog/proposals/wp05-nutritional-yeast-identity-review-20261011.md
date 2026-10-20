# WP05 Section T — Nutritional yeast identity review

- **Packet type:** proposal-only identity, bilingual naming, and collision/demand review.
- **Prepared and source-access date:** 2026-10-11.
- **Plan:** Section T, “Individual spices, dried aromatics, salts and seasoning blends”; checklist item “MSG, nutritional yeast, yeast extract, bouillon powder, seasoning salt, and mushroom seasoning.”
- **Scope:** nutritional yeast only. Brewer’s yeast is reviewed as a boundary; baker’s yeast, yeast extracts, yeast-extract spreads, and other seasonings are not proposed for change.
- **Status:** Coordinator integrated one identity-only reference with the proposed bilingual display and sourced aliases. No recipe link, form, measurement, or numeric behavior was added.
- **Source IDs:** `WP05-T-NUTRITIONAL-YEAST-20261011-S01` through `WP05-T-NUTRITIONAL-YEAST-20261011-S08`. The prefix was checked against the live research ledger and existing proposal/batch files before assignment; no collision was found.

## Coordinator recommendation

Add one identity-only reference for the inactive food product:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-nutritional-yeast` |
| English name | `nutritional yeast` |
| French name | `levure alimentaire` |
| English alias | `nooch` (colloquial; OQLF marks it as common-language usage) |
| French alias | `levure nutritionnelle` (OQLF and TERMIUM list this alongside `levure alimentaire`) |
| Category candidate | `BAKING_AND_SPICE`, as a seasoning in Section T. This is a catalog taxonomy choice, not a source-defined fact. |
| Density and unit mappings | Leave unset / empty. |

Keep `nutritional yeast flakes` and powder descriptions as presentations of this product, not separate identities. Do not add yeast-extract, brewer’s-yeast, baker’s-yeast, brand, or generic `yeast` / `levure` aliases. The existing broad one-word yeast terms already lead into the baker’s-yeast catalog family, while complete nutritional-yeast terms remain distinct. The bilingual term pair and accepted synonym are established by Québec and federal terminology sources; current Canadian grocery listings corroborate both languages [S01–S04].

Do not add a form, density, unit mapping, package yield, conversion, or substitution. The available format evidence covers flakes and powder, but no recipe requires choosing between them and neither presentation supplies a generally safe mass-volume rule. Do not encode nutrient or fortification claims: those are product-specific.

## Catalog, legacy, ledger, proposal, and recipe audit

The audit used the app’s ingredient search normalization (lowercase/NFKD, accent folding, punctuation-to-space, and whitespace collapse) and searched complete normalized phrases and common spelling variants across names, aliases, and form search terms. Terms included `nutritional yeast`, `nutritional yeast flakes`, `yeast flakes`, `nooch`, `levure alimentaire`, `levure nutritionnelle`, `flocons de levure`, brewer’s-yeast terms in English and French, yeast-extract terms, and Marmite/Vegemite.

- The live seed contains **1,031 ingredient references and 72 forms**. No active reference or form owns a complete phrase for nutritional yeast, its French terms, or `nooch`. There are separate current baker’s-yeast identities, including `ingredient-ref-yeast`, `ingredient-ref-active-dry-yeast`, `ingredient-ref-instant-yeast`, `ingredient-ref-compressed-yeast`, and `ingredient-ref-osmotolerant-yeast`. The parent is displayed as `baker’s yeast` / `levure de boulangerie`; its broad `yeast` / `levure` aliases and the yeast-specific rows are not exact matches for `nutritional yeast` / `levure alimentaire`.
- None of the **75 legacy-import candidates** matches the nutritional-yeast, brewer’s-yeast, yeast-extract, spread, or French equivalents searched.
- The **1,323-record research ledger** has one record that mentions nutritional yeast: `candidate-yeast-extract-spread`, with `identityState: needs_clarification`. It mentions nutritional yeast only as a distinct product boundary; there is no separate nutritional-yeast identity/candidate record. The spread candidate remains held pending generic Québec French review.
- Two existing proposals cover adjacent boundaries. [`WP02 yeast-products review`](wp02-yeast-products-boundary-review-20261009.md) integrated the baker’s-yeast parent and subtypes and explicitly keeps nutritional yeast and yeast extract outside their aliases. [`WP05 yeast-extract-spread review`](wp05-yeast-extract-spread-boundary-review-20261011.md) records nutritional yeast as distinct from a savory yeast-extract spread. Neither proposes a nutritional-yeast identity. No other proposal or batch was found for this identity.
- All **114 manifest-listed recipes / 1,123 ingredient rows** were scanned across recipe fields and ingredient text. No recipe contains nutritional yeast, `levure alimentaire`, `levure nutritionnelle`, `nooch`, yeast flakes, or an equivalent nutritional-yeast phrase. The only yeast-related ingredient rows are commercial baker’s yeast lines:

| Recipe | Ingredient row | Exact source wording and current link | Disposition |
|---|---|---|---|
| `recipes/005-bao-buns-vapeur-steamed-bao-buns-559fff48-4d46-4922-b1b8-66808cb0715c.v1.json` | `559fff48-4d46-4922-b1b8-66808cb0715c-ingredient-2` | `1 tsp dried yeast`, linked to `ingredient-ref-yeast` | Keep as baker’s yeast; “dried” does not identify nutritional yeast. |
| `recipes/072-pains-a-hamburger-hamburger-buns-cfa64319-d4b9-4425-b087-3e30be3cc4a0.v1.json` | `cfa64319-d4b9-4425-b087-3e30be3cc4a0-ingredient-6` | `8 g instant yeast`, linked to `ingredient-ref-instant-yeast` | Keep as instant baker’s yeast. |
| `recipes/076-pate-a-pizza-pizza-dough-14d20789-1967-432a-b9bc-0319599ffbd3.v1.json` | `14d20789-1967-432a-b9bc-0319599ffbd3-ingredient-3` | `7 g yeast`, linked to `ingredient-ref-yeast` | Keep as the recipe’s unqualified baker’s yeast. |

There is no exact phrase collision for the proposed bilingual name or aliases. Searching only `yeast` / `levure` is broader: those words occur on the existing baking-yeast parent and in other yeast subtype names, so they must not become aliases for the nutritional product.

## Identity and alias boundaries

| Product | Evidence-backed boundary | Catalog disposition |
|---|---|---|
| Nutritional yeast | OQLF and TERMIUM pair English `nutritional yeast` with French `levure alimentaire` and `levure nutritionnelle`. OQLF defines it as inactive dried yeast sold as flakes or yellowish powder, generally sprinkled on food, with no leavening property [S01–S02]. Current Canadian retailers use `Nutritional Yeast` in English and `Levure alimentaire` in French for the same pantry product class [S03–S04]. | Add one identity-only row using the canonical pair above. Treat `nooch` as a supported colloquial English search alias. Do not encode product-specific nutrient or fortification claims. |
| Baker’s yeast | The existing catalog has a distinct baking-scoped parent plus active dry, instant, compressed, and osmotolerant product identities. The yeast-products review cites Québec and federal terminology for baker’s yeast and records these separate identities [S08]. | Keep nutritional yeast separate; do not link any of the three recipe rows above to the new row. Do not alias `baker’s yeast`, `baking yeast`, `bread yeast`, `levure de boulangerie`, or baking subtypes. |
| Brewer’s yeast | TERMIUM identifies brewer’s yeast as yeast recovered from beer fermentation, with French `levure de bière` and `levure de brasserie`. It separately describes dried brewer’s yeast as a non-fermentative, non-extracted brewing by-product, with French terms `levure de bière séchée` and `levure de brasserie séchée` [S05–S06]. Therefore “inactive” or “non-fermentative” alone does not make brewer’s yeast and nutritional yeast synonyms. | Do not alias brewer’s yeast or its French terms to nutritional yeast. Ingredient identity/provenance varies by product and intended use; do not make a global product equivalence. |
| Yeast extract | OQLF’s Québec entry for `extrait de levure autolysée` describes autolysates rich in free amino acids and says they may be made from brewing, distilling, baking, or special Torula yeasts [S07]. This is extracted/autolysed yeast material rather than whole dried inactive yeast sold as flakes or powder. | Keep `yeast extract` / `extrait de levure` separate. Do not alias it to nutritional yeast. |
| Yeast-extract spread | Marmite’s manufacturer calls its product a dark, thick yeast-extract spread made from concentrated yeast extract; the repository’s separate WP05 review holds the generic spread candidate pending an exact Québec French display [S08–S09]. | Keep Marmite/Vegemite-type spreads, brand names, and unqualified yeast extract separate. Do not add Marmite or Vegemite aliases to nutritional yeast. |

The shared fungal source and flavor descriptions do not establish interchangeable ingredients. In particular, the common non-leavening property is insufficient for merging: OQLF uses it to define nutritional yeast, while TERMIUM also describes dried brewer’s yeast as non-fermentative but specifies it as a brewing by-product [S01–S02, S06]. No substitution with baker’s yeast, brewer’s yeast, yeast extract, yeast-extract spreads, cheese, or MSG is supported here.

## Source-to-claim map

Sources were accessed on 2026-10-11. Retailer pages support current product display wording for the listed item; they do not establish a universal formula or nutritional profile.

| ID | Source | Evidence used and limits |
|---|---|---|
| **WP05-T-NUTRITIONAL-YEAST-20261011-S01** | OQLF, [levure alimentaire (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298907/levure-alimentaire). | Lists French `levure alimentaire` and `levure nutritionnelle`, English `nutritional yeast`, and associated colloquial English `nooch`. Defines an inactive food sold as flakes or yellowish powder, commonly sprinkled on food, without leavening properties. OQLF notes flavor and nutrient uses but does not make nutrient levels universal. |
| **WP05-T-NUTRITIONAL-YEAST-20261011-S02** | Government of Canada TERMIUM Plus, [nutritional yeast terminology record](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=enb&lang=eng&srchtxt=CHEESY). | Record 1 lists `nutritional yeast` and French `levure alimentaire` / `levure nutritionnelle`; defines an inactive yeast food supplement and says it differs from baking yeast and has no fermenting power. This is federal terminology, not a product specification. |
| **WP05-T-NUTRITIONAL-YEAST-20261011-S03** | Maxi Canada, [Bob’s Red Mill Levure alimentaire gros flocons, 142 g](https://www.maxi.ca/fr/levure-alimentaire-gros-flocons/p/21732583_EA). | Current Québec French listing uses `Levure alimentaire` / `gros flocons`; its ingredient panel says `Levure Alimentaire Inactive`. The listing corroborates French retail usage and a flake presentation; product nutrients and ingredients remain brand-specific. |
| **WP05-T-NUTRITIONAL-YEAST-20261011-S04** | Well.ca Canada, [Bob’s Red Mill Nutritional Yeast, 142 g](https://well.ca/products/bobs-red-mill-nutritional-yeast_149490.html). | Current Canadian English listing names the product `Nutritional Yeast` and describes sprinkling it on foods or using it in dishes. The manufacturer’s product formulation and fortification are specific to this SKU. |
| **WP05-T-NUTRITIONAL-YEAST-20261011-S05** | Government of Canada TERMIUM Plus, [brewer’s yeast terminology record](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?fchrcrdnm=1&i=&index=enb&lang=eng&sg_kp_wet=1009750&srchtxt=PURE+CULTURE+YEAST). | Record 1 lists brewer’s yeast / brewers’ yeast / brewery yeast and French `levure de bière` / `levure de brasserie`, with a context describing production yeast recovered from beer fermentation. Use only for this brewing identity and bilingual term pair. |
| **WP05-T-NUTRITIONAL-YEAST-20261011-S06** | Government of Canada TERMIUM Plus, [dried brewer’s yeast terminology record](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?fchrcrdnm=9&i=&index=enb&lang=eng&sg_kp_wet=193671&srchtxt=BREWING). | Record 9 defines brewer’s dried yeast as dried, non-fermentative, non-extracted yeast resulting as a brewing by-product; gives French `levure de bière séchée` / `levure de brasserie séchée`. It shows why non-fermentation alone cannot collapse this product into nutritional yeast. Its subject fields include brewing and animal feed. |
| **WP05-T-NUTRITIONAL-YEAST-20261011-S07** | OQLF, [extrait de levure autolysée (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297250/extrait-de-levure-autolysee). | Defines the autolysed yeast-extract concept and notes yeast sources including beer, distillery, baking, and Torula yeasts. Supports separating extracted cell material from the whole inactive food described by the nutritional-yeast entry. The entry dates to 1987, so use it for the terminology/boundary, not current package wording. |
| **WP05-T-NUTRITIONAL-YEAST-20261011-S08** | Marmite, [Frequently Asked Questions](https://www.marmite.co.uk/faq.html). | Manufacturer describes Marmite as a dark, thick yeast-extract spread made from concentrated yeast extract, whose source is brewer’s yeast from beer-making. This is product-specific and does not make all yeast extracts or spreads equivalent. |
| **WP05-T-NUTRITIONAL-YEAST-20261011-S09** | Repository, [`WP02 yeast-products boundary review`](wp02-yeast-products-boundary-review-20261009.md). | Internal audit context for the active baker’s-yeast parent and product subtypes, and the exclusion of nutritional yeast and yeast extract from their aliases. Not an external terminology source. |
| **WP05-T-NUTRITIONAL-YEAST-20261011-S10** | Repository, [`WP05 yeast-extract-spread boundary review`](wp05-yeast-extract-spread-boundary-review-20261011.md) and [`candidate-yeast-extract-spread` ledger record](../research-ledger.v1.json). | Internal audit context for the held spread candidate, current Canadian retailer wording, and its explicit boundary from nutritional yeast. The ledger record mentions nutritional yeast only as a separate class, not as its own candidate. |

## Follow-up boundary

This packet supports adding the nutritional-yeast identity only. Keep the Section T checklist item open for MSG, yeast extract, bouillon powder, seasoning salt, and mushroom seasoning; the separate Section Z review also remains open for malt extract, gravy mixes, and other seasoning concentrates. Re-run the exact recipe-demand search before any later recipe link is proposed.

## Coordinator integration — 2026-10-11

Added `ingredient-ref-nutritional-yeast` as `nutritional yeast / levure alimentaire`, with `nooch` and `levure nutritionnelle` as search aliases. Added the seven external sources (S01–S07) to the reference's ledger record; repository sources S09–S10 remain proposal context rather than ledger URL entries. No form, density, unit mapping, recipe link, conversion, yield, or substitution was added. See `docs/catalog/batches/wp05-nutritional-yeast-identity-integration-20261011/README.md`.
