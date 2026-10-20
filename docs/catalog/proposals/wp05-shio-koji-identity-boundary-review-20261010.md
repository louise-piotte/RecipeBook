# WP05 shio koji identity boundary review

- **Reviewed:** 2026-10-10
- **Status:** Proposal only. This file is the only change from this review; no shared catalog, recipe, ledger, plan, roadmap, code, or test file was edited.
- **Scope:** Resolve the open WP05 shio-koji identity and Québec French display question in `docs/RecipeBook-global-ingredient-catalog-plan.txt` (Japanese condiment checklist and identity acceptance list), following the earlier `wp05-east-asian-condiments.md` boundary note.
- **Recommendation:** Accept one identity-only seasoning reference for **shio koji / shio koji**. Keep it distinct from generic koji/rice koji, rice malt, salt, miso, amazake, and shoyu koji. Use the current Montréal maker's French wording `koji au sel` as a French search alias. Do not add recipe links, forms, measures, conversions, yields, or substitutions.
- **Demand:** No bundled recipe line requests shio koji, generic koji, rice koji, rice malt, amazake, or shoyu koji.

## Exact bundled recipe demand

The audit read all **114** manifest-listed recipe files and checked all **1,123** `ingredients[]` objects. It searched word-bounded English and French spellings for `shio koji`, `shio-koji`, `shio kōji`, `shiokoji`, `koji`, `rice koji` / `koji rice`, `rice malt` / `malted rice`, `malt de riz` / `riz malté`, `koji au sel` / `koji avec sel`, `amazake`, and `shoyu koji`, after the catalog's accent and punctuation normalization. **There were zero ingredient-line hits.** There is no exact line to link or relink, and no generic `koji` or rice-malt line to reinterpret.

The audit makes no demand claim from recipe titles or non-ingredient prose. Generic salt, miso, mirin, soy sauce, and rice lines are not evidence for shio koji.

## Current catalog and collision review

Snapshot taken 2026-10-10 before writing this proposal. The working tree already contains extensive concurrent catalog and application edits, so the integration owner must refresh the snapshot and collision checks before any merge.

| Artifact | Snapshot | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 781 references | `68873218d7c290b10a05d09cfaffb6b975bbb2dccde87e48b288839de42fdef4` |
| `ingredient-forms.v1.json` | 36 forms | `1a956f9d405134f013524ea5e7778325925f9f572c9c59b74f10b65e1921c8ef` |
| `manifest.v1.json` | 114 recipe files | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `research-ledger.v1.json` | 1,004 records; 2,124 source entries; 1,719 distinct source IDs | `14212b10866568bf890aa88527664d2c901c95227375731ea68856e5a4a1cc9a` |
| `legacy-import-identities.v1.json` | 82 candidates | `60d389975134f8d31c57c66caa6375b4466c4c9614d399617a64365878d6aa5f` |
| Manifest recipe corpus | 1,123 ingredient rows | `d4ba08e849c8f276446433fd1e8c70a78a0b31bd750c0283647e8e5b569604ee` |

At this snapshot, `ingredient-ref-shio-koji` was absent from the active references, forms, legacy candidates, and ledger records. No current reference name/alias or form label/match term had an exact normalized collision with `shio koji`, `koji au sel`, `koji avec sel`, `salt koji`, `rice koji`, `rice malt`, or `amazake`. The proposed source-ID prefix `WP05-SHIOKOJI-IDENTITY-20261010-S` was also absent from the ledger and current catalog proposals/batches. The requested proposal path did not already exist.

The app normalizer folds diacritics and punctuation, so source-attested `shio-koji` and `shio kōji` already normalize to the display key `shio koji`; do not store redundant aliases for those spellings. Do not add `shiokoji` because no reviewed source uses the closed spelling. Important search caveat: the current word-phrase search will match a bare query `koji` to the proposed `shio koji` name. That search result would not make generic koji an alias or equivalent. Recheck bare `koji` behavior during integration and keep the generic ingredient concept unresolved unless it receives its own evidence-backed identity.

## Proposed identity

| Proposed ID | English display | Québec French display | English aliases | French aliases | Category |
|---|---|---|---|---|---|
| `ingredient-ref-shio-koji` | `shio koji` | `shio koji` | `salt koji` | `koji au sel` | `SAUCE_AND_CONDIMENT` |

The names and aliases are limited to current source-attested wording. The Montréal maker lists the English name as “Shio Koji” and the French product as “Shio Koji (koji au sel)”; Aliments du Québec uses the French display “Shio Koji” and explains it as “koji avec sel.” Prefer the maker's title gloss `koji au sel` for the single French alias. Do not add both French glosses, or `malt de riz`, `malt de riz fermenté`, `riz koji`, `koji`, `salt`, `miso`, `mirin`, `amazake`, `shoyu koji`, `soy sauce koji`, or generic fermented-seasoning phrases as aliases. The narrower terms preserve the product boundary and avoid turning a translated description of its base into a synonym for the finished condiment.

### Identity boundary

- **Shio koji is the finished salted fermented seasoning.** MAFF describes it as a salty fermented seasoning prepared from rice koji, salt, and water. JETRO distinguishes generic koji—the cultured grain ingredient, which can use rice, barley, or soybeans—from shio koji, which is koji prepared with salt and used as a seasoning. Treat rice-koji substrate and the prepared condiment as separate identities, not as alternate names for one ingredient.
- **Keep generic koji / rice koji / rice malt outside this record.** The name `shio koji` does not make `koji`, `rice koji`, `koji rice`, or `rice malt` safe aliases. In particular, a source's explanatory phrase such as “salt koji” names the prepared salt seasoning; it does not establish an equivalence with generic malt, rice, or fermentation starter.
- **Keep other fermented products distinct.** MAFF classifies amazake as a sweet fermented beverage made with rice and koji or sake lees. The Montréal producer's current product list separately names Shio Koji, Shôyu Koji (Koji à la Sauce Soja), miso, and amazake. Do not alias shio koji to amazake, shoyu koji, miso, soy sauce, mirin, or plain salt. Shared koji, salt, fermentation, or umami does not make these products interchangeable.
- **Formulation limits:** the government overview and Québec listing support a rice-koji-based shio-koji identity, but one product page is not a universal formulation standard. This proposal does not encode a required consistency, grain substrate, recipe, or brand-specific state.

### Québec French display assessment

No dedicated shio-koji entry surfaced in the targeted OQLF terminology lookup. The direct Québec evidence is stronger for a product-facing name: Aliments du Québec lists the Montréal producer's French product title as **Shio Koji**, with a short `koji avec sel` explanation; the producer's own French product title is **Shio Koji (koji au sel)**. Those contemporary local forms support retaining the Japanese pantry name as the fr-CA display and storing only `koji au sel` as a sourced search gloss. This is a product-name recommendation, not a claim that OQLF has standardized the term. Independent Québec terminology review remains open.

## Sources

Sources were accessed on **2026-10-10**. The locator is included so reviewers can find each claim in the linked source. No numeric conversion or substitution evidence was researched or proposed in this identity-only packet.

| Source ID | Source, title, locator, and direct URL | Claim supported and scope limit |
|---|---|---|
| `WP05-SHIOKOJI-IDENTITY-20261010-S01` | Japan Ministry of Agriculture, Forestry and Fisheries (MAFF), *An Introduction to Japanese Fermented Foods*, Chapter 4, “Learn about the Science of Fermentation Foods,” shio-koji paragraph and following rice-koji definition. [PDF](https://traditional-foods.maff.go.jp/files/user/pdf/An_Introduction_to_Japanese_fermented_foods.pdf) | Defines shio-koji as a salty fermented seasoning made with rice koji, salt, and water; describes rice koji as steamed rice cultured with *Aspergillus oryzae*. Government food-culture overview; not a universal formulation or a French terminology ruling. The PDF text was available in the indexed source result, though direct page rendering was unavailable during this review. |
| `WP05-SHIOKOJI-IDENTITY-20261010-S02` | *Taste of Japan*, Japanese Cuisine Information Site (JETRO-hosted; footer copyright MAFF), *Just a Spoonful of “Koji”?*, headings “What Is Koji?”, “What Are the Benefits of ‘Shio Koji’?”, and “All About ‘Amazake’.” [Article](https://japan-food.jetro.go.jp/en/japanesecuisine/117.html) | Separates koji cultured on rice, barley, or soybeans from salt-prepared shio koji as a cooking seasoning; lists salt, rice koji, and water for home-prepared shio koji; describes amazake separately as a sweet drink made using koji. Consumer-facing Japanese-cuisine article, not a product standard or Québec term authority. |
| `WP05-SHIOKOJI-IDENTITY-20261010-S03` | MAFF, *Beverages — Traditional Foods in Japan*, amazake section, especially “Characteristics and Types” and “Production Methods.” [Article](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/inryou.html) | Identifies amazake as a sweet fermented drink and distinguishes koji amazake from sake-lees amazake. Supports the drink-versus-seasoning boundary, not shio-koji terminology or a cooking conversion. |
| `WP05-SHIOKOJI-IDENTITY-20261010-S04` | Aliments du Québec, *Shio Koji*, French product page, heading/product title, product description, producer profile, and available format. [Product listing](https://alimentsduquebec.com/aliments-dici/assaisonnements-sauces-et-condiments/shio-koji) | Current Québec listing for La brasserie San-Ô Saké inc. identifies the French product as “Shio Koji,” glosses it as “koji avec sel,” calls it a fermented condiment based on rice koji and salt, and locates the maker in Montréal. This is a Québec product-directory and one product description, not an OQLF ruling or universal formulation. |
| `WP05-SHIOKOJI-IDENTITY-20261010-S05` | La brasserie San-Ô Saké inc., *Shio Koji (koji au sel)*, French product title and description. [Product page](https://labrasseriesan-o.ca/fr/products/koji-au-sel-salt-koji) | Current Montréal producer product name directly supports the proposed French alias `koji au sel` and the borrowed canonical display `Shio Koji`. Brand-specific product evidence, not a general term standard. |
| `WP05-SHIOKOJI-IDENTITY-20261010-S06` | La brasserie San-Ô Saké inc., *Condiments Koji de San-O*, product list: Shio Koji, Shiro Miso, Shôyu Koji, and Sagohachi. [Collection](https://labrasseriesan-o.ca/fr/collections/koji-condiments-from-san-o/); Aliments du Québec, *La brasserie San-Ô Saké inc.*, “Products offered by this enterprise.” [Producer listing](https://alimentsduquebec.com/en/enterprises/la-brasserie-san-o-sake-inc) | The Montréal producer and Québec directory list these as separate named products; the directory also lists Amazake separately from Shio Koji. This supports the local product boundary, but one producer's inventory is not a complete taxonomy for all koji products. |
| `WP05-SHIOKOJI-IDENTITY-20261010-S07` | Office québécois de la langue française (OQLF), *moromi* and *moto*, GDT entries, definitions and subject classification. [moromi](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17047302/moromi); [moto](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17047301/moto) | Targeted lookup surfaced these older fermentation/brewing entries but no dedicated culinary entry for shio koji, koji au sel, or rice koji. The entries help delimit the lookup result; their 1983 biology/biotechnology definitions are not recommended displays for a pantry seasoning. |

## Remaining uncertainties and integration checks

1. Keep independent Québec terminology review open: local product naming supports `shio koji / shio koji`, but no dedicated OQLF entry was found.
2. Re-read live references, forms, ledger, legacy candidates, and recipe files at integration time; the shared tree is changing. Repeat candidate-ID, source-ID, exact-key, and picker checks against the new snapshot.
3. Decide whether the catalog's bare `koji` search should show the distinct shio-koji result while generic koji remains unresolved. Do not solve this by adding generic `koji` as an alias or by claiming the concept is covered.
4. Do not create measurement, conversion, yield, substitution, form, or recipe-link entries from this identity packet.

**Acceptance status:** proposal only. The recommended identity resolves the product boundary and current Québec display evidence; catalog integration and independent terminology review remain with the coordinator.
