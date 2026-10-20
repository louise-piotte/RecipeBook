# WP05 Section Z — Brown-sauce identity and naming boundary review (R682)

- **Packet type:** proposal-only identity review; no shared catalog or plan data changed.
- **Research date:** 2026-10-18.
- **Target:** the open `brown sauce` item in Section Z of `docs/RecipeBook-global-ingredient-catalog-plan.txt` (around line 9973).
- **Scope:** unqualified `brown sauce` and a possible British-style bottled-condiment interpretation. This does not reopen steak sauce, Worcestershire sauce, barbecue sauce, prepared gravy, or any HP product identity.

## Recommendation

**Hold the unqualified `brown sauce` identity and the French display `sauce brune`.** Do not allocate a reference ID, add a legacy/ledger candidate, alias it to `ingredient-ref-steak-sauce`, `ingredient-ref-worcestershire-sauce`, or `ingredient-ref-bbq-sauce`, or add measures, forms, recipe links, or substitutions.

The English phrase names a British bottled condiment in the reviewed manufacturer and retail sources. The Québec French phrase does not map cleanly to that same product: OQLF’s `sauce brune` entry translates a classic stock-and-browned-roux foundation sauce, while a newer OQLF entry notes that *gravy* applies more specifically to a brown sauce. Current Québec product listings also use `sauce brune` for local sauce products and for dry sauce mixes; a Québec HP listing instead calls its product `sauce à bifteck et à badigeonner`. These are not sufficient grounds to turn unqualified `sauce brune` into a British-condiment name or to merge the products.

The Heinz French-market description calls its specific UK HP product `sauce brune anglaise`, which is a plausible descriptive phrase for that product. Under the app’s phrase-first search, however, adding a reference with that French display would make the shorter query `sauce brune` return the British condiment. That query is already semantically occupied in Québec usage by gravy/foundation and local brown-sauce products. The complete bundled recipe scan found no item that disambiguates the intended product. Revisit only when a recipe or product request identifies the intended British bottled condiment, a Québec French display is independently settled, and the resulting short-query behavior is accepted.

## Catalog, ownership, and picker audit

Live snapshot at review time: 1,837 active references, 169 forms, 2,215 research-ledger records, 56 legacy candidates, and 114 manifest-listed recipes.

| Check | Result |
|---|---|
| Candidate reference ID `ingredient-ref-brown-sauce` | Unowned; not proposed for allocation while held. |
| Exact active names/aliases | No owner for `brown sauce`, `sauce brune`, `sauce brune anglaise`, `British brown sauce`, `HP sauce`, `sauce HP`, or `brown gravy`; no matching form. |
| Legacy candidates | No exact owner for those phrases. |
| Ledger | No identity record for generic brown sauce. The few `brown sauce` ledger mentions are boundary notes around okonomi/tonkatsu sauces and do not own this product. |
| Adjacent active identities | `ingredient-ref-steak-sauce` is `steak sauce / sauce à bifteck` with French alias `sauce à steak`; Worcestershire and BBQ sauce remain separate. The exact query `sauce à bifteck` currently returns only the steak-sauce identity. |
| Picker effect | Exact queries `brown sauce`, `sauce brune`, `sauce brune anglaise`, `HP sauce`, and `sauce HP` currently return no active reference. The broad query `sauce` returns 49 references. A hypothetical `sauce brune anglaise` display would capture the shorter `sauce brune` phrase; no picker change is recommended while held. |
| Proposal/source ownership | R682, the target filename, and source prefix `WP05-BROWN-SAUCE-R682` were free before this file was created. The exact source URLs below have no owner in the current ledger. The `WP05-BROWN-SAUCE-R682-S01`–`S08` IDs are proposal-local citations only; no ledger entries are proposed. |

The earlier Section Z barbecue-sauce review named brown sauce only as a future separate-review candidate, with no exact recipe demand; it did not settle this identity. No focused brown-sauce review or accepted row was found in the prior proposal archive.

## Full bundled recipe-demand audit

All 114 manifest-listed recipe JSON files and all 1,123 ingredient rows were scanned, including parsed recipe content and ingredient text/ref fields. The normalized phrase scan covered `brown sauce`, `sauce brune`, `sauce brune anglaise`, `British brown sauce`, `HP sauce`, `sauce HP`, `brown gravy`, and `gravy brown`.

- Recipe-file hits: **0**.
- Ingredient-row hits: **0**.
- No recipe link or line is proposed.
- Corpus snapshot: 754,048 recipe-file bytes; SHA-256 digest over manifest-order basenames, NUL separators, and exact file bytes: `8ac44a8938adcc48b4f84d16be97492233ccd714e3381d9245058267ebe2ed2d`.

## Evidence reviewed

Sources were checked online on 2026-10-18. Each source supports only the scoped claim shown; none supplies a generic measure, density, conversion, or substitute.

| Source | Evidence and limit |
|---|---|
| **WP05-BROWN-SAUCE-R682-S01 — OQLF, [sauce brune (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8431654/sauce-brune)** | Preferred French term `sauce brune`; the English translation is `brown sauce`. The 1982 definition is a stock-based foundation sauce thickened with flour browned in fat. This does not define the British bottled condiment. |
| **WP05-BROWN-SAUCE-R682-S02 — OQLF, [sauce (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17059945/sauce)** | Current 2025 entry says *gravy* applies more specifically to a `sauce brune`. This reinforces Québec ambiguity; it is not a product specification. |
| **WP05-BROWN-SAUCE-R682-S03 — Heinz, [HP Brown Sauce, French-market product page](https://www.heinz.com/fr-FR/produits/05000111001007-hp-brown-flacon-verre-255-g-x-12)** | The manufacturer describes this named HP product as `sauce brune anglaise`, calls it a UK reference, and identifies tomatoes, dates, and tamarind as principal ingredients. This supports one product’s scope and French wording, not a universal brown-sauce formula. Its 15 g nutrition serving is not a kitchen measure or density. |
| **WP05-BROWN-SAUCE-R682-S04 — Metro Québec, [Sauce HP à bifteck et à badigeonner pour viandes](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/condiments-et-garnitures/sauces-barbecue-et-marinades/sauce-a-bifteck-et-a-badigeonner-pour-viandes/p/057000009403)** | Current French retail title for a Canadian HP item uses `sauce à bifteck et à badigeonner`; product ID `057000009403` is not the UK HP product ID in S03. This is not evidence that Canadian and UK HP products are formula-identical or that all steak sauces are brown sauce. |
| **WP05-BROWN-SAUCE-R682-S05 — Aliments du Québec, [Sauce brune](https://alimentsduquebec.com/aliments-dici/assaisonnements-sauces-et-condiments/sauce-brune-2)** | Current Québec product card for Gérard uses the unqualified name `Sauce brune`, lists a 250 g format, and names Québec grocery retailers. The page does not establish that this product is the British table condiment. |
| **WP05-BROWN-SAUCE-R682-S06 — Aliments du Québec, [Sauce classique bifteck](https://alimentsduquebec.com/aliments-dici/assaisonnements-sauces-et-condiments/sauce-classique-bifteck)** | A Québec product card calls the 355 mL item a “sauce brune classique rappelant la sauce HP” and lists Québec grocers. This is a local steak-sauce comparison, not a general synonym rule. |
| **WP05-BROWN-SAUCE-R682-S07 — Mayrand, [Mélange pour sauce brune Berthelet](https://mayrand.ca/fr/nos-produits/epicerie/sauce/sauce-deshydratee/melange-pour-sauce-brune-berthelet-00654)** | Québec food-service retailer lists a dry `mélange pour sauce brune` product and Québec store availability. The explicit mix form is a different product presentation from a ready-to-use bottled table condiment. |
| **WP05-BROWN-SAUCE-R682-S08 — Little Taste of Home, [HP Brown Sauce 255 g](https://www.littletasteofhome.ca/products/hp-brown-sauce-255g)** | Canadian seller page uses the exact English imported-product name and lists one 255 g package and an ingredient statement. It is Canadian e-commerce evidence, not proof of Québec store stock or a generic product standard. |

Source IDs `WP05-BROWN-SAUCE-R682-S01`–`S08` and each exact URL were checked against the current ledger and prior proposal/batch archive; none was already owned. These IDs are proposal-local citations. Since this recommendation is a hold, no source entries or candidate record should be added to shared ledger data.

## Bounded disposition

Keep `brown sauce` open in Section Z. Do not use `sauce brune` as a global alias, and do not collapse this candidate into steak sauce, Worcestershire sauce, BBQ sauce, gravy, demi-glace, or dry brown-sauce mixes. If later demand explicitly names a British bottled product, review that exact item under a qualified identity and rerun the picker check for the short French query `sauce brune` before activation.

## Integration owner disposition

Accepted as a documentation-only hold. No reference, candidate, ledger source, form, alias, recipe link, measurement, or substitution was added. The Section Z item remains open pending a recipe or product request that identifies a British bottled condiment and a safe Québec French display. See the R680–R682 integration README.
