# WP03 Section U regional aromatic review — R327

- **Status:** proposal only. This task edits this proposal file only; it does not change shared catalog data, the research ledger, roadmap, checklist, recipes, generated files, or application code.
- **Plan anchor:** `docs/RecipeBook-global-ingredient-catalog-plan.txt`, Section U, “Fresh herbs botanical aromatics and regional flavorings,” unchecked regional-aromatics line at 7621: `Lemon myrtle, pepperberry, wattleseed, annatto/achiote, mastic, mahleb, and other documented regional aromatics.`
- **Candidate:** culinary Chios mastic, also called Chios mastiha; the solid aromatic resin of *Pistacia lentiscus* var. *chia* (the varietal name is treated as a synonym of accepted *P. lentiscus* by Kew).
- **Coordination:** avoids the existing lemon-myrtle reference and the previously reviewed R324 lemon-balm identity. Mastic has no earlier focused decision in the checked proposal or batch archive.
- **Disposition:** recommend one identity-only `BAKING_AND_SPICE` reference, bounded to the Chios resin. Do not broaden it to the tree, other plant parts, non-Chios resin, liqueurs, essential oil, water, supplements, or finished chewing-gum products.

## Recommendation

Add one picker identity for the aromatic resin sold and used as a spice. Use **Chios mastic** in English and **mastiha de Chios** in French. The French label preserves the established product name used by the Chios growers’ French-language material. Add only the alternate names supported below; the Montréal retailer’s French listing calls the item **gomme de mastic grecque**.

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-chios-mastic` (unreserved) |
| Category | `BAKING_AND_SPICE` |
| EN display | `Chios mastic` |
| FR display | `mastiha de Chios` |
| EN aliases | `mastic`; `gum mastic`; `Chios mastiha` |
| FR aliases | `mastic`; `mastiha`; `gomme de mastic grecque` |
| Forms and recipe links | None proposed |
| Default density, unit mappings, conversions, yield, active substitutions | None |

The names “mastic” and “gum mastic” refer here to the raw Chios resin used as a culinary spice. They must not retrieve tree leaves or branches, mastic essential oil, mastic water, mastiha liqueur, supplements, or flavored commercial chewing gum. Keep *Pistacia lentiscus* out of picker aliases as a botanical name, and do not use bare `lentisque` or `arbre à mastic` as ingredient aliases.

The Chios growers describe resin that solidifies into crystalline tears and also list a cooking powder. That does not establish a single interchangeable powder product: one commercial cooking powder is explicitly blended 1:1 with maltodextrin, while the growers’ product page does not state a powder formula. Keep forms open pending a clearer product/form boundary; do not make `mastic powder` a global alias for the pure resin.

## Naming and product boundary

Kew accepts *Pistacia lentiscus* and lists *P. lentiscus* var. *chia* as a synonym. The Chios Mastiha Growers Association identifies Chios mastiha as aromatic natural resin from this tree and distinguishes the Chios-producing variety and region from other Mediterranean lentisk shrubs. Its French site uses `Mastiha de Chios`, `mastiha`, and `mastic`; the Montréal spice retailer uses the English title `Mastic greek gum` and French title `Gomme de mastic grecque` for a product it places under spices. These sources support the bounded bilingual identity without claiming that every resin sold as “mastic” is Chios product.

No OQLF food or spice entry for this product was located. The French display therefore follows the growers’ exact French product name, with the Québec retailer wording retained as a documented alias rather than presented as an OQLF recommendation. The Montréal retailer’s French page was indexed on its `dev` subdomain; the current production page is English-only in the review results. Treat the French storefront wording as Québec-market attestation with that currency limitation.

Do not alias `mastic` to `mastiha liqueur`, ouzo, mastic oil, essential oil, resinous varnish, or the mastic tree itself. The Montréal retailer notes that French `mastic` also names non-food resin/putty, but its listing is a spice product; a recipe-ingredient search is the scoped context for these aliases. No dosage or medicinal claim is part of the ingredient identity.

## Ownership and demand audit

I checked the current bundled reference and form packages, legacy import candidates, research ledger, focused proposals and batch notes, and all manifest-listed recipe ingredient rows for `mastic`, `mastiha`, `masticha`, `mastika`, *Pistacia lentiscus*, and the proposed reference ID.

| Surface | Current snapshot / result |
|---|---|
| Active ingredient references | 1,677; no mastic identity or alias owner. The existing lemon-myrtle row is unrelated. |
| Active ingredient forms | 127; no mastic or mastiha form. |
| Legacy import candidates | 59; no mastic candidate. |
| Research ledger | 2,024 records; no mastic identity, decision, observation, or matching source URL found. |
| Proposal and batch archives | No focused mastic/mastiha review or prior decision found. |
| Recipe corpus | All 114 manifest-listed files (1,123 ingredient rows) searched; no matching row text or linked identity. |

The proposed ID, R327 proposal path, and source prefix `WP03-SECTIONU-CHIOS-MASTIC-R327-20261016-S` were not present in the checked active data, ledger, proposals, or batches before drafting. The absence of a bundled recipe hit is not evidence that the spice lacks culinary use: the Chios growers and the Greek government-hosted source independently document it in food.

## Measures and substitutions

The Greek government-hosted recipe for baked rice pudding lists **½ teaspoon Chios mastic, crushed with sugar**, for six servings. The page says the recipe was translated from Carolina Doriti’s 2023 cookbook. This is one recipe-scoped ingredient quantity, not a standard portion, density, or volume-to-mass conversion. It can be preserved as a scoped ledger observation if the identity is accepted; do not derive grams from it.

The growers’ product sizes and package weights are retail packaging data, not kitchen measures. Their brochure’s estimate of resin produced by an average tree is an agricultural yield, not a cooking portion. The current evidence does not support a default density, unit mapping, teaspoon-to-gram factor, or universal measure. Leave numeric research open.

No reviewed source establishes a reliable ingredient replacement or a transferable substitution ratio for Chios mastic. Do not assign vanilla, pine, cardamom, mahlab, or another aromatic as a global substitute. Keep substitutions unresearched and add no active rule.

## Evidence

| ID | Source | Support and limits |
|---|---|---|
| `WP03-SECTIONU-CHIOS-MASTIC-R327-20261016-S01` | Royal Botanic Gardens, Kew, [Plants of the World Online: *Pistacia lentiscus*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:70253-1/general-information), accessed 2026-10-16. | Accepts *P. lentiscus* and lists English common names including `mastic`. Kew separately treats *P. lentiscus* var. *chia* as a synonym. Taxonomy does not by itself establish culinary use. |
| `WP03-SECTIONU-CHIOS-MASTIC-R327-20261016-S02` | Chios Mastiha Growers Association, [French-language home page](https://www.gummastic.gr/fr/), accessed 2026-10-16. | Calls the ingredient `Mastiha de Chios`, identifies it as aromatic natural resin from the mastic tree (*Pistacia lentiscus* var. *chia*), and describes Chios-specific production. The association’s terminology is a product/producer source, not an OQLF ruling. |
| `WP03-SECTIONU-CHIOS-MASTIC-R327-20261016-S03` | Chios Mastiha Growers Association, [Mastiha in our lives](https://www.gummastic.gr/fr/le-chios-mastiha/mastiha-dans-notre-vie), French page, accessed 2026-10-16. | Describes Chios mastiha as a spice used in breads, pastries, cream desserts, ice cream, and other foods; distinguishes food uses from oils, cosmetics, and other products. The page also includes medicinal claims, which this proposal does not adopt. |
| `WP03-SECTIONU-CHIOS-MASTIC-R327-20261016-S04` | Greek Ministry of Rural Development and Food, Reverse Agriculture, [Chios Mastic, the island’s natural treasure](https://portal.greekfarms.gov.gr/en/chios-mastic-the-islands-natural-treasure/), accessed 2026-10-16. | Uses English product name `Chios Mastic`, identifies the natural resin and *P. lentiscus* var. *chia*, describes culinary use, and states PDO recognition. The page explicitly says the culinary author’s views are personal and not the Ministry’s; use it for the page’s named product/recipe context, not as Ministry endorsement of health claims. |
| `WP03-SECTIONU-CHIOS-MASTIC-R327-20261016-S05` | Greek Ministry of Rural Development and Food, Reverse Agriculture, [Baked rice pudding with Chios Mastic](https://portal.greekfarms.gov.gr/en/baked-rice-pudding-with-chios-mastic/), accessed 2026-10-16. | Lists ½ teaspoon crushed Chios mastic for a six-serving recipe and says the recipe was translated from a 2023 cookbook. This supports only a source-specific formula observation; it provides no mass conversion. |
| `WP03-SECTIONU-CHIOS-MASTIC-R327-20261016-S06` | Épices Anatol, Montréal, [Mastic greek gum](https://www.epicesanatol.com/en/spices/mastic-greek-gum/), English storefront, accessed 2026-10-16. | Current production-domain listing uses `Mastic greek gum`, places it among spices, describes resin from the mastic tree, and identifies culinary uses. It was marked out of stock at review time; this is wording and product-boundary evidence, not proof of current availability. |
| `WP03-SECTIONU-CHIOS-MASTIC-R327-20261016-S07` | Épices Anatol, Montréal, [Gomme de mastic grecque](https://www.dev.epicesanatol.com/fr/epices/gomme-mastic-grecque/), French storefront result, accessed 2026-10-16. | Gives the Québec French product title `Gomme de mastic grecque` and identifies it as a natural resin from the pistachier lentisque used in small amounts in Greek and Arab desserts. The French result is on the seller’s `dev` subdomain; it is not evidence that the exact wording appears on the current production-domain French storefront. |
| `WP03-SECTIONU-CHIOS-MASTIC-R327-20261016-S08` | Chios Mastiha Growers Association, [The Chios Mastiha product](https://www.gummastic.gr/fr/nos-produits/le-mastiha), French page, accessed 2026-10-16. | Describes size grades for solidified resin and lists “Mastiha powder for cooking.” Package sizes are not kitchen measures, and the page does not state the powder’s composition. |
| `WP03-SECTIONU-CHIOS-MASTIC-R327-20261016-S09` | Masticha.gr, [Chios Mastic Powder for cooking 50 g](https://www.masticha.gr/en/sugar-free/chios-mastic-powder-for-cooking-50g), accessed 2026-10-16. | This specific commercial cooking powder states a 1:1 composition of Chios mastic and maltodextrin in its 2 g sachet. It demonstrates why an unqualified powder listing cannot be assumed to be pure ground resin; it is not a measure for the resin itself. |
| `WP03-SECTIONU-CHIOS-MASTIC-R327-20261016-S10` | Chios Mastiha Growers Association, [Chios Mastiha: 20 Great Recipes](https://www.gummastic.gr/public/Leaflets/CHIOS_MASTIHA_20_GREAT_RECEIPES.pdf), English brochure, publication date not shown, accessed 2026-10-16. | Calls the ingredient `Chios Mastiha`, says it is also known as `gum mastic`, identifies crystalline resin from *Pistacia lentiscus*, and describes spice use. Its size-specific discussion is not a household measure or conversion. |

## Verification performed

- Re-read `AGENTS.md` and the current Section U plan item before selecting the candidate.
- Checked active references, forms, legacy candidates, ledger records, proposal/batch archives, and the full manifest-listed recipe corpus for ownership and demand.
- Verified source wording and identity online. No common test/build/emulator command was run: this task creates a research proposal only and makes no database or application change.
- This proposal path and source-ID prefix were unallocated when drafted. No other shared files were edited by this task.
