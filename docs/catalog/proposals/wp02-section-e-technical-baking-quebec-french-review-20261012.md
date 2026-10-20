# WP02 Section E — remaining technical baking ingredients: Québec French review

**Review date:** 2026-10-12 | **Scope:** Lecithin; glycerol/glycerin; citric, malic, and ascorbic acids; sodium citrate; meringue powder; dried egg white and yolk; custard powder. | **Plan item:** `docs/RecipeBook-global-ingredient-catalog-plan.txt`, WP02 Section E.
**Disposition:** Root-integrated terminology update to the existing custard-powder reference. No new ingredient identity or recipe link was added.

## Recommendation

Updated the existing custard-powder reference to use **`poudre à crème anglaise`** as its French display term. Retained **`poudre à crème pâtissière`** as an alias for existing wording and added **`poudre pour crème anglaise`** for a current Québec retailer name. TERMIUM gives the display as the preferred recipe-domain equivalent of `custard powder`; Québec and Canadian listings support the aliases. The English name, reference ID, category, recipe links, and numeric fields remain unchanged.

The other named products are genuinely missing from the active catalog and the current recipe bundle. Their bilingual candidate wording is evidence-backed below, but this bundle does not justify adding those references, powdered egg forms, recipe links, measures, conversions, or substitutions. In particular, treat meringue powder as its own compound product and model pure dried egg white or yolk as a future form of the existing white or yolk reference if recipe demand appears.

## Current snapshot and audit method

Counts and hashes are from the live files inspected on 2026-10-12. Hashes are SHA-256 of exact on-disk bytes. The recipe-set digest sorts the manifest recipe paths, then hashes each relative path, a NUL byte, the file bytes, and a NUL byte.

| File or set | Count / size | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,201 references; 384,447 bytes | `5685098584f69a600eb376d7d824ab7564b9d5ee057252fd4822ff9afd1b76cc` |
| `ingredient-forms.v1.json` | 86 forms; 64,612 bytes | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `manifest.v1.json` | 114 recipe files; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Bundled recipe files | 114 files; 1,123 ingredient rows; 752,942 bytes | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
| `docs/catalog/research-ledger.v1.json` | 1,503 records; 4,984,099 bytes; 5,075 source references / 4,144 distinct source IDs | `7db6d9a41d6f673967c1164ecadfd161497ca64ff8d53acaaf9c28fc4c1dfa00` |
| `docs/catalog/legacy-import-identities.v1.json` | 66 candidates; 15,752 bytes | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |

The scan parsed every manifest-listed recipe and searched ingredient fields, instructions, and other text fields. Matching used case folding, Unicode accent removal, `œ`/`æ` expansion, punctuation folding, and whitespace collapse across the English and French spellings listed in this review. It then checked active reference names and aliases, forms and match terms, legacy candidate names and aliases, and ledger source and decision text.

The source IDs in this review use `WP02-E-TECHBAKING-QC-20261012-S##`. A pre-integration search found no IDs with this prefix in the ledger. The three custard-powder sources, S10–S12, were added to its active reference record; the remaining source IDs remain review evidence only.

## Active catalog, forms, legacy candidates, and ledger

The only active reference matching a product in the requested list is the custard-powder row. The other requested identities and dried egg products have no exact active reference, alias, form, or legacy candidate match.

| Live reference | Current English / French display and aliases | Current state |
|---|---|---|
| `ingredient-ref-custard-powder` | `custard powder` / `poudre à crème anglaise`; aliases `poudre à crème pâtissière`, `poudre pour crème anglaise` | `FLOUR_AND_STARCH`; no forms, density, or unit mappings. Two recipe rows remain linked here. |
| `ingredient-ref-egg-white` | `egg white` / `blanc d'œuf`; EN alias `egg whites`; FR aliases `gros blanc d'oeuf`, `gros blancs d'oeufs` | `EGG`; no forms, density, or unit mappings. Existing rows are fresh egg white. |
| `ingredient-ref-egg-yolk` | `egg yolk` / `jaune d'œuf`; EN alias `egg yolks`; FR aliases `gros jaune d'oeuf`, `gros jaunes d'œufs`, `jaunes d'œufs` | `EGG`; no forms, density, or unit mappings. Existing rows are fresh egg yolk. |
| `ingredient-ref-egg` | `egg` / `œuf`; EN alias `eggs`; FR aliases `gros œuf`, `gros oeufs`, `œuf entier`, `œufs entiers`, `œuf large`, `oeufs`, `œufs moyens` | `EGG`; parent context only. No powdered form is linked to this row. |

No form is linked to the custard-powder, egg-white, or egg-yolk references. The legacy file has no target-product candidate; its nearby unreviewed `ingredient-ref-egg-substitute` candidate (`egg substitute` / `substitut d œuf`) is a separate class and does not own powdered egg or meringue powder.

The custard-powder ledger record is now verified with three terminology and product-label sources. Other ledger mentions of “citric acid” occur only incidentally in source descriptions for unrelated items: a commercial banana purée, an ayran product, a low-fat coco-jam note, and a seasoned-salt formula. They do not establish a citric-acid reference or bundled recipe demand. No other direct ledger entry was found for these candidate product identities.

## Exact bundled recipe demand

The full scan found **two ingredient rows**, both exact `custard powder` lines already linked to `ingredient-ref-custard-powder`. Both recipes' French instructions retain `poudre à crème pâtissière`; that exact wording remains a French alias. There are no ingredient lines or instructions naming lecithin, glycerol/glycerin, citric acid, malic acid, ascorbic acid, sodium citrate, meringue powder, dried egg white, or dried egg yolk.

| Recipe file / recipe ID | Ingredient ID | Exact source line | Existing link |
|---|---|---|---|
| `006-barres-nanaimo-nanaimo-bars-9a714acf-d991-4932-bb4c-63af19051022.v1.json` / `9a714acf-d991-4932-bb4c-63af19051022` | `9a714acf-d991-4932-bb4c-63af19051022-ingredient-10` | `3 tbsp custard powder` | `ingredient-ref-custard-powder`; quantity 3, unit `tbsp`, group `Middle Layer` |
| `070-nanaimo-cake-f3ce6ed8-0389-457c-92ec-240cf53eacde.v1.json` / `f3ce6ed8-0389-457c-92ec-240cf53eacde` | `f3ce6ed8-0389-457c-92ec-240cf53eacde-ingredient-18` | `4.5 tbsp custard powder` | `ingredient-ref-custard-powder`; quantity 4.5, unit `tbsp`, group `Nanaimo-style filling` |

For context, the bundle has **8 fresh egg-white rows across 7 recipes** and **8 fresh egg-yolk rows across 8 recipes**. These do not support dried-product demand or a drying conversion.

| Recipe file | Ingredient ID | Exact source line | Reference |
|---|---|---|---|
| `003-amaretti-8ccbf0c1-b6d9-4908-b122-1c7dacba5f0d.v1.json` | `8ccbf0c1-b6d9-4908-b122-1c7dacba5f0d-ingredient-4` | `2 large egg whites (60 g), lightly beaten` | `ingredient-ref-egg-white` |
| `008-best-vanilla-cake-41d7331d-2cf7-4a72-b1ce-ac90ffb97f33.v1.json` | `41d7331d-2cf7-4a72-b1ce-ac90ffb97f33-ingredient-8` | `2 large egg whites` | `ingredient-ref-egg-white` |
| `021-buche-de-noel-yule-log-30e4274f-19fd-47df-b90b-75a5eefdb2c8.v1.json` | `30e4274f-19fd-47df-b90b-75a5eefdb2c8-ingredient-14` | `1 large egg white` | `ingredient-ref-egg-white` |
| `035-congolais-coconut-macaroons-f99dad41-30f8-4294-bbba-4f0b555eda23.v1.json` | `f99dad41-30f8-4294-bbba-4f0b555eda23-ingredient-5` | `2 large egg whites` | `ingredient-ref-egg-white` |
| `051-gateau-aux-fraises-strawberry-cake-eadf54de-0fa2-4ef3-a620-3f6fbeac7c90.v1.json` | `eadf54de-0fa2-4ef3-a620-3f6fbeac7c90-ingredient-8` | `5 large egg whites, room temperature` | `ingredient-ref-egg-white` |
| `079-pate-d-amande-et-massepain-almond-paste-and-marzipan-1dca3c8b-ed68-4397-b804-ae62e769ee5e.v1.json` | `1dca3c8b-ed68-4397-b804-ae62e769ee5e-ingredient-3` | `1 egg white, lightly beaten, at room temperature` | `ingredient-ref-egg-white` |
| `079-pate-d-amande-et-massepain-almond-paste-and-marzipan-1dca3c8b-ed68-4397-b804-ae62e769ee5e.v1.json` | `1dca3c8b-ed68-4397-b804-ae62e769ee5e-ingredient-7` | `1 egg white, lightly beaten, at room temperature` | `ingredient-ref-egg-white` |
| `110-tartelettes-a-la-frangipane-aux-amandes-almond-frangipane-mini-tarts-b55e38ff-597e-441b-9a89-a4e06c07248a.v1.json` | `b55e38ff-597e-441b-9a89-a4e06c07248a-ingredient-12` | `1 egg white` | `ingredient-ref-egg-white` |
| `010-biscuit-linzer-linzer-cookies-a1e9ba5d-be5c-447d-a368-3ae4954a0a07.v1.json` | `a1e9ba5d-be5c-447d-a368-3ae4954a0a07-ingredient-8` | `2 large egg yolks` | `ingredient-ref-egg-yolk` |
| `045-fraisier-strawberry-cake-b8cf19ee-618b-495a-9ecb-9a90e88a9dac.v1.json` | `b8cf19ee-618b-495a-9ecb-9a90e88a9dac-ingredient-7` | `60 g egg yolks` | `ingredient-ref-egg-yolk` |
| `046-french-buttercream-e0f7bb65-859b-4dc0-8d03-30180b9acdaf.v1.json` | `e0f7bb65-859b-4dc0-8d03-30180b9acdaf-ingredient-3` | `5 large egg yolks` | `ingredient-ref-egg-yolk` |
| `057-gateau-quadruple-chocolat-chocolate-truffle-cake-f4807560-d19f-4e2d-aeab-80138564b93f.v1.json` | `f4807560-d19f-4e2d-aeab-80138564b93f-ingredient-8` | `3 large egg yolks` | `ingredient-ref-egg-yolk` |
| `072-pains-a-hamburger-hamburger-buns-cfa64319-d4b9-4425-b087-3e30be3cc4a0.v1.json` | `cfa64319-d4b9-4425-b087-3e30be3cc4a0-ingredient-11` | `1 egg yolk` | `ingredient-ref-egg-yolk` |
| `088-pudding-au-chocolat-chocolate-pudding-d9ce5a86-561d-4c36-975f-5f4249aa9df5.v1.json` | `d9ce5a86-561d-4c36-975f-5f4249aa9df5-ingredient-5` | `3 egg yolks` | `ingredient-ref-egg-yolk` |
| `110-tartelettes-a-la-frangipane-aux-amandes-almond-frangipane-mini-tarts-b55e38ff-597e-441b-9a89-a4e06c07248a.v1.json` | `b55e38ff-597e-441b-9a89-a4e06c07248a-ingredient-4` | `1 large egg yolk` | `ingredient-ref-egg-yolk` |
| `114-gateau-au-chocolat-allemand-german-chocolate-cake-e2d11309-7775-4efb-981c-2c78a8d03da6.v1.json` | `e2d11309-7775-4efb-981c-2c78a8d03da6-ingredient-16` | `3 large egg yolks` | `ingredient-ref-egg-yolk` |

## Product wording and identity boundaries

For products without exact recipe demand, the wording below records a future candidate only. Custard powder is already an active identity; its French display correction is integrated.

| Candidate product | Candidate English / fr-CA wording | Source-bounded alias and identity guidance | Disposition |
|---|---|---|---|
| Lecithin | `lecithin` / `lécithine` | Keep source-qualified `soya lecithin` / `lécithine de soya` qualified when the source says soya; do not broaden it into a generic source alias. | Retain these terms for future demand; no row. [S01] |
| Glycerol / glycerin | `glycerol` / `glycérol` | OQLF also lists `glycerin` / `glycérine`; the current CFIA additive synonym table supports `glycerin`, `glycérine`, and `1,2,3-propanetriol` as synonyms. Use `glycérol` for a future French display and keep the supported forms as aliases. | Retain, with source-bounded aliases; no row. [S02, S03] |
| Citric acid | `citric acid` / `acide citrique` | Keep distinct from lemon or lime juice and from citrate salts. The OQLF entry treats it as a food additive and names the acid itself. | Retain; no alias expansion to juice or salts. [S04] |
| Malic acid | `malic acid` / `acide malique` | CFIA’s permitted synonym table lists `hydroxysuccinic acid` / `acide hydroxysuccinique`. Keep the acid separate from maleic acid and from malate salts, including sodium hydrogen malate. | Retain these names; no row. [S03] |
| Ascorbic acid | `ascorbic acid` / `acide ascorbique` | CFIA lists `L-ascorbic acid` / `acide L-ascorbique` as a permitted synonym. Although OQLF also lists `vitamine C`, Health Canada distinguishes nutritional vitamin use from ascorbic acid used as a technological antioxidant. Do not add `vitamin C` / `vitamine C` as an unconditional recipe-matching alias. | Retain the acid name and narrow L-form alias; no row. [S03, S06, S07] |
| Sodium citrate | `sodium citrate` / `citrate de sodium` | CFIA lists `trisodium citrate` / `citrate trisodique` as a permitted synonym. The OQLF definition identifies it as a sodium salt of citric acid; keep it distinct from citric acid and from other citrate salts. | Retain with the exact synonym only; no row. [S03, S05] |
| Meringue powder | `meringue powder` / `meringue en poudre` | Current Canadian French product wording uses `meringue en poudre`. Metro's Wilton label lists egg-white powder alongside cornstarch, sugar, gum, salts, flavour, and other ingredients; Wilton describes this product family as mostly dried egg white, with additional ingredients. Keep this compound product distinct from pure egg-white powder and do not generalize a brand's recipe replacement. | Retain as a separate future product identity; no row or substitution. [S13, S14] |
| Dried egg white / albumen | `dried egg white`, `dried albumen` / `poudre de blanc d'œuf`, `poudre d'albumen` | CFIA's current standards use these names for the standardized dried white/albumen product. Keep a pure white powder as a future form of `ingredient-ref-egg-white`; do not match meringue powder or a formulated egg substitute to it by name alone. | Future form only if a recipe asks for it; no current form or conversion. [S08, S09] |
| Dried egg yolk | `Dried Yolk` / `poudre de jaune d'œuf` | CFIA's current standards use `Dried Yolk` and `poudre de jaune d'œuf` for the dried yolk product. Keep pure powdered yolk as a future form of `ingredient-ref-egg-yolk`, separate from dried yolk mixes and whole-egg products. | Future form only if a recipe asks for it; no current form or conversion. [S08, S09] |
| Custard powder | `custard powder` / **`poudre à crème anglaise`** | TERMIUM gives `poudre à crème anglaise` and `poudre pour faire la crème anglaise`; a Québec Aubut listing uses `Poudre pour crème anglaise`. A Canadian listing also describes Bird's product with `poudre de crème pâtissière` wording. Keep `poudre à crème pâtissière` as an alias for established catalog and recipe text, plus the Aubut phrase `poudre pour crème anglaise`. This is a dry custard-making mix, not prepared crème anglaise or a ready pastry cream. | **Integrated.** Keep the existing reference ID/category and both recipe links; no numeric or form behavior changed. [S10, S11, S12] |

## Source register

Source IDs are unique within this proposal and were checked against the current ledger and catalog proposal directory before writing.

| Source ID | Source and locator | Supports |
|---|---|---|
| `WP02-E-TECHBAKING-QC-20261012-S01` | [OQLF, « lécithine » (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8409578/lecithine), preferred French term and English translation; updated 1989. | The bilingual pair `lécithine` / `lecithin`; its note describes lecithin as a phosphatide-containing mixture and identifies food additive uses. The separate OQLF entry for lécithine de soya supports retaining source qualification. |
| `WP02-E-TECHBAKING-QC-20261012-S02` | [OQLF, « glycérol » (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869224/glycerol), preferred French terms and English terms; updated 2006. | `glycérol` and `glycérine`; English `glycerol` and `glycerin`. |
| `WP02-E-TECHBAKING-QC-20261012-S03` | [CFIA, Permitted synonyms for food additives table](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/additifs-alimentaires/synonymes-autorises), entries for glycerol, malic acid, ascorbic acid, and sodium citrate; accessed 2026-10-12. | Current Canadian permitted synonym spellings: glycerol/glycerin, malic acid/hydroxysuccinic acid, ascorbic acid/L-ascorbic acid, and sodium citrate/trisodium citrate, with French common names. The page says it covers only additives with a permitted synonym or abbreviation; it does not establish recipe demand or amounts. |
| `WP02-E-TECHBAKING-QC-20261012-S04` | [OQLF, « acide citrique » (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2086269/acide-citrique), food-additive domain, preferred term, and English translation; updated 1987. | The exact French / English term pair `acide citrique` / `citric acid`; it does not make lemon or lime juice a synonym. |
| `WP02-E-TECHBAKING-QC-20261012-S05` | [OQLF, « citrate de sodium » (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2086099/citrate-de-sodium), food-additive domain and definition; updated 1987. | `citrate de sodium` / `sodium citrate`, defined as a sodium salt of citric acid. |
| `WP02-E-TECHBAKING-QC-20261012-S06` | [OQLF, « acide ascorbique » (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8410324/acide-ascorbique), preferred terms and English translations; updated 1988. | The acid name and the broader terminology relationship with vitamin C; not, by itself, a recipe-matching alias decision. |
| `WP02-E-TECHBAKING-QC-20261012-S07` | [Health Canada, Guide for preparing food additive submissions](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/rapports-publications/guide-preparation-demandes-autorisation-concernant-additifs-alimentaires.html), discussion of vitamins, nutrients, and technological use. | Health Canada distinguishes vitamin C as a nutrient from ascorbic acid used as an antioxidant food additive, although the two have the same molecular structure. Supports withholding a context-free `vitamin C` catalog alias. |
| `WP02-E-TECHBAKING-QC-20261012-S08` | [CFIA, Normes d'identité canadiennes : Volume 2 – Produits d'œufs transformés](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-didentite-canadiennes-volume-2), sections 3–6; amended 2024-12-18. | French names `poudre de jaune d'œuf`, `poudre de blanc d'œuf` / `poudre d'albumen`, and separately named dried mixes and egg products. Supports preserving single-fraction and formulated-product boundaries. |
| `WP02-E-TECHBAKING-QC-20261012-S09` | [CFIA, Canadian Standards of Identity: Volume 2 – Processed Egg Products](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-2), sections 3–6; amended 2024-12-18. | English forms `Dried Yolk`, `Dried Egg White`, and `Dried Albumen`, alongside distinct `Dried Yolk Mix` and `Dried Egg Product` classes. |
| `WP02-E-TECHBAKING-QC-20261012-S10` | [TERMIUM Plus, “custard powder” (recipe domain), fiche 87](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=enr&lang=fra&srchtxt=NOTABLY), dated 2007-09-20. | Gives `poudre à crème anglaise` and `poudre pour faire la crème anglaise`. Its description concerns a dry custard-making powder; the entry is terminology evidence, not a current universal formula. |
| `WP02-E-TECHBAKING-QC-20261012-S11` | [Aubut, French grocery listing](https://www.aubut.ca/produits/epicerie-1?p=16), current listing “Birds Poudre pour crème anglaise”; accessed 2026-10-12. | Québec retailer usage of `poudre pour crème anglaise` for Bird's product. |
| `WP02-E-TECHBAKING-QC-20261012-S12` | [FoodServiceDirect Canada, Bird's Poudre à crème anglaise originale](https://www.foodservicedirect.ca/fr-CA/bird-s-poudre---cr-me-anglaise-originale--340-g----12-par-bo-te-281491.html), product heading and French description; accessed 2026-10-12. | Current Canadian usage of `poudre à crème anglaise`; the description also calls this Bird's product `poudre de crème pâtissière`, supporting retention of the current display as an alias. |
| `WP02-E-TECHBAKING-QC-20261012-S13` | [Metro, Wilton “Meringue en poudre”](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/ingredients-pour-cuisson-et-preparation/decorations-et-glacages/meringue-en-poudre/p/020591840885), product name and ingredient list; accessed 2026-10-12. | Current Canadian French term `meringue en poudre` and one specific product's multi-ingredient formula, which includes egg-white powder among starch, sugar, gum, salts, flavour, and other ingredients. Product-specific formula only. |
| `WP02-E-TECHBAKING-QC-20261012-S14` | [Wilton, “How to Use Meringue Powder”](https://blog.wilton.com/how-to-use-meringue-powder/), product description and use limits; accessed 2026-10-12. | Manufacturer describes meringue powder as mostly dried egg white, with use centered on meringue/icing and not as a general egg replacement in cake batter. Supports a separate compound identity and no catalog-wide substitution rule. |

## Scope and validation notes

- The integration changed only the French display, two French aliases, timestamp, and research-ledger evidence for the existing custard-powder reference. Both bundled recipe rows remain linked; no recipe JSON changed.
- No new row, form, measure, quantity, conversion, package yield, or substitution was added.
- No requested missing product has recipe demand in the current bundle. Additive permissions, terminology tables, and branded product formulas do not establish household amounts, recipe substitutions, density, or unit mappings.
- Static catalog, package, and ledger checks passed. No tests or emulator checks were run because the change only updates ingredient database JSON data under `AGENTS.md`.
