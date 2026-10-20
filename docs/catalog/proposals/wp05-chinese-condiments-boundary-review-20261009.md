# WP05 Section W — Chinese sauce and paste boundary review

- **Packet type:** proposal only.
- **Prepared and source-access date:** 2026-10-09.
- **Scope:** bottled oyster sauce, vegetarian/vegan oyster-style or mushroom sauce, hoisin sauce, and doubanjiang.
- **Status:** integrated on 2026-10-09 after coordinator review; the broad Section W checklist remains open.
- **Source IDs:** `WP05-CW-S01` through `WP05-CW-S11`. The `WP05-CW-S` namespace was checked in the current ledger, existing proposals, and batches before assigning IDs; no collision was found.

## Coordinator recommendation

1. **Oyster sauce is already integrated.** Keep the current identity `oyster sauce` / `sauce d’huître`, with the existing French alias `sauce d’huîtres`. This is the bottled, concentrated condiment. Do not add homemade `sauce aux huîtres` as an alias: OQLF distinguishes that dish sauce from the bottled condiment. Oyster-flavoured commercial products remain product-specific; verify oyster extract on a label before treating a product as the same edible product, and do not infer that “flavoured” means shellfish-free.
2. **Hoisin sauce is already integrated.** Keep `hoisin sauce` / `sauce hoisin` and the current English alias `hoi sin sauce`. OQLF and a Canadian French manufacturer page support these names. Do not alias hoisin to soy sauce, plum sauce, or generic Chinese barbecue sauce.
3. **Add a distinct plant-based oyster-style sauce identity for review** in `SAUCE_AND_CONDIMENT`. Suggested display names: EN `vegan oyster sauce`; fr-CA `sauce aux huîtres végane`, attested by a Québec product listing. A manufacturer also sells a shiitake-flavoured, vegan `Vegetarian Stir-Fry Sauce` in its Oyster Sauces category and describes it as an alternative to its oyster sauce. Keep these products separate from oyster-containing sauce and from generic mushroom sauce. Do not promote the manufacturer’s general product label `Vegetarian Stir-Fry Sauce` to a global alias; the reviewed wording does not establish that every vegetarian stir-fry sauce is oyster-style. No additional alias is proposed pending terminology review.
4. **Add a distinct doubanjiang identity for review** in `SAUCE_AND_CONDIMENT`. Use `doubanjiang` in both EN and fr-CA, retaining the regional name. The Canadian manufacturer’s French page uses `sauce aux fèves et au piment rouge (Doubanjiang)` for one Sichuan-style product; this descriptive phrase is product wording, not a standardized French crosswalk. Do not globally alias `chili bean sauce`, `chili bean paste`, `Toban Djan`, `Pixian douban`, or generic fermented bean paste to doubanjiang. The evidence supports a named Sichuan-style fermented condiment, but not equivalence across all products sold under broad bean/chili sauce labels. `Pixian douban` is a geographically designated style/name, not an alias for every doubanjiang product.

**Numeric and substitution data remain unsupported.** No density, unit mapping, package yield, form conversion, or substitution rule is proposed for any of the four products. One manufacturer page gives a product pack as 2.3 kg (1.8 L), and some retail products show package amounts; these source-specific package labels are not generalized into a catalog density or recipe conversion. A vegan oyster-style product is described as an alternative, but no source reviewed establishes a 1:1 substitution amount.

## Proposed identities, names, and boundaries

| Scope item | Current status / proposed EN name | fr-CA name status | Aliases and exact product boundaries |
|---|---|---|---|
| Oyster sauce | Existing accepted identity: `oyster sauce` | Existing accepted display: `sauce d’huître`; current alias: `sauce d’huîtres` [S01] | No new aliases. Keep bottled concentrated oyster condiment distinct from homemade `sauce aux huîtres`. Do not map vegetarian/vegan products to this shellfish-containing identity. Do not infer that all oyster-flavoured products have the same oyster content or recipe role. |
| Vegetarian oyster / mushroom sauce | New candidate: `vegan oyster sauce` | `sauce aux huîtres végane` is used for Bodhï Gourmet’s Québec product [S03]. No OQLF entry for this product class was found. | No global aliases proposed. LKK’s `Vegetarian Stir-Fry Sauce` is a source-specific label; the manufacturer classifies it under oyster sauces and calls it a vegan alternative to its oyster sauce [S04, S05]. Keep it and Bodhï’s product within the proposed plant-based oyster-style boundary only for coordinator review. Do not alias generic `mushroom sauce`, `sauce aux champignons`, all vegetarian stir-fry sauces, or `vegetarian oyster sauce` without stronger term evidence. The ingredients and recipes vary by maker; “mushroom” is not a formula or identity rule. |
| Hoisin sauce | Existing accepted identity: `hoisin sauce` | Existing accepted display: `sauce hoisin` [S06, S07] | Existing English alias: `hoi sin sauce` [S06]. Add no new aliases. Keep distinct from soy sauce, plum sauce, and other prepared bean sauces. |
| Doubanjiang | New candidate: `doubanjiang` | Retain `doubanjiang` in fr-CA. LKK Canada uses the descriptive product wording `sauce aux fèves et au piment rouge (Doubanjiang)` [S08]; it is not proposed as a general alias. No OQLF terminology entry was found. | No global aliases proposed. LKK’s English `Chili Bean Sauce (Toban Djan)` and French product page are evidence about that manufacturer’s product only [S08, S09]. Keep it distinct from hoisin, black bean sauce, yellow bean sauce, sweet bean paste/tianmianjiang, generic fermented bean paste, chili paste, and other bean sauces. Preserve `Pixian douban` as a regional/geographical designation rather than a synonym for every product. |

The existing `ingredient-ref-mushroom` row is a whole-ingredient identity, not a mushroom sauce identity. The existing `ingredient-ref-black-bean-sauce` is a prepared sauce made with fermented black soybeans; it is not a doubanjiang alias. Shared ingredients, saltiness, umami, colour, or stir-fry use do not establish identity or interchangeability.

## Measurement, forms, and substitutions

| Item | Measurement and form status | Substitution status |
|---|---|---|
| Oyster sauce | Current seed density is null and unit mappings are empty; no form record. The existing ledger reports measurement research not yet done. | No rule proposed. A condiment’s use in the same dish does not establish a substitute amount. |
| Vegan oyster sauce | No catalog measurement or form data. Bodhï’s Québec product listing gives a 240 mL package; LKK’s professional page gives one pack as 2.3 kg (1.8 L). Neither label is treated here as a validated general density or conversion. | LKK calls its own product an alternative, but no tested or recipe-specific ratio is supplied. No 1:1 or other substitute rule proposed. |
| Hoisin sauce | Current seed density is null and unit mappings are empty; no form record. The existing ledger reports measurement research not yet done. | No rule proposed. Do not use hoisin as a default replacement for oyster sauce, doubanjiang, or plum sauce. |
| Doubanjiang | No current catalog row/form or supported mass-volume pair. The LKK 20 kg pail and retail package sizes apply only to those specific packages. | No rule proposed. Product regional style, saltiness, heat, solids, and aging vary; no quantity-equivalent replacement is established. |

No ingredient forms, density values, unit mappings, mass-volume conversions, package-yield relations, recipe-line substitutions, or contextual substitution rules are proposed in this packet. Leave unknown fields unset pending evidence for the specific product and recipe context.

## Live catalog, ledger, legacy, form, proposal, and recipe audit

Snapshot checked on 2026-10-09 before writing this proposal:

| Artifact | Count / SHA-256 |
|---|---|
| Seed manifest `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths; `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Active ingredient references | 414 rows; `5f7cca9264d410c2c2e619321fc0daa7ed6a6907630225dd490ba0894ce8288e` |
| Ingredient forms | 16 rows; `247a927eb706ac3867d001f556b480bdc5244a80eaeffe85a0861497a9c0378a` |
| Legacy candidates | 99 rows; `63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b` |
| Research ledger | 579 records; `db6ac4439396eca82f5f66508d30d538f5b4686431e09d87240239060143c647` |
| Recipe JSON files | 114 files, 1,123 ingredient lines; ordered recipe digest `344a67efba2bba5d65a6e79ea1f9c4d4fdf9237271d3410c1041bff39a748f6` |

Each file hash is SHA-256 of its exact bytes. The recipe digest is SHA-256 over recipe basenames sorted lexically, each followed by a NUL byte, its exact file bytes, and another NUL byte.

The exact-key audit mirrored `normalizeIngredientSearchKey` in `IngredientSearch.kt`: lowercase/NFKD, `œ`/`æ`/`ß` folding, combining-mark removal, ampersand expansion, non-ASCII-alphanumeric-to-space, and whitespace collapse. Proposed names and reviewed boundary queries were checked against active reference names/aliases, form labels/match terms, and all legacy names/aliases. The whole-phrase query set was: `oyster sauce`, `sauce d’huître`, `sauce d’huîtres`, `sauce aux huîtres`; `vegan oyster sauce`, `vegetarian oyster sauce`, `plant-based oyster sauce`, `vegetarian stir-fry sauce`, `mushroom oyster sauce`, `vegetarian mushroom sauce`, `mushroom sauce`, `sauce aux huîtres végane`, `sauce aux huîtres végétalienne`, `sauce végétarienne aux huîtres`, `sauce aux champignons`; `hoisin sauce`, `sauce hoisin`, `hoi sin sauce`, `hoi sin`; `doubanjiang`, `douban jiang`, `douban`, `doubanjiang sauce`, `Pixian douban`, `Pixian doubanjiang`, `Toban Djan`, `chili bean sauce`, `chili bean paste`, `Sichuan chili bean paste`, `fermented bean paste`, `sauce aux fèves et au piment rouge`, `pâte de fèves au piment`; and boundary terms `sweet bean sauce`, `tianmianjiang`, `yellow bean sauce`, `black bean sauce`, `fermented black soybeans`, and `chili paste`.

- **Expected existing matches:** `oyster sauce`, `sauce d’huître`, and `sauce d’huîtres` resolve to `ingredient-ref-oyster-sauce`; `hoisin sauce`, `sauce hoisin`, and `hoi sin sauce` resolve to `ingredient-ref-hoisin-sauce`. The legacy file still has same-ID rows for oyster and hoisin with `reviewState: unreviewed`; its oyster French name `sauce aux huitres` also normalizes to the boundary query `sauce aux huîtres`. Do not activate that legacy wording: OQLF distinguishes homemade `sauce aux huîtres` from the bottled condiment. The boundary query `black bean sauce` resolves to the separate active `ingredient-ref-black-bean-sauce`. These are same-ID/historical or intentionally separate matches, not new product candidates. Recheck the legacy snapshot at any future integration.
- **No exact active reference, form, or legacy key** was found for the proposed vegan oyster-style product terms (`vegan oyster sauce`, `sauce aux huîtres végane`, `sauce aux huîtres végétalienne`, `vegetarian stir-fry sauce`, `mushroom oyster sauce`) or doubanjiang terms (`doubanjiang`, `douban jiang`, `Pixian douban`, `Toban Djan`, `chili bean sauce`, `sauce aux fèves et au piment rouge`). Nearby `mushroom` and `black bean sauce` records are not exact compound-key collisions.
- Chinese-script queries such as `豆瓣酱` normalize to an empty key under the current app search algorithm. They are therefore not proposed as aliases in this packet; retain the searchable romanized name `doubanjiang` unless multilingual search support changes.
- Existing proposal review: `wp05-east-asian-condiments.md` already described the manufacturer-specific vegetarian stir-fry product and proposed keeping it distinct from generic mushroom sauce; this packet refines that boundary with a Québec vegan oyster sauce label and the manufacturer’s explicit oyster-alternative statement. `wp05-east-asian-condiments-followup.md` and `batches/wp05-pantry-condiments-first-tranche.md` confirm that oyster sauce and hoisin are already integrated. No other proposal integrates the vegetarian oyster-style product or doubanjiang. A previous proposal’s candidate wording is not treated as a canonical row.
- Every one of the 114 manifest-listed recipe JSON files was scanned across each ingredient’s `originalText` and `ingredientName` for the exact normalized whole phrases listed above. **No ingredient line matched.** There are 1,123 ingredient lines in the snapshot; no recipe relinking is indicated.

## Source search log

All web searches and source checks were performed on 2026-10-09. Queries below are representative and do not treat search result ranking as evidence.

| Search group | Representative queries | Result / limit |
|---|---|---|
| Québec terms: oyster and hoisin | `site:vitrinelinguistique.oqlf.gouv.qc.ca "sauce d'huître"`; `site:vitrinelinguistique.oqlf.gouv.qc.ca "sauce hoisin"`; direct OQLF GDT entries | OQLF supports the existing French display and distinction for oyster sauce, plus `sauce hoisin` and English `hoi sin sauce`. Its oyster entry distinguishes bottled `sauce d’huître` from homemade `sauce aux huîtres`. |
| Vegetarian / mushroom products | `Lee Kum Kee Canada Vegetarian Stir-Fry Sauce shiitake vegan oyster alternative`; `Aliments du Québec Bodhï sauce aux huîtres végane`; `Québec vegan oyster sauce manufacturer` | Manufacturer pages support a vegan shiitake-flavoured oyster-sauce alternative; Aliments du Québec attests the local French product name and Québec producer. No OQLF standardized product-class term was found. |
| Doubanjiang | `Lee Kum Kee Canada doubanjiang Toban Djan`; `Québec doubanjiang pâte de fèves piment`; `site:std.samr.gov.cn 郫县豆瓣 GB/T 20560-2006`; `Pixian douban broad bean paste journal` | A Canadian manufacturer uses `doubanjiang` in a French product title and identifies a Sichuan-style fermented-bean/chili product. China’s standards platform confirms a current geographical-indication product standard for Pixian douban. Research evidence is product-specific; no generic French standard or crosswalk among all chili-bean pastes was established. |

## Source-to-claim map

Sources were assigned unique IDs only after confirming the `WP05-CW-S` prefix was absent from the current ledger and proposal/batch files. All were accessed 2026-10-09.

| ID | Source | Evidence used and limits |
|---|---|---|
| **WP05-CW-S01** | OQLF, [sauce d’huître (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095130/sauce-dhuitre) | Preferred French names `sauce d’huître` and `sauce d’huîtres`; explicitly distinguishes the bottled concentrated condiment from homemade `sauce aux huîtres`. Supports existing name and boundary, not current formulas of every product. |
| **WP05-CW-S02** | Lee Kum Kee Canada, [Kum Chun Oyster Flavoured Sauce](https://ca.lkk.com/en/products/kum-chun-oyster-flavoured-sauce) | Manufacturer lists oyster extractives and oysters as an allergen for one bottled product. Supports an oyster-containing product example; “oyster flavoured” wording alone does not determine another product’s composition. |
| **WP05-CW-S03** | Aliments du Québec, [Sauce aux huîtres végane — Bodhï Gourmet](https://alimentsduquebec.com/aliments-dici/assaisonnements-sauces-et-condiments/sauce-aux-huitres-vegane) | Québec product listing gives the exact French product name, identifies Bodhï Gourmet and its Québec production, and records a 240 mL package. Supports local terminology and one product; not a universal recipe or measurement conversion. |
| **WP05-CW-S04** | Lee Kum Kee Canada, [Vegetarian Stir-Fry Sauce](https://ca.lkk.com/en/products/vegetarian-stir-fry-sauce) | Manufacturer categorizes its sauce under Oyster Sauces, tags it vegan, and describes shiitake mushroom flavour and its ingredient list. Source-specific product evidence; not a global alias for all vegetarian stir-fry sauces or mushroom sauces. |
| **WP05-CW-S05** | Lee Kum Kee Professional, [Vegetarian Stir-fry Sauce (with Shiitake Mushroom)](https://www.lkkprofessional.com/sauces.php?sauce=vegetarian-stir-fry-sauce-with-shiitake-mushroom) | Manufacturer calls this specific sauce a vegan alternative to its oyster sauce and gives the pack label 2.3 kg (1.8 L). The product relationship supports a plant-based oyster-style boundary; pack data is not generalized into a density or conversion. |
| **WP05-CW-S06** | OQLF, [sauce hoisin (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095133/sauce-hoisin) | Supports fr-CA `sauce hoisin` and the English terms `hoisin sauce` and `hoi sin sauce`. Confirms the current accepted name/alias; not an ingredient specification for all brands. |
| **WP05-CW-S07** | Lee Kum Kee Canada, [Sauce hoisin (bouteille)](https://ca.lkk.com/fr-ca/products/hoisin-sauce--bottle) | Canadian manufacturer’s French product page uses `sauce hoisin` and describes a prepared sweet sauce with soy, spices, and other ingredients. Supports local manufacturer wording; formulation is this brand’s product only. |
| **WP05-CW-S08** | Lee Kum Kee Industrial Canada, [Sauce aux fèves et au piment rouge (Doubanjiang)](https://ca.lkk.com/fr-ca/industrial/products/chili-bean-sauce---toban-djan) | Canadian French manufacturer page uses `Doubanjiang` in the title and describes one Sichuan-style chili sauce containing fermented soybean paste and fermented broad-bean paste. Supports the source-specific name and product; not an equivalence of all chili bean sauces. |
| **WP05-CW-S09** | Lee Kum Kee Canada, [Chili Bean Sauce (Toban Djan)](https://ca.lkk.com/en/products/chili-bean-sauce-toban-djan-2) | Manufacturer’s English product label and ingredient list support `Toban Djan` for that product. Do not promote either it or generic `chili bean sauce` to a universal alias. |
| **WP05-CW-S10** | China National Standard Information Public Service Platform, [GB/T 20560-2006, Geographical indication product — Pixian douban](https://std.samr.gov.cn/gb/search/gbDetailed?id=71F772D782E3D3A7E05397BE0A0AB82A) | Official platform lists the Pixian douban geographical-indication product standard as current and records a 2025 review. Supports `Pixian douban` as a geographically bounded product designation, not as a global alias for doubanjiang. |
| **WP05-CW-S11** | *Journal of Food Science*, [Application effects of NaCl substitute on the fermentation profile of Pixian douban (broad bean paste)](https://pubmed.ncbi.nlm.nih.gov/38465700/) | Primary food-science study identifies the studied product as Pixian douban/broad bean paste and examines its fermentation profile. Evidence is specific to Pixian douban and the study; it does not establish a universal composition, density, or substitution. |

## Coordinator checks before any integration

1. Recheck the live seed, ledger, legacy file, forms, and recipe scan against the exact final candidate names; the hashes above are an observed snapshot, not a permanent assertion.
2. Confirm whether the proposed plant-based oyster-style candidate should include only products explicitly positioned as vegan oyster-sauce alternatives. Keep generic mushroom sauce and unrelated vegetarian stir-fry sauces separate.
3. Preserve the existing accepted oyster and hoisin rows. Resolve how the legacy file’s same-ID rows marked `unreviewed` should be treated through the existing canonical workflow; this proposal does not edit that file.
4. Keep doubanjiang distinct from other bean sauces. Any broader alias for `Toban Djan`, `chili bean sauce`, or descriptive French wording needs stronger cross-product terminology evidence.
5. Leave all measurements, forms, conversions, and substitutions unset until evidence supports the exact product/form and recipe use.
6. Keep the broad Section W checkbox open. This focused review does not close the complete Chinese sauce/paste/preserve sweep.

## Coordinator integration result

Added separate vegan oyster sauce and doubanjiang identities in `SAUCE_AND_CONDIMENT`. The
source-only vegan alternative note was not activated as a substitution rule. Existing oyster and
hoisin rows remain unchanged. No forms, measurements, mappings, or recipe links were added; broad
Chinese condiment coverage remains open.

Canonical post-merge snapshot: 446 ingredient references, 16 forms, and 612 research-ledger records.
